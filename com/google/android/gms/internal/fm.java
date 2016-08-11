package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class fm implements OnClickListener {
    final /* synthetic */ String f6590a;
    final /* synthetic */ String f6591b;
    final /* synthetic */ fl f6592c;

    fm(fl flVar, String str, String str2) {
        this.f6592c = flVar;
        this.f6590a = str;
        this.f6591b = str2;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            ((DownloadManager) this.f6592c.f6589c.getSystemService("download")).enqueue(this.f6592c.m5495a(this.f6590a, this.f6591b));
        } catch (IllegalStateException e) {
            ly.m6070c("Could not store picture.");
        }
    }
}
