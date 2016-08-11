package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class afv implements OnClickListener {
    final /* synthetic */ ShoppingListAddEdit f4068a;

    afv(ShoppingListAddEdit shoppingListAddEdit) {
        this.f4068a = shoppingListAddEdit;
    }

    public void onClick(View view) {
        this.f4068a.startActivityForResult(new Intent(this.f4068a.f3605a, ExpensePaymentMethodList.class), 5);
    }
}
