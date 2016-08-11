package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

class ia implements OnClickListener {
    final /* synthetic */ String[] f4782a;
    final /* synthetic */ ArrayList f4783b;
    final /* synthetic */ ExpenseAccountSummaryTime f4784c;

    ia(ExpenseAccountSummaryTime expenseAccountSummaryTime, String[] strArr, ArrayList arrayList) {
        this.f4784c = expenseAccountSummaryTime;
        this.f4782a = strArr;
        this.f4783b = arrayList;
    }

    public void onClick(View view) {
        String[] split = this.f4784c.f2804l.getText().toString().split(",");
        boolean[] zArr = new boolean[this.f4782a.length];
        for (int i = 0; i < split.length; i++) {
            if (this.f4783b.contains(split[i])) {
                zArr[this.f4783b.indexOf(split[i])] = true;
            }
        }
        Builder builder = new Builder(this.f4784c.f2803k);
        builder.setTitle(2131100026);
        builder.setMultiChoiceItems(this.f4782a, zArr, new ib(this, zArr));
        builder.setPositiveButton(2131099983, new ic(this, zArr));
        builder.setNegativeButton(2131099754, new id(this));
        builder.show();
    }
}
