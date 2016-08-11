package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class uj implements OnClickListener {
    final /* synthetic */ uc f5331a;

    uj(uc ucVar) {
        this.f5331a = ucVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5331a.m315i(), ExpenseAccountSummary.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5331a.f5323c);
        intent.putExtras(bundle);
        this.f5331a.m281a(intent, 0);
    }
}
