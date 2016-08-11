package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class acr implements OnClickListener {
    final /* synthetic */ LoanCalculator f3931a;

    acr(LoanCalculator loanCalculator) {
        this.f3931a = loanCalculator;
    }

    public void onClick(View view) {
        String stringExtra = this.f3931a.getIntent().getStringExtra("fromWhere");
        Intent intent = new Intent(this.f3931a.f3516m, ExpenseRepeatingTransaction.class);
        String a = aib.m3850a(this.f3931a.f3515l);
        String str = "" + this.f3931a.f3514k;
        if (!(a == null || "".equals(a))) {
            a = a.replaceAll(",", "");
        }
        Bundle bundle = new Bundle();
        bundle.putString("fromWhere", stringExtra);
        bundle.putString("monthlyPayment", a);
        bundle.putString("month", str);
        bundle.putString("account", this.f3931a.getIntent().getStringExtra("account"));
        intent.putExtras(bundle);
        if ("tools".equalsIgnoreCase(stringExtra)) {
            this.f3931a.startActivity(intent);
            return;
        }
        this.f3931a.setResult(-1, intent);
        this.f3931a.finish();
    }
}
