package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class zp implements OnClickListener {
    final /* synthetic */ ExpenseRepeatingTransaction f5549a;

    zp(ExpenseRepeatingTransaction expenseRepeatingTransaction) {
        this.f5549a = expenseRepeatingTransaction;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5549a.f3413f, SortableItemList.class);
        Bundle bundle = new Bundle();
        bundle.putInt("default_string_resource", 2131100103);
        bundle.putString("saved_string_key", "TRANSACTION_STATUS_KEY");
        bundle.putString("selected_item_key", "status");
        intent.putExtras(bundle);
        this.f5549a.startActivityForResult(intent, 5);
    }
}
