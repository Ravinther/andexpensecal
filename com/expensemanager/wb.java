package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class wb implements OnClickListener {
    final /* synthetic */ ExpenseMileageNewEdit f5390a;

    wb(ExpenseMileageNewEdit expenseMileageNewEdit) {
        this.f5390a = expenseMileageNewEdit;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5390a.f3268a, SortableItemList.class);
        Bundle bundle = new Bundle();
        bundle.putInt("default_string_resource", 2131099948);
        bundle.putString("saved_string_key", "location_key");
        bundle.putString("selected_item_key", "location");
        intent.putExtras(bundle);
        this.f5390a.startActivityForResult(intent, 6);
    }
}
