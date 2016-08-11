package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsPromptResult;

final class mj implements OnCancelListener {
    final /* synthetic */ JsPromptResult f7129a;

    mj(JsPromptResult jsPromptResult) {
        this.f7129a = jsPromptResult;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f7129a.cancel();
    }
}
