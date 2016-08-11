package com.expensemanager;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.List;

class agz implements OnClickListener {
    final /* synthetic */ ShoppingListAddEdit f4108a;

    agz(ShoppingListAddEdit shoppingListAddEdit) {
        this.f4108a = shoppingListAddEdit;
    }

    public void onClick(View view) {
        List a = abd.m3797a(this.f4089a.f4087a.f3598A, this.f4108a.f3630z);
        if (a != null && a.size() != 0) {
            View listView = new ListView(this.f4108a.f3605a);
            listView.setAdapter(new ArrayAdapter(this.f4108a.f3605a, 17367043, a.toArray(new String[a.size()])));
            Dialog dialog = new Dialog(this.f4108a.f3605a);
            dialog.setTitle(2131100026);
            dialog.setContentView(listView);
            dialog.show();
            listView.setOnItemClickListener(new aha(this, dialog, a));
        }
    }
}
