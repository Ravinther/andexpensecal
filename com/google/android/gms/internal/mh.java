package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

final class mh implements OnClickListener {
    final /* synthetic */ JsResult f7127a;

    mh(JsResult jsResult) {
        this.f7127a = jsResult;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f7127a.cancel();
    }
}
