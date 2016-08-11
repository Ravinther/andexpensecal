package com.expensemanager;

import android.view.View;
import android.view.View.OnLongClickListener;

class wc implements OnLongClickListener {
    final /* synthetic */ ExpenseMileageNewEdit f5391a;

    wc(ExpenseMileageNewEdit expenseMileageNewEdit) {
        this.f5391a = expenseMileageNewEdit;
    }

    public boolean onLongClick(View view) {
        this.f5391a.f3280m.setText(null);
        if ("".equals(this.f5391a.f3279l.getText().toString()) || "".equals(this.f5391a.f3280m.getText().toString())) {
            this.f5391a.f3283p.setVisibility(8);
        } else {
            this.f5391a.f3283p.setVisibility(0);
        }
        return true;
    }
}
