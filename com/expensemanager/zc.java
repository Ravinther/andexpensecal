package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class zc implements OnClickListener {
    final /* synthetic */ ExpenseReminderList f5523a;

    zc(ExpenseReminderList expenseReminderList) {
        this.f5523a = expenseReminderList;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        Intent intent = new Intent();
        bundle.putString("account", this.f5523a.f3386b);
        bundle.putString("reminder", "YES");
        intent.putExtras(bundle);
        intent.setClass(this.f5523a.f3387c, ExpenseRepeatingTransaction.class);
        this.f5523a.startActivityForResult(intent, 0);
    }
}
