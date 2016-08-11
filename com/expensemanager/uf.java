package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class uf implements OnClickListener {
    final /* synthetic */ uc f5327a;

    uf(uc ucVar) {
        this.f5327a = ucVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5327a.m315i(), ExpenseDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5327a.f5323c);
        bundle.putInt("typeId", 1);
        bundle.putInt("tabId", 2);
        intent.putExtras(bundle);
        this.f5327a.m281a(intent, 0);
    }
}
