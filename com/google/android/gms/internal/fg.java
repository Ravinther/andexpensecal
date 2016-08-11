package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class fg implements OnClickListener {
    final /* synthetic */ ff f6537a;

    fg(ff ffVar) {
        this.f6537a = ffVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f6537a.f6531c.startActivity(this.f6537a.m5485b());
    }
}
