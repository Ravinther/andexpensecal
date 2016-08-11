package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

class qc implements OnClickListener {
    final /* synthetic */ ExpenseCustomActivities f5168a;

    qc(ExpenseCustomActivities expenseCustomActivities) {
        this.f5168a = expenseCustomActivities;
    }

    public void onClick(View view) {
        String str = "";
        if (this.f5168a.f3147h.isChecked()) {
            str = "account in (" + abd.m3792a(this.f5168a.f3146g.getText().toString()) + ")" + " and " + "payment_method" + "!=''" + " and " + "category" + "!='Income'";
        }
        if (this.f5168a.f3148i.isChecked()) {
            str = "account in (" + abd.m3792a(this.f5168a.f3146g.getText().toString()) + ")" + " and " + "payment_method" + "!=''" + " and " + "category" + "='Income'";
        }
        if (this.f5168a.f3148i.isChecked()) {
            str = "account in (" + abd.m3792a(this.f5168a.f3146g.getText().toString()) + ")" + " and " + "payment_method" + "!=''";
        }
        List a = abd.m3798a(this.f5168a.f3141b, str, "payment_method");
        this.f5168a.m3064a((String[]) a.toArray(new String[a.size()]), this.f5168a.f3153n);
    }
}
