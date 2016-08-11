package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

class qs implements OnClickListener {
    final /* synthetic */ ExpenseCustomActivities f5192a;

    qs(ExpenseCustomActivities expenseCustomActivities) {
        this.f5192a = expenseCustomActivities;
    }

    public void onClick(View view) {
        String str = "";
        if (this.f5192a.f3147h.isChecked()) {
            str = "account in (" + abd.m3792a(this.f5192a.f3146g.getText().toString()) + ")" + " and " + "subcategory" + "!=''" + " and " + "category" + "!='Income'";
            String charSequence = this.f5192a.f3151l.getText().toString();
            if (!"".equals(charSequence)) {
                String str2 = "account in (" + abd.m3792a(this.f5192a.f3146g.getText().toString()) + ")" + " and " + "subcategory" + "!=''" + " and " + "category" + " IN ('";
                String[] split = charSequence.split(",");
                for (int i = 0; i < split.length; i++) {
                    str2 = i + 1 < split.length ? str2 + split[i] + "','" : str2 + split[i] + "'";
                }
                str = str2 + ")";
            }
        }
        if (this.f5192a.f3148i.isChecked()) {
            str = "account in (" + abd.m3792a(this.f5192a.f3146g.getText().toString()) + ")" + " and " + "subcategory" + "!=''" + " and " + "category" + "='Income'";
        }
        if (this.f5192a.f3149j.isChecked()) {
            str = "account in (" + abd.m3792a(this.f5192a.f3146g.getText().toString()) + ")" + " and " + "subcategory" + "!=''";
        }
        List a = abd.m3798a(this.f5192a.f3141b, str, "subcategory");
        this.f5192a.m3064a((String[]) a.toArray(new String[a.size()]), this.f5192a.f3152m);
    }
}
