package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.C0614b;
import com.google.android.gms.common.api.C0610b;
import com.google.android.gms.common.api.C0612c;

public final class dh implements C0610b, C0612c {
    private final di f6402a;
    private final dj f6403b;
    private final Object f6404c;

    public dh(Context context, di diVar) {
        this(context, diVar, false);
    }

    dh(Context context, di diVar, boolean z) {
        this.f6404c = new Object();
        this.f6402a = diVar;
        this.f6403b = new dj(context, this, this, 6587000);
        if (!z) {
            this.f6403b.m5341d();
        }
    }

    public void m5315a(int i) {
        ly.m6065a("Disconnected from remote ad request service.");
    }

    public void m5316a(Bundle bundle) {
        Bundle a;
        Bundle a2 = bt.m5224a();
        synchronized (this.f6404c) {
            try {
                dk c = this.f6403b.m5355c();
                a = c != null ? c.m5356a() : a2;
                if (this.f6403b.m5342e() || this.f6403b.m5343f()) {
                    this.f6403b.m5344g();
                }
            } catch (Throwable e) {
                ly.m6073d("Error when get Gservice values", e);
                if (this.f6403b.m5342e() || this.f6403b.m5343f()) {
                    this.f6403b.m5344g();
                    a = a2;
                }
                a = a2;
            } catch (Throwable e2) {
                ly.m6073d("Error when get Gservice values", e2);
                if (this.f6403b.m5342e() || this.f6403b.m5343f()) {
                    this.f6403b.m5344g();
                    a = a2;
                }
                a = a2;
            } catch (Throwable th) {
                if (this.f6403b.m5342e() || this.f6403b.m5343f()) {
                    this.f6403b.m5344g();
                }
            }
        }
        this.f6402a.m5318a(a);
    }

    public void m5317a(C0614b c0614b) {
        this.f6402a.m5318a(bt.m5224a());
    }
}
