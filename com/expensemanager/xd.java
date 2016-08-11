package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class xd implements OnClickListener {
    final /* synthetic */ ExpenseNewTransaction f5436a;

    xd(ExpenseNewTransaction expenseNewTransaction) {
        this.f5436a = expenseNewTransaction;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5436a.f3334a, TagList.class);
        Bundle bundle = new Bundle();
        bundle.putString("tag", this.f5436a.f3348o.getText().toString());
        intent.putExtras(bundle);
        this.f5436a.startActivityForResult(intent, 9);
    }
}
