package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class uk implements OnClickListener {
    final /* synthetic */ String f5332a;
    final /* synthetic */ uc f5333b;

    uk(uc ucVar, String str) {
        this.f5333b = ucVar;
        this.f5332a = str;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5333b.m315i(), ExpenseRepeatingList.class);
        if ("mi".equals(this.f5332a) || "km".equals(this.f5332a)) {
            intent = new Intent(this.f5333b.m315i(), ExpenseMileageActivities.class);
        }
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5333b.f5323c);
        intent.putExtras(bundle);
        this.f5333b.m281a(intent, 1);
    }
}
