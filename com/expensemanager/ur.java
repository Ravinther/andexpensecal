package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class ur implements OnClickListener {
    final /* synthetic */ uc f5341a;

    ur(uc ucVar) {
        this.f5341a = ucVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5341a.m315i(), ExpenseDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5341a.f5323c);
        bundle.putInt("typeId", 0);
        bundle.putInt("tabId", 3);
        intent.putExtras(bundle);
        this.f5341a.m281a(intent, 0);
    }
}
