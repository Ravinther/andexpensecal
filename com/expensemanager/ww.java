package com.expensemanager;

import android.app.ActionBar.OnNavigationListener;
import android.widget.TextView;
import java.util.ArrayList;

class ww implements OnNavigationListener {
    final /* synthetic */ ArrayList f5425a;
    final /* synthetic */ ExpenseNewTransaction f5426b;

    ww(ExpenseNewTransaction expenseNewTransaction, ArrayList arrayList) {
        this.f5426b = expenseNewTransaction;
        this.f5425a = arrayList;
    }

    public boolean onNavigationItemSelected(int i, long j) {
        this.f5426b.f3357x = (String) this.f5425a.get(i);
        ((TextView) this.f5426b.findViewById(2131558476)).setText(this.f5426b.f3357x);
        return true;
    }
}
