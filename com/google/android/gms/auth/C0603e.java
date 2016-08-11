package com.google.android.gms.auth;

import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C0616e;
import com.google.android.gms.common.C0618f;
import com.google.android.gms.common.C0619g;
import com.google.android.gms.common.C0620i;
import com.google.android.gms.internal.mt;
import com.google.android.gms.internal.ob;
import com.google.android.gms.internal.ov;
import java.io.IOException;

/* renamed from: com.google.android.gms.auth.e */
public final class C0603e {
    public static final String f6125a;
    public static final String f6126b;
    private static final ComponentName f6127c;
    private static final ComponentName f6128d;
    private static final Intent f6129e;
    private static final Intent f6130f;

    static {
        f6125a = VERSION.SDK_INT >= 11 ? "callerUid" : "callerUid";
        f6126b = VERSION.SDK_INT >= 14 ? "androidPackageName" : "androidPackageName";
        f6127c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
        f6128d = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
        f6129e = new Intent().setPackage("com.google.android.gms").setComponent(f6127c);
        f6130f = new Intent().setPackage("com.google.android.gms").setComponent(f6128d);
    }

    public static String m4924a(Context context, String str, String str2) {
        return C0603e.m4925a(context, str, str2, new Bundle());
    }

    public static String m4925a(Context context, String str, String str2, Bundle bundle) {
        Context applicationContext = context.getApplicationContext();
        ob.m6322b("Calling this from your main thread can lead to deadlock");
        C0603e.m4926a(applicationContext);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        String str3 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str3);
        if (!bundle2.containsKey(f6126b)) {
            bundle2.putString(f6126b, str3);
        }
        ServiceConnection c0620i = new C0620i();
        if (applicationContext.bindService(f6129e, c0620i, 1)) {
            try {
                bundle2 = ov.m6400a(c0620i.m4956a()).m6398a(str, str2, bundle2);
                if (bundle2 == null) {
                    Log.w("GoogleAuthUtil", "Binder call returned null.");
                    throw new C0602d("ServiceUnavailable");
                }
                Object string = bundle2.getString("authtoken");
                if (TextUtils.isEmpty(string)) {
                    String string2 = bundle2.getString("Error");
                    Intent intent = (Intent) bundle2.getParcelable("userRecoveryIntent");
                    if (C0603e.m4929b(string2)) {
                        throw new C0604g(string2, intent);
                    } else if (C0603e.m4928a(string2)) {
                        throw new IOException(string2);
                    } else {
                        throw new C0602d(string2);
                    }
                }
                applicationContext.unbindService(c0620i);
                return string;
            } catch (Throwable e) {
                Log.i("GoogleAuthUtil", "GMS remote exception ", e);
                throw new IOException("remote exception");
            } catch (InterruptedException e2) {
                throw new C0602d("Interrupted");
            } catch (Throwable th) {
                applicationContext.unbindService(c0620i);
            }
        } else {
            throw new IOException("Could not bind to service with the given context.");
        }
    }

    private static void m4926a(Context context) {
        try {
            C0619g.m4951b(context);
        } catch (C0618f e) {
            throw new C0605f(e.m4943a(), e.getMessage(), e.m4942b());
        } catch (C0616e e2) {
            throw new C0602d(e2.getMessage());
        }
    }

    @Deprecated
    public static void m4927a(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    private static boolean m4928a(String str) {
        return "NetworkError".equals(str) || "ServiceUnavailable".equals(str) || "Timeout".equals(str);
    }

    private static boolean m4929b(String str) {
        return "BadAuthentication".equals(str) || "CaptchaRequired".equals(str) || "DeviceManagementRequiredOrSyncDisabled".equals(str) || "NeedPermission".equals(str) || "NeedsBrowser".equals(str) || "UserCancel".equals(str) || "AppDownloadRequired".equals(str) || mt.DM_SYNC_DISABLED.m6158a().equals(str) || mt.DM_ADMIN_BLOCKED.m6158a().equals(str) || mt.DM_ADMIN_PENDING_APPROVAL.m6158a().equals(str) || mt.DM_STALE_SYNC_REQUIRED.m6158a().equals(str) || mt.DM_DEACTIVATED.m6158a().equals(str) || mt.DM_REQUIRED.m6158a().equals(str);
    }
}
