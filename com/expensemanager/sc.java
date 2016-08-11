package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

class sc implements OnItemClickListener {
    final /* synthetic */ ExpenseDetails f5247a;

    sc(ExpenseDetails expenseDetails) {
        this.f5247a = expenseDetails;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Map map = (Map) adapterView.getItemAtPosition(i);
        if (this.f5247a.f3181I.equalsIgnoreCase("DATE_VIEW")) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(aba.m3744a((String) map.get("expenseDate"), ExpenseManager.f3244t, Locale.US));
            this.f5247a.f3210z = instance.get(1);
            this.f5247a.f3173A = instance.get(2);
            this.f5247a.f3174B = instance.get(5);
            this.f5247a.f3206v.setCurrentTab(0);
            this.f5247a.m3113b();
            return;
        }
        this.f5247a.m3122c((String) map.get("category"));
    }
}
