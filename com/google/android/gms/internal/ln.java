package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.Map;

@id
public final class ln {
    private final Context f7075a;
    private String f7076b;
    private final float f7077c;
    private float f7078d;
    private float f7079e;
    private float f7080f;
    private int f7081g;

    public ln(Context context) {
        this.f7081g = 0;
        this.f7075a = context;
        this.f7077c = context.getResources().getDisplayMetrics().density;
    }

    public ln(Context context, String str) {
        this(context);
        this.f7076b = str;
    }

    private void m6037a() {
        Object obj;
        if (TextUtils.isEmpty(this.f7076b)) {
            obj = "No debug information";
        } else {
            Uri build = new Builder().encodedQuery(this.f7076b).build();
            StringBuilder stringBuilder = new StringBuilder();
            Map a = li.m6000a(build);
            for (String str : a.keySet()) {
                stringBuilder.append(str).append(" = ").append((String) a.get(str)).append("\n\n");
            }
            obj = stringBuilder.toString().trim();
            if (TextUtils.isEmpty(obj)) {
                obj = "No debug information";
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f7075a);
        builder.setMessage(obj);
        builder.setTitle("Ad Information");
        builder.setPositiveButton("Share", new lo(this, obj));
        builder.setNegativeButton("Close", new lp(this));
        builder.create().show();
    }

    private void m6038a(int i, float f, float f2) {
        if (i == 0) {
            this.f7081g = 0;
            this.f7078d = f;
            this.f7079e = f2;
            this.f7080f = f2;
        } else if (this.f7081g == -1) {
        } else {
            if (i == 2) {
                if (f2 > this.f7079e) {
                    this.f7079e = f2;
                } else if (f2 < this.f7080f) {
                    this.f7080f = f2;
                }
                if (this.f7079e - this.f7080f > 30.0f * this.f7077c) {
                    this.f7081g = -1;
                    return;
                }
                if (this.f7081g == 0 || this.f7081g == 2) {
                    if (f - this.f7078d >= 50.0f * this.f7077c) {
                        this.f7078d = f;
                        this.f7081g++;
                    }
                } else if ((this.f7081g == 1 || this.f7081g == 3) && f - this.f7078d <= -50.0f * this.f7077c) {
                    this.f7078d = f;
                    this.f7081g++;
                }
                if (this.f7081g == 1 || this.f7081g == 3) {
                    if (f > this.f7078d) {
                        this.f7078d = f;
                    }
                } else if (this.f7081g == 2 && f < this.f7078d) {
                    this.f7078d = f;
                }
            } else if (i == 1 && this.f7081g == 4) {
                m6037a();
            }
        }
    }

    public void m6039a(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        for (int i = 0; i < historySize; i++) {
            m6038a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i));
        }
        m6038a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }

    public void m6040a(String str) {
        this.f7076b = str;
    }
}
