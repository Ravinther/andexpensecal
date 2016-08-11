package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.net.UrlQuerySanitizer.ParameterValuePair;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.AdRequest;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@id
public final class li {
    private static final Object f7064a;
    private static final SimpleDateFormat[] f7065b;
    private static boolean f7066c;
    private static String f7067d;
    private static boolean f7068e;

    static {
        f7064a = new Object();
        f7065b = new SimpleDateFormat[]{new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"), new SimpleDateFormat("yyyyMMdd")};
        f7066c = true;
        f7068e = false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m5997a(android.content.Context r3, java.lang.String r4) {
        /*
        r1 = f7064a;
        monitor-enter(r1);
        r0 = f7067d;	 Catch:{ all -> 0x003c }
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = f7067d;	 Catch:{ all -> 0x003c }
        monitor-exit(r1);	 Catch:{ all -> 0x003c }
    L_0x000a:
        return r0;
    L_0x000b:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x003c }
        r2 = 17;
        if (r0 < r2) goto L_0x0040;
    L_0x0011:
        r0 = com.google.android.gms.internal.lv.m6052a(r3);	 Catch:{ Exception -> 0x003f }
        f7067d = r0;	 Catch:{ Exception -> 0x003f }
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x003f }
        r0.<init>();	 Catch:{ Exception -> 0x003f }
        r2 = f7067d;	 Catch:{ Exception -> 0x003f }
        r0 = r0.append(r2);	 Catch:{ Exception -> 0x003f }
        r2 = " (Mobile; ";
        r0 = r0.append(r2);	 Catch:{ Exception -> 0x003f }
        r0 = r0.append(r4);	 Catch:{ Exception -> 0x003f }
        r2 = ")";
        r0 = r0.append(r2);	 Catch:{ Exception -> 0x003f }
        r0 = r0.toString();	 Catch:{ Exception -> 0x003f }
        f7067d = r0;	 Catch:{ Exception -> 0x003f }
        r0 = f7067d;	 Catch:{ Exception -> 0x003f }
        monitor-exit(r1);	 Catch:{ all -> 0x003c }
        goto L_0x000a;
    L_0x003c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003c }
        throw r0;
    L_0x003f:
        r0 = move-exception;
    L_0x0040:
        r0 = com.google.android.gms.internal.lx.m6064b();	 Catch:{ all -> 0x003c }
        if (r0 != 0) goto L_0x007a;
    L_0x0046:
        r0 = com.google.android.gms.internal.lx.f7093a;	 Catch:{ all -> 0x003c }
        r2 = new com.google.android.gms.internal.lj;	 Catch:{ all -> 0x003c }
        r2.<init>(r3);	 Catch:{ all -> 0x003c }
        r0.post(r2);	 Catch:{ all -> 0x003c }
    L_0x0050:
        r0 = f7067d;	 Catch:{ all -> 0x003c }
        if (r0 != 0) goto L_0x0080;
    L_0x0054:
        r0 = f7064a;	 Catch:{ InterruptedException -> 0x005a }
        r0.wait();	 Catch:{ InterruptedException -> 0x005a }
        goto L_0x0050;
    L_0x005a:
        r0 = move-exception;
        r0 = m6028d();	 Catch:{ all -> 0x003c }
        f7067d = r0;	 Catch:{ all -> 0x003c }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x003c }
        r0.<init>();	 Catch:{ all -> 0x003c }
        r2 = "Interrupted, use default user agent: ";
        r0 = r0.append(r2);	 Catch:{ all -> 0x003c }
        r2 = f7067d;	 Catch:{ all -> 0x003c }
        r0 = r0.append(r2);	 Catch:{ all -> 0x003c }
        r0 = r0.toString();	 Catch:{ all -> 0x003c }
        com.google.android.gms.internal.ly.m6074e(r0);	 Catch:{ all -> 0x003c }
        goto L_0x0050;
    L_0x007a:
        r0 = m6034f(r3);	 Catch:{ Exception -> 0x00a6 }
        f7067d = r0;	 Catch:{ Exception -> 0x00a6 }
    L_0x0080:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x003c }
        r0.<init>();	 Catch:{ all -> 0x003c }
        r2 = f7067d;	 Catch:{ all -> 0x003c }
        r0 = r0.append(r2);	 Catch:{ all -> 0x003c }
        r2 = " (Mobile; ";
        r0 = r0.append(r2);	 Catch:{ all -> 0x003c }
        r0 = r0.append(r4);	 Catch:{ all -> 0x003c }
        r2 = ")";
        r0 = r0.append(r2);	 Catch:{ all -> 0x003c }
        r0 = r0.toString();	 Catch:{ all -> 0x003c }
        f7067d = r0;	 Catch:{ all -> 0x003c }
        r0 = f7067d;	 Catch:{ all -> 0x003c }
        monitor-exit(r1);	 Catch:{ all -> 0x003c }
        goto L_0x000a;
    L_0x00a6:
        r0 = move-exception;
        r0 = m6028d();	 Catch:{ all -> 0x003c }
        f7067d = r0;	 Catch:{ all -> 0x003c }
        goto L_0x0080;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.li.a(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String m5998a(Readable readable) {
        StringBuilder stringBuilder = new StringBuilder();
        CharSequence allocate = CharBuffer.allocate(2048);
        while (true) {
            int read = readable.read(allocate);
            if (read == -1) {
                return stringBuilder.toString();
            }
            allocate.flip();
            stringBuilder.append(allocate, 0, read);
        }
    }

    public static String m5999a(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }

    public static Map<String, String> m6000a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
        urlQuerySanitizer.setAllowUnregisteredParamaters(true);
        urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
        urlQuerySanitizer.parseUrl(uri.toString());
        for (ParameterValuePair parameterValuePair : urlQuerySanitizer.getParameterList()) {
            hashMap.put(parameterValuePair.mParameter, parameterValuePair.mValue);
        }
        return hashMap;
    }

    private static JSONArray m6001a(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object a : collection) {
            m6013a(jSONArray, a);
        }
        return jSONArray;
    }

    static JSONArray m6002a(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object a : objArr) {
            m6013a(jSONArray, a);
        }
        return jSONArray;
    }

    private static JSONObject m6003a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m6014a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public static JSONObject m6004a(Map<String, ?> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m6014a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            throw new JSONException("Could not convert map to JSON: " + e.getMessage());
        }
    }

    public static void m6005a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(m5997a(context, str));
    }

    public static void m6006a(Context context, String str, String str2) {
        List arrayList = new ArrayList();
        arrayList.add(str2);
        m6007a(context, str, arrayList);
    }

    public static void m6007a(Context context, String str, List<String> list) {
        for (String lwVar : list) {
            new lw(context, str, lwVar).m5624e();
        }
    }

    public static void m6008a(Context context, String str, List<String> list, String str2) {
        for (String lwVar : list) {
            new lw(context, str, lwVar, str2).m5624e();
        }
    }

    public static void m6009a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        m6011a(context, str, z, httpURLConnection, false);
    }

    public static void m6010a(Context context, String str, boolean z, HttpURLConnection httpURLConnection, String str2) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(z);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", str2);
        httpURLConnection.setUseCaches(false);
    }

    public static void m6011a(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(z);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", m5997a(context, str));
        httpURLConnection.setUseCaches(z2);
    }

    public static void m6012a(WebView webView) {
        if (VERSION.SDK_INT >= 11) {
            lq.m6044a(webView);
        }
    }

    private static void m6013a(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(m6003a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(m6004a((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(m6001a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(m6002a((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    private static void m6014a(JSONObject jSONObject, String str, Object obj) {
        if (obj instanceof Bundle) {
            jSONObject.put(str, m6003a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, m6004a((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, m6001a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m6001a(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    public static boolean m6015a() {
        return f7066c;
    }

    public static boolean m6016a(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            ly.m6074e("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        boolean z;
        String str = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
        if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
            ly.m6074e(String.format(str, new Object[]{"keyboard"}));
            z = false;
        } else {
            z = true;
        }
        if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
            ly.m6074e(String.format(str, new Object[]{"keyboardHidden"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 128) == 0) {
            ly.m6074e(String.format(str, new Object[]{"orientation"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 256) == 0) {
            ly.m6074e(String.format(str, new Object[]{"screenLayout"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) {
            ly.m6074e(String.format(str, new Object[]{"uiMode"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 1024) == 0) {
            ly.m6074e(String.format(str, new Object[]{"screenSize"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 2048) != 0) {
            return z;
        }
        ly.m6074e(String.format(str, new Object[]{"smallestScreenSize"}));
        return false;
    }

    public static boolean m6017a(PackageManager packageManager, String str, String str2) {
        return packageManager.checkPermission(str2, str) == 0;
    }

    public static boolean m6018a(ClassLoader classLoader, Class<?> cls, String str) {
        boolean z = false;
        try {
            z = cls.isAssignableFrom(Class.forName(str, false, classLoader));
        } catch (Throwable th) {
        }
        return z;
    }

    public static int m6020b() {
        return VERSION.SDK_INT >= 9 ? 6 : 0;
    }

    public static int m6021b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            ly.m6074e("Could not parse value:" + e);
            return 0;
        }
    }

    public static void m6022b(Context context) {
        if (!f7068e) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            context.getApplicationContext().registerReceiver(new lk(), intentFilter);
            f7068e = true;
        }
    }

    public static void m6023b(WebView webView) {
        if (VERSION.SDK_INT >= 11) {
            lq.m6046b(webView);
        }
    }

    public static int m6024c() {
        return VERSION.SDK_INT >= 9 ? 7 : 1;
    }

    public static int m6025c(Context context) {
        int i;
        int i2 = 0;
        if (context instanceof Activity) {
            Window window = ((Activity) context).getWindow();
            Rect rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            i = rect.top;
            i2 = window.findViewById(16908290).getTop() - i;
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public static boolean m6026c(String str) {
        return TextUtils.isEmpty(str) ? false : str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    public static long m6027d(String str) {
        long j = -1;
        int i = 0;
        if (!TextUtils.isEmpty(str)) {
            SimpleDateFormat[] simpleDateFormatArr = f7065b;
            int length = simpleDateFormatArr.length;
            while (i < length) {
                SimpleDateFormat simpleDateFormat = simpleDateFormatArr[i];
                try {
                    simpleDateFormat.setLenient(false);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    j = simpleDateFormat.parse(str).getTime();
                    break;
                } catch (ParseException e) {
                    i++;
                }
            }
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException e2) {
            }
        }
        return j;
    }

    static String m6028d() {
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("Mozilla/5.0 (Linux; U; Android");
        if (VERSION.RELEASE != null) {
            stringBuffer.append(" ").append(VERSION.RELEASE);
        }
        stringBuffer.append("; ").append(Locale.getDefault());
        if (Build.DEVICE != null) {
            stringBuffer.append("; ").append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                stringBuffer.append(" Build/").append(Build.DISPLAY);
            }
        }
        stringBuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuffer.toString();
    }

    public static int[] m6029d(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        float f = 160.0f / ((float) displayMetrics.densityDpi);
        int i = (int) (((float) displayMetrics.widthPixels) * f);
        int i2 = (int) (f * ((float) displayMetrics.heightPixels));
        return new int[]{i, i2};
    }

    public static String m6030e() {
        UUID randomUUID = UUID.randomUUID();
        byte[] toByteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] toByteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, toByteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(toByteArray);
                instance.update(toByteArray2);
                Object obj = new byte[8];
                System.arraycopy(instance.digest(), 0, obj, 0, 8);
                bigInteger = new BigInteger(1, obj).toString();
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return bigInteger;
    }

    private static String m6034f(Context context) {
        return new WebView(context).getSettings().getUserAgentString();
    }
}
