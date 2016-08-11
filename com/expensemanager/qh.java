package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class qh implements OnClickListener {
    final /* synthetic */ ExpenseCustomActivities f5173a;

    qh(ExpenseCustomActivities expenseCustomActivities) {
        this.f5173a = expenseCustomActivities;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5173a.f3143d, ExpenseReport.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5173a.f3138A);
        bundle.putString("whereClause", this.f5173a.m3059a());
        intent.putExtras(bundle);
        this.f5173a.f3143d.startActivity(intent);
    }
}
