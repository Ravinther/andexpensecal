package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

class afp implements OnClickListener {
    final /* synthetic */ ShoppingList f4054a;

    afp(ShoppingList shoppingList) {
        this.f4054a = shoppingList;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            if (!this.f4054a.f3594d.m4206d()) {
                this.f4054a.f3594d.m4193a();
            }
            if (this.f4054a.f3594d.m4198a("expense_report", "property3='$ShoppingList' AND expensed>0", "property3", "")) {
                abd.m3805a(this.f4054a.f3593c, true);
            }
            this.f4054a.onCreate(null);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this.f4054a.f3593c, 2131099806, 1).show();
        }
    }
}
