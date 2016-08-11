package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Map;

class zh implements OnItemClickListener {
    final /* synthetic */ ExpenseReminderTransactionList f5535a;

    zh(ExpenseReminderTransactionList expenseReminderTransactionList) {
        this.f5535a = expenseReminderTransactionList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Map map = (Map) adapterView.getItemAtPosition(i);
        if (map != null) {
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this.f5535a.f3393b, ExpenseNewTransaction.class);
            bundle.putString("account", (String) map.get("account"));
            bundle.putString("description", (String) map.get("description"));
            bundle.putString("reminder", "YES");
            bundle.putString("reminder_Id", (String) map.get("property2"));
            if (((String) map.get("paid_rowId")) != null) {
                bundle.putString("fromWhere", "Edit");
                bundle.putLong("rowId", aba.m3778e((String) map.get("paid_rowId")));
            }
            intent.putExtras(bundle);
            this.f5535a.startActivityForResult(intent, 0);
        }
    }
}
