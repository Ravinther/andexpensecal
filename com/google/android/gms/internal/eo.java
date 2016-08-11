package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C0590a;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.p046a.C0582a;
import com.google.android.gms.p046a.C0585d;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

@id
public final class eo extends ei {
    private final MediationAdapter f6505a;

    public eo(MediationAdapter mediationAdapter) {
        this.f6505a = mediationAdapter;
    }

    private Bundle m5451a(String str, int i, String str2) {
        ly.m6074e("Server parameters: " + str);
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    bundle2.putString(str3, jSONObject.getString(str3));
                }
                bundle = bundle2;
            }
            if (this.f6505a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                bundle.putInt("tagForChildDirectedTreatment", i);
            }
            return bundle;
        } catch (Throwable th) {
            ly.m6073d("Could not get Server Parameters Bundle.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public C0582a m5452a() {
        if (this.f6505a instanceof MediationBannerAdapter) {
            try {
                return C0585d.m4878a(((MediationBannerAdapter) this.f6505a).getBannerView());
            } catch (Throwable th) {
                ly.m6073d("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            ly.m6074e("MediationAdapter is not a MediationBannerAdapter: " + this.f6505a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public void m5453a(C0582a c0582a, av avVar, String str, ek ekVar) {
        m5454a(c0582a, avVar, str, null, ekVar);
    }

    public void m5454a(C0582a c0582a, av avVar, String str, String str2, ek ekVar) {
        if (this.f6505a instanceof MediationInterstitialAdapter) {
            ly.m6065a("Requesting interstitial ad from adapter.");
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f6505a;
                mediationInterstitialAdapter.requestInterstitialAd((Context) C0585d.m4879a(c0582a), new ep(ekVar), m5451a(str, avVar.f6243g, str2), new en(new Date(avVar.f6238b), avVar.f6240d, avVar.f6241e != null ? new HashSet(avVar.f6241e) : null, avVar.f6247k, avVar.f6242f, avVar.f6243g), avVar.f6249m != null ? avVar.f6249m.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
            } catch (Throwable th) {
                ly.m6073d("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            ly.m6074e("MediationAdapter is not a MediationInterstitialAdapter: " + this.f6505a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public void m5455a(C0582a c0582a, ay ayVar, av avVar, String str, ek ekVar) {
        m5456a(c0582a, ayVar, avVar, str, null, ekVar);
    }

    public void m5456a(C0582a c0582a, ay ayVar, av avVar, String str, String str2, ek ekVar) {
        Bundle bundle = null;
        if (this.f6505a instanceof MediationBannerAdapter) {
            ly.m6065a("Requesting banner ad from adapter.");
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f6505a;
                en enVar = new en(new Date(avVar.f6238b), avVar.f6240d, avVar.f6241e != null ? new HashSet(avVar.f6241e) : null, avVar.f6247k, avVar.f6242f, avVar.f6243g);
                if (avVar.f6249m != null) {
                    bundle = avVar.f6249m.getBundle(mediationBannerAdapter.getClass().getName());
                }
                mediationBannerAdapter.requestBannerAd((Context) C0585d.m4879a(c0582a), new ep(ekVar), m5451a(str, avVar.f6243g, str2), C0590a.m4885a(ayVar.f6258f, ayVar.f6255c, ayVar.f6254b), enVar, bundle);
            } catch (Throwable th) {
                ly.m6073d("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            ly.m6074e("MediationAdapter is not a MediationBannerAdapter: " + this.f6505a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public void m5457b() {
        if (this.f6505a instanceof MediationInterstitialAdapter) {
            ly.m6065a("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f6505a).showInterstitial();
            } catch (Throwable th) {
                ly.m6073d("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            ly.m6074e("MediationAdapter is not a MediationInterstitialAdapter: " + this.f6505a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public void m5458c() {
        try {
            this.f6505a.onDestroy();
        } catch (Throwable th) {
            ly.m6073d("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public void m5459d() {
        try {
            this.f6505a.onPause();
        } catch (Throwable th) {
            ly.m6073d("Could not pause adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public void m5460e() {
        try {
            this.f6505a.onResume();
        } catch (Throwable th) {
            ly.m6073d("Could not resume adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }
}
