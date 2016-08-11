package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.google.android.gms.ads.AdSize;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

@id
public class fk {
    static final Set<String> f6577a;
    private int f6578b;
    private int f6579c;
    private int f6580d;
    private int f6581e;
    private boolean f6582f;
    private String f6583g;
    private final ma f6584h;
    private final Map<String, String> f6585i;
    private final Context f6586j;

    static {
        f6577a = new HashSet(Arrays.asList(new String[]{"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"}));
    }

    public fk(ma maVar, Map<String, String> map) {
        this.f6578b = -1;
        this.f6579c = -1;
        this.f6580d = 0;
        this.f6581e = 0;
        this.f6582f = true;
        this.f6583g = "top-right";
        this.f6584h = maVar;
        this.f6585i = map;
        this.f6586j = maVar.m6102k();
    }

    private void m5486e() {
        int b;
        int[] d = li.m6029d(this.f6586j);
        if (!TextUtils.isEmpty((CharSequence) this.f6585i.get("width"))) {
            b = li.m6021b((String) this.f6585i.get("width"));
            if (m5488a(b, d[0])) {
                this.f6578b = b;
            }
        }
        if (!TextUtils.isEmpty((CharSequence) this.f6585i.get("height"))) {
            b = li.m6021b((String) this.f6585i.get("height"));
            if (m5490b(b, d[1])) {
                this.f6579c = b;
            }
        }
        if (!TextUtils.isEmpty((CharSequence) this.f6585i.get("offsetX"))) {
            this.f6580d = li.m6021b((String) this.f6585i.get("offsetX"));
        }
        if (!TextUtils.isEmpty((CharSequence) this.f6585i.get("offsetY"))) {
            this.f6581e = li.m6021b((String) this.f6585i.get("offsetY"));
        }
        if (!TextUtils.isEmpty((CharSequence) this.f6585i.get("allowOffscreen"))) {
            this.f6582f = Boolean.parseBoolean((String) this.f6585i.get("allowOffscreen"));
        }
        String str = (String) this.f6585i.get("customClosePosition");
        if (!TextUtils.isEmpty(str) && f6577a.contains(str)) {
            this.f6583g = str;
        }
    }

    boolean m5487a() {
        return this.f6578b > -1 && this.f6579c > -1;
    }

    boolean m5488a(int i, int i2) {
        return i >= 50 && i < i2;
    }

    public void m5489b() {
        ly.m6070c("PLEASE IMPLEMENT mraid.resize()");
        if (this.f6586j == null) {
            ly.m6074e("Not an activity context. Cannot resize.");
        } else if (this.f6584h.m6096e().f6257e) {
            ly.m6074e("Is interstitial. Cannot resize an interstitial.");
        } else if (this.f6584h.m6101j()) {
            ly.m6074e("Is expanded. Cannot resize an expanded banner.");
        } else {
            m5486e();
            if (m5487a()) {
                WindowManager windowManager = (WindowManager) this.f6586j.getSystemService("window");
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                int a = lx.m6057a(displayMetrics, this.f6578b) + 16;
                int a2 = lx.m6057a(displayMetrics, this.f6579c) + 16;
                ViewParent parent = this.f6584h.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this.f6584h);
                }
                View linearLayout = new LinearLayout(this.f6586j);
                linearLayout.setBackgroundColor(0);
                PopupWindow popupWindow = new PopupWindow(this.f6586j);
                popupWindow.setHeight(a2);
                popupWindow.setWidth(a);
                popupWindow.setClippingEnabled(!this.f6582f);
                popupWindow.setContentView(linearLayout);
                linearLayout.addView(this.f6584h, -1, -1);
                popupWindow.showAtLocation(((Activity) this.f6586j).getWindow().getDecorView(), 0, this.f6580d, this.f6581e);
                this.f6584h.m6085a(new ay(this.f6586j, new AdSize(this.f6578b, this.f6579c)));
                m5491c();
                m5492d();
                return;
            }
            ly.m6074e("Invalid width and height options. Cannot resize.");
        }
    }

    boolean m5490b(int i, int i2) {
        return i >= 50 && i < i2;
    }

    void m5491c() {
        try {
            this.f6584h.m6092b("onSizeChanged", new JSONObject().put("x", this.f6580d).put("y", this.f6581e).put("width", this.f6578b).put("height", this.f6579c));
        } catch (Throwable e) {
            ly.m6069b("Error occured while dispatching size change.", e);
        }
    }

    void m5492d() {
        try {
            this.f6584h.m6092b("onStateChanged", new JSONObject().put("state", "resized"));
        } catch (Throwable e) {
            ly.m6069b("Error occured while dispatching state change.", e);
        }
    }
}
