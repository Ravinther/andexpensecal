package com.roomorama.caldroid;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import p000a.p001a.C0000a;

/* renamed from: com.roomorama.caldroid.i */
public class C0790i {
    public static SimpleDateFormat f7768a;
    public static SimpleDateFormat f7769b;

    static {
        f7768a = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        f7769b = new SimpleDateFormat("MMM", Locale.getDefault());
    }

    public static C0000a m7158a(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.clear();
        instance.setTime(date);
        return new C0000a(Integer.valueOf(instance.get(1)), Integer.valueOf(instance.get(2) + 1), Integer.valueOf(instance.get(5)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0));
    }

    public static ArrayList<C0000a> m7159a(int i, int i2, int i3, boolean z) {
        int i4 = 1;
        ArrayList<C0000a> arrayList = new ArrayList();
        C0000a c0000a = new C0000a(Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0));
        C0000a a = c0000a.m19a(Integer.valueOf(c0000a.m38j() - 1));
        int intValue = c0000a.m37i().intValue();
        if (intValue < i3) {
            intValue += 7;
        }
        while (intValue > 0) {
            C0000a b = c0000a.m25b(Integer.valueOf(intValue - i3));
            if (!b.m23a(c0000a)) {
                break;
            }
            arrayList.add(b);
            intValue--;
        }
        for (intValue = 0; intValue < a.m31c().intValue(); intValue++) {
            arrayList.add(c0000a.m19a(Integer.valueOf(intValue)));
        }
        int i5 = i3 - 1;
        if (i5 == 0) {
            i5 = 7;
        }
        if (a.m37i().intValue() != i5) {
            intValue = 1;
            do {
                b = a.m19a(Integer.valueOf(intValue));
                arrayList.add(b);
                intValue++;
            } while (b.m37i().intValue() != i5);
        }
        if (z) {
            i5 = arrayList.size();
            intValue = (6 - (i5 / 7)) * 7;
            c0000a = (C0000a) arrayList.get(i5 - 1);
            while (i4 <= intValue) {
                arrayList.add(c0000a.m19a(Integer.valueOf(i4)));
                i4++;
            }
        }
        return arrayList;
    }

    public static ArrayList<String> m7160a(ArrayList<C0000a> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0000a) it.next()).m22a("YYYY-MM-DD"));
        }
        return arrayList2;
    }

    public static Date m7161a(C0000a c0000a) {
        int intValue = c0000a.m21a().intValue();
        int intValue2 = c0000a.m27b().intValue();
        int intValue3 = c0000a.m31c().intValue();
        Calendar instance = Calendar.getInstance();
        instance.clear();
        instance.set(intValue, intValue2 - 1, intValue3);
        return instance.getTime();
    }

    public static Date m7162a(String str, String str2) {
        return (str2 == null ? f7768a : new SimpleDateFormat(str2, Locale.ENGLISH)).parse(str);
    }

    public static C0000a m7163b(String str, String str2) {
        try {
            return C0790i.m7158a(C0790i.m7162a(str, str2));
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
