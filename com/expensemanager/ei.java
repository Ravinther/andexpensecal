package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.view.View;
import android.widget.DatePicker;

class ei implements OnDateSetListener {
    final /* synthetic */ View f4582a;
    final /* synthetic */ eh f4583b;

    ei(eh ehVar, View view) {
        this.f4583b = ehVar;
        this.f4582a = view;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        int i4 = i2 + 1;
        String str = "" + i4;
        if (i4 < 10) {
            str = "0" + i4;
        }
        String str2 = "" + i3;
        if (i3 < 10) {
            str2 = "0" + i3;
        }
        if (this.f4582a.getId() == 2131558533) {
            this.f4583b.f4581a.f2656c.setText(aib.m3867b(i + "-" + str + "-" + str2, "yyyy-MM-dd", ExpenseManager.f3244t));
        } else {
            this.f4583b.f4581a.f2655b.setText(aib.m3867b(i + "-" + str + "-" + str2, "yyyy-MM-dd", ExpenseManager.f3244t));
        }
    }
}
