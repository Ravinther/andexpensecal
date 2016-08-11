package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class aae implements OnClickListener {
    final /* synthetic */ ExpenseRepeatingTransaction f3799a;

    aae(ExpenseRepeatingTransaction expenseRepeatingTransaction) {
        this.f3799a = expenseRepeatingTransaction;
    }

    public void onClick(View view) {
        String charSequence = this.f3799a.f3420m.getText().toString();
        if (charSequence == null || !charSequence.startsWith("Income")) {
            this.f3799a.startActivityForResult(new Intent(this.f3799a.f3413f, ExpenseCategoryExpandableList.class), 1);
        } else {
            this.f3799a.startActivityForResult(new Intent(this.f3799a.f3413f, ExpenseIncomeCategoryList.class), 1);
        }
    }
}
