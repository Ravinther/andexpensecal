package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import p018c.p019a.C0302a;
import p018c.p019a.C0308b;
import p018c.p019a.p020a.C0291c;
import p018c.p019a.p021b.C0303a;
import p018c.p019a.p021b.C0306d;
import p018c.p019a.p022c.C0310b;
import p018c.p019a.p022c.C0311c;
import p018c.p019a.p022c.C0312d;

public class ExpenseChartBuilder extends Activity {
    int f2999a;
    private String f3000b;
    private C0306d f3001c;
    private C0312d f3002d;
    private C0303a f3003e;
    private C0310b f3004f;
    private Button f3005g;
    private String f3006h;
    private String f3007i;
    private String f3008j;
    private String f3009k;
    private String f3010l;
    private int f3011m;
    private C0308b f3012n;
    private String f3013o;
    private ro f3014p;

    public ExpenseChartBuilder() {
        this.f3000b = "BAR";
        this.f3001c = new C0306d();
        this.f3002d = new C0312d();
        this.f3011m = 2131100025;
        this.f3013o = "";
        this.f2999a = 0;
    }

    private String m2925a(String str, String str2) {
        String str3 = "";
        int a = abd.m3783a((Context) this, this.f3014p, str2 + "_CURRENCY", -1);
        if (a != -1) {
            str3 = co.f4436j[a];
            str3 = str3.substring(str3.indexOf(":") + 1);
        }
        return (str3 == null || "".equals(str3)) ? str : str + " (" + str3 + ")";
    }

    private void m2926a() {
        this.f3000b = "BAR";
        try {
            String[] strArr = new String[]{this.f3008j};
            String[] split = this.f3006h.split(",");
            String[] split2 = this.f3007i.split(",");
            ArrayList arrayList = new ArrayList();
            C0312d a = m2930a(new int[]{-16744448});
            a.m2183o(1);
            a.m2185q(10);
            Object obj = new double[split.length];
            double d = 0.0d;
            int i = 0;
            double d2 = 0.0d;
            while (i < split.length) {
                String str = split[i] + "      ";
                if ("DATE_VIEW".equalsIgnoreCase(this.f3009k) && split.length == 7) {
                    str = aba.m3757a(ExpenseManager.f3244t, "MM/dd", str);
                } else if ("DATE_VIEW".equalsIgnoreCase(this.f3009k)) {
                    str = (i + 1) + "";
                }
                a.m2152a((double) (i + 1), str);
                str = split2[i].replace(":", "");
                if (str.trim().equals("")) {
                    str = "0";
                }
                obj[i] = (double) Double.valueOf(str.trim()).intValue();
                double max = Math.max(d2, obj[i]);
                d = Math.min(d, obj[i]);
                i++;
                d2 = max;
            }
            if (d < 0.0d) {
                d += d / 10.0d;
            }
            arrayList.add(obj);
            int length = split.length;
            if (getResources().getConfiguration().orientation == 1 && length > 15) {
                length = 15;
            }
            if (getResources().getConfiguration().orientation == 2 && r4 > 30) {
                length = 30;
            }
            double d3 = 0.5d + ((double) length);
            m2931a(a, this.f3008j, "", m2925a(getResources().getString(2131099723), this.f3013o), -0.5d, d3, d, d2 + (d2 / 10.0d), -7829368, -12303292);
            if (!"DATE_VIEW".equalsIgnoreCase(this.f3009k)) {
                a.m2174g(315.0f);
            }
            a.m2157a(true, true);
            float f = getResources().getDisplayMetrics().density;
            if (((double) f) > 1.5d) {
                a.m2070a(22.0f);
                a.m2169e(20.0f);
                a.m2166d(18.0f);
            }
            if (((double) f) > 2.5d) {
                a.m2070a(28.0f);
                a.m2169e(28.0f);
                a.m2166d(28.0f);
                a.m2172f(45.0f);
            }
            this.f3002d = a;
            this.f3001c = m2929a(strArr, (List) arrayList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void m2927b() {
        int i;
        int i2;
        this.f3000b = "PIE";
        String[] split = this.f3006h.split(",");
        String[] split2 = this.f3007i.split(",");
        C0303a c0303a = new C0303a(this.f3008j);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        double d = 0.0d;
        for (i = 0; i < split.length; i++) {
            try {
                Object obj = split[i];
                if ("DATE_VIEW".equalsIgnoreCase(this.f3009k) && split.length == 7) {
                    obj = aba.m3757a(ExpenseManager.f3244t, "MM/dd", (String) obj);
                }
                String str = split2[i];
                int abs = Math.abs(aba.m3761b(this.f3010l, str));
                if (abs <= 1 && !aib.m3865b(str).equals("")) {
                    if (!aib.m3865b(this.f3010l).equals("")) {
                        d = aba.m3742a(d, str);
                        i4++;
                    }
                }
                if (abs != 0) {
                    arrayList.add(obj);
                    hashMap.put(obj, "" + abs);
                    arrayList2.add(Integer.valueOf(abs));
                    arrayList3.add(Float.valueOf(Math.abs(pw.m4172a(this.f3010l, str))));
                    i3++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Collections.sort(arrayList2, Collections.reverseOrder());
        Collections.sort(arrayList3, Collections.reverseOrder());
        if (i4 > 0) {
            i = Math.abs(aba.m3761b(this.f3010l, "" + d));
            arrayList.add("Other " + i4 + " items");
            hashMap.put("Other " + i4 + " items", "" + i);
            arrayList3.add(Float.valueOf(Math.abs(pw.m4172a(this.f3010l, "" + d))));
            arrayList2.add(Integer.valueOf(i));
            i3++;
        }
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            int intValue = ((Integer) arrayList2.get(i5)).intValue();
            float floatValue = ((Float) arrayList3.get(i5)).floatValue();
            for (i2 = 0; i2 < arrayList.size(); i2++) {
                try {
                    String str2 = (String) hashMap.get(arrayList.get(i2));
                    if (str2 != null && str2.equals("" + intValue)) {
                        c0303a.m2021a((String) arrayList.get(i2), (double) floatValue);
                        hashMap.remove(str2);
                        arrayList.remove(i2);
                        break;
                    }
                } catch (Exception e2) {
                }
            }
        }
        this.f3003e = c0303a;
        C0310b c0310b = new C0310b();
        Random random = new Random();
        for (i = 0; i < i3; i++) {
            i2 = random.nextInt(256);
            intValue = random.nextInt(256);
            int nextInt = random.nextInt(256);
            C0311c c0311c = new C0311c();
            if (i >= co.f4427a.length) {
                c0311c.m2112a(Color.rgb(i2, intValue, nextInt));
            } else {
                c0311c.m2112a(co.f4427a[i]);
            }
            c0311c.m2113a(NumberFormat.getPercentInstance());
            c0310b.m2071a(c0311c);
        }
        c0310b.m2070a(15.0f);
        c0310b.m2075b(17.0f);
        float f = getResources().getDisplayMetrics().density;
        if (((double) f) > 1.5d) {
            c0310b.m2070a(22.0f);
            c0310b.m2075b(22.0f);
        }
        if (((double) f) > 2.5d) {
            c0310b.m2070a(28.0f);
            c0310b.m2075b(28.0f);
        }
        if (this.f2999a == 1 || this.f2999a > 3) {
            c0310b.m2076b(-1);
        } else {
            c0310b.m2076b(-16777216);
        }
        if (getResources().getConfiguration().orientation == 1) {
            c0310b.m2080c(130);
        } else {
            c0310b.m2080c(100);
        }
        c0310b.m2091h(true);
        this.f3004f = c0310b;
    }

    private void m2928c() {
        Bitmap e = this.f3012n.m2053e();
        try {
            String str = this.f3013o + ".png";
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

    protected C0306d m2929a(String[] strArr, List<double[]> list) {
        C0306d c0306d = new C0306d();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            C0303a c0303a = new C0303a(strArr[i]);
            for (double a : (double[]) list.get(i)) {
                c0303a.m2020a(a);
            }
            c0306d.m2028a(c0303a.m2022b());
        }
        return c0306d;
    }

    protected C0312d m2930a(int[] iArr) {
        C0312d c0312d = new C0312d();
        for (int a : iArr) {
            C0311c c0311c = new C0311c();
            c0311c.m2112a(a);
            c0312d.m2071a(c0311c);
        }
        return c0312d;
    }

    protected void m2931a(C0312d c0312d, String str, String str2, String str3, double d, double d2, double d3, double d4, int i, int i2) {
        c0312d.m2155a(str2);
        c0312d.m2161b(str3);
        c0312d.m2150a(d);
        c0312d.m2159b(d2);
        c0312d.m2162c(d3);
        c0312d.m2164d(d4);
        c0312d.m2070a(14.0f);
        if (this.f2999a == 0 || this.f2999a == 2 || this.f2999a == 3) {
            c0312d.m2186r(-1);
            c0312d.m2076b(i2);
            c0312d.m2190v(i2);
            c0312d.m2153a(0, i2);
        }
        c0312d.m2077b(true);
        c0312d.m2072a(true);
        c0312d.m2177i(true);
        c0312d.m2169e(12.0f);
        c0312d.m2085e(false);
        c0312d.m2073a(new int[]{0, 70, 80, 0});
        c0312d.m2172f(35.0f);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f3012n = null;
        onCreate(null);
        onResume();
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        this.f2999a = sharedPreferences.getInt("THEME_COLOR", 0);
        int i = sharedPreferences.getInt("CHART_THEME", -1);
        if (i != -1) {
            this.f2999a = i;
        }
        setContentView(2130903051);
        this.f3014p = new ro(this);
        this.f3006h = getIntent().getStringExtra("xStr");
        this.f3007i = getIntent().getStringExtra("yStr");
        this.f3010l = getIntent().getStringExtra("total");
        this.f3008j = getIntent().getStringExtra("title");
        this.f3009k = getIntent().getStringExtra("viewType");
        this.f3013o = getIntent().getStringExtra("account");
        setTitle(this.f3013o + ": " + this.f3008j);
        this.f3005g = (Button) findViewById(2131558472);
        this.f3005g.setText(this.f3011m);
        if ("income".equals(this.f3009k) || "expense".equals(this.f3009k) || "balance".equals(this.f3009k) || this.f3007i.indexOf("-") != -1) {
            this.f3005g.setVisibility(8);
        } else {
            this.f3005g.setVisibility(0);
        }
        this.f3005g.setOnClickListener(new mz(this));
        if ("BAR".equals(this.f3000b)) {
            m2926a();
        } else {
            m2927b();
        }
        if (this.f3012n != null) {
            this.f3012n.m2052d();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492874, menu);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                return true;
            case 2131559161:
                m2928c();
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }

    protected void onResume() {
        super.onResume();
        try {
            if (this.f3012n == null) {
                LinearLayout linearLayout = (LinearLayout) findViewById(2131558471);
                if (this.f2999a == 1 || this.f2999a > 3) {
                    linearLayout.setBackgroundColor(-16777216);
                } else {
                    linearLayout.setBackgroundColor(-1);
                }
                if (!"BAR".equalsIgnoreCase(this.f3000b)) {
                    this.f3012n = C0302a.m2013a((Context) this, this.f3003e, this.f3004f);
                } else if (!(this.f3001c == null || this.f3002d == null || this.f3001c.m2026a() != this.f3002d.m2078c())) {
                    this.f3012n = C0302a.m2015a(this, this.f3001c, this.f3002d, C0291c.DEFAULT);
                }
                linearLayout.addView(this.f3012n, new LayoutParams(-1, -1));
                return;
            }
            this.f3012n.m2052d();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
