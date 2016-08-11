package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.SearchView.OnSuggestionListener;
import java.util.ArrayList;

class mt implements OnSuggestionListener {
    final /* synthetic */ ArrayList f4988a;
    final /* synthetic */ SearchView f4989b;
    final /* synthetic */ MenuItem f4990c;
    final /* synthetic */ ExpenseCategoryExpandableList f4991d;

    mt(ExpenseCategoryExpandableList expenseCategoryExpandableList, ArrayList arrayList, SearchView searchView, MenuItem menuItem) {
        this.f4991d = expenseCategoryExpandableList;
        this.f4988a = arrayList;
        this.f4989b = searchView;
        this.f4990c = menuItem;
    }

    public boolean onSuggestionClick(int i) {
        String str = (String) this.f4988a.get(i);
        Bundle bundle = new Bundle();
        Intent intent = new Intent();
        bundle.putString("category", str);
        intent.putExtras(bundle);
        this.f4991d.setResult(-1, intent);
        this.f4991d.finish();
        this.f4989b.setQuery("", false);
        this.f4989b.setQueryHint(str);
        this.f4990c.collapseActionView();
        return false;
    }

    public boolean onSuggestionSelect(int i) {
        return false;
    }
}
