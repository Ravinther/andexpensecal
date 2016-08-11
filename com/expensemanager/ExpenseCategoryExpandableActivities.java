package com.expensemanager;

import android.app.Activity;
import android.app.ExpandableListActivity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseCategoryExpandableActivities extends ExpandableListActivity {
    private Context f2987a;
    private ro f2988b;

    public ExpenseCategoryExpandableActivities() {
        this.f2987a = this;
    }

    private String m2904a(ro roVar, String str, List<Map<String, String>> list, List<List<Map<String, String>>> list2) {
        double d;
        int columnIndex;
        String string;
        ArrayList arrayList;
        double d2 = 0.0d;
        roVar.m4193a();
        Cursor a = roVar.m4192a(str, "category ASC");
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        Map hashMap3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        String str2 = "";
        if (a == null || !a.moveToFirst()) {
            d = 0.0d;
            String str3 = str2;
        } else {
            String string2;
            double a2;
            int columnIndex2 = a.getColumnIndex("account");
            columnIndex = a.getColumnIndex("amount");
            int columnIndex3 = a.getColumnIndex("category");
            int columnIndex4 = a.getColumnIndex("subcategory");
            while (true) {
                string2 = a.getString(columnIndex2);
                string = a.getString(columnIndex);
                String string3 = a.getString(columnIndex3);
                String string4 = a.getString(columnIndex4);
                if (hashMap.get(string3) == null) {
                    hashMap.put(string3, aba.m3781g(string));
                    arrayList2.add(string3);
                } else {
                    hashMap.put(string3, "" + aba.m3743a((String) hashMap.get(string3), string));
                }
                String str4 = string3 + ":" + string4;
                if (hashMap2.get(str4) == null) {
                    hashMap2.put(str4, aba.m3781g(string));
                } else {
                    hashMap2.put(str4, "" + aba.m3743a((String) hashMap2.get(str4), string));
                }
                if (hashMap3.get(string3) == null) {
                    arrayList = new ArrayList();
                    arrayList.add(string4);
                    hashMap3.put(string3, arrayList);
                } else {
                    arrayList = (ArrayList) hashMap3.get(string3);
                    if (!arrayList.contains(string4)) {
                        arrayList.add(string4);
                    }
                }
                a2 = !"Income".equalsIgnoreCase(string3) ? aba.m3742a(d2, string) : d2;
                if (!a.moveToNext()) {
                    break;
                }
                d2 = a2;
            }
            Object obj = string2;
            d = a2;
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            Map hashMap4 = new HashMap();
            String a3 = aib.m3853a((String) arrayList2.get(i));
            str2 = aib.m3853a((String) hashMap.get(a3));
            if ("".equals(str2)) {
                str2 = "0";
            }
            str2 = aba.m3767b(str2);
            Object obj2 = "Income".equalsIgnoreCase(a3) ? "+" + str2 : "-" + str2;
            String str5 = aib.m3850a((Math.abs(aib.m3877i(obj2)) / d) * 100.0d) + "%";
            if (!"Income".equalsIgnoreCase(a3)) {
                obj2 = obj2 + " | " + str5;
            }
            hashMap4.put("category", a3);
            hashMap4.put("amount", obj2);
            hashMap4.put("account", obj);
            list.add(hashMap4);
            arrayList = (ArrayList) hashMap3.get(a3);
            List arrayList3 = new ArrayList();
            columnIndex = 0;
            while (arrayList != null && columnIndex < arrayList.size()) {
                HashMap hashMap5 = new HashMap();
                string = (String) arrayList.get(columnIndex);
                hashMap5.put("subcategory", string);
                string = (String) hashMap2.get(a3 + ":" + string);
                hashMap5.put("amount", "Income".equalsIgnoreCase(a3) ? "+" + aba.m3767b(string) : "-" + aba.m3767b(string));
                arrayList3.add(hashMap5);
                columnIndex++;
            }
            list2.add(arrayList3);
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
        return aba.m3746a(d);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        this.f2988b = new ro(this);
        Drawable drawable = getExpandableListView().getResources().getDrawable(17301522);
        getExpandableListView().setDivider(drawable);
        getExpandableListView().setChildDivider(drawable);
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        String stringExtra = getIntent().getStringExtra("account");
        String str = "account='" + stringExtra + "'";
        if ("All".equals(stringExtra)) {
            str = null;
        }
        m2904a(this.f2988b, str, arrayList, arrayList2);
        setListAdapter(new C0446g(this, arrayList, 2130903099, new String[]{"category", "amount"}, new int[]{2131558423, 2131558421}, arrayList2, 2130903101, new String[]{"subcategory", "amount"}, new int[]{2131558423, 2131558421}));
        getExpandableListView().setOnChildClickListener(new mr(this, arrayList, arrayList2, stringExtra));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
