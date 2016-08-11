package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Map;

class ve implements OnItemClickListener {
    final /* synthetic */ ExpenseMileageActivities f5361a;

    ve(ExpenseMileageActivities expenseMileageActivities) {
        this.f5361a = expenseMileageActivities;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Map map = (Map) adapterView.getItemAtPosition(i);
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.f5361a.f3263d, ExpenseMileageNewEdit.class);
        bundle.putLong("rowId", Long.valueOf((String) map.get("rowId")).longValue());
        bundle.putString("date", (String) map.get("date"));
        bundle.putString("category", (String) map.get("category"));
        bundle.putString("account", (String) map.get("account"));
        bundle.putString("amount", (String) map.get("amount"));
        bundle.putString("description", (String) map.get("description"));
        bundle.putString("paymentMethod", (String) map.get("paymentMethod"));
        bundle.putString("referenceNumber", (String) map.get("referenceNumber"));
        bundle.putString("property", (String) map.get("property"));
        bundle.putString("status", (String) map.get("status"));
        bundle.putString("property2", (String) map.get("property2"));
        bundle.putString("tag", (String) map.get("tag"));
        bundle.putString("fromWhere", "EditActivity");
        bundle.putInt("position", i);
        intent.putExtras(bundle);
        this.f5361a.startActivityForResult(intent, 0);
    }
}
