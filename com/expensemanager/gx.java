package com.expensemanager;

import android.widget.SearchView;
import android.widget.SearchView.OnSuggestionListener;
import java.util.ArrayList;

class gx implements OnSuggestionListener {
    final /* synthetic */ ArrayList f4712a;
    final /* synthetic */ SearchView f4713b;
    final /* synthetic */ ExpenseAccountList f4714c;

    gx(ExpenseAccountList expenseAccountList, ArrayList arrayList, SearchView searchView) {
        this.f4714c = expenseAccountList;
        this.f4712a = arrayList;
        this.f4713b = searchView;
    }

    public boolean onSuggestionClick(int i) {
        this.f4714c.f2756b = (String) this.f4712a.get(i);
        this.f4714c.onCreate(null);
        this.f4713b.setQuery("", false);
        this.f4713b.setQueryHint(this.f4714c.f2756b);
        return false;
    }

    public boolean onSuggestionSelect(int i) {
        return false;
    }
}
