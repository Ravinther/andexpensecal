package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.common.C0614b;
import com.google.android.gms.internal.nf.com/google/android/gms/internal/nh;

public final class nk extends com/google/android/gms/internal/nh<Boolean> {
    public final int f7226b;
    public final Bundle f7227c;
    public final IBinder f7228d;
    final /* synthetic */ nf f7229e;

    public nk(nf nfVar, int i, IBinder iBinder, Bundle bundle) {
        this.f7229e = nfVar;
        super(nfVar, Boolean.valueOf(true));
        this.f7226b = i;
        this.f7228d = iBinder;
        this.f7227c = bundle;
    }

    protected void m6187a() {
    }

    protected void m6188a(Boolean bool) {
        if (bool == null) {
            this.f7229e.m5324a(1, null);
            return;
        }
        switch (this.f7226b) {
            case C0607c.AdsAttrs_adSize /*0*/:
                try {
                    if (this.f7229e.m5339b().equals(this.f7228d.getInterfaceDescriptor())) {
                        IInterface b = this.f7229e.m5338b(this.f7228d);
                        if (b != null) {
                            this.f7229e.m5324a(3, b);
                            this.f7229e.f6416l.m6192a();
                            return;
                        }
                    }
                } catch (RemoteException e) {
                }
                no.m6198a(this.f7229e.f6406a).m6202b(this.f7229e.m5331a(), this.f7229e.f6413i);
                this.f7229e.f6413i = null;
                this.f7229e.m5324a(1, null);
                this.f7229e.f6416l.m6196a(new C0614b(8, null));
            case adv.TitlePageIndicator_footerPadding /*10*/:
                this.f7229e.m5324a(1, null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            default:
                PendingIntent pendingIntent = this.f7227c != null ? (PendingIntent) this.f7227c.getParcelable("pendingIntent") : null;
                if (this.f7229e.f6413i != null) {
                    no.m6198a(this.f7229e.f6406a).m6202b(this.f7229e.m5331a(), this.f7229e.f6413i);
                    this.f7229e.f6413i = null;
                }
                this.f7229e.m5324a(1, null);
                this.f7229e.f6416l.m6196a(new C0614b(this.f7226b, pendingIntent));
        }
    }

    protected /* synthetic */ void m6189a(Object obj) {
        m6188a((Boolean) obj);
    }
}
