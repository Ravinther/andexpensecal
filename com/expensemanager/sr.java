package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class sr implements OnClickListener {
    final /* synthetic */ ExpenseDetails f5268a;

    sr(ExpenseDetails expenseDetails) {
        this.f5268a = expenseDetails;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.f5268a.f3175C, ExpenseNewTransaction.class);
        bundle.putString("date", aba.m3757a("EEE, " + ExpenseManager.f3244t, ExpenseManager.f3244t, this.f5268a.f3208x.getText().toString()));
        bundle.putString("account", this.f5268a.f3183K);
        if (this.f5268a.f3202q == 1) {
            bundle.putString("category", "Income");
        }
        bundle.putString("fromWhere", "DailyViewNew");
        intent.putExtras(bundle);
        this.f5268a.startActivityForResult(intent, 0);
    }
}
