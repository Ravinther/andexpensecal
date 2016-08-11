package com.google.android.gms.internal;

import android.app.Activity;
import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.p046a.C0582a;
import com.google.android.gms.p046a.C0585d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@id
public final class eq<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends ei {
    private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> f6507a;
    private final NETWORK_EXTRAS f6508b;

    public eq(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS network_extras) {
        this.f6507a = mediationAdapter;
        this.f6508b = network_extras;
    }

    private SERVER_PARAMETERS m5461a(String str, int i, String str2) {
        Map hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    hashMap.put(str3, jSONObject.getString(str3));
                }
            } catch (Throwable th) {
                ly.m6073d("Could not get MediationServerParameters.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class serverParametersType = this.f6507a.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        MediationServerParameters mediationServerParameters = (MediationServerParameters) serverParametersType.newInstance();
        mediationServerParameters.load(hashMap);
        return mediationServerParameters;
    }

    public C0582a m5462a() {
        if (this.f6507a instanceof MediationBannerAdapter) {
            try {
                return C0585d.m4878a(((MediationBannerAdapter) this.f6507a).getBannerView());
            } catch (Throwable th) {
                ly.m6073d("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            ly.m6074e("MediationAdapter is not a MediationBannerAdapter: " + this.f6507a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public void m5463a(C0582a c0582a, av avVar, String str, ek ekVar) {
        m5464a(c0582a, avVar, str, null, ekVar);
    }

    public void m5464a(C0582a c0582a, av avVar, String str, String str2, ek ekVar) {
        if (this.f6507a instanceof MediationInterstitialAdapter) {
            ly.m6065a("Requesting interstitial ad from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f6507a).requestInterstitialAd(new er(ekVar), (Activity) C0585d.m4879a(c0582a), m5461a(str, avVar.f6243g, str2), fd.m5479a(avVar), this.f6508b);
            } catch (Throwable th) {
                ly.m6073d("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            ly.m6074e("MediationAdapter is not a MediationInterstitialAdapter: " + this.f6507a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public void m5465a(C0582a c0582a, ay ayVar, av avVar, String str, ek ekVar) {
        m5466a(c0582a, ayVar, avVar, str, null, ekVar);
    }

    public void m5466a(C0582a c0582a, ay ayVar, av avVar, String str, String str2, ek ekVar) {
        if (this.f6507a instanceof MediationBannerAdapter) {
            ly.m6065a("Requesting banner ad from adapter.");
            try {
                ((MediationBannerAdapter) this.f6507a).requestBannerAd(new er(ekVar), (Activity) C0585d.m4879a(c0582a), m5461a(str, avVar.f6243g, str2), fd.m5478a(ayVar), fd.m5479a(avVar), this.f6508b);
            } catch (Throwable th) {
                ly.m6073d("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            ly.m6074e("MediationAdapter is not a MediationBannerAdapter: " + this.f6507a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public void m5467b() {
        if (this.f6507a instanceof MediationInterstitialAdapter) {
            ly.m6065a("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f6507a).showInterstitial();
            } catch (Throwable th) {
                ly.m6073d("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            ly.m6074e("MediationAdapter is not a MediationInterstitialAdapter: " + this.f6507a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public void m5468c() {
        try {
            this.f6507a.destroy();
        } catch (Throwable th) {
            ly.m6073d("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public void m5469d() {
        throw new RemoteException();
    }

    public void m5470e() {
        throw new RemoteException();
    }
}
