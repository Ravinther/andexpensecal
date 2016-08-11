package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class aeo implements OnClickListener {
    final /* synthetic */ SMSAddEdit f4006a;

    aeo(SMSAddEdit sMSAddEdit) {
        this.f4006a = sMSAddEdit;
    }

    public void onClick(View view) {
        this.f4006a.startActivityForResult(new Intent(this.f4006a.f3572l, ExpensePaymentMethodList.class), 2);
    }
}
