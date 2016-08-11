package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class aem implements OnClickListener {
    final /* synthetic */ SMSAddEdit f4004a;

    aem(SMSAddEdit sMSAddEdit) {
        this.f4004a = sMSAddEdit;
    }

    public void onClick(View view) {
        String charSequence = this.f4004a.f3563c.getText().toString();
        if (charSequence == null || !charSequence.startsWith("Income")) {
            this.f4004a.startActivityForResult(new Intent(this.f4004a.f3572l, ExpenseCategoryExpandableList.class), 1);
        } else {
            this.f4004a.startActivityForResult(new Intent(this.f4004a.f3572l, ExpenseIncomeCategoryList.class), 1);
        }
    }
}
