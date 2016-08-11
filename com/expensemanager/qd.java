package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

class qd implements OnClickListener {
    final /* synthetic */ ExpenseCustomActivities f5169a;

    qd(ExpenseCustomActivities expenseCustomActivities) {
        this.f5169a = expenseCustomActivities;
    }

    public void onClick(View view) {
        String str = "";
        if (this.f5169a.f3147h.isChecked()) {
            str = "account in (" + abd.m3792a(this.f5169a.f3146g.getText().toString()) + ")" + " and " + "status" + "!=''" + " and " + "category" + "!='Income'";
        }
        if (this.f5169a.f3148i.isChecked()) {
            str = "account in (" + abd.m3792a(this.f5169a.f3146g.getText().toString()) + ")" + " and " + "status" + "!=''" + " and " + "category" + "='Income'";
        }
        if (this.f5169a.f3149j.isChecked()) {
            str = "account in (" + abd.m3792a(this.f5169a.f3146g.getText().toString()) + ")" + " and " + "status" + "!=''";
        }
        List a = abd.m3798a(this.f5169a.f3141b, str, "status");
        this.f5169a.m3064a((String[]) a.toArray(new String[a.size()]), this.f5169a.f3154o);
    }
}
