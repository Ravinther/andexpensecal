package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

final class mi implements OnClickListener {
    final /* synthetic */ JsResult f7128a;

    mi(JsResult jsResult) {
        this.f7128a = jsResult;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f7128a.confirm();
    }
}
