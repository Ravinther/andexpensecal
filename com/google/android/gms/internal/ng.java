package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C0614b;

final class ng extends Handler {
    final /* synthetic */ nf f7220a;

    public ng(nf nfVar, Looper looper) {
        this.f7220a = nfVar;
        super(looper);
    }

    public void handleMessage(Message message) {
        nh nhVar;
        if (message.what == 1 && !this.f7220a.m5343f()) {
            nhVar = (nh) message.obj;
            nhVar.m6179a();
            nhVar.m6182c();
        } else if (message.what == 3) {
            this.f7220a.f6416l.m6196a(new C0614b(((Integer) message.obj).intValue(), null));
        } else if (message.what == 4) {
            this.f7220a.m5324a(4, null);
            this.f7220a.f6416l.m6193a(((Integer) message.obj).intValue());
            this.f7220a.m5326a(4, 1, null);
        } else if (message.what == 2 && !this.f7220a.m5342e()) {
            nhVar = (nh) message.obj;
            nhVar.m6179a();
            nhVar.m6182c();
        } else if (message.what == 2 || message.what == 1) {
            ((nh) message.obj).m6181b();
        } else {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
        }
    }
}
