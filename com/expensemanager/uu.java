package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class uu implements OnClickListener {
    final /* synthetic */ uc f5344a;

    uu(uc ucVar) {
        this.f5344a = ucVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5344a.m315i(), ExpenseDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5344a.f5323c);
        bundle.putInt("typeId", 0);
        bundle.putInt("tabId", 1);
        intent.putExtras(bundle);
        this.f5344a.m281a(intent, 0);
    }
}
