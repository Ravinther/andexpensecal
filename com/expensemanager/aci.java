package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

class aci implements OnClickListener {
    final /* synthetic */ TextView f3902a;
    final /* synthetic */ InterestCalculator f3903b;

    aci(InterestCalculator interestCalculator, TextView textView) {
        this.f3903b = interestCalculator;
        this.f3902a = textView;
    }

    public void onClick(View view) {
        String stringExtra = this.f3903b.getIntent().getStringExtra("fromWhere");
        Intent intent = new Intent(this.f3903b.f3497a, ExpenseNewTransaction.class);
        String replaceAll = this.f3902a.getText().toString().replaceAll(",", "");
        Bundle bundle = new Bundle();
        bundle.putString("fromWhere", stringExtra);
        bundle.putString("amount", replaceAll);
        bundle.putString("account", this.f3903b.getIntent().getStringExtra("account"));
        bundle.putString("category", "Income");
        intent.putExtras(bundle);
        if ("tools".equalsIgnoreCase(stringExtra)) {
            this.f3903b.startActivity(intent);
            return;
        }
        this.f3903b.setResult(-1, intent);
        this.f3903b.finish();
    }
}
