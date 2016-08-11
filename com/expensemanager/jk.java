package com.expensemanager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class jk implements OnClickListener {
    final /* synthetic */ SharedPreferences f4841a;
    final /* synthetic */ ExpenseActivitiesDefault f4842b;

    jk(ExpenseActivitiesDefault expenseActivitiesDefault, SharedPreferences sharedPreferences) {
        this.f4842b = expenseActivitiesDefault;
        this.f4841a = sharedPreferences;
    }

    public void onClick(View view) {
        int i = 1;
        int i2 = 2;
        try {
            String string;
            String string2;
            Calendar instance;
            String str;
            String str2 = "";
            String string3 = this.f4842b.getResources().getString(2131100155);
            long a = aib.m3847a();
            if (this.f4842b.f2843f.isChecked()) {
                str2 = "expensed<=" + a;
                string3 = this.f4842b.getResources().getString(2131100155);
            }
            if (this.f4842b.f2844g.isChecked()) {
                string3 = aba.m3771c(0, this.f4842b.f2858u, 0);
                string = this.f4842b.getResources().getString(2131100126);
            } else {
                i = 0;
                string = string3;
                string3 = str2;
            }
            if (this.f4842b.f2845h.isChecked()) {
                Calendar instance2 = Calendar.getInstance();
                instance2.set(6, 1);
                string = "expensed>=" + aib.m3848a(instance2) + " and " + "expensed" + "<=" + a;
                string2 = this.f4842b.getResources().getString(2131100175);
            } else {
                i2 = i;
                string2 = string;
                string = string3;
            }
            if (this.f4842b.f2846i.isChecked()) {
                instance = Calendar.getInstance();
                instance.add(2, -1);
                string = "expensed>=" + aib.m3848a(instance) + " and " + "expensed" + "<=" + a;
                i2 = 3;
                string2 = this.f4842b.getResources().getString(2131100000);
            }
            if (this.f4842b.f2847j.isChecked()) {
                i2 = 4;
                DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t, Locale.US);
                Date parse = simpleDateFormat.parse(this.f4842b.f2841d.getText().toString());
                Date parse2 = simpleDateFormat.parse(this.f4842b.f2842e.getText().toString());
                a = abd.m3818c(this.f4842b.f2841d.getText().toString());
                long d = abd.m3820d(this.f4842b.f2842e.getText().toString());
                string2 = simpleDateFormat.format(parse) + " - " + simpleDateFormat.format(parse2);
                string = "expensed>=" + a + " and " + "expensed" + "<=" + d;
            }
            if (this.f4842b.f2848k.isChecked()) {
                instance = Calendar.getInstance();
                if (instance.get(5) < ExpenseManager.f3242r) {
                    instance.add(2, -1);
                }
                instance.set(5, ExpenseManager.f3242r);
                long a2 = aib.m3848a(instance);
                instance.add(2, 1);
                instance.set(11, 0);
                instance.set(12, 0);
                instance.set(13, 0);
                str = "expensed>=" + a2 + " and " + "expensed" + "<" + instance.getTimeInMillis();
                string2 = this.f4842b.getResources().getString(2131100119);
                i2 = 5;
            } else {
                str = string;
            }
            string = this.f4842b.f2849l.getText().toString();
            if (!(string == null || "".endsWith(string))) {
                str = str + " and " + "status" + " in (" + abd.m3792a(string.trim()) + ")";
            }
            if (!("All".equals(this.f4842b.f2858u) || this.f4842b.f2844g.isChecked())) {
                str = "account='" + this.f4842b.f2858u + "' and " + str;
            }
            Editor edit = this.f4841a.edit();
            edit.putInt(this.f4842b.f2858u + "_" + "ACTIVITY_DEFAULT_DATE", i2);
            edit.putString(this.f4842b.f2858u + "_" + "ACTIVITY_DEFAULT_STATUS", this.f4842b.f2849l.getText().toString());
            edit.putString(this.f4842b.f2858u + "_" + "ACTIVITY_DEFAULT_STATUS_HIGHLIGHT", this.f4842b.f2850m.getText().toString());
            if (this.f4842b.f2847j.isChecked()) {
                edit.putString(this.f4842b.f2858u + "_" + "ACTIVITY_DEFAULT_FROM_DATE", this.f4842b.f2841d.getText().toString());
                edit.putString(this.f4842b.f2858u + "_" + "ACTIVITY_DEFAULT_TO_DATE", this.f4842b.f2842e.getText().toString());
            }
            edit.putString(this.f4842b.f2858u + "_whereClause", str);
            edit.putString(this.f4842b.f2858u + "_activityDesc", string2);
            edit.putBoolean("transaction_time", this.f4842b.f2851n.isChecked());
            edit.commit();
            Intent intent = new Intent(this.f4842b.f2840c, ExpenseAccountActivities.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f4842b.f2858u);
            bundle.putString("whereClause", str);
            bundle.putString("activityDesc", string2);
            intent.putExtras(bundle);
            this.f4842b.setResult(-1, intent);
            this.f4842b.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
