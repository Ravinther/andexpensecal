package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

class pc implements OnClickListener {
    final /* synthetic */ ExpenseChartPeriod f5119a;

    pc(ExpenseChartPeriod expenseChartPeriod) {
        this.f5119a = expenseChartPeriod;
    }

    public void onClick(View view) {
        String str = "";
        str = "account in (" + abd.m3792a(this.f5119a.f3094i.getText().toString()) + ")" + " and " + "subcategory" + "!=''";
        String charSequence = this.f5119a.f3101p.getText().toString();
        if (!"".equals(charSequence)) {
            String str2 = "account in (" + abd.m3792a(this.f5119a.f3094i.getText().toString()) + ")" + " and " + "subcategory" + "!=''" + " and " + "category" + " IN ('";
            String[] split = charSequence.split(",");
            for (int i = 0; i < split.length; i++) {
                str2 = i + 1 < split.length ? str2 + split[i] + "','" : str2 + split[i] + "'";
            }
            str = str2 + ")";
        }
        List a = abd.m3798a(this.f5119a.f3088c, str, "subcategory");
        this.f5119a.m3010a((String[]) a.toArray(new String[a.size()]), this.f5119a.f3102q);
    }
}
