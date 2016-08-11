package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

final class mg implements OnCancelListener {
    final /* synthetic */ JsResult f7126a;

    mg(JsResult jsResult) {
        this.f7126a = jsResult;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f7126a.cancel();
    }
}
