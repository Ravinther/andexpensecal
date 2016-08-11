package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class aal implements OnClickListener {
    final /* synthetic */ ExpenseRepeatingTransferList f3806a;

    aal(ExpenseRepeatingTransferList expenseRepeatingTransferList) {
        this.f3806a = expenseRepeatingTransferList;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        Intent intent = new Intent();
        bundle.putString("account", this.f3806a.f3436c);
        bundle.putString("category", "Account Transfer");
        intent.putExtras(bundle);
        intent.setClass(this.f3806a.f3437d, ExpenseAccountTransfer.class);
        this.f3806a.startActivityForResult(intent, 0);
    }
}
