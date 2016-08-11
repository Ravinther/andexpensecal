package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C0619g;
import com.google.android.gms.p046a.C0585d;
import com.google.android.gms.p046a.C0586e;

@id
public final class ar extends C0586e<bf> {
    private static final ar f6235a;

    static {
        f6235a = new ar();
    }

    private ar() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public static bc m5062a(Context context, ay ayVar, String str, ed edVar) {
        if (C0619g.m4944a(context) == 0) {
            bc b = f6235a.m5063b(context, ayVar, str, edVar);
            if (b != null) {
                return b;
            }
        }
        ly.m6065a("Using AdManager from the client jar.");
        return new pb(context, ayVar, str, edVar, new gs(6587000, 6587000, true));
    }

    private bc m5063b(Context context, ay ayVar, String str, ed edVar) {
        try {
            return bd.m5114a(((bf) m4880a(context)).m5132a(C0585d.m4878a((Object) context), ayVar, str, edVar, 6587000));
        } catch (Throwable e) {
            ly.m6073d("Could not create remote AdManager.", e);
            return null;
        } catch (Throwable e2) {
            ly.m6073d("Could not create remote AdManager.", e2);
            return null;
        }
    }

    protected /* synthetic */ Object m5064a(IBinder iBinder) {
        return m5065b(iBinder);
    }

    protected bf m5065b(IBinder iBinder) {
        return bg.m5133a(iBinder);
    }
}
