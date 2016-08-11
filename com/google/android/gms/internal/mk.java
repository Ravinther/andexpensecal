package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

final class mk implements OnClickListener {
    final /* synthetic */ JsPromptResult f7130a;

    mk(JsPromptResult jsPromptResult) {
        this.f7130a = jsPromptResult;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f7130a.cancel();
    }
}
