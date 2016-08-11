package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

class mf implements OnClickListener {
    final /* synthetic */ ArrayList f4968a;
    final /* synthetic */ ExpenseBudgetOnetimeAdd f4969b;

    mf(ExpenseBudgetOnetimeAdd expenseBudgetOnetimeAdd, ArrayList arrayList) {
        this.f4969b = expenseBudgetOnetimeAdd;
        this.f4968a = arrayList;
    }

    public void onClick(View view) {
        this.f4969b.m2874a((String[]) this.f4968a.toArray(new String[this.f4968a.size()]), this.f4969b.f2958e, true);
    }
}
