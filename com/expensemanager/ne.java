package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.List;

class ne implements OnClickListener {
    final /* synthetic */ String[] f5018a;
    final /* synthetic */ String f5019b;
    final /* synthetic */ ExpenseChartCustom f5020c;

    ne(ExpenseChartCustom expenseChartCustom, String[] strArr, String str) {
        this.f5020c = expenseChartCustom;
        this.f5018a = strArr;
        this.f5019b = str;
    }

    public void onClick(View view) {
        try {
            List arrayList;
            String charSequence = this.f5020c.f3024i.getText().toString();
            String str = "account in (" + abd.m3792a(charSequence) + ")";
            if (charSequence != null && charSequence.split(",").length > 1) {
                this.f5020c.f3020e = true;
            }
            String str2 = str + " and " + "expensed" + ">=" + abd.m3818c(this.f5020c.f3022g.getText().toString()) + " and " + "expensed" + "<=" + abd.m3820d(this.f5020c.f3023h.getText().toString());
            String str3 = "balance";
            if (this.f5020c.f3025j.isChecked()) {
                str2 = str2 + " and " + "category" + "!='Income'";
                str3 = "expense";
            }
            if (this.f5020c.f3026k.isChecked()) {
                str2 = str2 + " and " + "category" + "='Income'";
                str3 = "income";
            }
            if (this.f5020c.f3029n.isChecked()) {
                if (this.f5020c.f3025j.isChecked()) {
                    str2 = str2 + " and " + "category" + "!='Account Transfer' ";
                }
                if (this.f5020c.f3026k.isChecked()) {
                    str2 = str2 + " and " + "subcategory" + "!='Account Transfer' ";
                }
            }
            if (this.f5020c.f3030o.isChecked()) {
                str2 = str2 + " and " + "subcategory" + "!='Initial Balance' ";
            }
            int selectedItemPosition = this.f5020c.f3028m.getSelectedItemPosition();
            String str4 = this.f5018a[selectedItemPosition];
            str = "expensed ASC";
            if (selectedItemPosition == 0) {
                List arrayList2 = new ArrayList();
                if (charSequence.equalsIgnoreCase(this.f5019b) && str2.indexOf("!='Account Transfer'") == -1) {
                    str2 = str2 + " and (" + "category" + "!='Account Transfer' " + " or " + "subcategory" + "!='Account Transfer' )";
                }
                abd.m3809a(this.f5020c.f3018c, str2, arrayList2, str, this.f5020c.f3020e);
                ExpenseChartList.m2991a(this.f5020c.f3021f, arrayList2, "0", str3, str4, charSequence);
            }
            if (selectedItemPosition == 1) {
                arrayList = new ArrayList();
                str = (charSequence.equalsIgnoreCase(this.f5019b) && str2.indexOf("!='Account Transfer'") == -1) ? str2 + " and " + "category" + "!='Account Transfer' " : str2;
                if (this.f5020c.f3025j.isChecked()) {
                    ExpenseChartList.m2991a(this.f5020c.f3021f, arrayList, aba.m3755a(this.f5020c.f3018c, str, arrayList, this.f5020c.f3020e), "CATEGORY_VIEW", str4, this.f5020c.f3041z);
                    str2 = str;
                } else {
                    abd.m3808a(this.f5020c.f3018c, str, arrayList, "subcategory", "expensed DESC", this.f5020c.f3020e);
                    ExpenseChartCustom.m2935a(this.f5020c.f3021f, arrayList, "0", str3, str4, this.f5020c.f3041z);
                    str2 = str;
                }
            }
            if (selectedItemPosition == 2) {
                List arrayList3 = new ArrayList();
                str = this.f5020c.f3033r.getText().toString();
                String str5 = (str == null || "".endsWith(str)) ? str2 : str2 + " and " + "category" + " in (" + abd.m3792a(str.trim()) + ")";
                str = this.f5020c.f3034s.getText().toString();
                if (!(str == null || "".endsWith(str))) {
                    str5 = str5 + " and " + "subcategory" + " in (" + abd.m3792a(str.trim()) + ")";
                }
                abd.m3808a(this.f5020c.f3018c, str5, arrayList3, "subcategory", "expensed DESC", this.f5020c.f3020e);
                ExpenseChartCustom.m2935a(this.f5020c.f3021f, arrayList3, "0", str3, str4, this.f5020c.f3041z);
                str2 = str5;
            }
            if (selectedItemPosition > 2) {
                arrayList = new ArrayList();
                if (charSequence.equalsIgnoreCase(this.f5019b) && str2.indexOf("!='Account Transfer'") == -1) {
                    str2 = str2 + " and " + "category" + "!='Account Transfer' ";
                }
                abd.m3808a(this.f5020c.f3018c, str2, arrayList, new String[]{"property", "payment_method", "status"}[selectedItemPosition - 3], "expensed DESC", this.f5020c.f3020e);
                ExpenseChartCustom.m2935a(this.f5020c.f3021f, arrayList, "0", str3, str4, this.f5020c.f3041z);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
