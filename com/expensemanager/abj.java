package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Button;

class abj implements OnClickListener {
    final /* synthetic */ Button f3837a;
    final /* synthetic */ String f3838b;
    final /* synthetic */ GoogleDrive f3839c;

    abj(GoogleDrive googleDrive, Button button, String str) {
        this.f3839c = googleDrive;
        this.f3837a = button;
        this.f3838b = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String b = aib.m3865b(this.f3839c.f3482f.getText().toString());
        this.f3837a.setText(b);
        abd.m3811a(this.f3839c.f3483h, GoogleDrive.f3477g, "expense_preference", this.f3838b, b);
    }
}
