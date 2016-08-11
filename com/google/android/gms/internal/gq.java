package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;

@id
public class gq {
    private Object f6655a;
    private final Context f6656b;

    public gq(Context context) {
        this.f6656b = context;
    }

    public int m5616a(String str, String str2) {
        try {
            Class loadClass = this.f6656b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            return ((Integer) loadClass.getDeclaredMethod("consumePurchase", new Class[]{Integer.TYPE, String.class, String.class}).invoke(loadClass.cast(this.f6655a), new Object[]{Integer.valueOf(3), str, str2})).intValue();
        } catch (Throwable e) {
            ly.m6073d("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", e);
            return 5;
        }
    }

    public Bundle m5617a(String str, String str2, String str3) {
        try {
            Class loadClass = this.f6656b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            return (Bundle) loadClass.getDeclaredMethod("getBuyIntent", new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class}).invoke(loadClass.cast(this.f6655a), new Object[]{Integer.valueOf(3), str, str2, "inapp", str3});
        } catch (Throwable e) {
            ly.m6073d("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", e);
            return null;
        }
    }

    public void m5618a() {
        this.f6655a = null;
    }

    public void m5619a(IBinder iBinder) {
        try {
            this.f6655a = this.f6656b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService$Stub").getDeclaredMethod("asInterface", new Class[]{IBinder.class}).invoke(null, new Object[]{iBinder});
        } catch (Exception e) {
            ly.m6074e("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.");
        }
    }

    public Bundle m5620b(String str, String str2) {
        try {
            Class loadClass = this.f6656b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            return (Bundle) loadClass.getDeclaredMethod("getPurchases", new Class[]{Integer.TYPE, String.class, String.class, String.class}).invoke(loadClass.cast(this.f6655a), new Object[]{Integer.valueOf(3), str, "inapp", str2});
        } catch (Throwable e) {
            ly.m6073d("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", e);
            return null;
        }
    }
}
