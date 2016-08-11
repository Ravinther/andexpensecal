package com.expensemanager;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.Toast;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WidgetProviderBudget extends AppWidgetProvider {
    static final HashMap<String, String> f3777a;
    static int f3778b;
    static int f3779c;
    private static String f3780d;

    static {
        f3780d = "";
        f3777a = new HashMap();
        f3778b = 0;
        f3779c = 2;
    }

    public static void m3733a(Context context, AppWidgetManager appWidgetManager, int i, String str) {
        if (str == null || "".equals(str)) {
            str = "2;false";
        }
        if (str != null && !"".equals(str)) {
            String[] split = str.split(";");
            f3779c = Integer.parseInt(split[0]);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2130903166);
            Object obj = "";
            String str2 = split[0];
            CharSequence string = context.getResources().getString(2131099956);
            if ("0".equals(str2)) {
                remoteViews.setViewVisibility(2131559075, 0);
                remoteViews.setViewVisibility(2131559025, 0);
                Calendar instance = Calendar.getInstance();
                instance.add(5, f3778b);
                obj = aba.m3749a(instance.getTimeInMillis(), ExpenseManager.f3244t);
                string = context.getResources().getString(2131099791);
            }
            if ("1".equals(str2)) {
                remoteViews.setViewVisibility(2131559075, 0);
                remoteViews.setViewVisibility(2131559025, 0);
                obj = aba.m3763b(f3778b);
                string = context.getResources().getString(2131100165);
            }
            if ("2".equals(str2)) {
                remoteViews.setViewVisibility(2131559075, 0);
                remoteViews.setViewVisibility(2131559025, 0);
                obj = aba.m3776d(f3778b);
                string = context.getResources().getString(2131099956);
            }
            if ("3".equals(str2)) {
                remoteViews.setViewVisibility(2131559075, 0);
                remoteViews.setViewVisibility(2131559025, 0);
                obj = aba.m3779e(f3778b);
                string = context.getResources().getString(2131100179);
            }
            if ("4".equals(str2)) {
                remoteViews.setViewVisibility(2131559075, 8);
                remoteViews.setViewVisibility(2131559025, 8);
                string = context.getResources().getString(2131099986);
            }
            remoteViews.setTextViewText(2131559077, string);
            remoteViews.setTextViewText(2131559078, obj);
            Intent intent = new Intent(context, WidgetBudgetService.class);
            intent.putExtra("appWidgetId", i);
            intent.putExtra("period", str2);
            intent.putExtra("counter", f3778b);
            intent.putExtra("dateRange", obj);
            intent.putExtra("time", "" + new Date().getTime());
            intent.setData(Uri.parse(intent.toUri(1)));
            remoteViews.setRemoteAdapter(i, 2131559079, intent);
            remoteViews.setPendingIntentTemplate(2131559079, PendingIntent.getActivity(context, 0, new Intent(context, ExpenseAccountExpandableList.class), 134217728));
            if ("true".equalsIgnoreCase(split[1])) {
                remoteViews.setInt(2131558643, "setBackgroundResource", 0);
            } else {
                remoteViews.setInt(2131558643, "setBackgroundResource", 2130837658);
            }
            intent = new Intent(context, ExpenseNewTransaction.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", f3780d);
            bundle.putString("fromWhere", "widget");
            intent.putExtras(bundle);
            remoteViews.setOnClickPendingIntent(2131559021, PendingIntent.getActivity(context, i, intent, 134217728));
            intent = new Intent(context, WidgetConfigureBudget.class);
            intent.putExtra("appWidgetId", i);
            remoteViews.setOnClickPendingIntent(2131559024, PendingIntent.getActivity(context, i, intent, 134217728));
            intent = new Intent(context, WidgetProviderBudget.class);
            intent.setAction("PERIOD_ACTION");
            intent.putExtra("appWidgetId", i);
            intent.setData(Uri.withAppendedPath(Uri.parse("URI_SCHEME_LARGE://widget/id/"), String.valueOf(i)));
            remoteViews.setOnClickPendingIntent(2131559076, PendingIntent.getBroadcast(context, 0, intent, 134217728));
            intent = new Intent(context, WidgetProviderBudget.class);
            intent.setAction("NEXT_ACTION");
            intent.putExtra("appWidgetId", i);
            intent.setData(Uri.withAppendedPath(Uri.parse("URI_SCHEME_LARGE://widget/id/"), String.valueOf(i)));
            remoteViews.setOnClickPendingIntent(2131559025, PendingIntent.getBroadcast(context, 0, intent, 134217728));
            intent = new Intent(context, WidgetProviderBudget.class);
            intent.setAction("BACK_ACTION");
            intent.putExtra("appWidgetId", i);
            intent.setData(Uri.withAppendedPath(Uri.parse("URI_SCHEME_LARGE://widget/id/"), String.valueOf(i)));
            remoteViews.setOnClickPendingIntent(2131559075, PendingIntent.getBroadcast(context, 0, intent, 134217728));
            appWidgetManager.notifyAppWidgetViewDataChanged(i, 2131559113);
            appWidgetManager.updateAppWidget(i, remoteViews);
        }
    }

    public static boolean m3734a(Context context, ro roVar, List<Map<String, String>> list, List<Map<String, String>> list2, List<Map<String, String>> list3, List<Map<String, String>> list4, List<Map<String, String>> list5) {
        Resources resources = context.getResources();
        boolean z = true;
        Cursor cursor = null;
        try {
            if (!roVar.m4206d()) {
                roVar.m4193a();
            }
            cursor = roVar.m4207e(null, "account ASC");
            if (cursor == null || cursor.getCount() == 0) {
                Toast.makeText(context, resources.getString(2131099691), 1).show();
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
                    long j = cursor.getLong(columnIndex);
                    String str = "" + r20;
                    String string = cursor.getString(columnIndex2);
                    String string2 = cursor.getString(columnIndex3);
                    String string3 = cursor.getString(columnIndex4);
                    Object string4 = cursor.getString(columnIndex5);
                    String string5 = cursor.getString(columnIndex7);
                    String string6 = cursor.getString(columnIndex8);
                    String string7 = cursor.getString(columnIndex9);
                    String string8 = cursor.getString(columnIndex10);
                    String string9 = cursor.getString(columnIndex11);
                    String string10 = cursor.getString(columnIndex6);
                    if (resources.getString(2131099721).equals(string4)) {
                        string4 = "All";
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("rowId", str);
                    hashMap.put("account", string);
                    hashMap.put("category", string3);
                    hashMap.put("subcategory", string4);
                    hashMap.put("period", string6);
                    hashMap.put("amount", string2);
                    hashMap.put("originalAmount", string2);
                    hashMap.put("alert", string10);
                    hashMap.put("description", string5);
                    hashMap.put("property", string7);
                    hashMap.put("property2", string8);
                    hashMap.put("property3", string9);
                    if ("0".equals(string6)) {
                        list2.add(hashMap);
                    }
                    if ("1".equals(string6)) {
                        list3.add(hashMap);
                    }
                    if ("2".equals(string6)) {
                        list4.add(hashMap);
                    }
                    if ("3".equals(string6)) {
                        list5.add(hashMap);
                    }
                    if ("4".equals(string6)) {
                        list.add(hashMap);
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

    public void onDeleted(Context context, int[] iArr) {
        for (int b : iArr) {
            WidgetConfigure.m3647b(context, b);
        }
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || !(action.equals("NEXT_ACTION") || action.equals("BACK_ACTION") || action.equals("PERIOD_ACTION"))) {
            super.onReceive(context, intent);
            return;
        }
        if (action.equals("NEXT_ACTION")) {
            f3778b++;
        }
        if (action.equals("BACK_ACTION")) {
            f3778b--;
        }
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        try {
            String a = WidgetConfigureSummary.m3709a(context, intExtra);
            if (a == null || "".equals(a)) {
                a = "2;false";
            }
            if (action.equals("PERIOD_ACTION")) {
                f3779c++;
                f3778b = 0;
            }
            if (f3779c > 4) {
                f3779c = 0;
            }
            m3733a(context, instance, intExtra, f3779c + ";" + a.split(";")[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        ro roVar = new ro(context);
        ExpenseManager.f3242r = abd.m3783a(context, roVar, "firstDayOfMonth", 1);
        ExpenseManager.f3243s = abd.m3783a(context, roVar, "firstDayOfWeek", Calendar.getInstance().getFirstDayOfWeek());
        ExpenseManager.f3244t = abd.m3786a(context, roVar, "DATE_FORMAT", "yyyy-MM-dd");
        ExpenseManager.f3241q = abd.m3783a(context, roVar, "firstMonthOfYear", 0);
        for (int i : iArr) {
            try {
                m3733a(context, appWidgetManager, i, WidgetConfigure.m3642a(context, i));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
