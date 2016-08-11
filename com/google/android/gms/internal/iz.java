package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

@id
public class iz implements Runnable {
    protected final ma f6818a;
    protected boolean f6819b;
    protected boolean f6820c;
    private final Handler f6821d;
    private final long f6822e;
    private long f6823f;
    private me f6824g;
    private final int f6825h;
    private final int f6826i;

    public iz(me meVar, ma maVar, int i, int i2) {
        this(meVar, maVar, i, i2, 200, 50);
    }

    public iz(me meVar, ma maVar, int i, int i2, long j, long j2) {
        this.f6822e = j;
        this.f6823f = j2;
        this.f6821d = new Handler(Looper.getMainLooper());
        this.f6818a = maVar;
        this.f6824g = meVar;
        this.f6819b = false;
        this.f6820c = false;
        this.f6825h = i2;
        this.f6826i = i;
    }

    static /* synthetic */ long m5785c(iz izVar) {
        long j = izVar.f6823f - 1;
        izVar.f6823f = j;
        return j;
    }

    public void m5790a() {
        this.f6821d.postDelayed(this, this.f6822e);
    }

    public void m5791a(fj fjVar) {
        m5792a(fjVar, new mp(this, this.f6818a, fjVar.f6571q));
    }

    public void m5792a(fj fjVar, mp mpVar) {
        this.f6818a.setWebViewClient(mpVar);
        this.f6818a.loadDataWithBaseURL(TextUtils.isEmpty(fjVar.f6556b) ? null : li.m5999a(fjVar.f6556b), fjVar.f6557c, "text/html", "UTF-8", null);
    }

    public synchronized void m5793b() {
        this.f6819b = true;
    }

    public synchronized boolean m5794c() {
        return this.f6819b;
    }

    public boolean m5795d() {
        return this.f6820c;
    }

    public void run() {
        if (this.f6818a == null || m5794c()) {
            this.f6824g.m5558a(this.f6818a);
        } else {
            new ja(this, this.f6818a).execute(new Void[0]);
        }
    }
}
