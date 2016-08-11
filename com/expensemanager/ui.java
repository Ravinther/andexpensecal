package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class ui implements OnClickListener {
    final /* synthetic */ uc f5330a;

    ui(uc ucVar) {
        this.f5330a = ucVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5330a.m315i(), ExpenseAccountActivities.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5330a.f5323c);
        intent.putExtras(bundle);
        this.f5330a.m281a(intent, 0);
    }
}
