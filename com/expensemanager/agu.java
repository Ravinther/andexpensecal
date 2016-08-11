package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class agu implements OnClickListener {
    final /* synthetic */ String[] f4101a;
    final /* synthetic */ ShoppingListAddEdit f4102b;

    agu(ShoppingListAddEdit shoppingListAddEdit, String[] strArr) {
        this.f4102b = shoppingListAddEdit;
        this.f4101a = strArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4102b.f3630z = this.f4101a[i];
    }
}
