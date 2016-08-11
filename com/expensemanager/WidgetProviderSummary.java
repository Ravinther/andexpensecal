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
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class WidgetProviderSummary extends AppWidgetProvider {
    static final HashMap<String, String> f3787a;
    static int f3788b;
    static int f3789c;
    private static String f3790d;

    static {
        f3790d = "";
        f3787a = new HashMap();
        f3788b = 0;
        f3789c = 0;
    }

    public static int m3738a(String str, ArrayList<HashMap<String, String>> arrayList) {
        String substring = str.substring(0, str.indexOf(" "));
        for (int i = 0; i < arrayList.size(); i++) {
            HashMap hashMap = (HashMap) arrayList.get(i);
            if (substring != null && substring.equals(hashMap.get("fromDate"))) {
                return i;
            }
        }
        return -1;
    }

    public static void m3739a(Context context, AppWidgetManager appWidgetManager, int i, String str) {
        if (str == null || "".equals(str)) {
            str = ExpenseManager.f3245u.split(",")[0] + ";0;0;NO;0";
        }
        if (str != null && !"".equals(str)) {
            String[] split = str.split(";");
            if (split != null) {
                f3790d = split[0];
            }
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2130903174);
            ro roVar = new ro(context);
            ArrayList arrayList = new ArrayList();
            ExpenseAccountSummary.m2682a(roVar, f3787a);
            String str2 = "";
            if ("0".equals(split[2])) {
                remoteViews.setViewVisibility(2131559075, 8);
                remoteViews.setViewVisibility(2131559025, 8);
                str2 = "";
                if (!(f3787a.get("fromDate") == null || f3787a.get("toDate") == null)) {
                    arrayList.add(f3787a);
                }
                if (!"NO".equalsIgnoreCase(split[3])) {
                    String[] split2 = split[3].split(",");
                    f3787a.put("fromDate", split2[0]);
                    f3787a.put("toDate", split2[1]);
                    arrayList.add(f3787a);
                }
            }
            if ("1".equals(split[2])) {
                remoteViews.setViewVisibility(2131559075, 0);
                remoteViews.setViewVisibility(2131559025, 0);
                str2 = "Wk ";
                ExpenseAccountSummary.m2687b(f3787a, arrayList);
                if (f3788b == 0) {
                    f3789c = m3738a(aba.m3763b(f3788b), arrayList);
                    if (f3789c == -1) {
                        f3788b = 0;
                    }
                }
            }
            if ("2".equals(split[2])) {
                remoteViews.setViewVisibility(2131559075, 0);
                remoteViews.setViewVisibility(2131559025, 0);
                str2 = "Mo ";
                ExpenseAccountSummary.m2690c(f3787a, arrayList);
                if (f3788b == 0) {
                    f3789c = m3738a(aba.m3776d(f3788b), arrayList);
                    if (f3789c == -1) {
                        f3788b = 0;
                    }
                }
            }
            if ("3".equals(split[2])) {
                remoteViews.setViewVisibility(2131559075, 0);
                remoteViews.setViewVisibility(2131559025, 0);
                str2 = "Yr ";
                ExpenseAccountSummary.m2683a(f3787a, arrayList);
                if (f3788b == 0) {
                    f3789c = m3738a(aba.m3779e(f3788b), arrayList);
                    if (f3789c == -1) {
                        f3788b = 0;
                    }
                }
            }
            String str3 = str2;
            int parseInt = Integer.parseInt(split[1]);
            String str4 = parseInt == 0 ? "category" : parseInt == 1 ? "Income" : parseInt == 2 ? "property" : parseInt == 3 ? "payment_method" : parseInt == 4 ? "status" : parseInt == 5 ? "expense_tag" : parseInt == 6 ? "subcategory" : parseInt == 7 ? "category" : parseInt == 8 ? "Income" : "category";
            String str5 = "Income".equalsIgnoreCase(str4) ? "account in (" + abd.m3792a(f3790d) + ") and " + "category" + "='Income' " : "account in (" + abd.m3792a(f3790d) + ") and " + "category" + "!='Income' ";
            int i2 = f3789c + f3788b;
            if (i2 < 0) {
                f3788b++;
            } else if (i2 >= arrayList.size()) {
                f3788b--;
            } else {
                HashMap hashMap = (HashMap) arrayList.get(i2);
                String str6 = (String) hashMap.get("fromDate");
                str2 = (String) hashMap.get("toDate");
                String str7 = str3 + str6 + " - " + str2;
                DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
                Date parse = simpleDateFormat.parse(str6);
                Date parse2 = simpleDateFormat.parse(str2);
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(parse.getTime());
                instance.set(11, 0);
                Calendar instance2 = Calendar.getInstance();
                instance2.setTimeInMillis(parse2.getTime());
                instance2.set(11, 23);
                instance2.set(12, 59);
                str3 = (str5 + " AND " + "expensed" + ">=" + instance.getTimeInMillis()) + " AND " + "expensed" + "<=" + instance2.getTimeInMillis();
                str3 = !"Income".equalsIgnoreCase(str4) ? str3 + " and " + "category" + "!='Income' " : str3 + " and " + "category" + "='Income' ";
                if (parseInt == 7) {
                    str3 = str3 + " and " + "category" + "!='Account Transfer' ";
                }
                if (parseInt == 8) {
                    str3 = str3 + " and " + "subcategory" + "!='Account Transfer' ";
                }
                str5 = str4 + " COLLATE NOCASE ASC";
                if ("Income".equalsIgnoreCase(str4)) {
                    str5 = "subcategory COLLATE NOCASE ASC";
                }
                if ("subcategory".equalsIgnoreCase(str4)) {
                    str5 = "category COLLATE NOCASE ASC";
                }
                remoteViews.setTextViewText(2131559026, f3790d);
                remoteViews.setTextViewText(2131559078, str7 + ": " + abd.m3789a(roVar, str3, ExpenseManager.f3246v));
                Intent intent = new Intent(context, WidgetService.class);
                intent.putExtra("appWidgetId", i);
                intent.putExtra("account", f3790d);
                intent.putExtra("summaryType", str4);
                intent.putExtra("itemWhereClause", str3);
                intent.putExtra("orderBy", str5);
                intent.putExtra("fromDate", str6);
                intent.putExtra("toDate", str2);
                intent.putExtra("time", "" + new Date().getTime());
                intent.setData(Uri.parse(intent.toUri(1)));
                remoteViews.setRemoteAdapter(i, 2131559112, intent);
                remoteViews.setPendingIntentTemplate(2131559112, PendingIntent.getActivity(context, 0, new Intent(context, ExpenseAccountExpandableList.class), 134217728));
                if (split.length > 4 && "0".equalsIgnoreCase(split[4])) {
                    remoteViews.setInt(2131558643, "setBackgroundResource", 2130837658);
                    remoteViews.setTextColor(2131559026, -12862977);
                    remoteViews.setTextColor(2131559078, -12862977);
                }
                if (split.length > 4 && "1".equalsIgnoreCase(split[4])) {
                    remoteViews.setInt(2131558643, "setBackgroundResource", 2130837527);
                    remoteViews.setTextColor(2131559026, -1);
                    remoteViews.setTextColor(2131559078, -1);
                }
                if (split.length > 4 && "2".equalsIgnoreCase(split[4])) {
                    remoteViews.setInt(2131558643, "setBackgroundResource", 2130837528);
                    remoteViews.setTextColor(2131559026, -1);
                    remoteViews.setTextColor(2131559078, -1);
                }
                if (split.length > 4 && "3".equalsIgnoreCase(split[4])) {
                    remoteViews.setInt(2131558643, "setBackgroundResource", 2130837529);
                    remoteViews.setTextColor(2131559026, -1);
                    remoteViews.setTextColor(2131559078, -1);
                }
                if (split.length > 4 && "4".equalsIgnoreCase(split[4])) {
                    remoteViews.setInt(2131558643, "setBackgroundResource", 2130837657);
                    remoteViews.setTextColor(2131559026, -1);
                    remoteViews.setTextColor(2131559078, -1);
                }
                if (split.length > 4 && "5".equalsIgnoreCase(split[4])) {
                    remoteViews.setInt(2131558643, "setBackgroundResource", 2130837531);
                    remoteViews.setTextColor(2131559026, -1);
                    remoteViews.setTextColor(2131559078, -1);
                }
                if (split.length > 4 && "6".equalsIgnoreCase(split[4])) {
                    remoteViews.setInt(2131558643, "setBackgroundResource", 0);
                    remoteViews.setTextColor(2131559026, -12862977);
                    remoteViews.setTextColor(2131559078, -12862977);
                }
                Intent intent2 = new Intent(context, ExpenseNewTransaction.class);
                Bundle bundle = new Bundle();
                bundle.putString("account", f3790d);
                bundle.putString("fromWhere", "widget");
                intent2.putExtras(bundle);
                remoteViews.setOnClickPendingIntent(2131559021, PendingIntent.getActivity(context, i, intent2, 134217728));
                intent2 = new Intent(context, WidgetConfigureSummary.class);
                intent2.putExtra("appWidgetId", i);
                remoteViews.setOnClickPendingIntent(2131559024, PendingIntent.getActivity(context, i, intent2, 134217728));
                intent2 = new Intent(context, ExpenseManager.class);
                intent2.putExtras(bundle);
                remoteViews.setOnClickPendingIntent(2131559076, PendingIntent.getActivity(context, i, intent2, 134217728));
                intent2 = new Intent(context, WidgetProviderSummary.class);
                intent2.setAction("NEXT_ACTION");
                intent2.putExtra("account", f3790d);
                intent2.putExtra("appWidgetId", i);
                intent2.setData(Uri.withAppendedPath(Uri.parse("URI_SCHEME_LARGE://widget/id/"), String.valueOf(i)));
                remoteViews.setOnClickPendingIntent(2131559025, PendingIntent.getBroadcast(context, 0, intent2, 134217728));
                intent2 = new Intent(context, WidgetProviderSummary.class);
                intent2.setAction("BACK_ACTION");
                intent2.putExtra("appWidgetId", i);
                intent2.setData(Uri.withAppendedPath(Uri.parse("URI_SCHEME_LARGE://widget/id/"), String.valueOf(i)));
                remoteViews.setOnClickPendingIntent(2131559075, PendingIntent.getBroadcast(context, 0, intent2, 134217728));
                appWidgetManager.notifyAppWidgetViewDataChanged(i, 2131559112);
                appWidgetManager.updateAppWidget(i, remoteViews);
            }
        }
    }

    public void onDeleted(Context context, int[] iArr) {
        for (int b : iArr) {
            WidgetConfigure.m3647b(context, b);
        }
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || !(action.equals("NEXT_ACTION") || action.equals("BACK_ACTION"))) {
            super.onReceive(context, intent);
            return;
        }
        if (action.equals("NEXT_ACTION")) {
            f3788b++;
        }
        if (action.equals("BACK_ACTION")) {
            f3788b--;
        }
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        try {
            m3739a(context, instance, intExtra, WidgetConfigureSummary.m3709a(context, intExtra));
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
                m3739a(context, appWidgetManager, i, WidgetConfigure.m3642a(context, i));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
