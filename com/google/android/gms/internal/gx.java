package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

@id
public final class gx extends hr implements ServiceConnection {
    private boolean f6691a;
    private Context f6692b;
    private int f6693c;
    private Intent f6694d;
    private gq f6695e;
    private gw f6696f;
    private String f6697g;

    public gx(Context context, String str, boolean z, int i, Intent intent, gw gwVar) {
        this.f6691a = false;
        this.f6697g = str;
        this.f6693c = i;
        this.f6694d = intent;
        this.f6691a = z;
        this.f6692b = context;
        this.f6696f = gwVar;
    }

    public boolean m5660a() {
        return this.f6691a;
    }

    public String m5661b() {
        return this.f6697g;
    }

    public Intent m5662c() {
        return this.f6694d;
    }

    public int m5663d() {
        return this.f6693c;
    }

    public void m5664e() {
        int a = ha.m5702a(this.f6694d);
        if (this.f6693c == -1 && a == 0) {
            this.f6695e = new gq(this.f6692b);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            this.f6692b.bindService(intent, this, 1);
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ly.m6070c("In-app billing service connected.");
        this.f6695e.m5619a(iBinder);
        String b = ha.m5706b(ha.m5705b(this.f6694d));
        if (b != null) {
            if (this.f6695e.m5616a(this.f6692b.getPackageName(), b) == 0) {
                gy.m5665a(this.f6692b).m5670a(this.f6696f);
            }
            this.f6692b.unbindService(this);
            this.f6695e.m5618a();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        ly.m6070c("In-app billing service disconnected.");
        this.f6695e.m5618a();
    }
}
