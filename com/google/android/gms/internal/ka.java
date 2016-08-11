package com.google.android.gms.internal;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

class ka implements lu<Drawable> {
    final /* synthetic */ boolean f6901a;
    final /* synthetic */ jy f6902b;

    ka(jy jyVar, boolean z) {
        this.f6902b = jyVar;
        this.f6901a = z;
    }

    public Drawable m5861a() {
        this.f6902b.m5856a(2, this.f6901a);
        return null;
    }

    public Drawable m5862a(InputStream inputStream) {
        byte[] a;
        try {
            a = oh.m6341a(inputStream);
        } catch (IOException e) {
            a = null;
        }
        if (a == null) {
            this.f6902b.m5856a(2, this.f6901a);
            return null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a, 0, a.length);
        if (decodeByteArray != null) {
            return new BitmapDrawable(Resources.getSystem(), decodeByteArray);
        }
        this.f6902b.m5856a(2, this.f6901a);
        return null;
    }

    public /* synthetic */ Object m5863b() {
        return m5861a();
    }

    public /* synthetic */ Object m5864b(InputStream inputStream) {
        return m5862a(inputStream);
    }
}
