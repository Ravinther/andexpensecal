package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class wz implements OnClickListener {
    final /* synthetic */ ExpenseNewTransaction f5429a;

    wz(ExpenseNewTransaction expenseNewTransaction) {
        this.f5429a = expenseNewTransaction;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5429a.f3334a, SortableItemList.class);
        Bundle bundle = new Bundle();
        bundle.putInt("default_string_resource", 2131100103);
        bundle.putString("saved_string_key", "TRANSACTION_STATUS_KEY");
        bundle.putString("selected_item_key", "status");
        intent.putExtras(bundle);
        this.f5429a.startActivityForResult(intent, 6);
    }
}
