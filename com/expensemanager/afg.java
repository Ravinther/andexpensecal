package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class afg implements OnClickListener {
    final /* synthetic */ SalesTaxCalculator f4044a;

    afg(SalesTaxCalculator salesTaxCalculator) {
        this.f4044a = salesTaxCalculator;
    }

    public void onClick(View view) {
        String stringExtra = this.f4044a.getIntent().getStringExtra("fromWhere");
        Intent intent = new Intent(this.f4044a.f3589h, ExpenseNewTransaction.class);
        String replaceAll = this.f4044a.f3582a.getText().toString().replaceAll(",", "");
        Bundle bundle = new Bundle();
        bundle.putString("fromWhere", stringExtra);
        bundle.putString("amount", replaceAll);
        bundle.putString("account", this.f4044a.getIntent().getStringExtra("account"));
        intent.putExtras(bundle);
        if ("tools".equalsIgnoreCase(stringExtra)) {
            this.f4044a.startActivity(intent);
            return;
        }
        this.f4044a.setResult(-1, intent);
        this.f4044a.finish();
    }
}
