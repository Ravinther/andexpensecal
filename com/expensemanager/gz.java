package com.expensemanager;

import android.view.MenuItem;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.SearchView;

class gz implements OnFocusChangeListener {
    final /* synthetic */ MenuItem f4718a;
    final /* synthetic */ SearchView f4719b;
    final /* synthetic */ ExpenseAccountList f4720c;

    gz(ExpenseAccountList expenseAccountList, MenuItem menuItem, SearchView searchView) {
        this.f4720c = expenseAccountList;
        this.f4718a = menuItem;
        this.f4719b = searchView;
    }

    public void onFocusChange(View view, boolean z) {
        if (!z) {
            this.f4718a.collapseActionView();
            this.f4719b.setQuery("", false);
        }
        this.f4720c.f2756b = null;
        this.f4720c.onCreate(null);
    }
}
