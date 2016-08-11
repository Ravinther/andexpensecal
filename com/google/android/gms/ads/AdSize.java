package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.lx;

public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final AdSize BANNER;
    public static final AdSize FULL_BANNER;
    public static final int FULL_WIDTH = -1;
    public static final AdSize LARGE_BANNER;
    public static final AdSize LEADERBOARD;
    public static final AdSize MEDIUM_RECTANGLE;
    public static final AdSize SMART_BANNER;
    public static final AdSize WIDE_SKYSCRAPER;
    private final int f6049a;
    private final int f6050b;
    private final String f6051c;

    static {
        BANNER = new AdSize(320, 50, "320x50_mb");
        FULL_BANNER = new AdSize(468, 60, "468x60_as");
        LARGE_BANNER = new AdSize(320, 100, "320x100_as");
        LEADERBOARD = new AdSize(728, 90, "728x90_as");
        MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
        WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
        SMART_BANNER = new AdSize(FULL_WIDTH, AUTO_HEIGHT, "smart_banner");
    }

    public AdSize(int i, int i2) {
        this(i, i2, (i == FULL_WIDTH ? "FULL" : String.valueOf(i)) + "x" + (i2 == AUTO_HEIGHT ? "AUTO" : String.valueOf(i2)) + "_as");
    }

    AdSize(int i, int i2, String str) {
        if (i < 0 && i != FULL_WIDTH) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i);
        } else if (i2 >= 0 || i2 == AUTO_HEIGHT) {
            this.f6049a = i;
            this.f6050b = i2;
            this.f6051c = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i2);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.f6049a == adSize.f6049a && this.f6050b == adSize.f6050b && this.f6051c.equals(adSize.f6051c);
    }

    public int getHeight() {
        return this.f6050b;
    }

    public int getHeightInPixels(Context context) {
        return this.f6050b == AUTO_HEIGHT ? ay.m5081b(context.getResources().getDisplayMetrics()) : lx.m6056a(context, this.f6050b);
    }

    public int getWidth() {
        return this.f6049a;
    }

    public int getWidthInPixels(Context context) {
        return this.f6049a == FULL_WIDTH ? ay.m5080a(context.getResources().getDisplayMetrics()) : lx.m6056a(context, this.f6049a);
    }

    public int hashCode() {
        return this.f6051c.hashCode();
    }

    public boolean isAutoHeight() {
        return this.f6050b == AUTO_HEIGHT;
    }

    public boolean isFullWidth() {
        return this.f6049a == FULL_WIDTH;
    }

    public String toString() {
        return this.f6051c;
    }
}
