package com.expensemanager;

import android.widget.Toast;

class acc implements Runnable {
    final /* synthetic */ String f3888a;
    final /* synthetic */ GoogleDriveDownloadList f3889b;

    acc(GoogleDriveDownloadList googleDriveDownloadList, String str) {
        this.f3889b = googleDriveDownloadList;
        this.f3888a = str;
    }

    public void run() {
        Toast.makeText(this.f3889b.getApplicationContext(), this.f3888a, 0).show();
    }
}
