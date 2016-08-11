package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class uv implements OnClickListener {
    final /* synthetic */ uc f5345a;

    uv(uc ucVar) {
        this.f5345a = ucVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5345a.m315i(), ExpenseDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5345a.f5323c);
        bundle.putInt("typeId", 0);
        bundle.putInt("tabId", 0);
        intent.putExtras(bundle);
        this.f5345a.m281a(intent, 0);
    }
}
