package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Calendar;

class gb implements OnItemClickListener {
    final /* synthetic */ fu f4687a;

    gb(fu fuVar) {
        this.f4687a = fuVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String str = "";
        if (i == 0) {
            Calendar instance = Calendar.getInstance();
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            long timeInMillis = instance.getTimeInMillis();
            instance.set(11, 23);
            instance.set(12, 59);
            instance.set(13, 59);
            instance.set(14, 999);
            str = "expensed>=" + timeInMillis + " AND " + "expensed" + "<=" + instance.getTimeInMillis() + " AND " + "category" + "!='" + "Income" + "'";
        }
        if (i == 1) {
            str = aba.m3747a(0, "", 2).replace(" AND account=''", "");
        }
        if (i == 2) {
            str = aba.m3764b(0, "", 2).replace(" AND account=''", "");
        }
        if (i == 3) {
            str = aba.m3771c(0, "", 2).replace(" AND account=''", "");
        }
        str = str + " AND " + "account" + " in (" + abd.m3792a(this.f4687a.f4665e) + ")";
        if ("YES".equalsIgnoreCase(ExpenseAccountGroup.f2735r)) {
            str = str + " AND  (" + "category" + "!='Account Transfer' " + " OR " + "subcategory" + "!='Account Transfer' )";
        }
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.f4687a.m315i(), ExpenseAccountExpandableList.class);
        bundle.putString("title", this.f4687a.m315i().getTitle().toString());
        bundle.putString("account", this.f4687a.f4665e);
        bundle.putString("whereClause", str);
        intent.putExtras(bundle);
        this.f4687a.m281a(intent, 0);
    }
}
