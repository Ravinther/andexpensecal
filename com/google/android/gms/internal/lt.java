package com.google.android.gms.internal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;

class lt implements Callable<T> {
    final /* synthetic */ String f7086a;
    final /* synthetic */ lu f7087b;
    final /* synthetic */ lr f7088c;

    lt(lr lrVar, String str, lu luVar) {
        this.f7088c = lrVar;
        this.f7086a = str;
        this.f7087b = luVar;
    }

    public T call() {
        Throwable th;
        Throwable th2;
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(this.f7086a).openConnection();
            try {
                httpURLConnection2.connect();
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode < 200 || responseCode > 299) {
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    return this.f7087b.m5859b();
                }
                T b = this.f7087b.m5860b(httpURLConnection2.getInputStream());
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return b;
            } catch (Throwable e) {
                th = e;
                httpURLConnection = httpURLConnection2;
                th2 = th;
                try {
                    ly.m6073d("Error making HTTP request.", th2);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return this.f7087b.m5859b();
                } catch (Throwable th3) {
                    th2 = th3;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th2;
                }
            } catch (Throwable e2) {
                th = e2;
                httpURLConnection = httpURLConnection2;
                th2 = th;
                ly.m6073d("Error making HTTP request.", th2);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return this.f7087b.m5859b();
            } catch (Throwable e22) {
                th = e22;
                httpURLConnection = httpURLConnection2;
                th2 = th;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th2;
            }
        } catch (MalformedURLException e3) {
            th2 = e3;
            ly.m6073d("Error making HTTP request.", th2);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return this.f7087b.m5859b();
        } catch (IOException e4) {
            th2 = e4;
            ly.m6073d("Error making HTTP request.", th2);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return this.f7087b.m5859b();
        }
    }
}
