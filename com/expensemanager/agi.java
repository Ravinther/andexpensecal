package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;

class agi implements OnClickListener {
    final /* synthetic */ ShoppingListAddEdit f4087a;

    agi(ShoppingListAddEdit shoppingListAddEdit) {
        this.f4087a = shoppingListAddEdit;
    }

    public void onClick(View view) {
        DialogInterface.OnClickListener com_expensemanager_agj = new agj(this);
        DialogInterface.OnClickListener com_expensemanager_agk = new agk(this);
        DialogInterface.OnClickListener com_expensemanager_agl = new agl(this);
        Builder builder = new Builder(this.f4087a.f3605a);
        if (this.f4087a.f3602E) {
            builder.setTitle(this.f4087a.getResources().getString(2131099805)).setMessage(this.f4087a.getResources().getString(2131100083)).setCancelable(false).setPositiveButton(this.f4087a.getResources().getString(2131099802), com_expensemanager_agk).setNeutralButton(this.f4087a.getResources().getString(2131100105), com_expensemanager_agl).setNegativeButton(this.f4087a.getResources().getString(2131099754), com_expensemanager_agj);
        } else {
            builder.setTitle(this.f4087a.getResources().getString(2131099805)).setMessage(this.f4087a.getResources().getString(2131099808)).setCancelable(false).setPositiveButton(this.f4087a.getResources().getString(2131099802), com_expensemanager_agk).setNegativeButton(this.f4087a.getResources().getString(2131099754), com_expensemanager_agj);
        }
        builder.show();
    }
}
