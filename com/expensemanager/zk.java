package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class zk implements OnClickListener {
    final /* synthetic */ ExpenseRepeatingList f5539a;

    zk(ExpenseRepeatingList expenseRepeatingList) {
        this.f5539a = expenseRepeatingList;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        Intent intent = new Intent();
        bundle.putString("account", this.f5539a.f3398c);
        bundle.putString("category", "Income");
        intent.putExtras(bundle);
        intent.setClass(this.f5539a.f3399d, ExpenseRepeatingTransaction.class);
        this.f5539a.startActivityForResult(intent, 0);
    }
}
