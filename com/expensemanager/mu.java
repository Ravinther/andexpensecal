package com.expensemanager;

import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import java.util.ArrayList;

class mu implements OnQueryTextListener {
    final /* synthetic */ ArrayList f4992a;
    final /* synthetic */ SearchView f4993b;
    final /* synthetic */ MenuItem f4994c;
    final /* synthetic */ ExpenseCategoryExpandableList f4995d;

    mu(ExpenseCategoryExpandableList expenseCategoryExpandableList, ArrayList arrayList, SearchView searchView, MenuItem menuItem) {
        this.f4995d = expenseCategoryExpandableList;
        this.f4992a = arrayList;
        this.f4993b = searchView;
        this.f4994c = menuItem;
    }

    public boolean onQueryTextChange(String str) {
        if (str.length() >= 2) {
            this.f4992a.clear();
            this.f4995d.f2991c.clear();
            this.f4995d.f2992d.clear();
            this.f4995d.m2911a(this.f4995d.f2997i, this.f4995d.f2991c, this.f4995d.f2992d, this.f4992a, str);
            this.f4993b.setSuggestionsAdapter(ExpenseCategoryExpandableList.m2907a(this.f4995d.f2995g, (String[]) this.f4992a.toArray(new String[this.f4992a.size()])));
        }
        return true;
    }

    public boolean onQueryTextSubmit(String str) {
        String charSequence = this.f4993b.getQuery().toString();
        if (!(charSequence == null || "".equals(charSequence) || charSequence.length() < 2)) {
            this.f4995d.f2996h.notifyDataSetChanged();
            int groupCount = this.f4995d.f2996h.getGroupCount();
            for (int i = 1; i <= groupCount; i++) {
                this.f4995d.getExpandableListView().expandGroup(i - 1);
            }
            this.f4994c.collapseActionView();
            this.f4993b.setQuery("", false);
        }
        return true;
    }
}
