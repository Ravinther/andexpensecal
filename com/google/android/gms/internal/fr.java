package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import org.json.JSONObject;

@id
public class fr {
    DisplayMetrics f6604a;
    int f6605b;
    int f6606c;
    private final ma f6607d;
    private final Context f6608e;
    private final WindowManager f6609f;
    private final br f6610g;
    private float f6611h;
    private int f6612i;
    private int f6613j;
    private int f6614k;
    private int[] f6615l;

    public fr(ma maVar, Context context, br brVar) {
        this.f6605b = -1;
        this.f6606c = -1;
        this.f6613j = -1;
        this.f6614k = -1;
        this.f6615l = new int[2];
        this.f6607d = maVar;
        this.f6608e = context;
        this.f6610g = brVar;
        this.f6609f = (WindowManager) context.getSystemService("window");
        m5510g();
        m5513a();
        m5511h();
    }

    private void m5510g() {
        this.f6604a = new DisplayMetrics();
        Display defaultDisplay = this.f6609f.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f6604a);
        this.f6611h = this.f6604a.density;
        this.f6612i = defaultDisplay.getRotation();
    }

    private void m5511h() {
        this.f6607d.getLocationOnScreen(this.f6615l);
        this.f6607d.measure(0, 0);
        float f = 160.0f / ((float) this.f6604a.densityDpi);
        this.f6613j = Math.round(((float) this.f6607d.getMeasuredWidth()) * f);
        this.f6614k = Math.round(f * ((float) this.f6607d.getMeasuredHeight()));
    }

    private fo m5512i() {
        return new fq().m5506b(this.f6610g.m5214a()).m5505a(this.f6610g.m5216b()).m5507c(this.f6610g.m5219f()).m5508d(this.f6610g.m5217c()).m5509e(this.f6610g.m5218d()).m5504a();
    }

    void m5513a() {
        int c = li.m6025c(this.f6608e);
        float f = 160.0f / ((float) this.f6604a.densityDpi);
        this.f6605b = Math.round(((float) this.f6604a.widthPixels) * f);
        this.f6606c = Math.round(((float) (this.f6604a.heightPixels - c)) * f);
    }

    public void m5514b() {
        m5517e();
        m5518f();
        m5516d();
        m5515c();
    }

    public void m5515c() {
        if (ly.m6067a(2)) {
            ly.m6070c("Dispatching Ready Event.");
        }
        this.f6607d.m6092b("onReadyEventReceived", new JSONObject());
    }

    public void m5516d() {
        try {
            this.f6607d.m6092b("onDefaultPositionReceived", new JSONObject().put("x", this.f6615l[0]).put("y", this.f6615l[1]).put("width", this.f6613j).put("height", this.f6614k));
        } catch (Throwable e) {
            ly.m6069b("Error occured while dispatching default position.", e);
        }
    }

    public void m5517e() {
        try {
            this.f6607d.m6092b("onScreenInfoChanged", new JSONObject().put("width", this.f6605b).put("height", this.f6606c).put("density", (double) this.f6611h).put("rotation", this.f6612i));
        } catch (Throwable e) {
            ly.m6069b("Error occured while obtaining screen information.", e);
        }
    }

    public void m5518f() {
        this.f6607d.m6092b("onDeviceFeaturesReceived", m5512i().m5498a());
    }
}
