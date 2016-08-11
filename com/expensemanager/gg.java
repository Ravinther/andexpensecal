package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Calendar;

class gg implements OnClickListener {
    final /* synthetic */ fu f4692a;

    gg(fu fuVar) {
        this.f4692a = fuVar;
    }

    public void onClick(View view) {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long timeInMillis = instance.getTimeInMillis();
        instance.set(11, 23);
        instance.set(12, 59);
        instance.set(13, 59);
        instance.set(14, 999);
        String str = "expensed>=" + timeInMillis + " AND " + "expensed" + "<=" + instance.getTimeInMillis() + " AND " + "account" + " in (" + abd.m3792a(r1.f4665e) + ")";
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.f4692a.m315i(), ExpenseAccountExpandableList.class);
        bundle.putString("title", this.f4692a.m315i().getTitle().toString());
        bundle.putString("account", this.f4692a.f4665e);
        bundle.putString("whereClause", str);
        intent.putExtras(bundle);
        this.f4692a.m281a(intent, 0);
    }
}
