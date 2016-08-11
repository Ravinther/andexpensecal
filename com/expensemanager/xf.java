package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class xf implements OnClickListener {
    final /* synthetic */ ExpenseNewTransaction f5438a;

    xf(ExpenseNewTransaction expenseNewTransaction) {
        this.f5438a = expenseNewTransaction;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5438a.f3334a, SortableItemList.class);
        Bundle bundle = new Bundle();
        bundle.putInt("default_string_resource", 2131100153);
        bundle.putString("saved_string_key", "TRANSACTION_UNIT_KEY");
        bundle.putString("selected_item_key", "unit");
        intent.putExtras(bundle);
        this.f5438a.startActivityForResult(intent, 11);
    }
}
