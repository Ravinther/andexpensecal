package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class xi implements OnClickListener {
    final /* synthetic */ ExpenseNewTransaction f5445a;

    xi(ExpenseNewTransaction expenseNewTransaction) {
        this.f5445a = expenseNewTransaction;
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5445a.f3357x);
        bundle.putInt("position", this.f5445a.getIntent().getIntExtra("position", 0));
        intent.putExtras(bundle);
        this.f5445a.setResult(-1, intent);
        this.f5445a.finish();
    }
}
