package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class xo implements OnClickListener {
    final /* synthetic */ ExpenseNewTransaction f5451a;

    xo(ExpenseNewTransaction expenseNewTransaction) {
        this.f5451a = expenseNewTransaction;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5451a.f3334a, ExpenseAutoFillList.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5451a.f3357x);
        bundle.putString("categoryDisplay", this.f5451a.f3338e.getText().toString());
        intent.putExtras(bundle);
        this.f5451a.startActivityForResult(intent, 8);
    }
}
