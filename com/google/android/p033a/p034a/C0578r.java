package com.google.android.p033a.p034a;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;

/* renamed from: com.google.android.a.a.r */
public class C0578r {
    private final SharedPreferences f6025a;
    private final C0562p f6026b;
    private Editor f6027c;

    public C0578r(SharedPreferences sharedPreferences, C0562p c0562p) {
        this.f6025a = sharedPreferences;
        this.f6026b = c0562p;
        this.f6027c = null;
    }

    public void m4865a() {
        if (this.f6027c != null) {
            this.f6027c.commit();
            this.f6027c = null;
        }
    }

    public void m4866a(String str, String str2) {
        if (this.f6027c == null) {
            this.f6027c = this.f6025a.edit();
        }
        this.f6027c.putString(str, this.f6026b.m4826a(str2, str));
    }

    public String m4867b(String str, String str2) {
        String string = this.f6025a.getString(str, null);
        if (string != null) {
            try {
                str2 = this.f6026b.m4827b(string, str);
            } catch (C0581u e) {
                Log.w("PreferenceObfuscator", "Validation error while reading preference: " + str);
            }
        }
        return str2;
    }
}
