package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

class cv implements OnClickListener {
    final /* synthetic */ Map f4449a;
    final /* synthetic */ cu f4450b;

    cv(cu cuVar, Map map) {
        this.f4450b = cuVar;
        this.f4449a = map;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str;
        if (i == 0) {
            str = (String) this.f4449a.get("date");
            try {
                Date parse = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(str.split(" - ")[0]);
                Calendar instance = Calendar.getInstance();
                instance.setTime(parse);
                long timeInMillis = instance.getTimeInMillis();
                instance.add(2, 1);
                instance.add(5, -1);
                instance.set(11, 23);
                instance.set(12, 59);
                instance.set(13, 59);
                instance.set(14, 999);
                String str2 = "expensed>=" + timeInMillis + " and " + "expensed" + "<" + instance.getTimeInMillis() + " and " + "category" + "!='Income'" + " and " + "account" + "='" + this.f4450b.f4448a.f4447e + "'";
                Intent intent = new Intent(this.f4450b.f4448a.m315i(), ExpenseAccountActivities.class);
                Bundle bundle = new Bundle();
                bundle.putString("account", this.f4450b.f4448a.f4447e);
                bundle.putString("whereClause", str2);
                bundle.putString("title", str);
                intent.putExtras(bundle);
                this.f4450b.f4448a.m281a(intent, 1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (i == 1) {
            str = aib.m3852a(this.f4449a.get("balance"));
            str = (str.startsWith("-") ? str.replace("-", "") : "").replace("(", "").replace(")", "").replace(",", "");
            Bundle bundle2 = new Bundle();
            intent = new Intent();
            bundle2.putString("toAccount", this.f4450b.f4448a.f4447e);
            bundle2.putString("amount", str);
            intent.putExtras(bundle2);
            intent.setClass(this.f4450b.f4448a.m315i(), ExpenseAccountTransfer.class);
            this.f4450b.f4448a.m281a(intent, 2);
        }
    }
}
