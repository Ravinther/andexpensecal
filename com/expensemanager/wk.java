package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class wk implements OnClickListener {
    final /* synthetic */ ExpenseMileageSearch f5400a;

    wk(ExpenseMileageSearch expenseMileageSearch) {
        this.f5400a = expenseMileageSearch;
    }

    public void onClick(View view) {
        try {
            Intent intent = new Intent(this.f5400a.f3292c, ExpenseMileageActivities.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f5400a.f3304o);
            String d = this.f5400a.m3252a();
            DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t, Locale.US);
            Date parse = simpleDateFormat.parse(this.f5400a.f3296g.getText().toString());
            Date parse2 = simpleDateFormat.parse(this.f5400a.f3297h.getText().toString());
            DateFormat simpleDateFormat2 = new SimpleDateFormat(ExpenseManager.f3244t, Locale.US);
            String str = simpleDateFormat2.format(parse) + " - " + simpleDateFormat2.format(parse2);
            bundle.putString("whereClause", d);
            bundle.putString("activityDesc", str);
            intent.putExtras(bundle);
            this.f5400a.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
