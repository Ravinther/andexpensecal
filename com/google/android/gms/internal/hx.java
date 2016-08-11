package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.p046a.C0585d;
import com.google.android.gms.p046a.C0586e;

@id
public final class hx extends C0586e<hn> {
    private static final hx f6731a;

    static {
        f6731a = new hx();
    }

    private hx() {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    public static hk m5737a(Activity activity) {
        try {
            if (!m5738b(activity)) {
                return f6731a.m5739c(activity);
            }
            ly.m6065a("Using AdOverlay from the client jar.");
            return new gv(activity);
        } catch (hy e) {
            ly.m6074e(e.getMessage());
            return null;
        }
    }

    private static boolean m5738b(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent.hasExtra("com.google.android.gms.ads.internal.purchase.useClientJar")) {
            return intent.getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false);
        }
        throw new hy("InAppPurchaseManager requires the useClientJar flag in intent extras.");
    }

    private hk m5739c(Activity activity) {
        try {
            return hl.m5648a(((hn) m4880a((Context) activity)).m5723a(C0585d.m4878a((Object) activity)));
        } catch (Throwable e) {
            ly.m6073d("Could not create remote InAppPurchaseManager.", e);
            return null;
        } catch (Throwable e2) {
            ly.m6073d("Could not create remote InAppPurchaseManager.", e2);
            return null;
        }
    }

    protected /* synthetic */ Object m5740a(IBinder iBinder) {
        return m5741b(iBinder);
    }

    protected hn m5741b(IBinder iBinder) {
        return ho.m5724a(iBinder);
    }
}
