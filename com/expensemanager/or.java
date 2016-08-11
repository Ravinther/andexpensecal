package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

class or implements OnClickListener {
    final /* synthetic */ String[] f5097a;
    final /* synthetic */ ArrayList f5098b;
    final /* synthetic */ ExpenseChartPeriod f5099c;

    or(ExpenseChartPeriod expenseChartPeriod, String[] strArr, ArrayList arrayList) {
        this.f5099c = expenseChartPeriod;
        this.f5097a = strArr;
        this.f5098b = arrayList;
    }

    public void onClick(View view) {
        String[] split = this.f5099c.f3094i.getText().toString().split(",");
        boolean[] zArr = new boolean[this.f5097a.length];
        for (int i = 0; i < split.length; i++) {
            if (this.f5098b.contains(split[i])) {
                zArr[this.f5098b.indexOf(split[i])] = true;
            }
        }
        Builder builder = new Builder(this.f5099c.f3091f);
        builder.setTitle(2131100026);
        builder.setMultiChoiceItems(this.f5097a, zArr, new os(this, zArr));
        builder.setPositiveButton(2131099983, new ot(this, zArr));
        builder.setNegativeButton(2131099754, new ou(this));
        builder.show();
    }
}
