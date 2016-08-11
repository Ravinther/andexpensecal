package com.expensemanager;

import android.app.DatePickerDialog;
import android.view.View;
import android.view.View.OnClickListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class eh implements OnClickListener {
    final /* synthetic */ DebtAddEdit f4581a;

    eh(DebtAddEdit debtAddEdit) {
        this.f4581a = debtAddEdit;
    }

    public void onClick(View view) {
        Calendar instance = Calendar.getInstance();
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
            if (view.getId() == 2131558533) {
                if (!"".equals(this.f4581a.f2656c.getText().toString())) {
                    instance.setTime(simpleDateFormat.parse(this.f4581a.f2656c.getText().toString()));
                }
            } else if (!"".equals(this.f4581a.f2655b.getText().toString())) {
                instance.setTime(simpleDateFormat.parse(this.f4581a.f2655b.getText().toString()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        new DatePickerDialog(this.f4581a.f2654a, new ei(this, view), instance.get(1), instance.get(2), instance.get(5)).show();
    }
}
