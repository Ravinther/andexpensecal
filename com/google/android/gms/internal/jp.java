package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.C0610b;
import com.google.android.gms.common.api.C0612c;

@id
public class jp extends nf<jt> {
    final int f6864a;

    public jp(Context context, C0610b c0610b, C0612c c0612c, int i) {
        super(context, context.getMainLooper(), c0610b, c0612c, new String[0]);
        this.f6864a = i;
    }

    protected jt m5828a(IBinder iBinder) {
        return ju.m5841a(iBinder);
    }

    protected String m5829a() {
        return "com.google.android.gms.ads.service.START";
    }

    protected void m5830a(nv nvVar, ni niVar) {
        nvVar.m6247g(niVar, this.f6864a, m5345h().getPackageName(), new Bundle());
    }

    protected /* synthetic */ IInterface m5831b(IBinder iBinder) {
        return m5828a(iBinder);
    }

    protected String m5832b() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public jt m5833c() {
        return (jt) super.m5348k();
    }
}
