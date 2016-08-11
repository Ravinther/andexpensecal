package com.expensemanager.caldroid;

import android.app.ActionBar.OnNavigationListener;
import java.util.ArrayList;

/* renamed from: com.expensemanager.caldroid.a */
class C0410a implements OnNavigationListener {
    final /* synthetic */ ArrayList f4362a;
    final /* synthetic */ CaldroidActivity f4363b;

    C0410a(CaldroidActivity caldroidActivity, ArrayList arrayList) {
        this.f4363b = caldroidActivity;
        this.f4362a = arrayList;
    }

    public boolean onNavigationItemSelected(int i, long j) {
        this.f4363b.f4358q = (String) this.f4362a.get(i);
        this.f4363b.getIntent().putExtra("account", (String) this.f4362a.get(i));
        this.f4363b.m3960a(null);
        return true;
    }
}
