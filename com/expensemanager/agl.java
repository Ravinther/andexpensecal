package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

class agl implements OnClickListener {
    final /* synthetic */ agi f4090a;

    agl(agi com_expensemanager_agi) {
        this.f4090a = com_expensemanager_agi;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            if (!this.f4090a.f4087a.f3598A.m4206d()) {
                this.f4090a.f4087a.f3598A.m4193a();
            }
            if (this.f4090a.f4087a.f3598A.m4198a("expense_report", "_id=" + this.f4090a.f4087a.getIntent().getLongExtra("rowId", -1), "property3", "")) {
                abd.m3805a(this.f4090a.f4087a.f3605a, true);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this.f4090a.f4087a.f3605a, 2131099806, 1).show();
        }
    }
}
