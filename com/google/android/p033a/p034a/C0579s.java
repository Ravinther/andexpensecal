package com.google.android.p033a.p034a;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: com.google.android.a.a.s */
public class C0579s {
    public int f6028a;
    public int f6029b;
    public String f6030c;
    public String f6031d;
    public String f6032e;
    public long f6033f;
    public String f6034g;

    public static C0579s m4868a(String str) {
        String str2;
        int indexOf = str.indexOf(58);
        if (-1 == indexOf) {
            str2 = "";
        } else {
            String substring = str.substring(0, indexOf);
            str2 = indexOf >= str.length() ? "" : str.substring(indexOf + 1);
            str = substring;
        }
        String[] split = TextUtils.split(str, Pattern.quote("|"));
        if (split.length < 6) {
            throw new IllegalArgumentException("Wrong number of fields.");
        }
        C0579s c0579s = new C0579s();
        c0579s.f6034g = str2;
        c0579s.f6028a = Integer.parseInt(split[0]);
        c0579s.f6029b = Integer.parseInt(split[1]);
        c0579s.f6030c = split[2];
        c0579s.f6031d = split[3];
        c0579s.f6032e = split[4];
        c0579s.f6033f = Long.parseLong(split[5]);
        return c0579s;
    }

    public String toString() {
        return TextUtils.join("|", new Object[]{Integer.valueOf(this.f6028a), Integer.valueOf(this.f6029b), this.f6030c, this.f6031d, this.f6032e, Long.valueOf(this.f6033f)});
    }
}
