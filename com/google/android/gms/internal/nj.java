package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class nj implements ServiceConnection {
    final /* synthetic */ nf f7225a;

    public nj(nf nfVar) {
        this.f7225a = nfVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f7225a.m5340c(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f7225a.f6407b.sendMessage(this.f7225a.f6407b.obtainMessage(4, Integer.valueOf(1)));
    }
}
