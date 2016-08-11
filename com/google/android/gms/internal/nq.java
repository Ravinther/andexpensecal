package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;

public class nq implements ServiceConnection {
    final /* synthetic */ np f7250a;

    public nq(np npVar) {
        this.f7250a = npVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f7250a.f7242a.f7240d) {
            this.f7250a.f7248g = iBinder;
            this.f7250a.f7249h = componentName;
            Iterator it = this.f7250a.f7245d.iterator();
            while (it.hasNext()) {
                ((nj) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f7250a.f7246e = 1;
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f7250a.f7242a.f7240d) {
            this.f7250a.f7248g = null;
            this.f7250a.f7249h = componentName;
            Iterator it = this.f7250a.f7245d.iterator();
            while (it.hasNext()) {
                ((nj) it.next()).onServiceDisconnected(componentName);
            }
            this.f7250a.f7246e = 2;
        }
    }
}
