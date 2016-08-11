package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class aft implements OnItemClickListener {
    final /* synthetic */ String f4064a;
    final /* synthetic */ ShoppingListAddEdit f4065b;

    aft(ShoppingListAddEdit shoppingListAddEdit, String str) {
        this.f4065b = shoppingListAddEdit;
        this.f4064a = str;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (!"Edit".equalsIgnoreCase(this.f4064a)) {
            this.f4065b.m3574a(this.f4065b.f3617m.getText().toString(), true);
        }
    }
}
