package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class js implements OnClickListener {
    final /* synthetic */ String f4856a;
    final /* synthetic */ ExpenseAutoFillAddEdit f4857b;

    js(ExpenseAutoFillAddEdit expenseAutoFillAddEdit, String str) {
        this.f4857b = expenseAutoFillAddEdit;
        this.f4856a = str;
    }

    public void onClick(View view) {
        if (this.f4856a == null || !this.f4856a.startsWith("Income")) {
            this.f4857b.startActivityForResult(new Intent(this.f4857b.f2863a, ExpenseCategoryExpandableList.class), 1);
        } else {
            this.f4857b.startActivityForResult(new Intent(this.f4857b.f2863a, ExpenseIncomeCategoryList.class), 1);
        }
    }
}
