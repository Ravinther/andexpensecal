package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class tf implements OnClickListener {
    final /* synthetic */ ExpenseGroupAddEdit f5289a;

    tf(ExpenseGroupAddEdit expenseGroupAddEdit) {
        this.f5289a = expenseGroupAddEdit;
    }

    public void onClick(View view) {
        this.f5289a.setResult(0, new Intent(this.f5289a.f3220b, ExpenseCategoryExpandableList.class));
        this.f5289a.finish();
    }
}
