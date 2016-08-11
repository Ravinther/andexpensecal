package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class dg implements OnClickListener {
    final /* synthetic */ CurrencyConverter f4475a;

    dg(CurrencyConverter currencyConverter) {
        this.f4475a = currencyConverter;
    }

    public void onClick(View view) {
        this.f4475a.setResult(0, new Intent());
        this.f4475a.finish();
    }
}
