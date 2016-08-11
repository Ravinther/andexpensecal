package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

@id
public final class gu extends hf {
    private String f6675a;
    private Context f6676b;
    private String f6677c;
    private ArrayList<String> f6678d;

    public gu(String str, ArrayList<String> arrayList, Context context, String str2) {
        this.f6677c = str;
        this.f6678d = arrayList;
        this.f6675a = str2;
        this.f6676b = context;
    }

    private void m5639b() {
        try {
            this.f6676b.getClassLoader().loadClass("com.google.ads.conversiontracking.IAPConversionReporter").getDeclaredMethod("reportWithProductId", new Class[]{Context.class, String.class, String.class, Boolean.TYPE}).invoke(null, new Object[]{this.f6676b, this.f6677c, "", Boolean.valueOf(true)});
        } catch (ClassNotFoundException e) {
            ly.m6074e("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        } catch (NoSuchMethodException e2) {
            ly.m6074e("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        } catch (Throwable e3) {
            ly.m6073d("Fail to report a conversion.", e3);
        }
    }

    protected int m5640a(int i) {
        return i == 0 ? 1 : i == 1 ? 2 : i == 4 ? 3 : 0;
    }

    public String m5641a() {
        return this.f6677c;
    }

    protected String m5642a(String str, HashMap<String, String> hashMap) {
        Object obj;
        Object obj2 = "";
        try {
            obj = this.f6676b.getPackageManager().getPackageInfo(this.f6676b.getPackageName(), 0).versionName;
        } catch (Throwable e) {
            ly.m6073d("Error to retrieve app version", e);
            obj = obj2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - kw.m5954f().m5980a();
        for (String str2 : hashMap.keySet()) {
            str = str.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{str2}), String.format("$1%s$2", new Object[]{hashMap.get(str2)}));
        }
        return str.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"sessionid"}), String.format("$1%s$2", new Object[]{kw.f7020a})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"appid"}), String.format("$1%s$2", new Object[]{r2})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"osversion"}), String.format("$1%s$2", new Object[]{String.valueOf(VERSION.SDK_INT)})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"sdkversion"}), String.format("$1%s$2", new Object[]{this.f6675a})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"appversion"}), String.format("$1%s$2", new Object[]{obj})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"timestamp"}), String.format("$1%s$2", new Object[]{String.valueOf(elapsedRealtime)})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"[^@]+"}), String.format("$1%s$2", new Object[]{""})).replaceAll("@@", "@");
    }

    public void m5643b(int i) {
        if (i == 1) {
            m5639b();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("status", String.valueOf(i));
        hashMap.put("sku", this.f6677c);
        Iterator it = this.f6678d.iterator();
        while (it.hasNext()) {
            new lw(this.f6676b, this.f6675a, m5642a((String) it.next(), hashMap)).m5624e();
        }
    }

    public void m5644c(int i) {
        if (i == 0) {
            m5639b();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("google_play_status", String.valueOf(i));
        hashMap.put("sku", this.f6677c);
        hashMap.put("status", String.valueOf(m5640a(i)));
        Iterator it = this.f6678d.iterator();
        while (it.hasNext()) {
            new lw(this.f6676b, this.f6675a, m5642a((String) it.next(), hashMap)).m5624e();
        }
    }
}
