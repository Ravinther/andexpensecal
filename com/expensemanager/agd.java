package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.expensemanager.calculator.Calculator;

class agd implements OnClickListener {
    final /* synthetic */ ShoppingListAddEdit f4081a;

    agd(ShoppingListAddEdit shoppingListAddEdit) {
        this.f4081a = shoppingListAddEdit;
    }

    public void onClick(View view) {
        this.f4081a.startActivityForResult(new Intent(this.f4081a.f3605a, Calculator.class), 10);
    }
}
