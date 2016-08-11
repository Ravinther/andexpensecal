package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

class pb implements OnClickListener {
    final /* synthetic */ ExpenseChartPeriod f5118a;

    pb(ExpenseChartPeriod expenseChartPeriod) {
        this.f5118a = expenseChartPeriod;
    }

    public void onClick(View view) {
        if (this.f5118a.f3098m.getSelectedItemPosition() == 0 || this.f5118a.f3098m.getSelectedItemPosition() == 1) {
            String str = "";
            List a = abd.m3798a(this.f5118a.f3088c, "account in (" + abd.m3792a(this.f5118a.f3094i.getText().toString()) + ")", "category");
            this.f5118a.m3010a((String[]) a.toArray(new String[a.size()]), this.f5118a.f3101p);
        }
        if (this.f5118a.f3098m.getSelectedItemPosition() == 2) {
            str = "";
            a = abd.m3798a(this.f5118a.f3088c, "account in (" + abd.m3792a(this.f5118a.f3094i.getText().toString()) + ")" + " and " + "property" + "!=''" + " and " + "category" + "!='Income'", "property");
            this.f5118a.m3010a((String[]) a.toArray(new String[a.size()]), this.f5118a.f3101p);
        }
        if (this.f5118a.f3098m.getSelectedItemPosition() == 3) {
            str = "";
            a = abd.m3798a(this.f5118a.f3088c, "account in (" + abd.m3792a(this.f5118a.f3094i.getText().toString()) + ")" + " and " + "payment_method" + "!=''" + " and " + "category" + "!='Income'", "payment_method");
            this.f5118a.m3010a((String[]) a.toArray(new String[a.size()]), this.f5118a.f3101p);
        }
    }
}
