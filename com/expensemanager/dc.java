package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class dc implements OnClickListener {
    final /* synthetic */ EditText f4469a;
    final /* synthetic */ EditText f4470b;
    final /* synthetic */ CreditCardPayOffCalculator f4471c;

    dc(CreditCardPayOffCalculator creditCardPayOffCalculator, EditText editText, EditText editText2) {
        this.f4471c = creditCardPayOffCalculator;
        this.f4469a = editText;
        this.f4470b = editText2;
    }

    public void onClick(View view) {
        String stringExtra = this.f4471c.getIntent().getStringExtra("fromWhere");
        Intent intent = new Intent(this.f4471c.f2626c, ExpenseRepeatingTransaction.class);
        String obj = this.f4469a.getText().toString();
        String obj2 = this.f4470b.getText().toString();
        if (this.f4469a.getText().toString() == null || "".equals(this.f4469a.getText().toString())) {
            obj = this.f4471c.f2625b.replaceAll(",", "");
        } else {
            obj2 = "" + this.f4471c.f2624a;
        }
        Bundle bundle = new Bundle();
        bundle.putString("fromWhere", stringExtra);
        bundle.putString("monthlyPayment", obj);
        bundle.putString("month", obj2);
        bundle.putString("account", this.f4471c.getIntent().getStringExtra("account"));
        intent.putExtras(bundle);
        if ("tools".equalsIgnoreCase(stringExtra)) {
            this.f4471c.startActivity(intent);
            return;
        }
        this.f4471c.setResult(-1, intent);
        this.f4471c.finish();
    }
}
