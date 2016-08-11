package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

class ff implements OnItemClickListener {
    final /* synthetic */ ExpenseAccountActivities f4633a;

    ff(ExpenseAccountActivities expenseAccountActivities) {
        this.f4633a = expenseAccountActivities;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String str = ((String) ((Map) adapterView.getItemAtPosition(i)).get("date")) + "-01";
        try {
            Date parse = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(str);
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            instance.set(5, ExpenseManager.f3242r);
            long timeInMillis = instance.getTimeInMillis();
            Calendar instance2 = Calendar.getInstance();
            instance2.setTime(parse);
            instance2.add(2, 1);
            instance2.set(5, ExpenseManager.f3242r);
            instance2.add(5, -1);
            instance2.set(11, 23);
            instance2.set(12, 59);
            instance2.set(13, 59);
            instance2.set(14, 999);
            long timeInMillis2 = instance2.getTimeInMillis();
            this.f4633a.f2713i = "expensed>=" + timeInMillis + " and " + "expensed" + "<" + timeInMillis2 + " and " + "account" + "='" + this.f4633a.f2711g + "'";
            if ("All".equals(this.f4633a.f2711g)) {
                this.f4633a.f2713i = "expensed>=" + timeInMillis + " and " + "expensed" + "<" + timeInMillis2 + " AND " + "category" + "!='Account Transfer' " + " AND " + "subcategory" + "!='Account Transfer' ";
            }
            Intent intent = new Intent(this.f4633a.f2712h, ExpenseAccountActivities.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f4633a.f2711g);
            bundle.putString("whereClause", this.f4633a.f2713i);
            bundle.putString("title", this.f4633a.f2711g + ": " + str);
            intent.putExtras(bundle);
            this.f4633a.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
