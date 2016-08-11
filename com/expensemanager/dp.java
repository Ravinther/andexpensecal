package com.expensemanager;

import android.app.ActionBar.OnNavigationListener;
import android.widget.TextView;
import java.util.ArrayList;

class dp implements OnNavigationListener {
    final /* synthetic */ ArrayList f4488a;
    final /* synthetic */ DebtAddEdit f4489b;

    dp(DebtAddEdit debtAddEdit, ArrayList arrayList) {
        this.f4489b = debtAddEdit;
        this.f4488a = arrayList;
    }

    public boolean onNavigationItemSelected(int i, long j) {
        this.f4489b.f2671r = (String) this.f4488a.get(i);
        ((TextView) this.f4489b.findViewById(2131558476)).setText(this.f4489b.f2671r);
        return true;
    }
}
