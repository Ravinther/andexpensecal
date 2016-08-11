package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class agc implements OnClickListener {
    final /* synthetic */ ShoppingListAddEdit f4080a;

    agc(ShoppingListAddEdit shoppingListAddEdit) {
        this.f4080a = shoppingListAddEdit;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f4080a.f3605a, TagList.class);
        Bundle bundle = new Bundle();
        bundle.putString("tag", this.f4080a.f3622r.getText().toString());
        intent.putExtras(bundle);
        this.f4080a.startActivityForResult(intent, 9);
    }
}
