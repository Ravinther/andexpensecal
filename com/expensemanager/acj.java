package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

class acj implements OnClickListener {
    final /* synthetic */ TextView f3904a;
    final /* synthetic */ InterestCalculator f3905b;

    acj(InterestCalculator interestCalculator, TextView textView) {
        this.f3905b = interestCalculator;
        this.f3904a = textView;
    }

    public void onClick(View view) {
        String stringExtra = this.f3905b.getIntent().getStringExtra("fromWhere");
        Intent intent = new Intent(this.f3905b.f3497a, ExpenseNewTransaction.class);
        String replaceAll = this.f3904a.getText().toString().replaceAll(",", "");
        Bundle bundle = new Bundle();
        bundle.putString("fromWhere", stringExtra);
        bundle.putString("amount", replaceAll);
        bundle.putString("account", this.f3905b.getIntent().getStringExtra("account"));
        bundle.putString("category", "Income");
        intent.putExtras(bundle);
        if ("tools".equalsIgnoreCase(stringExtra)) {
            this.f3905b.startActivity(intent);
            return;
        }
        this.f3905b.setResult(-1, intent);
        this.f3905b.finish();
    }
}
