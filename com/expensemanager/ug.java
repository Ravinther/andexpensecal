package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class ug implements OnClickListener {
    final /* synthetic */ uc f5328a;

    ug(uc ucVar) {
        this.f5328a = ucVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5328a.m315i(), ExpenseDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5328a.f5323c);
        bundle.putInt("typeId", 1);
        bundle.putInt("tabId", 0);
        intent.putExtras(bundle);
        this.f5328a.m281a(intent, 0);
    }
}
