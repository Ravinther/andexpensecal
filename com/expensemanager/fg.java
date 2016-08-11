package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Map;

class fg implements OnItemClickListener {
    final /* synthetic */ ExpenseAccountActivities f4634a;

    fg(ExpenseAccountActivities expenseAccountActivities) {
        this.f4634a = expenseAccountActivities;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String str = (String) ((Map) adapterView.getItemAtPosition(i)).get("dateRange");
        String[] split = str.split(" - ");
        try {
            long c = abd.m3818c(split[0]);
            long d = abd.m3820d(split[1]);
            this.f4634a.f2713i = "expensed>=" + c + " and " + "expensed" + "<=" + d + " and " + "account" + "='" + this.f4634a.f2711g + "'";
            if ("All".equals(this.f4634a.f2711g)) {
                this.f4634a.f2713i = "expensed>=" + c + " and " + "expensed" + "<=" + d + " AND " + "category" + "!='Account Transfer' " + " AND " + "subcategory" + "!='Account Transfer' ";
            }
            Intent intent = new Intent(this.f4634a.f2712h, ExpenseAccountActivities.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f4634a.f2711g);
            bundle.putString("whereClause", this.f4634a.f2713i);
            bundle.putString("title", this.f4634a.f2711g + ": " + str);
            intent.putExtras(bundle);
            this.f4634a.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
