package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

class jg implements OnClickListener {
    final /* synthetic */ ExpenseActivitiesDefault f4837a;

    jg(ExpenseActivitiesDefault expenseActivitiesDefault) {
        this.f4837a = expenseActivitiesDefault;
    }

    public void onClick(View view) {
        List a = abd.m3798a(this.f4837a.f2839b, "account='" + this.f4837a.f2858u + "' and " + "status" + "!=''", "status");
        this.f4837a.m2739a((String[]) a.toArray(new String[a.size()]), this.f4837a.f2849l);
    }
}
