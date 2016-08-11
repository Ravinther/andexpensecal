package com.expensemanager;

import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.Window;
import android.widget.ListView;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class abd {
    public static int m3783a(Context context, ro roVar, String str, int i) {
        try {
            i = m3784a(m3786a(context, roVar, str, "" + i), i);
        } catch (Exception e) {
        }
        return i;
    }

    public static int m3784a(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            int intValue = new Integer(str).intValue();
            return intValue < 0 ? i : intValue;
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    public static long m3785a(String str, String str2, Locale locale) {
        long time = new Date().getTime();
        try {
            Date parse = new SimpleDateFormat(str2, locale).parse(str);
            Calendar instance = Calendar.getInstance();
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            if (parse.before(instance.getTime())) {
                return new SimpleDateFormat(str2 + " HH:mm:ss", locale).parse(str + " 23:59:00").getTime();
            }
            return new SimpleDateFormat(str2 + " HH:mm:ss", locale).parse(str + " " + new SimpleDateFormat("HH:mm:ss", locale).format(new Date())).getTime();
        } catch (Exception e) {
            e.printStackTrace();
            return time;
        }
    }

    public static String m3786a(Context context, ro roVar, String str, String str2) {
        Cursor g;
        Exception e;
        String str3 = null;
        String str4 = "name='" + str + "'";
        try {
            if (!roVar.m4206d()) {
                roVar.m4193a();
            }
            g = roVar.m4209g(str4, null);
            if (g != null) {
                try {
                    if (g.moveToFirst()) {
                        str3 = g.getString(g.getColumnIndex("value"));
                    }
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (g != null) {
                        g.close();
                    }
                    roVar.m4201b();
                    return str3 == null ? str3 : str2;
                }
            }
        } catch (Exception e3) {
            e = e3;
            g = null;
            e.printStackTrace();
            if (g != null) {
                g.close();
            }
            roVar.m4201b();
            if (str3 == null) {
            }
        }
        if (g != null) {
            g.close();
        }
        roVar.m4201b();
        if (str3 == null) {
        }
    }

    public static String m3787a(Context context, ro roVar, String[] strArr, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        String str = "";
        try {
            String str2;
            if (!roVar.m4206d()) {
                roVar.m4193a();
            }
            int a = m3783a(context, roVar, "BASE_CURRENCY_INDEX", -1);
            if (a == -1) {
                int a2 = m3783a(context, roVar, "Default_Account_Index", -1);
                str2 = strArr[0];
                if (strArr != null && a2 < strArr.length && a2 >= 0) {
                    str2 = strArr[a2];
                }
                a = m3783a(context, roVar, str2 + "_CURRENCY", -1);
            }
            str2 = aib.m3851a(a);
            if (str2 == null || "".equals(str2)) {
                return null;
            }
            for (int i = 0; i < strArr.length; i++) {
                String a3 = aib.m3851a(m3783a(context, roVar, strArr[i] + "_CURRENCY", -1));
                if (!(str2.equalsIgnoreCase(a3) || "".equals(a3))) {
                    String a4 = m3786a(context, roVar, str2 + a3, "");
                    hashMap.put(strArr[i], str2 + a3);
                    if (!"".equals(a4)) {
                        hashMap2.put(strArr[i], a4);
                    }
                    str = "".equals(str) ? str2 + a3 : str + "," + str2 + a3;
                }
            }
            return str;
        } catch (Exception e) {
            return str;
        }
    }

    public static String m3788a(Context context, List<Map<String, String>> list, List<String> list2) {
        String str = "";
        int i = 0;
        while (i < list.size()) {
            Map map = (Map) list.get(i);
            String str2 = (String) map.get("category");
            String str3 = (String) map.get("subcategory");
            String str4 = (String) map.get("account");
            String str5 = (String) map.get("alert");
            String str6 = (String) map.get("property2");
            String str7 = (String) map.get("property3");
            String str8 = (String) map.get("property");
            if (str5 != null) {
                if ("".equals(str5)) {
                    str8 = str;
                } else {
                    if (str8 != null) {
                        try {
                            if (!"".equals(str8)) {
                                String[] split = str8.split(";");
                                if (!"".equals(split[1])) {
                                    Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(split[1]);
                                    Date date = new Date();
                                    Calendar instance = Calendar.getInstance();
                                    instance.add(6, -1);
                                    if (instance.getTime().after(parse)) {
                                        str8 = str;
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    str8 = (String) list2.get(i);
                    if ("All".equalsIgnoreCase(str2) || "All-1".equalsIgnoreCase(str2)) {
                        str2 = context.getResources().getString(2131099720);
                    }
                    if ("All".equalsIgnoreCase(str3) || "All-1".equalsIgnoreCase(str3)) {
                        str3 = context.getResources().getString(2131099721);
                    }
                    str2 = str4 + "|" + str2 + "|" + str3;
                    if (!(str6 == null || "".equals(str6))) {
                        str2 = str2 + "|" + str6;
                    }
                    if (!(str7 == null || "".equals(str7))) {
                        str2 = str2 + "|" + str7;
                    }
                    str8 = aba.m3746a(aba.m3743a(str5, "-" + str8.replaceAll(",", "")));
                    if ((str8 != null && str8.startsWith("(")) || "0.00".equals(str8)) {
                        str8 = str2 + ": " + str8;
                    }
                }
                i++;
                str = str8;
            }
            str8 = str;
            i++;
            str = str8;
        }
        return str;
    }

    public static String m3789a(ro roVar, String str, HashMap<String, String> hashMap) {
        double d = 0.0d;
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        Cursor a = roVar.m4192a(str, null);
        if (a != null && a.moveToFirst()) {
            int columnIndex = a.getColumnIndex("account");
            int columnIndex2 = a.getColumnIndex("amount");
            double d2 = 0.0d;
            while (true) {
                String string = a.getString(columnIndex);
                String string2 = a.getString(columnIndex2);
                d = aba.m3742a(d2, hashMap != null ? m3793a(string2, (String) hashMap.get(string)) : string2);
                if (!a.moveToNext()) {
                    break;
                }
                d2 = d;
            }
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
        return aba.m3746a(d);
    }

    public static String m3790a(ro roVar, String str, HashMap<String, String> hashMap, String str2) {
        double d = 0.0d;
        Calendar instance = Calendar.getInstance();
        instance.set(2, ExpenseManager.f3241q);
        instance.set(5, ExpenseManager.f3242r);
        if (Calendar.getInstance().get(2) < ExpenseManager.f3241q) {
            instance.add(1, -1);
        }
        instance.add(5, -1);
        instance.set(11, 23);
        instance.set(12, 59);
        String str3 = "expensed>" + instance.getTimeInMillis() + " AND " + "expensed" + "<=" + aib.m3847a() + " AND " + "category" + "='Income'" + " AND " + "account" + "='" + str + "'";
        if ("All".equalsIgnoreCase(str)) {
            str3 = (str3.replace(" AND account='" + str + "'", "") + " AND " + "account" + " in (" + m3792a(ExpenseManager.f3245u) + ")") + " AND " + "subcategory" + "!='Account Transfer' ";
        }
        if ("YES".equalsIgnoreCase(str2)) {
            str3 = str3 + " AND " + "subcategory" + "!='Account Transfer'";
        }
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        Cursor a = roVar.m4192a(str3, "expensed ASC");
        if (a != null && a.moveToFirst()) {
            double a2;
            int columnIndex = a.getColumnIndex("account");
            int columnIndex2 = a.getColumnIndex("amount");
            while (true) {
                str3 = a.getString(columnIndex);
                String string = a.getString(columnIndex2);
                a2 = aba.m3742a(d, hashMap != null ? m3793a(string, (String) hashMap.get(str3)) : string);
                if (!a.moveToNext()) {
                    break;
                }
                d = a2;
            }
            d = a2;
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
        return aba.m3746a(d);
    }

    public static String m3791a(ro roVar, String str, List<Map<String, Object>> list, boolean z) {
        double d;
        String string;
        roVar.m4193a();
        Cursor a = roVar.m4192a(str, "subcategory ASC");
        Map hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        String str2 = "";
        String str3;
        if (a == null || !a.moveToFirst()) {
            String str4 = str2;
            d = 0.0d;
            str3 = str4;
        } else {
            String string2;
            double a2;
            int columnIndex = a.getColumnIndex("account");
            int columnIndex2 = a.getColumnIndex("amount");
            int columnIndex3 = a.getColumnIndex("subcategory");
            double d2 = 0.0d;
            while (true) {
                Object obj;
                string2 = a.getString(columnIndex);
                str3 = a.getString(columnIndex2);
                if (ExpenseManager.f3246v != null && z) {
                    str3 = m3793a(str3, (String) ExpenseManager.f3246v.get(string2));
                }
                string = a.getString(columnIndex3);
                if (string == null || "".equals(string)) {
                    obj = "Uncategorized";
                } else {
                    str2 = string;
                }
                if (hashMap.get(obj) == null) {
                    hashMap.put(obj, aba.m3781g(str3));
                    arrayList.add(obj);
                } else {
                    hashMap.put(obj, "" + aba.m3743a((String) hashMap.get(obj), str3));
                }
                a2 = aba.m3742a(d2, str3);
                if (!a.moveToNext()) {
                    break;
                }
                d2 = a2;
            }
            d = a2;
            Object obj2 = string2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            Map hashMap2 = new HashMap();
            String a3 = aba.m3756a((String) arrayList.get(i));
            string = aba.m3756a((String) hashMap.get(a3));
            if ("".equals(string)) {
                string = "0";
            }
            string = aba.m3767b(string);
            hashMap2.put("category", a3);
            hashMap2.put("amount", ": " + string);
            hashMap2.put("account", obj2);
            list.add(hashMap2);
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
        return aba.m3746a(d);
    }

    public static String m3792a(String str) {
        if (str.indexOf("'") != -1) {
            str = str.replace("'", "''");
        }
        String[] split = str.split(",");
        String str2 = "";
        for (int i = 0; i < split.length; i++) {
            str2 = "".equals(str2) ? "'" + split[i] + "'" : str2 + ", '" + split[i] + "'";
        }
        return str2;
    }

    public static String m3793a(String str, String str2) {
        if (!(str2 == null || "".equals(str2))) {
            try {
                str = "" + (Double.valueOf(str.trim()).doubleValue() / Double.valueOf(str2.trim()).doubleValue());
            } catch (Exception e) {
            }
        }
        return str;
    }

    public static String m3794a(String str, String str2, String str3, String str4) {
        String str5 = "account='" + str2 + "'";
        if ("All".equalsIgnoreCase(str2)) {
            str5 = "account in (" + m3792a(str3) + ")";
        }
        if ("YES".equalsIgnoreCase(str4) || "All".equalsIgnoreCase(str2)) {
            str5 = str5 + " AND  (" + "category" + "!='Account Transfer' " + " OR " + "subcategory" + "!='Account Transfer' )";
        }
        return !"".equals(str) ? str5 + " AND " + str : str5;
    }

    public static HashMap<String, String> m3795a(Context context, String str, String[] strArr, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        if (!(str == null || "".equals(str))) {
            try {
                HashMap hashMap3 = new HashMap();
                if (aib.m3862a(context)) {
                    String a = aib.m3856a(str, "CURRENCY", false);
                    HashMap g = a != null ? aib.m3875g(a) : hashMap3;
                    Editor edit = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).edit();
                    for (String str2 : strArr) {
                        String str3 = (String) g.get((String) hashMap.get(str2));
                        edit.putString(str2 + "_currencyRate", str3);
                        if (!(hashMap2.containsKey(str2) || str3 == null)) {
                            hashMap2.put(str2, str3);
                        }
                    }
                    edit.commit();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static HashMap<String, String> m3796a(ro roVar) {
        HashMap<String, String> hashMap = new HashMap();
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        Cursor g = roVar.m4209g(null, null);
        if (g != null) {
            try {
                if (g.moveToFirst()) {
                    int columnIndex = g.getColumnIndex("name");
                    int columnIndex2 = g.getColumnIndex("value");
                    do {
                        hashMap.put(g.getString(columnIndex), g.getString(columnIndex2));
                    } while (g.moveToNext());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (g != null) {
            g.close();
        }
        roVar.m4201b();
        return hashMap;
    }

    public static List<String> m3797a(ro roVar, String str) {
        List<String> arrayList = new ArrayList();
        String str2 = "account in (" + m3792a(str) + ")" + " and " + "category" + "!='Income'";
        Calendar instance = Calendar.getInstance();
        instance.add(5, -90);
        str2 = str2 + " AND " + "expensed" + ">" + instance.getTimeInMillis() + " AND " + "expensed" + "<=" + Calendar.getInstance().getTimeInMillis();
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        Cursor a = roVar.m4192a(str2, "expensed ASC");
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    int columnIndex = a.getColumnIndex("category");
                    int columnIndex2 = a.getColumnIndex("subcategory");
                    do {
                        String string = a.getString(columnIndex);
                        String string2 = a.getString(columnIndex2);
                        String str3 = "";
                        if (!(string2 == null || "".equals(string2))) {
                            string = string + ":" + string2;
                            if (!arrayList.contains(string)) {
                                arrayList.add(string);
                            }
                            if (arrayList.size() > 10) {
                                break;
                            }
                        }
                    } while (a.moveToNext());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (a != null) {
            a.close();
        }
        if (roVar.m4206d()) {
            roVar.m4201b();
        }
        return arrayList;
    }

    public static List<String> m3798a(ro roVar, String str, String str2) {
        List<String> arrayList = new ArrayList();
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        Cursor b = roVar.m4200b(str2, str, str2 + " ASC");
        if (b != null) {
            try {
                if (b.getCount() != 0) {
                    if (b.moveToFirst()) {
                        int columnIndex = b.getColumnIndex(str2);
                        do {
                            String string = b.getString(columnIndex);
                            if (!(string == null || arrayList.contains(string))) {
                                arrayList.add(string);
                            }
                        } while (b.moveToNext());
                    }
                    if (b != null) {
                        b.close();
                    }
                    if (b != null) {
                        b.close();
                    }
                    if (roVar.m4206d()) {
                        roVar.m4201b();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    public static List<Map<String, String>> m3799a(List<Map<String, String>> list, Map<String, ArrayList<Map<String, String>>> map, boolean z) {
        List<Map<String, String>> arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        List arrayList3 = new ArrayList();
        try {
            Map map2;
            String str;
            int i;
            HashMap hashMap = new HashMap();
            ArrayList arrayList4 = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                map2 = (Map) list.get(i2);
                List list2 = (List) map.get((String) map2.get("property2"));
                int size = list2 != null ? list2.size() : 0;
                if (size < aba.m3780f((String) map2.get("paidCycleInt"))) {
                    arrayList3.add(map2);
                } else if (size >= aba.m3780f((String) map2.get("numberOfPayment"))) {
                    arrayList2.add(map2);
                } else {
                    str = "" + aba.m3744a(aba.m3768b((String) map2.get("firstExpenseDate"), (String) map2.get("frequencyValue"), "" + size), ExpenseManager.f3244t, Locale.US);
                    arrayList4.add(str + i2);
                    hashMap.put(str + i2, map2);
                }
            }
            Collections.sort(arrayList4);
            for (i = 0; i < arrayList4.size(); i++) {
                arrayList.add(hashMap.get((String) arrayList4.get(i)));
            }
            if (z && arrayList2.size() > 0) {
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    arrayList.add(arrayList2.get(i3));
                }
            }
            if (arrayList3.size() > 0) {
                HashMap hashMap2 = new HashMap();
                Object arrayList5 = new ArrayList();
                for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                    map2 = (Map) arrayList3.get(i4);
                    str = (String) map2.get("nextPaymentDateLong");
                    arrayList5.add(str + i4);
                    hashMap2.put(str + i4, map2);
                }
                Collections.sort(arrayList5, Collections.reverseOrder());
                for (i = 0; i < arrayList3.size(); i++) {
                    arrayList.add(0, hashMap2.get((String) arrayList5.get(i)));
                }
            }
            return arrayList;
        } catch (Exception e) {
            return list;
        }
    }

    public static List<Map<String, String>> m3800a(List<Map<String, String>> list, boolean z) {
        List<Map<String, String>> arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList3 = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Map map = (Map) list.get(i);
                String str = (String) map.get("nextPaymentDateLong");
                arrayList3.add(str + i);
                hashMap.put(str + i, map);
            }
            Collections.sort(arrayList3);
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                String str2 = (String) arrayList3.get(i2);
                if (new Date(Long.valueOf(str2.substring(0, str2.length() - 1)).longValue()).before(new Date())) {
                    arrayList2.add(hashMap.get(str2));
                } else {
                    arrayList.add(hashMap.get(str2));
                }
            }
            if (z && arrayList2.size() > 0) {
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    arrayList.add(arrayList2.get(i3));
                }
            }
            return arrayList;
        } catch (Exception e) {
            return list;
        }
    }

    public static List<Map<String, Object>> m3801a(List<Map<String, Object>> list, boolean z, String str) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ack[] com_expensemanager_ackArr = new ack[list.size()];
        int i = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        while (i < list.size()) {
            String str2 = (String) ((Map) list.get(i)).get("account");
            String b = aib.m3865b((String) ((Map) list.get(i)).get("expense"));
            String a = aib.m3852a(((Map) list.get(i)).get("income"));
            b = b.replaceAll(",", "").replace("(", "").replace(")", "");
            a = a.replaceAll(",", "");
            double d3 = 0.0d;
            double d4 = 0.0d;
            if (!(b == null || "".equals(b))) {
                d3 = aib.m3877i(b);
            }
            if (!(a == null || "".equals(a))) {
                d4 = aib.m3877i(a);
            }
            com_expensemanager_ackArr[i] = new ack(str2, (String) ((Map) list.get(i)).get(str), d3, d4, z);
            i++;
            d += d4;
            d2 = d3 + d2;
        }
        Arrays.sort(com_expensemanager_ackArr, new acl());
        for (int size = list.size(); size > 0; size--) {
            ack com_expensemanager_ack = com_expensemanager_ackArr[size - 1];
            Map hashMap = new HashMap();
            Object a2 = aib.m3850a(com_expensemanager_ack.m3825c());
            Object a3 = aib.m3850a(com_expensemanager_ack.m3826d());
            if (d2 != 0.0d) {
                a2 = a2 + " | " + (aib.m3850a((100.0d * com_expensemanager_ack.m3825c()) / d2) + "%");
            }
            if (d != 0.0d) {
                a3 = a3 + " | " + (aib.m3850a((100.0d * com_expensemanager_ack.m3826d()) / d) + "%");
            }
            if (!z) {
                hashMap.put("expense", a2);
                hashMap.put("expenseAmount", aib.m3850a(com_expensemanager_ack.m3825c()));
            }
            if (z) {
                hashMap.put("income", a3);
                hashMap.put("incomeAmount", aib.m3850a(com_expensemanager_ack.m3826d()));
            }
            hashMap.put(str, com_expensemanager_ack.m3824b());
            hashMap.put("account", com_expensemanager_ack.m3823a());
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public static void m3802a(Activity activity, boolean z) {
        int i = 2131230723;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        int i2 = sharedPreferences.getInt("THEME_COLOR", 0);
        switch (i2) {
            case C0607c.AdsAttrs_adSize /*0*/:
                i = 2131230725;
                break;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                break;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                activity.getWindow().setBackgroundDrawableResource(2130837516);
                i = 2131230725;
                break;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                activity.getWindow().setBackgroundDrawableResource(2130837517);
                i = 2131230725;
                break;
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                activity.getWindow().setBackgroundDrawableResource(2130837513);
                break;
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                activity.getWindow().setBackgroundDrawableResource(2130837514);
                break;
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                Drawable bitmapDrawable = new BitmapDrawable(activity.getResources(), co.f4430d + "/background.jpg");
                bitmapDrawable.setAlpha(150);
                activity.getWindow().setBackgroundDrawable(bitmapDrawable);
                break;
            default:
                i = 2131230725;
                break;
        }
        if (VERSION.SDK_INT >= 21) {
            i = i == 2131230725 ? 2131230726 : 2131230724;
        }
        if (i2 == 1 || i2 > 3) {
            co.f4428b = -65536;
            co.f4429c = -11481008;
        } else {
            co.f4428b = -3407872;
            co.f4429c = -16217592;
        }
        activity.setTheme(i);
        Window window = activity.getWindow();
        if (z) {
            if (activity.getActionBar() != null) {
                activity.getActionBar().setDisplayHomeAsUpEnabled(true);
            }
            i = sharedPreferences.getInt("ACTIONBAR_ID", 1);
            if (i != 6) {
                switch (i) {
                    case C0607c.AdsAttrs_adSize /*0*/:
                        i = 2130837511;
                        if (VERSION.SDK_INT >= 21) {
                            window.setStatusBarColor(-16777216);
                            break;
                        }
                        break;
                    case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                        i = 2130837512;
                        if (VERSION.SDK_INT >= 21) {
                            window.setStatusBarColor(-15502654);
                            break;
                        }
                        break;
                    case C0607c.LoadingImageView_circleCrop /*2*/:
                        i = 2130837515;
                        if (VERSION.SDK_INT >= 21) {
                            window.setStatusBarColor(-11300033);
                            break;
                        }
                        break;
                    case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                        i = 2130837518;
                        if (VERSION.SDK_INT >= 21) {
                            window.setStatusBarColor(-11900261);
                            break;
                        }
                        break;
                    case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                        i = 2130837519;
                        if (VERSION.SDK_INT >= 21) {
                            window.setStatusBarColor(-5039075);
                            break;
                        }
                        break;
                    case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                        i = 2130837523;
                        if (VERSION.SDK_INT >= 21) {
                            window.setStatusBarColor(-1607422);
                            break;
                        }
                        break;
                    case adv.TitlePageIndicator_footerLineHeight /*6*/:
                        return;
                    default:
                        i = -1;
                        break;
                }
                if (!(i == -1 || activity.getActionBar() == null)) {
                    activity.getActionBar().setBackgroundDrawable(activity.getResources().getDrawable(i));
                }
            } else {
                return;
            }
        }
        i = sharedPreferences.getInt("LANGUAGE_ID", 7);
        if (i != -1) {
            Configuration configuration = new Configuration(activity.getResources().getConfiguration());
            configuration.locale = Locale.ENGLISH;
            switch (i) {
                case C0607c.AdsAttrs_adSize /*0*/:
                    configuration.locale = Locale.ENGLISH;
                    break;
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    configuration.locale = Locale.GERMAN;
                    break;
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    configuration.locale = Locale.FRENCH;
                    break;
                case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                    configuration.locale = new Locale("es", "ES");
                    break;
                case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                    configuration.locale = new Locale("pt", "BR");
                    break;
                case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                    configuration.locale = Locale.SIMPLIFIED_CHINESE;
                    break;
                case adv.TitlePageIndicator_footerLineHeight /*6*/:
                    configuration.locale = Locale.TAIWAN;
                    break;
                case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                    return;
                case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                    configuration.locale = Locale.ITALIAN;
                    break;
            }
            activity.getResources().updateConfiguration(configuration, activity.getResources().getDisplayMetrics());
        }
    }

    public static void m3803a(Context context, ro roVar) {
        Map all = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getAll();
        for (String str : all.keySet()) {
            try {
                if (all.get(str) != null) {
                    m3811a(context, roVar, "expense_preference", str, "" + all.get(str));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void m3804a(Context context, String str, String str2) {
        int i;
        int i2 = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        Editor edit = sharedPreferences.edit();
        Map all = sharedPreferences.getAll();
        for (String str3 : all.keySet()) {
            try {
                if (all.get(str3) != null && str3.startsWith("widget")) {
                    edit.putString(str3, ("" + all.get(str3)).replace(str, str2));
                    edit.commit();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        int[] appWidgetIds = instance.getAppWidgetIds(new ComponentName(context, WidgetProvider.class));
        for (int i3 : appWidgetIds) {
            try {
                WidgetProvider.m3727a(context, instance, i3, WidgetConfigure.m3642a(context, i3));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        int[] appWidgetIds2 = instance.getAppWidgetIds(new ComponentName(context, WidgetProviderSmall.class));
        while (i2 < appWidgetIds2.length) {
            i = appWidgetIds2[i2];
            try {
                WidgetProviderSmall.m3737a(context, instance, i, WidgetConfigureSmall.m3681a(context, i));
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            i2++;
        }
    }

    public static void m3805a(Context context, boolean z) {
        Editor edit = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).edit();
        edit.putBoolean("SYNC_FLAG", z);
        edit.commit();
    }

    public static void m3806a(ListView listView, int i) {
        listView.post(new abe(listView, i));
    }

    public static void m3807a(ro roVar, String str, String str2, HashMap<String, String> hashMap, int i, Map<String, String> map) {
        String str3;
        String str4;
        String str5 = "";
        Object obj = "All".equalsIgnoreCase(str) ? 1 : null;
        if (i == 0) {
            DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t, Locale.US);
            Date date = new Date();
            try {
                date = simpleDateFormat.parse(simpleDateFormat.format(date));
            } catch (Exception e) {
            }
            long time = date.getTime();
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(time);
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            time = instance.getTimeInMillis();
            instance.set(11, 23);
            instance.set(12, 59);
            instance.set(13, 59);
            instance.set(14, 999);
            long timeInMillis = instance.getTimeInMillis();
            if ("All".equalsIgnoreCase(str)) {
                str = ExpenseManager.f3245u;
            }
            str5 = "expensed>=" + time + " AND " + "expensed" + "<=" + timeInMillis + " AND " + "account" + " in (" + m3792a(str) + ")";
            str3 = str;
        } else {
            str3 = str;
        }
        if (i == 1) {
            str5 = aba.m3747a(0, "", 0).replace(" AND account=''", "");
            if ("All".equalsIgnoreCase(str3)) {
                str3 = ExpenseManager.f3245u;
            }
            str5 = str5 + " AND " + "account" + " in (" + m3792a(str3) + ")";
        }
        if (i == 2) {
            str5 = aba.m3764b(0, "", 0).replace(" AND account=''", "");
            if ("All".equalsIgnoreCase(str3)) {
                str3 = ExpenseManager.f3245u;
            }
            str5 = str5 + " AND " + "account" + " in (" + m3792a(str3) + ")";
        }
        if (i == 3) {
            Calendar instance2 = Calendar.getInstance();
            instance2.set(6, 1);
            instance2.set(2, ExpenseManager.f3241q);
            instance2.set(5, ExpenseManager.f3242r);
            if (Calendar.getInstance().get(2) < ExpenseManager.f3241q) {
                instance2.add(1, -1);
            }
            instance2.add(5, -1);
            instance2.set(11, 23);
            instance2.set(12, 59);
            instance2.set(13, 59);
            instance2.set(14, 999);
            timeInMillis = instance2.getTimeInMillis();
            if ("All".equalsIgnoreCase(str3)) {
                str3 = ExpenseManager.f3245u;
            }
            str4 = "expensed>" + timeInMillis + " AND " + "expensed" + "<=" + aib.m3847a() + " AND " + "account" + " in (" + m3792a(str3) + ")";
        } else {
            str4 = str5;
        }
        if (obj != null) {
            str2 = "YES";
        }
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        Cursor a = roVar.m4192a(str4, null);
        if (a != null && a.moveToFirst()) {
            int columnIndex = a.getColumnIndex("account");
            int columnIndex2 = a.getColumnIndex("amount");
            int columnIndex3 = a.getColumnIndex("category");
            int columnIndex4 = a.getColumnIndex("subcategory");
            double d4 = 0.0d;
            d = 0.0d;
            d2 = 0.0d;
            while (true) {
                String str6;
                str3 = a.getString(columnIndex);
                str5 = a.getString(columnIndex2);
                String string = a.getString(columnIndex3);
                String string2 = a.getString(columnIndex4);
                str3 = hashMap != null ? m3793a(str5, (String) hashMap.get(str3)) : str5;
                String str7;
                if ("Income".equalsIgnoreCase(string)) {
                    if ("Account Transfer".equalsIgnoreCase(string2) && "YES".equalsIgnoreCase(r20)) {
                        str7 = str3;
                        d3 = d2;
                        d2 = d;
                        str6 = str7;
                    } else {
                        d = aba.m3742a(d, str3);
                        str7 = str3;
                        d3 = d2;
                        d2 = d;
                        str6 = str7;
                    }
                } else if ("Account Transfer".equalsIgnoreCase(string) && "YES".equalsIgnoreCase(r20)) {
                    str7 = "-" + str3;
                    d3 = d2;
                    d2 = d;
                    str6 = str7;
                } else {
                    d2 = aba.m3742a(d2, str3);
                    str7 = "-" + str3;
                    d3 = d2;
                    d2 = d;
                    str6 = str7;
                }
                d = aba.m3742a(d4, str6);
                if (!a.moveToNext()) {
                    break;
                }
                d4 = d;
                d = d2;
                d2 = d3;
            }
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
        if (i == 0) {
            map.put("daily_balance", aba.m3746a(d));
            map.put("daily_income", aba.m3746a(d2));
            map.put("daily_expense", aba.m3746a(d3));
        }
        if (i == 1) {
            map.put("weekly_balance", aba.m3746a(d));
            map.put("weekly_income", aba.m3746a(d2));
            map.put("weekly_expense", aba.m3746a(d3));
        }
        if (i == 2) {
            map.put("monthly_balance", aba.m3746a(d));
            map.put("monthly_income", aba.m3746a(d2));
            map.put("monthly_expense", aba.m3746a(d3));
        }
        if (i == 3) {
            map.put("yearly_balance", aba.m3746a(d));
            map.put("yearly_income", aba.m3746a(d2));
            map.put("yearly_expense", aba.m3746a(d3));
        }
    }

    public static void m3808a(ro roVar, String str, List<Map<String, Object>> list, String str2, String str3, boolean z) {
        int columnIndex;
        Object string;
        String string2;
        roVar.m4193a();
        Cursor a = roVar.m4192a(str, str3);
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        List arrayList = new ArrayList();
        String str4 = "";
        if (a == null || !a.moveToFirst()) {
            String str5 = str4;
        } else {
            columnIndex = a.getColumnIndex("account");
            int columnIndex2 = a.getColumnIndex("amount");
            int columnIndex3 = a.getColumnIndex("category");
            int columnIndex4 = a.getColumnIndex(str2);
            do {
                string = a.getString(columnIndex);
                string2 = a.getString(columnIndex2);
                if (ExpenseManager.f3246v != null && z) {
                    string2 = m3793a(string2, (String) ExpenseManager.f3246v.get(string));
                }
                str4 = a.getString(columnIndex3);
                String string3 = a.getString(columnIndex4);
                if (!arrayList.contains(string3)) {
                    arrayList.add(string3);
                }
                if ("Income".equalsIgnoreCase(str4)) {
                    if (hashMap2.get(string3) == null) {
                        hashMap2.put(string3, aib.m3865b(string2));
                    } else {
                        hashMap2.put(string3, "" + aba.m3743a((String) hashMap2.get(string3), string2));
                    }
                } else if (hashMap.get(string3) == null) {
                    hashMap.put(string3, aib.m3865b(string2));
                } else {
                    hashMap.put(string3, "" + aba.m3743a((String) hashMap.get(string3), string2));
                }
            } while (a.moveToNext());
        }
        for (columnIndex = 0; columnIndex < arrayList.size(); columnIndex++) {
            Map hashMap3 = new HashMap();
            str4 = (String) arrayList.get(columnIndex);
            String a2 = aba.m3756a((String) hashMap.get(str4));
            String a3 = aba.m3756a((String) hashMap2.get(str4));
            string2 = "".equals(a2) ? "0" : a2;
            a2 = "".equals(a3) ? "0" : a3;
            hashMap3.put("name", str4);
            hashMap3.put("account", string);
            hashMap3.put("expense", aba.m3767b(string2));
            hashMap3.put("income", aba.m3767b(a2));
            hashMap3.put("subTotal", aba.m3746a(aba.m3742a(new Double(a2).doubleValue(), "-" + string2)));
            list.add(hashMap3);
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
    }

    public static void m3809a(ro roVar, String str, List<Map<String, Object>> list, String str2, boolean z) {
        String string;
        roVar.m4193a();
        Cursor a = roVar.m4192a(str, str2);
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        List arrayList = new ArrayList();
        String str3 = "";
        String str4;
        if (a == null || !a.moveToFirst()) {
            str4 = str3;
        } else {
            String string2;
            int columnIndex = a.getColumnIndex("account");
            int columnIndex2 = a.getColumnIndex("amount");
            int columnIndex3 = a.getColumnIndex("expensed");
            int columnIndex4 = a.getColumnIndex("category");
            do {
                string2 = a.getString(columnIndex);
                string = a.getString(columnIndex2);
                if (ExpenseManager.f3246v != null && z) {
                    string = m3793a(string, (String) ExpenseManager.f3246v.get(string2));
                }
                long j = a.getLong(columnIndex3);
                String string3 = a.getString(columnIndex4);
                Calendar instance = Calendar.getInstance();
                if (j != 0) {
                    instance.setTimeInMillis(j);
                }
                int i = instance.get(2);
                int i2 = instance.get(1);
                if (instance.get(5) < ExpenseManager.f3242r) {
                    i--;
                    if (i < 0) {
                        i += 12;
                        i2--;
                    }
                }
                str4 = i2 + "-" + (i + 1);
                if (!arrayList.contains(str4)) {
                    arrayList.add(str4);
                }
                if ("Income".equalsIgnoreCase(string3)) {
                    if (hashMap2.get(str4) == null) {
                        hashMap2.put(str4, aib.m3865b(string));
                    } else {
                        hashMap2.put(str4, "" + aba.m3743a((String) hashMap2.get(str4), string));
                    }
                } else if (hashMap.get(str4) == null) {
                    hashMap.put(str4, aib.m3865b(string));
                } else {
                    hashMap.put(str4, "" + aba.m3743a((String) hashMap.get(str4), string));
                }
            } while (a.moveToNext());
            Object obj = string2;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Map hashMap3 = new HashMap();
            str3 = (String) arrayList.get(i3);
            String a2 = aba.m3756a((String) hashMap.get(str3));
            String a3 = aba.m3756a((String) hashMap2.get(str3));
            string = "".equals(a2) ? "0" : a2;
            a2 = "".equals(a3) ? "0" : a3;
            hashMap3.put("date", str3);
            hashMap3.put("account", obj);
            hashMap3.put("expense", aba.m3767b(string));
            hashMap3.put("income", aba.m3767b(a2));
            hashMap3.put("subTotal", aba.m3746a(aba.m3742a(aib.m3877i(a2), "-" + string)));
            list.add(hashMap3);
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
    }

    public static boolean m3810a(Context context, ro roVar, String str) {
        boolean z = false;
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        try {
            roVar.m4197a("expense_preference", "name", str);
            z = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        roVar.m4201b();
        return z;
    }

    public static boolean m3811a(Context context, ro roVar, String str, String str2, String str3) {
        boolean z;
        Exception e;
        boolean z2 = false;
        if (!(str2 == null || "".equals(str2))) {
            int i;
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str2);
            contentValues.put("value", str3);
            contentValues.put("modified", Long.valueOf(new Date().getTime()));
            if (!roVar.m4206d()) {
                roVar.m4193a();
            }
            Cursor g = roVar.m4209g("name='" + str2 + "'", null);
            if (g != null) {
                try {
                    if (g.moveToFirst()) {
                        i = g.getInt(g.getColumnIndex("_id"));
                        if (i != -1) {
                            if (roVar.m4185a(str, contentValues) > -1) {
                                z2 = true;
                            }
                            z = z2;
                        } else {
                            z = roVar.m4196a(str, (long) i, contentValues);
                        }
                        if (z) {
                            try {
                                m3805a(context, z);
                            } catch (Exception e2) {
                                e = e2;
                                e.printStackTrace();
                                z2 = z;
                                if (g != null) {
                                    g.close();
                                }
                                roVar.m4201b();
                                return z2;
                            }
                        }
                        z2 = z;
                        if (g != null) {
                            g.close();
                        }
                        roVar.m4201b();
                    }
                } catch (Exception e3) {
                    Exception exception = e3;
                    z = false;
                    e = exception;
                    e.printStackTrace();
                    z2 = z;
                    if (g != null) {
                        g.close();
                    }
                    roVar.m4201b();
                    return z2;
                }
            }
            i = -1;
            if (i != -1) {
                z = roVar.m4196a(str, (long) i, contentValues);
            } else {
                if (roVar.m4185a(str, contentValues) > -1) {
                    z2 = true;
                }
                z = z2;
            }
            if (z) {
                m3805a(context, z);
            }
            z2 = z;
            if (g != null) {
                g.close();
            }
            roVar.m4201b();
        }
        return z2;
    }

    public static boolean m3812a(Context context, ro roVar, ArrayList<Map<String, String>> arrayList, ArrayList<Map<String, String>> arrayList2, ArrayList<Map<String, String>> arrayList3, ArrayList<Map<String, String>> arrayList4) {
        boolean z = true;
        Cursor cursor = null;
        try {
            if (!roVar.m4206d()) {
                roVar.m4193a();
            }
            cursor = roVar.m4207e(null, "account ASC");
            if (cursor == null || cursor.getCount() == 0) {
                return false;
            }
            if (cursor != null && cursor.moveToFirst()) {
                int columnIndex = cursor.getColumnIndex("_id");
                int columnIndex2 = cursor.getColumnIndex("account");
                int columnIndex3 = cursor.getColumnIndex("amount");
                int columnIndex4 = cursor.getColumnIndex("category");
                int columnIndex5 = cursor.getColumnIndex("subcategory");
                int columnIndex6 = cursor.getColumnIndex("alert");
                int columnIndex7 = cursor.getColumnIndex("description");
                int columnIndex8 = cursor.getColumnIndex("frequency");
                int columnIndex9 = cursor.getColumnIndex("property");
                int columnIndex10 = cursor.getColumnIndex("property2");
                int columnIndex11 = cursor.getColumnIndex("property3");
                do {
                    String str = "" + cursor.getLong(columnIndex);
                    String string = cursor.getString(columnIndex2);
                    String string2 = cursor.getString(columnIndex3);
                    String string3 = cursor.getString(columnIndex4);
                    String string4 = cursor.getString(columnIndex5);
                    String string5 = cursor.getString(columnIndex7);
                    String string6 = cursor.getString(columnIndex8);
                    String string7 = cursor.getString(columnIndex9);
                    String string8 = cursor.getString(columnIndex10);
                    String string9 = cursor.getString(columnIndex11);
                    String string10 = cursor.getString(columnIndex6);
                    if (string10 != null) {
                        if (!"".equals(string10)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("rowId", str);
                            hashMap.put("account", string);
                            hashMap.put("category", string3);
                            hashMap.put("subcategory", string4);
                            hashMap.put("period", string6);
                            hashMap.put("amount", string2);
                            hashMap.put("alert", string10);
                            hashMap.put("description", string5);
                            hashMap.put("property", string7);
                            hashMap.put("property2", string8);
                            hashMap.put("property3", string9);
                            if ("0".equals(string6)) {
                                arrayList.add(hashMap);
                            }
                            if ("1".equals(string6)) {
                                arrayList2.add(hashMap);
                            }
                            if ("2".equals(string6)) {
                                arrayList3.add(hashMap);
                            }
                            if ("3".equals(string6)) {
                                arrayList4.add(hashMap);
                            }
                        }
                    }
                } while (cursor.moveToNext());
            }
            if (cursor != null) {
                cursor.close();
            }
            roVar.m4201b();
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
    }

    public static String m3813b(ro roVar, String str, HashMap<String, String> hashMap) {
        double d = 0.0d;
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        Cursor a = roVar.m4192a(str, "expensed ASC");
        if (a != null && a.moveToFirst()) {
            int columnIndex = a.getColumnIndex("account");
            int columnIndex2 = a.getColumnIndex("amount");
            int columnIndex3 = a.getColumnIndex("category");
            double d2 = 0.0d;
            while (true) {
                String string = a.getString(columnIndex);
                String string2 = a.getString(columnIndex2);
                if (!"Income".equalsIgnoreCase(a.getString(columnIndex3))) {
                    string2 = "-" + string2;
                }
                d = aba.m3742a(d2, hashMap != null ? m3793a(string2, (String) hashMap.get(string)) : string2);
                if (!a.moveToNext()) {
                    break;
                }
                d2 = d;
            }
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
        return aba.m3746a(d);
    }

    public static String m3814b(String str) {
        String str2 = "";
        try {
            str2 = "" + (((float) Math.round((1.0d / Double.valueOf(str).doubleValue()) * 1000000.0d)) / 1000000.0f);
        } catch (Exception e) {
        }
        return str2;
    }

    public static String m3815b(String str, String str2) {
        if (str2.indexOf("'") != -1) {
            str2 = str2.replace("'", "''");
        }
        String[] split = str2.split(",");
        String str3 = "";
        for (int i = 0; i < split.length; i++) {
            str3 = "".equals(str3) ? str + " like '%" + split[i] + "%'" : str3 + " OR " + str + " like '%" + split[i] + "%'";
        }
        return str3;
    }

    public static HashMap<String, String> m3816b(Context context, ro roVar) {
        if (!aib.m3862a(context)) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap();
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        String[] split = m3786a(context, roVar, "MY_ACCOUNT_NAMES", "Personal Expense").split(",");
        int a = m3783a(context, roVar, "Default_Account_Index", -1);
        String str = split[0];
        if (split != null && a < split.length && a >= 0) {
            str = split[a];
        }
        String str2 = "";
        a = m3783a(context, roVar, "BASE_CURRENCY_INDEX", -1);
        str = a != -1 ? aib.m3851a(a) : aib.m3851a(m3783a(context, roVar, str + "_CURRENCY", -1));
        if ("".equals(str)) {
            return null;
        }
        String str3 = "";
        for (String str4 : split) {
            String a2 = aib.m3851a(m3783a(context, roVar, str4 + "_CURRENCY", -1));
            if (!str.equalsIgnoreCase(a2)) {
                str3 = "".equals(str3) ? str + a2 : str3 + "," + str + a2;
            }
        }
        str = aib.m3856a(str3, "CURRENCY", false);
        return str != null ? aib.m3875g(str) : hashMap;
    }

    public static void m3817b(ro roVar, String str, List<Map<String, Object>> list, String str2, boolean z) {
        int columnIndex;
        Object string;
        String string2;
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        Cursor a = roVar.m4192a(str, str2);
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        String str3 = "";
        if (a == null || !a.moveToFirst()) {
            String str4 = str3;
        } else {
            columnIndex = a.getColumnIndex("account");
            int columnIndex2 = a.getColumnIndex("amount");
            int columnIndex3 = a.getColumnIndex("expensed");
            int columnIndex4 = a.getColumnIndex("category");
            do {
                string = a.getString(columnIndex);
                string2 = a.getString(columnIndex2);
                if (ExpenseManager.f3246v != null && z) {
                    string2 = m3793a(string2, (String) ExpenseManager.f3246v.get(string));
                }
                long j = a.getLong(columnIndex3);
                str3 = a.getString(columnIndex4);
                Calendar instance = Calendar.getInstance();
                if (j != 0) {
                    instance.setTimeInMillis(j);
                }
                int i = instance.get(3);
                int i2 = instance.get(1);
                String a2 = ExpenseAccountActivities.m2604a(instance, 0);
                String str5 = "Week " + i + " " + i2;
                if (!arrayList.contains(str5)) {
                    arrayList.add(str5);
                    arrayList2.add(a2);
                }
                if ("Income".equalsIgnoreCase(str3)) {
                    if (hashMap2.get(str5) == null) {
                        hashMap2.put(str5, aib.m3865b(string2));
                    } else {
                        hashMap2.put(str5, "" + aba.m3743a((String) hashMap2.get(str5), string2));
                    }
                } else if (hashMap.get(str5) == null) {
                    hashMap.put(str5, aib.m3865b(string2));
                } else {
                    hashMap.put(str5, "" + aba.m3743a((String) hashMap.get(str5), string2));
                }
            } while (a.moveToNext());
        }
        for (columnIndex = 0; columnIndex < arrayList.size(); columnIndex++) {
            Map hashMap3 = new HashMap();
            str3 = (String) arrayList.get(columnIndex);
            String a3 = aba.m3756a((String) hashMap.get(str3));
            String a4 = aba.m3756a((String) hashMap2.get(str3));
            string2 = "".equals(a3) ? "0" : a3;
            a3 = "".equals(a4) ? "0" : a4;
            hashMap3.put("date", str3);
            hashMap3.put("account", string);
            hashMap3.put("expense", aba.m3767b(string2));
            hashMap3.put("income", aba.m3767b(a3));
            hashMap3.put("subTotal", aba.m3746a(aba.m3742a(new Double(a3).doubleValue(), "-" + string2)));
            hashMap3.put("dateRange", arrayList2.get(columnIndex));
            list.add(hashMap3);
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
    }

    public static long m3818c(String str) {
        try {
            Date parse = new SimpleDateFormat(ExpenseManager.f3244t, Locale.US).parse(str);
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(parse.getTime());
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            return instance.getTimeInMillis();
        } catch (Exception e) {
            return new Date().getTime();
        }
    }

    public static void m3819c(ro roVar, String str, List<Map<String, Object>> list, String str2, boolean z) {
        String string;
        roVar.m4193a();
        Cursor a = roVar.m4192a(str, str2);
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        List arrayList = new ArrayList();
        String str3 = "";
        String str4;
        if (a == null || !a.moveToFirst()) {
            str4 = str3;
        } else {
            String string2;
            int columnIndex = a.getColumnIndex("account");
            int columnIndex2 = a.getColumnIndex("amount");
            int columnIndex3 = a.getColumnIndex("expensed");
            int columnIndex4 = a.getColumnIndex("category");
            do {
                string2 = a.getString(columnIndex);
                string = a.getString(columnIndex2);
                if (ExpenseManager.f3246v != null && z) {
                    string = m3793a(string, (String) ExpenseManager.f3246v.get(string2));
                }
                long j = a.getLong(columnIndex3);
                String string3 = a.getString(columnIndex4);
                Calendar instance = Calendar.getInstance();
                if (j != 0) {
                    instance.setTimeInMillis(j);
                }
                int i = instance.get(2);
                int i2 = instance.get(1);
                if (instance.get(5) < ExpenseManager.f3242r) {
                    i--;
                    if (i < 0) {
                        i += 12;
                        i2--;
                    }
                }
                if (i < ExpenseManager.f3241q) {
                    i2--;
                }
                str4 = "" + i2;
                if (!arrayList.contains(str4)) {
                    arrayList.add(str4);
                }
                if ("Income".equalsIgnoreCase(string3)) {
                    if (hashMap2.get(str4) == null) {
                        hashMap2.put(str4, aib.m3865b(string));
                    } else {
                        hashMap2.put(str4, "" + aba.m3743a((String) hashMap2.get(str4), string));
                    }
                } else if (hashMap.get(str4) == null) {
                    hashMap.put(str4, aib.m3865b(string));
                } else {
                    hashMap.put(str4, "" + aba.m3743a((String) hashMap.get(str4), string));
                }
            } while (a.moveToNext());
            Object obj = string2;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Map hashMap3 = new HashMap();
            str3 = (String) arrayList.get(i3);
            String a2 = aba.m3756a((String) hashMap.get(str3));
            String a3 = aba.m3756a((String) hashMap2.get(str3));
            string = "".equals(a2) ? "0" : a2;
            a2 = "".equals(a3) ? "0" : a3;
            hashMap3.put("date", str3);
            hashMap3.put("account", obj);
            hashMap3.put("expense", aba.m3767b(string));
            hashMap3.put("income", aba.m3767b(a2));
            hashMap3.put("subTotal", aba.m3746a(aba.m3742a(new Double(a2).doubleValue(), "-" + string)));
            list.add(hashMap3);
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
    }

    public static long m3820d(String str) {
        try {
            Date parse = new SimpleDateFormat(ExpenseManager.f3244t, Locale.US).parse(str);
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(parse.getTime());
            instance.set(11, 23);
            instance.set(12, 59);
            instance.set(12, 59);
            instance.set(13, 59);
            instance.set(14, 999);
            return instance.getTimeInMillis();
        } catch (Exception e) {
            return new Date().getTime();
        }
    }
}
