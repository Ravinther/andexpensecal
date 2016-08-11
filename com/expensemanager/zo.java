package com.expensemanager;

import android.app.ActionBar.OnNavigationListener;
import java.util.ArrayList;

class zo implements OnNavigationListener {
    final /* synthetic */ ArrayList f5547a;
    final /* synthetic */ ExpenseRepeatingTransaction f5548b;

    zo(ExpenseRepeatingTransaction expenseRepeatingTransaction, ArrayList arrayList) {
        this.f5548b = expenseRepeatingTransaction;
        this.f5547a = arrayList;
    }

    public boolean onNavigationItemSelected(int i, long j) {
        this.f5548b.f3432y = (String) this.f5547a.get(i);
        return true;
    }
}
