package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class agr implements OnClickListener {
    final /* synthetic */ TextView f4096a;
    final /* synthetic */ ShoppingListAddEdit f4097b;

    agr(ShoppingListAddEdit shoppingListAddEdit, TextView textView) {
        this.f4097b = shoppingListAddEdit;
        this.f4096a = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4097b.f3630z = this.f4096a.getText().toString();
    }
}
