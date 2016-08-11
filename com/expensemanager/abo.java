package com.expensemanager;

import android.widget.Toast;

class abo implements Runnable {
    final /* synthetic */ String f3856a;
    final /* synthetic */ GoogleDrive f3857b;

    abo(GoogleDrive googleDrive, String str) {
        this.f3857b = googleDrive;
        this.f3856a = str;
    }

    public void run() {
        Toast.makeText(this.f3857b.getApplicationContext(), this.f3856a, 0).show();
    }
}
