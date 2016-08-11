package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Map;

class sq implements OnItemClickListener {
    final /* synthetic */ ExpenseDetails f5267a;

    sq(ExpenseDetails expenseDetails) {
        this.f5267a = expenseDetails;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Map map = (Map) adapterView.getItemAtPosition(i);
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.f5267a.f3175C, ExpenseNewTransaction.class);
        String str = (String) map.get("paymentMethod");
        if (!(str.indexOf("/mi") == -1 && str.indexOf("/km") == -1)) {
            intent = new Intent(this.f5267a.f3175C, ExpenseMileageNewEdit.class);
        }
        bundle.putLong("rowId", Long.valueOf((String) map.get("rowId")).longValue());
        bundle.putString("date", aba.m3757a("EEE, " + ExpenseManager.f3244t, ExpenseManager.f3244t, this.f5267a.f3208x.getText().toString()));
        bundle.putString("category", (String) map.get("category"));
        bundle.putString("account", (String) map.get("account"));
        bundle.putString("amount", (String) map.get("amount"));
        bundle.putString("description", (String) map.get("description"));
        bundle.putString("paymentMethod", (String) map.get("paymentMethod"));
        bundle.putString("referenceNumber", (String) map.get("referenceNumber"));
        bundle.putString("property", (String) map.get("property"));
        bundle.putString("status", (String) map.get("status"));
        bundle.putString("property2", (String) map.get("property2"));
        bundle.putString("fromWhere", "Edit");
        intent.putExtras(bundle);
        this.f5267a.startActivityForResult(intent, 0);
    }
}
