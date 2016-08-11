package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Map;

class fh implements OnItemClickListener {
    final /* synthetic */ String f4635a;
    final /* synthetic */ ExpenseAccountActivities f4636b;

    fh(ExpenseAccountActivities expenseAccountActivities, String str) {
        this.f4636b = expenseAccountActivities;
        this.f4635a = str;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Map map = (Map) adapterView.getItemAtPosition(i);
        String str = (String) map.get("name");
        if (str.indexOf("'") != -1) {
            str = str.replace("'", "''");
        }
        try {
            this.f4636b.f2713i = this.f4635a + "='" + str + "' and " + "account" + "='" + this.f4636b.f2711g + "'";
            if ("All".equals(this.f4636b.f2711g)) {
                this.f4636b.f2713i = this.f4635a + "='" + str + "' AND " + "category" + "!='Account Transfer' " + " AND " + "subcategory" + "!='Account Transfer' ";
            }
            Intent intent = new Intent(this.f4636b.f2712h, ExpenseAccountActivities.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f4636b.f2711g);
            bundle.putString("whereClause", this.f4636b.f2713i);
            bundle.putString("title", this.f4636b.f2711g + ": " + ((String) map.get("name")));
            intent.putExtras(bundle);
            this.f4636b.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
