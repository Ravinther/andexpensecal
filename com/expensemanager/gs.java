package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class gs implements OnClickListener {
    final /* synthetic */ ExpenseAccountList f4707a;

    gs(ExpenseAccountList expenseAccountList) {
        this.f4707a = expenseAccountList;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f4707a.f2763i, ExpenseNewAccount.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("isNew", true);
        intent.putExtras(bundle);
        this.f4707a.startActivityForResult(intent, 0);
    }
}
