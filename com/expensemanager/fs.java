package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import java.util.List;
import java.util.Map;

class fs implements OnChildClickListener {
    final /* synthetic */ ExpenseAccountExpandableList f4659a;

    fs(ExpenseAccountExpandableList expenseAccountExpandableList) {
        this.f4659a = expenseAccountExpandableList;
    }

    public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        Map map = (Map) ((List) this.f4659a.f2729b.get(i)).get(i2);
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.f4659a.f2730c, ExpenseNewTransaction.class);
        bundle.putLong("rowId", Long.valueOf((String) map.get("rowId")).longValue());
        bundle.putString("date", (String) map.get("expenseDate"));
        bundle.putString("category", (String) map.get("category"));
        bundle.putString("account", (String) map.get("account"));
        bundle.putString("amount", (String) map.get("amount"));
        bundle.putString("description", (String) map.get("description"));
        bundle.putString("paymentMethod", (String) map.get("paymentMethod"));
        bundle.putString("referenceNumber", (String) map.get("referenceNumber"));
        bundle.putString("property", (String) map.get("property"));
        bundle.putString("property2", (String) map.get("property2"));
        bundle.putString("status", (String) map.get("status"));
        bundle.putString("fromWhere", "Edit");
        intent.putExtras(bundle);
        this.f4659a.startActivityForResult(intent, 0);
        return false;
    }
}
