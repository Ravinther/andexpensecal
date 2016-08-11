package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.ArrayList;
import java.util.Arrays;

class yl implements OnClickListener {
    final /* synthetic */ String f5486a;
    final /* synthetic */ ExpensePayList f5487b;

    yl(ExpensePayList expensePayList, String str) {
        this.f5487b = expensePayList;
        this.f5486a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ArrayList arrayList = new ArrayList(Arrays.asList(this.f5487b.f3366g.split(",")));
        arrayList.remove(this.f5486a);
        abd.m3811a(this.f5487b.f3364e, this.f5487b.f3371l, "expense_preference", this.f5487b.f3367h, aib.m3857a(arrayList, ","));
        this.f5487b.onCreate(null);
    }
}
