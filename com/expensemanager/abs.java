package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

class abs implements OnClickListener {
    final /* synthetic */ Button f3863a;
    final /* synthetic */ GoogleDrive f3864b;

    abs(GoogleDrive googleDrive, Button button) {
        this.f3864b = googleDrive;
        this.f3863a = button;
    }

    public void onClick(View view) {
        this.f3864b.m3449a(this.f3863a, aib.m3865b(this.f3863a.getText().toString()), "DRIVE_RECEIPT_DIR");
    }
}
