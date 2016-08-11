package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

class vh implements OnClickListener {
    final /* synthetic */ ExpenseMileageActivities f5364a;

    vh(ExpenseMileageActivities expenseMileageActivities) {
        this.f5364a = expenseMileageActivities;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f5364a.m3223b("DELETE from expense_report where " + this.f5364a.f3264e)) {
            abd.m3805a(this.f5364a.f3263d, true);
            Toast.makeText(this.f5364a.f3263d, 2131099811, 1).show();
            this.f5364a.f3265f = this.f5364a.f3262c + " - " + this.f5364a.getResources().getString(2131099722);
            this.f5364a.f3264e = "account='" + this.f5364a.f3262c + "'";
            ExpenseMileageActivities.f3258i = "expensed ASC";
            this.f5364a.m3215a();
            this.f5364a.setTitle(this.f5364a.f3262c + ": " + this.f5364a.getResources().getString(2131099722) + "(" + ExpenseMileageActivities.f3257a + ")");
            return;
        }
        Toast.makeText(this.f5364a.f3263d, 2131099806, 1).show();
    }
}
