package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

class az implements OnClickListener {
    final /* synthetic */ String[] f4230a;
    final /* synthetic */ ArrayList f4231b;
    final /* synthetic */ ChartNewPeriod f4232c;

    az(ChartNewPeriod chartNewPeriod, String[] strArr, ArrayList arrayList) {
        this.f4232c = chartNewPeriod;
        this.f4230a = strArr;
        this.f4231b = arrayList;
    }

    public void onClick(View view) {
        String[] split = this.f4232c.f2542i.getText().toString().split(",");
        boolean[] zArr = new boolean[this.f4230a.length];
        for (int i = 0; i < split.length; i++) {
            if (this.f4231b.contains(split[i])) {
                zArr[this.f4231b.indexOf(split[i])] = true;
            }
        }
        Builder builder = new Builder(this.f4232c.f2539f);
        builder.setTitle(2131100026);
        builder.setMultiChoiceItems(this.f4230a, zArr, new ba(this, zArr));
        builder.setPositiveButton(2131099983, new bb(this, zArr));
        builder.setNegativeButton(2131099754, new bc(this));
        builder.show();
    }
}
