package com.expensemanager;

import android.view.View;
import android.view.View.OnLongClickListener;

class vn implements OnLongClickListener {
    final /* synthetic */ ExpenseMileageNewEdit f5374a;

    vn(ExpenseMileageNewEdit expenseMileageNewEdit) {
        this.f5374a = expenseMileageNewEdit;
    }

    public boolean onLongClick(View view) {
        this.f5374a.f3281n.setText(null);
        return true;
    }
}
