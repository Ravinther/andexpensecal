package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import java.io.File;

class fj implements OnClickListener {
    final /* synthetic */ long f4638a;
    final /* synthetic */ String f4639b;
    final /* synthetic */ ExpenseAccountActivities f4640c;

    fj(ExpenseAccountActivities expenseAccountActivities, long j, String str) {
        this.f4640c = expenseAccountActivities;
        this.f4638a = j;
        this.f4639b = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        boolean a;
        Exception e;
        if (!this.f4640c.f2710f.m4206d()) {
            this.f4640c.f2710f.m4193a();
        }
        try {
            a = this.f4640c.f2710f.m4195a("expense_report", this.f4638a);
            try {
                File file = new File(co.f4431e + this.f4638a + ".jpg");
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                if (a) {
                    Toast.makeText(this.f4640c.f2712h, 2131099707, 1).show();
                }
                abd.m3805a(this.f4640c.f2712h, a);
                Toast.makeText(this.f4640c.f2712h, 2131099811, 1).show();
                this.f4640c.m2606a();
                if (this.f4639b.indexOf(" (") == -1) {
                    this.f4640c.setTitle(this.f4639b.substring(0, this.f4639b.indexOf(" (")) + " (" + ExpenseAccountActivities.f2704a + ")");
                    return;
                }
                return;
            }
        } catch (Exception e3) {
            e = e3;
            a = false;
            e.printStackTrace();
            if (a) {
                abd.m3805a(this.f4640c.f2712h, a);
                Toast.makeText(this.f4640c.f2712h, 2131099811, 1).show();
                this.f4640c.m2606a();
                if (this.f4639b.indexOf(" (") == -1) {
                    this.f4640c.setTitle(this.f4639b.substring(0, this.f4639b.indexOf(" (")) + " (" + ExpenseAccountActivities.f2704a + ")");
                    return;
                }
                return;
            }
            Toast.makeText(this.f4640c.f2712h, 2131099707, 1).show();
        }
        if (a) {
            abd.m3805a(this.f4640c.f2712h, a);
            Toast.makeText(this.f4640c.f2712h, 2131099811, 1).show();
            this.f4640c.m2606a();
            if (this.f4639b.indexOf(" (") == -1) {
                this.f4640c.setTitle(this.f4639b.substring(0, this.f4639b.indexOf(" (")) + " (" + ExpenseAccountActivities.f2704a + ")");
                return;
            }
            return;
        }
        Toast.makeText(this.f4640c.f2712h, 2131099707, 1).show();
    }
}
