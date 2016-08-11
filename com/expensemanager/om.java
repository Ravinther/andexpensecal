package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

class om implements OnClickListener {
    final /* synthetic */ SharedPreferences f5091a;
    final /* synthetic */ ExpenseChartList f5092b;

    om(ExpenseChartList expenseChartList, SharedPreferences sharedPreferences) {
        this.f5092b = expenseChartList;
        this.f5091a = sharedPreferences;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Editor edit = this.f5091a.edit();
        edit.remove("CHART_THEME");
        edit.commit();
    }
}
