package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import p018c.p019a.p020a.C0299j;
import p018c.p019a.p021b.C0306d;
import p018c.p019a.p021b.C0307e;
import p018c.p019a.p022c.C0311c;
import p018c.p019a.p022c.C0312d;
import p018c.p019a.p022c.C0314f;

public class pw {
    public static float m4172a(String str, String str2) {
        float f = 0.0f;
        if (str == null || "".equals(str)) {
            return f;
        }
        if (str2 == null || "".equals(str2)) {
            str2 = "0";
        }
        try {
            String replace = str.replaceAll(",", "").replaceAll(":", "").replace("(", "").replace(")", "");
            String replaceAll = str2.replaceAll(",", "").replaceAll(":", "");
            return new Float(replaceAll.trim()).floatValue() / new Float(replace.trim()).floatValue();
        } catch (Exception e) {
            e.printStackTrace();
            return f;
        }
    }

    public static C0306d m4173a(String[] strArr, List<double[]> list) {
        C0306d c0306d = new C0306d();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            C0307e c0307e = new C0307e(strArr[i], 0);
            double[] dArr = (double[]) list.get(i);
            int length2 = dArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                c0307e.m2036a((double) i2, dArr[i2]);
            }
            c0306d.m2028a(c0307e);
        }
        return c0306d;
    }

    public static C0306d m4174a(String[] strArr, double[] dArr) {
        C0306d c0306d = new C0306d();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            C0307e c0307e = new C0307e(strArr[i]);
            c0307e.m2036a((double) i, dArr[i]);
            c0306d.m2028a(c0307e);
        }
        return c0306d;
    }

    public static C0312d m4175a(int[] iArr) {
        C0312d c0312d = new C0312d();
        for (int a : iArr) {
            C0311c c0314f = new C0314f();
            c0314f.m2112a(a);
            c0312d.m2071a(c0314f);
        }
        return c0312d;
    }

    public static String m4176a(Context context, ro roVar, String str, String str2) {
        String str3 = "";
        int a = abd.m3783a(context, roVar, str2 + "_CURRENCY", -1);
        if (a != -1) {
            str3 = co.f4436j[a];
            str3 = str3.substring(str3.indexOf(":") + 1);
        }
        return (str3 == null || "".equals(str3)) ? str : str + " (" + str3 + ")";
    }

    public static void m4177a(Context context, C0312d c0312d, String str, String str2, String str3, double d, double d2, double d3, double d4, int i, int i2) {
        c0312d.m2155a(str2);
        c0312d.m2161b(str3);
        c0312d.m2150a(d);
        c0312d.m2159b(d2);
        c0312d.m2162c(d3);
        c0312d.m2164d(d4);
        c0312d.m2070a(14.0f);
        c0312d.m2082d(true);
        c0312d.m2072a(true);
        c0312d.m2091h(true);
        c0312d.m2177i(true);
        c0312d.m2169e(12.0f);
        c0312d.m2085e(false);
        c0312d.m2073a(new int[]{0, 65, 70, 0});
        c0312d.m2174g(315.0f);
        c0312d.m2172f(35.0f);
        float f = context.getResources().getDisplayMetrics().density;
        if (((double) f) > 1.5d) {
            c0312d.m2070a(20.0f);
            c0312d.m2169e(20.0f);
            c0312d.m2166d(18.0f);
        }
        if (((double) f) > 2.5d) {
            c0312d.m2070a(28.0f);
            c0312d.m2169e(28.0f);
            c0312d.m2166d(28.0f);
            c0312d.m2172f(45.0f);
        }
    }

    public static void m4178a(Context context, String[] strArr, TextView textView) {
        boolean[] zArr = new boolean[strArr.length];
        String charSequence = textView.getText().toString();
        if (!(charSequence == null || "".equals(charSequence))) {
            List arrayList = new ArrayList(Arrays.asList(strArr));
            String[] split = charSequence.split(",");
            for (Object indexOf : split) {
                int indexOf2 = arrayList.indexOf(indexOf);
                if (indexOf2 < zArr.length && indexOf2 != -1) {
                    zArr[indexOf2] = true;
                }
            }
        }
        new Builder(context).setTitle(2131100026).setMultiChoiceItems(strArr, zArr, new pz(zArr)).setPositiveButton(2131099983, new py(zArr, strArr, textView)).setNegativeButton(2131099754, new px()).show();
    }

    public static void m4179a(C0312d c0312d, int[] iArr, C0299j[] c0299jArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            C0311c c0314f = new C0314f();
            c0314f.m2112a(iArr[i]);
            c0314f.m2195a(c0299jArr[i]);
            c0314f.m2196b(2.0f);
            c0312d.m2071a(c0314f);
        }
    }

    public static void m4180a(ro roVar, ArrayList<String> arrayList) {
        String str = "";
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        Cursor b = roVar.m4200b("expensed", null, "expensed ASC");
        if (b != null) {
            try {
                if (b.moveToFirst()) {
                    int columnIndex = b.getColumnIndex("expensed");
                    do {
                        String a = aba.m3749a(b.getLong(columnIndex), "yyyy");
                        if (!arrayList.contains(a)) {
                            arrayList.add(a);
                        }
                    } while (b.moveToNext());
                }
            } catch (Exception e) {
            }
        }
        if (b != null) {
            b.close();
        }
        roVar.m4201b();
    }

    public static int[] m4181a(String[] strArr) {
        int i = 0;
        if (strArr == null || strArr.length == 0) {
            return new int[]{Color.argb(150, 0, 255, 0)};
        }
        int[] iArr = new int[strArr.length];
        while (i < strArr.length) {
            if (strArr[i].trim().startsWith("-")) {
                iArr[i] = co.f4428b;
            } else {
                iArr[i] = -16744448;
            }
            i++;
        }
        return iArr;
    }

    public static int[] m4182b(String[] strArr) {
        int i = 0;
        if (strArr == null || strArr.length == 0) {
            return new int[]{Color.argb(150, 0, 255, 0)};
        }
        int[] iArr = new int[strArr.length];
        Random random = new Random();
        while (i < strArr.length) {
            if (i >= co.f4427a.length) {
                iArr[i] = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            } else {
                iArr[i] = co.f4427a[i];
            }
            i++;
        }
        return iArr;
    }
}
