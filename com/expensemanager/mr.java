package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import java.util.List;
import java.util.Map;

class mr implements OnChildClickListener {
    final /* synthetic */ List f4983a;
    final /* synthetic */ List f4984b;
    final /* synthetic */ String f4985c;
    final /* synthetic */ ExpenseCategoryExpandableActivities f4986d;

    mr(ExpenseCategoryExpandableActivities expenseCategoryExpandableActivities, List list, List list2, String str) {
        this.f4986d = expenseCategoryExpandableActivities;
        this.f4983a = list;
        this.f4984b = list2;
        this.f4985c = str;
    }

    public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        String str = (String) ((Map) this.f4983a.get(i)).get("category");
        String str2 = (String) ((Map) ((List) this.f4984b.get(i)).get(i2)).get("subcategory");
        String str3 = "account='" + this.f4985c + "' and " + "category" + "='" + str + "'";
        if ("All".equalsIgnoreCase(this.f4985c)) {
            str3 = "category='" + str + "'" + " and " + "account" + " in (" + abd.m3792a(ExpenseManager.f3245u) + ")";
        }
        if (!(str2 == null || "".equals(str2))) {
            str3 = str3 + " and " + "subcategory" + "='" + str2 + "'";
        }
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.f4986d.f2987a, ExpenseAccountActivities.class);
        bundle.putString("whereClause", str3);
        bundle.putString("account", this.f4985c);
        bundle.putString("title", str + ":" + str2);
        intent.putExtras(bundle);
        this.f4986d.startActivity(intent);
        return false;
    }
}
