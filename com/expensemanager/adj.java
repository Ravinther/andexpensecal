package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

class adj implements OnClickListener {
    final /* synthetic */ String f3952a;
    final /* synthetic */ NoteList f3953b;

    adj(NoteList noteList, String str) {
        this.f3953b = noteList;
        this.f3952a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        if (this.f3952a == null || "".equals(this.f3952a)) {
            i2 = -1;
        } else {
            try {
                i2 = Integer.valueOf(this.f3952a).intValue();
            } catch (Exception e) {
                i2 = -1;
            }
        }
        if (i2 != -1) {
            if (!this.f3953b.f3542e.m4206d()) {
                this.f3953b.f3542e.m4193a();
            }
            boolean a = this.f3953b.f3542e.m4195a("expense_note", (long) i2);
            if (a) {
                Toast.makeText(this.f3953b.f3541d, 2131099811, 1).show();
                abd.m3805a(this.f3953b.f3541d, a);
                this.f3953b.onCreate(null);
                return;
            }
            aib.m3849a(this.f3953b.f3541d, null, this.f3953b.getResources().getString(2131099702), 17301543, this.f3953b.getResources().getString(2131099707), this.f3953b.getResources().getString(2131099983), null, null, null).show();
        }
    }
}
