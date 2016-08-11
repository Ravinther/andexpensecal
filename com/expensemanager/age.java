package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class age implements OnClickListener {
    final /* synthetic */ ShoppingListAddEdit f4082a;

    age(ShoppingListAddEdit shoppingListAddEdit) {
        this.f4082a = shoppingListAddEdit;
    }

    public void onClick(View view) {
        if (this.f4082a.f3624t.getText().toString().equals(this.f4082a.getResources().getString(2131099918))) {
            this.f4082a.f3624t.setText(this.f4082a.getResources().getString(2131099966));
            this.f4082a.f3601D.setVisibility(8);
            return;
        }
        this.f4082a.f3624t.setText(this.f4082a.getResources().getString(2131099918));
        this.f4082a.f3601D.setVisibility(0);
    }
}
