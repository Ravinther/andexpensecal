package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.C0610b;
import com.google.android.gms.common.api.C0612c;

@id
public class dj extends nf<dk> {
    final int f6417a;

    public dj(Context context, C0610b c0610b, C0612c c0612c, int i) {
        super(context, context.getMainLooper(), c0610b, c0612c, new String[0]);
        this.f6417a = i;
    }

    protected dk m5350a(IBinder iBinder) {
        return dl.m5357a(iBinder);
    }

    protected String m5351a() {
        return "com.google.android.gms.ads.gservice.START";
    }

    protected void m5352a(nv nvVar, ni niVar) {
        nvVar.m6247g(niVar, this.f6417a, m5345h().getPackageName(), new Bundle());
    }

    protected /* synthetic */ IInterface m5353b(IBinder iBinder) {
        return m5350a(iBinder);
    }

    protected String m5354b() {
        return "com.google.android.gms.ads.internal.gservice.IGservicesValueService";
    }

    public dk m5355c() {
        return (dk) super.m5348k();
    }
}
