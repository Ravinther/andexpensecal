package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.expensemanager.calculator.Calculator;

class afw implements OnClickListener {
    final /* synthetic */ ShoppingListAddEdit f4069a;

    afw(ShoppingListAddEdit shoppingListAddEdit) {
        this.f4069a = shoppingListAddEdit;
    }

    public void onClick(View view) {
        this.f4069a.startActivityForResult(new Intent(this.f4069a.f3605a, Calculator.class), 4);
    }
}
