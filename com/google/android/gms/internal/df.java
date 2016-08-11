package com.google.android.gms.internal;

import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.util.Map;

@id
public final class df implements cz {
    private static int m5312a(DisplayMetrics displayMetrics, Map<String, String> map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                i = lx.m6057a(displayMetrics, Integer.parseInt(str2));
            } catch (NumberFormatException e) {
                ly.m6074e("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        return i;
    }

    public void m5313a(ma maVar, Map<String, String> map) {
        String str = (String) map.get("action");
        if (str == null) {
            ly.m6074e("Action missing from video GMSG.");
            return;
        }
        fu d = maVar.m6095d();
        if (d == null) {
            ly.m6074e("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean equalsIgnoreCase = "new".equalsIgnoreCase(str);
        boolean equalsIgnoreCase2 = "position".equalsIgnoreCase(str);
        int a;
        if (equalsIgnoreCase || equalsIgnoreCase2) {
            DisplayMetrics displayMetrics = maVar.getContext().getResources().getDisplayMetrics();
            a = m5312a(displayMetrics, map, "x", 0);
            int a2 = m5312a(displayMetrics, map, "y", 0);
            int a3 = m5312a(displayMetrics, map, "w", -1);
            int a4 = m5312a(displayMetrics, map, "h", -1);
            if (equalsIgnoreCase && d.m5541b() == null) {
                d.m5542b(a, a2, a3, a4);
                return;
            } else {
                d.m5537a(a, a2, a3, a4);
                return;
            }
        }
        gb b = d.m5541b();
        if (b == null) {
            gb.m5575a(maVar, "no_video_view", null);
        } else if ("click".equalsIgnoreCase(str)) {
            displayMetrics = maVar.getContext().getResources().getDisplayMetrics();
            int a5 = m5312a(displayMetrics, map, "x", 0);
            a = m5312a(displayMetrics, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a5, (float) a, 0);
            b.m5580a(obtain);
            obtain.recycle();
        } else if ("controls".equalsIgnoreCase(str)) {
            str = (String) map.get("enabled");
            if (str == null) {
                ly.m6074e("Enabled parameter missing from controls video GMSG.");
            } else {
                b.m5582a(Boolean.parseBoolean(str));
            }
        } else if ("currentTime".equalsIgnoreCase(str)) {
            str = (String) map.get("time");
            if (str == null) {
                ly.m6074e("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                b.m5579a((int) (Float.parseFloat(str) * 1000.0f));
            } catch (NumberFormatException e) {
                ly.m6074e("Could not parse time parameter from currentTime video GMSG: " + str);
            }
        } else if ("hide".equalsIgnoreCase(str)) {
            b.setVisibility(4);
        } else if ("load".equalsIgnoreCase(str)) {
            b.m5583b();
        } else if ("pause".equalsIgnoreCase(str)) {
            b.m5584c();
        } else if ("play".equalsIgnoreCase(str)) {
            b.m5585d();
        } else if ("show".equalsIgnoreCase(str)) {
            b.setVisibility(0);
        } else if ("src".equalsIgnoreCase(str)) {
            b.m5581a((String) map.get("src"));
        } else {
            ly.m6074e("Unknown video action: " + str);
        }
    }
}
