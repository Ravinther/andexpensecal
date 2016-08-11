package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

class abr implements OnClickListener {
    final /* synthetic */ Button f3861a;
    final /* synthetic */ GoogleDrive f3862b;

    abr(GoogleDrive googleDrive, Button button) {
        this.f3862b = googleDrive;
        this.f3861a = button;
    }

    public void onClick(View view) {
        this.f3862b.m3449a(this.f3861a, aib.m3865b(this.f3861a.getText().toString()), "DRIVE_CSV_DIR");
    }
}
