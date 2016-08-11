package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.C0606b;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.nd;
import com.google.android.gms.internal.nr;
import com.google.android.gms.internal.oe;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.g */
public final class C0619g {
    public static boolean f6142a;
    public static boolean f6143b;
    private static int f6144c;
    private static final Object f6145d;

    static {
        f6142a = false;
        f6143b = false;
        f6144c = -1;
        f6145d = new Object();
    }

    public static int m4944a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (!nd.f7219a) {
            try {
                context.getResources().getString(C0606b.common_google_play_services_unknown_issue);
            } catch (Throwable th) {
                Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
            }
        }
        if (!nd.f7219a) {
            C0619g.m4955e(context);
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
            if (oe.m6335c(packageInfo.versionCode)) {
                int i = C0619g.m4946a() ? 0 : 1;
                if (C0619g.m4950a(packageInfo, C0624j.f6156a[i], C0624j.f6162g[i], C0624j.f6161f[i]) == null) {
                    Log.w("GooglePlayServicesUtil", "Google Play Services signature invalid on Glass.");
                    return 9;
                }
                String packageName = context.getPackageName();
                try {
                    PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, 64);
                    if (!C0619g.m4948a(packageManager, packageInfo2)) {
                        Log.w("GooglePlayServicesUtil", "Calling package " + packageInfo2.packageName + " signature invalid on Glass.");
                        return 9;
                    }
                } catch (NameNotFoundException e) {
                    Log.w("GooglePlayServicesUtil", "Could not get info for calling package: " + packageName);
                    return 9;
                }
            } else if (!oe.m6333a(context)) {
                try {
                    if (C0619g.m4950a(packageManager.getPackageInfo("com.android.vending", 64), C0624j.f6156a) == null) {
                        Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                        return 9;
                    }
                    if (C0619g.m4950a(packageInfo, C0619g.m4950a(packageManager.getPackageInfo("com.android.vending", 64), C0624j.f6156a)) == null) {
                        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                        return 9;
                    }
                } catch (NameNotFoundException e2) {
                    Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                    return 9;
                }
            } else if (C0619g.m4950a(packageInfo, C0624j.f6156a) == null) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            if (oe.m6332a(packageInfo.versionCode) < oe.m6332a(6587000)) {
                Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires 6587000 but found " + packageInfo.versionCode);
                return 2;
            }
            try {
                return !packageManager.getApplicationInfo("com.google.android.gms", 0).enabled ? 3 : 0;
            } catch (NameNotFoundException e3) {
                Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.");
                e3.printStackTrace();
                return 1;
            }
        } catch (NameNotFoundException e4) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    public static Intent m4945a(int i) {
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
            case C0607c.LoadingImageView_circleCrop /*2*/:
                return nr.m6220b("com.google.android.gms");
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                return nr.m6219a("com.google.android.gms");
            case 42:
                return nr.m6218a();
            default:
                return null;
        }
    }

    public static boolean m4946a() {
        return f6142a ? f6143b : "user".equals(Build.TYPE);
    }

    public static boolean m4947a(PackageManager packageManager) {
        synchronized (f6145d) {
            if (f6144c == -1) {
                try {
                    if (C0619g.m4950a(packageManager.getPackageInfo("com.google.android.gms", 64), C0624j.f6152E[1]) != null) {
                        f6144c = 1;
                    } else {
                        f6144c = 0;
                    }
                } catch (NameNotFoundException e) {
                    f6144c = 0;
                }
            }
        }
        return f6144c != 0;
    }

    public static boolean m4948a(PackageManager packageManager, PackageInfo packageInfo) {
        boolean z = true;
        boolean z2 = false;
        if (packageInfo == null) {
            return false;
        }
        if (C0619g.m4952b(packageManager)) {
            if (C0619g.m4949a(packageInfo, true) == null) {
                z = false;
            }
            return z;
        }
        if (C0619g.m4949a(packageInfo, false) != null) {
            z2 = true;
        }
        if (z2 || C0619g.m4949a(packageInfo, true) == null) {
            return z2;
        }
        Log.w("GooglePlayServicesUtil", "Test-keys aren't accepted on this build.");
        return z2;
    }

    private static byte[] m4949a(PackageInfo packageInfo, boolean z) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GooglePlayServicesUtil", "Package has more than one signature.");
            return null;
        }
        Object toByteArray = packageInfo.signatures[0].toByteArray();
        if ((z ? C0624j.m4989a() : C0624j.m4993b()).contains(toByteArray)) {
            return toByteArray;
        }
        if (Log.isLoggable("GooglePlayServicesUtil", 2)) {
            Log.v("GooglePlayServicesUtil", "Signature not valid.  Found: \n" + Base64.encodeToString(toByteArray, 0));
        }
        return null;
    }

    private static byte[] m4950a(PackageInfo packageInfo, byte[]... bArr) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GooglePlayServicesUtil", "Package has more than one signature.");
            return null;
        }
        byte[] toByteArray = packageInfo.signatures[0].toByteArray();
        for (byte[] bArr2 : bArr) {
            if (Arrays.equals(bArr2, toByteArray)) {
                return bArr2;
            }
        }
        if (Log.isLoggable("GooglePlayServicesUtil", 2)) {
            Log.v("GooglePlayServicesUtil", "Signature not valid.  Found: \n" + Base64.encodeToString(toByteArray, 0));
        }
        return null;
    }

    public static void m4951b(Context context) {
        int a = C0619g.m4944a(context);
        if (a != 0) {
            Intent a2 = C0619g.m4945a(a);
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + a);
            if (a2 == null) {
                throw new C0616e(a);
            }
            throw new C0618f(a, "Google Play Services not available", a2);
        }
    }

    public static boolean m4952b(PackageManager packageManager) {
        return C0619g.m4947a(packageManager) || !C0619g.m4946a();
    }

    public static Resources m4953c(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    public static Context m4954d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    private static void m4955e(Context context) {
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable e) {
            Log.wtf("GooglePlayServicesUtil", "This should never happen.", e);
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            int i = bundle.getInt("com.google.android.gms.version");
            if (i != 6587000) {
                throw new IllegalStateException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 6587000 but found " + i + ".  You must have the" + " following declaration within the <application> element: " + "    <meta-data android:name=\"" + "com.google.android.gms.version" + "\" android:value=\"@integer/google_play_services_version\" />");
            }
            return;
        }
        throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
    }
}
