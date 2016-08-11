package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

public final class ni extends nt {
    private nf f7224a;

    public ni(nf nfVar) {
        this.f7224a = nfVar;
    }

    public void m6186a(int i, IBinder iBinder, Bundle bundle) {
        ob.m6316a((Object) "onPostInitComplete can be called only once per call to getServiceFromBroker", this.f7224a);
        this.f7224a.m5333a(i, iBinder, bundle);
        this.f7224a = null;
    }
}
