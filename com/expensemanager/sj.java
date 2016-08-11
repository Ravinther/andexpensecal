package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Map;

class sj implements OnItemClickListener {
    final /* synthetic */ ExpenseDetails f5257a;

    sj(ExpenseDetails expenseDetails) {
        this.f5257a = expenseDetails;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Map map = (Map) adapterView.getItemAtPosition(i);
        if (this.f5257a.f3182J.equalsIgnoreCase("DATE_VIEW")) {
            this.f5257a.f3206v.setCurrentTab(2);
            this.f5257a.f3192g = (TextView) this.f5257a.findViewById(2131558745);
            this.f5257a.f3192g.setText((String) map.get("expenseDate"));
            int i2 = Calendar.getInstance().get(2);
            if (Calendar.getInstance().get(2) < ExpenseManager.f3241q) {
                this.f5257a.f3178F = (((this.f5257a.f3179G * 12) + i) - i2) - (12 - ExpenseManager.f3241q);
            } else {
                this.f5257a.f3178F = (((this.f5257a.f3179G * 12) + i) - i2) + ExpenseManager.f3241q;
            }
            this.f5257a.m3128e();
            return;
        }
        this.f5257a.m3127d((String) map.get("category"));
    }
}
