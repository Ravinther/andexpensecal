package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

class vg implements OnItemClickListener {
    final /* synthetic */ ExpenseMileageActivities f5363a;

    vg(ExpenseMileageActivities expenseMileageActivities) {
        this.f5363a = expenseMileageActivities;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String str = (String) ((Map) adapterView.getItemAtPosition(i)).get("dateRange");
        String[] split = str.split(" - ");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t, Locale.US);
            Date parse = simpleDateFormat.parse(split[0]);
            Date parse2 = simpleDateFormat.parse(split[1]);
            long time = parse.getTime();
            this.f5363a.f3264e = "expensed>=" + time + " and " + "expensed" + "<=" + parse2.getTime() + " and " + "account" + "='" + this.f5363a.f3262c + "'";
            Intent intent = new Intent(this.f5363a.f3263d, ExpenseMileageActivities.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f5363a.f3262c);
            bundle.putString("whereClause", this.f5363a.f3264e);
            bundle.putString("title", this.f5363a.f3262c + ": " + str);
            intent.putExtras(bundle);
            this.f5363a.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
