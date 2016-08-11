package com.google.android.gms.internal;

import android.util.Base64;

class gp implements ok {
    gp() {
    }

    public String m5614a(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, z ? 11 : 2);
    }

    public byte[] m5615a(String str, boolean z) {
        return Base64.decode(str, z ? 11 : 2);
    }
}
