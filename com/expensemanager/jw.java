package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class jw implements OnClickListener {
    final /* synthetic */ ExpenseAutoFillAddEdit f4862a;

    jw(ExpenseAutoFillAddEdit expenseAutoFillAddEdit) {
        this.f4862a = expenseAutoFillAddEdit;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f4862a.f2863a, SortableItemList.class);
        Bundle bundle = new Bundle();
        bundle.putInt("default_string_resource", 2131100103);
        bundle.putString("saved_string_key", "TRANSACTION_STATUS_KEY");
        bundle.putString("selected_item_key", "status");
        intent.putExtras(bundle);
        this.f4862a.startActivityForResult(intent, 6);
    }
}
