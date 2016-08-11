package com.google.api.client.p051b;

import com.google.api.client.p050d.am;
import com.google.api.client.p050d.p065a.C0707a;

/* renamed from: com.google.api.client.b.ak */
enum ak {
    PLUS(Character.valueOf('+'), "", ",", false, true),
    HASH(Character.valueOf('#'), "#", ",", false, true),
    DOT(Character.valueOf('.'), ".", ".", false, false),
    FORWARD_SLASH(Character.valueOf('/'), "/", "/", false, false),
    SEMI_COLON(Character.valueOf(';'), ";", ";", true, false),
    QUERY(Character.valueOf('?'), "?", "&", true, false),
    AMP(Character.valueOf('&'), "&", "&", true, false),
    SIMPLE(null, "", ",", false, false);
    
    private final Character f7409i;
    private final String f7410j;
    private final String f7411k;
    private final boolean f7412l;
    private final boolean f7413m;

    private ak(Character ch, String str, String str2, boolean z, boolean z2) {
        this.f7409i = ch;
        this.f7410j = (String) am.m6911a((Object) str);
        this.f7411k = (String) am.m6911a((Object) str2);
        this.f7412l = z;
        this.f7413m = z2;
        if (ch != null) {
            aj.f7399a.put(ch, this);
        }
    }

    String m6634a() {
        return this.f7410j;
    }

    String m6635a(String str) {
        return this.f7413m ? C0707a.m6871c(str) : C0707a.m6869a(str);
    }

    String m6636b() {
        return this.f7411k;
    }

    boolean m6637c() {
        return this.f7412l;
    }

    int m6638d() {
        return this.f7409i == null ? 0 : 1;
    }
}
