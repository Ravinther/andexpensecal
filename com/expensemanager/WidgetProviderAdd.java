package com.expensemanager;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.Toast;
import com.expensemanager.calculator.C0406i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WidgetProviderAdd extends AppWidgetProvider {
    static HashMap<String, String> f3758a;
    static HashMap<String, RemoteViews> f3759b;
    static String f3760c;
    static int f3761d;
    static String[] f3762e;
    static int f3763f;
    static String[] f3764g;
    static int f3765h;
    static String[] f3766i;
    static List<String> f3767j;
    static int f3768k;
    static String[] f3769l;
    static int f3770m;
    static String f3771n;
    static String f3772o;
    static String f3773p;
    static String f3774q;
    static String f3775r;
    static String f3776s;

    static {
        f3760c = "";
        f3761d = 0;
        f3763f = 0;
        f3765h = 0;
        f3768k = 0;
        f3770m = 0;
        f3772o = "Cleared";
        f3773p = "";
        f3774q = "Uncategorized";
        f3775r = "";
        f3776s = "Cash";
    }

    private static PendingIntent m3728a(Context context, String str, int i) {
        Intent intent = new Intent(context, WidgetProviderAdd.class);
        intent.setAction("calc;" + str + ";" + i);
        return PendingIntent.getBroadcast(context, 0, intent, 0);
    }

    static void m3729a(Context context, AppWidgetManager appWidgetManager, int i) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2130903165);
        f3759b.put("" + i, remoteViews);
        remoteViews.setOnClickPendingIntent(2131558442, m3728a(context, "0", i));
        remoteViews.setOnClickPendingIntent(2131558438, m3728a(context, "1", i));
        remoteViews.setOnClickPendingIntent(2131558439, m3728a(context, "2", i));
        remoteViews.setOnClickPendingIntent(2131558440, m3728a(context, "3", i));
        remoteViews.setOnClickPendingIntent(2131558434, m3728a(context, "4", i));
        remoteViews.setOnClickPendingIntent(2131558435, m3728a(context, "5", i));
        remoteViews.setOnClickPendingIntent(2131558436, m3728a(context, "6", i));
        remoteViews.setOnClickPendingIntent(2131558430, m3728a(context, "7", i));
        remoteViews.setOnClickPendingIntent(2131558431, m3728a(context, "8", i));
        remoteViews.setOnClickPendingIntent(2131558432, m3728a(context, "9", i));
        remoteViews.setOnClickPendingIntent(2131558446, m3728a(context, context.getResources().getString(2131100018), i));
        remoteViews.setOnClickPendingIntent(2131558443, m3728a(context, context.getResources().getString(2131099832), i));
        remoteViews.setOnClickPendingIntent(2131558444, m3728a(context, context.getResources().getString(2131099878), i));
        remoteViews.setOnClickPendingIntent(2131558445, m3728a(context, context.getResources().getString(2131100027), i));
        remoteViews.setOnClickPendingIntent(2131558441, m3728a(context, context.getResources().getString(2131099955), i));
        remoteViews.setOnClickPendingIntent(2131558437, m3728a(context, context.getResources().getString(2131099969), i));
        remoteViews.setOnClickPendingIntent(2131558433, m3728a(context, context.getResources().getString(2131099830), i));
        remoteViews.setOnClickPendingIntent(2131558448, m3728a(context, "C", i));
        remoteViews.setOnClickPendingIntent(2131559070, m3728a(context, "AC", i));
        remoteViews.setOnClickPendingIntent(2131559067, m3728a(context, "PAYEE", i));
        remoteViews.setOnClickPendingIntent(2131559072, m3728a(context, "PAYMENT_METHOD", i));
        remoteViews.setOnClickPendingIntent(2131559073, m3728a(context, "STATUS", i));
        remoteViews.setOnClickPendingIntent(2131559071, m3728a(context, "CATEGORY", i));
        remoteViews.setOnClickPendingIntent(2131559074, m3728a(context, "ACCOUNT", i));
        remoteViews.setTextViewText(2131559074, context.getResources().getString(2131099678) + ": " + f3769l[0]);
        remoteViews.setOnClickPendingIntent(2131559068, m3728a(context, "SAVE", i));
        remoteViews.setOnClickPendingIntent(2131559062, PendingIntent.getActivity(context, i, new Intent(context, ExpenseManager.class), 134217728));
        f3776s = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getString(f3771n + "_" + "PAYMENT_METHOD_KEY", "Cash");
        remoteViews.setTextViewText(2131559065, f3776s);
        remoteViews.setTextViewText(2131559066, "Cleared");
        remoteViews.setOnClickPendingIntent(2131559069, PendingIntent.getActivity(context, i, new Intent(context, ExpenseNewTransaction.class), 134217728));
        appWidgetManager.updateAppWidget(i, remoteViews);
    }

    private void m3730a(Context context, RemoteViews remoteViews) {
        if (f3760c != null && !"".equals(f3760c)) {
            String str = f3760c;
            if (str != null) {
                str = str.replaceAll(",", "");
            }
            try {
                boolean z;
                Double.valueOf(str);
                ro roVar = new ro(context);
                roVar.m4193a();
                try {
                    if ("".equals(f3774q)) {
                        f3774q = "Uncategorized";
                    }
                    String[] split = f3774q.split(":");
                    String str2 = split[0];
                    String str3 = "";
                    if (split.length > 1) {
                        str3 = split[1];
                    }
                    Long valueOf = Long.valueOf(System.currentTimeMillis());
                    roVar.m4185a("expense_report", roVar.m4190a(f3771n, str, str2, str3, f3775r, "", "", f3773p, f3772o, "", "", "", "", "", "", valueOf.longValue(), valueOf.longValue()));
                    z = true;
                } catch (Exception e) {
                    e.printStackTrace();
                    z = false;
                }
                roVar.m4201b();
                if (z) {
                    Toast.makeText(context, 2131100066, 1).show();
                    abd.m3805a(context, z);
                    return;
                }
                Toast.makeText(context, 2131099715, 1).show();
            } catch (Exception e2) {
                e2.printStackTrace();
                Toast.makeText(context, context.getResources().getString(2131099715), 1).show();
            }
        }
    }

    private void m3731a(Context context, String str, RemoteViews remoteViews) {
        Map a = ExpenseAutoFillAddEdit.m2770a(new ro(context), "description='" + str + "'");
        if (a != null && a.size() > 0 && "YES".equalsIgnoreCase((String) a.get("property"))) {
            remoteViews.setTextViewText(2131559064, (CharSequence) a.get("categoryDisplay"));
            remoteViews.setTextViewText(2131559066, (CharSequence) a.get("status"));
            remoteViews.setTextViewText(2131559065, (CharSequence) a.get("paymentMethod"));
        }
    }

    private void m3732a(RemoteViews remoteViews, String str) {
        try {
            char[] cArr = new char[]{'*', '/'};
            char[] cArr2 = new char[]{'\u00d7', '\u00f7'};
            for (int length = cArr2.length - 1; length >= 0; length--) {
                str = str.replace(cArr2[length], cArr[length]);
            }
            double a = new C0406i().m3924a(str);
            if (a >= 0.0d) {
                f3760c = aba.m3746a(a);
            } else {
                f3760c = "-" + aba.m3746a(Math.abs(a));
            }
            remoteViews.setTextViewText(2131558496, f3760c);
        } catch (Exception e) {
        }
    }

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if (f3759b == null) {
            ComponentName componentName = new ComponentName(context, WidgetProvider.class);
            AppWidgetManager instance = AppWidgetManager.getInstance(context);
            onUpdate(context, instance, instance.getAppWidgetIds(componentName));
        }
        String action = intent.getAction();
        if (action != null && action.startsWith("calc")) {
            String[] split = action.split(";");
            String str = split[1];
            int parseInt = Integer.parseInt(split[2]);
            RemoteViews remoteViews = (RemoteViews) f3759b.get("" + parseInt);
            RemoteViews remoteViews2 = remoteViews == null ? new RemoteViews(context.getPackageName(), 2130903165) : remoteViews;
            action = (String) f3758a.get("" + parseInt);
            String replaceAll = (action == null || action.indexOf("%") == -1) ? action : action.replaceAll("%", "\u00d70.01");
            if (str.equals("=")) {
                m3732a(remoteViews2, replaceAll);
            } else if (str.equals("C")) {
                if (action == null || action.equals("")) {
                    remoteViews2.setTextViewText(2131558428, "");
                    remoteViews2.setTextViewText(2131558496, "");
                } else {
                    r0 = action.substring(0, action.length() - 1);
                    remoteViews2.setTextViewText(2131558428, r0);
                    f3758a.put("" + parseInt, r0);
                }
            } else if (str.equals("AC")) {
                remoteViews2.setTextViewText(2131558428, "");
                remoteViews2.setTextViewText(2131558496, "");
                remoteViews2.setTextViewText(2131559064, "Uncategorized");
                remoteViews2.setTextViewText(2131559063, "");
                remoteViews2.setTextViewText(2131559065, f3776s);
                remoteViews2.setTextViewText(2131559066, "Cleared");
                f3758a = new HashMap();
                f3760c = "";
                f3774q = "Uncategorized";
                f3775r = f3776s;
                f3773p = "";
                f3772o = "Cleared";
            } else if (str.equals("PAYEE")) {
                if (f3762e != null && f3762e.length > 0) {
                    if (f3761d >= f3762e.length) {
                        f3761d = 0;
                    }
                    f3773p = f3762e[f3761d];
                    remoteViews2.setTextViewText(2131559063, f3762e[f3761d]);
                    f3761d++;
                    m3731a(context, f3773p, remoteViews2);
                    m3732a(remoteViews2, replaceAll);
                }
            } else if (str.equals("PAYMENT_METHOD")) {
                if (f3764g != null && f3764g.length > 0) {
                    if (f3763f >= f3764g.length) {
                        f3763f = 0;
                    }
                    f3775r = f3764g[f3763f];
                    remoteViews2.setTextViewText(2131559065, f3764g[f3763f]);
                    f3763f++;
                    m3732a(remoteViews2, replaceAll);
                }
            } else if (str.equals("STATUS")) {
                if (f3766i != null && f3766i.length > 0) {
                    if (f3765h >= f3766i.length) {
                        f3765h = 0;
                    }
                    f3772o = f3766i[f3765h];
                    remoteViews2.setTextViewText(2131559066, f3766i[f3765h]);
                    f3765h++;
                    m3732a(remoteViews2, replaceAll);
                }
            } else if (str.equals("CATEGORY")) {
                if (f3767j != null && f3767j.size() > 0) {
                    if (f3768k >= f3767j.size()) {
                        f3768k = 0;
                    }
                    f3774q = (String) f3767j.get(f3768k);
                    remoteViews2.setTextViewText(2131559064, (CharSequence) f3767j.get(f3768k));
                    f3768k++;
                    m3732a(remoteViews2, replaceAll);
                }
            } else if (str.equals("ACCOUNT")) {
                if (f3769l != null && f3769l.length > 0) {
                    f3770m++;
                    if (f3770m >= f3769l.length) {
                        f3770m = 0;
                    }
                    f3771n = f3769l[f3770m];
                    remoteViews2.setTextViewText(2131559074, context.getResources().getString(2131099678) + ": " + f3769l[f3770m]);
                    m3732a(remoteViews2, replaceAll);
                }
            } else if (str.equals("SAVE")) {
                m3732a(remoteViews2, replaceAll);
                m3730a(context, remoteViews2);
            } else {
                if (action != null) {
                    r0 = action + str;
                } else {
                    Object obj = str;
                }
                f3758a.put("" + parseInt, r0);
                remoteViews2.setTextViewText(2131558428, r0);
            }
            f3760c = f3760c.replaceAll(",", "");
            Intent intent2 = new Intent(context, ExpenseNewTransaction.class);
            intent2.putExtra("amount", f3760c);
            intent2.putExtra("account", f3771n);
            intent2.putExtra("payee", f3773p);
            intent2.putExtra("category", f3774q);
            intent2.putExtra("paymentMethod", f3775r);
            intent2.putExtra("status", f3772o);
            intent2.putExtra("fromWhere", "widgetAdd");
            remoteViews2.setOnClickPendingIntent(2131559069, PendingIntent.getActivity(context, parseInt, intent2, 134217728));
            AppWidgetManager.getInstance(context).updateAppWidget(parseInt, remoteViews2);
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        int i = 0;
        ro roVar = new ro(context);
        f3762e = abd.m3786a(context, roVar, "PAYEE_LIST", aib.m3868b(ExpensePayList.f3360a, ",")).split(",");
        f3764g = abd.m3786a(context, roVar, "PAYMENT_METHOD_KEY", aib.m3868b(context.getResources().getString(2131100012).split(","), ",")).split(",");
        f3766i = abd.m3786a(context, roVar, "TRANSACTION_STATUS_KEY", aib.m3868b(context.getResources().getString(2131100103).split(","), ",")).split(",");
        String a = abd.m3786a(context, roVar, "MY_ACCOUNT_NAMES", "Personal Expense");
        f3769l = a.split(",");
        f3771n = f3769l[0];
        f3767j = abd.m3797a(roVar, a);
        if (f3767j == null || f3767j.size() == 0) {
            f3767j.add("Uncategorized");
        }
        if (!f3767j.contains("Uncategorized")) {
            f3767j.add(0, "Uncategorized");
        }
        f3758a = new HashMap();
        f3759b = new HashMap();
        int length = iArr.length;
        while (i < length) {
            try {
                m3729a(context, appWidgetManager, iArr[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
