package com.google.android.p033a.p034a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.util.Log;
import com.google.android.p033a.p034a.p045a.C0560a;
import com.google.android.p033a.p034a.p045a.C0561b;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/* renamed from: com.google.android.a.a.i */
public class C0571i implements ServiceConnection {
    private static final SecureRandom f6000a;
    private C0568f f6001b;
    private PublicKey f6002c;
    private final Context f6003d;
    private final C0577q f6004e;
    private Handler f6005f;
    private final String f6006g;
    private final String f6007h;
    private final Set<C0575n> f6008i;
    private final Queue<C0575n> f6009j;

    static {
        f6000a = new SecureRandom();
    }

    public C0571i(Context context, C0577q c0577q, String str) {
        this.f6008i = new HashSet();
        this.f6009j = new LinkedList();
        this.f6003d = context;
        this.f6004e = c0577q;
        this.f6002c = C0571i.m4838a(str);
        this.f6006g = this.f6003d.getPackageName();
        this.f6007h = C0571i.m4837a(context, this.f6006g);
        HandlerThread handlerThread = new HandlerThread("background thread");
        handlerThread.start();
        this.f6005f = new Handler(handlerThread.getLooper());
    }

    private static String m4837a(Context context, String str) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(str, 0).versionCode);
        } catch (NameNotFoundException e) {
            Log.e("LicenseChecker", "Package not found. could not get version code.");
            return "";
        }
    }

    private static PublicKey m4838a(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(C0560a.m4821a(str)));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            Log.e("LicenseChecker", "Could not decode from Base64.");
            throw new IllegalArgumentException(e2);
        } catch (Throwable e22) {
            Log.e("LicenseChecker", "Invalid key specification.");
            throw new IllegalArgumentException(e22);
        }
    }

    private void m4840a() {
        while (true) {
            C0575n c0575n = (C0575n) this.f6009j.poll();
            if (c0575n != null) {
                try {
                    Log.i("LicenseChecker", "Calling checkLicense on service for " + c0575n.m4861c());
                    this.f6001b.m4834a((long) c0575n.m4860b(), c0575n.m4861c(), new C0572j(this, c0575n));
                    this.f6008i.add(c0575n);
                } catch (Throwable e) {
                    Log.w("LicenseChecker", "RemoteException in checkLicense call.", e);
                    m4846b(c0575n);
                }
            } else {
                return;
            }
        }
    }

    private synchronized void m4842a(C0575n c0575n) {
        this.f6008i.remove(c0575n);
        if (this.f6008i.isEmpty()) {
            m4844b();
        }
    }

    private void m4844b() {
        if (this.f6001b != null) {
            try {
                this.f6003d.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("LicenseChecker", "Unable to unbind from licensing service (already unbound)");
            }
            this.f6001b = null;
        }
    }

    private synchronized void m4846b(C0575n c0575n) {
        this.f6004e.m4863a(291, null);
        if (this.f6004e.m4864a()) {
            c0575n.m4858a().m4231a(291);
        } else {
            c0575n.m4858a().m4232b(291);
        }
    }

    private int m4847c() {
        return f6000a.nextInt();
    }

    public synchronized void m4849a(C0462m c0462m) {
        if (this.f6004e.m4864a()) {
            Log.i("LicenseChecker", "Using cached license response");
            c0462m.m4231a(256);
        } else {
            C0575n c0575n = new C0575n(this.f6004e, new C0576o(), c0462m, m4847c(), this.f6006g, this.f6007h);
            if (this.f6001b == null) {
                Log.i("LicenseChecker", "Binding to licensing service.");
                try {
                    if (this.f6003d.bindService(new Intent(new String(C0560a.m4821a("Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U="))).setPackage("com.android.vending"), this, 1)) {
                        this.f6009j.offer(c0575n);
                    } else {
                        Log.e("LicenseChecker", "Could not bind to service.");
                        m4846b(c0575n);
                    }
                } catch (SecurityException e) {
                    c0462m.m4233c(6);
                } catch (C0561b e2) {
                    e2.printStackTrace();
                }
            } else {
                this.f6009j.offer(c0575n);
                m4840a();
            }
        }
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f6001b = C0569g.m4835a(iBinder);
        m4840a();
    }

    public synchronized void onServiceDisconnected(ComponentName componentName) {
        Log.w("LicenseChecker", "Service unexpectedly disconnected.");
        this.f6001b = null;
    }
}
