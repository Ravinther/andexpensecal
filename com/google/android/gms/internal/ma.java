package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@id
public class ma extends WebView implements DownloadListener {
    private final mc f7095a;
    private final mb f7096b;
    private final Object f7097c;
    private final oc f7098d;
    private final gs f7099e;
    private fu f7100f;
    private ay f7101g;
    private boolean f7102h;
    private boolean f7103i;
    private boolean f7104j;
    private boolean f7105k;
    private final WindowManager f7106l;

    protected ma(mb mbVar, ay ayVar, boolean z, boolean z2, oc ocVar, gs gsVar) {
        super(mbVar);
        this.f7097c = new Object();
        this.f7096b = mbVar;
        this.f7101g = ayVar;
        this.f7102h = z;
        this.f7098d = ocVar;
        this.f7099e = gsVar;
        this.f7106l = (WindowManager) getContext().getSystemService("window");
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        li.m6005a((Context) mbVar, gsVar.f6668b, settings);
        if (VERSION.SDK_INT >= 17) {
            lv.m6053a(getContext(), settings);
        } else if (VERSION.SDK_INT >= 11) {
            lq.m6041a(getContext(), settings);
        }
        setDownloadListener(this);
        if (VERSION.SDK_INT >= 11) {
            this.f7095a = new mn(this, z2);
        } else {
            this.f7095a = new mc(this, z2);
        }
        setWebViewClient(this.f7095a);
        if (VERSION.SDK_INT >= 14) {
            setWebChromeClient(new mo(this));
        } else if (VERSION.SDK_INT >= 11) {
            setWebChromeClient(new mf(this));
        }
        m6080m();
    }

    public static ma m6079a(Context context, ay ayVar, boolean z, boolean z2, oc ocVar, gs gsVar) {
        return new ma(new mb(context), ayVar, z, z2, ocVar, gsVar);
    }

    private void m6080m() {
        synchronized (this.f7097c) {
            if (this.f7102h || this.f7101g.f6257e) {
                if (VERSION.SDK_INT < 14) {
                    ly.m6065a("Disabling hardware acceleration on an overlay.");
                    m6081n();
                } else {
                    ly.m6065a("Enabling hardware acceleration on an overlay.");
                    m6082o();
                }
            } else if (VERSION.SDK_INT < 18) {
                ly.m6065a("Disabling hardware acceleration on an AdView.");
                m6081n();
            } else {
                ly.m6065a("Enabling hardware acceleration on an AdView.");
                m6082o();
            }
        }
    }

    private void m6081n() {
        synchronized (this.f7097c) {
            if (!this.f7103i && VERSION.SDK_INT >= 11) {
                lq.m6042a((View) this);
            }
            this.f7103i = true;
        }
    }

    private void m6082o() {
        synchronized (this.f7097c) {
            if (this.f7103i && VERSION.SDK_INT >= 11) {
                lq.m6045b((View) this);
            }
            this.f7103i = false;
        }
    }

    public void m6083a() {
        if (m6097f().m6118b()) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = this.f7106l.getDefaultDisplay();
            defaultDisplay.getMetrics(displayMetrics);
            int c = li.m6025c(getContext());
            float f = 160.0f / ((float) displayMetrics.densityDpi);
            int round = Math.round(((float) displayMetrics.widthPixels) * f);
            try {
                m6092b("onScreenInfoChanged", new JSONObject().put("width", round).put("height", Math.round(((float) (displayMetrics.heightPixels - c)) * f)).put("density", (double) displayMetrics.density).put("rotation", defaultDisplay.getRotation()));
            } catch (Throwable e) {
                ly.m6069b("Error occured while obtaining screen information.", e);
            }
        }
    }

    public void m6084a(Context context, ay ayVar) {
        synchronized (this.f7097c) {
            this.f7096b.setBaseContext(context);
            this.f7100f = null;
            this.f7101g = ayVar;
            this.f7102h = false;
            this.f7105k = false;
            li.m6023b((WebView) this);
            loadUrl("about:blank");
            this.f7095a.m6120d();
            setOnTouchListener(null);
            setOnClickListener(null);
        }
    }

    public void m6085a(ay ayVar) {
        synchronized (this.f7097c) {
            this.f7101g = ayVar;
            requestLayout();
        }
    }

    public void m6086a(fu fuVar) {
        synchronized (this.f7097c) {
            this.f7100f = fuVar;
        }
    }

    protected void m6087a(String str) {
        synchronized (this.f7097c) {
            if (m6103l()) {
                ly.m6074e("The webview is destroyed. Ignoring action.");
            } else {
                loadUrl(str);
            }
        }
    }

    public void m6088a(String str, Map<String, ?> map) {
        try {
            m6092b(str, li.m6004a((Map) map));
        } catch (JSONException e) {
            ly.m6074e("Could not convert parameters to JSON.");
        }
    }

    public void m6089a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("javascript:" + str + "(");
        stringBuilder.append(jSONObject2);
        stringBuilder.append(");");
        m6087a(stringBuilder.toString());
    }

    public void m6090a(boolean z) {
        synchronized (this.f7097c) {
            this.f7102h = z;
            m6080m();
        }
    }

    public void m6091b() {
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.f7099e.f6668b);
        m6088a("onhide", hashMap);
    }

    public void m6092b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("javascript:AFMA_ReceiveMessage('");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append(",");
        stringBuilder.append(jSONObject2);
        stringBuilder.append(");");
        ly.m6072d("Dispatching AFMA event: " + stringBuilder);
        m6087a(stringBuilder.toString());
    }

    public void m6093b(boolean z) {
        synchronized (this.f7097c) {
            if (this.f7100f != null) {
                this.f7100f.m5544b(z);
            } else {
                this.f7105k = z;
            }
        }
    }

    public void m6094c() {
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.f7099e.f6668b);
        m6088a("onshow", hashMap);
    }

    public fu m6095d() {
        fu fuVar;
        synchronized (this.f7097c) {
            fuVar = this.f7100f;
        }
        return fuVar;
    }

    public void destroy() {
        synchronized (this.f7097c) {
            if (this.f7100f != null) {
                this.f7100f.m5535a();
            }
            this.f7104j = true;
            super.destroy();
        }
    }

    public ay m6096e() {
        ay ayVar;
        synchronized (this.f7097c) {
            ayVar = this.f7101g;
        }
        return ayVar;
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        synchronized (this.f7097c) {
            if (m6103l()) {
                ly.m6074e("The webview is destroyed. Ignoring action.");
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
                return;
            }
            super.evaluateJavascript(str, valueCallback);
        }
    }

    public mc m6097f() {
        return this.f7095a;
    }

    public boolean m6098g() {
        return this.f7105k;
    }

    public oc m6099h() {
        return this.f7098d;
    }

    public gs m6100i() {
        return this.f7099e;
    }

    public boolean m6101j() {
        boolean z;
        synchronized (this.f7097c) {
            z = this.f7102h;
        }
        return z;
    }

    public Context m6102k() {
        return this.f7096b.m6104a();
    }

    public boolean m6103l() {
        boolean z;
        synchronized (this.f7097c) {
            z = this.f7104j;
        }
        return z;
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            getContext().startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ly.m6065a("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3 = Integer.MAX_VALUE;
        synchronized (this.f7097c) {
            if (isInEditMode() || this.f7102h) {
                super.onMeasure(i, i2);
                return;
            }
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            int mode2 = MeasureSpec.getMode(i2);
            int size2 = MeasureSpec.getSize(i2);
            mode = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i3 = size2;
            }
            if (this.f7101g.f6259g > mode || this.f7101g.f6256d > r0) {
                float f = this.f7096b.getResources().getDisplayMetrics().density;
                ly.m6074e("Not enough space to show ad. Needs " + ((int) (((float) this.f7101g.f6259g) / f)) + "x" + ((int) (((float) this.f7101g.f6256d) / f)) + " dp, but only has " + ((int) (((float) size) / f)) + "x" + ((int) (((float) size2) / f)) + " dp.");
                if (getVisibility() != 8) {
                    setVisibility(4);
                }
                setMeasuredDimension(0, 0);
            } else {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                setMeasuredDimension(this.f7101g.f6259g, this.f7101g.f6256d);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f7098d != null) {
            this.f7098d.m6329a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setContext(Context context) {
        this.f7096b.setBaseContext(context);
    }
}
