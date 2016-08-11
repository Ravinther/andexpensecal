package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import org.json.JSONArray;
import org.json.JSONObject;

@id
/* renamed from: com.google.android.gms.internal.h */
public final class C0635h implements OnGlobalLayoutListener, OnScrollChangedListener {
    private final Object f6703a;
    private final WeakReference<kr> f6704b;
    private WeakReference<ViewTreeObserver> f6705c;
    private final WeakReference<View> f6706d;
    private final C0632f f6707e;
    private final Context f6708f;
    private final C0645q f6709g;
    private boolean f6710h;
    private final WindowManager f6711i;
    private final PowerManager f6712j;
    private final KeyguardManager f6713k;
    private C0633p f6714l;
    private boolean f6715m;
    private boolean f6716n;
    private final BlockingQueue<Runnable> f6717o;
    private long f6718p;
    private boolean f6719q;
    private boolean f6720r;
    private BroadcastReceiver f6721s;
    private final HashSet<C0626e> f6722t;

    public C0635h(Context context, ay ayVar, kr krVar, View view, gs gsVar) {
        this(ayVar, krVar, gsVar, view, new C0649v(context, gsVar));
    }

    public C0635h(ay ayVar, kr krVar, gs gsVar, View view, C0645q c0645q) {
        this.f6703a = new Object();
        this.f6715m = false;
        this.f6716n = false;
        this.f6717o = new ArrayBlockingQueue(2);
        this.f6718p = Long.MIN_VALUE;
        this.f6722t = new HashSet();
        this.f6704b = new WeakReference(krVar);
        this.f6706d = new WeakReference(view);
        this.f6705c = new WeakReference(null);
        this.f6719q = true;
        this.f6707e = new C0632f(UUID.randomUUID().toString(), gsVar, ayVar.f6254b, krVar.f6984j);
        this.f6709g = c0645q;
        this.f6711i = (WindowManager) view.getContext().getSystemService("window");
        this.f6712j = (PowerManager) view.getContext().getApplicationContext().getSystemService("power");
        this.f6713k = (KeyguardManager) view.getContext().getSystemService("keyguard");
        this.f6708f = view.getContext().getApplicationContext();
        m5682a(c0645q);
        this.f6709g.m6497a(new C0637i(this, view));
        m5688b(this.f6709g);
        try {
            this.f6717o.add(new C0639j(this, m5686b(view)));
        } catch (Throwable th) {
        }
        this.f6717o.add(new C0640k(this));
        ly.m6065a("Tracking ad unit: " + this.f6707e.m5475d());
    }

    protected int m5676a(int i, DisplayMetrics displayMetrics) {
        return (int) (((float) i) / displayMetrics.density);
    }

    protected void m5677a() {
        synchronized (this.f6703a) {
            if (this.f6721s != null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            this.f6721s = new C0641l(this);
            this.f6708f.registerReceiver(this.f6721s, intentFilter);
        }
    }

    protected void m5678a(View view) {
        Object arrayList = new ArrayList();
        this.f6717o.drainTo(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    protected void m5679a(View view, Map<String, String> map) {
        m5689b(false);
    }

    public void m5680a(C0626e c0626e) {
        this.f6722t.add(c0626e);
    }

    public void m5681a(C0633p c0633p) {
        synchronized (this.f6703a) {
            this.f6714l = c0633p;
        }
    }

    protected void m5682a(C0645q c0645q) {
        c0645q.m6498a("https://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.html");
    }

    protected void m5683a(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONArray.put(jSONObject);
            jSONObject2.put("units", jSONArray);
            this.f6709g.m6500a("AFMA_updateActiveView", jSONObject2);
        } catch (Throwable th) {
            ly.m6069b("Skipping active view message.", th);
        }
    }

    protected void m5684a(boolean z) {
        Iterator it = this.f6722t.iterator();
        while (it.hasNext()) {
            ((C0626e) it.next()).m4995a(this, z);
        }
    }

    protected boolean m5685a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        boolean z = !TextUtils.isEmpty(str) && str.equals(this.f6707e.m5475d());
        return z;
    }

    protected JSONObject m5686b(View view) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        view.getLocationInWindow(iArr2);
        JSONObject i = m5697i();
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        rect2.right = this.f6711i.getDefaultDisplay().getWidth();
        rect2.bottom = this.f6711i.getDefaultDisplay().getHeight();
        Rect rect3 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect3, null);
        Rect rect4 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect4);
        Rect rect5 = new Rect();
        view.getHitRect(rect5);
        i.put("viewBox", new JSONObject().put("top", m5676a(rect2.top, displayMetrics)).put("bottom", m5676a(rect2.bottom, displayMetrics)).put("left", m5676a(rect2.left, displayMetrics)).put("right", m5676a(rect2.right, displayMetrics))).put("adBox", new JSONObject().put("top", m5676a(rect.top, displayMetrics)).put("bottom", m5676a(rect.bottom, displayMetrics)).put("left", m5676a(rect.left, displayMetrics)).put("right", m5676a(rect.right, displayMetrics))).put("globalVisibleBox", new JSONObject().put("top", m5676a(rect3.top, displayMetrics)).put("bottom", m5676a(rect3.bottom, displayMetrics)).put("left", m5676a(rect3.left, displayMetrics)).put("right", m5676a(rect3.right, displayMetrics))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", m5676a(rect4.top, displayMetrics)).put("bottom", m5676a(rect4.bottom, displayMetrics)).put("left", m5676a(rect4.left, displayMetrics)).put("right", m5676a(rect4.right, displayMetrics))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", m5676a(rect5.top, displayMetrics)).put("bottom", m5676a(rect5.bottom, displayMetrics)).put("left", m5676a(rect5.left, displayMetrics)).put("right", m5676a(rect5.right, displayMetrics))).put("windowVisibility", view.getWindowVisibility()).put("screenDensity", (double) displayMetrics.density).put("isVisible", m5691c(view)).put("isStopped", this.f6716n).put("isPaused", this.f6715m);
        if (oj.m6347c()) {
            i.put("isAttachedToWindow", view.isAttachedToWindow());
        }
        return i;
    }

    protected void m5687b() {
        synchronized (this.f6703a) {
            if (this.f6721s != null) {
                this.f6708f.unregisterReceiver(this.f6721s);
                this.f6721s = null;
            }
        }
    }

    protected void m5688b(C0645q c0645q) {
        c0645q.m6499a("/updateActiveView", new C0642m(this));
        c0645q.m6499a("/untrackActiveViewUnit", new C0643n(this));
        c0645q.m6499a("/visibilityChanged", new C0644o(this));
        c0645q.m6499a("/viewabilityChanged", cp.f6387a);
    }

    protected void m5689b(boolean z) {
        synchronized (this.f6703a) {
            if (this.f6710h && this.f6719q) {
                long a = kw.m5947a().m5966b().m6336a();
                if (!z || this.f6718p + 200 <= a) {
                    this.f6718p = a;
                    View view = (View) this.f6706d.get();
                    Object obj = (view == null || ((kr) this.f6704b.get()) == null) ? 1 : null;
                    if (obj != null) {
                        m5692d();
                        return;
                    }
                    try {
                        m5683a(m5686b(view));
                    } catch (Throwable e) {
                        ly.m6066a("Active view update failed.", e);
                    }
                    m5695g();
                    m5693e();
                    return;
                }
                return;
            }
        }
    }

    protected void m5690c() {
        synchronized (this.f6703a) {
            m5696h();
            m5687b();
            this.f6719q = false;
            try {
                this.f6709g.m6503c();
            } catch (Throwable th) {
            }
            m5693e();
        }
    }

    protected boolean m5691c(View view) {
        return view.getVisibility() == 0 && view.isShown() && this.f6712j.isScreenOn() && !this.f6713k.inKeyguardRestrictedInputMode();
    }

    public void m5692d() {
        synchronized (this.f6703a) {
            if (this.f6719q) {
                this.f6720r = true;
                try {
                    m5683a(m5698j());
                } catch (Throwable e) {
                    ly.m6069b("JSON Failure while processing active view data.", e);
                }
                ly.m6065a("Untracking ad unit: " + this.f6707e.m5475d());
            }
        }
    }

    protected void m5693e() {
        if (this.f6714l != null) {
            this.f6714l.m5563a(this);
        }
    }

    public boolean m5694f() {
        boolean z;
        synchronized (this.f6703a) {
            z = this.f6719q;
        }
        return z;
    }

    protected void m5695g() {
        View view = (View) this.f6706d.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f6705c.get();
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2 != viewTreeObserver) {
                this.f6705c = new WeakReference(viewTreeObserver2);
                viewTreeObserver2.addOnScrollChangedListener(this);
                viewTreeObserver2.addOnGlobalLayoutListener(this);
            }
        }
    }

    protected void m5696h() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f6705c.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    protected JSONObject m5697i() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("afmaVersion", this.f6707e.m5473b()).put("activeViewJSON", this.f6707e.m5474c()).put("timestamp", kw.m5947a().m5966b().m6336a()).put("adFormat", this.f6707e.m5472a()).put("hashCode", this.f6707e.m5475d());
        return jSONObject;
    }

    protected JSONObject m5698j() {
        JSONObject i = m5697i();
        i.put("doneReasonCode", "u");
        return i;
    }

    public void m5699k() {
        synchronized (this.f6703a) {
            this.f6716n = true;
            m5689b(false);
            this.f6709g.m6495a();
        }
    }

    public void m5700l() {
        synchronized (this.f6703a) {
            this.f6715m = true;
            m5689b(false);
            this.f6709g.m6495a();
        }
    }

    public void m5701m() {
        synchronized (this.f6703a) {
            this.f6709g.m6501b();
            this.f6715m = false;
            m5689b(false);
        }
    }

    public void onGlobalLayout() {
        m5689b(false);
    }

    public void onScrollChanged() {
        m5689b(true);
    }
}
