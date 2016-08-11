package com.expensemanager;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
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
import java.util.Locale;

public class WidgetProviderSmall extends AppWidgetProvider {
    static String f3784a;
    public static HashMap<String, String> f3785b;
    private static String f3786c;

    static {
        f3786c = "";
        f3784a = "NO";
        f3785b = null;
    }

    static void m3737a(Context context, AppWidgetManager appWidgetManager, int i, String str) {
        String[] split = str.split(",");
        if (split != null) {
            f3786c = split[0];
        }
        if (!"".equals(f3786c)) {
            HashMap hashMap;
            ro roVar = new ro(context);
            ExpenseManager.f3242r = abd.m3783a(context, roVar, "firstDayOfMonth", 1);
            ExpenseManager.f3243s = abd.m3783a(context, roVar, "firstDayOfWeek", Calendar.getInstance().getFirstDayOfWeek());
            ExpenseManager.f3244t = abd.m3786a(context, roVar, "DATE_FORMAT", "yyyy-MM-dd");
            ExpenseManager.f3241q = abd.m3783a(context, roVar, "firstMonthOfYear", 0);
            f3784a = abd.m3786a(context, roVar, "excludeTransfer", "NO");
            if ("All".equalsIgnoreCase(f3786c)) {
                ExpenseManager.f3245u = abd.m3786a(context, roVar, "MY_ACCOUNT_NAMES", "Personal Expense");
                String[] split2 = ExpenseManager.f3245u.split(",");
                hashMap = new HashMap();
                String a = abd.m3787a(context, roVar, split2, hashMap, new HashMap());
                f3785b = new HashMap();
                f3785b = abd.m3795a(context, a, split2, hashMap, f3785b);
            } else {
                f3785b = null;
            }
            hashMap = WidgetProvider.m3726a(roVar, f3786c, new HashMap(), f3784a, f3785b);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2130903173);
            remoteViews.setTextViewText(2131559026, f3786c);
            remoteViews.setTextViewText(2131559028, (CharSequence) hashMap.get(f3786c + "_income"));
            remoteViews.setTextViewText(2131559031, (CharSequence) hashMap.get(f3786c + "_expense"));
            if (split.length <= 15 || !"true".equals(split[15])) {
                remoteViews.setInt(2131558643, "setBackgroundResource", 2130837658);
            } else {
                remoteViews.setInt(2131558643, "setBackgroundResource", 0);
            }
            String str2 = (String) hashMap.get(f3786c + "_balance");
            if (str2 == null || !str2.startsWith("(")) {
                remoteViews.setTextColor(2131559032, -16711936);
            } else {
                remoteViews.setTextColor(2131559032, -65536);
            }
            remoteViews.setTextViewText(2131559032, str2);
            CharSequence b = abd.m3813b(roVar, abd.m3794a("expensed<=" + aib.m3847a(), f3786c, ExpenseManager.f3245u, "NO"), f3785b);
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
            instance.set(11, 23);
            instance.set(12, 59);
            instance.set(12, 59);
            instance.set(13, 59);
            instance.set(14, 999);
            b = abd.m3813b(roVar, abd.m3794a("expensed<=" + instance.getTimeInMillis(), f3786c, ExpenseManager.f3245u, "NO"), f3785b);
            if (b == null || !b.startsWith("(")) {
                remoteViews.setTextColor(2131559038, -16711936);
            } else {
                remoteViews.setTextColor(2131559038, -65536);
            }
            remoteViews.setTextViewText(2131559038, b);
            str2 = aba.m3764b(0, f3786c, 1);
            if ("YES".equalsIgnoreCase(f3784a)) {
                str2 = str2 + " AND " + "subcategory" + "!='Account Transfer'";
            }
            remoteViews.setTextViewText(2131559045, abd.m3789a(roVar, str2, f3785b));
            remoteViews.setTextViewText(2131559048, abd.m3790a(roVar, f3786c, f3785b, f3784a));
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
            long timeInMillis = instance2.getTimeInMillis();
            remoteViews.setTextViewText(2131559051, abd.m3789a(roVar, abd.m3794a("expensed>=" + time + " AND " + "expensed" + "<=" + timeInMillis + " and " + "category" + "!='Income'", f3786c, ExpenseManager.f3245u, f3784a), f3785b));
            str2 = aba.m3747a(0, f3786c, 2);
            if ("YES".equalsIgnoreCase(f3784a)) {
                str2 = str2 + " AND " + "category" + "!='Account Transfer'";
            }
            remoteViews.setTextViewText(2131559054, abd.m3789a(roVar, str2, f3785b));
            str2 = aba.m3764b(0, f3786c, 2);
            if ("YES".equalsIgnoreCase(f3784a)) {
                str2 = str2 + " AND " + "category" + "!='Account Transfer'";
            }
            remoteViews.setTextViewText(2131559057, abd.m3789a(roVar, str2, f3785b));
            instance2 = Calendar.getInstance();
            instance2.set(2, ExpenseManager.f3241q);
            instance2.set(5, ExpenseManager.f3242r);
            if (Calendar.getInstance().get(2) < ExpenseManager.f3241q) {
                instance2.add(1, -1);
            }
            instance2.add(5, -1);
            instance2.set(11, 23);
            instance2.set(12, 59);
            remoteViews.setTextViewText(2131559060, abd.m3789a(roVar, abd.m3794a("expensed>" + instance2.getTimeInMillis() + " AND " + "expensed" + "<=" + aib.m3847a() + " AND " + "category" + "!='Income'", f3786c, ExpenseManager.f3245u, f3784a), f3785b));
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
            if (split.length <= 12 || !"false".equals(split[12])) {
                remoteViews.setViewVisibility(2131558629, 0);
            } else {
                remoteViews.setViewVisibility(2131558629, 8);
            }
            if (split.length <= 13 || !"false".equals(split[13])) {
                remoteViews.setViewVisibility(2131559109, 0);
            } else {
                remoteViews.setViewVisibility(2131559109, 8);
            }
            if (split.length <= 14 || !"false".equals(split[14])) {
                remoteViews.setViewVisibility(2131558624, 0);
            } else {
                remoteViews.setViewVisibility(2131558624, 8);
            }
            remoteViews.setTextViewText(2131559108, abd.m3789a(roVar, abd.m3794a("expensed>=" + time + " AND " + "expensed" + "<=" + timeInMillis + " and " + "category" + "='Income'", f3786c, ExpenseManager.f3245u, f3784a), f3785b));
            str2 = aba.m3747a(0, f3786c, 1);
            if ("All".equalsIgnoreCase(f3786c)) {
                str2 = str2 + " AND " + "category" + "!='Account Transfer'";
            }
            remoteViews.setTextViewText(2131559111, abd.m3789a(roVar, str2, f3785b));
            String b2 = aba.m3764b(0, f3786c, 0);
            if ("All".equalsIgnoreCase(f3786c)) {
                str2 + " AND " + "category" + "!='Account Transfer'";
            }
            b = abd.m3813b(roVar, b2, f3785b);
            if (b == null || !b.startsWith("(")) {
                remoteViews.setTextColor(2131559040, -16711936);
            } else {
                remoteViews.setTextColor(2131559040, -65536);
            }
            remoteViews.setTextViewText(2131559040, b);
            Intent intent = new Intent(context, ExpenseNewTransaction.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", f3786c);
            bundle.putString("fromWhere", "widget");
            intent.putExtras(bundle);
            remoteViews.setOnClickPendingIntent(2131559021, PendingIntent.getActivity(context, i, intent, 134217728));
            intent = new Intent(context, WidgetConfigureSmall.class);
            intent.putExtra("appWidgetId", i);
            remoteViews.setOnClickPendingIntent(2131559105, PendingIntent.getActivity(context, i, intent, 134217728));
            intent = new Intent(context, ExpenseManager.class);
            intent.putExtras(bundle);
            remoteViews.setOnClickPendingIntent(2131559027, PendingIntent.getActivity(context, i, intent, 134217728));
            intent = new Intent(context, WidgetProviderSmall.class);
            intent.setAction("UPDATE_ACTION");
            intent.putExtra("account", f3786c);
            intent.putExtra("appWidgetId", i);
            intent.setData(Uri.withAppendedPath(Uri.parse("URI_SCHEME_SMALL://widget/id/"), String.valueOf(i)));
            remoteViews.setOnClickPendingIntent(2131559025, PendingIntent.getBroadcast(context, 0, intent, 134217728));
            intent = new Intent(context, ExpenseTools.class);
            intent.putExtras(bundle);
            remoteViews.setOnClickPendingIntent(2131559022, PendingIntent.getActivity(context, i, intent, 134217728));
            appWidgetManager.updateAppWidget(i, remoteViews);
        }
    }

    public void onDeleted(Context context, int[] iArr) {
        for (int b : iArr) {
            WidgetConfigureSmall.m3686b(context, b);
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
        String a = abd.m3786a(context, new ro(context), "MY_ACCOUNT_NAMES", "Personal Expense");
        if (a.split(",").length > 1) {
            a = a + ",All";
        }
        String[] split = a.split(",");
        int indexOf = new ArrayList(Arrays.asList(split)).indexOf(stringExtra) + 1;
        if (indexOf > split.length - 1 || indexOf < 0) {
            indexOf = 0;
        }
        f3786c = split[indexOf];
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        try {
            String a2 = WidgetConfigureSmall.m3681a(context, intExtra);
            m3737a(context, instance, intExtra, a2.replace(a2.substring(0, a2.indexOf(",")), f3786c));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int i : iArr) {
            try {
                m3737a(context, appWidgetManager, i, WidgetConfigureSmall.m3681a(context, i));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
