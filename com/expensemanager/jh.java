package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

class jh implements OnClickListener {
    final /* synthetic */ ExpenseActivitiesDefault f4838a;

    jh(ExpenseActivitiesDefault expenseActivitiesDefault) {
        this.f4838a = expenseActivitiesDefault;
    }

    public void onClick(View view) {
        List a = abd.m3798a(this.f4838a.f2839b, "account='" + this.f4838a.f2858u + "' and " + "status" + "!=''", "status");
        this.f4838a.m2739a((String[]) a.toArray(new String[a.size()]), this.f4838a.f2850m);
    }
}
