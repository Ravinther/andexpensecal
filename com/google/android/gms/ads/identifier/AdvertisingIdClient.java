package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.C0616e;
import com.google.android.gms.common.C0619g;
import com.google.android.gms.common.C0620i;
import com.google.android.gms.internal.ob;
import com.google.android.gms.internal.ox;
import com.google.android.gms.internal.oy;
import java.io.IOException;

public class AdvertisingIdClient {
    C0620i f6061a;
    ox f6062b;
    boolean f6063c;
    Object f6064d;
    C0595a f6065e;
    final long f6066f;
    private final Context f6067g;

    public final class Info {
        private final String f6059a;
        private final boolean f6060b;

        public Info(String str, boolean z) {
            this.f6059a = str;
            this.f6060b = z;
        }

        public String getId() {
            return this.f6059a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f6060b;
        }

        public String toString() {
            return "{" + this.f6059a + "}" + this.f6060b;
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000);
    }

    public AdvertisingIdClient(Context context, long j) {
        this.f6064d = new Object();
        ob.m6315a((Object) context);
        this.f6067g = context;
        this.f6063c = false;
        this.f6066f = j;
    }

    static C0620i m4889a(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            try {
                C0619g.m4951b(context);
                Object c0620i = new C0620i();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (context.bindService(intent, c0620i, 1)) {
                    return c0620i;
                }
                throw new IOException("Connection failure");
            } catch (Throwable e) {
                throw new IOException(e);
            }
        } catch (NameNotFoundException e2) {
            throw new C0616e(9);
        }
    }

    static ox m4890a(Context context, C0620i c0620i) {
        try {
            return oy.m6408a(c0620i.m4956a());
        } catch (InterruptedException e) {
            throw new IOException("Interrupted exception");
        }
    }

    private void m4891a() {
        synchronized (this.f6064d) {
            if (this.f6065e != null) {
                this.f6065e.m4894a();
                try {
                    this.f6065e.join();
                } catch (InterruptedException e) {
                }
            }
            if (this.f6066f > 0) {
                this.f6065e = new C0595a(this, this.f6066f);
            }
        }
    }

    public static Info getAdvertisingIdInfo(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1);
        try {
            advertisingIdClient.m4892a(false);
            Info info = advertisingIdClient.getInfo();
            return info;
        } finally {
            advertisingIdClient.finish();
        }
    }

    protected void m4892a(boolean z) {
        ob.m6322b("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f6063c) {
                finish();
            }
            this.f6061a = m4889a(this.f6067g);
            this.f6062b = m4890a(this.f6067g, this.f6061a);
            this.f6063c = true;
            if (z) {
                m4891a();
            }
        }
    }

    protected void finalize() {
        finish();
        super.finalize();
    }

    public void finish() {
        ob.m6322b("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f6067g == null || this.f6061a == null) {
                return;
            }
            try {
                if (this.f6063c) {
                    this.f6067g.unbindService(this.f6061a);
                }
            } catch (Throwable e) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", e);
            }
            this.f6063c = false;
            this.f6062b = null;
            this.f6061a = null;
        }
    }

    public Info getInfo() {
        Info info;
        ob.m6322b("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f6063c) {
                synchronized (this.f6064d) {
                    if (this.f6065e == null || !this.f6065e.m4895b()) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m4892a(false);
                    if (!this.f6063c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Throwable e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Throwable e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            ob.m6315a(this.f6061a);
            ob.m6315a(this.f6062b);
            info = new Info(this.f6062b.m6404a(), this.f6062b.m6407a(true));
        }
        m4891a();
        return info;
    }

    public void start() {
        m4892a(true);
    }
}
