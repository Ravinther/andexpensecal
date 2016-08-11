package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class afh implements OnClickListener {
    final /* synthetic */ SalesTaxCalculator f4045a;

    afh(SalesTaxCalculator salesTaxCalculator) {
        this.f4045a = salesTaxCalculator;
    }

    public void onClick(View view) {
        this.f4045a.setResult(0, new Intent());
        this.f4045a.finish();
    }
}
