package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

class qi implements OnClickListener {
    final /* synthetic */ ExpenseCustomActivities f5174a;

    qi(ExpenseCustomActivities expenseCustomActivities) {
        this.f5174a = expenseCustomActivities;
    }

    public void onClick(View view) {
        try {
            String str;
            Intent intent = new Intent(this.f5174a.f3143d, ExpenseAccountActivities.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f5174a.f3138A);
            String str2 = "account in (" + abd.m3792a(this.f5174a.f3146g.getText().toString()) + ")";
            String str3 = str2 + " and " + "expensed" + ">=" + abd.m3818c(this.f5174a.f3144e.getText().toString()) + " and " + "expensed" + "<=" + abd.m3820d(this.f5174a.f3145f.getText().toString());
            str2 = "Both";
            if (this.f5174a.f3147h.isChecked()) {
                str3 = str3 + " and " + "category" + "!='Income'";
                str2 = "Expense";
            }
            if (this.f5174a.f3148i.isChecked()) {
                str = "Income";
                str2 = str3 + " and " + "category" + "='Income'";
            } else {
                str = str2;
                str2 = str3;
            }
            String charSequence = this.f5174a.f3153n.getText().toString();
            if (!(charSequence == null || "".equals(charSequence))) {
                str2 = str2 + " and " + "payment_method" + " in (" + abd.m3792a(charSequence.trim()) + ")";
            }
            str3 = this.f5174a.f3154o.getText().toString();
            if (!(str3 == null || "".equals(str3))) {
                str2 = str2 + " and " + "status" + " in (" + abd.m3792a(str3.trim()) + ")";
            }
            str3 = this.f5174a.f3155p.getText().toString();
            if (!(str3 == null || "".equals(str3))) {
                str2 = str2 + " and " + " (" + ExpenseCustomActivities.m3061a("expense_tag", str3) + ")";
            }
            if (this.f5174a.f3159t.isChecked()) {
                str2 = str2 + " and " + "tax" + "!=''";
            }
            String obj = this.f5174a.f3158s.getText().toString();
            if (!(obj == null || obj.equals(""))) {
                str3 = obj.trim();
                if (str3.indexOf(".") != -1) {
                    str3 = str3.substring(0, str3.indexOf("."));
                }
                str2 = str2 + " and (" + "amount" + "='" + obj.trim() + "' or " + "amount" + "='" + str3 + "' or " + "amount" + " LIKE '" + str3 + ".%')";
            }
            obj = this.f5174a.f3157r.getText().toString();
            if (!(obj == null || obj.equals(""))) {
                str2 = str2 + " and LOWER(" + "reference_number" + ") LIKE '%" + obj.replaceAll("'", "''") + "%'";
            }
            String obj2 = this.f5174a.f3156q.getText().toString();
            if (!(obj2 == null || obj2.equals(""))) {
                str2 = str2 + " and LOWER(" + "description" + ") LIKE '%" + obj2.trim().toLowerCase().replaceAll("'", "''") + "%'";
            }
            String charSequence2 = this.f5174a.f3151l.getText().toString();
            if (!(charSequence2 == null || "".endsWith(charSequence2))) {
                str2 = str2 + " and " + "category" + " in (" + abd.m3792a(charSequence2.trim()) + ")";
            }
            String charSequence3 = this.f5174a.f3152m.getText().toString();
            if (!(charSequence3 == null || "".endsWith(charSequence3))) {
                str2 = str2 + " and " + "subcategory" + " in (" + abd.m3792a(charSequence3.trim()) + ")";
            }
            String charSequence4 = this.f5174a.f3150k.getText().toString();
            str3 = (charSequence4 == null || "".endsWith(charSequence4)) ? str2 : str2 + " and " + "property" + " in(" + abd.m3792a(charSequence4.trim()) + ")";
            DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t, Locale.US);
            str2 = str + ": " + simpleDateFormat.format(simpleDateFormat.parse(this.f5174a.f3144e.getText().toString())) + " - " + simpleDateFormat.format(simpleDateFormat.parse(this.f5174a.f3145f.getText().toString()));
            if (!"".equalsIgnoreCase(charSequence4)) {
                str2 = str2 + "," + charSequence4;
            }
            if (!"".equalsIgnoreCase(charSequence2)) {
                str2 = str2 + "," + charSequence2;
            }
            if (!"".equalsIgnoreCase(charSequence3)) {
                str2 = str2 + "," + charSequence3;
            }
            if (!"".equalsIgnoreCase(charSequence)) {
                str2 = str2 + "," + charSequence;
            }
            if (!"".equalsIgnoreCase(obj)) {
                str2 = str2 + "," + obj;
            }
            if (!"".equalsIgnoreCase(obj2)) {
                str2 = str2 + "," + obj2;
            }
            bundle.putBoolean("isTaxOnly", this.f5174a.f3159t.isChecked());
            bundle.putString("whereClause", str3);
            bundle.putString("activityDesc", str2);
            intent.putExtras(bundle);
            this.f5174a.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
