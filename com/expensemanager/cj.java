package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import com.github.mikephil.charting.p032f.C0393c;
import com.github.mikephil.charting.p039h.C0538d;
import com.github.mikephil.charting.p040d.C0505h;

class cj implements C0393c {
    final /* synthetic */ String f4420a;
    final /* synthetic */ ci f4421b;

    cj(ci ciVar, String str) {
        this.f4421b = ciVar;
        this.f4420a = str;
    }

    public void m4021a() {
    }

    public void m4022a(C0505h c0505h, int i, C0538d c0538d) {
        if (c0505h != null && ((double) c0505h.m4530c()) != 0.0d) {
            String b = this.f4421b.f4419e.m4370b(c0505h.m4529b());
            String i2 = ChartNewSummary.f2579P;
            if ("Income".equals(ChartNewSummary.f2579P)) {
                i2 = "subcategory";
            }
            i2 = this.f4420a + " AND " + i2 + "='" + b + "'";
            if ("subcategory".equals(ChartNewSummary.f2579P)) {
                String[] split = b.split(":");
                i2 = this.f4420a + " AND " + "category" + "='" + split[0] + "'";
                if (split.length > 1) {
                    i2 = i2 + " AND " + "subcategory" + "='" + split[1] + "'";
                }
            }
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this.f4421b.m315i(), ExpenseAccountExpandableList.class);
            bundle.putString("title", this.f4421b.m315i().getIntent().getStringExtra("title"));
            bundle.putString("account", ChartNewSummary.f2576E.getText().toString());
            bundle.putString("whereClause", i2);
            bundle.putInt("highlightId", 1);
            intent.putExtras(bundle);
            this.f4421b.m281a(intent, 1);
        }
    }
}
