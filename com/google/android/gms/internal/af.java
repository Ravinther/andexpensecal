package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebView;

class af implements Runnable {
    ValueCallback<String> f6214a;
    final /* synthetic */ aa f6215b;
    final /* synthetic */ WebView f6216c;
    final /* synthetic */ ad f6217d;

    af(ad adVar, aa aaVar, WebView webView) {
        this.f6217d = adVar;
        this.f6215b = aaVar;
        this.f6216c = webView;
        this.f6214a = new ag(this);
    }

    public void run() {
        if (this.f6216c.getSettings().getJavaScriptEnabled()) {
            this.f6216c.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f6214a);
        }
    }
}
