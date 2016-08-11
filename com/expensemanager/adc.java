package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.widget.Toast;

class adc implements OnClickListener {
    final /* synthetic */ NoteAdd f3945a;

    adc(NoteAdd noteAdd) {
        this.f3945a = noteAdd;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        if (this.f3945a.f3537h == null || "".equals(this.f3945a.f3537h)) {
            i2 = -1;
        } else {
            try {
                i2 = Integer.valueOf(this.f3945a.f3537h).intValue();
            } catch (Exception e) {
                i2 = -1;
            }
        }
        if (i2 != -1) {
            if (!this.f3945a.f3535f.m4206d()) {
                this.f3945a.f3535f.m4193a();
            }
            boolean a = this.f3945a.f3535f.m4195a("expense_note", (long) i2);
            if (a) {
                Toast.makeText(this.f3945a.f3530a, 2131099811, 1).show();
                abd.m3805a(this.f3945a.f3530a, a);
                this.f3945a.setResult(-1, new Intent());
                this.f3945a.finish();
                return;
            }
            aib.m3849a(this.f3945a.f3530a, null, this.f3945a.getResources().getString(2131099702), 17301543, this.f3945a.getResources().getString(2131099707), this.f3945a.getResources().getString(2131099983), null, null, null).show();
        }
    }
}
