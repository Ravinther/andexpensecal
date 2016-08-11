package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Map;

class afm implements OnItemClickListener {
    final /* synthetic */ ShoppingList f4051a;

    afm(ShoppingList shoppingList) {
        this.f4051a = shoppingList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Map map = (Map) this.f4051a.f3591a.getItem(i);
        Intent intent = new Intent(this.f4051a.f3593c, ShoppingListAddEdit.class);
        Bundle bundle = new Bundle();
        bundle.putString("fromWhere", "Edit");
        long longValue = Long.valueOf((String) map.get("rowId")).longValue();
        bundle.putString("account", (String) map.get("account"));
        bundle.putString("property3", (String) map.get("property3"));
        bundle.putLong("rowId", longValue);
        intent.putExtras(bundle);
        this.f4051a.startActivityForResult(intent, 0);
    }
}
