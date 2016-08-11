package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class iw implements OnClickListener {
    final /* synthetic */ ExpenseAccountTransfer f4820a;

    iw(ExpenseAccountTransfer expenseAccountTransfer) {
        this.f4820a = expenseAccountTransfer;
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f4820a.f2835u);
        bundle.putString("toAccount", this.f4820a.getIntent().getStringExtra("toAccount"));
        intent.putExtras(bundle);
        this.f4820a.setResult(0, intent);
        this.f4820a.finish();
    }
}
