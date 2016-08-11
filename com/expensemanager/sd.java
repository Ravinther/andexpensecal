package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import java.util.List;
import java.util.Map;

class sd implements OnChildClickListener {
    final /* synthetic */ List f5248a;
    final /* synthetic */ ExpenseDetails f5249b;

    sd(ExpenseDetails expenseDetails, List list) {
        this.f5249b = expenseDetails;
        this.f5248a = list;
    }

    public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        Map map = (Map) ((List) this.f5248a.get(i)).get(i2);
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.f5249b.f3175C, ExpenseNewTransaction.class);
        bundle.putLong("rowId", Long.valueOf((String) map.get("rowId")).longValue());
        bundle.putString("date", (String) map.get("expenseDate"));
        bundle.putString("category", (String) map.get("category"));
        bundle.putString("account", (String) map.get("account"));
        bundle.putString("amount", (String) map.get("amount"));
        bundle.putString("description", (String) map.get("description"));
        bundle.putString("paymentMethod", (String) map.get("paymentMethod"));
        bundle.putString("referenceNumber", (String) map.get("referenceNumber"));
        bundle.putString("property", (String) map.get("property"));
        bundle.putString("status", (String) map.get("status"));
        bundle.putString("fromWhere", "Edit");
        bundle.putString("property2", (String) map.get("property2"));
        intent.putExtras(bundle);
        this.f5249b.startActivityForResult(intent, 0);
        return false;
    }
}
