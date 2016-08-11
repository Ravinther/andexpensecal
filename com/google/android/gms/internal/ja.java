package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.view.View.MeasureSpec;
import android.webkit.WebView;

public final class ja extends AsyncTask<Void, Void, Boolean> {
    final /* synthetic */ iz f6829a;
    private final WebView f6830b;
    private Bitmap f6831c;

    public ja(iz izVar, WebView webView) {
        this.f6829a = izVar;
        this.f6830b = webView;
    }

    protected synchronized Boolean m5796a(Void... voidArr) {
        Boolean valueOf;
        int width = this.f6831c.getWidth();
        int height = this.f6831c.getHeight();
        if (width == 0 || height == 0) {
            valueOf = Boolean.valueOf(false);
        } else {
            int i = 0;
            for (int i2 = 0; i2 < width; i2 += 10) {
                for (int i3 = 0; i3 < height; i3 += 10) {
                    if (this.f6831c.getPixel(i2, i3) != 0) {
                        i++;
                    }
                }
            }
            valueOf = Boolean.valueOf(((double) i) / (((double) (width * height)) / 100.0d) > 0.1d);
        }
        return valueOf;
    }

    protected void m5797a(Boolean bool) {
        iz.m5785c(this.f6829a);
        if (bool.booleanValue() || this.f6829a.m5794c() || this.f6829a.f6823f <= 0) {
            this.f6829a.f6820c = bool.booleanValue();
            this.f6829a.f6824g.m5558a(this.f6829a.f6818a);
        } else if (this.f6829a.f6823f > 0) {
            if (ly.m6067a(2)) {
                ly.m6065a("Ad not detected, scheduling another run.");
            }
            this.f6829a.f6821d.postDelayed(this.f6829a, this.f6829a.f6822e);
        }
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m5796a((Void[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m5797a((Boolean) obj);
    }

    protected synchronized void onPreExecute() {
        this.f6831c = Bitmap.createBitmap(this.f6829a.f6826i, this.f6829a.f6825h, Config.ARGB_8888);
        this.f6830b.setVisibility(0);
        this.f6830b.measure(MeasureSpec.makeMeasureSpec(this.f6829a.f6826i, 0), MeasureSpec.makeMeasureSpec(this.f6829a.f6825h, 0));
        this.f6830b.layout(0, 0, this.f6829a.f6826i, this.f6829a.f6825h);
        this.f6830b.draw(new Canvas(this.f6831c));
        this.f6830b.invalidate();
    }
}
