package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class agw implements OnClickListener {
    final /* synthetic */ ShoppingListAddEdit f4104a;

    agw(ShoppingListAddEdit shoppingListAddEdit) {
        this.f4104a = shoppingListAddEdit;
    }

    public void onClick(View view) {
        this.f4104a.onCreateDialog(2).show();
    }
}
