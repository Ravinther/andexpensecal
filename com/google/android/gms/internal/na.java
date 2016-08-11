package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class na extends mr {
    private static AdvertisingIdClient f7213e;
    private static CountDownLatch f7214f;
    private static boolean f7215g;

    static {
        f7214f = new CountDownLatch(1);
    }

    protected na(Context context, ok okVar, ol olVar) {
        super(context, okVar, olVar);
    }

    public static na m6166a(String str, Context context) {
        ok gpVar = new gp();
        mr.m6146a(str, context, gpVar);
        synchronized (na.class) {
            if (f7213e == null) {
                f7213e = new AdvertisingIdClient(context);
                new nb().execute(new Void[0]);
            }
        }
        return new na(context, gpVar, new oo(239));
    }

    protected void m6170b(Context context) {
        super.m6156b(context);
        try {
            if (f7215g) {
                m6138a(24, mr.m6152d(context));
                return;
            }
            nc e = m6171e();
            m6137a(28, e.m6174b() ? 1 : 0);
            String a = e.m6173a();
            if (a != null) {
                m6137a(26, 5);
                m6138a(24, a);
            }
        } catch (IOException e2) {
        } catch (ms e3) {
        }
    }

    nc m6171e() {
        int i = 0;
        synchronized (na.class) {
            try {
                nc ncVar;
                if (!f7214f.await(2, TimeUnit.SECONDS)) {
                    ncVar = new nc(this, null, false);
                    return ncVar;
                } else if (f7213e == null) {
                    ncVar = new nc(this, null, false);
                    return ncVar;
                } else {
                    String str;
                    Info info = f7213e.getInfo();
                    String id = info.getId();
                    if (id == null || !id.matches("^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$")) {
                        str = id;
                    } else {
                        byte[] bArr = new byte[16];
                        int i2 = 0;
                        while (i < id.length()) {
                            if (i == 8 || i == 13 || i == 18 || i == 23) {
                                i++;
                            }
                            bArr[i2] = (byte) ((Character.digit(id.charAt(i), 16) << 4) + Character.digit(id.charAt(i + 1), 16));
                            i2++;
                            i += 2;
                        }
                        str = this.c.m5612a(bArr, true);
                    }
                    return new nc(this, str, info.isLimitAdTrackingEnabled());
                }
            } catch (InterruptedException e) {
                return new nc(this, null, false);
            }
        }
    }
}
