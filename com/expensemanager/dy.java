package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class dy implements OnClickListener {
    final /* synthetic */ DebtAddEdit f4570a;

    dy(DebtAddEdit debtAddEdit) {
        this.f4570a = debtAddEdit;
    }

    public void onClick(View view) {
        this.f4570a.startActivityForResult(new Intent(this.f4570a.f2654a, ExpenseAccountList.class), 0);
    }
}
