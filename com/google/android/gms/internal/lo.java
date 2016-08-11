package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class lo implements OnClickListener {
    final /* synthetic */ String f7082a;
    final /* synthetic */ ln f7083b;

    lo(ln lnVar, String str) {
        this.f7083b = lnVar;
        this.f7082a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f7083b.f7075a.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.f7082a), "Share via"));
    }
}
