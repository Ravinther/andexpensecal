package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

/* renamed from: com.expensemanager.k */
class C0451k implements OnClickListener {
    final /* synthetic */ String[] f4866a;
    final /* synthetic */ ArrayList f4867b;
    final /* synthetic */ ChartNewCustom f4868c;

    C0451k(ChartNewCustom chartNewCustom, String[] strArr, ArrayList arrayList) {
        this.f4868c = chartNewCustom;
        this.f4866a = strArr;
        this.f4867b = arrayList;
    }

    public void onClick(View view) {
        String[] split = this.f4868c.f2446i.getText().toString().split(",");
        boolean[] zArr = new boolean[this.f4866a.length];
        for (int i = 0; i < split.length; i++) {
            if (this.f4867b.contains(split[i])) {
                zArr[this.f4867b.indexOf(split[i])] = true;
            }
        }
        Builder builder = new Builder(this.f4868c.f2443f);
        builder.setTitle(2131100026);
        builder.setMultiChoiceItems(this.f4866a, zArr, new C0452l(this, zArr));
        builder.setPositiveButton(2131099983, new C0453m(this, zArr));
        builder.setNegativeButton(2131099754, new C0454n(this));
        builder.show();
    }
}
