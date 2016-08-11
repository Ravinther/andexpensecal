package com.expensemanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService.RemoteViewsFactory;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ajf implements RemoteViewsFactory {
    private Context f4197a;
    private List<Map<String, Object>> f4198b;
    private String f4199c;
    private String f4200d;
    private String f4201e;
    private String f4202f;

    public ajf(Context context, Intent intent) {
        boolean z = true;
        this.f4197a = null;
        this.f4198b = new ArrayList();
        this.f4197a = context;
        ro roVar = new ro(this.f4197a);
        this.f4201e = intent.getStringExtra("fromDate");
        this.f4202f = intent.getStringExtra("toDate");
        this.f4199c = intent.getStringExtra("summaryType");
        this.f4200d = intent.getStringExtra("account");
        String stringExtra = intent.getStringExtra("orderBy");
        String stringExtra2 = intent.getStringExtra("itemWhereClause");
        boolean z2 = !"".equals(this.f4200d) && this.f4200d.split(",").length > 1;
        ExpenseAccountSummary.m2681a(roVar, stringExtra2, this.f4198b, this.f4199c, stringExtra, z2);
        if (!"Income".equalsIgnoreCase(this.f4199c)) {
            z = false;
        }
        this.f4198b = abd.m3801a(this.f4198b, z, "name");
        if (this.f4198b == null || this.f4198b.size() == 0) {
            this.f4198b = new ArrayList();
            Map hashMap = new HashMap();
            hashMap.put("name", "No data available");
            this.f4198b.add(hashMap);
        }
    }

    public int getCount() {
        return this.f4198b.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public RemoteViews getLoadingView() {
        return null;
    }

    public RemoteViews getViewAt(int i) {
        RemoteViews remoteViews = new RemoteViews(this.f4197a.getPackageName(), 2130903175);
        Map map = (Map) this.f4198b.get(i);
        remoteViews.setTextViewText(2131558423, (String) map.get("name"));
        remoteViews.setTextViewText(2131558421, (String) map.get("expense"));
        remoteViews.setTextViewText(2131558424, (String) map.get("income"));
        String str = (String) map.get("name");
        String replace = str != null ? str.replace("'", "''") : str;
        try {
            str = "account in (" + abd.m3792a(this.f4200d) + ")";
            if ("Income".equalsIgnoreCase(this.f4199c)) {
                str = str + " AND " + "subcategory" + "='" + replace + "' AND " + "category" + "='Income'";
            } else if ("subcategory".equalsIgnoreCase(this.f4199c)) {
                String[] split = replace.split(":");
                if (split.length > 0) {
                    str = str + " AND " + "category" + "='" + split[0] + "'";
                }
                if (split.length > 1 && !"".equals(split[1].trim())) {
                    str = str + " AND " + "subcategory" + "='" + split[1] + "'";
                }
            } else {
                str = str + " AND " + this.f4199c + "='" + replace + "' AND " + "category" + "!='Income' ";
            }
            DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
            Date parse = simpleDateFormat.parse(this.f4201e);
            Date parse2 = simpleDateFormat.parse(this.f4202f);
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(parse.getTime());
            instance.set(11, 0);
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(parse2.getTime());
            instance2.set(11, 23);
            instance2.set(12, 59);
            str = (str + " AND " + "expensed" + ">=" + instance.getTimeInMillis()) + " AND " + "expensed" + "<=" + instance2.getTimeInMillis();
            Bundle bundle = new Bundle();
            Intent intent = new Intent();
            bundle.putString("title", replace + ":" + this.f4201e + " - " + this.f4202f);
            bundle.putString("account", this.f4200d);
            bundle.putString("whereClause", str);
            bundle.putInt("highlightId", 1);
            intent.putExtras(bundle);
            remoteViews.setOnClickFillInIntent(2131558643, intent);
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
