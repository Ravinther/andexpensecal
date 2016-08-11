package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

class ago implements OnClickListener {
    final /* synthetic */ ShoppingListAddEdit f4093a;

    ago(ShoppingListAddEdit shoppingListAddEdit) {
        this.f4093a = shoppingListAddEdit;
    }

    public void onClick(View view) {
        ((InputMethodManager) this.f4093a.getSystemService("input_method")).hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
        this.f4093a.m3573a("OKNEW");
        this.f4093a.f3614j.setHint(this.f4093a.f3614j.getText().toString());
        this.f4093a.f3614j.setText(null);
        this.f4093a.f3615k.setText(null);
    }
}
