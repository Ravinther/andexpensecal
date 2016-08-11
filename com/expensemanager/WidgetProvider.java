package com.expensemanager;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class WidgetProvider extends AppWidgetProvider {
    static String f3755a;
    public static HashMap<String, String> f3756b;
    private static String f3757c;

    static {
        f3757c = "";
        f3755a = "NO";
        f3756b = null;
    }

    public static HashMap<String, String> m3726a(ro roVar, String str, HashMap<String, String> hashMap, String str2, HashMap<String, String> hashMap2) {
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        try {
            String str3 = "account='" + str + "'";
            if ("All".equalsIgnoreCase(str)) {
                str3 = "";
            }
            if (!roVar.m4206d()) {
                roVar.m4193a();
            }
            Cursor a = roVar.m4192a(str3, "expensed ASC");
            if (a != null && a.moveToFirst()) {
                int columnIndex = a.getColumnIndex("account");
                int columnIndex2 = a.getColumnIndex("amount");
                int columnIndex3 = a.getColumnIndex("category");
                int columnIndex4 = a.getColumnIndex("subcategory");
                double d4 = 0.0d;
                d = 0.0d;
                d2 = 0.0d;
                while (true) {
                    String str4;
                    String str5;
                    String string = a.getString(columnIndex);
                    String string2 = a.getString(columnIndex2);
                    String string3 = a.getString(columnIndex3);
                    String string4 = a.getString(columnIndex4);
                    if (hashMap2 != null) {
                        if ("All".equalsIgnoreCase(str)) {
                            string = abd.m3793a(string2, (String) hashMap2.get(string));
                            if ("Income".equalsIgnoreCase(string3)) {
                                if ("Account Transfer".equalsIgnoreCase(string3) || !"YES".equalsIgnoreCase(str2)) {
                                    str4 = "-" + string;
                                    d3 = aba.m3742a(d2, string);
                                    d2 = d;
                                    str5 = str4;
                                } else {
                                    str4 = "-" + string;
                                    d3 = d2;
                                    d2 = d;
                                    str5 = str4;
                                }
                            } else if ("Account Transfer".equalsIgnoreCase(string4) || !"YES".equalsIgnoreCase(str2)) {
                                d = aba.m3742a(d, string);
                                str4 = string;
                                d3 = d2;
                                d2 = d;
                                str5 = str4;
                            } else {
                                str4 = string;
                                d3 = d2;
                                d2 = d;
                                str5 = str4;
                            }
                            d = aba.m3742a(d4, str5);
                            if (!a.moveToNext()) {
                                break;
                            }
                            d4 = d;
                            d = d2;
                            d2 = d3;
                        }
                    }
                    string = string2;
                    if ("Income".equalsIgnoreCase(string3)) {
                        if ("Account Transfer".equalsIgnoreCase(string3)) {
                        }
                        str4 = "-" + string;
                        d3 = aba.m3742a(d2, string);
                        d2 = d;
                        str5 = str4;
                    } else {
                        if ("Account Transfer".equalsIgnoreCase(string4)) {
                        }
                        d = aba.m3742a(d, string);
                        str4 = string;
                        d3 = d2;
                        d2 = d;
                        str5 = str4;
                    }
                    d = aba.m3742a(d4, str5);
                    if (!a.moveToNext()) {
                        break;
                    }
                    d4 = d;
                    d = d2;
                    d2 = d3;
                }
            }
            hashMap.put(str + "_balance", aba.m3746a(d));
            hashMap.put(str + "_income", aba.m3746a(d2));
            hashMap.put(str + "_expense", aba.m3746a(d3));
            if (a != null) {
                a.close();
            }
            roVar.m4201b();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    static void m3727a(Context context, AppWidgetManager appWidgetManager, int i, String str) {
        HashMap hashMap;
        if (str == null || "".equals(str)) {
            str = ExpenseManager.f3245u.split(",")[0] + ",true,true,true,true,true,true,true,true,true,true,true,true,false,true,true";
        }
        String[] split = str.split(",");
        if (split != null) {
            f3757c = split[0];
        }
        ro roVar = new ro(context);
        ExpenseManager.f3242r = abd.m3783a(context, roVar, "firstDayOfMonth", 1);
        ExpenseManager.f3243s = abd.m3783a(context, roVar, "firstDayOfWeek", Calendar.getInstance().getFirstDayOfWeek());
        ExpenseManager.f3244t = abd.m3786a(context, roVar, "DATE_FORMAT", "yyyy-MM-dd");
        ExpenseManager.f3241q = abd.m3783a(context, roVar, "firstMonthOfYear", 0);
        if ("All".equalsIgnoreCase(f3757c)) {
            ExpenseManager.f3245u = abd.m3786a(context, roVar, "MY_ACCOUNT_NAMES", "Personal Expense");
            f3755a = abd.m3786a(context, roVar, "excludeTransfer", "NO");
            String[] split2 = ExpenseManager.f3245u.split(",");
            hashMap = new HashMap();
            String a = abd.m3787a(context, roVar, split2, hashMap, new HashMap());
            f3756b = new HashMap();
            f3756b = abd.m3795a(context, a, split2, hashMap, f3756b);
        } else {
            f3756b = null;
        }
        hashMap = m3726a(roVar, f3757c, new HashMap(), f3755a, f3756b);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2130903164);
        remoteViews.setTextViewText(2131559026, f3757c);
        remoteViews.setTextViewText(2131559028, (CharSequence) hashMap.get(f3757c + "_income"));
        remoteViews.setTextViewText(2131559031, (CharSequence) hashMap.get(f3757c + "_expense"));
        if (split.length <= 13 || !"true".equals(split[13])) {
            remoteViews.setInt(2131558643, "setBackgroundResource", 2130837658);
        } else {
            remoteViews.setInt(2131558643, "setBackgroundResource", 0);
        }
        String str2 = (String) hashMap.get(f3757c + "_balance");
        if (str2 == null || !str2.startsWith("(")) {
            remoteViews.setTextColor(2131559032, -16711936);
        } else {
            remoteViews.setTextColor(2131559032, -65536);
        }
        remoteViews.setTextViewText(2131559032, str2);
        CharSequence b = abd.m3813b(roVar, abd.m3794a("expensed<=" + aib.m3847a(), f3757c, ExpenseManager.f3245u, "NO"), f3756b);
        if (b == null || !b.startsWith("(")) {
            remoteViews.setTextColor(2131559035, -16711936);
        } else {
            remoteViews.setTextColor(2131559035, -65536);
        }
        remoteViews.setTextViewText(2131559035, b);
        Calendar instance = Calendar.getInstance();
        int a2 = abd.m3783a(context, roVar, "firstDayOfMonth", 1);
        int i2 = a2 - 1;
        if (i2 < 1) {
            i2 = instance.getActualMaximum(5);
        }
        if (instance.get(5) >= a2 && a2 != 1) {
            instance.add(2, 1);
        }
        instance.set(5, i2);
        b = abd.m3813b(roVar, abd.m3794a("expensed<=" + instance.getTimeInMillis(), f3757c, ExpenseManager.f3245u, "NO"), f3756b);
        if (b == null || !b.startsWith("(")) {
            remoteViews.setTextColor(2131559038, -16711936);
        } else {
            remoteViews.setTextColor(2131559038, -65536);
        }
        remoteViews.setTextViewText(2131559038, b);
        Object b2 = abd.m3813b(roVar, aba.m3764b(0, f3757c, 0), f3756b);
        if (b2 == null || !b2.startsWith("(")) {
            remoteViews.setTextColor(2131559040, -16711936);
        } else {
            remoteViews.setTextColor(2131559040, -65536);
        }
        remoteViews.setTextViewText(2131559040, b2);
        CharSequence b3 = abd.m3813b(roVar, aba.m3747a(0, f3757c, 0), f3756b);
        if (b3 == null || !b2.startsWith("(")) {
            remoteViews.setTextColor(2131559042, -16711936);
        } else {
            remoteViews.setTextColor(2131559042, -65536);
        }
        remoteViews.setTextViewText(2131559042, b3);
        str2 = aba.m3764b(0, f3757c, 1);
        if ("YES".equalsIgnoreCase(f3755a)) {
            str2 = str2 + " AND " + "subcategory" + "!='Account Transfer'";
        }
        remoteViews.setTextViewText(2131559045, abd.m3789a(roVar, str2, f3756b));
        remoteViews.setTextViewText(2131559048, abd.m3790a(roVar, f3757c, f3756b, f3755a));
        if (split.length <= 1 || !"false".equals(split[1])) {
            remoteViews.setViewVisibility(2131558635, 0);
        } else {
            remoteViews.setViewVisibility(2131558635, 8);
        }
        if (split.length <= 2 || !"false".equals(split[2])) {
            remoteViews.setViewVisibility(2131559029, 0);
        } else {
            remoteViews.setViewVisibility(2131559029, 8);
        }
        if (split.length <= 3 || !"false".equals(split[3])) {
            remoteViews.setViewVisibility(2131558617, 0);
        } else {
            remoteViews.setViewVisibility(2131558617, 8);
        }
        if (split.length <= 4 || !"false".equals(split[4])) {
            remoteViews.setViewVisibility(2131559033, 0);
        } else {
            remoteViews.setViewVisibility(2131559033, 8);
        }
        if (split.length <= 5 || !"false".equals(split[5])) {
            remoteViews.setViewVisibility(2131559036, 0);
        } else {
            remoteViews.setViewVisibility(2131559036, 8);
        }
        if (split.length <= 6 || !"false".equals(split[6])) {
            remoteViews.setViewVisibility(2131559043, 0);
        } else {
            remoteViews.setViewVisibility(2131559043, 8);
        }
        if (split.length <= 7 || !"false".equals(split[7])) {
            remoteViews.setViewVisibility(2131559046, 0);
        } else {
            remoteViews.setViewVisibility(2131559046, 8);
        }
        DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t, Locale.US);
        Date date = new Date();
        try {
            date = simpleDateFormat.parse(simpleDateFormat.format(date));
        } catch (Exception e) {
        }
        long time = date.getTime();
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(time);
        instance2.set(11, 0);
        time = instance2.getTimeInMillis();
        instance2.set(11, 23);
        str2 = "expensed>=" + time + " AND " + "expensed" + "<=" + instance2.getTimeInMillis() + " and " + "category" + "!='Income'" + " AND " + "account" + "='" + f3757c + "'";
        if ("YES".equalsIgnoreCase(f3755a)) {
            str2 = str2 + " AND " + "category" + "!='Account Transfer'";
        }
        remoteViews.setTextViewText(2131559051, abd.m3789a(roVar, str2, f3756b));
        str2 = aba.m3747a(0, f3757c, 2);
        if ("YES".equalsIgnoreCase(f3755a)) {
            str2 = str2 + " AND " + "category" + "!='Account Transfer'";
        }
        remoteViews.setTextViewText(2131559054, abd.m3789a(roVar, str2, f3756b));
        str2 = aba.m3764b(0, f3757c, 2);
        if ("YES".equalsIgnoreCase(f3755a)) {
            str2 = str2 + " AND " + "category" + "!='Account Transfer'";
        }
        remoteViews.setTextViewText(2131559057, abd.m3789a(roVar, str2, f3756b));
        instance2 = Calendar.getInstance();
        instance2.set(2, ExpenseManager.f3241q);
        instance2.set(5, ExpenseManager.f3242r);
        if (Calendar.getInstance().get(2) < ExpenseManager.f3241q) {
            instance2.add(1, -1);
        }
        instance2.add(5, -1);
        instance2.set(11, 23);
        instance2.set(12, 59);
        str2 = "expensed>" + instance2.getTimeInMillis() + " AND " + "expensed" + "<=" + aib.m3847a() + " AND " + "category" + "!='Income'" + " AND " + "account" + "='" + f3757c + "'";
        if ("YES".equalsIgnoreCase(f3755a)) {
            str2 = str2 + " AND " + "category" + "!='Account Transfer'";
        }
        remoteViews.setTextViewText(2131559060, abd.m3789a(roVar, str2, f3756b));
        if (split.length <= 8 || !"false".equals(split[8])) {
            remoteViews.setViewVisibility(2131559049, 0);
        } else {
            remoteViews.setViewVisibility(2131559049, 8);
        }
        if (split.length <= 9 || !"false".equals(split[9])) {
            remoteViews.setViewVisibility(2131559052, 0);
        } else {
            remoteViews.setViewVisibility(2131559052, 8);
        }
        if (split.length <= 10 || !"false".equals(split[10])) {
            remoteViews.setViewVisibility(2131559055, 0);
        } else {
            remoteViews.setViewVisibility(2131559055, 8);
        }
        if (split.length <= 11 || !"false".equals(split[11])) {
            remoteViews.setViewVisibility(2131559058, 0);
        } else {
            remoteViews.setViewVisibility(2131559058, 8);
        }
        if (split.length <= 14 || !"false".equals(split[14])) {
            remoteViews.setViewVisibility(2131558624, 0);
        } else {
            remoteViews.setViewVisibility(2131558624, 8);
        }
        if (split.length <= 15 || !"false".equals(split[15])) {
            remoteViews.setViewVisibility(2131558622, 0);
        } else {
            remoteViews.setViewVisibility(2131558622, 8);
        }
        if (split.length <= 12 || !"true".equals(split[12])) {
            remoteViews.setViewVisibility(2131559061, 8);
        } else {
            List arrayList = new ArrayList();
            aba.m3760a(context, roVar, "account='" + f3757c + "'", arrayList);
            List a3 = abd.m3800a(arrayList, false);
            b3 = "";
            a2 = 0;
            while (a2 < a3.size()) {
                Map map = (Map) a3.get(a2);
                String str3 = (String) map.get("nextPaymentDate");
                String str4 = (String) map.get("expenseAmount");
                if (str4 == null || "".equals(str4)) {
                    str4 = (String) map.get("incomeAmount");
                }
                a2++;
                Object obj = new Date().getTime() > aba.m3744a(str3, ExpenseManager.f3244t, Locale.US) ? b3 : b3 + ((String) map.get("description")) + " " + context.getResources().getString(2131099975) + " " + str3 + ": " + str4 + "\n";
            }
            remoteViews.setTextViewText(2131559061, b3);
            remoteViews.setViewVisibility(2131559061, 0);
        }
        Intent intent = new Intent(context, ExpenseNewTransaction.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", f3757c);
        bundle.putString("fromWhere", "widget");
        intent.putExtras(bundle);
        remoteViews.setOnClickPendingIntent(2131559021, PendingIntent.getActivity(context, i, intent, 134217728));
        intent = new Intent(context, WidgetConfigure.class);
        intent.putExtra("appWidgetId", i);
        remoteViews.setOnClickPendingIntent(2131559024, PendingIntent.getActivity(context, i, intent, 134217728));
        intent = new Intent(context, ExpenseManager.class);
        intent.putExtras(bundle);
        remoteViews.setOnClickPendingIntent(2131559027, PendingIntent.getActivity(context, i, intent, 134217728));
        intent = new Intent(context, WidgetProvider.class);
        intent.setAction("UPDATE_ACTION");
        intent.putExtra("account", f3757c);
        intent.putExtra("appWidgetId", i);
        intent.setData(Uri.withAppendedPath(Uri.parse("URI_SCHEME_LARGE://widget/id/"), String.valueOf(i)));
        remoteViews.setOnClickPendingIntent(2131559025, PendingIntent.getBroadcast(context, 0, intent, 134217728));
        intent = new Intent(context, ExpenseTools.class);
        intent.putExtras(bundle);
        remoteViews.setOnClickPendingIntent(2131559022, PendingIntent.getActivity(context, i, intent, 134217728));
        appWidgetManager.updateAppWidget(i, remoteViews);
    }

    public void onDeleted(Context context, int[] iArr) {
        for (int b : iArr) {
            WidgetConfigure.m3647b(context, b);
        }
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || !action.equals("UPDATE_ACTION")) {
            super.onReceive(context, intent);
            return;
        }
        Object stringExtra = intent.getStringExtra("account");
        if (stringExtra == null || "".equals(stringExtra)) {
            stringExtra = "Personal Expense";
        }
        String[] split = abd.m3786a(context, new ro(context), "MY_ACCOUNT_NAMES", "Personal Expense").split(",");
        int indexOf = new ArrayList(Arrays.asList(split)).indexOf(stringExtra) + 1;
        if (indexOf > split.length - 1 || indexOf < 0) {
            indexOf = 0;
        }
        f3757c = split[indexOf];
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        try {
            String a = WidgetConfigure.m3642a(context, intExtra);
            m3727a(context, instance, intExtra, a.replace(a.substring(0, a.indexOf(",")), f3757c));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int i : iArr) {
            try {
                m3727a(context, appWidgetManager, i, WidgetConfigure.m3642a(context, i));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
