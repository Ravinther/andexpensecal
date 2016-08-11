package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

class ih implements OnClickListener {
    final /* synthetic */ ExpenseAccountSummaryTime f4794a;

    ih(ExpenseAccountSummaryTime expenseAccountSummaryTime) {
        this.f4794a = expenseAccountSummaryTime;
    }

    public void onClick(View view) {
        String str = "";
        str = "account in (" + abd.m3792a(this.f4794a.f2804l.getText().toString()) + ")" + " and " + "subcategory" + "!=''";
        String charSequence = this.f4794a.f2809q.getText().toString();
        if (!"".equals(charSequence)) {
            String str2 = "account in (" + abd.m3792a(this.f4794a.f2804l.getText().toString()) + ")" + " and " + "subcategory" + "!=''" + " and " + "category" + " IN ('";
            String[] split = charSequence.split(",");
            for (int i = 0; i < split.length; i++) {
                str2 = i + 1 < split.length ? str2 + split[i] + "','" : str2 + split[i] + "'";
            }
            str = str2 + ")";
        }
        List a = abd.m3798a(this.f4794a.f2795c, str, "subcategory");
        this.f4794a.m2699a((String[]) a.toArray(new String[a.size()]), this.f4794a.f2810r);
    }
}
