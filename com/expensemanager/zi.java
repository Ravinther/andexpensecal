package com.expensemanager;

import android.app.ActionBar.OnNavigationListener;
import java.util.ArrayList;

class zi implements OnNavigationListener {
    final /* synthetic */ ArrayList f5536a;
    final /* synthetic */ ExpenseRepeatingList f5537b;

    zi(ExpenseRepeatingList expenseRepeatingList, ArrayList arrayList) {
        this.f5537b = expenseRepeatingList;
        this.f5536a = arrayList;
    }

    public boolean onNavigationItemSelected(int i, long j) {
        this.f5537b.getIntent().putExtra("account", (String) this.f5536a.get(i));
        this.f5537b.f3398c = (String) this.f5536a.get(i);
        this.f5537b.m3374a();
        return true;
    }
}
