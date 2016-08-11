package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.HashMap;
import java.util.Map;

class hz implements OnItemClickListener {
    final /* synthetic */ int f4779a;
    final /* synthetic */ hy f4780b;

    hz(hy hyVar, int i) {
        this.f4780b = hyVar;
        this.f4779a = i;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String str = (String) ((Map) adapterView.getItemAtPosition(i)).get("name");
        String replace = str != null ? str.replace("'", "''") : str;
        try {
            String str2;
            str = "account in (" + abd.m3792a(ExpenseAccountSummary.f2780y.getText().toString()) + ")";
            if ("Income".equalsIgnoreCase(ExpenseAccountSummary.f2771G)) {
                str2 = str + " AND " + "subcategory" + "='" + replace + "' AND " + "category" + "='Income'";
            } else if (ExpenseAccountSummary.f2778v == 9) {
                str2 = str + " AND " + "expense_tag" + "='" + replace + "' AND " + "category" + "='Income'";
            } else if (ExpenseAccountSummary.f2778v == 10) {
                str2 = str + " AND " + "property" + "='" + replace + "' AND " + "category" + "='Income'";
            } else if ("subcategory".equalsIgnoreCase(ExpenseAccountSummary.f2771G)) {
                String[] split = replace.split(":");
                if (split.length > 0) {
                    str = str + " AND " + "category" + "='" + split[0] + "'";
                }
                if (split.length > 1 && !"".equals(split[1].trim())) {
                    str = str + " AND " + "subcategory" + "='" + split[1] + "'";
                }
                str2 = str;
            } else {
                str2 = str + " AND " + ExpenseAccountSummary.f2771G + "='" + replace + "' AND " + "category" + "!='Income' ";
            }
            HashMap hashMap = (HashMap) ExpenseAccountSummary.f2774q.get(this.f4779a);
            String str3 = (String) hashMap.get("fromDate");
            str = (String) hashMap.get("toDate");
            str2 = (str2 + " AND " + "expensed" + ">=" + abd.m3818c(str3)) + " AND " + "expensed" + "<=" + abd.m3820d(str);
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this.f4780b.m315i(), ExpenseAccountExpandableList.class);
            bundle.putString("title", replace + ":" + str3 + " - " + str);
            bundle.putString("account", ExpenseAccountSummary.f2780y.getText().toString());
            bundle.putString("whereClause", str2);
            bundle.putInt("highlightId", 1);
            intent.putExtras(bundle);
            this.f4780b.m281a(intent, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
