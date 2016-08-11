package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class zj implements OnClickListener {
    final /* synthetic */ ExpenseRepeatingList f5538a;

    zj(ExpenseRepeatingList expenseRepeatingList) {
        this.f5538a = expenseRepeatingList;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        Intent intent = new Intent();
        bundle.putString("account", this.f5538a.f3398c);
        intent.putExtras(bundle);
        intent.setClass(this.f5538a.f3399d, ExpenseRepeatingTransaction.class);
        this.f5538a.startActivityForResult(intent, 0);
    }
}
