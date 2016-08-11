package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class agg implements OnClickListener {
    final /* synthetic */ String f4084a;
    final /* synthetic */ ShoppingListAddEdit f4085b;

    agg(ShoppingListAddEdit shoppingListAddEdit, String str) {
        this.f4085b = shoppingListAddEdit;
        this.f4084a = str;
    }

    public void onClick(View view) {
        this.f4085b.m3573a(this.f4084a);
    }
}
