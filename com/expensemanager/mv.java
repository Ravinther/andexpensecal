package com.expensemanager;

import android.view.MenuItem;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.SearchView;

class mv implements OnFocusChangeListener {
    final /* synthetic */ MenuItem f4996a;
    final /* synthetic */ SearchView f4997b;
    final /* synthetic */ ExpenseCategoryExpandableList f4998c;

    mv(ExpenseCategoryExpandableList expenseCategoryExpandableList, MenuItem menuItem, SearchView searchView) {
        this.f4998c = expenseCategoryExpandableList;
        this.f4996a = menuItem;
        this.f4997b = searchView;
    }

    public void onFocusChange(View view, boolean z) {
        if (!z) {
            this.f4996a.collapseActionView();
            this.f4997b.setQuery("", false);
        }
    }
}
