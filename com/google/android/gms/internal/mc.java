package com.google.android.gms.internal;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Map;

@id
public class mc extends WebViewClient {
    protected final ma f7109a;
    private final HashMap<String, cz> f7110b;
    private final Object f7111c;
    private pa f7112d;
    private ga f7113e;
    private me f7114f;
    private co f7115g;
    private boolean f7116h;
    private da f7117i;
    private dc f7118j;
    private boolean f7119k;
    private gf f7120l;
    private final fr f7121m;
    private pi f7122n;

    public mc(ma maVar, boolean z) {
        this(maVar, z, new fr(maVar, maVar.getContext(), new br(maVar.getContext())));
    }

    mc(ma maVar, boolean z, fr frVar) {
        this.f7110b = new HashMap();
        this.f7111c = new Object();
        this.f7116h = false;
        this.f7109a = maVar;
        this.f7119k = z;
        this.f7121m = frVar;
    }

    private static boolean m6105a(Uri uri) {
        String scheme = uri.getScheme();
        return "http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme);
    }

    private void m6106b(Uri uri) {
        String path = uri.getPath();
        cz czVar = (cz) this.f7110b.get(path);
        if (czVar != null) {
            Map a = li.m6000a(uri);
            if (ly.m6067a(2)) {
                ly.m6072d("Received GMSG: " + path);
                for (String path2 : a.keySet()) {
                    ly.m6072d("  " + path2 + ": " + ((String) a.get(path2)));
                }
            }
            czVar.m5291a(this.f7109a, a);
            return;
        }
        ly.m6072d("No GMSG handler found for GMSG: " + uri);
    }

    public pi m6107a() {
        return this.f7122n;
    }

    public final void m6108a(C0631do c0631do) {
        ga gaVar = null;
        boolean j = this.f7109a.m6101j();
        pa paVar = (!j || this.f7109a.m6096e().f6257e) ? this.f7112d : null;
        if (!j) {
            gaVar = this.f7113e;
        }
        m6109a(new dr(c0631do, paVar, gaVar, this.f7120l, this.f7109a.m6100i()));
    }

    protected void m6109a(dr drVar) {
        fu.m5533a(this.f7109a.getContext(), drVar);
    }

    public final void m6110a(me meVar) {
        this.f7114f = meVar;
    }

    public void m6111a(pa paVar, ga gaVar, co coVar, gf gfVar, boolean z, da daVar, dc dcVar, pi piVar) {
        m6112a(paVar, gaVar, coVar, gfVar, z, daVar, piVar);
        m6113a("/setInterstitialProperties", new db(dcVar));
        this.f7118j = dcVar;
    }

    public void m6112a(pa paVar, ga gaVar, co coVar, gf gfVar, boolean z, da daVar, pi piVar) {
        if (piVar == null) {
            piVar = new pi(false);
        }
        m6113a("/appEvent", new cn(coVar));
        m6113a("/canOpenURLs", cp.f6388b);
        m6113a("/canOpenIntents", cp.f6389c);
        m6113a("/click", cp.f6390d);
        m6113a("/close", cp.f6391e);
        m6113a("/customClose", cp.f6392f);
        m6113a("/httpTrack", cp.f6393g);
        m6113a("/log", cp.f6394h);
        m6113a("/open", new de(daVar, piVar));
        m6113a("/touch", cp.f6395i);
        m6113a("/video", cp.f6396j);
        m6113a("/mraid", new dd());
        this.f7112d = paVar;
        this.f7113e = gaVar;
        this.f7115g = coVar;
        this.f7117i = daVar;
        this.f7120l = gfVar;
        this.f7122n = piVar;
        m6114a(z);
    }

    public final void m6113a(String str, cz czVar) {
        this.f7110b.put(str, czVar);
    }

    public final void m6114a(boolean z) {
        this.f7116h = z;
    }

    public final void m6115a(boolean z, int i) {
        pa paVar = (!this.f7109a.m6101j() || this.f7109a.m6096e().f6257e) ? this.f7112d : null;
        m6109a(new dr(paVar, this.f7113e, this.f7120l, this.f7109a, z, i, this.f7109a.m6100i()));
    }

    public final void m6116a(boolean z, int i, String str) {
        ga gaVar = null;
        boolean j = this.f7109a.m6101j();
        pa paVar = (!j || this.f7109a.m6096e().f6257e) ? this.f7112d : null;
        if (!j) {
            gaVar = this.f7113e;
        }
        m6109a(new dr(paVar, gaVar, this.f7115g, this.f7120l, this.f7109a, z, i, str, this.f7109a.m6100i(), this.f7117i));
    }

    public final void m6117a(boolean z, int i, String str, String str2) {
        boolean j = this.f7109a.m6101j();
        pa paVar = (!j || this.f7109a.m6096e().f6257e) ? this.f7112d : null;
        m6109a(new dr(paVar, j ? null : this.f7113e, this.f7115g, this.f7120l, this.f7109a, z, i, str, str2, this.f7109a.m6100i(), this.f7117i));
    }

    public boolean m6118b() {
        boolean z;
        synchronized (this.f7111c) {
            z = this.f7119k;
        }
        return z;
    }

    public void m6119c() {
        if (m6118b()) {
            this.f7121m.m5514b();
        }
    }

    public final void m6120d() {
        synchronized (this.f7111c) {
            this.f7110b.clear();
            this.f7112d = null;
            this.f7113e = null;
            this.f7114f = null;
            this.f7115g = null;
            this.f7116h = false;
            this.f7119k = false;
            this.f7117i = null;
            this.f7120l = null;
        }
    }

    public final void m6121e() {
        synchronized (this.f7111c) {
            this.f7116h = false;
            this.f7119k = true;
            fu d = this.f7109a.m6095d();
            if (d != null) {
                if (lx.m6064b()) {
                    d.m5554k();
                } else {
                    lx.f7093a.post(new md(this, d));
                }
            }
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        ly.m6072d("Loading resource: " + str);
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m6106b(parse);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (this.f7114f != null) {
            this.f7114f.m5558a(this.f7109a);
            this.f7114f = null;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        ly.m6072d("AdWebView shouldOverrideUrlLoading: " + str);
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m6106b(parse);
        } else if (this.f7116h && webView == this.f7109a && m6105a(parse)) {
            return super.shouldOverrideUrlLoading(webView, str);
        } else {
            if (this.f7109a.willNotDraw()) {
                ly.m6074e("AdWebView unable to handle URL: " + str);
            } else {
                Uri uri;
                try {
                    oc h = this.f7109a.m6099h();
                    if (h != null && h.m6331b(parse)) {
                        parse = h.m6327a(parse, this.f7109a.getContext());
                    }
                    uri = parse;
                } catch (od e) {
                    ly.m6074e("Unable to append parameter to URL: " + str);
                    uri = parse;
                }
                if (this.f7122n == null || this.f7122n.m6480b()) {
                    m6108a(new C0631do("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
                } else {
                    this.f7122n.m6479a(str);
                }
            }
        }
        return true;
    }
}
