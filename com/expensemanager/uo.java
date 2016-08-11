package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class uo implements OnClickListener {
    final /* synthetic */ uc f5337a;

    uo(uc ucVar) {
        this.f5337a = ucVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5337a.m315i(), ExpenseNewTransaction.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5337a.f5323c);
        intent.putExtras(bundle);
        this.f5337a.m281a(intent, 1);
    }
}
