package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.C0610b;

final class nm extends Handler {
    final /* synthetic */ nl f7236a;

    public nm(nl nlVar, Looper looper) {
        this.f7236a = nlVar;
        super(looper);
    }

    public void handleMessage(Message message) {
        if (message.what == 1) {
            synchronized (this.f7236a.f7232c) {
                if (this.f7236a.f7231b.m5321l() && this.f7236a.f7231b.m5319e() && this.f7236a.f7232c.contains(message.obj)) {
                    ((C0610b) message.obj).m4936a(this.f7236a.f7231b.m5320j());
                }
            }
            return;
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
    }
}
