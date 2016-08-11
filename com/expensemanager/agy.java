package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class agy implements OnClickListener {
    final /* synthetic */ String f4106a;
    final /* synthetic */ ShoppingListAddEdit f4107b;

    agy(ShoppingListAddEdit shoppingListAddEdit, String str) {
        this.f4107b = shoppingListAddEdit;
        this.f4106a = str;
    }

    public void onClick(View view) {
        if (this.f4106a == null || !this.f4106a.startsWith("Income")) {
            this.f4107b.startActivityForResult(new Intent(this.f4107b.f3605a, ExpenseCategoryExpandableList.class), 1);
        } else {
            this.f4107b.startActivityForResult(new Intent(this.f4107b.f3605a, ExpenseIncomeCategoryList.class), 1);
        }
    }
}
