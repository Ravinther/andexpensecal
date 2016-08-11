package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class aak implements OnClickListener {
    final /* synthetic */ ExpenseRepeatingTransferList f3805a;

    aak(ExpenseRepeatingTransferList expenseRepeatingTransferList) {
        this.f3805a = expenseRepeatingTransferList;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        Intent intent = new Intent();
        bundle.putString("account", this.f3805a.f3436c);
        bundle.putString("category", "Account Transfer");
        intent.putExtras(bundle);
        intent.setClass(this.f3805a.f3437d, ExpenseRepeatingTransaction.class);
        this.f3805a.startActivityForResult(intent, 0);
    }
}
