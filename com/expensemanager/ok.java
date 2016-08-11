package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.ArrayList;
import java.util.List;

class ok implements OnClickListener {
    final /* synthetic */ String[] f5086a;
    final /* synthetic */ ro f5087b;
    final /* synthetic */ ExpenseChartList f5088c;

    ok(ExpenseChartList expenseChartList, String[] strArr, ro roVar) {
        this.f5088c = expenseChartList;
        this.f5086a = strArr;
        this.f5087b = roVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        List arrayList = new ArrayList();
        String str = "category='" + this.f5086a[i] + "'" + " AND " + "account" + "='" + this.f5088c.f3069b + "'";
        boolean z = false;
        if ("All".equalsIgnoreCase(this.f5088c.f3069b)) {
            str = "category='" + this.f5086a[i] + "'" + " and " + "account" + " in (" + abd.m3792a(ExpenseManager.f3245u) + ")";
            z = true;
        }
        ExpenseChartList.m2991a(this.f5088c.f3068a, arrayList, abd.m3791a(this.f5087b, str, arrayList, z), "CATEGORY_VIEW", this.f5086a[i], this.f5088c.f3069b);
    }
}
