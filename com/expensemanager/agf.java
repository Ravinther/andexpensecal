package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class agf implements OnClickListener {
    final /* synthetic */ ShoppingListAddEdit f4083a;

    agf(ShoppingListAddEdit shoppingListAddEdit) {
        this.f4083a = shoppingListAddEdit;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f4083a.f3605a, SortableItemList.class);
        Bundle bundle = new Bundle();
        bundle.putInt("default_string_resource", 2131100153);
        bundle.putString("saved_string_key", "TRANSACTION_UNIT_KEY");
        bundle.putString("selected_item_key", "unit");
        intent.putExtras(bundle);
        this.f4083a.startActivityForResult(intent, 11);
    }
}
