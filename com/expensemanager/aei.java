package com.expensemanager;

import android.app.DatePickerDialog;
import android.view.View;
import android.view.View.OnClickListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class aei implements OnClickListener {
    final /* synthetic */ SMSAddEdit f3997a;

    aei(SMSAddEdit sMSAddEdit) {
        this.f3997a = sMSAddEdit;
    }

    public void onClick(View view) {
        Calendar instance = Calendar.getInstance();
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
            if (!"".equals(this.f3997a.f3569i.getText().toString())) {
                instance.setTime(simpleDateFormat.parse(this.f3997a.f3569i.getText().toString()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.f3997a.f3572l, new aej(this), instance.get(1), instance.get(2), instance.get(5));
        datePickerDialog.setButton(-2, "Cancel", new aek(this));
        datePickerDialog.show();
    }
}
