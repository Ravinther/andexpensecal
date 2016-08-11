package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

class ol implements OnClickListener {
    final /* synthetic */ SharedPreferences f5089a;
    final /* synthetic */ ExpenseChartList f5090b;

    ol(ExpenseChartList expenseChartList, SharedPreferences sharedPreferences) {
        this.f5090b = expenseChartList;
        this.f5089a = sharedPreferences;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Editor edit = this.f5089a.edit();
        edit.putInt("CHART_THEME", i);
        edit.commit();
    }
}
