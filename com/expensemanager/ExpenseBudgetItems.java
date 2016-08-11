package com.expensemanager;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseBudgetItems extends ListActivity {
    Context f2916a;
    String f2917b;
    private ro f2918c;

    public ExpenseBudgetItems() {
        this.f2916a = this;
        this.f2917b = "";
    }

    private ArrayList<Map<String, Object>> m2826a(Context context, ro roVar) {
        Collection arrayList = new ArrayList();
        ArrayList<Map<String, Object>> arrayList2 = new ArrayList();
        Resources resources = context.getResources();
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        Cursor e = roVar.m4207e(null, "frequency ASC");
        if (e == null || e.getCount() == 0) {
            Toast.makeText(context, resources.getString(2131099691), 1).show();
            return null;
        }
        if (e != null && e.moveToFirst()) {
            int columnIndex = e.getColumnIndex("_id");
            int columnIndex2 = e.getColumnIndex("account");
            int columnIndex3 = e.getColumnIndex("amount");
            int columnIndex4 = e.getColumnIndex("category");
            int columnIndex5 = e.getColumnIndex("subcategory");
            int columnIndex6 = e.getColumnIndex("alert");
            int columnIndex7 = e.getColumnIndex("description");
            int columnIndex8 = e.getColumnIndex("frequency");
            int columnIndex9 = e.getColumnIndex("property");
            int columnIndex10 = e.getColumnIndex("property2");
            int columnIndex11 = e.getColumnIndex("property3");
            do {
                try {
                    Object string;
                    String str = "" + e.getLong(columnIndex);
                    String string2 = e.getString(columnIndex2);
                    String string3 = e.getString(columnIndex3);
                    String string4 = e.getString(columnIndex4);
                    String string5 = e.getString(columnIndex5);
                    String string6 = e.getString(columnIndex7);
                    String string7 = e.getString(columnIndex8);
                    String string8 = e.getString(columnIndex9);
                    String b = columnIndex10 != -1 ? aib.m3865b(e.getString(columnIndex10)) : "";
                    String b2 = columnIndex11 != -1 ? aib.m3865b(e.getString(columnIndex11)) : "";
                    String string9 = e.getString(columnIndex6);
                    if ("All".equalsIgnoreCase(string2)) {
                        string = context.getResources().getString(2131099719);
                    } else {
                        String str2 = string2;
                    }
                    if ("All-1".equalsIgnoreCase(string4)) {
                        string4 = string4.replace("All-1", "All");
                    }
                    string2 = "All".equalsIgnoreCase(string4) ? context.getResources().getString(2131099720) : string4;
                    HashMap hashMap = new HashMap();
                    hashMap.put("rowId", str);
                    hashMap.put("account", string);
                    hashMap.put("category", string2);
                    hashMap.put("subcategory", string5);
                    hashMap.put("frequency", string7);
                    hashMap.put("amount", string3);
                    hashMap.put("originalAmount", string3);
                    hashMap.put("alert", string9);
                    hashMap.put("description", string6);
                    hashMap.put("property", string8);
                    hashMap.put("property2", b);
                    hashMap.put("property3", b2);
                    Object obj = "";
                    if (!"".equals(string2)) {
                        obj = string2 + ":" + string5;
                    }
                    if (!"".equals(b)) {
                        obj = obj + ";" + b;
                    }
                    if (!"".equals(b2)) {
                        obj = obj + ";" + b2;
                    }
                    hashMap.put("cat", obj);
                    hashMap.put("period", (getResources().getString(2131100020) + "," + getResources().getString(2131099986)).split(",")[Integer.valueOf(string7).intValue()]);
                    if (!(string8 == null || "".equals(string8))) {
                        String[] split = string8.split(";");
                        obj = aib.m3867b(split[0], "yyyy-MM-dd", ExpenseManager.f3244t) + " - ";
                        if (!"".equals(split[1])) {
                            obj = obj + aib.m3867b(split[1], "yyyy-MM-dd", ExpenseManager.f3244t);
                        }
                        if ("YES".equalsIgnoreCase(split[2])) {
                            obj = obj + "; " + getResources().getString(2131100063);
                        }
                        hashMap.put("date", obj);
                        if ("".equals(split[1])) {
                            hashMap.put("expired", "");
                        } else {
                            if (new Date().after(new SimpleDateFormat("yyyy-MM-dd").parse(split[1]))) {
                                hashMap.put("expired", getResources().getString(2131099890));
                            } else {
                                hashMap.put("expired", "");
                            }
                        }
                    }
                    if (hashMap.get("expired") != null) {
                        if (!"".equals(hashMap.get("expired"))) {
                            arrayList.add(hashMap);
                        }
                    }
                    arrayList2.add(hashMap);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } while (e.moveToNext());
            arrayList2.addAll(arrayList);
        }
        if (e != null) {
            e.close();
        }
        roVar.m4201b();
        return arrayList2;
    }

    private void m2828a(Map<?, ?> map) {
        if (map == null) {
            startActivityForResult(new Intent(this, ExpenseBudgetAdd.class), 0);
            return;
        }
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.f2916a, ExpenseBudgetAdd.class);
        bundle.putString("rowId", aib.m3852a(map.get("rowId")));
        bundle.putString("category", aib.m3852a(map.get("category")));
        bundle.putString("account", aib.m3852a(map.get("account")));
        bundle.putString("amount", aib.m3852a(map.get("originalAmount")));
        bundle.putString("alertAmount", aib.m3852a(map.get("alert")));
        bundle.putString("subcategory", aib.m3852a(map.get("subcategory")));
        bundle.putString("property", aib.m3852a(map.get("property")));
        bundle.putString("property2", aib.m3852a(map.get("property2")));
        bundle.putString("property3", aib.m3852a(map.get("property3")));
        bundle.putBoolean("isNew", false);
        bundle.putInt("period", Integer.valueOf((String) map.get("frequency")).intValue());
        Intent intent2 = "4".equals((String) map.get("frequency")) ? new Intent(this.f2916a, ExpenseBudgetOnetimeAdd.class) : intent;
        intent2.putExtras(bundle);
        startActivityForResult(intent2, 0);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (-1 == i2) {
            onCreate(null);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        this.f2918c = new ro(this);
        List a = m2826a((Context) this, this.f2918c);
        if (a != null) {
            setListAdapter(new cl(this, a, 2130903088, new String[]{"account", "amount", "cat", "period", "date", "expired"}, new int[]{2131558423, 2131558421, 2131558424, 2131558422, 2131558425, 2131558426}));
            getListView().setOnItemClickListener(new le(this));
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
