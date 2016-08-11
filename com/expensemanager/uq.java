package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class uq implements OnClickListener {
    final /* synthetic */ String f5339a;
    final /* synthetic */ uc f5340b;

    uq(uc ucVar, String str) {
        this.f5340b = ucVar;
        this.f5339a = str;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5340b.m315i(), ExpenseNewTransaction.class);
        if ("mi".equals(this.f5339a) || "km".equals(this.f5339a)) {
            intent = new Intent(this.f5340b.m315i(), ExpenseMileageNewEdit.class);
        }
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5340b.f5323c);
        bundle.putString("category", "Income");
        intent.putExtras(bundle);
        this.f5340b.m281a(intent, 1);
    }
}
