package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class ml implements OnClickListener {
    final /* synthetic */ JsPromptResult f7131a;
    final /* synthetic */ EditText f7132b;

    ml(JsPromptResult jsPromptResult, EditText editText) {
        this.f7131a = jsPromptResult;
        this.f7132b = editText;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f7131a.confirm(this.f7132b.getText().toString());
    }
}
