package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

class aa implements OnClickListener {
    final /* synthetic */ ChartNewCustom f3793a;

    aa(ChartNewCustom chartNewCustom) {
        this.f3793a = chartNewCustom;
    }

    public void onClick(View view) {
        String str = "";
        if (this.f3793a.f2447j.isChecked()) {
            List a = abd.m3798a(this.f3793a.f2440c, "account in (" + abd.m3792a(this.f3793a.f2446i.getText().toString()) + ")" + " and " + "category" + "!='Income'", "category");
            this.f3793a.m2390a((String[]) a.toArray(new String[a.size()]), this.f3793a.f2455r);
        }
        if (this.f3793a.f2448k.isChecked()) {
            this.f3793a.f2455r.setText("Income");
            this.f3793a.f2455r.setTextColor(co.f4429c);
        }
    }
}
