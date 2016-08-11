package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.Arrays;

class ws implements OnClickListener {
    final /* synthetic */ boolean f5417a;
    final /* synthetic */ String f5418b;
    final /* synthetic */ ExpenseNewAccount f5419c;

    ws(ExpenseNewAccount expenseNewAccount, boolean z, String str) {
        this.f5419c = expenseNewAccount;
        this.f5417a = z;
        this.f5418b = str;
    }

    public void onClick(View view) {
        String str;
        int indexOf;
        Exception e;
        ArrayList j;
        String trim = this.f5419c.f3308c.getText().toString().trim();
        String trim2 = this.f5419c.f3310e.getText().toString().trim();
        String trim3 = this.f5419c.f3309d.getText().toString().trim();
        if (trim != null && trim.indexOf("'") != -1) {
            aib.m3849a(this.f5419c.f3307b, null, this.f5419c.getResources().getString(2131099702), 17301543, this.f5419c.getResources().getString(2131099703), this.f5419c.getResources().getString(2131099983), null, null, null).show();
        } else if (this.f5419c.f3315j.isChecked() && "".equals(this.f5419c.f3318m.getText().toString())) {
            aib.m3849a(this.f5419c.f3307b, null, this.f5419c.getResources().getString(2131099702), 17301543, this.f5419c.getResources().getString(2131099762), this.f5419c.getResources().getString(2131099983), null, null, null).show();
        } else {
            if (!(trim3 == null || "".equals(trim3))) {
                try {
                    Double.parseDouble(trim3);
                } catch (Exception e2) {
                    aib.m3849a(this.f5419c.f3307b, null, this.f5419c.getResources().getString(2131099702), 17301543, this.f5419c.getResources().getString(2131099718), this.f5419c.getResources().getString(2131099983), null, null, null).show();
                    return;
                }
            }
            String a = abd.m3786a(this.f5419c.f3307b, this.f5419c.f3324s, "HIDDEN_ACCOUNT_NAMES", null);
            ArrayList j2 = aib.m3878j(a);
            if (j2 == null || !j2.contains(trim) || this.f5419c.getIntent().getBooleanExtra("isHidden", false)) {
                String str2;
                String a2 = abd.m3786a(this.f5419c.f3307b, this.f5419c.f3324s, "MY_ACCOUNT_NAMES", "Personal Expense");
                ArrayList arrayList = new ArrayList(Arrays.asList(a2.split(",")));
                if (this.f5417a) {
                    if (arrayList == null || !arrayList.contains(trim)) {
                        str = a2 + "," + trim;
                    } else {
                        aib.m3849a(this.f5419c.f3307b, null, this.f5419c.getResources().getString(2131099702), 17301543, this.f5419c.getResources().getString(2131099709), "OK", null, null, null).show();
                        return;
                    }
                } else if (this.f5419c.getIntent().getBooleanExtra("isHidden", false)) {
                    if (!this.f5419c.f3314i.isChecked()) {
                        if (!(arrayList == null || arrayList.contains(this.f5418b))) {
                            arrayList.add(this.f5418b);
                        }
                        abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", "MY_ACCOUNT_NAMES", aib.m3857a(arrayList, ","));
                        j2.remove(this.f5418b);
                        abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", "HIDDEN_ACCOUNT_NAMES", aib.m3857a(j2, ","));
                    }
                    this.f5419c.setResult(-1, new Intent());
                    this.f5419c.finish();
                    return;
                } else if (this.f5419c.f3314i.isChecked()) {
                    if (a == null || "".equals(a)) {
                        a = this.f5418b;
                    } else if (!j2.contains(this.f5418b)) {
                        a = a + "," + this.f5418b;
                    }
                    abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", "HIDDEN_ACCOUNT_NAMES", a);
                    if (arrayList != null && arrayList.contains(this.f5418b)) {
                        arrayList.remove(this.f5418b);
                    }
                    abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", "MY_ACCOUNT_NAMES", aib.m3857a(arrayList, ","));
                    this.f5419c.setResult(-1, new Intent());
                    this.f5419c.finish();
                    return;
                } else if (arrayList == null || !arrayList.contains(trim) || this.f5418b.equals(trim)) {
                    if (arrayList == null || arrayList.contains(trim)) {
                        a = a2;
                    } else {
                        if (!this.f5419c.f3324s.m4206d()) {
                            this.f5419c.f3324s.m4193a();
                        }
                        try {
                            str2 = "account='" + this.f5418b + "'";
                            boolean a3 = this.f5419c.f3324s.m4198a("expense_report", str2, "account", trim);
                            this.f5419c.f3324s.m4198a("expense_repeating", str2, "account", trim);
                            this.f5419c.f3324s.m4198a("expense_budget", str2, "account", trim);
                            indexOf = arrayList.indexOf(this.f5418b);
                            if (indexOf != -1) {
                                arrayList.set(indexOf, trim);
                            }
                            this.f5419c.f3324s.m4197a("expense_preference", "name", this.f5418b);
                            this.f5419c.f3324s.m4197a("expense_preference", "name", this.f5418b + "_CURRENCY");
                            this.f5419c.f3324s.m4197a("expense_preference", "name", this.f5418b + "_DESCRIPTION");
                            this.f5419c.f3324s.m4197a("expense_preference", "name", this.f5418b + "_rowId");
                            a = aib.m3857a(arrayList, ",");
                            if (a3) {
                                try {
                                    abd.m3804a(this.f5419c.f3307b, this.f5418b, trim);
                                } catch (Exception e3) {
                                    e = e3;
                                    e.printStackTrace();
                                    str2 = co.f4436j[this.f5419c.f3311f.getSelectedItemPosition()].split(":")[1] + "/" + (this.f5419c.f3313h.getSelectedItemPosition() == 0 ? "mi" : "km");
                                    try {
                                        str2 = "update expense_report set payment_method = replace(payment_method, '" + this.f5419c.f3325t + "', '" + str2 + "')" + " where " + (("account='" + this.f5419c.f3308c.getText().toString() + "'") + " and " + "payment_method" + " like '%" + this.f5419c.f3325t + "%'");
                                        if (!this.f5419c.f3324s.m4206d()) {
                                            this.f5419c.f3324s.m4193a();
                                        }
                                        this.f5419c.f3324s.m4194a(str2);
                                    } catch (Exception e4) {
                                        e4.printStackTrace();
                                    }
                                    if (this.f5419c.f3324s.m4206d()) {
                                        this.f5419c.f3324s.m4201b();
                                    }
                                    str = a;
                                    this.f5419c.f3306a = this.f5419c.m3273a(this.f5419c.f3307b, this.f5417a, trim, this.f5419c.f3306a, trim3);
                                    if (this.f5419c.f3306a != -1) {
                                        abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", trim + "_rowId", "" + this.f5419c.f3306a);
                                    }
                                    indexOf = this.f5419c.f3311f.getSelectedItemPosition();
                                    abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", "MY_ACCOUNT_NAMES", str);
                                    abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", trim + "_DESCRIPTION", trim2);
                                    abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", trim + "_CURRENCY", "" + indexOf);
                                    if (!this.f5419c.f3312g.isChecked()) {
                                        abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", trim + "_" + "AUTO_ACCOUNT", this.f5419c.f3313h.getSelectedItemPosition() == 0 ? "mi" : "km");
                                    } else if (this.f5419c.f3321p != null) {
                                        abd.m3810a(this.f5419c.f3307b, this.f5419c.f3324s, trim + "_" + "AUTO_ACCOUNT");
                                    }
                                    j = aib.m3878j(this.f5419c.f3322q);
                                    j.remove(this.f5418b);
                                    str2 = aib.m3857a(j, ",");
                                    if (str2 != null) {
                                    }
                                    abd.m3810a(this.f5419c.f3307b, this.f5419c.f3324s, "CREDIT_CARD_ACCOUNT");
                                    abd.m3810a(this.f5419c.f3307b, this.f5419c.f3324s, this.f5418b + "_" + "CREDIT_CARD_ACCOUNT");
                                    if (this.f5419c.f3315j.isChecked()) {
                                        str2 = this.f5419c.f3308c.getText().toString();
                                        if (!j.contains(str2)) {
                                            j.add(str2);
                                        }
                                        abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", "CREDIT_CARD_ACCOUNT", aib.m3857a(j, ","));
                                        abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", trim + "_" + "CREDIT_CARD_ACCOUNT", this.f5419c.f3318m.getText().toString() + "," + (this.f5419c.f3316k.getSelectedItemPosition() + 1) + "," + (this.f5419c.f3317l.getSelectedItemPosition() + 1) + "," + this.f5419c.f3319n.getSelectedItemPosition());
                                    }
                                    this.f5419c.setResult(-1, new Intent());
                                    this.f5419c.finish();
                                    return;
                                }
                            }
                            this.f5419c.f3324s.m4198a("expense_repeating", str2, "account", trim);
                            this.f5419c.f3324s.m4198a("expense_budget", str2, "account", trim);
                            this.f5419c.f3324s.m4198a("expense_repeating", "property='" + this.f5418b + "' and " + "category" + "='Account Transfer'", "property", trim);
                        } catch (Exception e5) {
                            e4 = e5;
                            a = a2;
                            e4.printStackTrace();
                            if (this.f5419c.f3313h.getSelectedItemPosition() == 0) {
                            }
                            str2 = co.f4436j[this.f5419c.f3311f.getSelectedItemPosition()].split(":")[1] + "/" + (this.f5419c.f3313h.getSelectedItemPosition() == 0 ? "mi" : "km");
                            str2 = "update expense_report set payment_method = replace(payment_method, '" + this.f5419c.f3325t + "', '" + str2 + "')" + " where " + (("account='" + this.f5419c.f3308c.getText().toString() + "'") + " and " + "payment_method" + " like '%" + this.f5419c.f3325t + "%'");
                            if (this.f5419c.f3324s.m4206d()) {
                                this.f5419c.f3324s.m4193a();
                            }
                            this.f5419c.f3324s.m4194a(str2);
                            if (this.f5419c.f3324s.m4206d()) {
                                this.f5419c.f3324s.m4201b();
                            }
                            str = a;
                            this.f5419c.f3306a = this.f5419c.m3273a(this.f5419c.f3307b, this.f5417a, trim, this.f5419c.f3306a, trim3);
                            if (this.f5419c.f3306a != -1) {
                                abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", trim + "_rowId", "" + this.f5419c.f3306a);
                            }
                            indexOf = this.f5419c.f3311f.getSelectedItemPosition();
                            abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", "MY_ACCOUNT_NAMES", str);
                            abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", trim + "_DESCRIPTION", trim2);
                            abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", trim + "_CURRENCY", "" + indexOf);
                            if (!this.f5419c.f3312g.isChecked()) {
                                if (this.f5419c.f3313h.getSelectedItemPosition() == 0) {
                                }
                                abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", trim + "_" + "AUTO_ACCOUNT", this.f5419c.f3313h.getSelectedItemPosition() == 0 ? "mi" : "km");
                            } else if (this.f5419c.f3321p != null) {
                                abd.m3810a(this.f5419c.f3307b, this.f5419c.f3324s, trim + "_" + "AUTO_ACCOUNT");
                            }
                            j = aib.m3878j(this.f5419c.f3322q);
                            j.remove(this.f5418b);
                            str2 = aib.m3857a(j, ",");
                            if (str2 != null) {
                            }
                            abd.m3810a(this.f5419c.f3307b, this.f5419c.f3324s, "CREDIT_CARD_ACCOUNT");
                            abd.m3810a(this.f5419c.f3307b, this.f5419c.f3324s, this.f5418b + "_" + "CREDIT_CARD_ACCOUNT");
                            if (this.f5419c.f3315j.isChecked()) {
                                str2 = this.f5419c.f3308c.getText().toString();
                                if (j.contains(str2)) {
                                    j.add(str2);
                                }
                                abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", "CREDIT_CARD_ACCOUNT", aib.m3857a(j, ","));
                                abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", trim + "_" + "CREDIT_CARD_ACCOUNT", this.f5419c.f3318m.getText().toString() + "," + (this.f5419c.f3316k.getSelectedItemPosition() + 1) + "," + (this.f5419c.f3317l.getSelectedItemPosition() + 1) + "," + this.f5419c.f3319n.getSelectedItemPosition());
                            }
                            this.f5419c.setResult(-1, new Intent());
                            this.f5419c.finish();
                            return;
                        }
                    }
                    if (this.f5419c.f3313h.getSelectedItemPosition() == 0) {
                    }
                    str2 = co.f4436j[this.f5419c.f3311f.getSelectedItemPosition()].split(":")[1] + "/" + (this.f5419c.f3313h.getSelectedItemPosition() == 0 ? "mi" : "km");
                    if (this.f5419c.f3312g.isChecked() && !str2.equalsIgnoreCase(this.f5419c.f3325t)) {
                        str2 = "update expense_report set payment_method = replace(payment_method, '" + this.f5419c.f3325t + "', '" + str2 + "')" + " where " + (("account='" + this.f5419c.f3308c.getText().toString() + "'") + " and " + "payment_method" + " like '%" + this.f5419c.f3325t + "%'");
                        if (this.f5419c.f3324s.m4206d()) {
                            this.f5419c.f3324s.m4193a();
                        }
                        this.f5419c.f3324s.m4194a(str2);
                    }
                    if (this.f5419c.f3324s.m4206d()) {
                        this.f5419c.f3324s.m4201b();
                    }
                    str = a;
                } else {
                    aib.m3849a(this.f5419c.f3307b, null, this.f5419c.getResources().getString(2131099702), 17301543, this.f5419c.getResources().getString(2131099709), "OK", null, null, null).show();
                    return;
                }
                if (!("".equals(trim3) && this.f5417a)) {
                    this.f5419c.f3306a = this.f5419c.m3273a(this.f5419c.f3307b, this.f5417a, trim, this.f5419c.f3306a, trim3);
                }
                if (this.f5419c.f3306a != -1) {
                    abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", trim + "_rowId", "" + this.f5419c.f3306a);
                }
                indexOf = this.f5419c.f3311f.getSelectedItemPosition();
                abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", "MY_ACCOUNT_NAMES", str);
                abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", trim + "_DESCRIPTION", trim2);
                abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", trim + "_CURRENCY", "" + indexOf);
                if (!this.f5419c.f3312g.isChecked()) {
                    if (this.f5419c.f3313h.getSelectedItemPosition() == 0) {
                    }
                    abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", trim + "_" + "AUTO_ACCOUNT", this.f5419c.f3313h.getSelectedItemPosition() == 0 ? "mi" : "km");
                } else if (this.f5419c.f3321p != null) {
                    abd.m3810a(this.f5419c.f3307b, this.f5419c.f3324s, trim + "_" + "AUTO_ACCOUNT");
                }
                j = aib.m3878j(this.f5419c.f3322q);
                if (!this.f5417a && j.contains(this.f5418b)) {
                    j.remove(this.f5418b);
                    str2 = aib.m3857a(j, ",");
                    if (str2 != null || "".equals(str2)) {
                        abd.m3810a(this.f5419c.f3307b, this.f5419c.f3324s, "CREDIT_CARD_ACCOUNT");
                    } else {
                        abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", "CREDIT_CARD_ACCOUNT", str2);
                    }
                    abd.m3810a(this.f5419c.f3307b, this.f5419c.f3324s, this.f5418b + "_" + "CREDIT_CARD_ACCOUNT");
                }
                if (this.f5419c.f3315j.isChecked()) {
                    str2 = this.f5419c.f3308c.getText().toString();
                    if (j.contains(str2)) {
                        j.add(str2);
                    }
                    abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", "CREDIT_CARD_ACCOUNT", aib.m3857a(j, ","));
                    abd.m3811a(this.f5419c.f3307b, this.f5419c.f3324s, "expense_preference", trim + "_" + "CREDIT_CARD_ACCOUNT", this.f5419c.f3318m.getText().toString() + "," + (this.f5419c.f3316k.getSelectedItemPosition() + 1) + "," + (this.f5419c.f3317l.getSelectedItemPosition() + 1) + "," + this.f5419c.f3319n.getSelectedItemPosition());
                }
                this.f5419c.setResult(-1, new Intent());
                this.f5419c.finish();
                return;
            }
            aib.m3849a(this.f5419c.f3307b, null, this.f5419c.getResources().getString(2131099702), 17301543, this.f5419c.getResources().getString(2131099857), "OK", null, null, null).show();
        }
    }
}
