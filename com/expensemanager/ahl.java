package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class ahl implements OnClickListener {
    final /* synthetic */ TagList f4129a;

    ahl(TagList tagList) {
        this.f4129a = tagList;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f4129a.f3648g, SortableItemList.class);
        Bundle bundle = new Bundle();
        bundle.putInt("default_string_resource", 2131100111);
        bundle.putString("saved_string_key", "EXPENSE_TAG");
        bundle.putString("selected_item_key", "tag");
        bundle.putBoolean("isEdit", true);
        intent.putExtras(bundle);
        this.f4129a.startActivityForResult(intent, 0);
    }
}
