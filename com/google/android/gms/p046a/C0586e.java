package com.google.android.gms.p046a;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C0619g;
import com.google.android.gms.internal.ob;

/* renamed from: com.google.android.gms.a.e */
public abstract class C0586e<T> {
    private final String f6044a;
    private T f6045b;

    protected C0586e(String str) {
        this.f6044a = str;
    }

    protected final T m4880a(Context context) {
        if (this.f6045b == null) {
            ob.m6315a((Object) context);
            Context d = C0619g.m4954d(context);
            if (d == null) {
                throw new C0587f("Could not get remote context.");
            }
            try {
                this.f6045b = m4881a((IBinder) d.getClassLoader().loadClass(this.f6044a).newInstance());
            } catch (Throwable e) {
                throw new C0587f("Could not load creator class.", e);
            } catch (Throwable e2) {
                throw new C0587f("Could not instantiate creator.", e2);
            } catch (Throwable e22) {
                throw new C0587f("Could not access creator.", e22);
            }
        }
        return this.f6045b;
    }

    protected abstract T m4881a(IBinder iBinder);
}
