package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

class qr implements OnClickListener {
    final /* synthetic */ ExpenseCustomActivities f5191a;

    qr(ExpenseCustomActivities expenseCustomActivities) {
        this.f5191a = expenseCustomActivities;
    }

    public void onClick(View view) {
        String str = "";
        if (this.f5191a.f3147h.isChecked()) {
            List a = abd.m3798a(this.f5191a.f3141b, "account in (" + abd.m3792a(this.f5191a.f3146g.getText().toString()) + ")" + " and " + "category" + "!='Income'", "category");
            this.f5191a.m3064a((String[]) a.toArray(new String[a.size()]), this.f5191a.f3151l);
        }
        if (this.f5191a.f3148i.isChecked()) {
            this.f5191a.f3151l.setText("Income");
            this.f5191a.f3151l.setTextColor(co.f4429c);
        }
        if (this.f5191a.f3149j.isChecked()) {
            a = abd.m3798a(this.f5191a.f3141b, "account in (" + abd.m3792a(this.f5191a.f3146g.getText().toString()) + ")", "category");
            this.f5191a.m3064a((String[]) a.toArray(new String[a.size()]), this.f5191a.f3151l);
        }
    }
}
