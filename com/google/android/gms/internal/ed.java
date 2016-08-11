package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.Map;

@id
public final class ed extends ef {
    private Map<Class<? extends NetworkExtras>, NetworkExtras> f6495a;

    private <NETWORK_EXTRAS extends com.google.ads.mediation.NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> eh m5420c(String str) {
        try {
            Class cls = Class.forName(str, false, ed.class.getClassLoader());
            if (MediationAdapter.class.isAssignableFrom(cls)) {
                MediationAdapter mediationAdapter = (MediationAdapter) cls.newInstance();
                return new eq(mediationAdapter, (com.google.ads.mediation.NetworkExtras) this.f6495a.get(mediationAdapter.getAdditionalParametersType()));
            } else if (com.google.android.gms.ads.mediation.MediationAdapter.class.isAssignableFrom(cls)) {
                return new eo((com.google.android.gms.ads.mediation.MediationAdapter) cls.newInstance());
            } else {
                ly.m6074e("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            }
        } catch (Throwable th) {
            ly.m6074e("Could not instantiate mediation adapter: " + str + ". " + th.getMessage());
            RemoteException remoteException = new RemoteException();
        }
    }

    public eh m5421a(String str) {
        return m5420c(str);
    }

    public void m5422a(Map<Class<? extends NetworkExtras>, NetworkExtras> map) {
        this.f6495a = map;
    }

    public boolean m5423b(String str) {
        boolean z = false;
        try {
            z = CustomEvent.class.isAssignableFrom(Class.forName(str, false, ed.class.getClassLoader()));
        } catch (Throwable th) {
            ly.m6074e("Could not load custom event implementation class: " + str + ", assuming old implementation.");
        }
        return z;
    }
}
