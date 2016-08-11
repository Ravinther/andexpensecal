package com.expensemanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService.RemoteViewsFactory;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class aif implements RemoteViewsFactory {
    private Context f4145a;
    private String f4146b;
    private List<String> f4147c;
    private List<String> f4148d;
    private List<String> f4149e;
    private List<String> f4150f;
    private List<String> f4151g;
    private String f4152h;
    private int f4153i;
    private List<Map<String, String>> f4154j;
    private List<String> f4155k;
    private List<Map<String, String>> f4156l;
    private List<Map<String, String>> f4157m;
    private List<Map<String, String>> f4158n;
    private List<Map<String, String>> f4159o;
    private List<Map<String, String>> f4160p;

    public aif(Context context, Intent intent) {
        this.f4145a = null;
        this.f4147c = new ArrayList();
        this.f4148d = new ArrayList();
        this.f4149e = new ArrayList();
        this.f4150f = new ArrayList();
        this.f4151g = new ArrayList();
        this.f4152h = "0";
        this.f4153i = 0;
        this.f4145a = context;
        ro roVar = new ro(this.f4145a);
        this.f4152h = intent.getStringExtra("period");
        this.f4153i = intent.getIntExtra("counter", 0);
        this.f4146b = intent.getStringExtra("dateRange");
        this.f4156l = new ArrayList();
        this.f4157m = new ArrayList();
        this.f4158n = new ArrayList();
        this.f4159o = new ArrayList();
        this.f4160p = new ArrayList();
        WidgetProviderBudget.m3734a(context, roVar, this.f4156l, this.f4157m, this.f4158n, this.f4159o, this.f4160p);
        this.f4155k = new ArrayList();
        if ("0".equals(this.f4152h)) {
            long a = aba.m3744a(this.f4146b, ExpenseManager.f3244t, Locale.US);
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(a);
            instance.set(11, 0);
            long timeInMillis = instance.getTimeInMillis();
            instance.set(11, 23);
            instance.set(12, 59);
            instance.set(13, 59);
            String str = "expensed>=" + timeInMillis + " AND " + "expensed" + "<=" + instance.getTimeInMillis() + " and " + "category" + "!='Income'";
            this.f4154j = ExpenseBudgetList.m2831a(this.f4157m, (int) (a / 1000), 0);
            ExpenseBudgetList.m2835a(roVar, str, this.f4154j, this.f4155k, this.f4147c);
            ExpenseBudgetList.m2836a(roVar, this.f4154j, (int) (a / 1000), 0);
        }
        if ("1".equals(this.f4152h)) {
            str = aba.m3747a(this.f4153i, "All", 2).replace("='null'", "!='null'");
            this.f4154j = ExpenseBudgetList.m2831a(this.f4158n, this.f4153i, 1);
            ExpenseBudgetList.m2835a(roVar, str, this.f4154j, this.f4155k, this.f4148d);
            ExpenseBudgetList.m2836a(roVar, this.f4154j, this.f4153i, 1);
        }
        if ("2".equals(this.f4152h)) {
            str = aba.m3764b(this.f4153i, "All", 2).replace("='null'", "!='null'");
            this.f4154j = ExpenseBudgetList.m2831a(this.f4159o, this.f4153i, 2);
            ExpenseBudgetList.m2835a(roVar, str, this.f4154j, this.f4155k, this.f4149e);
            ExpenseBudgetList.m2836a(roVar, this.f4154j, this.f4153i, 2);
        }
        if ("3".equals(this.f4152h)) {
            str = aba.m3771c(this.f4153i, "All", 2).replace("='null'", "!='null'");
            this.f4154j = ExpenseBudgetList.m2831a(this.f4160p, this.f4153i, 3);
            ExpenseBudgetList.m2835a(roVar, str, this.f4154j, this.f4155k, this.f4150f);
            ExpenseBudgetList.m2836a(roVar, this.f4154j, this.f4153i, 3);
        }
        if ("4".equals(this.f4152h)) {
            this.f4154j = ExpenseBudgetOnetimeList.m2895a(roVar);
            ExpenseBudgetOnetimeList.m2898a(roVar, this.f4154j, this.f4151g, this.f4155k);
        }
    }

    public int getCount() {
        return this.f4154j.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public RemoteViews getLoadingView() {
        return null;
    }

    public RemoteViews getViewAt(int i) {
        RemoteViews remoteViews = new RemoteViews(this.f4145a.getPackageName(), 2130903167);
        try {
            Map map = (Map) this.f4154j.get(i);
            if (map != null) {
                Object string;
                String str = (String) map.get("category");
                String string2 = ("All".equalsIgnoreCase(str) || "All-1".equalsIgnoreCase(str)) ? this.f4145a.getResources().getString(2131099720) : str;
                str = (String) map.get("subcategory");
                String string3 = "All".equalsIgnoreCase(str) ? this.f4145a.getResources().getString(2131099721) : str;
                str = (String) map.get("account");
                if ("All".equalsIgnoreCase(str)) {
                    string = this.f4145a.getResources().getString(2131099719);
                } else {
                    String str2 = str;
                }
                str = (String) map.get("amount");
                String[] split = ((String) map.get("property")).replace(";NO", "").split(";");
                String str3 = "";
                if (split.length > 0 && !"".equals(split[0])) {
                    str3 = aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, split[0]) + " - ";
                }
                if (split.length > 1 && !"".equals(split[1])) {
                    str3 = str3 + aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, split[1]);
                }
                String str4 = (String) map.get("property2");
                String str5 = (String) map.get("property3");
                Object obj = (String) map.get("description");
                CharSequence charSequence = string2 + ":" + string3;
                if ("".equals(string2)) {
                    charSequence = this.f4145a.getResources().getString(2131099720);
                }
                if (str4 == null || "".equals(str4)) {
                    str4 = str3;
                } else if (!"".equals(str3)) {
                    str4 = str3 + ";" + str4;
                }
                if (!(str5 == null || "".equals(str5))) {
                    str4 = "".equals(str4) ? str5 : str4 + ";" + str5;
                }
                if (obj == null || "".equals(obj)) {
                    String str6 = str4;
                } else if (!"".equals(str4)) {
                    obj = str4 + ";" + obj;
                }
                str4 = (String) this.f4155k.get(i);
                if (str4 == null) {
                    str4 = "0.00";
                }
                str4 = str4.replaceAll(",", "");
                CharSequence a = aba.m3746a(aba.m3743a(str, "-" + str4));
                CharSequence charSequence2 = aba.m3767b(str4) + "/" + aba.m3767b(str);
                if (a == null || !a.startsWith("(")) {
                    remoteViews.setTextColor(2131558421, -16711936);
                } else {
                    remoteViews.setTextColor(2131558421, -65536);
                }
                int a2 = lw.m4151a(str4, str);
                remoteViews.setTextViewText(2131558423, string);
                remoteViews.setTextViewText(2131558421, a);
                remoteViews.setTextViewText(2131558424, charSequence);
                remoteViews.setTextViewText(2131558422, charSequence2);
                remoteViews.setTextViewText(2131558425, obj);
                if ("".equals(obj.trim())) {
                    remoteViews.setViewVisibility(2131558425, 8);
                }
                remoteViews.setProgressBar(2131558427, 100, a2, false);
                remoteViews.setProgressBar(2131559080, 100, a2, false);
                if (a2 < 100) {
                    remoteViews.setViewVisibility(2131558427, 0);
                    remoteViews.setViewVisibility(2131559080, 8);
                    remoteViews.setTextColor(2131558426, -16711936);
                } else {
                    remoteViews.setViewVisibility(2131558427, 8);
                    remoteViews.setViewVisibility(2131559080, 0);
                    remoteViews.setTextColor(2131558426, -65536);
                }
                if (a2 < 0) {
                    remoteViews.setViewVisibility(2131558427, 8);
                    remoteViews.setViewVisibility(2131559080, 0);
                    remoteViews.setTextColor(2131558426, -65536);
                    remoteViews.setTextViewText(2131558426, ">100%");
                }
                if ("".equals(aib.m3865b((String) map.get("expired")))) {
                    remoteViews.setTextViewText(2131558426, a2 + "%");
                } else {
                    remoteViews.setTextViewText(2131558426, aib.m3865b((String) map.get("expired")));
                    remoteViews.setTextColor(2131558426, -65536);
                }
                str = "";
                if ("0".equals(this.f4152h)) {
                    str = (String) this.f4147c.get(i);
                }
                if ("1".equals(this.f4152h)) {
                    str = (String) this.f4148d.get(i);
                }
                if ("2".equals(this.f4152h)) {
                    str = (String) this.f4149e.get(i);
                }
                if ("3".equals(this.f4152h)) {
                    str = (String) this.f4150f.get(i);
                }
                if ("4".equals(this.f4152h)) {
                    str = (String) this.f4151g.get(i);
                }
                Bundle bundle = new Bundle();
                Intent intent = new Intent();
                bundle.putString("title", ((String) map.get("account")) + ":" + this.f4146b);
                bundle.putString("account", string);
                bundle.putString("whereClause", str);
                bundle.putInt("highlightId", 1);
                intent.putExtras(bundle);
                remoteViews.setOnClickFillInIntent(2131558643, intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return remoteViews;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    public void onCreate() {
    }

    public void onDataSetChanged() {
    }

    public void onDestroy() {
    }
}
