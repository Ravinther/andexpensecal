package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class ut implements OnClickListener {
    final /* synthetic */ uc f5343a;

    ut(uc ucVar) {
        this.f5343a = ucVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5343a.m315i(), ExpenseDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5343a.f5323c);
        bundle.putInt("typeId", 0);
        bundle.putInt("tabId", 2);
        intent.putExtras(bundle);
        this.f5343a.m281a(intent, 0);
    }
}
