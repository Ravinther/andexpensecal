package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class dl implements OnClickListener {
    final /* synthetic */ CurrencySettings f4480a;

    dl(CurrencySettings currencySettings) {
        this.f4480a = currencySettings;
    }

    public void onClick(View view) {
        this.f4480a.setResult(0, new Intent());
        this.f4480a.finish();
    }
}
