package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class agp implements OnDateSetListener {
    final /* synthetic */ ShoppingListAddEdit f4094a;

    agp(ShoppingListAddEdit shoppingListAddEdit) {
        this.f4094a = shoppingListAddEdit;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.f4094a.f3625u = i;
        this.f4094a.f3626v = i2;
        this.f4094a.f3627w = i3;
        this.f4094a.m3579b();
    }
}
