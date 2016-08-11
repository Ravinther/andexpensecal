package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class aaf implements OnClickListener {
    final /* synthetic */ ExpenseRepeatingTransaction f3800a;

    aaf(ExpenseRepeatingTransaction expenseRepeatingTransaction) {
        this.f3800a = expenseRepeatingTransaction;
    }

    public void onClick(View view) {
        String charSequence = this.f3800a.f3420m.getText().toString();
        if ("Account Transfer".equalsIgnoreCase(charSequence)) {
            this.f3800a.startActivityForResult(new Intent(this.f3800a.f3413f, ExpenseAccountList.class), 7);
            return;
        }
        Intent intent = new Intent(this.f3800a.f3413f, ExpensePayList.class);
        Bundle bundle = new Bundle();
        bundle.putString("categoryDisplay", charSequence);
        intent.putExtras(bundle);
        this.f3800a.startActivityForResult(intent, 3);
    }
}
