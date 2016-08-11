package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.ArrayList;

class fc implements OnClickListener {
    final /* synthetic */ String[] f4625a;
    final /* synthetic */ String f4626b;
    final /* synthetic */ String f4627c;
    final /* synthetic */ ExpenseAccountActivities f4628d;

    fc(ExpenseAccountActivities expenseAccountActivities, String[] strArr, String str, String str2) {
        this.f4628d = expenseAccountActivities;
        this.f4625a = strArr;
        this.f4626b = str;
        this.f4627c = str2;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (!this.f4628d.f2710f.m4206d()) {
            this.f4628d.f2710f.m4193a();
        }
        if (this.f4628d.f2709d.getSelectedItemPosition() != -1) {
            abd.m3805a(this.f4628d.f2712h, this.f4628d.f2710f.m4198a("expense_report", this.f4626b, this.f4627c, this.f4625a[this.f4628d.f2709d.getSelectedItemPosition()]));
            this.f4628d.m2606a();
            this.f4628d.setTitle(this.f4628d.f2707b);
            this.f4628d.f2717m = new ArrayList();
            this.f4628d.f2708c.setVisible(false);
        }
    }
}
