package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class ud implements OnItemClickListener {
    final /* synthetic */ uc f5325a;

    ud(uc ucVar) {
        this.f5325a = ucVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Intent intent = new Intent(this.f5325a.m315i(), ExpenseDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5325a.f5323c);
        bundle.putInt("tabId", i);
        intent.putExtras(bundle);
        this.f5325a.m281a(intent, 0);
    }
}
