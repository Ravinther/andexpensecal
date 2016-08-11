package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

class fi implements OnClickListener {
    final /* synthetic */ ExpenseAccountActivities f4637a;

    fi(ExpenseAccountActivities expenseAccountActivities) {
        this.f4637a = expenseAccountActivities;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f4637a.m2619c("DELETE from expense_report where " + this.f4637a.f2713i)) {
            abd.m3805a(this.f4637a.f2712h, true);
            Toast.makeText(this.f4637a.f2712h, 2131099811, 1).show();
            this.f4637a.f2714j = this.f4637a.f2711g + " - " + this.f4637a.getResources().getString(2131099722);
            this.f4637a.f2713i = "account='" + this.f4637a.f2711g + "'";
            ExpenseAccountActivities.f2706o = "expensed ASC";
            this.f4637a.m2606a();
            this.f4637a.setTitle(this.f4637a.f2711g + ": " + this.f4637a.getResources().getString(2131099722) + " (" + ExpenseAccountActivities.f2704a + ")");
            return;
        }
        Toast.makeText(this.f4637a.f2712h, 2131099806, 1).show();
    }
}
