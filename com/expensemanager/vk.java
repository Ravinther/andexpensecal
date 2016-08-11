package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class vk implements OnClickListener {
    final /* synthetic */ ExpenseMileageNewEdit f5371a;

    vk(ExpenseMileageNewEdit expenseMileageNewEdit) {
        this.f5371a = expenseMileageNewEdit;
    }

    public void onClick(View view) {
        this.f5371a.showDialog(1);
    }
}
