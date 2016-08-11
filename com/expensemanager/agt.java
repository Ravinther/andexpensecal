package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class agt implements OnClickListener {
    final /* synthetic */ ShoppingListAddEdit f4100a;

    agt(ShoppingListAddEdit shoppingListAddEdit) {
        this.f4100a = shoppingListAddEdit;
    }

    public void onClick(View view) {
        if (this.f4100a.f3608d.isChecked()) {
            this.f4100a.f3601D.setVisibility(0);
            this.f4100a.f3624t.setText(this.f4100a.getResources().getString(2131099918));
        }
    }
}
