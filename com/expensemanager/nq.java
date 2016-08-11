package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

class nq implements OnClickListener {
    final /* synthetic */ ExpenseChartCustom f5043a;

    nq(ExpenseChartCustom expenseChartCustom) {
        this.f5043a = expenseChartCustom;
    }

    public void onClick(View view) {
        String str = "";
        if (this.f5043a.f3025j.isChecked()) {
            List a = abd.m3798a(this.f5043a.f3018c, "account in (" + abd.m3792a(this.f5043a.f3024i.getText().toString()) + ")" + " and " + "category" + "!='Income'", "category");
            this.f5043a.m2937a((String[]) a.toArray(new String[a.size()]), this.f5043a.f3033r);
        }
        if (this.f5043a.f3026k.isChecked()) {
            this.f5043a.f3033r.setText("Income");
            this.f5043a.f3033r.setTextColor(co.f4429c);
        }
    }
}
