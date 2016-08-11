package com.google.android.gms.internal;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@id
public final class lw extends lb {
    private final String f7089a;
    private final Context f7090b;
    private final String f7091c;
    private String f7092d;

    public lw(Context context, String str, String str2) {
        this.f7092d = null;
        this.f7090b = context;
        this.f7089a = str;
        this.f7091c = str2;
    }

    public lw(Context context, String str, String str2, String str3) {
        this.f7092d = null;
        this.f7090b = context;
        this.f7089a = str;
        this.f7091c = str2;
        this.f7092d = str3;
    }

    public void m6054a() {
        HttpURLConnection httpURLConnection;
        try {
            ly.m6072d("Pinging URL: " + this.f7091c);
            httpURLConnection = (HttpURLConnection) new URL(this.f7091c).openConnection();
            if (this.f7092d == null) {
                li.m6009a(this.f7090b, this.f7089a, true, httpURLConnection);
            } else {
                li.m6010a(this.f7090b, this.f7089a, true, httpURLConnection, this.f7092d);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                ly.m6074e("Received non-success response code " + responseCode + " from pinging URL: " + this.f7091c);
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            ly.m6074e("Error while parsing ping URL: " + this.f7091c + ". " + e.getMessage());
        } catch (IOException e2) {
            ly.m6074e("Error while pinging URL: " + this.f7091c + ". " + e2.getMessage());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }

    public void m6055b() {
    }
}
