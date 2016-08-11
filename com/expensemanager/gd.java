package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Calendar;

class gd implements OnClickListener {
    final /* synthetic */ fu f4689a;

    gd(fu fuVar) {
        this.f4689a = fuVar;
    }

    public void onClick(View view) {
        Calendar instance = Calendar.getInstance();
        int a = abd.m3783a(this.f4689a.m315i(), ExpenseAccountGroup.f2736u, "firstDayOfMonth", 1);
        int i = a - 1;
        if (i < 1) {
            i = instance.getActualMaximum(5);
        }
        if (instance.get(5) >= a && a != 1) {
            instance.add(2, 1);
        }
        instance.set(5, i);
        instance.set(11, 23);
        instance.set(12, 59);
        instance.set(12, 59);
        instance.set(13, 59);
        instance.set(14, 999);
        String a2 = abd.m3794a("expensed<=" + instance.getTimeInMillis(), "All", this.f4689a.f4665e, "NO");
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.f4689a.m315i(), ExpenseAccountExpandableList.class);
        bundle.putString("title", this.f4689a.m315i().getTitle().toString());
        bundle.putString("account", this.f4689a.f4665e);
        bundle.putString("whereClause", a2);
        intent.putExtras(bundle);
        this.f4689a.m281a(intent, 0);
    }
}
