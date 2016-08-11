package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.google.android.gms.C0607c;
import com.google.android.gms.internal.nf$com.google.android.gms.internal.nj;
import java.util.HashMap;

public final class no implements Callback {
    private static final Object f7237a;
    private static no f7238b;
    private final Context f7239c;
    private final HashMap<String, np> f7240d;
    private final Handler f7241e;

    static {
        f7237a = new Object();
    }

    private no(Context context) {
        this.f7241e = new Handler(context.getMainLooper(), this);
        this.f7240d = new HashMap();
        this.f7239c = context.getApplicationContext();
    }

    public static no m6198a(Context context) {
        synchronized (f7237a) {
            if (f7238b == null) {
                f7238b = new no(context.getApplicationContext());
            }
        }
        return f7238b;
    }

    public boolean m6201a(String str, nj njVar) {
        boolean d;
        synchronized (this.f7240d) {
            np npVar = (np) this.f7240d.get(str);
            if (npVar != null) {
                this.f7241e.removeMessages(0, npVar);
                if (!npVar.m6212c(njVar)) {
                    npVar.m6208a((nj) njVar);
                    switch (npVar.m6214e()) {
                        case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                            njVar.onServiceConnected(npVar.m6217h(), npVar.m6216g());
                            break;
                        case C0607c.LoadingImageView_circleCrop /*2*/:
                            npVar.m6207a();
                            break;
                        default:
                            break;
                    }
                }
                throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=" + str);
            }
            npVar = new np(this, str);
            npVar.m6208a((nj) njVar);
            npVar.m6207a();
            this.f7240d.put(str, npVar);
            d = npVar.m6213d();
        }
        return d;
    }

    public void m6202b(String str, nj njVar) {
        synchronized (this.f7240d) {
            np npVar = (np) this.f7240d.get(str);
            if (npVar == null) {
                throw new IllegalStateException("Nonexistent connection status for service action: " + str);
            } else if (npVar.m6212c(njVar)) {
                npVar.m6210b(njVar);
                if (npVar.m6215f()) {
                    this.f7241e.sendMessageDelayed(this.f7241e.obtainMessage(0, npVar), 5000);
                }
            } else {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=" + str);
            }
        }
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case C0607c.AdsAttrs_adSize /*0*/:
                np npVar = (np) message.obj;
                synchronized (this.f7240d) {
                    if (npVar.m6215f()) {
                        npVar.m6209b();
                        this.f7240d.remove(npVar.m6211c());
                    }
                    break;
                }
                return true;
            default:
                return false;
        }
    }
}
