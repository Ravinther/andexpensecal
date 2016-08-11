package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.p046a.C0585d;
import com.google.android.gms.p046a.C0586e;

@id
public final class gg extends C0586e<gl> {
    private static final gg f6652a;

    static {
        f6652a = new gg();
    }

    private gg() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static gi m5592a(Activity activity) {
        try {
            if (!m5593b(activity)) {
                return f6652a.m5594c(activity);
            }
            ly.m6065a("Using AdOverlay from the client jar.");
            return new fu(activity);
        } catch (gh e) {
            ly.m6074e(e.getMessage());
            return null;
        }
    }

    private static boolean m5593b(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            return intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        throw new gh("Ad overlay requires the useClientJar flag in intent extras.");
    }

    private gi m5594c(Activity activity) {
        try {
            return gj.m5532a(((gl) m4880a((Context) activity)).m5606a(C0585d.m4878a((Object) activity)));
        } catch (Throwable e) {
            ly.m6073d("Could not create remote AdOverlay.", e);
            return null;
        } catch (Throwable e2) {
            ly.m6073d("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    protected /* synthetic */ Object m5595a(IBinder iBinder) {
        return m5596b(iBinder);
    }

    protected gl m5596b(IBinder iBinder) {
        return gm.m5607a(iBinder);
    }
}
