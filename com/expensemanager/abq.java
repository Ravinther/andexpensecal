package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

class abq implements OnClickListener {
    final /* synthetic */ Button f3859a;
    final /* synthetic */ GoogleDrive f3860b;

    abq(GoogleDrive googleDrive, Button button) {
        this.f3860b = googleDrive;
        this.f3859a = button;
    }

    public void onClick(View view) {
        this.f3860b.m3449a(this.f3859a, aib.m3865b(this.f3859a.getText().toString()), "DRIVE_DB_DIR");
    }
}
