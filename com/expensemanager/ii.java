package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

class ii implements OnItemClickListener {
    final /* synthetic */ ExpenseAccountSummaryTime f4795a;

    ii(ExpenseAccountSummaryTime expenseAccountSummaryTime) {
        this.f4795a = expenseAccountSummaryTime;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Map map = (Map) adapterView.getItemAtPosition(i);
        String str = (String) map.get("date");
        String replace = str != null ? str.replace("'", "''") : str;
        try {
            String str2;
            Date parse;
            Calendar instance;
            String str3 = "";
            str = "";
            if (this.f4795a.f2806n.getSelectedItemPosition() == 0) {
                String[] split = ((String) map.get("dateRange")).split(" - ");
                str = split[0];
                str2 = split[1];
            } else {
                str2 = str;
                str = str3;
            }
            if (this.f4795a.f2806n.getSelectedItemPosition() == 1) {
                str2 = replace + "-" + ExpenseManager.f3242r;
                parse = new SimpleDateFormat("yyyy-MM-dd").parse(str2);
                str = aib.m3867b(str2, "yyyy-MM-dd", ExpenseManager.f3244t);
                instance = Calendar.getInstance();
                instance.setTimeInMillis(parse.getTime());
                instance.add(2, 1);
                instance.add(5, -1);
                str2 = aba.m3749a(instance.getTimeInMillis(), ExpenseManager.f3244t);
            }
            if (this.f4795a.f2806n.getSelectedItemPosition() == 2) {
                str2 = replace + "-" + (ExpenseManager.f3241q + 1) + "-" + ExpenseManager.f3242r;
                parse = new SimpleDateFormat("yyyy-DD-dd").parse(str2);
                str = aib.m3867b(str2, "yyyy-MM-dd", ExpenseManager.f3244t);
                instance = Calendar.getInstance();
                instance.setTimeInMillis(parse.getTime());
                instance.add(1, 1);
                instance.add(5, -1);
                str2 = aba.m3749a(instance.getTimeInMillis(), ExpenseManager.f3244t);
            }
            str3 = (this.f4795a.f2797e + " AND " + "expensed" + ">=" + abd.m3818c(str)) + " AND " + "expensed" + "<=" + abd.m3820d(str2);
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this.f4795a.f2803k, ExpenseAccountExpandableList.class);
            bundle.putString("title", str + " - " + str2);
            bundle.putString("account", this.f4795a.f2804l.getText().toString());
            bundle.putString("whereClause", str3);
            bundle.putInt("highlightId", 1);
            intent.putExtras(bundle);
            this.f4795a.startActivityForResult(intent, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
