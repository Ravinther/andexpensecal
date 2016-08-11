package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import com.google.android.gms.common.C0619g;
import com.google.android.gms.p046a.C0582a;
import com.google.android.gms.p046a.C0585d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@id
public class pb extends bd implements co, da, dc, dv, ga, gf, hb, C0638if, jc, ky, pa, pl {
    private av f7286a;
    private final ee f7287b;
    private final ph f7288c;
    private final C0628b f7289d;
    private final C0634g f7290e;
    private boolean f7291f;
    private final ComponentCallbacks f7292g;

    public pb(Context context, ay ayVar, String str, ee eeVar, gs gsVar) {
        this(new ph(context, ayVar, str, gsVar), eeVar, null);
    }

    pb(ph phVar, ee eeVar, C0628b c0628b) {
        this.f7292g = new pc(this);
        this.f7288c = phVar;
        this.f7287b = eeVar;
        if (c0628b == null) {
            c0628b = new C0628b(this);
        }
        this.f7289d = c0628b;
        this.f7290e = new C0634g();
        li.m6022b(this.f7288c.f7303c);
        kw.m5949a(this.f7288c.f7303c, this.f7288c.f7305e);
        m6429w();
    }

    private void m6417A() {
        ly.m6070c("Ad opening.");
        if (this.f7288c.f7306f != null) {
            try {
                this.f7288c.f7306f.m5055d();
            } catch (Throwable e) {
                ly.m6073d("Could not call AdListener.onAdOpened().", e);
            }
        }
    }

    private void m6418B() {
        ly.m6070c("Ad finished loading.");
        if (this.f7288c.f7306f != null) {
            try {
                this.f7288c.f7306f.m5054c();
            } catch (Throwable e) {
                ly.m6073d("Could not call AdListener.onAdLoaded().", e);
            }
        }
    }

    private void m6419C() {
        try {
            if ((this.f7288c.f7310j.f6997w instanceof cd) && this.f7288c.f7316p != null) {
                this.f7288c.f7316p.m5289a((cd) this.f7288c.f7310j.f6997w);
            }
        } catch (Throwable e) {
            ly.m6073d("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", e);
        }
    }

    private void m6420D() {
        try {
            if ((this.f7288c.f7310j.f6997w instanceof ce) && this.f7288c.f7317q != null) {
                this.f7288c.f7317q.m5290a((ce) this.f7288c.f7310j.f6997w);
            }
        } catch (Throwable e) {
            ly.m6073d("Could not call OnContentAdLoadedListener.onContentAdLoaded().", e);
        }
    }

    private void m6421E() {
        if (this.f7288c.f7310j != null) {
            if (this.f7288c.f7323w == 0) {
                this.f7288c.f7310j.f6976b.destroy();
            }
            this.f7288c.f7310j = null;
            this.f7288c.f7325y = false;
        }
    }

    private jq m6422a(av avVar, Bundle bundle) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo = this.f7288c.f7303c.getApplicationInfo();
        try {
            packageInfo = this.f7288c.f7303c.getPackageManager().getPackageInfo(applicationInfo.packageName, 0);
        } catch (NameNotFoundException e) {
            packageInfo = null;
        }
        Bundle bundle2 = null;
        if (!(this.f7288c.f7309i.f6257e || this.f7288c.f7301a.getParent() == null)) {
            int[] iArr = new int[2];
            this.f7288c.f7301a.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            DisplayMetrics displayMetrics = this.f7288c.f7303c.getResources().getDisplayMetrics();
            int width = this.f7288c.f7301a.getWidth();
            int height = this.f7288c.f7301a.getHeight();
            int i3 = 0;
            if (this.f7288c.f7301a.isShown() && i + width > 0 && i2 + height > 0 && i <= displayMetrics.widthPixels && i2 <= displayMetrics.heightPixels) {
                i3 = 1;
            }
            bundle2 = new Bundle(5);
            bundle2.putInt("x", i);
            bundle2.putInt("y", i2);
            bundle2.putInt("width", width);
            bundle2.putInt("height", height);
            bundle2.putInt("visible", i3);
        }
        String d = kw.m5953d();
        this.f7288c.f7312l = new kt(d, this.f7288c.f7302b);
        this.f7288c.f7312l.m5931a(avVar);
        return new jq(bundle2, avVar, this.f7288c.f7309i, this.f7288c.f7302b, applicationInfo, packageInfo, d, kw.f7020a, this.f7288c.f7305e, kw.m5946a(this.f7288c.f7303c, this, d), this.f7288c.f7319s, bundle, kw.m5956j());
    }

    private ma m6423a(pi piVar) {
        if (this.f7288c.f7309i.f6257e) {
            ma a = ma.m6079a(this.f7288c.f7303c, this.f7288c.f7309i, false, false, this.f7288c.f7304d, this.f7288c.f7305e);
            a.m6097f().m6111a(this, null, this, this, true, this, this, piVar);
            return a;
        }
        ma maVar;
        View nextView = this.f7288c.f7301a.getNextView();
        if (nextView instanceof ma) {
            maVar = (ma) nextView;
            maVar.m6084a(this.f7288c.f7303c, this.f7288c.f7309i);
        } else {
            if (nextView != null) {
                this.f7288c.f7301a.removeView(nextView);
            }
            nextView = ma.m6079a(this.f7288c.f7303c, this.f7288c.f7309i, false, false, this.f7288c.f7304d, this.f7288c.f7305e);
            if (this.f7288c.f7309i.f6260h == null) {
                m6426b(nextView);
            }
        }
        maVar.m6097f().m6112a(this, this, this, this, false, this, piVar);
        return maVar;
    }

    private void m6425a(int i) {
        ly.m6074e("Failed to load ad: " + i);
        if (this.f7288c.f7306f != null) {
            try {
                this.f7288c.f7306f.m5052a(i);
            } catch (Throwable e) {
                ly.m6073d("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
    }

    private void m6426b(View view) {
        this.f7288c.f7301a.addView(view, new LayoutParams(-2, -2));
    }

    private void m6427b(boolean z) {
        if (this.f7288c.f7310j == null) {
            ly.m6074e("Ad state was null when trying to ping impression URLs.");
            return;
        }
        ly.m6065a("Pinging Impression URLs.");
        this.f7288c.f7312l.m5929a();
        if (this.f7288c.f7310j.f6979e != null) {
            li.m6007a(this.f7288c.f7303c, this.f7288c.f7305e.f6668b, this.f7288c.f7310j.f6979e);
        }
        if (!(this.f7288c.f7310j.f6989o == null || this.f7288c.f7310j.f6989o.f6463d == null)) {
            ec.m5416a(this.f7288c.f7303c, this.f7288c.f7305e.f6668b, this.f7288c.f7310j, this.f7288c.f7302b, z, this.f7288c.f7310j.f6989o.f6463d);
        }
        if (this.f7288c.f7310j.f6986l != null && this.f7288c.f7310j.f6986l.f6458f != null) {
            ec.m5416a(this.f7288c.f7303c, this.f7288c.f7305e.f6668b, this.f7288c.f7310j, this.f7288c.f7302b, z, this.f7288c.f7310j.f6986l.f6458f);
        }
    }

    private boolean m6428b(kr krVar) {
        View view;
        if (krVar.f6985k) {
            try {
                view = (View) C0585d.m4879a(krVar.f6987m.m5426a());
                View nextView = this.f7288c.f7301a.getNextView();
                if (nextView != null) {
                    this.f7288c.f7301a.removeView(nextView);
                }
                try {
                    m6426b(view);
                } catch (Throwable th) {
                    ly.m6073d("Could not add mediation view to view hierarchy.", th);
                    return false;
                }
            } catch (Throwable th2) {
                ly.m6073d("Could not get View from mediation adapter.", th2);
                return false;
            }
        } else if (krVar.f6992r != null) {
            krVar.f6976b.m6085a(krVar.f6992r);
            this.f7288c.f7301a.removeAllViews();
            this.f7288c.f7301a.setMinimumWidth(krVar.f6992r.f6259g);
            this.f7288c.f7301a.setMinimumHeight(krVar.f6992r.f6256d);
            m6426b(krVar.f6976b);
        }
        if (this.f7288c.f7301a.getChildCount() > 1) {
            this.f7288c.f7301a.showNext();
        }
        if (this.f7288c.f7310j != null) {
            view = this.f7288c.f7301a.getNextView();
            if (view instanceof ma) {
                ((ma) view).m6084a(this.f7288c.f7303c, this.f7288c.f7309i);
            } else if (view != null) {
                this.f7288c.f7301a.removeView(view);
            }
            if (this.f7288c.f7310j.f6987m != null) {
                try {
                    this.f7288c.f7310j.f6987m.m5432c();
                } catch (RemoteException e) {
                    ly.m6074e("Could not destroy previous mediation adapter.");
                }
            }
        }
        this.f7288c.f7301a.setVisibility(0);
        return true;
    }

    private void m6429w() {
        if (VERSION.SDK_INT >= 14 && this.f7288c != null && this.f7288c.f7303c != null) {
            this.f7288c.f7303c.registerComponentCallbacks(this.f7292g);
        }
    }

    private void m6430x() {
        if (VERSION.SDK_INT >= 14 && this.f7288c != null && this.f7288c.f7303c != null) {
            this.f7288c.f7303c.unregisterComponentCallbacks(this.f7292g);
        }
    }

    private void m6431y() {
        ly.m6070c("Ad closing.");
        if (this.f7288c.f7306f != null) {
            try {
                this.f7288c.f7306f.m5051a();
            } catch (Throwable e) {
                ly.m6073d("Could not call AdListener.onAdClosed().", e);
            }
        }
    }

    private void m6432z() {
        ly.m6070c("Ad leaving application.");
        if (this.f7288c.f7306f != null) {
            try {
                this.f7288c.f7306f.m5053b();
            } catch (Throwable e) {
                ly.m6073d("Could not call AdListener.onAdLeftApplication().", e);
            }
        }
    }

    Bundle m6433a(ad adVar) {
        if (adVar == null) {
            return null;
        }
        String b;
        if (adVar.m5029e()) {
            adVar.m5027c();
        }
        aa b2 = adVar.m5025b();
        if (b2 != null) {
            b = b2.m5003b();
            ly.m6065a("In AdManger: loadAd, " + b2.toString());
        } else {
            b = null;
        }
        if (b == null) {
            return null;
        }
        Bundle bundle = new Bundle(1);
        bundle.putString("fingerprint", b);
        bundle.putInt("v", 1);
        return bundle;
    }

    public C0582a m6434a() {
        ob.m6318a("getAdFrame must be called on the main UI thread.");
        return C0585d.m4878a(this.f7288c.f7301a);
    }

    public void m6435a(View view) {
        this.f7288c.f7322v = view;
        m6442a(new kr(this.f7288c.f7311k, null, null, null, null, null, null));
    }

    public void m6436a(ay ayVar) {
        ob.m6318a("setAdSize must be called on the main UI thread.");
        this.f7288c.f7309i = ayVar;
        if (this.f7288c.f7310j != null && this.f7288c.f7323w == 0) {
            this.f7288c.f7310j.f6976b.m6085a(ayVar);
        }
        if (this.f7288c.f7301a.getChildCount() > 1) {
            this.f7288c.f7301a.removeView(this.f7288c.f7301a.getNextView());
        }
        this.f7288c.f7301a.setMinimumWidth(ayVar.f6259g);
        this.f7288c.f7301a.setMinimumHeight(ayVar.f6256d);
        this.f7288c.f7301a.requestLayout();
    }

    public void m6437a(az azVar) {
        ob.m6318a("setAdListener must be called on the main UI thread.");
        this.f7288c.f7306f = azVar;
    }

    public void m6438a(bi biVar) {
        ob.m6318a("setAppEventListener must be called on the main UI thread.");
        this.f7288c.f7313m = biVar;
    }

    public void m6439a(bz bzVar) {
        ob.m6318a("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f7288c.f7318r = bzVar;
    }

    public void m6440a(hh hhVar) {
        ob.m6318a("setInAppPurchaseListener must be called on the main UI thread.");
        this.f7288c.f7315o = hhVar;
    }

    public void m6441a(ht htVar, String str) {
        ob.m6318a("setPlayStorePurchaseParams must be called on the main UI thread.");
        this.f7288c.f7320t = new hc(str);
        this.f7288c.f7314n = htVar;
        if (!kw.m5955h() && htVar != null) {
            new gr(this.f7288c.f7303c, this.f7288c.f7314n, this.f7288c.f7320t).m5624e();
        }
    }

    public void m6442a(kr krVar) {
        this.f7288c.f7308h = null;
        boolean z = krVar.f6997w != null;
        if (!(krVar.f6978d == -2 || krVar.f6978d == 3)) {
            kw.m5952a(this.f7288c.m6475a());
        }
        if (krVar.f6978d != -1) {
            if (m6451a(krVar, z)) {
                ly.m6065a("Ad refresh scheduled.");
            }
            if (!(krVar.f6978d != 3 || krVar.f6989o == null || krVar.f6989o.f6464e == null)) {
                ly.m6065a("Pinging no fill URLs.");
                ec.m5416a(this.f7288c.f7303c, this.f7288c.f7305e.f6668b, krVar, this.f7288c.f7302b, false, krVar.f6989o.f6464e);
            }
            if (krVar.f6978d != -2) {
                m6425a(krVar.f6978d);
                return;
            }
            int i;
            int i2;
            if (!(this.f7288c.f7309i.f6257e || z || this.f7288c.f7323w != 0)) {
                if (!m6428b(krVar)) {
                    m6425a(0);
                    return;
                } else if (this.f7288c.f7301a != null) {
                    this.f7288c.f7301a.f7300a.m6040a(krVar.f6996v);
                }
            }
            if (!(this.f7288c.f7310j == null || this.f7288c.f7310j.f6990p == null)) {
                this.f7288c.f7310j.f6990p.m5388a(null);
            }
            if (krVar.f6990p != null) {
                krVar.f6990p.m5388a((dv) this);
            }
            this.f7290e.m5570b(this.f7288c.f7310j);
            this.f7288c.f7310j = krVar;
            this.f7288c.f7312l.m5930a(krVar.f6994t);
            this.f7288c.f7312l.m5934b(krVar.f6995u);
            this.f7288c.f7312l.m5932a(this.f7288c.f7309i.f6257e);
            this.f7288c.f7312l.m5935b(krVar.f6985k);
            if (!(this.f7288c.f7309i.f6257e || z || this.f7288c.f7323w != 0)) {
                m6427b(false);
            }
            if (this.f7288c.f7321u == null) {
                this.f7288c.f7321u = new kz(this.f7288c.f7302b);
            }
            if (krVar.f6989o != null) {
                i = krVar.f6989o.f6467h;
                i2 = krVar.f6989o.f6468i;
            } else {
                i2 = 0;
                i = 0;
            }
            this.f7288c.f7321u.m5987a(i, i2);
            if (this.f7288c.f7323w == 0) {
                if (!(this.f7288c.f7309i.f6257e || krVar.f6976b == null || (!krVar.f6976b.m6097f().m6118b() && krVar.f6984j == null))) {
                    C0635h a = this.f7290e.m5565a(this.f7288c.f7309i, this.f7288c.f7310j);
                    if (krVar.f6976b.m6097f().m6118b() && a != null) {
                        a.m5680a(new C0627a(krVar.f6976b));
                    }
                }
                if (this.f7288c.f7310j.f6976b != null) {
                    this.f7288c.f7310j.f6976b.m6083a();
                    this.f7288c.f7310j.f6976b.m6097f().m6119c();
                }
                if (z) {
                    cg cgVar = krVar.f6997w;
                    if ((cgVar instanceof ce) && this.f7288c.f7317q != null) {
                        m6420D();
                    } else if (!(cgVar instanceof cd) || this.f7288c.f7316p == null) {
                        ly.m6074e("No matching listener for retrieved native ad template.");
                        m6425a(0);
                        return;
                    } else {
                        m6419C();
                    }
                }
                m6418B();
            } else if (this.f7288c.f7322v != null && krVar.f6984j != null) {
                this.f7290e.m5564a(this.f7288c.f7303c, this.f7288c.f7309i, this.f7288c.f7310j, this.f7288c.f7322v, this.f7288c.f7305e);
            }
        }
    }

    public void m6443a(ks ksVar) {
        ma maVar;
        String str = null;
        this.f7288c.f7307g = null;
        this.f7288c.f7311k = ksVar;
        m6448a(null);
        if (ksVar.f6999b.f6574t) {
            maVar = null;
        } else {
            pi piVar = new pi();
            maVar = m6423a(piVar);
            piVar.m6478a(new pk(ksVar, maVar));
            maVar.setOnTouchListener(new pd(this, piVar));
            maVar.setOnClickListener(new pe(this, piVar));
        }
        if (ksVar.f7001d != null) {
            this.f7288c.f7309i = ksVar.f7001d;
        }
        if (ksVar.f7002e != -2) {
            m6442a(new kr(ksVar, maVar, null, null, null, null, null));
            return;
        }
        if (!ksVar.f6999b.f6562h && ksVar.f6999b.f6573s) {
            if (ksVar.f6999b.f6556b != null) {
                str = Uri.parse(ksVar.f6999b.f6556b).buildUpon().query(null).build().toString();
            }
            bw buVar = new bu(this, str, ksVar.f6999b.f6557c);
            try {
                if (this.f7288c.f7318r != null) {
                    this.f7288c.f7323w = 1;
                    this.f7288c.f7318r.m5244a(buVar);
                    return;
                }
            } catch (Throwable e) {
                ly.m6073d("Could not call the onCustomRenderedAdLoadedListener.", e);
            }
        }
        this.f7288c.f7323w = 0;
        this.f7288c.f7308h = jb.m5798a(this.f7288c.f7303c, this, ksVar, maVar, this.f7287b, this);
    }

    public void m6444a(String str, String str2) {
        if (this.f7288c.f7313m != null) {
            try {
                this.f7288c.f7313m.m5074a(str, str2);
            } catch (Throwable e) {
                ly.m6073d("Could not call the AppEventListener.", e);
            }
        }
    }

    public void m6445a(String str, ArrayList<String> arrayList) {
        he guVar = new gu(str, arrayList, this.f7288c.f7303c, this.f7288c.f7305e.f6668b);
        if (this.f7288c.f7315o == null) {
            ly.m6074e("InAppPurchaseListener is not set. Try to launch default purchase flow.");
            if (C0619g.m4944a(this.f7288c.f7303c) != 0) {
                ly.m6074e("Google Play Service unavailable, cannot launch default purchase flow.");
                return;
            } else if (this.f7288c.f7314n == null) {
                ly.m6074e("PlayStorePurchaseListener is not set.");
                return;
            } else if (this.f7288c.f7320t == null) {
                ly.m6074e("PlayStorePurchaseVerifier is not initialized.");
                return;
            } else if (this.f7288c.f7324x) {
                ly.m6074e("An in-app purchase request is already in progress, abort");
                return;
            } else {
                this.f7288c.f7324x = true;
                try {
                    if (this.f7288c.f7314n.m5732a(str)) {
                        gv.m5649a(this.f7288c.f7303c, this.f7288c.f7305e.f6671e, new ea(this.f7288c.f7303c, this.f7288c.f7320t, guVar, this));
                        return;
                    } else {
                        this.f7288c.f7324x = false;
                        return;
                    }
                } catch (RemoteException e) {
                    ly.m6074e("Could not start In-App purchase.");
                    this.f7288c.f7324x = false;
                    return;
                }
            }
        }
        try {
            this.f7288c.f7315o.m5717a(guVar);
        } catch (RemoteException e2) {
            ly.m6074e("Could not start In-App purchase.");
        }
    }

    public void m6446a(String str, boolean z, int i, Intent intent, gw gwVar) {
        try {
            if (this.f7288c.f7314n != null) {
                this.f7288c.f7314n.m5731a(new gx(this.f7288c.f7303c, str, z, i, intent, gwVar));
            }
        } catch (RemoteException e) {
            ly.m6074e("Fail to invoke PlayStorePurchaseListener.");
        }
        lx.f7093a.postDelayed(new pf(this, intent), 500);
    }

    public void m6447a(HashSet<kt> hashSet) {
        this.f7288c.m6476a(hashSet);
    }

    public void m6448a(List<String> list) {
        ob.m6318a("setNativeTemplates must be called on the main UI thread.");
        this.f7288c.f7319s = list;
    }

    public void m6449a(boolean z) {
        this.f7288c.f7325y = z;
    }

    public boolean m6450a(av avVar) {
        ob.m6318a("loadAd must be called on the main UI thread.");
        if (this.f7288c.f7307g != null || this.f7288c.f7308h != null) {
            if (this.f7286a != null) {
                ly.m6074e("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
            }
            this.f7286a = avVar;
            return false;
        } else if (this.f7288c.f7309i.f6257e && this.f7288c.f7310j != null) {
            ly.m6074e("An interstitial is already loading. Aborting.");
            return false;
        } else if (!m6471t()) {
            return false;
        } else {
            ly.m6070c("Starting ad request.");
            if (!avVar.f6242f) {
                ly.m6070c("Use AdRequest.Builder.addTestDevice(\"" + lx.m6058a(this.f7288c.f7303c) + "\") to get test ads on this device.");
            }
            Bundle a = m6433a(kw.m5947a().m5959a(this.f7288c.f7303c));
            this.f7289d.m5086a();
            this.f7288c.f7323w = 0;
            jq a2 = m6422a(avVar, a);
            this.f7288c.f7307g = ie.m5755a(this.f7288c.f7303c, a2, this.f7288c.f7304d, this);
            return true;
        }
    }

    boolean m6451a(kr krVar, boolean z) {
        av avVar;
        int i = 0;
        if (this.f7286a != null) {
            avVar = this.f7286a;
            this.f7286a = null;
        } else {
            avVar = krVar.f6975a;
            if (avVar.f6239c != null) {
                i = avVar.f6239c.getBoolean("_noRefresh", false);
            }
        }
        i |= z;
        if (this.f7288c.f7309i.f6257e) {
            if (this.f7288c.f7323w == 0) {
                li.m6012a(krVar.f6976b);
            }
        } else if (i == 0 && this.f7288c.f7323w == 0) {
            if (krVar.f6982h > 0) {
                this.f7289d.m5088a(avVar, krVar.f6982h);
            } else if (krVar.f6989o != null && krVar.f6989o.f6466g > 0) {
                this.f7289d.m5088a(avVar, krVar.f6989o.f6466g);
            } else if (!krVar.f6985k && krVar.f6978d == 2) {
                this.f7289d.m5087a(avVar);
            }
        }
        return this.f7289d.m5091d();
    }

    public void m6452b() {
        ob.m6318a("destroy must be called on the main UI thread.");
        m6430x();
        this.f7288c.f7306f = null;
        this.f7288c.f7313m = null;
        this.f7288c.f7314n = null;
        this.f7288c.f7315o = null;
        this.f7288c.f7318r = null;
        this.f7289d.m5086a();
        this.f7290e.m5566a();
        m6458g();
        if (this.f7288c.f7301a != null) {
            this.f7288c.f7301a.removeAllViews();
        }
        if (!(this.f7288c.f7310j == null || this.f7288c.f7310j.f6976b == null)) {
            this.f7288c.f7310j.f6976b.destroy();
        }
        if (this.f7288c.f7310j != null && this.f7288c.f7310j.f6987m != null) {
            try {
                this.f7288c.f7310j.f6987m.m5432c();
            } catch (RemoteException e) {
                ly.m6074e("Could not destroy mediation adapter.");
            }
        }
    }

    public void m6453b(av avVar) {
        ViewParent parent = this.f7288c.f7301a.getParent();
        if ((parent instanceof View) && ((View) parent).isShown() && li.m6015a() && !this.f7291f) {
            m6450a(avVar);
            return;
        }
        ly.m6070c("Ad is not visible. Not refreshing ad.");
        this.f7289d.m5087a(avVar);
    }

    public boolean m6454c() {
        ob.m6318a("isLoaded must be called on the main UI thread.");
        return this.f7288c.f7307g == null && this.f7288c.f7308h == null && this.f7288c.f7310j != null;
    }

    public void m6455d() {
        ob.m6318a("pause must be called on the main UI thread.");
        if (this.f7288c.f7310j != null && this.f7288c.f7323w == 0) {
            li.m6012a(this.f7288c.f7310j.f6976b);
        }
        if (!(this.f7288c.f7310j == null || this.f7288c.f7310j.f6987m == null)) {
            try {
                this.f7288c.f7310j.f6987m.m5433d();
            } catch (RemoteException e) {
                ly.m6074e("Could not pause mediation adapter.");
            }
        }
        this.f7290e.m5569b();
        this.f7289d.m5089b();
    }

    public void m6456e() {
        ob.m6318a("resume must be called on the main UI thread.");
        if (this.f7288c.f7310j != null && this.f7288c.f7323w == 0) {
            li.m6023b(this.f7288c.f7310j.f6976b);
        }
        if (!(this.f7288c.f7310j == null || this.f7288c.f7310j.f6987m == null)) {
            try {
                this.f7288c.f7310j.f6987m.m5434e();
            } catch (RemoteException e) {
                ly.m6074e("Could not resume mediation adapter.");
            }
        }
        this.f7289d.m5090c();
        this.f7290e.m5571c();
    }

    public void m6457f() {
        ob.m6318a("showInterstitial must be called on the main UI thread.");
        if (!this.f7288c.f7309i.f6257e) {
            ly.m6074e("Cannot call showInterstitial on a banner ad.");
        } else if (this.f7288c.f7310j == null) {
            ly.m6074e("The interstitial has not loaded.");
        } else if (this.f7288c.f7323w == 1) {
        } else {
            if (this.f7288c.f7310j.f6976b.m6101j()) {
                ly.m6074e("The interstitial is already showing.");
                return;
            }
            this.f7288c.f7310j.f6976b.m6090a(true);
            if (this.f7288c.f7310j.f6976b.m6097f().m6118b() || this.f7288c.f7310j.f6984j != null) {
                C0635h a = this.f7290e.m5565a(this.f7288c.f7309i, this.f7288c.f7310j);
                if (this.f7288c.f7310j.f6976b.m6097f().m6118b() && a != null) {
                    a.m5680a(new C0627a(this.f7288c.f7310j.f6976b));
                }
            }
            if (this.f7288c.f7310j.f6985k) {
                try {
                    this.f7288c.f7310j.f6987m.m5431b();
                    return;
                } catch (Throwable e) {
                    ly.m6073d("Could not show interstitial.", e);
                    m6421E();
                    return;
                }
            }
            C0652y c0652y = new C0652y(this.f7288c.f7325y, false);
            if (this.f7288c.f7303c instanceof Activity) {
                Window window = ((Activity) this.f7288c.f7303c).getWindow();
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                window.getDecorView().getGlobalVisibleRect(rect);
                window.getDecorView().getWindowVisibleDisplayFrame(rect2);
                if (!(rect.bottom == 0 || rect2.bottom == 0)) {
                    c0652y = new C0652y(this.f7288c.f7325y, rect.top == rect2.top);
                }
            }
            fu.m5533a(this.f7288c.f7303c, new dr(this, this, this, this.f7288c.f7310j.f6976b, this.f7288c.f7310j.f6981g, this.f7288c.f7305e, this.f7288c.f7310j.f6996v, c0652y));
        }
    }

    public void m6458g() {
        ob.m6318a("stopLoading must be called on the main UI thread.");
        if (this.f7288c.f7310j != null && this.f7288c.f7323w == 0) {
            this.f7288c.f7310j.f6976b.stopLoading();
            this.f7288c.f7310j = null;
        }
        if (this.f7288c.f7307g != null) {
            this.f7288c.f7307g.m5625f();
        }
        if (this.f7288c.f7308h != null) {
            this.f7288c.f7308h.m5625f();
        }
    }

    public void m6459h() {
        ob.m6318a("recordManualImpression must be called on the main UI thread.");
        if (this.f7288c.f7310j == null) {
            ly.m6074e("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        ly.m6065a("Pinging manual tracking URLs.");
        if (this.f7288c.f7310j.f6980f != null) {
            li.m6007a(this.f7288c.f7303c, this.f7288c.f7305e.f6668b, this.f7288c.f7310j.f6980f);
        }
    }

    public ay m6460i() {
        ob.m6318a("getAdSize must be called on the main UI thread.");
        return this.f7288c.f7309i;
    }

    public String m6461j() {
        return this.f7288c.f7310j != null ? this.f7288c.f7310j.f6988n : null;
    }

    public void m6462k() {
        m6470s();
    }

    public void m6463l() {
        m6467p();
    }

    public void m6464m() {
        m6469r();
    }

    public void m6465n() {
        m6468q();
    }

    public void m6466o() {
        if (this.f7288c.f7310j != null) {
            ly.m6074e("Mediation adapter " + this.f7288c.f7310j.f6988n + " refreshed, but mediation adapters should never refresh.");
        }
        m6427b(true);
        m6418B();
    }

    public void m6467p() {
        this.f7290e.m5570b(this.f7288c.f7310j);
        if (this.f7288c.f7309i.f6257e) {
            m6421E();
        }
        this.f7291f = false;
        m6431y();
        this.f7288c.f7312l.m5936c();
    }

    public void m6468q() {
        if (this.f7288c.f7309i.f6257e) {
            m6427b(false);
        }
        this.f7291f = true;
        m6417A();
    }

    public void m6469r() {
        m6432z();
    }

    public void m6470s() {
        m6472u();
    }

    public boolean m6471t() {
        boolean z = true;
        if (!li.m6017a(this.f7288c.f7303c.getPackageManager(), this.f7288c.f7303c.getPackageName(), "android.permission.INTERNET")) {
            if (!this.f7288c.f7309i.f6257e) {
                lx.m6062a(this.f7288c.f7301a, this.f7288c.f7309i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            }
            z = false;
        }
        if (!li.m6016a(this.f7288c.f7303c)) {
            if (!this.f7288c.f7309i.f6257e) {
                lx.m6062a(this.f7288c.f7301a, this.f7288c.f7309i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            }
            z = false;
        }
        if (!(z || this.f7288c.f7309i.f6257e)) {
            this.f7288c.f7301a.setVisibility(0);
        }
        return z;
    }

    public void m6472u() {
        if (this.f7288c.f7310j == null) {
            ly.m6074e("Ad state was null when trying to ping click URLs.");
            return;
        }
        ly.m6065a("Pinging click URLs.");
        this.f7288c.f7312l.m5933b();
        if (this.f7288c.f7310j.f6977c != null) {
            li.m6007a(this.f7288c.f7303c, this.f7288c.f7305e.f6668b, this.f7288c.f7310j.f6977c);
        }
        if (this.f7288c.f7310j.f6989o != null && this.f7288c.f7310j.f6989o.f6462c != null) {
            ec.m5416a(this.f7288c.f7303c, this.f7288c.f7305e.f6668b, this.f7288c.f7310j, this.f7288c.f7302b, false, this.f7288c.f7310j.f6989o.f6462c);
        }
    }

    public void m6473v() {
        m6427b(false);
    }
}
