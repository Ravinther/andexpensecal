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

class vf implements OnItemClickListener {
    final /* synthetic */ ExpenseMileageActivities f5362a;

    vf(ExpenseMileageActivities expenseMileageActivities) {
        this.f5362a = expenseMileageActivities;
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
            this.f5362a.f3264e = "expensed>=" + timeInMillis + " and " + "expensed" + "<" + instance2.getTimeInMillis() + " and " + "account" + "='" + this.f5362a.f3262c + "'";
            Intent intent = new Intent(this.f5362a.f3263d, ExpenseMileageActivities.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f5362a.f3262c);
            bundle.putString("whereClause", this.f5362a.f3264e);
            bundle.putString("title", this.f5362a.f3262c + ": " + str);
            intent.putExtras(bundle);
            this.f5362a.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
