package com.google.android.gms.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.purchase.InAppPurchaseActivity;

@id
public class gv extends hl implements ServiceConnection {
    private final Activity f6679a;
    private final gy f6680b;
    private Context f6681c;
    private he f6682d;
    private gq f6683e;
    private gw f6684f;
    private hb f6685g;
    private hc f6686h;
    private String f6687i;

    public gv(Activity activity) {
        this.f6687i = null;
        this.f6679a = activity;
        this.f6680b = gy.m5665a(this.f6679a.getApplicationContext());
    }

    public static void m5649a(Context context, boolean z, ea eaVar) {
        Intent intent = new Intent();
        intent.setClassName(context, InAppPurchaseActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", z);
        ea.m5410a(intent, eaVar);
        context.startActivity(intent);
    }

    private void m5650a(String str, boolean z, int i, Intent intent) {
        if (this.f6685g != null) {
            this.f6685g.m5708a(str, z, i, intent, this.f6684f);
        }
    }

    public void m5651a() {
        ea a = ea.m5409a(this.f6679a.getIntent());
        this.f6685g = a.f6494e;
        this.f6686h = a.f6491b;
        this.f6682d = a.f6492c;
        this.f6683e = new gq(this.f6679a.getApplicationContext());
        this.f6681c = a.f6493d;
        if (this.f6679a.getResources().getConfiguration().orientation == 2) {
            this.f6679a.setRequestedOrientation(6);
        } else {
            this.f6679a.setRequestedOrientation(7);
        }
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        this.f6679a.bindService(intent, this, 1);
    }

    public void m5652a(int i, int i2, Intent intent) {
        if (i == 1001) {
            boolean z = false;
            try {
                int a = ha.m5702a(intent);
                if (i2 != -1 || a != 0) {
                    this.f6680b.m5670a(this.f6684f);
                } else if (this.f6686h.m5710a(this.f6687i, i2, intent)) {
                    z = true;
                }
                this.f6682d.m5637c(a);
                this.f6679a.finish();
                m5650a(this.f6682d.m5635a(), z, i2, intent);
            } catch (RemoteException e) {
                ly.m6074e("Fail to process purchase result.");
                this.f6679a.finish();
            } finally {
                this.f6687i = null;
            }
        }
    }

    public void m5653b() {
        this.f6679a.unbindService(this);
        this.f6683e.m5618a();
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Throwable e;
        this.f6683e.m5619a(iBinder);
        try {
            this.f6687i = this.f6686h.m5709a();
            Bundle a = this.f6683e.m5617a(this.f6679a.getPackageName(), this.f6682d.m5635a(), this.f6687i);
            PendingIntent pendingIntent = (PendingIntent) a.getParcelable("BUY_INTENT");
            if (pendingIntent == null) {
                int a2 = ha.m5703a(a);
                this.f6682d.m5637c(a2);
                m5650a(this.f6682d.m5635a(), false, a2, null);
                this.f6679a.finish();
                return;
            }
            this.f6684f = new gw(this.f6682d.m5635a(), this.f6687i);
            this.f6680b.m5672b(this.f6684f);
            this.f6679a.startIntentSenderForResult(pendingIntent.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        } catch (RemoteException e2) {
            e = e2;
            ly.m6073d("Error when connecting in-app billing service", e);
            this.f6679a.finish();
        } catch (SendIntentException e3) {
            e = e3;
            ly.m6073d("Error when connecting in-app billing service", e);
            this.f6679a.finish();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        ly.m6070c("In-app billing service disconnected.");
        this.f6683e.m5618a();
    }
}
