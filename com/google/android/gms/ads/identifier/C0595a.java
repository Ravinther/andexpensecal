package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.ads.identifier.a */
class C0595a extends Thread {
    CountDownLatch f6068a;
    boolean f6069b;
    private WeakReference<AdvertisingIdClient> f6070c;
    private long f6071d;

    public C0595a(AdvertisingIdClient advertisingIdClient, long j) {
        this.f6070c = new WeakReference(advertisingIdClient);
        this.f6071d = j;
        this.f6068a = new CountDownLatch(1);
        this.f6069b = false;
        start();
    }

    private void m4893c() {
        AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.f6070c.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.finish();
            this.f6069b = true;
        }
    }

    public void m4894a() {
        this.f6068a.countDown();
    }

    public boolean m4895b() {
        return this.f6069b;
    }

    public void run() {
        try {
            if (!this.f6068a.await(this.f6071d, TimeUnit.MILLISECONDS)) {
                m4893c();
            }
        } catch (InterruptedException e) {
            m4893c();
        }
    }
}
