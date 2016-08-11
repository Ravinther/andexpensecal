package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class afu implements OnClickListener {
    final /* synthetic */ String f4066a;
    final /* synthetic */ ShoppingListAddEdit f4067b;

    afu(ShoppingListAddEdit shoppingListAddEdit, String str) {
        this.f4067b = shoppingListAddEdit;
        this.f4066a = str;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f4067b.f3605a, ExpensePayList.class);
        Bundle bundle = new Bundle();
        bundle.putString("categoryDisplay", this.f4066a);
        intent.putExtras(bundle);
        this.f4067b.startActivityForResult(intent, 3);
    }
}
