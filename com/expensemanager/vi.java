package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import java.io.File;

class vi implements OnClickListener {
    final /* synthetic */ long f5365a;
    final /* synthetic */ String f5366b;
    final /* synthetic */ ExpenseMileageActivities f5367c;

    vi(ExpenseMileageActivities expenseMileageActivities, long j, String str) {
        this.f5367c = expenseMileageActivities;
        this.f5365a = j;
        this.f5366b = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        boolean a;
        Exception e;
        if (!this.f5367c.f3261b.m4206d()) {
            this.f5367c.f3261b.m4193a();
        }
        try {
            a = this.f5367c.f3261b.m4195a("expense_report", this.f5365a);
            try {
                File file = new File(co.f4431e + this.f5365a + ".jpg");
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                if (a) {
                    Toast.makeText(this.f5367c.f3263d, 2131099707, 1).show();
                }
                abd.m3805a(this.f5367c.f3263d, a);
                Toast.makeText(this.f5367c.f3263d, 2131099811, 1).show();
                this.f5367c.m3215a();
                if (this.f5366b.indexOf("(") == -1) {
                    this.f5367c.setTitle(this.f5366b.substring(0, this.f5366b.indexOf("(")) + "(" + ExpenseMileageActivities.f3257a + ")");
                    return;
                }
                return;
            }
        } catch (Exception e3) {
            e = e3;
            a = false;
            e.printStackTrace();
            if (a) {
                abd.m3805a(this.f5367c.f3263d, a);
                Toast.makeText(this.f5367c.f3263d, 2131099811, 1).show();
                this.f5367c.m3215a();
                if (this.f5366b.indexOf("(") == -1) {
                    this.f5367c.setTitle(this.f5366b.substring(0, this.f5366b.indexOf("(")) + "(" + ExpenseMileageActivities.f3257a + ")");
                    return;
                }
                return;
            }
            Toast.makeText(this.f5367c.f3263d, 2131099707, 1).show();
        }
        if (a) {
            abd.m3805a(this.f5367c.f3263d, a);
            Toast.makeText(this.f5367c.f3263d, 2131099811, 1).show();
            this.f5367c.m3215a();
            if (this.f5366b.indexOf("(") == -1) {
                this.f5367c.setTitle(this.f5366b.substring(0, this.f5366b.indexOf("(")) + "(" + ExpenseMileageActivities.f3257a + ")");
                return;
            }
            return;
        }
        Toast.makeText(this.f5367c.f3263d, 2131099707, 1).show();
    }
}
