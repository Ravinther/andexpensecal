package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class vx implements OnClickListener {
    final /* synthetic */ ExpenseMileageNewEdit f5385a;

    vx(ExpenseMileageNewEdit expenseMileageNewEdit) {
        this.f5385a = expenseMileageNewEdit;
    }

    public void onClick(View view) {
        this.f5385a.startActivityForResult(new Intent(this.f5385a.f3268a, ExpenseCategoryExpandableList.class), 1);
    }
}
