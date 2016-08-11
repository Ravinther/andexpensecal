package com.google.android.gms.internal;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;

@id
public class mf extends WebChromeClient {
    private final ma f7125a;

    public mf(ma maVar) {
        this.f7125a = maVar;
    }

    private final Context m6122a(WebView webView) {
        if (!(webView instanceof ma)) {
            return webView.getContext();
        }
        ma maVar = (ma) webView;
        Context k = maVar.m6102k();
        return k == null ? maVar.getContext() : k;
    }

    private static void m6123a(Builder builder, String str, JsResult jsResult) {
        builder.setMessage(str).setPositiveButton(17039370, new mi(jsResult)).setNegativeButton(17039360, new mh(jsResult)).setOnCancelListener(new mg(jsResult)).create().show();
    }

    private static void m6124a(Context context, Builder builder, String str, String str2, JsPromptResult jsPromptResult) {
        View linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        View textView = new TextView(context);
        textView.setText(str);
        View editText = new EditText(context);
        editText.setText(str2);
        linearLayout.addView(textView);
        linearLayout.addView(editText);
        builder.setView(linearLayout).setPositiveButton(17039370, new ml(jsPromptResult, editText)).setNegativeButton(17039360, new mk(jsPromptResult)).setOnCancelListener(new mj(jsPromptResult)).create().show();
    }

    protected final void m6125a(View view, int i, CustomViewCallback customViewCallback) {
        fu d = this.f7125a.m6095d();
        if (d == null) {
            ly.m6074e("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        d.m5539a(view, customViewCallback);
        d.m5536a(i);
    }

    protected boolean m6126a(Context context, String str, String str2, String str3, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        try {
            Builder builder = new Builder(context);
            builder.setTitle(str);
            if (z) {
                m6124a(context, builder, str2, str3, jsPromptResult);
            } else {
                m6123a(builder, str2, jsResult);
            }
        } catch (Throwable e) {
            ly.m6073d("Fail to display Dialog.", e);
        }
        return true;
    }

    public final void onCloseWindow(WebView webView) {
        if (webView instanceof ma) {
            fu d = ((ma) webView).m6095d();
            if (d == null) {
                ly.m6074e("Tried to close an AdWebView not associated with an overlay.");
                return;
            } else {
                d.m5535a();
                return;
            }
        }
        ly.m6074e("Tried to close a WebView that wasn't an AdWebView.");
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        switch (mm.f7133a[consoleMessage.messageLevel().ordinal()]) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                ly.m6068b(str);
                break;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                ly.m6074e(str);
                break;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                ly.m6070c(str);
                break;
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                ly.m6065a(str);
                break;
            default:
                ly.m6070c(str);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebViewTransport webViewTransport = (WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(this.f7125a.m6097f());
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(Math.min(131072, j4) + j, 1048576);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onHideCustomView() {
        fu d = this.f7125a.m6095d();
        if (d == null) {
            ly.m6074e("Could not get ad overlay when hiding custom view.");
        } else {
            d.m5545c();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m6126a(m6122a(webView), str, str2, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m6126a(m6122a(webView), str, str2, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m6126a(m6122a(webView), str, str2, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m6126a(m6122a(webView), str, str2, str3, null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, QuotaUpdater quotaUpdater) {
        long j3 = 131072 + j;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        m6125a(view, -1, customViewCallback);
    }
}
