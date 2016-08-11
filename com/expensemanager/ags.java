package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class ags implements OnClickListener {
    final /* synthetic */ TextView f4098a;
    final /* synthetic */ ShoppingListAddEdit f4099b;

    ags(ShoppingListAddEdit shoppingListAddEdit, TextView textView) {
        this.f4099b = shoppingListAddEdit;
        this.f4098a = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4098a.setText(this.f4099b.f3630z);
    }
}
