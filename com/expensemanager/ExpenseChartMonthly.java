package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Paint.Align;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.gms.C0607c;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import p018c.p019a.C0302a;
import p018c.p019a.C0308b;
import p018c.p019a.p020a.C0291c;
import p018c.p019a.p020a.C0299j;
import p018c.p019a.p021b.C0306d;
import p018c.p019a.p022c.C0312d;

public class ExpenseChartMonthly extends Activity {
    static boolean f3071c;
    String[] f3072a;
    int f3073b;
    private C0306d f3074d;
    private C0312d f3075e;
    private String f3076f;
    private String f3077g;
    private String f3078h;
    private TextView f3079i;
    private C0308b f3080j;
    private Spinner f3081k;
    private Spinner f3082l;
    private String f3083m;
    private ro f3084n;
    private Context f3085o;

    static {
        f3071c = false;
    }

    public ExpenseChartMonthly() {
        this.f3074d = new C0306d();
        this.f3075e = new C0312d();
        this.f3083m = "";
        this.f3085o = this;
        this.f3073b = 0;
    }

    private void m2995a() {
        this.f3084n = new ro(this);
        this.f3083m = getIntent().getStringExtra("account");
        this.f3079i = (TextView) findViewById(2131558476);
        this.f3079i.setText(this.f3083m);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(2131558473);
        Object a = abd.m3786a((Context) this, this.f3084n, "MY_ACCOUNT_NAMES", "Personal Expense");
        if ("All".equals(this.f3083m)) {
            this.f3079i.setText(a);
        }
        this.f3072a = a.split(",");
        relativeLayout.setOnClickListener(new on(this));
        this.f3079i.addTextChangedListener(new oo(this));
        Resources resources = getResources();
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, new ArrayList(Arrays.asList(new String[]{resources.getString(2131099882), resources.getString(2131099932), resources.getString(2131099736), resources.getString(2131099945)})));
        arrayAdapter.setDropDownViewResource(17367049);
        this.f3081k = (Spinner) findViewById(2131558477);
        this.f3081k.setAdapter(arrayAdapter);
        this.f3081k.setSelection(0);
        this.f3081k.setOnItemSelectedListener(new op(this));
        ArrayList arrayList = new ArrayList();
        pw.m4180a(this.f3084n, arrayList);
        arrayList.add(0, "All");
        arrayAdapter = new ArrayAdapter(this, 2130903151, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        this.f3082l = (Spinner) findViewById(2131558478);
        this.f3082l.setAdapter(arrayAdapter);
        this.f3082l.setOnItemSelectedListener(new oq(this));
        m3000c();
        if (this.f3080j != null) {
            this.f3080j.m2052d();
        }
    }

    private void m2996a(List<Map<String, Object>> list) {
        try {
            String str = "expensed ASC";
            this.f3083m = this.f3079i.getText().toString();
            if (this.f3083m != null && this.f3083m.split(",").length == this.f3072a.length) {
                this.f3083m = "All";
            }
            String str2 = "account in (" + abd.m3792a(this.f3079i.getText().toString()) + ")";
            if ("All".equalsIgnoreCase(this.f3083m) || "".equalsIgnoreCase(this.f3083m)) {
                str2 = "category!='Account Transfer'  and account in (" + abd.m3792a(ExpenseManager.f3245u) + ")";
            }
            int selectedItemPosition = this.f3082l.getSelectedItemPosition();
            String str3 = (String) this.f3082l.getItemAtPosition(selectedItemPosition);
            if (selectedItemPosition > 0) {
                int parseInt = Integer.parseInt(str3);
                Calendar instance = Calendar.getInstance();
                instance.set(1, parseInt);
                instance.set(2, ExpenseManager.f3241q);
                instance.set(5, ExpenseManager.f3242r);
                instance.add(5, -1);
                instance.set(11, 23);
                instance.set(12, 59);
                long timeInMillis = instance.getTimeInMillis();
                instance.add(1, 1);
                str3 = str2 + " AND " + "expensed" + ">" + timeInMillis + " AND " + "expensed" + "<=" + instance.getTimeInMillis();
            } else {
                str3 = str2;
            }
            str2 = this.f3079i.getText().toString();
            if (!"".equals(str2) && str2.split(",").length > 1) {
                f3071c = true;
            }
            abd.m3809a(this.f3084n, str3, (List) list, str, f3071c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void m2997a(List<Map<String, Object>> list, int i) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            String a;
            Map map = (Map) list.get(i2);
            String a2 = aba.m3756a((String) map.get("date"));
            String a3 = aba.m3756a((String) map.get("expense"));
            if (i == 0) {
                a3 = aba.m3756a((String) map.get("expense"));
            }
            if (i == 1) {
                a3 = aba.m3756a((String) map.get("income"));
            }
            if (i == 2) {
                a = aba.m3756a((String) map.get("subTotal"));
                if (a.indexOf("(") != -1) {
                    a = a.replace("(", "-").replace(")", "");
                }
            } else {
                a = a3;
            }
            a = a.replaceAll(",", "");
            if (i2 == 0) {
                this.f3076f = a2;
                this.f3077g = a;
            } else {
                this.f3076f += "," + a2;
                this.f3077g += "," + a;
            }
        }
    }

    private void m2999b() {
        m3000c();
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558471);
        if (!(this.f3074d == null || this.f3075e == null || this.f3074d.m2026a() != this.f3075e.m2078c())) {
            this.f3080j = C0302a.m2015a(this.f3085o, this.f3074d, this.f3075e, C0291c.STACKED);
        }
        if (linearLayout.getChildCount() > 0) {
            linearLayout.removeAllViews();
        }
        linearLayout.addView(this.f3080j, new LayoutParams(-1, -1));
    }

    private void m3000c() {
        try {
            List arrayList = new ArrayList();
            m2996a(arrayList);
            m2997a(arrayList, this.f3081k.getSelectedItemPosition());
            String[] split = this.f3076f.split(",");
            String[] split2 = this.f3077g.split(",");
            List arrayList2 = new ArrayList();
            C0312d a = pw.m4175a(pw.m4181a(split2));
            a.m2183o(0);
            a.m2185q(10);
            double[] dArr = new double[split.length];
            double d = 0.0d;
            int i = 0;
            double d2 = 0.0d;
            while (i < split.length) {
                a.m2152a((double) i, split[i] + "      ");
                a.m2154a(Align.CENTER);
                String replace = split2[i].replace(":", "");
                if (replace.trim().equals("")) {
                    replace = "0";
                }
                dArr[i] = (double) Double.valueOf(replace.trim()).intValue();
                double max = Math.max(d2, dArr[i]);
                d = Math.min(d, dArr[i]);
                i++;
                d2 = max;
            }
            if (d < 0.0d) {
                d += d / 10.0d;
            }
            arrayList2.add(dArr);
            int length = split.length;
            if (getResources().getConfiguration().orientation == 1 && length > 15) {
                length = 15;
            }
            if (getResources().getConfiguration().orientation == 2 && r2 > 30) {
                length = 30;
            }
            double d3 = 0.5d + ((double) length);
            pw.m4177a(this.f3085o, a, this.f3078h, "", pw.m4176a(this.f3085o, this.f3084n, getResources().getString(2131099723), this.f3083m), -0.5d, d3, d, d2 + (d2 / 10.0d), -7829368, -16777216);
            if (this.f3073b == 0 || this.f3073b == 2 || this.f3073b == 3) {
                a.m2186r(-1);
                a.m2076b(-12303292);
                a.m2190v(-12303292);
                a.m2153a(0, -12303292);
            }
            this.f3075e = a;
            this.f3074d = pw.m4174a(split, dArr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void m3002d() {
        List arrayList = new ArrayList();
        m2996a(arrayList);
        String[] strArr = new String[arrayList.size()];
        String[] strArr2 = new String[arrayList.size()];
        String[] strArr3 = new String[arrayList.size()];
        String[] strArr4 = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Map map = (Map) arrayList.get(i);
            String a = aba.m3756a((String) map.get("date"));
            String replaceAll = aba.m3756a((String) map.get("expense")).replaceAll(",", "").replaceAll("-", "");
            String replace = replaceAll.indexOf("(") != -1 ? replaceAll.replace("(", "-").replace(")", "") : replaceAll;
            replaceAll = aba.m3756a((String) map.get("income")).replaceAll(",", "").replaceAll("-", "");
            String a2 = aba.m3756a((String) map.get("subTotal"));
            if (a2.indexOf("(") != -1) {
                a2 = a2.replace("(", "-").replace(")", "");
            }
            strArr[i] = a;
            strArr2[i] = replace;
            strArr3[i] = replaceAll;
            strArr4[i] = a2;
        }
        this.f3078h = "Expense,Income,Balance";
        ArrayList arrayList2 = new ArrayList();
        int[] iArr = new int[]{-65536, -16744448, -16777216};
        C0299j[] c0299jArr = new C0299j[]{C0299j.CIRCLE, C0299j.CIRCLE, C0299j.CIRCLE};
        C0312d c0312d = new C0312d();
        pw.m4179a(c0312d, iArr, c0299jArr);
        c0312d.m2183o(0);
        c0312d.m2185q(10);
        Object obj = new double[strArr.length];
        Object obj2 = new double[strArr.length];
        Object obj3 = new double[strArr.length];
        double d = 0.0d;
        int i2 = 0;
        double d2 = 0.0d;
        while (i2 < strArr.length) {
            c0312d.m2152a((double) i2, strArr[i2] + "      ");
            c0312d.m2154a(Align.CENTER);
            replaceAll = strArr2[i2].replace(",", "");
            if (replaceAll.trim().equals("")) {
                replaceAll = "0";
            }
            obj[i2] = (double) aib.m3879k(replaceAll.trim());
            replaceAll = strArr3[i2].replace(",", "");
            if (replaceAll.trim().equals("")) {
                replaceAll = "0";
            }
            obj2[i2] = (double) aib.m3879k(replaceAll.trim());
            replaceAll = strArr4[i2].replace(",", "");
            if (replaceAll.trim().equals("")) {
                replaceAll = "0";
            }
            obj3[i2] = (double) aib.m3879k(replaceAll.trim());
            double max = Math.max(Math.max(d2, obj[i2]), obj2[i2]);
            d = Math.min(d, obj3[i2]);
            i2++;
            d2 = max;
        }
        double d3 = d < 0.0d ? d + (d / 10.0d) : d;
        arrayList2.add(obj);
        arrayList2.add(obj2);
        arrayList2.add(obj3);
        pw.m4177a(this, c0312d, this.f3078h, "", pw.m4176a(this, this.f3084n, getResources().getString(2131099723), this.f3083m), -0.5d, 0.5d + ((double) strArr.length), d3, d2 + (d2 / 10.0d), -7829368, -16777216);
        c0312d.m2085e(true);
        c0312d.m2086f(true);
        c0312d.m2075b(22.0f);
        if (this.f3073b == 0 || this.f3073b == 2 || this.f3073b == 3) {
            c0312d.m2186r(-1);
            c0312d.m2076b(-12303292);
            c0312d.m2190v(-12303292);
            c0312d.m2153a(0, -12303292);
        }
        this.f3080j = C0302a.m2014a((Context) this, pw.m4173a(new String[]{"Expense", "Income", "Balance"}, (List) arrayList2), c0312d);
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558471);
        if (linearLayout.getChildCount() > 0) {
            linearLayout.removeAllViews();
        }
        linearLayout.addView(this.f3080j, new LayoutParams(-2, -2));
    }

    private void m3005e() {
        Bitmap e = this.f3080j.m2053e();
        try {
            String str = this.f3083m + ".png";
            e.compress(CompressFormat.PNG, 100, new FileOutputStream(new File(co.f4430d, str)));
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("plain/text");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
            intent.putExtra("android.intent.extra.SUBJECT", getResources().getString(2131099725) + ":" + str);
            intent.putExtra("android.intent.extra.TEXT", getResources().getString(2131099869));
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(co.f4430d + "/" + str)));
            startActivity(Intent.createChooser(intent, "Send mail..."));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        this.f3073b = sharedPreferences.getInt("THEME_COLOR", 0);
        int i = sharedPreferences.getInt("CHART_THEME", -1);
        if (i != -1) {
            this.f3073b = i;
        }
        if (this.f3073b == 0 || this.f3073b == 2 || this.f3073b == 3) {
            setTheme(2131230725);
        } else {
            setTheme(2131230723);
        }
        setContentView(2130903053);
        m2995a();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 0, 0, 2131099869).setIcon(2130837600).setShowAsAction(2);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                m3005e();
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }

    protected void onResume() {
        super.onResume();
        if (this.f3080j == null) {
            LinearLayout linearLayout = (LinearLayout) findViewById(2131558471);
            if (!(this.f3074d == null || this.f3075e == null || this.f3074d.m2026a() != this.f3075e.m2078c())) {
                this.f3080j = C0302a.m2015a(this, this.f3074d, this.f3075e, C0291c.STACKED);
            }
            linearLayout.addView(this.f3080j, new LayoutParams(-1, -1));
            return;
        }
        this.f3080j.m2052d();
    }
}
