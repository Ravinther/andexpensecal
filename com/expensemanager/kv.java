package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

class kv implements OnClickListener {
    final /* synthetic */ ArrayList f4910a;
    final /* synthetic */ String f4911b;
    final /* synthetic */ ExpenseBudgetAdd f4912c;

    kv(ExpenseBudgetAdd expenseBudgetAdd, ArrayList arrayList, String str) {
        this.f4912c = expenseBudgetAdd;
        this.f4910a = arrayList;
        this.f4911b = str;
    }

    public void onClick(View view) {
        this.f4912c.m2804a((String[]) this.f4910a.toArray(new String[this.f4910a.size()]), this.f4912c.f2895e, true, this.f4911b);
    }
}
