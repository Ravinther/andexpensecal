package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.google.android.gms.common.i */
public class C0620i implements ServiceConnection {
    boolean f6146a;
    private final BlockingQueue<IBinder> f6147b;

    public C0620i() {
        this.f6146a = false;
        this.f6147b = new LinkedBlockingQueue();
    }

    public IBinder m4956a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
        } else if (this.f6146a) {
            throw new IllegalStateException();
        } else {
            this.f6146a = true;
            return (IBinder) this.f6147b.take();
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f6147b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
