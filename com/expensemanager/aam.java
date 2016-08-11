package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Map;

class aam implements OnItemClickListener {
    final /* synthetic */ ExpenseRepeatingTransferList f3807a;

    aam(ExpenseRepeatingTransferList expenseRepeatingTransferList) {
        this.f3807a = expenseRepeatingTransferList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Map map = (Map) adapterView.getItemAtPosition(i);
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.f3807a.f3437d, ExpenseRepeatingTransaction.class);
        if ("Once Only".equals((String) map.get("frequency")) && ((String) map.get("remindTime")).startsWith("0")) {
            intent = new Intent(this.f3807a.f3437d, ExpenseAccountTransfer.class);
        }
        bundle.putString("account", (String) map.get("account"));
        bundle.putString("rowId", (String) map.get("rowId"));
        bundle.putString("fromWhere", "Edit");
        bundle.putString("category", "Account Transfer");
        intent.putExtras(bundle);
        this.f3807a.startActivityForResult(intent, 0);
    }
}
