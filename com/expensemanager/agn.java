package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class agn implements OnClickListener {
    final /* synthetic */ ShoppingListAddEdit f4092a;

    agn(ShoppingListAddEdit shoppingListAddEdit) {
        this.f4092a = shoppingListAddEdit;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f4092a.f3605a, ExpenseAutoFillList.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f4092a.f3630z);
        bundle.putString("categoryDisplay", this.f4092a.f3612h.getText().toString());
        intent.putExtras(bundle);
        this.f4092a.startActivityForResult(intent, 8);
    }
}
