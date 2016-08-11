package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class ahu implements OnClickListener {
    final /* synthetic */ TipCalculator f4138a;

    ahu(TipCalculator tipCalculator) {
        this.f4138a = tipCalculator;
    }

    public void onClick(View view) {
        String stringExtra = this.f4138a.getIntent().getStringExtra("fromWhere");
        Intent intent = new Intent(this.f4138a.f3662k, ExpenseNewTransaction.class);
        String replaceAll = this.f4138a.f3655d.getText().toString().replaceAll(",", "");
        Bundle bundle = new Bundle();
        bundle.putString("fromWhere", stringExtra);
        bundle.putString("amount", replaceAll);
        bundle.putString("account", this.f4138a.getIntent().getStringExtra("account"));
        intent.putExtras(bundle);
        if ("tools".equalsIgnoreCase(stringExtra)) {
            this.f4138a.startActivity(intent);
            return;
        }
        this.f4138a.setResult(-1, intent);
        this.f4138a.finish();
    }
}
