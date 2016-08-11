package com.expensemanager;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

class aej implements OnDateSetListener {
    final /* synthetic */ aei f3998a;

    aej(aei com_expensemanager_aei) {
        this.f3998a = com_expensemanager_aei;
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
        this.f3998a.f3997a.f3569i.setText(aib.m3867b(i + "-" + str + "-" + str2, "yyyy-MM-dd", ExpenseManager.f3244t));
    }
}
