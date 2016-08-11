package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.expensemanager.o */
class C0455o implements OnClickListener {
    final /* synthetic */ String[] f5060a;
    final /* synthetic */ String f5061b;
    final /* synthetic */ ChartNewCustom f5062c;

    C0455o(ChartNewCustom chartNewCustom, String[] strArr, String str) {
        this.f5062c = chartNewCustom;
        this.f5060a = strArr;
        this.f5061b = str;
    }

    public void onClick(View view) {
        try {
            String str;
            List arrayList;
            String str2;
            String[] strArr;
            String str3;
            String str4;
            String charSequence = this.f5062c.f2446i.getText().toString();
            String str5 = "account in (" + abd.m3792a(charSequence) + ")";
            if (charSequence != null && charSequence.split(",").length > 1) {
                this.f5062c.f2442e = true;
            }
            long c = abd.m3818c(this.f5062c.f2444g.getText().toString());
            String str6 = str5 + " and " + "expensed" + ">=" + c + " and " + "expensed" + "<=" + abd.m3820d(this.f5062c.f2445h.getText().toString());
            str5 = "balance";
            if (this.f5062c.f2447j.isChecked()) {
                str6 = str6 + " and " + "category" + "!='Income'";
                str5 = "expense";
            }
            if (this.f5062c.f2448k.isChecked()) {
                str6 = str6 + " and " + "category" + "='Income'";
                str = "income";
            } else {
                str = str5;
            }
            if (this.f5062c.f2451n.isChecked()) {
                if (this.f5062c.f2447j.isChecked()) {
                    str6 = str6 + " and " + "category" + "!='Account Transfer' ";
                }
                if (this.f5062c.f2448k.isChecked()) {
                    str6 = str6 + " and " + "subcategory" + "!='Account Transfer' ";
                }
            }
            if (this.f5062c.f2452o.isChecked()) {
                str6 = str6 + " and " + "subcategory" + "!='Initial Balance' ";
            }
            int selectedItemPosition = this.f5062c.f2450m.getSelectedItemPosition();
            String str7 = this.f5060a[selectedItemPosition];
            str5 = "expensed ASC";
            if (selectedItemPosition == 0) {
                arrayList = new ArrayList();
                if (charSequence.equalsIgnoreCase(this.f5061b) && str6.indexOf("!='Account Transfer'") == -1) {
                    str6 = str6 + " and " + "category" + "!='Account Transfer' ";
                }
                if (this.f5062c.f2447j.isChecked()) {
                    str2 = str6 + " and " + "category" + "!='Income' ";
                    abd.m3808a(this.f5062c.f2440c, str2, arrayList, "category", "expensed DESC", this.f5062c.f2442e);
                    str6 = str2 + " and " + "category";
                    ChartNewCustom.m2388a(this.f5062c.f2443f, arrayList, "0", str, str7, this.f5062c.f2463z, str6);
                    str2 = str6;
                    if (selectedItemPosition == 1) {
                        arrayList = new ArrayList();
                        str5 = this.f5062c.f2455r.getText().toString();
                        if (!(str5 == null || "".endsWith(str5))) {
                            str2 = str2 + " and " + "category" + " in (" + abd.m3792a(str5.trim()) + ")";
                        }
                        str5 = this.f5062c.f2456s.getText().toString();
                        if (!(str5 == null || "".endsWith(str5))) {
                            str2 = str2 + " and " + "subcategory" + " in (" + abd.m3792a(str5.trim()) + ")";
                        }
                        abd.m3808a(this.f5062c.f2440c, str2, arrayList, "subcategory", "expensed DESC", this.f5062c.f2442e);
                        str6 = str2 + " and " + "subcategory";
                        ChartNewCustom.m2388a(this.f5062c.f2443f, arrayList, "0", str, str7, this.f5062c.f2463z, str6);
                        str2 = str6;
                    }
                    if (selectedItemPosition > 1) {
                        arrayList = new ArrayList();
                        if (charSequence.equalsIgnoreCase(this.f5061b) && str2.indexOf("!='Account Transfer'") == -1) {
                            str2 = str2 + " and " + "category" + "!='Account Transfer' ";
                        }
                        strArr = new String[]{"property", "payment_method", "status", "expense_tag"};
                        abd.m3808a(this.f5062c.f2440c, str2, arrayList, strArr[selectedItemPosition - 2], "expensed DESC", this.f5062c.f2442e);
                        str3 = str;
                        str4 = str7;
                        ChartNewCustom.m2388a(this.f5062c.f2443f, arrayList, "0", str3, str4, this.f5062c.f2463z, str2 + " and " + strArr[selectedItemPosition - 2]);
                    }
                }
                str2 = str6 + " and " + "category" + "='Income' ";
                abd.m3808a(this.f5062c.f2440c, str2, arrayList, "subcategory", "expensed DESC", this.f5062c.f2442e);
                str6 = str2 + " and " + "category";
                ChartNewCustom.m2388a(this.f5062c.f2443f, arrayList, "0", str, str7, this.f5062c.f2463z, str6);
            }
            str2 = str6;
            if (selectedItemPosition == 1) {
                arrayList = new ArrayList();
                str5 = this.f5062c.f2455r.getText().toString();
                str2 = str2 + " and " + "category" + " in (" + abd.m3792a(str5.trim()) + ")";
                str5 = this.f5062c.f2456s.getText().toString();
                str2 = str2 + " and " + "subcategory" + " in (" + abd.m3792a(str5.trim()) + ")";
                abd.m3808a(this.f5062c.f2440c, str2, arrayList, "subcategory", "expensed DESC", this.f5062c.f2442e);
                str6 = str2 + " and " + "subcategory";
                ChartNewCustom.m2388a(this.f5062c.f2443f, arrayList, "0", str, str7, this.f5062c.f2463z, str6);
                str2 = str6;
            }
            if (selectedItemPosition > 1) {
                arrayList = new ArrayList();
                str2 = str2 + " and " + "category" + "!='Account Transfer' ";
                strArr = new String[]{"property", "payment_method", "status", "expense_tag"};
                abd.m3808a(this.f5062c.f2440c, str2, arrayList, strArr[selectedItemPosition - 2], "expensed DESC", this.f5062c.f2442e);
                str3 = str;
                str4 = str7;
                ChartNewCustom.m2388a(this.f5062c.f2443f, arrayList, "0", str3, str4, this.f5062c.f2463z, str2 + " and " + strArr[selectedItemPosition - 2]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
