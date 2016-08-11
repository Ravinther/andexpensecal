package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.C0607c;

@id
public class jd extends lb implements me {
    private final ee f6832a;
    private final jc f6833b;
    private final ma f6834c;
    private final Object f6835d;
    private final Context f6836e;
    private final Object f6837f;
    private final ks f6838g;
    private fj f6839h;
    private boolean f6840i;
    private dq f6841j;
    private du f6842k;
    private dz f6843l;

    public jd(Context context, ks ksVar, ma maVar, ee eeVar, jc jcVar) {
        this.f6835d = new Object();
        this.f6837f = new Object();
        this.f6840i = false;
        this.f6836e = context;
        this.f6838g = ksVar;
        this.f6839h = ksVar.f6999b;
        this.f6834c = maVar;
        this.f6832a = eeVar;
        this.f6833b = jcVar;
        this.f6842k = ksVar.f7000c;
    }

    private void m5801a(fh fhVar, long j) {
        synchronized (this.f6835d) {
            this.f6841j = new dq(this.f6836e, fhVar, this.f6832a, this.f6842k);
        }
        this.f6843l = this.f6841j.m5363a(j, 60000);
        switch (this.f6843l.f6485a) {
            case C0607c.AdsAttrs_adSize /*0*/:
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                throw new ji("No fill from any mediation ad networks.", 3);
            default:
                throw new ji("Unexpected mediation result: " + this.f6843l.f6485a, 0);
        }
    }

    private void m5803b(long j) {
        lx.f7093a.post(new jg(this));
        m5805c(j);
    }

    private void m5805c(long j) {
        while (m5807d(j)) {
            if (this.f6840i) {
                return;
            }
        }
        throw new ji("Timed out waiting for WebView to finish loading.", 2);
    }

    private boolean m5807d(long j) {
        long elapsedRealtime = 60000 - (SystemClock.elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            return false;
        }
        try {
            this.f6837f.wait(elapsedRealtime);
            return true;
        } catch (InterruptedException e) {
            throw new ji("Ad request cancelled.", -1);
        }
    }

    public void m5808a() {
        synchronized (this.f6837f) {
            ly.m6065a("AdRendererBackgroundTask started.");
            fh fhVar = this.f6838g.f6998a;
            int i = this.f6838g.f7002e;
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f6839h.f6562h) {
                    m5801a(fhVar, elapsedRealtime);
                } else if (this.f6839h.f6570p) {
                    m5809a(elapsedRealtime);
                } else {
                    m5803b(elapsedRealtime);
                }
            } catch (ji e) {
                i = e.m5812a();
                if (i == 3 || i == -1) {
                    ly.m6070c(e.getMessage());
                } else {
                    ly.m6074e(e.getMessage());
                }
                if (this.f6839h == null) {
                    this.f6839h = new fj(i);
                } else {
                    this.f6839h = new fj(i, this.f6839h.f6565k);
                }
                lx.f7093a.post(new je(this));
            }
            lx.f7093a.post(new jf(this, new kr(fhVar.f6540c, this.f6834c, this.f6839h.f6558d, i, this.f6839h.f6560f, this.f6839h.f6564j, this.f6839h.f6566l, this.f6839h.f6565k, fhVar.f6546i, this.f6839h.f6562h, this.f6843l != null ? this.f6843l.f6486b : null, this.f6843l != null ? this.f6843l.f6487c : null, this.f6843l != null ? this.f6843l.f6488d : AdMobAdapter.class.getName(), this.f6842k, this.f6843l != null ? this.f6843l.f6489e : null, this.f6839h.f6563i, this.f6838g.f7001d, this.f6839h.f6561g, this.f6838g.f7003f, this.f6839h.f6568n, this.f6839h.f6569o, this.f6838g.f7005h, null)));
        }
    }

    protected void m5809a(long j) {
        int i;
        int i2;
        ay e = this.f6834c.m6096e();
        if (e.f6257e) {
            i = this.f6836e.getResources().getDisplayMetrics().widthPixels;
            i2 = this.f6836e.getResources().getDisplayMetrics().heightPixels;
        } else {
            i = e.f6259g;
            i2 = e.f6256d;
        }
        iz izVar = new iz(this, this.f6834c, i, i2);
        lx.f7093a.post(new jh(this, izVar));
        m5805c(j);
        if (izVar.m5794c()) {
            ly.m6065a("Ad-Network indicated no fill with passback URL.");
            throw new ji("AdNetwork sent passback url", 3);
        } else if (!izVar.m5795d()) {
            throw new ji("AdNetwork timed out", 2);
        }
    }

    public void m5810a(ma maVar) {
        synchronized (this.f6837f) {
            ly.m6065a("WebView finished loading.");
            this.f6840i = true;
            this.f6837f.notify();
        }
    }

    public void m5811b() {
        synchronized (this.f6835d) {
            this.f6834c.stopLoading();
            li.m6012a(this.f6834c);
            if (this.f6841j != null) {
                this.f6841j.m5364a();
            }
        }
    }
}
