package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

class zr implements OnClickListener {
    final /* synthetic */ String f5551a;
    final /* synthetic */ ExpenseRepeatingTransaction f5552b;

    zr(ExpenseRepeatingTransaction expenseRepeatingTransaction, String str) {
        this.f5552b = expenseRepeatingTransaction;
        this.f5551a = str;
    }

    public void onClick(View view) {
        try {
            Double d = new Double(this.f5552b.f3416i.getText().toString());
            try {
                int intValue = new Integer(this.f5552b.f3418k.getText().toString()).intValue();
                if (intValue > 365 || intValue == 0) {
                    aib.m3849a(this.f5552b.f3413f, null, this.f5552b.getResources().getString(2131099702), 17301543, this.f5552b.getResources().getString(2131099714), this.f5552b.getResources().getString(2131099983), null, null, null).show();
                    return;
                }
                Date date = new Date(aba.m3744a(this.f5552b.f3419l.getText().toString(), ExpenseManager.f3244t, Locale.US));
                if (this.f5552b.f3415h.getSelectedItemId() != 3 || date.getDate() == 1 || date.getDate() == 15) {
                    String trim = this.f5552b.f3417j.getText().toString().trim();
                    if (trim == null || trim.indexOf("'") == -1) {
                        String str = "description='" + trim + "' and " + "account" + "='" + this.f5552b.f3432y + "'";
                        if ("Account Transfer".equalsIgnoreCase(this.f5552b.f3420m.getText().toString())) {
                            str = "description='" + trim + "'";
                        }
                        if (!this.f5552b.f3403B.m4206d()) {
                            this.f5552b.f3403B.m4193a();
                        }
                        List arrayList = new ArrayList();
                        aba.m3760a(this.f5552b.f3413f, this.f5552b.f3403B, str, arrayList);
                        if (arrayList.size() <= 0 || "Edit".equalsIgnoreCase(this.f5551a)) {
                            if ("Account Transfer".equalsIgnoreCase(this.f5552b.f3420m.getText().toString())) {
                                str = this.f5552b.f3423p.getText().toString();
                                if (str == null || "".equals(str)) {
                                    aib.m3849a(this.f5552b.f3413f, null, this.f5552b.f3413f.getResources().getString(2131099702), 17301543, this.f5552b.f3413f.getResources().getString(2131099716), this.f5552b.f3413f.getResources().getString(2131099983), null, null, null).show();
                                    return;
                                }
                            }
                            str = this.f5552b.f3416i.getText().toString().trim();
                            if (str != null) {
                                str.replaceAll(",", "");
                            }
                            if ("".equals(aib.m3865b(trim))) {
                                aib.m3849a(this.f5552b.f3413f, null, this.f5552b.getResources().getString(2131099702), 17301543, this.f5552b.getResources().getString(2131099708), this.f5552b.getResources().getString(2131099983), null, null, null).show();
                                return;
                            }
                            if (this.f5552b.f3421n.getSelectedItemId() > 0) {
                                this.f5552b.m3389b();
                            }
                            str = this.f5552b.f3420m.getText().toString();
                            if ("Edit".equalsIgnoreCase(this.f5551a)) {
                                if ("YES".equalsIgnoreCase(this.f5552b.getIntent().getStringExtra("reminder"))) {
                                    this.f5552b.m3384a(this.f5551a);
                                    return;
                                }
                                CharSequence[] split = this.f5552b.getResources().getString(2131100052).split(",");
                                Builder builder = new Builder(this.f5552b.f3413f);
                                builder.setTitle(2131100157);
                                builder.setSingleChoiceItems(split, 0, new zs(this));
                                builder.setPositiveButton(2131099983, new zt(this, str));
                                builder.setNegativeButton(2131099754, null);
                                builder.show();
                                return;
                            } else if ("Account Transfer".equalsIgnoreCase(str)) {
                                this.f5552b.m3397d(this.f5551a);
                                return;
                            } else {
                                this.f5552b.m3384a(this.f5551a);
                                return;
                            }
                        }
                        aib.m3849a(this.f5552b.f3413f, null, this.f5552b.getResources().getString(2131099702), 17301543, this.f5552b.getResources().getString(2131100048), this.f5552b.getResources().getString(2131099983), null, null, null).show();
                        return;
                    }
                    aib.m3849a(this.f5552b.f3413f, null, this.f5552b.getResources().getString(2131099702), 17301543, this.f5552b.getResources().getString(2131099703), this.f5552b.getResources().getString(2131099983), null, null, null).show();
                    return;
                }
                aib.m3849a(this.f5552b.f3413f, null, this.f5552b.getResources().getString(2131099702), 17301543, this.f5552b.getResources().getString(2131099712), this.f5552b.getResources().getString(2131099983), null, null, null).show();
            } catch (Exception e) {
                aib.m3849a(this.f5552b.f3413f, null, this.f5552b.getResources().getString(2131099702), 17301543, this.f5552b.getResources().getString(2131099714), this.f5552b.getResources().getString(2131099983), null, null, null).show();
            }
        } catch (Exception e2) {
            aib.m3849a(this.f5552b.f3413f, null, this.f5552b.getResources().getString(2131099702), 17301543, this.f5552b.getResources().getString(2131099718), this.f5552b.getResources().getString(2131099983), null, null, null).show();
        }
    }
}
