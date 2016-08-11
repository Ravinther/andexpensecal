package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import java.util.ArrayList;

class fk implements OnClickListener {
    final /* synthetic */ ExpenseAccountActivities f4641a;

    fk(ExpenseAccountActivities expenseAccountActivities) {
        this.f4641a = expenseAccountActivities;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f4641a.m2619c("DELETE from expense_report where " + ("account='" + this.f4641a.f2711g + "'" + " and " + "_id" + " in (" + abd.m3792a(aib.m3868b((String[]) this.f4641a.f2717m.toArray(new String[this.f4641a.f2717m.size()]), ",")) + ")"))) {
            abd.m3805a(this.f4641a.f2712h, true);
            Toast.makeText(this.f4641a.f2712h, 2131099811, 1).show();
            this.f4641a.f2714j = this.f4641a.f2711g + " - " + this.f4641a.getResources().getString(2131099722);
            this.f4641a.f2713i = "account='" + this.f4641a.f2711g + "'";
            ExpenseAccountActivities.f2706o = "expensed ASC";
            this.f4641a.m2606a();
            this.f4641a.setTitle(this.f4641a.f2711g + ": " + this.f4641a.getResources().getString(2131099722) + " (" + ExpenseAccountActivities.f2704a + ")");
            this.f4641a.f2717m = new ArrayList();
            this.f4641a.f2708c.setVisible(false);
            return;
        }
        Toast.makeText(this.f4641a.f2712h, 2131099806, 1).show();
    }
}
