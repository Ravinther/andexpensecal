package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.json.JSONObject;

class fn implements OnClickListener {
    final /* synthetic */ fl f6593a;

    fn(fl flVar) {
        this.f6593a = flVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f6593a.f6587a.m6092b("onStorePictureCanceled", new JSONObject());
    }
}
