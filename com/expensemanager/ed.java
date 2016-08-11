package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class ed implements OnClickListener {
    final /* synthetic */ DebtAddEdit f4577a;

    ed(DebtAddEdit debtAddEdit) {
        this.f4577a = debtAddEdit;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f4577a.f2654a, SortableItemList.class);
        Bundle bundle = new Bundle();
        bundle.putInt("default_string_resource", 2131100103);
        bundle.putString("saved_string_key", "TRANSACTION_STATUS_KEY");
        bundle.putString("selected_item_key", "status");
        intent.putExtras(bundle);
        this.f4577a.startActivityForResult(intent, 6);
    }
}
