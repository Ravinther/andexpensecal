package com.google.android.gms.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@id
public class ad extends Thread {
    private boolean f6200a;
    private boolean f6201b;
    private boolean f6202c;
    private final Object f6203d;
    private final ac f6204e;
    private final ab f6205f;
    private final ic f6206g;
    private final int f6207h;
    private final int f6208i;
    private final int f6209j;
    private final int f6210k;
    private final int f6211l;

    public ad(ac acVar, ab abVar, Bundle bundle, ic icVar) {
        this.f6200a = false;
        this.f6201b = false;
        this.f6202c = false;
        this.f6204e = acVar;
        this.f6205f = abVar;
        this.f6206g = icVar;
        this.f6203d = new Object();
        this.f6208i = bundle.getInt(bt.f6348j.m6163a());
        this.f6209j = bundle.getInt(bt.f6349k.m6163a());
        this.f6210k = bundle.getInt(bt.f6350l.m6163a());
        this.f6211l = bundle.getInt(bt.f6351m.m6163a());
        this.f6207h = bundle.getInt(bt.f6352n.m6163a(), 10);
        setName("ContentFetchTask");
    }

    private void m5018a(Activity activity) {
        if (activity != null) {
            View view = null;
            if (!(activity.getWindow() == null || activity.getWindow().getDecorView() == null)) {
                view = activity.getWindow().getDecorView().findViewById(16908290);
            }
            if (view != null) {
                m5024a(view);
            }
        }
    }

    private boolean m5019a(WebView webView, aa aaVar) {
        if (!oj.m6347c()) {
            return false;
        }
        aaVar.m5007e();
        webView.post(new af(this, aaVar, webView));
        return true;
    }

    private boolean m5020f() {
        try {
            Context b = this.f6204e.m5017b();
            if (b == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b.getSystemService("keyguard");
            PowerManager powerManager = (PowerManager) b.getSystemService("power");
            if (activityManager == null || keyguardManager == null || powerManager == null) {
                return false;
            }
            List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && powerManager.isScreenOn()) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    ah m5021a(View view, aa aaVar) {
        int i = 0;
        if (view == null) {
            return new ah(this, 0, 0);
        }
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            aaVar.m5004b(((TextView) view).getText().toString());
            return new ah(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof ma)) {
            aaVar.m5007e();
            return m5019a((WebView) view, aaVar) ? new ah(this, 0, 1) : new ah(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new ah(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            int i3 = 0;
            while (i < viewGroup.getChildCount()) {
                ah a = m5021a(viewGroup.getChildAt(i), aaVar);
                i3 += a.f6219a;
                i2 += a.f6220b;
                i++;
            }
            return new ah(this, i3, i2);
        }
    }

    public void m5022a() {
        synchronized (this.f6203d) {
            if (this.f6200a) {
                ly.m6065a("Content hash thread already started, quiting...");
                return;
            }
            this.f6200a = true;
            start();
        }
    }

    void m5023a(aa aaVar, WebView webView, String str) {
        aaVar.m5006d();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (TextUtils.isEmpty(webView.getTitle())) {
                    aaVar.m5001a(optString);
                } else {
                    aaVar.m5001a(webView.getTitle() + "\n" + optString);
                }
            }
            if (aaVar.m5002a()) {
                this.f6205f.m5013b(aaVar);
            }
        } catch (JSONException e) {
            ly.m6065a("Json string may be malformed.");
        } catch (Throwable th) {
            ly.m6066a("Failed to get webview content.", th);
            this.f6206g.m5752b(th);
        }
    }

    boolean m5024a(View view) {
        if (view == null) {
            return false;
        }
        view.post(new ae(this, view));
        return true;
    }

    public aa m5025b() {
        return this.f6205f.m5011a();
    }

    void m5026b(View view) {
        try {
            aa aaVar = new aa(this.f6208i, this.f6209j, this.f6210k, this.f6211l);
            ah a = m5021a(view, aaVar);
            aaVar.m5008f();
            if (a.f6219a != 0 || a.f6220b != 0) {
                if (a.f6220b != 0 || aaVar.m5010h() != 0) {
                    if (a.f6220b != 0 || !this.f6205f.m5012a(aaVar)) {
                        this.f6205f.m5014c(aaVar);
                    }
                }
            }
        } catch (Throwable e) {
            ly.m6069b("Exception in fetchContentOnUIThread", e);
            this.f6206g.m5752b(e);
        }
    }

    public void m5027c() {
        synchronized (this.f6203d) {
            this.f6201b = false;
            this.f6203d.notifyAll();
            ly.m6065a("ContentFetchThread: wakeup");
        }
    }

    public void m5028d() {
        synchronized (this.f6203d) {
            this.f6201b = true;
            ly.m6065a("ContentFetchThread: paused, mPause = " + this.f6201b);
        }
    }

    public boolean m5029e() {
        return this.f6201b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r2 = this;
    L_0x0000:
        r0 = r2.f6202c;
        if (r0 != 0) goto L_0x0051;
    L_0x0004:
        r0 = r2.m5020f();	 Catch:{ Throwable -> 0x0018 }
        if (r0 == 0) goto L_0x0043;
    L_0x000a:
        r0 = r2.f6204e;	 Catch:{ Throwable -> 0x0018 }
        r0 = r0.m5016a();	 Catch:{ Throwable -> 0x0018 }
        if (r0 != 0) goto L_0x0037;
    L_0x0012:
        r0 = "ContentFetchThread: no activity";
        com.google.android.gms.internal.ly.m6065a(r0);	 Catch:{ Throwable -> 0x0018 }
        goto L_0x0000;
    L_0x0018:
        r0 = move-exception;
        r1 = "Error in ContentFetchTask";
        com.google.android.gms.internal.ly.m6069b(r1, r0);
        r1 = r2.f6206g;
        r1.m5752b(r0);
    L_0x0023:
        r1 = r2.f6203d;
        monitor-enter(r1);
    L_0x0026:
        r0 = r2.f6201b;	 Catch:{ all -> 0x004e }
        if (r0 == 0) goto L_0x004c;
    L_0x002a:
        r0 = "ContentFetchTask: waiting";
        com.google.android.gms.internal.ly.m6065a(r0);	 Catch:{ InterruptedException -> 0x0035 }
        r0 = r2.f6203d;	 Catch:{ InterruptedException -> 0x0035 }
        r0.wait();	 Catch:{ InterruptedException -> 0x0035 }
        goto L_0x0026;
    L_0x0035:
        r0 = move-exception;
        goto L_0x0026;
    L_0x0037:
        r2.m5018a(r0);	 Catch:{ Throwable -> 0x0018 }
    L_0x003a:
        r0 = r2.f6207h;	 Catch:{ Throwable -> 0x0018 }
        r0 = r0 * 1000;
        r0 = (long) r0;	 Catch:{ Throwable -> 0x0018 }
        java.lang.Thread.sleep(r0);	 Catch:{ Throwable -> 0x0018 }
        goto L_0x0023;
    L_0x0043:
        r0 = "ContentFetchTask: sleeping";
        com.google.android.gms.internal.ly.m6065a(r0);	 Catch:{ Throwable -> 0x0018 }
        r2.m5028d();	 Catch:{ Throwable -> 0x0018 }
        goto L_0x003a;
    L_0x004c:
        monitor-exit(r1);	 Catch:{ all -> 0x004e }
        goto L_0x0000;
    L_0x004e:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x004e }
        throw r0;
    L_0x0051:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ad.run():void");
    }
}
