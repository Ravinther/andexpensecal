package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class aep implements OnClickListener {
    final /* synthetic */ SMSAddEdit f4007a;

    aep(SMSAddEdit sMSAddEdit) {
        this.f4007a = sMSAddEdit;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f4007a.f3572l, SortableItemList.class);
        Bundle bundle = new Bundle();
        bundle.putInt("default_string_resource", 2131100103);
        bundle.putString("saved_string_key", "TRANSACTION_STATUS_KEY");
        bundle.putString("selected_item_key", "status");
        intent.putExtras(bundle);
        this.f4007a.startActivityForResult(intent, 3);
    }
}
