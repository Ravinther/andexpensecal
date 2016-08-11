package com.dropbox.client2.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.dropbox.client2.p030c.C0358a;
import com.dropbox.client2.p030c.C0375k;
import com.dropbox.client2.p030c.C0376l;
import com.dropbox.client2.p030c.C0377n;

/* renamed from: com.dropbox.client2.android.a */
public class C0359a extends C0358a {
    public C0359a(C0376l c0376l, C0377n c0377n) {
        super(c0376l, c0377n);
    }

    public C0359a(C0376l c0376l, C0377n c0377n, C0375k c0375k) {
        super(c0376l, c0377n, c0375k);
    }

    public void m2326a(Context context) {
        C0376l d = m2317d();
        if (AuthActivity.m2296a(context, d.a, true)) {
            AuthActivity.m2294a(d.a, d.b);
            Intent intent = new Intent(context, AuthActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }

    public boolean m2327a() {
        Intent intent = AuthActivity.f2339a;
        if (intent == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra("ACCESS_TOKEN");
        String stringExtra2 = intent.getStringExtra("ACCESS_SECRET");
        String stringExtra3 = intent.getStringExtra("UID");
        return (stringExtra == null || stringExtra.equals("") || stringExtra2 == null || stringExtra2.equals("") || stringExtra3 == null || stringExtra3.equals("")) ? false : true;
    }

    public String m2328b() {
        Intent intent = AuthActivity.f2339a;
        if (intent == null) {
            throw new IllegalStateException();
        }
        String stringExtra = intent.getStringExtra("ACCESS_TOKEN");
        if (stringExtra == null || stringExtra.length() == 0) {
            throw new IllegalArgumentException("Invalid result intent passed in. Missing access token.");
        }
        String stringExtra2 = intent.getStringExtra("ACCESS_SECRET");
        if (stringExtra2 == null || stringExtra2.length() == 0) {
            throw new IllegalArgumentException("Invalid result intent passed in. Missing access secret.");
        }
        String stringExtra3 = intent.getStringExtra("UID");
        if (stringExtra3 == null || stringExtra3.length() == 0) {
            throw new IllegalArgumentException("Invalid result intent passed in. Missing uid.");
        }
        if (stringExtra.equals("oauth2:")) {
            m2313a(stringExtra2);
        } else {
            m2312a(new C0375k(stringExtra, stringExtra2));
        }
        return stringExtra3;
    }

    public void m2329c() {
        super.m2316c();
        AuthActivity.f2339a = null;
    }
}
