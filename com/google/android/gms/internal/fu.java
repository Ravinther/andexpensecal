package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.search.SearchAdRequest;

@id
public class fu extends gj {
    private static final int f6616a;
    private final Activity f6617b;
    private dr f6618c;
    private gb f6619d;
    private ma f6620e;
    private fy f6621f;
    private ge f6622g;
    private boolean f6623h;
    private boolean f6624i;
    private FrameLayout f6625j;
    private CustomViewCallback f6626k;
    private boolean f6627l;
    private boolean f6628m;
    private boolean f6629n;
    private RelativeLayout f6630o;

    static {
        f6616a = Color.argb(0, 0, 0, 0);
    }

    public fu(Activity activity) {
        this.f6624i = false;
        this.f6627l = false;
        this.f6628m = false;
        this.f6629n = false;
        this.f6617b = activity;
    }

    public static void m5533a(Context context, dr drVar) {
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", drVar.f6447n.f6671e);
        dr.m5366a(intent, drVar);
        if (!oj.m6348d()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    private static LayoutParams m5534c(int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = new LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        return layoutParams;
    }

    public void m5535a() {
        this.f6617b.finish();
    }

    public void m5536a(int i) {
        this.f6617b.setRequestedOrientation(i);
    }

    public void m5537a(int i, int i2, int i3, int i4) {
        if (this.f6619d != null) {
            this.f6619d.setLayoutParams(m5534c(i, i2, i3, i4));
        }
    }

    public void m5538a(Bundle bundle) {
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        this.f6627l = z;
        try {
            this.f6618c = dr.m5365a(this.f6617b.getIntent());
            if (this.f6618c == null) {
                throw new fw("Could not get info for ad overlay.");
            }
            if (this.f6618c.f6450q != null) {
                this.f6629n = this.f6618c.f6450q.f7351b;
            } else {
                this.f6629n = false;
            }
            if (bundle == null) {
                if (this.f6618c.f6437d != null) {
                    this.f6618c.f6437d.m5573q();
                }
                if (!(this.f6618c.f6445l == 1 || this.f6618c.f6436c == null)) {
                    this.f6618c.f6436c.m6413s();
                }
            }
            switch (this.f6618c.f6445l) {
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    m5546c(false);
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    this.f6621f = new fy(this.f6618c.f6438e);
                    m5546c(false);
                case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                    m5546c(true);
                case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                    if (this.f6627l) {
                        this.f6617b.finish();
                    } else if (!fs.m5519a(this.f6617b, this.f6618c.f6435b, this.f6618c.f6443j)) {
                        this.f6617b.finish();
                    }
                default:
                    throw new fw("Could not determine ad overlay type.");
            }
        } catch (fw e) {
            ly.m6074e(e.getMessage());
            this.f6617b.finish();
        }
    }

    public void m5539a(View view, CustomViewCallback customViewCallback) {
        this.f6625j = new FrameLayout(this.f6617b);
        this.f6625j.setBackgroundColor(-16777216);
        this.f6625j.addView(view, -1, -1);
        this.f6617b.setContentView(this.f6625j);
        m5553j();
        this.f6626k = customViewCallback;
        this.f6624i = true;
    }

    public void m5540a(boolean z) {
        this.f6622g = new ge(this.f6617b, z ? 50 : 32);
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        this.f6622g.m5590a(this.f6618c.f6441h);
        this.f6630o.addView(this.f6622g, layoutParams);
    }

    public gb m5541b() {
        return this.f6619d;
    }

    public void m5542b(int i, int i2, int i3, int i4) {
        if (this.f6619d == null) {
            this.f6619d = new gb(this.f6617b, this.f6620e);
            this.f6630o.addView(this.f6619d, 0, m5534c(i, i2, i3, i4));
            this.f6620e.m6097f().m6114a(false);
        }
    }

    public void m5543b(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f6627l);
    }

    public void m5544b(boolean z) {
        if (this.f6622g != null) {
            this.f6622g.m5590a(z);
        }
    }

    public void m5545c() {
        if (this.f6618c != null && this.f6624i) {
            m5536a(this.f6618c.f6444k);
        }
        if (this.f6625j != null) {
            this.f6617b.setContentView(this.f6630o);
            m5553j();
            this.f6625j.removeAllViews();
            this.f6625j = null;
        }
        if (this.f6626k != null) {
            this.f6626k.onCustomViewHidden();
            this.f6626k = null;
        }
        this.f6624i = false;
    }

    void m5546c(boolean z) {
        if (!this.f6623h) {
            this.f6617b.requestWindowFeature(1);
        }
        Window window = this.f6617b.getWindow();
        if (!this.f6629n || this.f6618c.f6450q.f7352c) {
            window.setFlags(1024, 1024);
        }
        m5536a(this.f6618c.f6444k);
        if (VERSION.SDK_INT >= 11) {
            ly.m6065a("Enabling hardware acceleration on the AdActivity window.");
            lq.m6043a(window);
        }
        this.f6630o = new fx(this.f6617b, this.f6618c.f6449p);
        if (this.f6629n) {
            this.f6630o.setBackgroundColor(f6616a);
        } else {
            this.f6630o.setBackgroundColor(-16777216);
        }
        this.f6617b.setContentView(this.f6630o);
        m5553j();
        boolean b = this.f6618c.f6438e.m6097f().m6118b();
        if (z) {
            this.f6620e = ma.m6079a(this.f6617b, this.f6618c.f6438e.m6096e(), true, b, null, this.f6618c.f6447n);
            this.f6620e.m6097f().m6112a(null, null, this.f6618c.f6439f, this.f6618c.f6443j, true, this.f6618c.f6448o, this.f6618c.f6438e.m6097f().m6107a());
            this.f6620e.m6097f().m6110a(new fv(this));
            if (this.f6618c.f6446m != null) {
                this.f6620e.loadUrl(this.f6618c.f6446m);
            } else if (this.f6618c.f6442i != null) {
                this.f6620e.loadDataWithBaseURL(this.f6618c.f6440g, this.f6618c.f6442i, "text/html", "UTF-8", null);
            } else {
                throw new fw("No URL or HTML to display in ad overlay.");
            }
        }
        this.f6620e = this.f6618c.f6438e;
        this.f6620e.setContext(this.f6617b);
        this.f6620e.m6086a(this);
        ViewParent parent = this.f6620e.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.f6620e);
        }
        if (this.f6629n) {
            this.f6620e.setBackgroundColor(f6616a);
        }
        this.f6630o.addView(this.f6620e, -1, -1);
        if (!z) {
            m5556m();
        }
        m5540a(b);
        if (this.f6620e.m6098g()) {
            m5544b(true);
        }
    }

    public void m5547d() {
    }

    public void m5548e() {
    }

    public void m5549f() {
        if (this.f6618c != null && this.f6618c.f6445l == 4) {
            if (this.f6627l) {
                this.f6617b.finish();
            } else {
                this.f6627l = true;
            }
        }
        if (this.f6620e != null) {
            li.m6023b(this.f6620e);
        }
    }

    public void m5550g() {
        if (this.f6619d != null) {
            this.f6619d.m5584c();
        }
        m5545c();
        if (this.f6620e != null && (!this.f6617b.isFinishing() || this.f6621f == null)) {
            li.m6012a(this.f6620e);
        }
        m5555l();
    }

    public void m5551h() {
        m5555l();
    }

    public void m5552i() {
        if (this.f6619d != null) {
            this.f6619d.m5578a();
        }
        if (this.f6620e != null) {
            this.f6630o.removeView(this.f6620e);
        }
        m5555l();
    }

    public void m5553j() {
        this.f6623h = true;
    }

    public void m5554k() {
        this.f6630o.removeView(this.f6622g);
        m5540a(true);
    }

    void m5555l() {
        if (this.f6617b.isFinishing() && !this.f6628m) {
            this.f6628m = true;
            if (this.f6617b.isFinishing()) {
                if (this.f6620e != null) {
                    m5557n();
                    this.f6630o.removeView(this.f6620e);
                    if (this.f6621f != null) {
                        this.f6620e.m6090a(false);
                        this.f6621f.f6635c.addView(this.f6620e, this.f6621f.f6633a, this.f6621f.f6634b);
                    }
                }
                if (this.f6618c != null && this.f6618c.f6437d != null) {
                    this.f6618c.f6437d.m5572p();
                }
            }
        }
    }

    void m5556m() {
        this.f6620e.m6094c();
    }

    void m5557n() {
        this.f6620e.m6091b();
    }
}
