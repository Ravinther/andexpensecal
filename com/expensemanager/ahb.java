package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class ahb implements OnClickListener {
    final /* synthetic */ ShoppingListAddEdit f4114a;

    ahb(ShoppingListAddEdit shoppingListAddEdit) {
        this.f4114a = shoppingListAddEdit;
    }

    public void onClick(View view) {
        String stringExtra = this.f4114a.getIntent().getStringExtra("category");
        if (stringExtra == null || !stringExtra.startsWith("Income")) {
            this.f4114a.getIntent().putExtra("category", "Income");
        } else {
            this.f4114a.getIntent().removeExtra("category");
        }
        this.f4114a.onCreate(null);
    }
}
