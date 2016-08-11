package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class agv implements OnClickListener {
    final /* synthetic */ ShoppingListAddEdit f4103a;

    agv(ShoppingListAddEdit shoppingListAddEdit) {
        this.f4103a = shoppingListAddEdit;
    }

    public void onClick(View view) {
        this.f4103a.showDialog(1);
    }
}
