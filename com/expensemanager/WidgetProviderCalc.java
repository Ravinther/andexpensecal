package com.expensemanager;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.expensemanager.calculator.C0406i;
import java.util.HashMap;

public class WidgetProviderCalc extends AppWidgetProvider {
    static HashMap<String, String> f3781a;
    static HashMap<String, RemoteViews> f3782b;
    static String f3783c;

    static {
        f3783c = "";
    }

    private static PendingIntent m3735a(Context context, String str, int i) {
        Intent intent = new Intent(context, WidgetProviderCalc.class);
        intent.setAction("calc;" + str + ";" + i);
        return PendingIntent.getBroadcast(context, 0, intent, 0);
    }

    static void m3736a(Context context, AppWidgetManager appWidgetManager, int i) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2130903168);
        f3782b.put("" + i, remoteViews);
        remoteViews.setOnClickPendingIntent(2131558442, m3735a(context, "0", i));
        remoteViews.setOnClickPendingIntent(2131558438, m3735a(context, "1", i));
        remoteViews.setOnClickPendingIntent(2131558439, m3735a(context, "2", i));
        remoteViews.setOnClickPendingIntent(2131558440, m3735a(context, "3", i));
        remoteViews.setOnClickPendingIntent(2131558434, m3735a(context, "4", i));
        remoteViews.setOnClickPendingIntent(2131558435, m3735a(context, "5", i));
        remoteViews.setOnClickPendingIntent(2131558436, m3735a(context, "6", i));
        remoteViews.setOnClickPendingIntent(2131558430, m3735a(context, "7", i));
        remoteViews.setOnClickPendingIntent(2131558431, m3735a(context, "8", i));
        remoteViews.setOnClickPendingIntent(2131558432, m3735a(context, "9", i));
        remoteViews.setOnClickPendingIntent(2131558446, m3735a(context, context.getResources().getString(2131100018), i));
        remoteViews.setOnClickPendingIntent(2131558443, m3735a(context, context.getResources().getString(2131099832), i));
        remoteViews.setOnClickPendingIntent(2131558444, m3735a(context, context.getResources().getString(2131099878), i));
        remoteViews.setOnClickPendingIntent(2131558445, m3735a(context, context.getResources().getString(2131100027), i));
        remoteViews.setOnClickPendingIntent(2131558441, m3735a(context, context.getResources().getString(2131099955), i));
        remoteViews.setOnClickPendingIntent(2131558437, m3735a(context, context.getResources().getString(2131099969), i));
        remoteViews.setOnClickPendingIntent(2131558433, m3735a(context, context.getResources().getString(2131099830), i));
        remoteViews.setOnClickPendingIntent(2131558448, m3735a(context, "C", i));
        remoteViews.setOnClickPendingIntent(2131559070, m3735a(context, "AC", i));
        remoteViews.setOnClickPendingIntent(2131559081, PendingIntent.getActivity(context, i, new Intent(context, ExpenseManager.class), 134217728));
        Intent intent = new Intent(context, CurrencyConverter.class);
        intent.putExtra("fromWhere", "tools");
        remoteViews.setOnClickPendingIntent(2131559082, PendingIntent.getActivity(context, i, intent, 134217728));
        intent = new Intent(context, CreditCardPayOffCalculator.class);
        intent.putExtra("fromWhere", "tools");
        remoteViews.setOnClickPendingIntent(2131559083, PendingIntent.getActivity(context, i, intent, 134217728));
        intent = new Intent(context, SalesTaxCalculator.class);
        intent.putExtra("fromWhere", "tools");
        remoteViews.setOnClickPendingIntent(2131559084, PendingIntent.getActivity(context, i, intent, 134217728));
        intent = new Intent(context, TipCalculator.class);
        intent.putExtra("fromWhere", "tools");
        remoteViews.setOnClickPendingIntent(2131559085, PendingIntent.getActivity(context, i, intent, 134217728));
        appWidgetManager.updateAppWidget(i, remoteViews);
    }

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if (f3782b == null) {
            ComponentName componentName = new ComponentName(context, WidgetProvider.class);
            AppWidgetManager instance = AppWidgetManager.getInstance(context);
            onUpdate(context, instance, instance.getAppWidgetIds(componentName));
        }
        String action = intent.getAction();
        if (action != null && action.startsWith("calc")) {
            String[] split = action.split(";");
            String str = split[1];
            int parseInt = Integer.parseInt(split[2]);
            RemoteViews remoteViews = (RemoteViews) f3782b.get("" + parseInt);
            RemoteViews remoteViews2 = remoteViews == null ? new RemoteViews(context.getPackageName(), 2130903168) : remoteViews;
            action = (String) f3781a.get("" + parseInt);
            String replaceAll = (action == null || action.indexOf("%") == -1) ? action : action.replaceAll("%", "\u00d70.01");
            if (str.equals("=")) {
                try {
                    char[] cArr = new char[]{'*', '/'};
                    char[] cArr2 = new char[]{'\u00d7', '\u00f7'};
                    for (int length = cArr2.length - 1; length >= 0; length--) {
                        replaceAll = replaceAll.replace(cArr2[length], cArr[length]);
                    }
                    double a = new C0406i().m3924a(replaceAll);
                    if (a >= 0.0d) {
                        f3783c = aba.m3746a(a);
                    } else {
                        f3783c = "-" + aba.m3746a(Math.abs(a));
                    }
                    remoteViews2.setTextViewText(2131558496, f3783c);
                } catch (Exception e) {
                }
            } else if (str.equals("C")) {
                if (action == null || action.equals("")) {
                    remoteViews2.setTextViewText(2131558428, "");
                    remoteViews2.setTextViewText(2131558496, "");
                } else {
                    r0 = action.substring(0, action.length() - 1);
                    remoteViews2.setTextViewText(2131558428, r0);
                    f3781a.put("" + parseInt, r0);
                }
            } else if (str.equals("AC")) {
                remoteViews2.setTextViewText(2131558428, "");
                remoteViews2.setTextViewText(2131558496, "");
                f3781a = new HashMap();
                f3783c = "";
            } else {
                if (action != null) {
                    r0 = action + str;
                } else {
                    Object obj = str;
                }
                f3781a.put("" + parseInt, r0);
                remoteViews2.setTextViewText(2131558428, r0);
            }
            f3783c = f3783c.replaceAll(",", "");
            Intent intent2 = new Intent(context, ExpenseNewTransaction.class);
            intent2.putExtra("amount", f3783c);
            remoteViews2.setOnClickPendingIntent(2131559069, PendingIntent.getActivity(context, parseInt, intent2, 134217728));
            AppWidgetManager.getInstance(context).updateAppWidget(parseInt, remoteViews2);
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        f3781a = new HashMap();
        f3782b = new HashMap();
        for (int a : iArr) {
            try {
                m3736a(context, appWidgetManager, a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
