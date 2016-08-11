package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;

@id
public class br {
    private final Context f6334a;

    public br(Context context) {
        ob.m6316a((Object) context, (Object) "Context can not be null");
        this.f6334a = context;
    }

    public static boolean m5213e() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public boolean m5214a() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return m5215a(intent);
    }

    public boolean m5215a(Intent intent) {
        ob.m6316a((Object) intent, (Object) "Intent can not be null");
        return !this.f6334a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public boolean m5216b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return m5215a(intent);
    }

    public boolean m5217c() {
        return m5213e() && this.f6334a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public boolean m5218d() {
        return false;
    }

    public boolean m5219f() {
        return VERSION.SDK_INT >= 14 && m5215a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
