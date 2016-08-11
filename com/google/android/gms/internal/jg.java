package com.google.android.gms.internal;

class jg implements Runnable {
    final /* synthetic */ jd f6847a;

    jg(jd jdVar) {
        this.f6847a = jdVar;
    }

    public void run() {
        synchronized (this.f6849b.f6837f) {
            if (r1.f6839h.f6559e != -2) {
                return;
            }
            this.f6847a.f6834c.m6097f().m6110a(this.f6847a);
            if (this.f6847a.f6839h.f6559e == -3) {
                ly.m6072d("Loading URL in WebView: " + this.f6847a.f6839h.f6556b);
                this.f6847a.f6834c.loadUrl(this.f6847a.f6839h.f6556b);
            } else {
                ly.m6072d("Loading HTML in WebView.");
                this.f6847a.f6834c.loadDataWithBaseURL(li.m5999a(this.f6847a.f6839h.f6556b), this.f6847a.f6839h.f6557c, "text/html", "UTF-8", null);
            }
        }
    }
}
