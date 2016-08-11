package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class ue implements OnClickListener {
    final /* synthetic */ uc f5326a;

    ue(uc ucVar) {
        this.f5326a = ucVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5326a.m315i(), ExpenseDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5326a.f5323c);
        bundle.putInt("typeId", 1);
        bundle.putInt("tabId", 3);
        intent.putExtras(bundle);
        this.f5326a.m281a(intent, 0);
    }
}
