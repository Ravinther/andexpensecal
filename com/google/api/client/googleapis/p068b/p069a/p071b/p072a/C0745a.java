package com.google.api.client.googleapis.p068b.p069a.p071b.p072a;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.C0608a;
import com.google.api.client.googleapis.p068b.p069a.p070a.C0744a;
import com.google.api.client.p051b.C0659w;
import com.google.api.client.p051b.C0661o;
import com.google.api.client.p051b.C0692t;
import com.google.api.client.p051b.ad;

/* renamed from: com.google.api.client.googleapis.b.a.b.a.a */
public class C0745a implements C0659w {
    final Context f7673a;
    final String f7674b;
    private final C0744a f7675c;
    private String f7676d;
    private Account f7677e;

    public C0745a(Context context, String str) {
        this.f7675c = new C0744a(context);
        this.f7673a = context;
        this.f7674b = str;
    }

    public static C0745a m7006a(Context context, String str, String... strArr) {
        StringBuilder append = new StringBuilder("oauth2:").append(str);
        for (String append2 : strArr) {
            append.append(' ').append(append2);
        }
        return new C0745a(context, append.toString());
    }

    public final Intent m7007a() {
        return C0608a.m4931a(this.f7677e, null, new String[]{"com.google"}, true, null, null, null, null);
    }

    public final C0745a m7008a(String str) {
        this.f7677e = this.f7675c.m7004a(str);
        if (this.f7677e == null) {
            str = null;
        }
        this.f7676d = str;
        return this;
    }

    public void m7009a(C0692t c0692t) {
        ad c0746b = new C0746b(this);
        c0692t.m6774a((C0661o) c0746b);
        c0692t.m6769a(c0746b);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String m7010b() {
        /*
        r6 = this;
        r1 = new com.google.api.client.b.f;
        r1.<init>();
    L_0x0005:
        r0 = r6.f7673a;	 Catch:{ IOException -> 0x0010 }
        r2 = r6.f7676d;	 Catch:{ IOException -> 0x0010 }
        r3 = r6.f7674b;	 Catch:{ IOException -> 0x0010 }
        r0 = com.google.android.gms.auth.C0603e.m4924a(r0, r2, r3);	 Catch:{ IOException -> 0x0010 }
        return r0;
    L_0x0010:
        r0 = move-exception;
        r2 = r1.m6667a();
        r4 = -1;
        r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r4 != 0) goto L_0x001c;
    L_0x001b:
        throw r0;
    L_0x001c:
        java.lang.Thread.sleep(r2);	 Catch:{ InterruptedException -> 0x0020 }
        goto L_0x0005;
    L_0x0020:
        r0 = move-exception;
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.googleapis.b.a.b.a.a.b():java.lang.String");
    }
}
