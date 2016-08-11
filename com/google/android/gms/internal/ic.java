package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@id
public class ic implements UncaughtExceptionHandler {
    private UncaughtExceptionHandler f6737a;
    private UncaughtExceptionHandler f6738b;
    private Context f6739c;
    private gs f6740d;

    public ic(Context context, gs gsVar, UncaughtExceptionHandler uncaughtExceptionHandler, UncaughtExceptionHandler uncaughtExceptionHandler2) {
        this.f6737a = uncaughtExceptionHandler;
        this.f6738b = uncaughtExceptionHandler2;
        this.f6739c = context;
        this.f6740d = gsVar;
    }

    public static ic m5746a(Context context, Thread thread, gs gsVar) {
        if (context == null || thread == null || gsVar == null) {
            return null;
        }
        kw.m5958n();
        if (!m5748a(context)) {
            return null;
        }
        UncaughtExceptionHandler uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
        UncaughtExceptionHandler icVar = new ic(context, gsVar, uncaughtExceptionHandler, Thread.getDefaultUncaughtExceptionHandler());
        if (uncaughtExceptionHandler != null && (uncaughtExceptionHandler instanceof ic)) {
            return (ic) uncaughtExceptionHandler;
        }
        try {
            thread.setUncaughtExceptionHandler(icVar);
            return icVar;
        } catch (Throwable e) {
            ly.m6071c("Fail to set UncaughtExceptionHandler.", e);
            return null;
        }
    }

    private String m5747a() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : str + " " + str2;
    }

    private static boolean m5748a(Context context) {
        Bundle n = kw.m5958n();
        return n != null && n.getBoolean("gads:sdk_crash_report_enabled", false);
    }

    private Throwable m5749d(Throwable th) {
        Bundle n = kw.m5958n();
        if (n != null && n.getBoolean("gads:sdk_crash_report_full_stacktrace", false)) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3;
            Throwable th4 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th4.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m5750a(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else if (m5753b(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                } else {
                    arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                }
            }
            if (z) {
                th3 = th2 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th2);
                th3.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            } else {
                th3 = th2;
            }
            th2 = th3;
        }
        return th2;
    }

    protected boolean m5750a(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        if (str.startsWith("com.google.android.gms.ads")) {
            return true;
        }
        if (str.startsWith("com.google.ads")) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(id.class);
        } catch (Throwable e) {
            ly.m6066a("Fail to check class type for class " + str, e);
            return z;
        }
    }

    protected boolean m5751a(Throwable th) {
        boolean z = true;
        if (th == null) {
            return false;
        }
        boolean z2 = false;
        boolean z3 = false;
        while (th != null) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (m5750a(stackTraceElement.getClassName())) {
                    z3 = true;
                }
                if (getClass().getName().equals(stackTraceElement.getClassName())) {
                    z2 = true;
                }
            }
            th = th.getCause();
        }
        if (!z3 || r2) {
            z = false;
        }
        return z;
    }

    public void m5752b(Throwable th) {
        if (m5748a(this.f6739c)) {
            Throwable d = m5749d(th);
            if (d != null) {
                List arrayList = new ArrayList();
                arrayList.add(m5754c(d));
                li.m6008a(this.f6739c, this.f6740d.f6668b, arrayList, kw.m5957l());
            }
        }
    }

    protected boolean m5753b(String str) {
        return TextUtils.isEmpty(str) ? false : str.startsWith("android.") || str.startsWith("java.");
    }

    protected String m5754c(Throwable th) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", VERSION.RELEASE).appendQueryParameter("api", String.valueOf(VERSION.SDK_INT)).appendQueryParameter("device", m5747a()).appendQueryParameter("js", this.f6740d.f6668b).appendQueryParameter("appid", this.f6739c.getApplicationContext().getPackageName()).appendQueryParameter("stacktrace", stringWriter.toString()).toString();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (m5751a(th)) {
            m5752b(th);
            if (Looper.getMainLooper().getThread() != thread) {
                return;
            }
        }
        if (this.f6737a != null) {
            this.f6737a.uncaughtException(thread, th);
        } else if (this.f6738b != null) {
            this.f6738b.uncaughtException(thread, th);
        }
    }
}
