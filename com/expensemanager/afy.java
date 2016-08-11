package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class afy implements OnClickListener {
    final /* synthetic */ ShoppingListAddEdit f4072a;

    afy(ShoppingListAddEdit shoppingListAddEdit) {
        this.f4072a = shoppingListAddEdit;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f4072a.f3605a, SortableItemList.class);
        Bundle bundle = new Bundle();
        bundle.putInt("default_string_resource", 2131100103);
        bundle.putString("saved_string_key", "TRANSACTION_STATUS_KEY");
        bundle.putString("selected_item_key", "status");
        intent.putExtras(bundle);
        this.f4072a.startActivityForResult(intent, 6);
    }
}
