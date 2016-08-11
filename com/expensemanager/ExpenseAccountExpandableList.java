package com.expensemanager;

import android.app.Activity;
import android.app.ExpandableListActivity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.C0607c;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseAccountExpandableList extends ExpandableListActivity {
    List<Map<String, String>> f2728a;
    List<List<Map<String, String>>> f2729b;
    private Context f2730c;

    public ExpenseAccountExpandableList() {
        this.f2730c = this;
    }

    public static String m2638a(ro roVar, String str, List<Map<String, String>> list, List<List<Map<String, String>>> list2) {
        double d = 0.0d;
        roVar.m4193a();
        Cursor a = roVar.m4192a(str, "expensed DESC");
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        Map hashMap3 = new HashMap();
        if (a != null && a.moveToFirst()) {
            int columnIndex = a.getColumnIndex("_id");
            int columnIndex2 = a.getColumnIndex("account");
            int columnIndex3 = a.getColumnIndex("amount");
            int columnIndex4 = a.getColumnIndex("category");
            int columnIndex5 = a.getColumnIndex("subcategory");
            int columnIndex6 = a.getColumnIndex("payment_method");
            int columnIndex7 = a.getColumnIndex("description");
            int columnIndex8 = a.getColumnIndex("reference_number");
            int columnIndex9 = a.getColumnIndex("property");
            int columnIndex10 = a.getColumnIndex("status");
            int columnIndex11 = a.getColumnIndex("property2");
            int columnIndex12 = a.getColumnIndex("expensed");
            double d2 = 0.0d;
            while (true) {
                List list3;
                Map hashMap4;
                String str2 = "" + a.getLong(columnIndex);
                String string = a.getString(columnIndex2);
                String string2 = a.getString(columnIndex3);
                String string3 = a.getString(columnIndex4);
                String string4 = a.getString(columnIndex5);
                String string5 = a.getString(columnIndex6);
                String string6 = a.getString(columnIndex7);
                String string7 = a.getString(columnIndex8);
                String string8 = a.getString(columnIndex9);
                String string9 = a.getString(columnIndex10);
                String string10 = a.getString(columnIndex11);
                long j = a.getLong(columnIndex12);
                String str3 = (string2 == null || "".equals(string2)) ? "0" : string2;
                String str4 = !"Income".equalsIgnoreCase(string3) ? "-" + str3 : str3;
                Map hashMap5 = new HashMap();
                if (hashMap2.get(string) == null) {
                    hashMap2.put(string, str4);
                    hashMap5.put("account", string);
                    list.add(hashMap5);
                    hashMap.put(string, hashMap5);
                    ArrayList arrayList = new ArrayList();
                    list2.add(arrayList);
                    hashMap3.put(string, arrayList);
                } else {
                    hashMap2.put(string, "" + aba.m3743a((String) hashMap2.get(string), str4));
                }
                hashMap5 = (Map) hashMap.get(string);
                if (hashMap2.get(string) != null) {
                    if (((String) hashMap2.get(string)).startsWith("-")) {
                        hashMap5.put("accountTotal", aba.m3767b((String) hashMap2.get(string)));
                        hashMap5.remove("accountTotalPositive");
                        list3 = (List) hashMap3.get(string);
                        if (list3 != null) {
                            hashMap4 = new HashMap();
                            hashMap4.put("rowId", str2);
                            hashMap4.put("expenseDate", aba.m3749a(j, ExpenseManager.f3244t));
                            hashMap4.put("account", string);
                            if ("Income".equalsIgnoreCase(string3)) {
                                hashMap4.put("amount", "-" + aba.m3767b(string2));
                            } else {
                                hashMap4.put("amount", "+" + aba.m3767b(string2));
                            }
                            hashMap4.put("category", string3 + ":" + string4);
                            hashMap4.put("paymentMethod", string5);
                            hashMap4.put("description", string6);
                            hashMap4.put("referenceNumber", string7);
                            hashMap4.put("property", string8);
                            hashMap4.put("status", string9);
                            hashMap4.put("property2", string10);
                            list3.add(hashMap4);
                        }
                        d = aba.m3742a(d2, string2);
                        if (!a.moveToNext()) {
                            break;
                        }
                        d2 = d;
                    }
                }
                hashMap5.put("accountTotalPositive", aba.m3767b((String) hashMap2.get(string)));
                hashMap5.remove("accountTotal");
                list3 = (List) hashMap3.get(string);
                if (list3 != null) {
                    hashMap4 = new HashMap();
                    hashMap4.put("rowId", str2);
                    hashMap4.put("expenseDate", aba.m3749a(j, ExpenseManager.f3244t));
                    hashMap4.put("account", string);
                    if ("Income".equalsIgnoreCase(string3)) {
                        hashMap4.put("amount", "+" + aba.m3767b(string2));
                    } else {
                        hashMap4.put("amount", "-" + aba.m3767b(string2));
                    }
                    hashMap4.put("category", string3 + ":" + string4);
                    hashMap4.put("paymentMethod", string5);
                    hashMap4.put("description", string6);
                    hashMap4.put("referenceNumber", string7);
                    hashMap4.put("property", string8);
                    hashMap4.put("status", string9);
                    hashMap4.put("property2", string10);
                    list3.add(hashMap4);
                }
                d = aba.m3742a(d2, string2);
                if (!a.moveToNext()) {
                    break;
                }
                d2 = d;
            }
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
        return aba.m3746a(d);
    }

    private void m2639a() {
        StringBuffer append;
        String str;
        int i = 0;
        StringBuffer append2 = new StringBuffer("<html><head><title>").append(getResources().getString(2131099725) + "</title></head>");
        while (i < this.f2728a.size()) {
            StringBuffer append3 = ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(append2.append("<p><b>" + getResources().getString(2131099678) + ": " + ((String) ((Map) this.f2728a.get(i)).get("account")) + ": " + ((String) ((Map) this.f2728a.get(i)).get("accountTotal")) + "</b></p>").append("<hr><table cellpadding=0 cellspacing=0 style=border-collapse: collapse width=100%><tr>"), true, getResources().getString(2131099794), 0, "10%", "BLACK", "left"), true, getResources().getString(2131099723), 0, "10%", "BLACK", "left"), true, getResources().getString(2131100007), 0, "12%", "BLACK", "left"), true, getResources().getString(2131100011), 0, "10%", "BLACK", "left"), true, getResources().getString(2131099755), 0, "20%", "BLACK", "left"), true, getResources().getString(2131100039), 0, "12%", "BLACK", "left"), true, getResources().getString(2131100101), 0, "8%", "BLACK", "left"), true, getResources().getString(2131099813), 0, "20%", "BLACK", "left").append("</tr></table><hr>").append("<table cellpadding=0 cellspacing=0 style=border-collapse: collapse width=100%>");
            List list = (List) this.f2729b.get(i);
            String str2 = "#FFFFFF";
            int i2 = 0;
            double d = 0.0d;
            while (i2 < list.size()) {
                Map map = (Map) list.get(i2);
                append = append3.append("<tr bgcolor=" + ((i2 / 2) * 2 == i2 ? "#FCF6CF" : "#FFFFFF") + " align=center>");
                String str3 = ((String) map.get("category")).toUpperCase().startsWith("INCOME") ? "GREEN" : "RED";
                str = (String) map.get("amount");
                String replace = (((String) map.get("category")).toUpperCase().startsWith("INCOME") || str.indexOf("(") == -1) ? str : str.replace("-", "").replace("(", "").replace(")", "");
                append3 = ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(append, false, (String) map.get("expenseDate"), 0, "10%", "BLACK", "left"), false, replace + "&nbsp;&nbsp;&nbsp;", 0, "10%", str3, "right"), false, (String) map.get("property"), 0, "12%", "BLACK", "left"), false, (String) map.get("paymentMethod"), 0, "10%", "BLACK", "left"), false, (String) map.get("category"), 0, "20%", "BLACK", "left"), false, (String) map.get("referenceNumber"), 0, "12%", "BLACK", "left"), false, (String) map.get("status"), 0, "8%", "BLACK", "left"), false, (String) map.get("description"), 0, "20%", "BLACK", "left").append("</tr>");
                i2++;
                d = aba.m3742a(d, replace.replaceAll(",", ""));
            }
            append3 = append3.append("</table>");
            str2 = "GREEN";
            String a = aba.m3746a(d);
            i++;
            append2 = ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(append3.append("<table bgcolor=#A4D1FF cellpadding=0 cellspacing=0 style=border-collapse: collapse width=100%><tr>"), true, "Total", 0, "10%", "BLACK", "center"), true, a + "&nbsp;&nbsp;&nbsp;", 0, "10%", a.trim().startsWith("(") ? "RED" : str2, "right"), true, "", 0, "12%", "BLACK", "center"), true, "", 0, "12%", "BLACK", "center"), true, "", 0, "20%", "BLACK", "center"), true, "", 0, "8%", "BLACK", "center"), true, "", 0, "8%", "BLACK", "center"), true, "", 0, "20%", "BLACK", "center").append("</tr></table>");
        }
        append = append2.append("</html>");
        str = getResources().getString(2131099725) + ".html";
        if (ExpenseExport.m3164a(co.f4430d, str, append.toString())) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("plain/text");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
            intent.putExtra("android.intent.extra.SUBJECT", getResources().getString(2131099725) + ":" + str);
            intent.putExtra("android.intent.extra.TEXT", getResources().getString(2131100054));
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(co.f4430d + "/" + str)));
            this.f2730c.startActivity(Intent.createChooser(intent, "Send mail..."));
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (-1 == i2 && i == 0) {
            onCreate(null);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        Drawable drawable = getExpandableListView().getResources().getDrawable(17301522);
        getExpandableListView().setDivider(drawable);
        getExpandableListView().setChildDivider(drawable);
        if (getIntent().getStringExtra("title") != null) {
            setTitle(getIntent().getStringExtra("title"));
        }
        ro roVar = new ro(this);
        String stringExtra = getIntent().getStringExtra("whereClause");
        this.f2728a = new ArrayList();
        this.f2729b = new ArrayList();
        m2638a(roVar, stringExtra, this.f2728a, this.f2729b);
        Object c0446g = new C0446g(this, this.f2728a, 2130903100, new String[]{"account", "accountTotal", "accountTotalPositive"}, new int[]{2131558423, 2131558421, 2131558424}, this.f2729b, 2130903098, new String[]{"amount", "category", "expenseDate", "property", "paymentMethod", "description", "status"}, new int[]{2131558423, 2131558421, 2131558424, 2131558422, 2131558425, 2131558426, 2131558671});
        setListAdapter(c0446g);
        for (int i = 0; i < c0446g.getGroupCount(); i++) {
            getExpandableListView().expandGroup(i);
        }
        getExpandableListView().setOnChildClickListener(new fs(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 2, 0, 2131099869).setIcon(2130837600).setShowAsAction(2);
        menu.add(0, 0, 0, 2131099695).setIcon(2130837599).setShowAsAction(2);
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            setResult(-1, new Intent());
            finish();
        }
        return false;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                Bundle bundle = new Bundle();
                Intent intent = new Intent(this.f2730c, ExpenseNewTransaction.class);
                bundle.putString("account", getIntent().getStringExtra("account"));
                intent.putExtras(bundle);
                startActivityForResult(intent, 0);
                return true;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                m2639a();
                return true;
            case 16908332:
                dispatchKeyEvent(new KeyEvent(0, 4));
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
