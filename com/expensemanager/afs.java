package com.expensemanager;

import android.app.ActionBar.OnNavigationListener;
import android.widget.TextView;
import java.util.ArrayList;

class afs implements OnNavigationListener {
    final /* synthetic */ ArrayList f4062a;
    final /* synthetic */ ShoppingListAddEdit f4063b;

    afs(ShoppingListAddEdit shoppingListAddEdit, ArrayList arrayList) {
        this.f4063b = shoppingListAddEdit;
        this.f4062a = arrayList;
    }

    public boolean onNavigationItemSelected(int i, long j) {
        this.f4063b.f3630z = (String) this.f4062a.get(i);
        ((TextView) this.f4063b.findViewById(2131558476)).setText(this.f4063b.f3630z);
        return true;
    }
}
