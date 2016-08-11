package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

class na implements OnClickListener {
    final /* synthetic */ String[] f5010a;
    final /* synthetic */ ArrayList f5011b;
    final /* synthetic */ ExpenseChartCustom f5012c;

    na(ExpenseChartCustom expenseChartCustom, String[] strArr, ArrayList arrayList) {
        this.f5012c = expenseChartCustom;
        this.f5010a = strArr;
        this.f5011b = arrayList;
    }

    public void onClick(View view) {
        String[] split = this.f5012c.f3024i.getText().toString().split(",");
        boolean[] zArr = new boolean[this.f5010a.length];
        for (int i = 0; i < split.length; i++) {
            if (this.f5011b.contains(split[i])) {
                zArr[this.f5011b.indexOf(split[i])] = true;
            }
        }
        Builder builder = new Builder(this.f5012c.f3021f);
        builder.setTitle(2131100026);
        builder.setMultiChoiceItems(this.f5010a, zArr, new nb(this, zArr));
        builder.setPositiveButton(2131099983, new nc(this, zArr));
        builder.setNegativeButton(2131099754, new nd(this));
        builder.show();
    }
}
