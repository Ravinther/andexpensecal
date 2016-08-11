package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public abstract class mr extends mq {
    static boolean f7142d;
    private static Method f7143e;
    private static Method f7144f;
    private static Method f7145g;
    private static Method f7146h;
    private static Method f7147i;
    private static Method f7148j;
    private static Method f7149k;
    private static Method f7150l;
    private static Method f7151m;
    private static String f7152n;
    private static String f7153o;
    private static String f7154p;
    private static long f7155q;
    private static om f7156r;

    static {
        f7155q = 0;
        f7142d = false;
    }

    protected mr(Context context, ok okVar, ol olVar) {
        super(context, okVar, olVar);
    }

    static String m6143a() {
        if (f7152n != null) {
            return f7152n;
        }
        throw new ms();
    }

    static String m6144a(Context context, ok okVar) {
        if (f7153o != null) {
            return f7153o;
        }
        if (f7146h == null) {
            throw new ms();
        }
        try {
            ByteBuffer byteBuffer = (ByteBuffer) f7146h.invoke(null, new Object[]{context});
            if (byteBuffer == null) {
                throw new ms();
            }
            f7153o = okVar.m5612a(byteBuffer.array(), true);
            return f7153o;
        } catch (Throwable e) {
            throw new ms(e);
        } catch (Throwable e2) {
            throw new ms(e2);
        }
    }

    static ArrayList<Long> m6145a(MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        if (f7147i == null || motionEvent == null) {
            throw new ms();
        }
        try {
            return (ArrayList) f7147i.invoke(null, new Object[]{motionEvent, displayMetrics});
        } catch (Throwable e) {
            throw new ms(e);
        } catch (Throwable e2) {
            throw new ms(e2);
        }
    }

    protected static synchronized void m6146a(String str, Context context, ok okVar) {
        synchronized (mr.class) {
            if (!f7142d) {
                try {
                    f7156r = new om(okVar, null);
                    f7152n = str;
                    m6155g(context);
                    f7155q = m6147b().longValue();
                    f7142d = true;
                } catch (ms e) {
                } catch (UnsupportedOperationException e2) {
                }
            }
        }
    }

    static Long m6147b() {
        if (f7143e == null) {
            throw new ms();
        }
        try {
            return (Long) f7143e.invoke(null, new Object[0]);
        } catch (Throwable e) {
            throw new ms(e);
        } catch (Throwable e2) {
            throw new ms(e2);
        }
    }

    static String m6148b(Context context, ok okVar) {
        if (f7154p != null) {
            return f7154p;
        }
        if (f7149k == null) {
            throw new ms();
        }
        try {
            ByteBuffer byteBuffer = (ByteBuffer) f7149k.invoke(null, new Object[]{context});
            if (byteBuffer == null) {
                throw new ms();
            }
            f7154p = okVar.m5612a(byteBuffer.array(), true);
            return f7154p;
        } catch (Throwable e) {
            throw new ms(e);
        } catch (Throwable e2) {
            throw new ms(e2);
        }
    }

    private static String m6149b(byte[] bArr, String str) {
        try {
            return new String(f7156r.m6356a(bArr, str), "UTF-8");
        } catch (Throwable e) {
            throw new ms(e);
        } catch (Throwable e2) {
            throw new ms(e2);
        }
    }

    static String m6150c() {
        if (f7145g == null) {
            throw new ms();
        }
        try {
            return (String) f7145g.invoke(null, new Object[0]);
        } catch (Throwable e) {
            throw new ms(e);
        } catch (Throwable e2) {
            throw new ms(e2);
        }
    }

    static Long m6151d() {
        if (f7144f == null) {
            throw new ms();
        }
        try {
            return (Long) f7144f.invoke(null, new Object[0]);
        } catch (Throwable e) {
            throw new ms(e);
        } catch (Throwable e2) {
            throw new ms(e2);
        }
    }

    static String m6152d(Context context) {
        if (f7148j == null) {
            throw new ms();
        }
        try {
            String str = (String) f7148j.invoke(null, new Object[]{context});
            if (str != null) {
                return str;
            }
            throw new ms();
        } catch (Throwable e) {
            throw new ms(e);
        } catch (Throwable e2) {
            throw new ms(e2);
        }
    }

    static ArrayList<Long> m6153e(Context context) {
        if (f7150l == null) {
            throw new ms();
        }
        try {
            ArrayList<Long> arrayList = (ArrayList) f7150l.invoke(null, new Object[]{context});
            if (arrayList != null && arrayList.size() == 2) {
                return arrayList;
            }
            throw new ms();
        } catch (Throwable e) {
            throw new ms(e);
        } catch (Throwable e2) {
            throw new ms(e2);
        }
    }

    static int[] m6154f(Context context) {
        if (f7151m == null) {
            throw new ms();
        }
        try {
            return (int[]) f7151m.invoke(null, new Object[]{context});
        } catch (Throwable e) {
            throw new ms(e);
        } catch (Throwable e2) {
            throw new ms(e2);
        }
    }

    private static void m6155g(Context context) {
        File file;
        File createTempFile;
        try {
            byte[] a = f7156r.m6355a(op.m6361a());
            byte[] a2 = f7156r.m6356a(a, op.m6362b());
            File cacheDir = context.getCacheDir();
            if (cacheDir == null) {
                cacheDir = context.getDir("dex", 0);
                if (cacheDir == null) {
                    throw new ms();
                }
            }
            file = cacheDir;
            createTempFile = File.createTempFile("ads", ".jar", file);
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(a2, 0, a2.length);
            fileOutputStream.close();
            DexClassLoader dexClassLoader = new DexClassLoader(createTempFile.getAbsolutePath(), file.getAbsolutePath(), null, context.getClassLoader());
            Class loadClass = dexClassLoader.loadClass(m6149b(a, op.m6365e()));
            Class loadClass2 = dexClassLoader.loadClass(m6149b(a, op.m6377q()));
            Class loadClass3 = dexClassLoader.loadClass(m6149b(a, op.m6371k()));
            Class loadClass4 = dexClassLoader.loadClass(m6149b(a, op.m6369i()));
            Class loadClass5 = dexClassLoader.loadClass(m6149b(a, op.m6379s()));
            Class loadClass6 = dexClassLoader.loadClass(m6149b(a, op.m6367g()));
            Class loadClass7 = dexClassLoader.loadClass(m6149b(a, op.m6375o()));
            Class loadClass8 = dexClassLoader.loadClass(m6149b(a, op.m6373m()));
            Class loadClass9 = dexClassLoader.loadClass(m6149b(a, op.m6363c()));
            f7143e = loadClass.getMethod(m6149b(a, op.m6366f()), new Class[0]);
            f7144f = loadClass2.getMethod(m6149b(a, op.m6378r()), new Class[0]);
            f7145g = loadClass3.getMethod(m6149b(a, op.m6372l()), new Class[0]);
            f7146h = loadClass4.getMethod(m6149b(a, op.m6370j()), new Class[]{Context.class});
            f7147i = loadClass5.getMethod(m6149b(a, op.m6380t()), new Class[]{MotionEvent.class, DisplayMetrics.class});
            f7148j = loadClass6.getMethod(m6149b(a, op.m6368h()), new Class[]{Context.class});
            f7149k = loadClass7.getMethod(m6149b(a, op.m6376p()), new Class[]{Context.class});
            f7150l = loadClass8.getMethod(m6149b(a, op.m6374n()), new Class[]{Context.class});
            f7151m = loadClass9.getMethod(m6149b(a, op.m6364d()), new Class[]{Context.class});
            String name = createTempFile.getName();
            createTempFile.delete();
            new File(file, name.replace(".jar", ".dex")).delete();
        } catch (Throwable e) {
            throw new ms(e);
        } catch (Throwable e2) {
            throw new ms(e2);
        } catch (Throwable e22) {
            throw new ms(e22);
        } catch (Throwable e222) {
            throw new ms(e222);
        } catch (Throwable e2222) {
            throw new ms(e2222);
        } catch (Throwable e22222) {
            throw new ms(e22222);
        } catch (Throwable th) {
            String name2 = createTempFile.getName();
            createTempFile.delete();
            new File(file, name2.replace(".jar", ".dex")).delete();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void m6156b(android.content.Context r7) {
        /*
        r6 = this;
        r0 = 1;
        r1 = m6150c();	 Catch:{ ms -> 0x00a1, IOException -> 0x0090 }
        r6.m6138a(r0, r1);	 Catch:{ ms -> 0x00a1, IOException -> 0x0090 }
    L_0x0008:
        r0 = 2;
        r1 = m6143a();	 Catch:{ ms -> 0x009e, IOException -> 0x0090 }
        r6.m6138a(r0, r1);	 Catch:{ ms -> 0x009e, IOException -> 0x0090 }
    L_0x0010:
        r0 = m6147b();	 Catch:{ ms -> 0x009c, IOException -> 0x0090 }
        r0 = r0.longValue();	 Catch:{ ms -> 0x009c, IOException -> 0x0090 }
        r2 = 25;
        r6.m6137a(r2, r0);	 Catch:{ ms -> 0x009c, IOException -> 0x0090 }
        r2 = f7155q;	 Catch:{ ms -> 0x009c, IOException -> 0x0090 }
        r4 = 0;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 == 0) goto L_0x0034;
    L_0x0025:
        r2 = 17;
        r4 = f7155q;	 Catch:{ ms -> 0x009c, IOException -> 0x0090 }
        r0 = r0 - r4;
        r6.m6137a(r2, r0);	 Catch:{ ms -> 0x009c, IOException -> 0x0090 }
        r0 = 23;
        r2 = f7155q;	 Catch:{ ms -> 0x009c, IOException -> 0x0090 }
        r6.m6137a(r0, r2);	 Catch:{ ms -> 0x009c, IOException -> 0x0090 }
    L_0x0034:
        r1 = m6153e(r7);	 Catch:{ ms -> 0x009a, IOException -> 0x0090 }
        r2 = 31;
        r0 = 0;
        r0 = r1.get(r0);	 Catch:{ ms -> 0x009a, IOException -> 0x0090 }
        r0 = (java.lang.Long) r0;	 Catch:{ ms -> 0x009a, IOException -> 0x0090 }
        r4 = r0.longValue();	 Catch:{ ms -> 0x009a, IOException -> 0x0090 }
        r6.m6137a(r2, r4);	 Catch:{ ms -> 0x009a, IOException -> 0x0090 }
        r2 = 32;
        r0 = 1;
        r0 = r1.get(r0);	 Catch:{ ms -> 0x009a, IOException -> 0x0090 }
        r0 = (java.lang.Long) r0;	 Catch:{ ms -> 0x009a, IOException -> 0x0090 }
        r0 = r0.longValue();	 Catch:{ ms -> 0x009a, IOException -> 0x0090 }
        r6.m6137a(r2, r0);	 Catch:{ ms -> 0x009a, IOException -> 0x0090 }
    L_0x0058:
        r0 = 33;
        r1 = m6151d();	 Catch:{ ms -> 0x0098, IOException -> 0x0090 }
        r2 = r1.longValue();	 Catch:{ ms -> 0x0098, IOException -> 0x0090 }
        r6.m6137a(r0, r2);	 Catch:{ ms -> 0x0098, IOException -> 0x0090 }
    L_0x0065:
        r0 = 27;
        r1 = r6.c;	 Catch:{ ms -> 0x0096, IOException -> 0x0090 }
        r1 = m6144a(r7, r1);	 Catch:{ ms -> 0x0096, IOException -> 0x0090 }
        r6.m6138a(r0, r1);	 Catch:{ ms -> 0x0096, IOException -> 0x0090 }
    L_0x0070:
        r0 = 29;
        r1 = r6.c;	 Catch:{ ms -> 0x0094, IOException -> 0x0090 }
        r1 = m6148b(r7, r1);	 Catch:{ ms -> 0x0094, IOException -> 0x0090 }
        r6.m6138a(r0, r1);	 Catch:{ ms -> 0x0094, IOException -> 0x0090 }
    L_0x007b:
        r0 = m6154f(r7);	 Catch:{ ms -> 0x0092, IOException -> 0x0090 }
        r1 = 5;
        r2 = 0;
        r2 = r0[r2];	 Catch:{ ms -> 0x0092, IOException -> 0x0090 }
        r2 = (long) r2;	 Catch:{ ms -> 0x0092, IOException -> 0x0090 }
        r6.m6137a(r1, r2);	 Catch:{ ms -> 0x0092, IOException -> 0x0090 }
        r1 = 6;
        r2 = 1;
        r0 = r0[r2];	 Catch:{ ms -> 0x0092, IOException -> 0x0090 }
        r2 = (long) r0;	 Catch:{ ms -> 0x0092, IOException -> 0x0090 }
        r6.m6137a(r1, r2);	 Catch:{ ms -> 0x0092, IOException -> 0x0090 }
    L_0x008f:
        return;
    L_0x0090:
        r0 = move-exception;
        goto L_0x008f;
    L_0x0092:
        r0 = move-exception;
        goto L_0x008f;
    L_0x0094:
        r0 = move-exception;
        goto L_0x007b;
    L_0x0096:
        r0 = move-exception;
        goto L_0x0070;
    L_0x0098:
        r0 = move-exception;
        goto L_0x0065;
    L_0x009a:
        r0 = move-exception;
        goto L_0x0058;
    L_0x009c:
        r0 = move-exception;
        goto L_0x0034;
    L_0x009e:
        r0 = move-exception;
        goto L_0x0010;
    L_0x00a1:
        r0 = move-exception;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mr.b(android.content.Context):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void m6157c(android.content.Context r7) {
        /*
        r6 = this;
        r0 = 2;
        r1 = m6143a();	 Catch:{ ms -> 0x0065, IOException -> 0x005d }
        r6.m6138a(r0, r1);	 Catch:{ ms -> 0x0065, IOException -> 0x005d }
    L_0x0008:
        r0 = 1;
        r1 = m6150c();	 Catch:{ ms -> 0x0063, IOException -> 0x005d }
        r6.m6138a(r0, r1);	 Catch:{ ms -> 0x0063, IOException -> 0x005d }
    L_0x0010:
        r0 = 25;
        r1 = m6147b();	 Catch:{ ms -> 0x0061, IOException -> 0x005d }
        r2 = r1.longValue();	 Catch:{ ms -> 0x0061, IOException -> 0x005d }
        r6.m6137a(r0, r2);	 Catch:{ ms -> 0x0061, IOException -> 0x005d }
    L_0x001d:
        r0 = r6.a;	 Catch:{ ms -> 0x005f, IOException -> 0x005d }
        r1 = r6.b;	 Catch:{ ms -> 0x005f, IOException -> 0x005d }
        r1 = m6145a(r0, r1);	 Catch:{ ms -> 0x005f, IOException -> 0x005d }
        r2 = 14;
        r0 = 0;
        r0 = r1.get(r0);	 Catch:{ ms -> 0x005f, IOException -> 0x005d }
        r0 = (java.lang.Long) r0;	 Catch:{ ms -> 0x005f, IOException -> 0x005d }
        r4 = r0.longValue();	 Catch:{ ms -> 0x005f, IOException -> 0x005d }
        r6.m6137a(r2, r4);	 Catch:{ ms -> 0x005f, IOException -> 0x005d }
        r2 = 15;
        r0 = 1;
        r0 = r1.get(r0);	 Catch:{ ms -> 0x005f, IOException -> 0x005d }
        r0 = (java.lang.Long) r0;	 Catch:{ ms -> 0x005f, IOException -> 0x005d }
        r4 = r0.longValue();	 Catch:{ ms -> 0x005f, IOException -> 0x005d }
        r6.m6137a(r2, r4);	 Catch:{ ms -> 0x005f, IOException -> 0x005d }
        r0 = r1.size();	 Catch:{ ms -> 0x005f, IOException -> 0x005d }
        r2 = 3;
        if (r0 < r2) goto L_0x005c;
    L_0x004c:
        r2 = 16;
        r0 = 2;
        r0 = r1.get(r0);	 Catch:{ ms -> 0x005f, IOException -> 0x005d }
        r0 = (java.lang.Long) r0;	 Catch:{ ms -> 0x005f, IOException -> 0x005d }
        r0 = r0.longValue();	 Catch:{ ms -> 0x005f, IOException -> 0x005d }
        r6.m6137a(r2, r0);	 Catch:{ ms -> 0x005f, IOException -> 0x005d }
    L_0x005c:
        return;
    L_0x005d:
        r0 = move-exception;
        goto L_0x005c;
    L_0x005f:
        r0 = move-exception;
        goto L_0x005c;
    L_0x0061:
        r0 = move-exception;
        goto L_0x001d;
    L_0x0063:
        r0 = move-exception;
        goto L_0x0010;
    L_0x0065:
        r0 = move-exception;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mr.c(android.content.Context):void");
    }
}
