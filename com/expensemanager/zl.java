package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Map;

class zl implements OnItemClickListener {
    final /* synthetic */ ExpenseRepeatingList f5540a;

    zl(ExpenseRepeatingList expenseRepeatingList) {
        this.f5540a = expenseRepeatingList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Map map = (Map) adapterView.getItemAtPosition(i);
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.f5540a.f3399d, ExpenseRepeatingTransaction.class);
        bundle.putString("account", (String) map.get("account"));
        bundle.putString("rowId", (String) map.get("rowId"));
        bundle.putString("fromWhere", "Edit");
        intent.putExtras(bundle);
        this.f5540a.startActivityForResult(intent, 0);
    }
}
