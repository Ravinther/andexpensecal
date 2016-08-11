package com.google.android.gms.common;

import android.content.Intent;

/* renamed from: com.google.android.gms.common.h */
public class C0617h extends Exception {
    private final Intent f6140a;

    public C0617h(String str, Intent intent) {
        super(str);
        this.f6140a = intent;
    }

    public Intent m4942b() {
        return new Intent(this.f6140a);
    }
}
