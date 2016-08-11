package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C0611d;
import com.google.android.gms.common.C0614b;
import com.google.android.gms.common.api.C0610b;
import java.util.ArrayList;
import java.util.Iterator;

public final class nl {
    final ArrayList<C0610b> f7230a;
    private final nn f7231b;
    private final ArrayList<C0610b> f7232c;
    private boolean f7233d;
    private final ArrayList<C0611d> f7234e;
    private final Handler f7235f;

    public nl(Context context, Looper looper, nn nnVar) {
        this.f7232c = new ArrayList();
        this.f7230a = new ArrayList();
        this.f7233d = false;
        this.f7234e = new ArrayList();
        this.f7231b = nnVar;
        this.f7235f = new nm(this, looper);
    }

    protected void m6192a() {
        synchronized (this.f7232c) {
            m6194a(this.f7231b.m5320j());
        }
    }

    public void m6193a(int i) {
        this.f7235f.removeMessages(1);
        synchronized (this.f7232c) {
            this.f7233d = true;
            Iterator it = new ArrayList(this.f7232c).iterator();
            while (it.hasNext()) {
                C0610b c0610b = (C0610b) it.next();
                if (!this.f7231b.m5321l()) {
                    break;
                } else if (this.f7232c.contains(c0610b)) {
                    c0610b.m4935a(i);
                }
            }
            this.f7233d = false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m6194a(android.os.Bundle r6) {
        /*
        r5 = this;
        r1 = 0;
        r0 = 1;
        r3 = r5.f7232c;
        monitor-enter(r3);
        r2 = r5.f7233d;	 Catch:{ all -> 0x0062 }
        if (r2 != 0) goto L_0x0052;
    L_0x0009:
        r2 = r0;
    L_0x000a:
        com.google.android.gms.internal.ob.m6319a(r2);	 Catch:{ all -> 0x0062 }
        r2 = r5.f7235f;	 Catch:{ all -> 0x0062 }
        r4 = 1;
        r2.removeMessages(r4);	 Catch:{ all -> 0x0062 }
        r2 = 1;
        r5.f7233d = r2;	 Catch:{ all -> 0x0062 }
        r2 = r5.f7230a;	 Catch:{ all -> 0x0062 }
        r2 = r2.size();	 Catch:{ all -> 0x0062 }
        if (r2 != 0) goto L_0x0054;
    L_0x001e:
        com.google.android.gms.internal.ob.m6319a(r0);	 Catch:{ all -> 0x0062 }
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0062 }
        r1 = r5.f7232c;	 Catch:{ all -> 0x0062 }
        r0.<init>(r1);	 Catch:{ all -> 0x0062 }
        r1 = r0.iterator();	 Catch:{ all -> 0x0062 }
    L_0x002c:
        r0 = r1.hasNext();	 Catch:{ all -> 0x0062 }
        if (r0 == 0) goto L_0x0048;
    L_0x0032:
        r0 = r1.next();	 Catch:{ all -> 0x0062 }
        r0 = (com.google.android.gms.common.api.C0610b) r0;	 Catch:{ all -> 0x0062 }
        r2 = r5.f7231b;	 Catch:{ all -> 0x0062 }
        r2 = r2.m5321l();	 Catch:{ all -> 0x0062 }
        if (r2 == 0) goto L_0x0048;
    L_0x0040:
        r2 = r5.f7231b;	 Catch:{ all -> 0x0062 }
        r2 = r2.m5319e();	 Catch:{ all -> 0x0062 }
        if (r2 != 0) goto L_0x0056;
    L_0x0048:
        r0 = r5.f7230a;	 Catch:{ all -> 0x0062 }
        r0.clear();	 Catch:{ all -> 0x0062 }
        r0 = 0;
        r5.f7233d = r0;	 Catch:{ all -> 0x0062 }
        monitor-exit(r3);	 Catch:{ all -> 0x0062 }
        return;
    L_0x0052:
        r2 = r1;
        goto L_0x000a;
    L_0x0054:
        r0 = r1;
        goto L_0x001e;
    L_0x0056:
        r2 = r5.f7230a;	 Catch:{ all -> 0x0062 }
        r2 = r2.contains(r0);	 Catch:{ all -> 0x0062 }
        if (r2 != 0) goto L_0x002c;
    L_0x005e:
        r0.m4936a(r6);	 Catch:{ all -> 0x0062 }
        goto L_0x002c;
    L_0x0062:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0062 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nl.a(android.os.Bundle):void");
    }

    public void m6195a(C0610b c0610b) {
        ob.m6315a((Object) c0610b);
        synchronized (this.f7232c) {
            if (this.f7232c.contains(c0610b)) {
                Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + c0610b + " is already registered");
            } else {
                this.f7232c.add(c0610b);
            }
        }
        if (this.f7231b.m5319e()) {
            this.f7235f.sendMessage(this.f7235f.obtainMessage(1, c0610b));
        }
    }

    public void m6196a(C0614b c0614b) {
        this.f7235f.removeMessages(1);
        synchronized (this.f7234e) {
            Iterator it = new ArrayList(this.f7234e).iterator();
            while (it.hasNext()) {
                C0611d c0611d = (C0611d) it.next();
                if (!this.f7231b.m5321l()) {
                    return;
                } else if (this.f7234e.contains(c0611d)) {
                    c0611d.m4937a(c0614b);
                }
            }
        }
    }

    public void m6197a(C0611d c0611d) {
        ob.m6315a((Object) c0611d);
        synchronized (this.f7234e) {
            if (this.f7234e.contains(c0611d)) {
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + c0611d + " is already registered");
            } else {
                this.f7234e.add(c0611d);
            }
        }
    }
}
