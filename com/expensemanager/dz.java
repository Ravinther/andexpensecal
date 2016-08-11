package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class dz implements OnClickListener {
    final /* synthetic */ DebtAddEdit f4571a;

    dz(DebtAddEdit debtAddEdit) {
        this.f4571a = debtAddEdit;
    }

    public void onClick(View view) {
        String charSequence = this.f4571a.f2658e.getText().toString();
        if (charSequence == null || !charSequence.startsWith("Income")) {
            this.f4571a.startActivityForResult(new Intent(this.f4571a.f2654a, ExpenseCategoryExpandableList.class), 1);
        } else {
            this.f4571a.startActivityForResult(new Intent(this.f4571a.f2654a, ExpenseIncomeCategoryList.class), 1);
        }
    }
}
