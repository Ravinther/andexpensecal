package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class zu implements OnClickListener {
    final /* synthetic */ ExpenseRepeatingTransaction f5556a;

    zu(ExpenseRepeatingTransaction expenseRepeatingTransaction) {
        this.f5556a = expenseRepeatingTransaction;
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5556a.f3432y);
        intent.putExtras(bundle);
        this.f5556a.setResult(0, intent);
        this.f5556a.finish();
    }
}
