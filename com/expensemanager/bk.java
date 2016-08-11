package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

class bk implements OnClickListener {
    final /* synthetic */ ChartNewPeriod f4252a;

    bk(ChartNewPeriod chartNewPeriod) {
        this.f4252a = chartNewPeriod;
    }

    public void onClick(View view) {
        String str = "";
        str = "account in (" + abd.m3792a(this.f4252a.f2542i.getText().toString()) + ")" + " and " + "subcategory" + "!=''";
        String charSequence = this.f4252a.f2549p.getText().toString();
        if (!"".equals(charSequence)) {
            String str2 = "account in (" + abd.m3792a(this.f4252a.f2542i.getText().toString()) + ")" + " and " + "subcategory" + "!=''" + " and " + "category" + " IN ('";
            String[] split = charSequence.split(",");
            for (int i = 0; i < split.length; i++) {
                str2 = i + 1 < split.length ? str2 + split[i] + "','" : str2 + split[i] + "'";
            }
            str = str2 + ")";
        }
        List a = abd.m3798a(this.f4252a.f2536c, str, "subcategory");
        this.f4252a.m2469a((String[]) a.toArray(new String[a.size()]), this.f4252a.f2550q);
    }
}
