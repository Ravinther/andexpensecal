package com.expensemanager;

import android.app.ActionBar.OnNavigationListener;
import java.util.ArrayList;

class oj implements OnNavigationListener {
    final /* synthetic */ ArrayList f5084a;
    final /* synthetic */ ExpenseChartList f5085b;

    oj(ExpenseChartList expenseChartList, ArrayList arrayList) {
        this.f5085b = expenseChartList;
        this.f5084a = arrayList;
    }

    public boolean onNavigationItemSelected(int i, long j) {
        this.f5085b.getIntent().putExtra("account", (String) this.f5084a.get(i));
        this.f5085b.f3069b = (String) this.f5084a.get(i);
        return true;
    }
}
