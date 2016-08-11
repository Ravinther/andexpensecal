package com.google.android.gms.auth;

import android.content.Intent;

/* renamed from: com.google.android.gms.auth.g */
public class C0604g extends C0602d {
    private final Intent f6131a;

    public C0604g(String str, Intent intent) {
        super(str);
        this.f6131a = intent;
    }

    public Intent m4930a() {
        return this.f6131a == null ? null : new Intent(this.f6131a);
    }
}
