package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class ye implements OnClickListener {
    final /* synthetic */ String f5477a;
    final /* synthetic */ ExpenseNewTransaction f5478b;

    ye(ExpenseNewTransaction expenseNewTransaction, String str) {
        this.f5478b = expenseNewTransaction;
        this.f5477a = str;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5478b.f3334a, ExpensePayList.class);
        Bundle bundle = new Bundle();
        bundle.putString("categoryDisplay", this.f5477a);
        intent.putExtras(bundle);
        this.f5478b.startActivityForResult(intent, 3);
    }
}
