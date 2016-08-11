package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

class ru implements OnItemClickListener {
    final /* synthetic */ ExpenseDetails f5232a;

    ru(ExpenseDetails expenseDetails) {
        this.f5232a = expenseDetails;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Map map = (Map) adapterView.getItemAtPosition(i);
        if (this.f5232a.f3180H.equalsIgnoreCase("DATE_VIEW")) {
            this.f5232a.f3206v.setCurrentTab(0);
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(aba.m3744a((String) map.get("expenseDate"), ExpenseManager.f3244t, Locale.US));
            this.f5232a.f3210z = instance.get(1);
            this.f5232a.f3173A = instance.get(2);
            this.f5232a.f3174B = instance.get(5);
            this.f5232a.m3113b();
            return;
        }
        this.f5232a.m3117b((String) map.get("category"));
    }
}
