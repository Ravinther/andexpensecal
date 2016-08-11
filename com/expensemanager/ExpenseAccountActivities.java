package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Telephony.Sms;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ExpenseAccountActivities extends Activity {
    static int f2704a;
    public static boolean f2705e;
    private static String f2706o;
    String f2707b;
    MenuItem f2708c;
    Spinner f2709d;
    private ro f2710f;
    private String f2711g;
    private Context f2712h;
    private String f2713i;
    private String f2714j;
    private ListView f2715k;
    private List<Map<String, Object>> f2716l;
    private ArrayList<String> f2717m;
    private String[] f2718n;

    static {
        f2704a = 0;
        f2706o = "expensed ASC";
        f2705e = false;
    }

    public ExpenseAccountActivities() {
        this.f2711g = "Personal Expense";
        this.f2712h = this;
        this.f2713i = "";
        this.f2714j = "";
        this.f2717m = new ArrayList();
        this.f2707b = "";
        this.f2718n = new String[]{"expensed", "category", "property", "payment_method", "status", "description", "amount", "amount", "property2", "reference_number"};
    }

    private LinearLayout m2600a(String str, String[] strArr) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(5, 5, 5, 5);
        CharSequence valueOf = SpannableString.valueOf(getResources().getText(2131100159));
        valueOf.setSpan(new StyleSpan(2), 0, valueOf.length(), 0);
        View textView = new TextView(this);
        textView.setText(valueOf);
        textView.setTextSize(14.0f);
        textView.setPadding(0, 5, 0, 5);
        View textView2 = new TextView(this);
        textView2.setText(2131099974);
        textView2.setTextSize(18.0f);
        this.f2709d = new Spinner(this);
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 17367048, strArr);
        arrayAdapter.setDropDownViewResource(17367049);
        this.f2709d.setAdapter(arrayAdapter);
        linearLayout.addView(textView, new LayoutParams(-1, -2));
        linearLayout.addView(textView2, new LayoutParams(-1, -2));
        linearLayout.addView(this.f2709d, new LayoutParams(-1, -2));
        return linearLayout;
    }

    public static String m2602a(ro roVar, String str, List<Map<String, Object>> list, boolean z, String str2) {
        StringBuffer stringBuffer = new StringBuffer("\ufeff");
        String str3 = ",";
        if (z) {
            str3 = abd.m3786a(null, roVar, "csv_delimiter", ",");
            stringBuffer = ";".equals(str3) ? stringBuffer.append("\nDate;Amount;Category;Subcategory;Payment Method;Description;Ref/Check No;Payee/Payer;Status;Receipt Picture;Account;Tag;Tax") : stringBuffer.append("\nDate,Amount,Category,Subcategory,Payment Method,Description,Ref/Check No,Payee/Payer,Status,Receipt Picture,Account,Tag,Tax");
        }
        double d = 0.0d;
        double d2 = 0.0d;
        roVar.m4193a();
        Cursor a = roVar.m4192a(str, str2);
        f2704a = 0;
        if (a == null || !a.moveToFirst()) {
            if (a != null) {
                a.close();
            }
            roVar.m4201b();
            return stringBuffer.toString();
        }
        int columnIndex = a.getColumnIndex("_id");
        int columnIndex2 = a.getColumnIndex("account");
        int columnIndex3 = a.getColumnIndex("amount");
        int columnIndex4 = a.getColumnIndex("category");
        int columnIndex5 = a.getColumnIndex("subcategory");
        int columnIndex6 = a.getColumnIndex("expensed");
        int columnIndex7 = a.getColumnIndex("description");
        int columnIndex8 = a.getColumnIndex("payment_method");
        int columnIndex9 = a.getColumnIndex("reference_number");
        int columnIndex10 = a.getColumnIndex("property");
        int columnIndex11 = a.getColumnIndex("status");
        int columnIndex12 = a.getColumnIndex("property2");
        int columnIndex13 = a.getColumnIndex("expense_tag");
        int columnIndex14 = a.getColumnIndex("tax");
        int columnIndex15 = a.getColumnIndex("property3");
        int columnIndex16 = a.getColumnIndex("property4");
        int columnIndex17 = a.getColumnIndex("property5");
        do {
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            HashMap hashMap = new HashMap();
            String str4 = "" + a.getLong(columnIndex);
            String b = aib.m3865b(a.getString(columnIndex2));
            String b2 = aib.m3865b(a.getString(columnIndex3));
            String b3 = aib.m3865b(a.getString(columnIndex4));
            long j = a.getLong(columnIndex6);
            String b4 = aib.m3865b(a.getString(columnIndex7));
            String b5 = aib.m3865b(a.getString(columnIndex5));
            String b6 = aib.m3865b(a.getString(columnIndex8));
            String b7 = aib.m3865b(a.getString(columnIndex9));
            String b8 = aib.m3865b(a.getString(columnIndex10));
            String b9 = aib.m3865b(a.getString(columnIndex11));
            String b10 = aib.m3865b(a.getString(columnIndex12));
            if (!"".equalsIgnoreCase(b10) && b4.indexOf("\u2605") == -1) {
                b4 = b4 + "\u2605";
            }
            String str5 = b3 + "," + b4;
            if (b5 == null || "".equals(b5)) {
                String str6 = str5;
                str5 = b3;
            } else {
                obj = b3 + ":" + b5 + "," + b4;
                obj2 = b3 + ":" + b5;
            }
            String b11 = aib.m3865b(a.getString(columnIndex13));
            String b12 = aib.m3865b(a.getString(columnIndex14));
            String b13 = aib.m3865b(a.getString(columnIndex15));
            String b14 = aib.m3865b(a.getString(columnIndex16));
            String b15 = aib.m3865b(a.getString(columnIndex17));
            if (b11 == null || "".equals(b11)) {
                String str7 = b4;
            } else {
                obj3 = b11 + ";" + b4;
            }
            if (f2705e) {
                String format = new SimpleDateFormat("HH:mm:ss").format(new Date(j));
                if (!"00:00:00".equals(format)) {
                    if (!b4.startsWith("Transfer")) {
                        obj3 = "".equals(b4) ? format : format + ";" + b4;
                    }
                }
            }
            hashMap.put("rowId", str4);
            hashMap.put("description", b4);
            hashMap.put("date", aba.m3749a(j, ExpenseManager.f3244t));
            hashMap.put("dateWithDay", aba.m3749a(j, ExpenseManager.f3244t + " EEE"));
            hashMap.put("dateLong", "" + j);
            hashMap.put("category", obj2);
            hashMap.put("account", b);
            hashMap.put("paymentMethod", b6);
            hashMap.put("referenceNumber", b7);
            hashMap.put("property", b8);
            hashMap.put("status", b9);
            hashMap.put("property2", b10);
            hashMap.put("amount", b2);
            if ("Income".equalsIgnoreCase(b3)) {
                hashMap.put("income", aba.m3767b(b2));
                hashMap.put("expense", "");
                str5 = b2;
            } else {
                hashMap.put("expense", aba.m3767b(b2));
                hashMap.put("income", "");
                str5 = !b2.startsWith("-") ? "-" + b2 : b2.replaceFirst("-", "");
            }
            d = aba.m3742a(d, str5);
            if (b7 == null || "".equals(b7)) {
                b3 = b6;
            } else {
                obj4 = b6 + "|" + b7;
            }
            hashMap.put("paymentMethod_referenceNumber", obj4);
            hashMap.put("tag", b11);
            hashMap.put("tax", b12);
            hashMap.put("property3", b13);
            hashMap.put("property4", b14);
            hashMap.put("property5", b15);
            hashMap.put("fulldescription", obj3);
            hashMap.put("subTotal", aba.m3746a(d));
            hashMap.put("desc", obj);
            d2 = aba.m3742a(d2, b12);
            hashMap.put("taxTotal", aba.m3746a(d2));
            list.add(0, hashMap);
            if (z) {
                b4 = b4.replaceAll("\u2605", "");
                if (",".equals(str3) && b4.indexOf(",") != -1) {
                    b4 = b4.replaceAll(",", " ");
                }
                if (",".equals(str3)) {
                    if (b7.indexOf(",") != -1) {
                        b3 = b7.replaceAll(",", " ");
                        str6 = ",".equals(str3) ? b11.replaceAll(",", ";") : b11.replaceAll(",", "|");
                        str7 = ExpenseManager.f3244t;
                        if (f2705e) {
                            str7 = ExpenseManager.f3244t + " HH:mm:ss";
                        }
                        stringBuffer = stringBuffer.append("\n" + (aba.m3749a(j, str7) + str3 + str5 + str3 + aib.m3865b(a.getString(columnIndex4)) + str3 + b5 + str3 + b6 + str3 + b4 + str3 + b3 + str3 + b8 + str3 + b9 + str3 + b10 + str3 + b + str3 + str6 + str3 + b12));
                    }
                }
                b3 = b7;
                if (",".equals(str3)) {
                }
                str7 = ExpenseManager.f3244t;
                if (f2705e) {
                    str7 = ExpenseManager.f3244t + " HH:mm:ss";
                }
                stringBuffer = stringBuffer.append("\n" + (aba.m3749a(j, str7) + str3 + str5 + str3 + aib.m3865b(a.getString(columnIndex4)) + str3 + b5 + str3 + b6 + str3 + b4 + str3 + b3 + str3 + b8 + str3 + b9 + str3 + b10 + str3 + b + str3 + str6 + str3 + b12));
            }
            f2704a++;
        } while (a.moveToNext());
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
        return stringBuffer.toString();
    }

    public static String m2604a(Calendar calendar, int i) {
        try {
            DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
            calendar.add(7, i * 7);
            calendar.set(7, ExpenseManager.f3243s);
            String format = simpleDateFormat.format(new Date(new Long(calendar.getTimeInMillis()).longValue()));
            calendar.add(5, 6);
            return format + " - " + new SimpleDateFormat(ExpenseManager.f3244t, Locale.US).format(new Date(new Long(calendar.getTimeInMillis()).longValue()));
        } catch (Exception e) {
            e.printStackTrace();
            return "Weekly Expense";
        }
    }

    private void m2606a() {
        f2705e = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getBoolean("transaction_time", false);
        if ("All".equals(this.f2711g)) {
            if (this.f2713i == null || "".equals(this.f2713i)) {
                this.f2713i = "account in (" + abd.m3792a(ExpenseManager.f3245u) + ")";
            } else {
                this.f2713i += " AND " + "account" + " in (" + abd.m3792a(ExpenseManager.f3245u) + ")";
            }
            this.f2713i += " AND (" + "category" + "!='Account Transfer' " + " OR " + "subcategory" + "!='Account Transfer' )";
        }
        this.f2716l = new ArrayList();
        m2602a(this.f2710f, this.f2713i, this.f2716l, false, f2706o);
        Object fmVar = new fm(this, this, this.f2716l, 2130903078, new String[]{"dateWithDay", "income", "expense", "subTotal", "property", "paymentMethod_referenceNumber", "category", "status", "fulldescription"}, new int[]{2131558423, 2131558421, 2131558424, 2131558422, 2131558425, 2131558426, 2131558671, 2131558670, 2131558672});
        this.f2715k.setAdapter(fmVar);
        if (fmVar.getCount() == 0) {
            aib.m3849a(this.f2712h, null, getResources().getString(2131099702), 17301543, getResources().getString(2131100147), getResources().getString(2131099983), null, null, null).show();
        }
        this.f2715k.setOnItemClickListener(new fa(this));
    }

    private void m2607a(ListView listView, int i) {
        listView.post(new fb(this, listView, i));
    }

    public static void m2608a(ro roVar, String str, List<Map<String, Object>> list, String str2) {
        int columnIndex;
        String str3;
        roVar.m4193a();
        Cursor a = roVar.m4192a(str, str2);
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        List arrayList = new ArrayList();
        String str4 = "";
        if (a == null || !a.moveToFirst()) {
            String str5 = str4;
        } else {
            columnIndex = a.getColumnIndex("account");
            int columnIndex2 = a.getColumnIndex("amount");
            int columnIndex3 = a.getColumnIndex("expensed");
            int columnIndex4 = a.getColumnIndex("category");
            do {
                Object string = a.getString(columnIndex);
                String string2 = a.getString(columnIndex2);
                long j = a.getLong(columnIndex3);
                String string3 = a.getString(columnIndex4);
                Calendar instance = Calendar.getInstance();
                if (j != 0) {
                    instance.setTimeInMillis(j);
                }
                int i = instance.get(2);
                int i2 = instance.get(1);
                if (instance.get(5) < ExpenseManager.f3242r) {
                    i--;
                    if (i < 0) {
                        i += 12;
                        i2--;
                    }
                }
                str3 = i2 + "-" + (i + 1);
                if (!arrayList.contains(str3)) {
                    arrayList.add(str3);
                }
                if ("Income".equalsIgnoreCase(string3)) {
                    if (hashMap2.get(str3) == null) {
                        hashMap2.put(str3, aib.m3865b(string2));
                    } else {
                        hashMap2.put(str3, "" + aba.m3743a((String) hashMap2.get(str3), string2));
                    }
                } else if (hashMap.get(str3) == null) {
                    hashMap.put(str3, aib.m3865b(string2));
                } else {
                    hashMap.put(str3, "" + aba.m3743a((String) hashMap.get(str3), string2));
                }
            } while (a.moveToNext());
        }
        for (columnIndex = 0; columnIndex < arrayList.size(); columnIndex++) {
            Map hashMap3 = new HashMap();
            str4 = (String) arrayList.get(columnIndex);
            String a2 = aba.m3756a((String) hashMap.get(str4));
            String a3 = aba.m3756a((String) hashMap2.get(str4));
            str3 = "".equals(a2) ? "0" : a2;
            a2 = "".equals(a3) ? "0" : a3;
            hashMap3.put("date", str4);
            hashMap3.put("account", string);
            hashMap3.put("expense", aba.m3767b(str3));
            hashMap3.put("income", aba.m3767b(a2));
            hashMap3.put("subTotal", aba.m3746a(aba.m3742a(new Double(a2).doubleValue(), "-" + str3)));
            list.add(hashMap3);
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
    }

    public static void m2609a(ro roVar, String str, List<Map<String, Object>> list, String str2, String str3) {
        int columnIndex;
        String string;
        roVar.m4193a();
        Cursor a = roVar.m4192a(str, str3);
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        List arrayList = new ArrayList();
        String str4 = "";
        if (a == null || !a.moveToFirst()) {
            String str5 = str4;
        } else {
            int columnIndex2 = a.getColumnIndex("account");
            columnIndex = a.getColumnIndex("amount");
            int columnIndex3 = a.getColumnIndex("category");
            int columnIndex4 = a.getColumnIndex(str2);
            do {
                string = a.getString(columnIndex2);
                String string2 = a.getString(columnIndex);
                str4 = a.getString(columnIndex3);
                String string3 = a.getString(columnIndex4);
                if (!arrayList.contains(string3)) {
                    arrayList.add(string3);
                }
                if ("Income".equalsIgnoreCase(str4)) {
                    if (hashMap2.get(string3) == null) {
                        hashMap2.put(string3, aib.m3865b(string2));
                    } else {
                        hashMap2.put(string3, "" + aba.m3743a((String) hashMap2.get(string3), string2));
                    }
                } else if (hashMap.get(string3) == null) {
                    hashMap.put(string3, aib.m3865b(string2));
                } else {
                    hashMap.put(string3, "" + aba.m3743a((String) hashMap.get(string3), string2));
                }
            } while (a.moveToNext());
            Object obj = string;
        }
        for (columnIndex = 0; columnIndex < arrayList.size(); columnIndex++) {
            Map hashMap3 = new HashMap();
            str4 = (String) arrayList.get(columnIndex);
            String a2 = aba.m3756a((String) hashMap.get(str4));
            String a3 = aba.m3756a((String) hashMap2.get(str4));
            string = "".equals(a2) ? "0" : a2;
            a2 = "".equals(a3) ? "0" : a3;
            hashMap3.put("name", str4);
            hashMap3.put("account", obj);
            hashMap3.put("expense", aba.m3767b(string));
            hashMap3.put("income", aba.m3767b(a2));
            hashMap3.put("subTotal", aba.m3746a(aba.m3742a(new Double(a2).doubleValue(), "-" + string)));
            list.add(hashMap3);
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
    }

    private void m2610a(Map<String, Object> map) {
        aib.m3849a(this.f2712h, null, getResources().getString(2131099805), 17301543, getResources().getString(2131099809), getResources().getString(2131099983), new fj(this, new Long((String) map.get("rowId")).longValue(), getTitle().toString()), getResources().getString(2131099754), null).show();
    }

    private void m2613b() {
        this.f2710f = new ro(this);
        List arrayList = new ArrayList();
        String str = "account='" + this.f2711g + "'";
        if ("All".equals(this.f2711g)) {
            str = null;
        }
        m2608a(this.f2710f, str, arrayList, "expensed DESC");
        this.f2715k.setAdapter(new cm(this, arrayList, 2130903077, new String[]{"date", "income", "expense", "subTotal"}, new int[]{2131558423, 2131558421, 2131558424, 2131558422}));
        this.f2715k.setOnItemClickListener(new ff(this));
        this.f2710f.m4201b();
    }

    public static void m2614b(ro roVar, String str, List<Map<String, Object>> list, String str2) {
        int columnIndex;
        String string;
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        Cursor a = roVar.m4192a(str, str2);
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        String str3 = "";
        if (a == null || !a.moveToFirst()) {
            String str4 = str3;
        } else {
            int columnIndex2 = a.getColumnIndex("account");
            columnIndex = a.getColumnIndex("amount");
            int columnIndex3 = a.getColumnIndex("expensed");
            int columnIndex4 = a.getColumnIndex("category");
            do {
                string = a.getString(columnIndex2);
                String string2 = a.getString(columnIndex);
                long j = a.getLong(columnIndex3);
                str3 = a.getString(columnIndex4);
                Calendar instance = Calendar.getInstance();
                if (j != 0) {
                    instance.setTimeInMillis(j);
                }
                int i = instance.get(3);
                int i2 = instance.get(1);
                String a2 = m2604a(instance, 0);
                String str5 = "Week " + i + " " + i2;
                if (!arrayList.contains(str5)) {
                    arrayList.add(str5);
                    arrayList2.add(a2);
                }
                if ("Income".equalsIgnoreCase(str3)) {
                    if (hashMap2.get(str5) == null) {
                        hashMap2.put(str5, aib.m3865b(string2));
                    } else {
                        hashMap2.put(str5, "" + aba.m3743a((String) hashMap2.get(str5), string2));
                    }
                } else if (hashMap.get(str5) == null) {
                    hashMap.put(str5, aib.m3865b(string2));
                } else {
                    hashMap.put(str5, "" + aba.m3743a((String) hashMap.get(str5), string2));
                }
            } while (a.moveToNext());
            Object obj = string;
        }
        for (columnIndex = 0; columnIndex < arrayList.size(); columnIndex++) {
            Map hashMap3 = new HashMap();
            str3 = (String) arrayList.get(columnIndex);
            String a3 = aba.m3756a((String) hashMap.get(str3));
            String a4 = aba.m3756a((String) hashMap2.get(str3));
            string = "".equals(a3) ? "0" : a3;
            a3 = "".equals(a4) ? "0" : a4;
            hashMap3.put("date", str3);
            hashMap3.put("account", obj);
            hashMap3.put("expense", aba.m3767b(string));
            hashMap3.put("income", aba.m3767b(a3));
            hashMap3.put("subTotal", aba.m3746a(aba.m3742a(new Double(a3).doubleValue(), "-" + string)));
            hashMap3.put("dateRange", arrayList2.get(columnIndex));
            list.add(hashMap3);
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
    }

    private void m2615b(String str) {
        this.f2710f = new ro(this);
        List arrayList = new ArrayList();
        String str2 = "account='" + this.f2711g + "'";
        if ("All".equals(this.f2711g)) {
            str2 = "category!='Account Transfer'  AND subcategory!='Account Transfer' ";
        }
        m2609a(this.f2710f, str2, arrayList, str, "expensed DESC");
        this.f2715k.setAdapter(new cm(this, arrayList, 2130903077, new String[]{"name", "income", "expense", "subTotal"}, new int[]{2131558423, 2131558421, 2131558424, 2131558422}));
        this.f2715k.setOnItemClickListener(new fh(this, str));
        this.f2710f.m4201b();
    }

    private void m2617c() {
        this.f2710f = new ro(this);
        List arrayList = new ArrayList();
        String str = "account='" + this.f2711g + "'";
        if ("All".equals(this.f2711g)) {
            str = null;
        }
        m2614b(this.f2710f, str, arrayList, "expensed DESC");
        this.f2715k.setAdapter(new cm(this, arrayList, 2130903080, new String[]{"date", "income", "expense", "subTotal", "dateRange"}, new int[]{2131558423, 2131558421, 2131558424, 2131558422, 2131558425}));
        this.f2715k.setOnItemClickListener(new fg(this));
        this.f2710f.m4201b();
    }

    private boolean m2619c(String str) {
        boolean z = false;
        ro roVar = new ro(this);
        roVar.m4193a();
        try {
            roVar.m4194a(str);
            z = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        roVar.m4201b();
        return z;
    }

    private void m2621d() {
        aib.m3849a(this.f2712h, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099812), getResources().getString(2131099983), new fi(this), getResources().getString(2131099754), null).show();
    }

    private void m2623d(String str) {
        try {
            Address address = (Address) new Geocoder(this).getFromLocationName(str, 1).get(0);
            if (address != null) {
                String str2 = "" + address.getLatitude();
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + str2 + "," + ("" + address.getLongitude()) + "?q=" + str)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void m2625e() {
        aib.m3849a(this.f2712h, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099805), getResources().getString(2131099983), new fk(this), getResources().getString(2131099754), null).show();
    }

    private void m2626e(String str) {
        this.f2710f = new ro(this);
        this.f2716l = new ArrayList();
        m2602a(this.f2710f, str, this.f2716l, false, f2706o);
        Object clVar = new cl(this, this.f2716l, 2130903079, new String[]{"dateWithDay", "income", "expense", "subTotal", "property", "paymentMethod_referenceNumber", "category", "status", "fulldescription", "tax", "taxTotal"}, new int[]{2131558423, 2131558421, 2131558424, 2131558422, 2131558425, 2131558426, 2131558671, 2131558670, 2131558672, 2131558674, 2131558675});
        this.f2715k.setAdapter(clVar);
        if (clVar.getCount() == 0) {
            aib.m3849a(this.f2712h, null, getResources().getString(2131099702), 17301543, getResources().getString(2131100147), getResources().getString(2131099983), null, null, null).show();
        }
        this.f2715k.setOnItemClickListener(new fd(this));
        this.f2710f.m4201b();
    }

    public void m2628a(String str, String str2, String[] strArr, String str3) {
        OnClickListener fcVar = new fc(this, strArr, str3, str);
        aib.m3849a(this, m2600a(str2, strArr), getResources().getString(2131100156) + ": " + str2, 17301659, null, getResources().getString(2131099983), fcVar, getResources().getString(2131099754), null).show();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        int i3 = 0;
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.f2711g = extras.getString("account");
                if (extras.getString("whereClause") != null) {
                    this.f2713i = extras.getString("whereClause");
                }
                this.f2714j = extras.getString("activityDesc");
                i3 = extras.getInt("position");
            }
        }
        if (-1 != i2) {
            return;
        }
        if (i == 3 || i == 14) {
            m2606a();
            setTitle(this.f2714j + " (" + f2704a + ")");
            return;
        }
        m2606a();
        m2607a(this.f2715k, i3);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        Intent intent;
        Map map = (Map) this.f2716l.get(((AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (menuItem.getItemId() == 100) {
            m2610a(map);
        }
        if (menuItem.getItemId() == 101) {
            String str = co.f4431e + ((String) map.get("property2"));
            Intent intent2 = new Intent(this.f2712h, DisplayPicture.class);
            Bundle bundle = new Bundle();
            bundle.putString("image_file", str);
            intent2.putExtras(bundle);
            startActivity(intent2);
        }
        if (menuItem.getItemId() == 102) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getResources().getString(2131099678) + ": " + ((String) map.get("account")) + "\n");
            stringBuffer.append(getResources().getString(2131099794) + ": " + ((String) map.get("date")) + "\n");
            stringBuffer.append(getResources().getString(2131100007) + ": " + ((String) map.get("property")) + "\n");
            stringBuffer.append(getResources().getString(2131099755) + ": " + ((String) map.get("category")) + "\n");
            stringBuffer.append(getResources().getString(2131099723) + ": " + ((String) map.get("amount")) + "\n");
            stringBuffer.append(getResources().getString(2131100011) + ": " + ((String) map.get("paymentMethod")) + "\n");
            stringBuffer.append(getResources().getString(2131100101) + ": " + ((String) map.get("status")) + "\n");
            stringBuffer.append(getResources().getString(2131100039) + ": " + ((String) map.get("referenceNumber")) + "\n");
            stringBuffer.append(getResources().getString(2131099813) + ": " + ((String) map.get("description")) + "\n");
            stringBuffer.append(getResources().getString(2131100110) + ": " + ((String) map.get("tag")) + "\n");
            stringBuffer.append(getResources().getString(2131100115) + ": " + ((String) map.get("tax")) + "\n");
            intent = new Intent("android.intent.action.SEND");
            intent.setType("plain/text");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
            intent.putExtra("android.intent.extra.SUBJECT", getResources().getString(2131099725));
            intent.putExtra("android.intent.extra.TEXT", stringBuffer.toString());
            str = co.f4431e + ((String) map.get("property2"));
            if (!(str == null || "".equals(str))) {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str)));
            }
            startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        if (menuItem.getItemId() == 106) {
            stringBuffer = new StringBuffer();
            stringBuffer.append(getResources().getString(2131099678) + ": " + ((String) map.get("account")) + "\n");
            stringBuffer.append(getResources().getString(2131099794) + ": " + ((String) map.get("date")) + "\n");
            stringBuffer.append(getResources().getString(2131099723) + ": " + ((String) map.get("amount")) + "\n");
            stringBuffer.append(getResources().getString(2131099755) + ": " + ((String) map.get("category")) + "\n");
            stringBuffer.append(getResources().getString(2131100011) + ": " + ((String) map.get("paymentMethod")) + "\n");
            stringBuffer.append(getResources().getString(2131100101) + ": " + ((String) map.get("status")) + "\n");
            if (!"".equals((String) map.get("property"))) {
                stringBuffer.append(getResources().getString(2131100007) + ": " + ((String) map.get("property")) + "\n");
            }
            if (!"".equals((String) map.get("referenceNumber"))) {
                stringBuffer.append(getResources().getString(2131100039) + ": " + ((String) map.get("referenceNumber")) + "\n");
            }
            if (!"".equals((String) map.get("description"))) {
                stringBuffer.append(getResources().getString(2131099813) + ": " + ((String) map.get("description")) + "\n");
            }
            if (!"".equals((String) map.get("tag"))) {
                stringBuffer.append(getResources().getString(2131100110) + ": " + ((String) map.get("tag")) + "\n");
            }
            if (!"".equals((String) map.get("tax"))) {
                stringBuffer.append(getResources().getString(2131100115) + ": " + ((String) map.get("tax")) + "\n");
            }
            str = co.f4431e + ((String) map.get("property2"));
            if (VERSION.SDK_INT >= 19) {
                String defaultSmsPackage = Sms.getDefaultSmsPackage(this);
                Intent intent3 = new Intent("android.intent.action.SEND");
                intent3.setType("text/plain");
                intent3.putExtra("android.intent.extra.TEXT", stringBuffer.toString());
                if (!(str == null || "".equals(str))) {
                    intent3.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str)));
                }
                if (defaultSmsPackage != null) {
                    intent3.setPackage(defaultSmsPackage);
                }
                startActivity(intent3);
            } else {
                intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:"));
                intent.putExtra("sms_body", stringBuffer.toString());
                if (!(str == null || "".equals(str))) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str)));
                }
                startActivity(intent);
            }
        }
        if (menuItem.getItemId() == 103) {
            m2623d((String) ExpenseAutoFillAddEdit.m2770a(this.f2710f, "payee_payer='" + ((String) map.get("property")) + "'").get("address"));
        }
        if (menuItem.getItemId() == 104) {
            CharSequence[] split = abd.m3786a(this.f2712h, this.f2710f, "TRANSACTION_STATUS_KEY", getResources().getString(2131100103)).split(",");
            str = (String) map.get("rowId");
            int indexOf = new ArrayList(Arrays.asList(split)).indexOf((String) map.get("status"));
            Builder builder = new Builder(this);
            builder.setTitle(2131100160);
            builder.setSingleChoiceItems(split, indexOf, new fl(this, str, split));
            builder.show();
        }
        if (menuItem.getItemId() == 105) {
            stringBuffer = new StringBuffer();
            stringBuffer.append(getResources().getString(2131099678) + ": " + ((String) map.get("account")) + "\n");
            stringBuffer.append(getResources().getString(2131099794) + ": " + ((String) map.get("date")) + "\n");
            stringBuffer.append(getResources().getString(2131100007) + ": " + ((String) map.get("property")) + "\n");
            stringBuffer.append(getResources().getString(2131099755) + ": " + ((String) map.get("category")) + "\n");
            stringBuffer.append(getResources().getString(2131099723) + ": " + ((String) map.get("amount")) + "\n");
            stringBuffer.append(getResources().getString(2131100011) + ": " + ((String) map.get("paymentMethod")) + "\n");
            stringBuffer.append(getResources().getString(2131100101) + ": " + ((String) map.get("status")) + "\n");
            stringBuffer.append(getResources().getString(2131100039) + ": " + ((String) map.get("referenceNumber")) + "\n");
            stringBuffer.append(getResources().getString(2131099813) + ": " + ((String) map.get("description")) + "\n");
            stringBuffer.append(getResources().getString(2131100110) + ": " + ((String) map.get("tag")) + "\n");
            stringBuffer.append(getResources().getString(2131100115) + ": " + ((String) map.get("tax")) + "\n");
            Intent intent4 = new Intent(this.f2712h, NoteAdd.class);
            bundle = new Bundle();
            bundle.putString("transactionId", (String) map.get("rowId"));
            bundle.putString("content", stringBuffer.toString());
            bundle.putString("fromWhere", "transaction");
            intent4.putExtras(bundle);
            startActivity(intent4);
        }
        return super.onContextItemSelected(menuItem);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        if (!(VERSION.SDK_INT < 14 || (getResources().getConfiguration().screenLayout & 15) == 4 || (getResources().getConfiguration().screenLayout & 15) == 3 || getActionBar() == null)) {
            getActionBar().setDisplayShowHomeEnabled(false);
        }
        this.f2710f = new ro(this);
        setContentView(2130903131);
        this.f2715k = (ListView) findViewById(2131558561);
        registerForContextMenu(this.f2715k);
        this.f2715k.setFastScrollEnabled(true);
        this.f2711g = getIntent().getStringExtra("account");
        this.f2707b = getIntent().getStringExtra("title");
        f2706o = "expensed ASC";
        this.f2714j = this.f2711g + " - All transactions: ";
        this.f2713i = getIntent().getStringExtra("whereClause");
        if (this.f2713i == null || "".equals(this.f2713i)) {
            this.f2713i = "account='" + this.f2711g + "' and " + "expensed" + "<=" + aib.m3847a();
            if ("All".equals(this.f2711g)) {
                this.f2713i = "expensed<=" + aib.m3847a();
            }
            this.f2713i = ExpenseActivitiesDefault.m2735a(this.f2712h, this.f2711g);
            this.f2707b = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getString(this.f2711g + "_activityDesc", null);
        }
        if (getIntent().getBooleanExtra("isTaxOnly", false)) {
            m2626e(this.f2713i);
        } else {
            m2606a();
        }
        String stringExtra = getIntent().getStringExtra("activityDesc");
        if (stringExtra != null) {
            this.f2707b = stringExtra;
        }
        if (this.f2707b == null || "".equals(this.f2707b)) {
            this.f2707b = this.f2711g + ":Up to date (" + f2704a + ")";
        } else {
            this.f2707b = this.f2711g + ":" + this.f2707b + " (" + f2704a + ")";
        }
        setTitle(this.f2707b);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        String charSequence = getTitle().toString();
        if (!charSequence.equals(this.f2711g + ": " + getResources().getString(2131099957)) && !charSequence.equals(this.f2711g + ": " + getResources().getString(2131100166)) && !charSequence.equals(this.f2711g + ": " + getResources().getString(2131100007)) && !charSequence.equals(this.f2711g + ": " + getResources().getString(2131100011))) {
            contextMenu.setHeaderTitle(this.f2711g);
            contextMenu.add(0, 100, 0, 2131099802);
            Map map = (Map) this.f2716l.get(((AdapterContextMenuInfo) contextMenuInfo).position);
            String str = (String) map.get("property2");
            if (!(str == null || str.indexOf(".jpg") == -1)) {
                contextMenu.add(0, 101, 0, 2131100162);
            }
            contextMenu.add(0, 102, 0, "Email");
            contextMenu.add(0, 106, 0, "SMS");
            contextMenu.add(0, 104, 0, 2131100160);
            map = ExpenseAutoFillAddEdit.m2770a(this.f2710f, "payee_payer='" + ((String) map.get("property")) + "'");
            if (!(map == null || map.size() <= 0 || map.get("address") == null || "".equals(map.get("address")))) {
                contextMenu.add(0, 103, 0, 2131099947);
            }
            contextMenu.add(0, 105, 0, 2131099697);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f2708c = menu.add(0, 6, 0, 2131099802);
        this.f2708c.setIcon(2130837594).setShowAsAction(2);
        if (this.f2717m.size() == 0) {
            this.f2708c.setVisible(false);
        }
        getMenuInflater().inflate(2131492865, menu);
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Intent intent = new Intent(this.f2712h, ExpenseManager.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f2711g);
            intent.putExtras(bundle);
            setResult(-1, intent);
            finish();
        }
        return false;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (menuItem.getItemId() == 6) {
            m2625e();
            return true;
        }
        if (menuItem.getItemId() == 2131559123 || menuItem.getItemId() == 2131559124 || menuItem.getItemId() == 2131559145 || menuItem.getItemId() == 2131559146 || menuItem.getItemId() == 2131559126 || menuItem.getItemId() == 2131559143 || menuItem.getItemId() == 2131559144 || menuItem.getItemId() == 2131559125 || menuItem.getItemId() == 2131558668 || menuItem.getItemId() == 2131558547 || menuItem.getItemId() == 2131558699 || menuItem.getItemId() == 2131558720 || menuItem.getItemId() == 2131558684 || menuItem.getItemId() == 2131559119) {
            this.f2717m = new ArrayList();
            this.f2708c.setVisible(false);
        }
        Intent intent;
        Bundle bundle;
        String[] split;
        switch (menuItem.getItemId()) {
            case 16908332:
                dispatchKeyEvent(new KeyEvent(0, 4));
                return true;
            case 2131558547:
                setTitle(this.f2711g + ": " + getResources().getString(2131100011));
                m2615b("payment_method");
                return true;
            case 2131558668:
                m2621d();
                return true;
            case 2131558684:
                setTitle(this.f2711g + ": " + getResources().getString(2131100101));
                m2615b("status");
                return true;
            case 2131558699:
                setTitle(this.f2711g + ": " + getResources().getString(2131100007));
                m2615b("property");
                return true;
            case 2131558720:
                intent = new Intent(this.f2712h, ExpenseCategoryExpandableActivities.class);
                bundle = new Bundle();
                bundle.putString("account", this.f2711g);
                intent.putExtras(bundle);
                startActivity(intent);
                return true;
            case 2131559119:
                intent = new Intent(this, ExpenseActivitiesDefault.class);
                bundle = new Bundle();
                bundle.putString("account", this.f2711g);
                intent.putExtras(bundle);
                startActivityForResult(intent, 14);
                return true;
            case 2131559123:
                split = abd.m3786a(this.f2712h, this.f2710f, "MY_ACCOUNT_NAMES", this.f2711g).split(",");
                View listView = new ListView(this.f2712h);
                listView.setAdapter(new ArrayAdapter(this.f2712h, 17367043, split));
                Dialog dialog = new Dialog(this.f2712h);
                dialog.setTitle(2131100026);
                dialog.setContentView(listView);
                dialog.show();
                listView.setOnItemClickListener(new fe(this, dialog, split));
                return true;
            case 2131559124:
                this.f2714j = this.f2711g + " - " + getResources().getString(2131099722);
                this.f2713i = "account='" + this.f2711g + "'";
                if ("All".equals(this.f2711g)) {
                    this.f2713i = null;
                }
                f2706o = "expensed ASC";
                m2606a();
                setTitle(this.f2711g + ": " + getResources().getString(2131099722) + " (" + f2704a + ")");
                return true;
            case 2131559125:
                intent = new Intent(this.f2712h, ExpenseExport.class);
                bundle = new Bundle();
                bundle.putString("account", this.f2711g);
                bundle.putString("whereClause", this.f2713i);
                intent.putExtras(bundle);
                startActivity(intent);
                return true;
            case 2131559126:
                intent = new Intent(this, ExpenseCustomActivities.class);
                bundle = new Bundle();
                bundle.putString("account", this.f2711g);
                intent.putExtras(bundle);
                startActivityForResult(intent, 3);
                return true;
            case 2131559143:
                setTitle(this.f2711g + ": " + getResources().getString(2131099957));
                m2613b();
                return true;
            case 2131559144:
                setTitle(this.f2711g + ": " + getResources().getString(2131100166));
                m2617c();
                return true;
            case 2131559145:
                this.f2714j = this.f2711g + " - " + getResources().getString(2131099889);
                this.f2713i = "account='" + this.f2711g + "'" + " and " + "category" + "!='Income'";
                if ("All".equals(this.f2711g)) {
                    this.f2713i = "category!='Income' AND category!='Account Transfer'";
                }
                f2706o = "expensed ASC";
                m2606a();
                setTitle(this.f2711g + ": " + getResources().getString(2131099889) + " (" + f2704a + ")");
                return true;
            case 2131559146:
                this.f2714j = this.f2711g + " - " + getResources().getString(2131099936);
                this.f2713i = "account='" + this.f2711g + "'" + " and " + "category" + "='Income'";
                if ("All".equals(this.f2711g)) {
                    this.f2713i = "category='Income' AND subcategory!='Account Transfer' ";
                }
                f2706o = "expensed ASC";
                m2606a();
                setTitle(this.f2711g + ": " + getResources().getString(2131099936) + " (" + f2704a + ")");
                return true;
            default:
                if (menuItem.getItemId() >= 2131559128 && menuItem.getItemId() <= 2131559138) {
                    this.f2713i = "account='" + this.f2711g + "'";
                    if (menuItem.getItemId() == 2131559128) {
                        f2706o = "expensed DESC";
                    }
                    if (menuItem.getItemId() == 2131559129) {
                        f2706o = "category DESC";
                    }
                    if (menuItem.getItemId() == 2131559130) {
                        f2706o = "property DESC";
                    }
                    if (menuItem.getItemId() == 2131559131) {
                        f2706o = "payment_method DESC";
                    }
                    if (menuItem.getItemId() == 2131559132) {
                        f2706o = "status DESC";
                    }
                    if (menuItem.getItemId() == 2131559133) {
                        f2706o = "description DESC";
                    }
                    if (menuItem.getItemId() == 2131559134) {
                        this.f2713i = "account='" + this.f2711g + "' AND " + "category" + "!='Income'";
                        f2706o = "CAST( " + this.f2718n[6] + " AS INT)";
                    }
                    if (menuItem.getItemId() == 2131559135) {
                        this.f2713i = "account='" + this.f2711g + "' AND " + "category" + "='Income'";
                        f2706o = "CAST( " + this.f2718n[7] + " AS INT)";
                    }
                    if (menuItem.getItemId() == 2131559136) {
                        this.f2713i = "account='" + this.f2711g + "' AND " + "property2" + " like '%.jpg'";
                        f2706o = "expensed ASC";
                    }
                    if (menuItem.getItemId() == 2131559137) {
                        this.f2713i = "account='" + this.f2711g + "'";
                        f2706o = "reference_number ASC";
                    }
                    if (menuItem.getItemId() == 2131559138) {
                        this.f2713i = "account='" + this.f2711g + "' and " + "expense_tag" + "!=''";
                        f2706o = "expense_tag ASC";
                    }
                    if ("All".equals(this.f2711g)) {
                        this.f2713i = this.f2713i.replace("account='" + this.f2711g + "' AND ", "");
                        this.f2713i = this.f2713i.replace("account='" + this.f2711g + "'", "");
                    }
                    m2606a();
                    setTitle(this.f2711g + ": " + getResources().getString(2131100095) + " " + menuItem.getTitle() + " (" + f2704a + ")");
                    this.f2717m = new ArrayList();
                    this.f2708c.setVisible(false);
                }
                if (menuItem.getItemId() < 2131559140 || menuItem.getItemId() > 2131559142) {
                    return super.onMenuItemSelected(i, menuItem);
                }
                String str;
                String[] split2;
                String charSequence = menuItem.getTitle().toString();
                String str2 = "";
                split = null;
                if (menuItem.getItemId() == 2131559140) {
                    str2 = "account";
                    ArrayList arrayList = new ArrayList(Arrays.asList(abd.m3786a(this.f2712h, this.f2710f, "MY_ACCOUNT_NAMES", "").split(",")));
                    if (arrayList.contains(this.f2711g)) {
                        arrayList.remove(this.f2711g);
                    }
                    split = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
                if (menuItem.getItemId() == 2131559141) {
                    str2 = "payment_method";
                    split = abd.m3786a(this.f2712h, this.f2710f, "PAYMENT_METHOD_KEY", getResources().getString(2131100012)).split(",");
                }
                if (menuItem.getItemId() == 2131559142) {
                    str = "status";
                    split2 = abd.m3786a(this.f2712h, this.f2710f, "TRANSACTION_STATUS_KEY", getResources().getString(2131100103)).split(",");
                } else {
                    str = str2;
                    split2 = split;
                }
                String str3 = this.f2713i;
                if (this.f2717m.size() > 0) {
                    str3 = "account='" + this.f2711g + "'" + " and " + "_id" + " in (" + abd.m3792a(aib.m3868b((String[]) this.f2717m.toArray(new String[this.f2717m.size()]), ",")) + ")";
                }
                m2628a(str, charSequence, split2, str3);
                return true;
        }
    }
}
