package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

class qq implements OnClickListener {
    final /* synthetic */ ExpenseCustomActivities f5190a;

    qq(ExpenseCustomActivities expenseCustomActivities) {
        this.f5190a = expenseCustomActivities;
    }

    public void onClick(View view) {
        String str = "";
        if (this.f5190a.f3147h.isChecked()) {
            str = "account in (" + abd.m3792a(this.f5190a.f3146g.getText().toString()) + ")" + " and " + "property" + "!=''" + " and " + "category" + "!='Income'";
        }
        if (this.f5190a.f3148i.isChecked()) {
            str = "account in (" + abd.m3792a(this.f5190a.f3146g.getText().toString()) + ")" + " and " + "property" + "!=''" + " and " + "category" + "='Income'";
        }
        if (this.f5190a.f3149j.isChecked()) {
            str = "account in (" + abd.m3792a(this.f5190a.f3146g.getText().toString()) + ")" + " and " + "property" + "!=''";
        }
        List a = abd.m3798a(this.f5190a.f3141b, str, "property");
        this.f5190a.m3064a((String[]) a.toArray(new String[a.size()]), this.f5190a.f3150k);
    }
}
