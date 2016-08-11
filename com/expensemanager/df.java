package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class df implements OnClickListener {
    final /* synthetic */ CurrencyConverter f4474a;

    df(CurrencyConverter currencyConverter) {
        this.f4474a = currencyConverter;
    }

    public void onClick(View view) {
        String stringExtra = this.f4474a.getIntent().getStringExtra("fromWhere");
        Intent intent = new Intent(this.f4474a.f2638l, ExpenseNewTransaction.class);
        this.f4474a.f2637k = this.f4474a.f2637k.replaceAll(",", "");
        Bundle bundle = new Bundle();
        bundle.putString("fromWhere", stringExtra);
        bundle.putString("amount", this.f4474a.f2637k);
        bundle.putString("ref", this.f4474a.f2630d.getText().toString());
        bundle.putString("description", this.f4474a.f2629c.getText().toString());
        bundle.putString("account", this.f4474a.getIntent().getStringExtra("account"));
        intent.putExtras(bundle);
        if ("tools".equalsIgnoreCase(stringExtra)) {
            this.f4474a.startActivity(intent);
            return;
        }
        this.f4474a.setResult(-1, intent);
        this.f4474a.finish();
    }
}
