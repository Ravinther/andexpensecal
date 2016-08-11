package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class xz implements OnClickListener {
    final /* synthetic */ String f5465a;
    final /* synthetic */ ExpenseNewTransaction f5466b;

    xz(ExpenseNewTransaction expenseNewTransaction, String str) {
        this.f5466b = expenseNewTransaction;
        this.f5465a = str;
    }

    public void onClick(View view) {
        if (this.f5465a == null || !this.f5465a.startsWith("Income")) {
            this.f5466b.startActivityForResult(new Intent(this.f5466b.f3334a, ExpenseCategoryExpandableList.class), 1);
        } else {
            this.f5466b.startActivityForResult(new Intent(this.f5466b.f3334a, ExpenseIncomeCategoryList.class), 1);
        }
    }
}
