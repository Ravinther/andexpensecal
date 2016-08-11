package com.expensemanager;

import android.view.View;
import android.view.View.OnLongClickListener;

class wa implements OnLongClickListener {
    final /* synthetic */ ExpenseMileageNewEdit f5389a;

    wa(ExpenseMileageNewEdit expenseMileageNewEdit) {
        this.f5389a = expenseMileageNewEdit;
    }

    public boolean onLongClick(View view) {
        this.f5389a.f3279l.setText(null);
        if ("".equals(this.f5389a.f3279l.getText().toString()) || "".equals(this.f5389a.f3280m.getText().toString())) {
            this.f5389a.f3283p.setVisibility(8);
        } else {
            this.f5389a.f3283p.setVisibility(0);
        }
        return true;
    }
}
