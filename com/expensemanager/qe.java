package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.List;

class qe implements OnClickListener {
    final /* synthetic */ ExpenseCustomActivities f5170a;

    qe(ExpenseCustomActivities expenseCustomActivities) {
        this.f5170a = expenseCustomActivities;
    }

    public void onClick(View view) {
        List a = abd.m3798a(this.f5170a.f3141b, "account in (" + abd.m3792a(this.f5170a.f3146g.getText().toString()) + ")", "expense_tag");
        List arrayList = new ArrayList();
        for (int i = 0; i < a.size(); i++) {
            String str = (String) a.get(i);
            if (!(str == null || "".equals(str))) {
                String[] split = str.split(",");
                for (int i2 = 0; i2 < split.length; i2++) {
                    if (!arrayList.contains(split[i2])) {
                        arrayList.add(split[i2].trim());
                    }
                }
            }
        }
        this.f5170a.m3064a((String[]) arrayList.toArray(new String[arrayList.size()]), this.f5170a.f3155p);
    }
}
