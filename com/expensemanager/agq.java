package com.expensemanager;

import android.app.TimePickerDialog.OnTimeSetListener;
import android.widget.TimePicker;

class agq implements OnTimeSetListener {
    final /* synthetic */ ShoppingListAddEdit f4095a;

    agq(ShoppingListAddEdit shoppingListAddEdit) {
        this.f4095a = shoppingListAddEdit;
    }

    public void onTimeSet(TimePicker timePicker, int i, int i2) {
        this.f4095a.f3628x = i;
        this.f4095a.f3629y = i2;
        this.f4095a.f3610f.setText(new StringBuilder().append(ShoppingListAddEdit.m3578b(this.f4095a.f3628x)).append(":").append(ShoppingListAddEdit.m3578b(this.f4095a.f3629y)));
    }
}
