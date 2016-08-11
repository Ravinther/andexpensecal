package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import com.github.mikephil.charting.p032f.C0393c;
import com.github.mikephil.charting.p039h.C0538d;
import com.github.mikephil.charting.p040d.C0505h;
import java.util.Calendar;
import java.util.Locale;

class at implements C0393c {
    final /* synthetic */ String f4222a;
    final /* synthetic */ as f4223b;

    at(as asVar, String str) {
        this.f4223b = asVar;
        this.f4222a = str;
    }

    public void m3892a() {
    }

    public void m3893a(C0505h c0505h, int i, C0538d c0538d) {
        if (c0505h != null && ((double) c0505h.m4530c()) != 0.0d) {
            String b = this.f4223b.f4220c.m4370b(c0505h.m4529b());
            String str = "";
            if (ChartNewDate.f2478D.isChecked()) {
                str = aba.m3757a("EEE yy-MM-dd", ExpenseManager.f3244t, b);
            }
            if (ChartNewDate.f2479E.isChecked()) {
                str = aba.m3757a("yy-MM-dd", ExpenseManager.f3244t, b);
            }
            str = (this.f4222a + " AND " + "expensed" + ">=" + abd.m3818c(str)) + " AND " + "expensed" + "<=" + abd.m3820d(str);
            if (ChartNewDate.f2480F.isChecked()) {
                str = aba.m3757a("yy-MM", ExpenseManager.f3244t, b + "-" + ExpenseManager.f3242r);
                b = this.f4222a + " AND " + "expensed" + ">=" + abd.m3818c(str);
                long a = aba.m3744a(str, ExpenseManager.f3244t, Locale.US);
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(a);
                instance.add(2, 1);
                str = b + " AND " + "expensed" + "<" + instance.getTimeInMillis();
            }
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this.f4223b.m315i(), ExpenseAccountExpandableList.class);
            bundle.putString("title", this.f4223b.m315i().getIntent().getStringExtra("title"));
            bundle.putString("account", ChartNewDate.f2476B.getText().toString());
            bundle.putString("whereClause", str);
            bundle.putInt("highlightId", 1);
            intent.putExtras(bundle);
            this.f4223b.m281a(intent, 1);
        }
    }
}
