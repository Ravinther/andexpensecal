package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URI;
import java.net.URISyntaxException;

@id
public class mp extends WebViewClient {
    private final String f7134a;
    private boolean f7135b;
    private final ma f7136c;
    private final iz f7137d;

    public mp(iz izVar, ma maVar, String str) {
        this.f7134a = m6128b(str);
        this.f7135b = false;
        this.f7136c = maVar;
        this.f7137d = izVar;
    }

    private String m6128b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (str.endsWith("/")) {
                    str = str.substring(0, str.length() - 1);
                }
            } catch (IndexOutOfBoundsException e) {
                ly.m6068b(e.getMessage());
            }
        }
        return str;
    }

    protected boolean m6129a(String str) {
        Object b = m6128b(str);
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        try {
            URI uri = new URI(b);
            if ("passback".equals(uri.getScheme())) {
                ly.m6065a("Passback received");
                this.f7137d.m5793b();
                return true;
            } else if (TextUtils.isEmpty(this.f7134a)) {
                return false;
            } else {
                URI uri2 = new URI(this.f7134a);
                String host = uri2.getHost();
                String host2 = uri.getHost();
                String path = uri2.getPath();
                String path2 = uri.getPath();
                if (!ny.m6312a(host, host2) || !ny.m6312a(path, path2)) {
                    return false;
                }
                ly.m6065a("Passback received");
                this.f7137d.m5793b();
                return true;
            }
        } catch (URISyntaxException e) {
            ly.m6068b(e.getMessage());
            return false;
        }
    }

    public void onLoadResource(WebView webView, String str) {
        ly.m6065a("JavascriptAdWebViewClient::onLoadResource: " + str);
        if (!m6129a(str)) {
            this.f7136c.m6097f().onLoadResource(this.f7136c, str);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        ly.m6065a("JavascriptAdWebViewClient::onPageFinished: " + str);
        if (!this.f7135b) {
            this.f7137d.m5790a();
            this.f7135b = true;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        ly.m6065a("JavascriptAdWebViewClient::shouldOverrideUrlLoading: " + str);
        if (!m6129a(str)) {
            return this.f7136c.m6097f().shouldOverrideUrlLoading(this.f7136c, str);
        }
        ly.m6065a("shouldOverrideUrlLoading: received passback url");
        return true;
    }
}
