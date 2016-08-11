package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class um implements OnClickListener {
    final /* synthetic */ uc f5335a;

    um(uc ucVar) {
        this.f5335a = ucVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5335a.m315i(), ExpenseRepeatingTransferList.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5335a.f5323c);
        intent.putExtras(bundle);
        this.f5335a.m281a(intent, 0);
    }
}
