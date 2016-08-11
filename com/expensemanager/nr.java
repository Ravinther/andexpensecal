package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

class nr implements OnClickListener {
    final /* synthetic */ ExpenseChartCustom f5044a;

    nr(ExpenseChartCustom expenseChartCustom) {
        this.f5044a = expenseChartCustom;
    }

    public void onClick(View view) {
        String str = "";
        if (this.f5044a.f3025j.isChecked()) {
            str = "account in (" + abd.m3792a(this.f5044a.f3024i.getText().toString()) + ")" + " and " + "subcategory" + "!=''" + " and " + "category" + "!='Income'";
            String charSequence = this.f5044a.f3033r.getText().toString();
            if (!"".equals(charSequence)) {
                String str2 = "account in (" + abd.m3792a(this.f5044a.f3024i.getText().toString()) + ")" + " and " + "subcategory" + "!=''" + " and " + "category" + " IN ('";
                String[] split = charSequence.split(",");
                for (int i = 0; i < split.length; i++) {
                    str2 = i + 1 < split.length ? str2 + split[i] + "','" : str2 + split[i] + "'";
                }
                str = str2 + ")";
            }
        }
        if (this.f5044a.f3026k.isChecked()) {
            str = "account in (" + abd.m3792a(this.f5044a.f3024i.getText().toString()) + ")" + " and " + "subcategory" + "!=''" + " and " + "category" + "='Income'";
        }
        List a = abd.m3798a(this.f5044a.f3018c, str, "subcategory");
        this.f5044a.m2937a((String[]) a.toArray(new String[a.size()]), this.f5044a.f3034s);
    }
}
