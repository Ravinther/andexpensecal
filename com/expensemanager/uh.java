package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class uh implements OnClickListener {
    final /* synthetic */ uc f5329a;

    uh(uc ucVar) {
        this.f5329a = ucVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5329a.m315i(), ExpenseDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5330a.f5323c);
        bundle.putInt("typeId", 1);
        bundle.putInt("tabId", 1);
        intent.putExtras(bundle);
        this.f5329a.m281a(intent, 0);
    }
}
