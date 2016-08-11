package com.expensemanager;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.TabActivity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ExpenseBudgetList extends TabActivity {
    private List<Map<String, String>> f2919A;
    private List<Map<String, String>> f2920B;
    private List<String> f2921C;
    private List<String> f2922D;
    private List<String> f2923E;
    private List<String> f2924F;
    private String[] f2925G;
    private OnDateSetListener f2926H;
    TextView f2927a;
    ListView f2928b;
    TextView f2929c;
    ListView f2930d;
    TextView f2931e;
    ListView f2932f;
    List<Map<String, String>> f2933g;
    int f2934h;
    String f2935i;
    View f2936j;
    int f2937k;
    private TabHost f2938l;
    private ro f2939m;
    private TextView f2940n;
    private int f2941o;
    private int f2942p;
    private int f2943q;
    private Context f2944r;
    private long f2945s;
    private int f2946t;
    private int f2947u;
    private int f2948v;
    private String f2949w;
    private int f2950x;
    private List<Map<String, String>> f2951y;
    private List<Map<String, String>> f2952z;

    public ExpenseBudgetList() {
        this.f2944r = this;
        this.f2945s = 0;
        this.f2946t = 0;
        this.f2947u = 0;
        this.f2948v = 0;
        this.f2949w = "Personal Expense";
        this.f2950x = 2;
        this.f2921C = new ArrayList();
        this.f2922D = new ArrayList();
        this.f2923E = new ArrayList();
        this.f2924F = new ArrayList();
        this.f2925G = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        this.f2934h = 2;
        this.f2935i = "";
        this.f2937k = 0;
        this.f2926H = new lo(this);
    }

    public static List<Map<String, String>> m2831a(List<Map<String, String>> list, int i, int i2) {
        Calendar instance;
        List<Map<String, String>> arrayList = new ArrayList();
        String[] strArr = new String[2];
        if (i2 == 0) {
            String a = aba.m3749a(((long) i) * 1000, ExpenseManager.f3244t);
            strArr[0] = a;
            strArr[1] = a;
        }
        if (i2 == 1) {
            strArr = aba.m3763b(i).split(" - ");
        }
        String[] split = i2 == 2 ? aba.m3776d(i).split(" - ") : strArr;
        if (i2 == 3) {
            instance = Calendar.getInstance();
            instance.add(1, 0);
            instance.set(2, ExpenseManager.f3241q);
            instance.set(5, ExpenseManager.f3242r);
            if (instance.after(Calendar.getInstance())) {
                i--;
            }
            instance = Calendar.getInstance();
            instance.add(1, i);
            instance.set(2, ExpenseManager.f3241q);
            instance.set(5, ExpenseManager.f3242r);
            split[0] = aba.m3749a(instance.getTimeInMillis(), ExpenseManager.f3244t);
            instance.add(1, 1);
            instance.add(5, -1);
            split[1] = aba.m3749a(instance.getTimeInMillis(), ExpenseManager.f3244t);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        int i3 = 0;
        while (i3 < list.size()) {
            try {
                Map map = (Map) list.get(i3);
                String str = (String) map.get("property");
                if (str == null || "".equals(str.trim())) {
                    arrayList.add(map);
                    i3++;
                } else {
                    String[] split2 = str.split(";");
                    Date parse = simpleDateFormat.parse(split[0]);
                    Date parse2 = simpleDateFormat.parse(split[1]);
                    if (i2 == 3) {
                        instance = Calendar.getInstance();
                        instance.setTime(parse);
                        instance.set(2, ExpenseManager.f3241q);
                        instance.set(5, ExpenseManager.f3242r);
                        parse = instance.getTime();
                        instance.add(1, 1);
                        instance.add(5, -1);
                        parse2 = instance.getTime();
                    }
                    if ((split2.length <= 0 || "".equals(split2[0]) || !simpleDateFormat2.parse(split2[0]).after(r1)) && (split2.length <= 1 || "".equals(split2[1]) || !simpleDateFormat2.parse(split2[1]).before(r3))) {
                        arrayList.add(map);
                    }
                    i3++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    private void m2832a() {
        this.f2940n.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f2941o + "-" + (this.f2942p + 1) + "-" + this.f2943q));
    }

    private void m2833a(ListView listView, List<Map<String, String>> list, List<String> list2) {
        if (listView.getFooterViewsCount() > 0) {
            listView.removeFooterView(this.f2936j);
        }
        this.f2936j = LayoutInflater.from(this).inflate(2130903044, null);
        if (listView.getFooterViewsCount() == 0 && list != null && list.size() > 0) {
            listView.addFooterView(this.f2936j);
        }
        if (this.f2937k == 1 || this.f2937k > 3) {
            this.f2936j.setBackgroundColor(-1725816286);
        }
        String str = "";
        String str2 = "";
        int i = 0;
        while (i < list.size()) {
            String str3 = (String) ((Map) list.get(i)).get("amount");
            String str4 = (String) list2.get(i);
            if (str4 == null) {
                str4 = "0.00";
            }
            str4 = str4.replaceAll(",", "");
            str2 = "" + aba.m3743a(str2.replaceAll(",", ""), str4);
            i++;
            str = "" + aba.m3743a(str, str3);
        }
        if ("".equals(str2)) {
            str2 = "0";
        }
        Object a = aba.m3746a(aba.m3743a(str, "-" + str2));
        CharSequence charSequence = aba.m3767b(str2) + "/" + aba.m3767b(str);
        TextView textView = (TextView) this.f2936j.findViewById(2131558421);
        textView.setText(a);
        ((TextView) this.f2936j.findViewById(2131558422)).setText(charSequence);
        if (a == null || !a.startsWith("(")) {
            textView.setTextColor(co.f4429c);
        } else {
            textView.setTextColor(co.f4428b);
        }
    }

    public static void m2835a(ro roVar, String str, List<Map<String, String>> list, List<String> list2, List<String> list3) {
        if (list3 != null) {
            list3.clear();
        }
        if (!(str == null || str.indexOf("!='Account Transfer'") == -1)) {
            str = str.replace("AND category!='Account Transfer'", "");
        }
        int i = 0;
        while (i < list.size()) {
            try {
                Map map = (Map) list.get(i);
                String str2 = (String) map.get("account");
                String str3 = (str2 == null || "".equals(str2) || "All".equalsIgnoreCase(str2)) ? str : str + " and " + "account" + " in (" + abd.m3792a(str2) + ")";
                if ("All".equalsIgnoreCase(str2)) {
                    str3 = str3 + " and " + "account" + " in (" + abd.m3792a(ExpenseManager.f3245u) + ")";
                }
                str2 = (String) map.get("category");
                if (!(str2 == null || "".equals(str2))) {
                    if ("All-1".equalsIgnoreCase(str2)) {
                        str3 = str3 + " and " + "category" + "!='Account Transfer'";
                    }
                    if (!("All".equalsIgnoreCase(str2) || "All-1".equalsIgnoreCase(str2))) {
                        str3 = str3 + " and " + "category" + " in (" + abd.m3792a(str2.trim()) + ")";
                    }
                }
                str2 = (String) map.get("subcategory");
                if (!(str2 == null || "".equals(str2) || "All".equalsIgnoreCase(str2))) {
                    str3 = str3 + " and " + "subcategory" + " in (" + abd.m3792a(str2.trim()) + ")";
                }
                str2 = (String) map.get("property2");
                str2 = (str2 == null || "".equals(str2)) ? str3 : str3 + " and " + "payment_method" + " in (" + abd.m3792a(str2.trim()) + ")";
                String str4 = (String) map.get("property3");
                if (!(str4 == null || "".equals(str4))) {
                    str2 = str2.replace("Income", "") + " and " + " (" + abd.m3815b("expense_tag", str4) + ")";
                }
                if (str4 == null || "".equals(str4)) {
                    list2.add(abd.m3789a(roVar, str2, ExpenseManager.f3246v));
                } else {
                    Object b = abd.m3813b(roVar, str2, ExpenseManager.f3246v);
                    if (b.startsWith("(")) {
                        b = b.replace("(", "").replace(")", "");
                    } else if (!b.equals("0.00")) {
                        b = "-" + b;
                    }
                    list2.add(b);
                }
                if (list3 != null) {
                    list3.add(str2);
                }
                i++;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }

    public static void m2836a(ro roVar, List<Map<String, String>> list, int i, int i2) {
        List arrayList = new ArrayList();
        String[] strArr = new String[2];
        if (i2 == 0) {
            String a = aba.m3749a(((long) i) * 1000, ExpenseManager.f3244t);
            strArr[0] = a;
            strArr[1] = a;
        }
        if (i2 == 1) {
            strArr = aba.m3763b(i).split(" - ");
        }
        String[] split = i2 == 2 ? aba.m3776d(i).split(" - ") : strArr;
        if (i2 == 3) {
            Calendar instance = Calendar.getInstance();
            instance.add(1, i);
            instance.set(6, 1);
            split[0] = aba.m3749a(instance.getTimeInMillis(), ExpenseManager.f3244t);
            instance.add(1, 1);
            instance.set(6, 1);
            instance.add(1, -1);
            split[1] = aba.m3749a(instance.getTimeInMillis(), ExpenseManager.f3244t);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
        int i3 = 0;
        while (i3 < list.size()) {
            try {
                Map map = (Map) list.get(i3);
                a = (String) map.get("property");
                if (a == null || "".equals(a)) {
                    arrayList.add(map);
                    i3++;
                } else {
                    String[] split2 = a.split(";");
                    if ((split2.length <= 0 || !"".equals(split2[0])) && (split2.length <= 2 || !"NO".equalsIgnoreCase(split2[2]))) {
                        Calendar instance2;
                        Calendar instance3;
                        int i4;
                        Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(split2[0]);
                        Date parse2 = simpleDateFormat.parse(split[0]);
                        Calendar instance4 = Calendar.getInstance();
                        instance4.setTime(parse2);
                        instance4.add(6, -1);
                        instance4.set(11, 23);
                        instance4.set(12, 59);
                        instance4.set(13, 59);
                        instance4.set(14, 999);
                        Date time = instance4.getTime();
                        int time2 = (int) (time.getTime() - parse.getTime() >= 0 ? ((time.getTime() - parse.getTime()) / 86400000) + 1 : 0);
                        if (i2 == 1) {
                            instance2 = Calendar.getInstance();
                            instance2.setTime(parse);
                            instance2.set(7, ExpenseManager.f3243s);
                            parse = instance2.getTime();
                            instance2 = Calendar.getInstance();
                            instance2.setTime(simpleDateFormat.parse(split[1]));
                            instance2.add(7, -7);
                            time = instance2.getTime();
                            time2 = (int) (((time.getTime() - parse.getTime()) / 86400000) / 7);
                            if (((time.getTime() - parse.getTime()) / 86400000) % 7 > 0) {
                                time2++;
                            }
                        }
                        if (i2 == 2) {
                            instance2 = Calendar.getInstance();
                            instance2.setTime(parse);
                            instance2.set(5, ExpenseManager.f3242r);
                            parse = instance2.getTime();
                            instance3 = Calendar.getInstance();
                            instance3.add(2, i);
                            if (instance3.get(5) < ExpenseManager.f3242r) {
                                instance3.add(2, -1);
                            }
                            instance3.set(5, ExpenseManager.f3242r);
                            instance3.add(5, -1);
                            time2 = (instance3.get(5) >= instance2.get(5) ? 1 : 0) + (((instance3.get(1) - instance2.get(1)) * 12) + (instance3.get(2) - instance2.get(2)));
                            time = parse;
                            parse = instance3.getTime();
                        } else {
                            Date date = time;
                            time = parse;
                            parse = date;
                        }
                        if (i2 == 3) {
                            instance2 = Calendar.getInstance();
                            instance2.setTime(time);
                            instance2.set(6, 1);
                            time = instance2.getTime();
                            instance3 = Calendar.getInstance();
                            instance3.add(1, i);
                            instance3.set(6, 1);
                            instance3.add(1, -1);
                            i4 = (instance3.get(1) - instance2.get(1)) + 1;
                            parse2 = time;
                        } else {
                            i4 = time2;
                            parse2 = time;
                        }
                        String str = "expensed>=" + abd.m3818c(simpleDateFormat.format(parse2)) + " and " + "expensed" + "<=" + abd.m3820d(simpleDateFormat.format(parse)) + " and " + "category" + "!='Income'";
                        a = (String) map.get("account");
                        String str2 = (String) map.get("originalAmount");
                        if (!(a == null || "".equals(a) || "All".equalsIgnoreCase(a))) {
                            str = str + " and " + "account" + " in (" + abd.m3792a(a) + ")";
                        }
                        if ("All".equalsIgnoreCase(a)) {
                            str = str + " and " + "account" + " in (" + abd.m3792a(ExpenseManager.f3245u) + ")";
                        }
                        a = (String) map.get("category");
                        if (!(a == null || "".equals(a))) {
                            if ("All-1".equalsIgnoreCase(a)) {
                                str = str + " and " + "category" + "!='Account Transfer'";
                            }
                            if (!("All".equalsIgnoreCase(a) || "All-1".equalsIgnoreCase(a))) {
                                str = str + " and " + "category" + " in (" + abd.m3792a(a.trim()) + ")";
                            }
                        }
                        a = (String) map.get("subcategory");
                        if (!(a == null || "".equals(a) || "All".equalsIgnoreCase(a))) {
                            str = str + " and " + "subcategory" + " in (" + abd.m3792a(a.trim()) + ")";
                        }
                        a = (String) map.get("property2");
                        if (!(a == null || "".equals(a))) {
                            str = str + " and " + "payment_method" + " in (" + abd.m3792a(a.trim()) + ")";
                        }
                        a = (String) map.get("property3");
                        a = (a == null || "".equals(a)) ? str : str + " and " + "expense_tag" + " in (" + abd.m3792a(a.trim()) + ")";
                        map.put("amount", "" + aba.m3743a("" + (((double) (i4 + 1)) * Double.valueOf(str2).doubleValue()), "-" + abd.m3789a(roVar, a, ExpenseManager.f3246v).replaceAll(",", "")));
                        arrayList.add(map);
                    }
                    i3++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void m2837a(Map<?, ?> map) {
        if (map == null) {
            startActivityForResult(new Intent(this, ExpenseBudgetAdd.class), 0);
            return;
        }
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.f2944r, ExpenseBudgetAdd.class);
        bundle.putString("rowId", aib.m3852a(map.get("rowId")));
        bundle.putString("category", aib.m3852a(map.get("category")));
        bundle.putString("account", aib.m3852a(map.get("account")));
        bundle.putString("amount", aib.m3852a(map.get("originalAmount")));
        bundle.putString("alertAmount", aib.m3852a(map.get("alert")));
        bundle.putString("subcategory", aib.m3852a(map.get("subcategory")));
        bundle.putString("property", aib.m3852a(map.get("property")));
        bundle.putString("property2", aib.m3852a(map.get("property2")));
        bundle.putString("property3", aib.m3852a(map.get("property3")));
        bundle.putString("description", aib.m3852a(map.get("description")));
        bundle.putBoolean("isNew", false);
        bundle.putInt("period", this.f2938l.getCurrentTab());
        intent.putExtras(bundle);
        startActivityForResult(intent, 0);
    }

    private boolean m2838a(Context context, ro roVar) {
        this.f2951y = new ArrayList();
        this.f2952z = new ArrayList();
        this.f2919A = new ArrayList();
        this.f2920B = new ArrayList();
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
                    String str = "" + r18;
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
                    if (getResources().getString(2131099721).equals(string4)) {
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
                        this.f2951y.add(hashMap);
                    }
                    if ("1".equals(string6)) {
                        this.f2952z.add(hashMap);
                    }
                    if ("2".equals(string6)) {
                        this.f2919A.add(hashMap);
                    }
                    if ("3".equals(string6)) {
                        this.f2920B.add(hashMap);
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

    private void m2841b() {
        this.f2940n = (TextView) findViewById(2131558530);
        ImageView imageView = (ImageView) findViewById(2131558529);
        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), 2130837532));
        imageView.setOnClickListener(new lp(this));
        imageView = (ImageView) findViewById(2131558735);
        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), 2130837641));
        ImageView imageView2 = (ImageView) findViewById(2131558736);
        imageView2.setImageBitmap(BitmapFactory.decodeResource(getResources(), 2130837639));
        imageView.setOnClickListener(new lq(this));
        imageView2.setOnClickListener(new lr(this));
        m2832a();
        ListView listView = (ListView) findViewById(2131558737);
        listView.setOnItemClickListener(new ls(this));
        long a = aba.m3744a(this.f2940n.getText().toString(), ExpenseManager.f3244t, Locale.US);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(a);
        instance.set(11, 0);
        long timeInMillis = instance.getTimeInMillis();
        instance.set(11, 23);
        instance.set(12, 59);
        instance.set(13, 59);
        String str = "expensed>=" + timeInMillis + " AND " + "expensed" + "<=" + instance.getTimeInMillis() + " and " + "category" + "!='Income'";
        this.f2933g = m2831a(this.f2951y, (int) (a / 1000), 0);
        List arrayList = new ArrayList();
        m2835a(this.f2939m, str, this.f2933g, arrayList, this.f2921C);
        View inflate = LayoutInflater.from(this).inflate(2130903045, null);
        if (this.f2937k == 1 || this.f2937k > 3) {
            inflate.setBackgroundColor(-1725816286);
        }
        if (listView.getHeaderViewsCount() == 0) {
            listView.addHeaderView(inflate);
        }
        m2836a(this.f2939m, this.f2933g, (int) (a / 1000), 0);
        listView.setAdapter(new lw(this, 2130903046, this.f2933g, arrayList));
        registerForContextMenu(listView);
        m2833a(listView, this.f2933g, arrayList);
    }

    private void m2843b(Map<?, ?> map) {
        String str = (String) map.get("rowId");
        if (str != null && !"".equals(str)) {
            OnClickListener lnVar = new ln(this, Integer.valueOf(str).intValue());
            Resources resources = this.f2944r.getResources();
            aib.m3849a(this.f2944r, null, resources.getString(2131099805), 17301543, resources.getString(2131099809), resources.getString(2131099983), lnVar, resources.getString(2131099754), null).show();
        }
    }

    private void m2845c() {
        ImageView imageView = (ImageView) findViewById(2131558739);
        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), 2130837641));
        ImageView imageView2 = (ImageView) findViewById(2131558741);
        imageView2.setImageBitmap(BitmapFactory.decodeResource(getResources(), 2130837639));
        imageView.setOnClickListener(new lt(this));
        imageView2.setOnClickListener(new lu(this));
        this.f2928b = (ListView) findViewById(2131558742);
        View inflate = LayoutInflater.from(this).inflate(2130903045, null);
        if (this.f2937k == 1 || this.f2937k > 3) {
            inflate.setBackgroundColor(-1725816286);
        }
        if (this.f2928b.getHeaderViewsCount() == 0) {
            this.f2928b.addHeaderView(inflate);
        }
        this.f2928b.setOnItemClickListener(new lv(this));
        m2847d();
    }

    private void m2847d() {
        try {
            String replace = aba.m3747a(this.f2946t, "All", 2).replace("='null'", "!='null'");
            this.f2933g = m2831a(this.f2952z, this.f2946t, 1);
            List arrayList = new ArrayList();
            m2835a(this.f2939m, replace, this.f2933g, arrayList, this.f2922D);
            m2836a(this.f2939m, this.f2933g, this.f2946t, 1);
            this.f2928b.setAdapter(new lw(this, 2130903046, this.f2933g, arrayList));
            registerForContextMenu(this.f2928b);
            this.f2927a = (TextView) findViewById(2131558740);
            this.f2927a.setText(aba.m3763b(this.f2946t));
            m2833a(this.f2928b, this.f2933g, arrayList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void m2849e() {
        ImageView imageView = (ImageView) findViewById(2131558744);
        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), 2130837641));
        ImageView imageView2 = (ImageView) findViewById(2131558746);
        imageView2.setImageBitmap(BitmapFactory.decodeResource(getResources(), 2130837639));
        imageView.setOnClickListener(new lg(this));
        imageView2.setOnClickListener(new lh(this));
        this.f2930d = (ListView) findViewById(2131558747);
        this.f2930d.setOnItemClickListener(new li(this));
        View inflate = LayoutInflater.from(this).inflate(2130903045, null);
        if (this.f2937k == 1 || this.f2937k > 3) {
            inflate.setBackgroundColor(-1725816286);
        }
        if (this.f2930d.getHeaderViewsCount() == 0) {
            this.f2930d.addHeaderView(inflate);
        }
        m2852f();
    }

    private void m2852f() {
        try {
            String replace = aba.m3764b(this.f2947u, "All", 2).replace("='null'", "!='null'");
            this.f2933g = m2831a(this.f2919A, this.f2947u, 2);
            List arrayList = new ArrayList();
            m2835a(this.f2939m, replace, this.f2933g, arrayList, this.f2923E);
            m2836a(this.f2939m, this.f2933g, this.f2947u, 2);
            this.f2930d.setAdapter(new lw(this, 2130903046, this.f2933g, arrayList));
            registerForContextMenu(this.f2930d);
            this.f2929c = (TextView) findViewById(2131558745);
            this.f2929c.setText(aba.m3776d(this.f2947u));
            m2833a(this.f2930d, this.f2933g, arrayList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void m2854g() {
        ImageView imageView = (ImageView) findViewById(2131558749);
        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), 2130837641));
        ImageView imageView2 = (ImageView) findViewById(2131558751);
        imageView2.setImageBitmap(BitmapFactory.decodeResource(getResources(), 2130837639));
        imageView.setOnClickListener(new lj(this));
        imageView2.setOnClickListener(new lk(this));
        this.f2932f = (ListView) findViewById(2131558752);
        this.f2932f.setOnItemClickListener(new ll(this));
        View inflate = LayoutInflater.from(this).inflate(2130903045, null);
        if (this.f2937k == 1 || this.f2937k > 3) {
            inflate.setBackgroundColor(-1725816286);
        }
        if (this.f2932f.getHeaderViewsCount() == 0) {
            this.f2932f.addHeaderView(inflate);
        }
        m2856h();
    }

    private void m2856h() {
        try {
            String replace = aba.m3771c(this.f2948v, "All", 2).replace("='null'", "!='null'");
            this.f2933g = m2831a(this.f2920B, this.f2948v, 3);
            List arrayList = new ArrayList();
            m2835a(this.f2939m, replace, this.f2933g, arrayList, this.f2924F);
            m2836a(this.f2939m, this.f2933g, this.f2948v, 3);
            this.f2932f.setAdapter(new lw(this, 2130903046, this.f2933g, arrayList));
            registerForContextMenu(this.f2932f);
            this.f2931e = (TextView) findViewById(2131558750);
            this.f2931e.setText(aba.m3779e(this.f2948v));
            m2833a(this.f2932f, this.f2933g, arrayList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void m2858i() {
        aib.m3849a(this.f2944r, null, getResources().getString(2131099805), 17301543, getResources().getString(2131099804), getResources().getString(2131099983), new lm(this), getResources().getString(2131099754), null).show();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.f2950x = extras.getInt("tabId");
            }
        }
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                if (-1 == i2) {
                    this.f2938l.setCurrentTab(this.f2950x);
                    m2838a((Context) this, this.f2939m);
                    switch (this.f2950x) {
                        case C0607c.AdsAttrs_adSize /*0*/:
                            m2841b();
                        case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                            m2845c();
                        case C0607c.LoadingImageView_circleCrop /*2*/:
                            m2849e();
                        case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                            m2854g();
                        default:
                    }
                }
            default:
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        AdapterContextMenuInfo adapterContextMenuInfo = (AdapterContextMenuInfo) menuItem.getMenuInfo();
        String str = "";
        ArrayList arrayList = new ArrayList();
        List list = this.f2933g;
        if (this.f2938l.getCurrentTab() == 0) {
            str = (String) this.f2921C.get((int) adapterContextMenuInfo.id);
        }
        if (this.f2938l.getCurrentTab() == 1) {
            str = (String) this.f2922D.get((int) adapterContextMenuInfo.id);
        }
        if (this.f2938l.getCurrentTab() == 2) {
            str = (String) this.f2923E.get((int) adapterContextMenuInfo.id);
        }
        String str2 = this.f2938l.getCurrentTab() == 3 ? (String) this.f2924F.get((int) adapterContextMenuInfo.id) : str;
        Map map = (Map) list.get((int) adapterContextMenuInfo.id);
        if (menuItem.getItemId() == 10) {
            str = (String) map.get("account");
            str = (String) map.get("category");
            String str3 = (String) map.get("subcategory");
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this.f2944r, ExpenseAccountExpandableList.class);
            bundle.putString("title", ((String) map.get("account")) + ":" + str + ":" + str3);
            bundle.putString("account", (String) map.get("account"));
            bundle.putString("whereClause", str2);
            intent.putExtras(bundle);
            startActivityForResult(intent, 0);
        }
        if (menuItem.getItemId() == 11) {
            m2837a(map);
        }
        if (menuItem.getItemId() == 12) {
            m2843b(map);
        }
        if (menuItem.getItemId() == 13) {
            str = (String) map.get("category");
            str3 = (String) map.get("subcategory");
            bundle = new Bundle();
            intent = new Intent(this.f2944r, ChartNewBudgetChart.class);
            bundle.putString("title", ((String) map.get("account")) + ":" + str + ":" + str3);
            bundle.putString("account", (String) map.get("account"));
            bundle.putString("whereClause", str2);
            bundle.putInt("tab", this.f2938l.getCurrentTab());
            bundle.putString("amount", (String) map.get("amount"));
            intent.putExtras(bundle);
            startActivityForResult(intent, 0);
        }
        return super.onContextItemSelected(menuItem);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        this.f2937k = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        this.f2945s = getIntent().getLongExtra("date", 0);
        this.f2949w = getIntent().getStringExtra("account");
        this.f2950x = getIntent().getIntExtra("tabId", this.f2950x);
        setTitle(2131099743);
        this.f2939m = new ro(this);
        String[] split = getResources().getString(2131099964).split(",");
        if (split != null && split.length == 12) {
            this.f2925G = split;
        }
        Calendar instance = Calendar.getInstance();
        if (this.f2945s != 0) {
            instance.setTimeInMillis(this.f2945s);
        }
        this.f2941o = instance.get(1);
        this.f2942p = instance.get(2);
        this.f2943q = instance.get(5);
        m2838a((Context) this, this.f2939m);
        this.f2938l = getTabHost();
        LayoutInflater.from(this).inflate(2130903089, this.f2938l.getTabContentView(), true);
        this.f2938l.addTab(this.f2938l.newTabSpec("tab1").setIndicator(getResources().getString(2131099791)).setContent(2131558734));
        this.f2938l.addTab(this.f2938l.newTabSpec("tab2").setIndicator(getResources().getString(2131100165)).setContent(2131558738));
        this.f2938l.addTab(this.f2938l.newTabSpec("tab3").setIndicator(getResources().getString(2131099956)).setContent(2131558743));
        this.f2938l.addTab(this.f2938l.newTabSpec("tab4").setIndicator(getResources().getString(2131100179)).setContent(2131558748));
        Bundle bundle2 = new Bundle();
        Intent intent = new Intent(this.f2944r, ExpenseBudgetOnetimeList.class);
        bundle2.putString("account", this.f2949w);
        bundle2.putInt("tabId", 4);
        intent.putExtras(bundle2);
        this.f2938l.addTab(this.f2938l.newTabSpec("tab5").setIndicator(getResources().getString(2131099986)).setContent(intent));
        this.f2938l.setCurrentTab(this.f2950x);
        for (int i = 0; i < 5; i++) {
            View childTabViewAt = this.f2938l.getTabWidget().getChildTabViewAt(i);
            childTabViewAt.setPadding(0, 0, 0, 0);
            TextView textView = (TextView) childTabViewAt.findViewById(16908310);
            textView.setSingleLine();
            if ((getResources().getConfiguration().screenLayout & 15) == 4 || (getResources().getConfiguration().screenLayout & 15) == 3) {
                textView.setTextSize(18.0f);
            } else {
                textView.setTextSize(14.0f);
            }
        }
        this.f2938l.setOnTabChangedListener(new lf(this));
        switch (this.f2938l.getCurrentTab()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                m2841b();
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                m2845c();
            case C0607c.LoadingImageView_circleCrop /*2*/:
                m2849e();
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                m2854g();
            default:
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        if (((AdapterContextMenuInfo) contextMenuInfo).id >= 0) {
            contextMenu.setHeaderTitle(2131099743);
            contextMenu.add(0, 10, 0, 2131100163);
            contextMenu.add(0, 11, 0, 2131099860);
            contextMenu.add(0, 12, 0, 2131099802);
            if (this.f2938l.getCurrentTab() == 1 || this.f2938l.getCurrentTab() == 2) {
                contextMenu.add(0, 13, 0, 2131099764);
            }
        }
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                try {
                    return new DatePickerDialog(this, this.f2926H, this.f2941o, this.f2942p, this.f2943q);
                } catch (Exception e) {
                    Calendar instance = Calendar.getInstance();
                    return new DatePickerDialog(this, this.f2926H, instance.get(1), instance.get(2), instance.get(5));
                }
            default:
                return null;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492868, menu);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                return true;
            case 2131558668:
                m2858i();
                return true;
            case 2131559113:
                startActivityForResult(new Intent(this, ExpenseBudgetItems.class), 0);
                return true;
            case 2131559115:
                startActivityForResult(new Intent(this, ExpenseBudgetAdd.class), 0);
                return true;
            case 2131559152:
                startActivityForResult(new Intent(this, ExpenseBudgetOnetimeAdd.class), 0);
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                ((DatePickerDialog) dialog).updateDate(this.f2941o, this.f2942p, this.f2943q);
            default:
        }
    }
}
