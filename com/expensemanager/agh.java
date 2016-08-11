package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class agh implements OnClickListener {
    final /* synthetic */ ShoppingListAddEdit f4086a;

    agh(ShoppingListAddEdit shoppingListAddEdit) {
        this.f4086a = shoppingListAddEdit;
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f4086a.f3630z);
        intent.putExtras(bundle);
        this.f4086a.setResult(-1, intent);
        this.f4086a.finish();
    }
}
