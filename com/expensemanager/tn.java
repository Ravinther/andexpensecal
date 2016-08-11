package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.ArrayList;
import java.util.Arrays;

class tn implements OnClickListener {
    final /* synthetic */ String f5299a;
    final /* synthetic */ ExpenseIncomeCategoryList f5300b;

    tn(ExpenseIncomeCategoryList expenseIncomeCategoryList, String str) {
        this.f5300b = expenseIncomeCategoryList;
        this.f5299a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ArrayList arrayList = new ArrayList(Arrays.asList(this.f5300b.f3230e.split(",")));
        arrayList.remove(this.f5299a);
        abd.m3811a(this.f5300b.f3228c, this.f5300b.f3231f, "expense_preference", "INCOME_CATEGORY_LIST", aib.m3857a(arrayList, ","));
        this.f5300b.onCreate(null);
    }
}
