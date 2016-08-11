package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.SystemClock;
import java.util.List;

@id
public class gr extends lb implements ServiceConnection {
    private final Object f6659a;
    private boolean f6660b;
    private Context f6661c;
    private ht f6662d;
    private gq f6663e;
    private gy f6664f;
    private List<gw> f6665g;
    private hc f6666h;

    public gr(Context context, ht htVar, hc hcVar) {
        this.f6659a = new Object();
        this.f6660b = false;
        this.f6665g = null;
        this.f6661c = context;
        this.f6662d = htVar;
        this.f6666h = hcVar;
        this.f6663e = new gq(context);
        this.f6664f = gy.m5665a(this.f6661c);
        this.f6665g = this.f6664f.m5669a(10);
    }

    private void m5627a(long j) {
        do {
            if (!m5630b(j)) {
                ly.m6074e("Timeout waiting for pending transaction to be processed.");
            }
        } while (!this.f6660b);
    }

    private void m5628a(gw gwVar, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("RESPONSE_CODE", 0);
        intent.putExtra("INAPP_PURCHASE_DATA", str);
        intent.putExtra("INAPP_DATA_SIGNATURE", str2);
        lx.f7093a.post(new gt(this, gwVar, intent));
    }

    private boolean m5630b(long j) {
        long elapsedRealtime = 60000 - (SystemClock.elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            return false;
        }
        try {
            this.f6659a.wait(elapsedRealtime);
        } catch (InterruptedException e) {
            ly.m6074e("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5632c() {
        /*
        r12 = this;
        r0 = r12.f6665g;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        r6 = new java.util.HashMap;
        r6.<init>();
        r0 = r12.f6665g;
        r1 = r0.iterator();
    L_0x0014:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0026;
    L_0x001a:
        r0 = r1.next();
        r0 = (com.google.android.gms.internal.gw) r0;
        r2 = r0.f6690c;
        r6.put(r2, r0);
        goto L_0x0014;
    L_0x0026:
        r0 = 0;
    L_0x0027:
        r1 = r12.f6663e;
        r2 = r12.f6661c;
        r2 = r2.getPackageName();
        r0 = r1.m5620b(r2, r0);
        if (r0 != 0) goto L_0x0055;
    L_0x0035:
        r0 = r6.keySet();
        r1 = r0.iterator();
    L_0x003d:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0008;
    L_0x0043:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        r2 = r12.f6664f;
        r0 = r6.get(r0);
        r0 = (com.google.android.gms.internal.gw) r0;
        r2.m5670a(r0);
        goto L_0x003d;
    L_0x0055:
        r1 = com.google.android.gms.internal.ha.m5703a(r0);
        if (r1 != 0) goto L_0x0035;
    L_0x005b:
        r1 = "INAPP_PURCHASE_ITEM_LIST";
        r7 = r0.getStringArrayList(r1);
        r1 = "INAPP_PURCHASE_DATA_LIST";
        r8 = r0.getStringArrayList(r1);
        r1 = "INAPP_DATA_SIGNATURE_LIST";
        r9 = r0.getStringArrayList(r1);
        r1 = "INAPP_CONTINUATION_TOKEN";
        r5 = r0.getString(r1);
        r0 = 0;
        r4 = r0;
    L_0x0075:
        r0 = r7.size();
        if (r4 >= r0) goto L_0x00b3;
    L_0x007b:
        r0 = r7.get(r4);
        r0 = r6.containsKey(r0);
        if (r0 == 0) goto L_0x00af;
    L_0x0085:
        r0 = r7.get(r4);
        r0 = (java.lang.String) r0;
        r1 = r8.get(r4);
        r1 = (java.lang.String) r1;
        r2 = r9.get(r4);
        r2 = (java.lang.String) r2;
        r3 = r6.get(r0);
        r3 = (com.google.android.gms.internal.gw) r3;
        r10 = com.google.android.gms.internal.ha.m5704a(r1);
        r11 = r3.f6689b;
        r10 = r11.equals(r10);
        if (r10 == 0) goto L_0x00af;
    L_0x00a9:
        r12.m5628a(r3, r1, r2);
        r6.remove(r0);
    L_0x00af:
        r0 = r4 + 1;
        r4 = r0;
        goto L_0x0075;
    L_0x00b3:
        if (r5 == 0) goto L_0x0035;
    L_0x00b5:
        r0 = r6.isEmpty();
        if (r0 != 0) goto L_0x0035;
    L_0x00bb:
        r0 = r5;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gr.c():void");
    }

    public void m5633a() {
        synchronized (this.f6659a) {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            this.f6661c.bindService(intent, this, 1);
            m5627a(SystemClock.elapsedRealtime());
            this.f6661c.unbindService(this);
            this.f6663e.m5618a();
        }
    }

    public void m5634b() {
        synchronized (this.f6659a) {
            this.f6661c.unbindService(this);
            this.f6663e.m5618a();
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f6659a) {
            this.f6663e.m5619a(iBinder);
            m5632c();
            this.f6660b = true;
            this.f6659a.notify();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        ly.m6070c("In-app billing service disconnected.");
        this.f6663e.m5618a();
    }
}
