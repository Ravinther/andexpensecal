package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.List;

class pd implements OnClickListener {
    final /* synthetic */ ExpenseChartPeriod f5120a;

    pd(ExpenseChartPeriod expenseChartPeriod) {
        this.f5120a = expenseChartPeriod;
    }

    public void onClick(View view) {
        try {
            List arrayList;
            String charSequence;
            String string;
            String str;
            String charSequence2 = this.f5120a.f3094i.getText().toString();
            String str2 = "account in (" + abd.m3792a(charSequence2) + ")";
            if (charSequence2 != null && charSequence2.split(",").length > 1) {
                this.f5120a.f3090e = true;
            }
            str2 = str2 + " and " + "expensed" + ">=" + abd.m3818c(this.f5120a.f3092g.getText().toString()) + " and " + "expensed" + "<=" + abd.m3820d(this.f5120a.f3093h.getText().toString());
            String str3 = "expense";
            int selectedItemPosition = this.f5120a.f3098m.getSelectedItemPosition();
            String str4 = "";
            String str5 = "expensed ASC";
            if (selectedItemPosition == 0) {
                arrayList = new ArrayList();
                charSequence = this.f5120a.f3101p.getText().toString();
                string = !"".equals(charSequence) ? charSequence : this.f5120a.getResources().getString(2131099720);
                str = (charSequence == null || "".endsWith(charSequence)) ? str2 : str2 + " and " + "category" + " in (" + abd.m3792a(charSequence.trim()) + ")";
                if (this.f5120a.f3096k.isChecked()) {
                    abd.m3809a(this.f5120a.f3088c, str, arrayList, str5, this.f5120a.f3090e);
                }
                if (this.f5120a.f3095j.isChecked()) {
                    abd.m3817b(this.f5120a.f3088c, str, arrayList, str5, this.f5120a.f3090e);
                }
                if (this.f5120a.f3097l.isChecked()) {
                    abd.m3819c(this.f5120a.f3088c, str, arrayList, str5, this.f5120a.f3090e);
                }
                if ("Income".equals(charSequence.trim())) {
                    str3 = "income";
                } else {
                    str = str + " and " + "category" + "!='Income'";
                    str3 = "expense";
                }
                ExpenseChartList.m2991a(this.f5120a.f3091f, arrayList, "0", str3, string, charSequence2);
                str2 = str;
            }
            if (selectedItemPosition == 1) {
                arrayList = new ArrayList();
                charSequence = this.f5120a.f3101p.getText().toString();
                str = (charSequence == null || "".equals(charSequence)) ? str2 : str2 + " and " + "category" + " in (" + abd.m3792a(charSequence.trim()) + ")";
                str2 = this.f5120a.f3102q.getText().toString();
                if (!(str2 == null || "".equals(str2))) {
                    str = str + " and " + "subcategory" + " in (" + abd.m3792a(str2.trim()) + ")";
                }
                string = !"".equals(charSequence) ? charSequence : this.f5120a.getResources().getString(2131099720);
                if (!"".equals(str2)) {
                    string = charSequence + ":" + str2;
                } else if ("".equals(charSequence)) {
                    string = this.f5120a.getResources().getString(2131099720);
                }
                if (this.f5120a.f3096k.isChecked()) {
                    abd.m3809a(this.f5120a.f3088c, str, arrayList, str5, this.f5120a.f3090e);
                }
                if (this.f5120a.f3095j.isChecked()) {
                    abd.m3817b(this.f5120a.f3088c, str, arrayList, str5, this.f5120a.f3090e);
                }
                if (this.f5120a.f3097l.isChecked()) {
                    abd.m3819c(this.f5120a.f3088c, str, arrayList, str5, this.f5120a.f3090e);
                }
                if ("Income".equals(charSequence.trim())) {
                    str3 = "income";
                }
                ExpenseChartList.m2991a(this.f5120a.f3091f, arrayList, "0", str3, string, charSequence2);
                str2 = str;
            }
            if (selectedItemPosition == 2) {
                arrayList = new ArrayList();
                charSequence = this.f5120a.f3101p.getText().toString();
                string = !"".equals(charSequence) ? charSequence : this.f5120a.getResources().getString(2131099720);
                if (!(charSequence == null || "".endsWith(charSequence))) {
                    str2 = str2 + " and " + "property" + " in (" + abd.m3792a(charSequence.trim()) + ")";
                }
                if (this.f5120a.f3096k.isChecked()) {
                    abd.m3809a(this.f5120a.f3088c, str2, arrayList, str5, this.f5120a.f3090e);
                }
                if (this.f5120a.f3095j.isChecked()) {
                    abd.m3817b(this.f5120a.f3088c, str2, arrayList, str5, this.f5120a.f3090e);
                }
                if (this.f5120a.f3097l.isChecked()) {
                    abd.m3819c(this.f5120a.f3088c, str2, arrayList, str5, this.f5120a.f3090e);
                }
                str = str2 + " and " + "category" + "!='Income'";
                ExpenseChartList.m2991a(this.f5120a.f3091f, arrayList, "0", "expense", string, charSequence2);
                str2 = str;
            }
            if (selectedItemPosition == 3) {
                arrayList = new ArrayList();
                charSequence = this.f5120a.f3101p.getText().toString();
                string = !"".equals(charSequence) ? charSequence : this.f5120a.getResources().getString(2131099720);
                if (!(charSequence == null || "".endsWith(charSequence))) {
                    str2 = str2 + " and " + "payment_method" + " in (" + abd.m3792a(charSequence.trim()) + ")";
                }
                if (this.f5120a.f3096k.isChecked()) {
                    abd.m3809a(this.f5120a.f3088c, str2, arrayList, str5, this.f5120a.f3090e);
                }
                if (this.f5120a.f3095j.isChecked()) {
                    abd.m3817b(this.f5120a.f3088c, str2, arrayList, str5, this.f5120a.f3090e);
                }
                if (this.f5120a.f3097l.isChecked()) {
                    abd.m3819c(this.f5120a.f3088c, str2, arrayList, str5, this.f5120a.f3090e);
                }
                str2 + " and " + "category" + "!='Income'";
                ExpenseChartList.m2991a(this.f5120a.f3091f, arrayList, "0", "expense", string, charSequence2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
