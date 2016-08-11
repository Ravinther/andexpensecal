package com.expensemanager;

import android.graphics.Color;
import android.graphics.Paint.Align;
import android.os.Bundle;
import android.support.v4.app.C0032l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import p018c.p019a.C0302a;
import p018c.p019a.p020a.C0291c;
import p018c.p019a.p021b.C0303a;
import p018c.p019a.p021b.C0306d;
import p018c.p019a.p022c.C0310b;
import p018c.p019a.p022c.C0311c;
import p018c.p019a.p022c.C0312d;

public class pv extends C0032l {
    int f5152a;
    LinearLayout f5153b;
    private C0306d f5154c;
    private C0312d f5155d;
    private String f5156e;

    public pv() {
        this.f5154c = new C0306d();
        this.f5155d = new C0312d();
    }

    static pv m4166a(int i) {
        pv pvVar = new pv();
        Bundle bundle = new Bundle();
        bundle.putInt("num", i);
        pvVar.m311g(bundle);
        return pvVar;
    }

    private void m4167a(String str, int i) {
        String str2;
        String str3;
        int i2 = 0;
        ExpenseChartSummary.f3118s = new ro(m315i());
        List arrayList = new ArrayList();
        String str4 = "Income".equalsIgnoreCase(str) ? "account in (" + abd.m3792a(ExpenseChartSummary.f3122y.getText().toString()) + ") and " + "category" + "='Income' " : "account in (" + abd.m3792a(ExpenseChartSummary.f3122y.getText().toString()) + ") and " + "category" + "!='Income' ";
        if (ExpenseChartSummary.f3117r.size() > 1) {
            try {
                HashMap hashMap = (HashMap) ExpenseChartSummary.f3117r.get(i);
                str2 = (String) hashMap.get("fromDate");
                str3 = (String) hashMap.get("toDate");
                DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
                Date parse = simpleDateFormat.parse(str2);
                Date parse2 = simpleDateFormat.parse(str3);
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(parse.getTime());
                instance.set(11, 0);
                Calendar instance2 = Calendar.getInstance();
                instance2.setTimeInMillis(parse2.getTime());
                instance2.set(11, 23);
                instance2.set(12, 59);
                str4 = (str4 + " AND " + "expensed" + ">=" + instance.getTimeInMillis()) + " AND " + "expensed" + "<=" + instance2.getTimeInMillis();
            } catch (Exception e) {
            }
        }
        str3 = !"Income".equalsIgnoreCase(str) ? str4 + " and " + "category" + "!='Income' " : str4 + " and " + "category" + "='Income' ";
        if (ExpenseChartSummary.f3112D.getSelectedItemPosition() == 7 || ExpenseChartSummary.f3112D.getSelectedItemPosition() == 9) {
            str3 = str3 + " and " + "category" + "!='Account Transfer' ";
        }
        str2 = ExpenseChartSummary.f3112D.getSelectedItemPosition() == 8 ? str3 + " and " + "subcategory" + "!='Account Transfer' " : str3;
        str3 = ExpenseChartSummary.f3122y.getText().toString();
        if (!"".equals(str3) && str3.split(",").length > 1) {
            ExpenseChartSummary.f3121w = true;
        }
        str4 = ExpenseChartSummary.m3034a(ExpenseChartSummary.f3118s, str2, arrayList, str, "expensed DESC", ExpenseChartSummary.f3121w);
        boolean z = ExpenseChartSummary.f3112D.getSelectedItemPosition() == 8 || ExpenseChartSummary.f3112D.getSelectedItemPosition() == 1;
        arrayList = abd.m3801a(arrayList, z, "name");
        String[] strArr = new String[arrayList.size()];
        String[] strArr2 = new String[arrayList.size()];
        while (i2 < arrayList.size()) {
            Map map = (Map) arrayList.get(i2);
            String a = aba.m3756a((String) map.get("name"));
            str3 = (ExpenseChartSummary.f3112D.getSelectedItemPosition() == 1 || ExpenseChartSummary.f3112D.getSelectedItemPosition() == 8) ? aba.m3756a((String) map.get("incomeAmount")) : aba.m3756a((String) map.get("expenseAmount"));
            str3 = str3.replaceAll(",", "");
            strArr[i2] = a;
            strArr2[i2] = str3;
            i2++;
        }
        if ("BAR".equals(ExpenseChartSummary.f3119u)) {
            m4168a(strArr, strArr2);
        } else {
            m4169a(strArr, strArr2, str4);
        }
        ExpenseChartSummary.f3118s.m4201b();
    }

    private void m4168a(String[] strArr, String[] strArr2) {
        ExpenseChartSummary.f3119u = "BAR";
        try {
            List arrayList = new ArrayList();
            C0312d a = pw.m4175a(pw.m4182b(strArr2));
            a.m2183o(0);
            a.m2185q(10);
            Object obj = new double[strArr.length];
            double d = 0.0d;
            int i = 0;
            double d2 = 0.0d;
            while (i < strArr.length) {
                a.m2152a((double) i, strArr[i] + "      ");
                a.m2154a(Align.CENTER);
                String replace = strArr2[i].replace(":", "");
                if (replace.trim().equals("")) {
                    replace = "0";
                }
                obj[i] = (double) Double.valueOf(replace.trim()).intValue();
                double max = Math.max(d2, obj[i]);
                d = Math.min(d, obj[i]);
                i++;
                d2 = max;
            }
            if (d < 0.0d) {
                d += d / 10.0d;
            }
            arrayList.add(obj);
            int length = strArr.length;
            if (length > 15) {
                length = 15;
            }
            double d3 = 0.5d + ((double) length);
            pw.m4177a(m315i(), a, this.f5156e, "", pw.m4176a(m315i(), ExpenseChartSummary.f3118s, m317j().getString(2131099723), ExpenseChartSummary.f3114J), -0.5d, d3, d, d2 + (d2 / 10.0d), -7829368, -16777216);
            if (ExpenseChartSummary.f3120v == 0 || ExpenseChartSummary.f3120v == 2 || ExpenseChartSummary.f3120v == 3) {
                a.m2186r(-1);
                a.m2076b(-12303292);
                a.m2190v(-12303292);
                a.m2153a(0, -12303292);
            }
            this.f5155d = a;
            this.f5154c = pw.m4174a(strArr, (double[]) obj);
            if (!(this.f5154c == null || this.f5155d == null || this.f5154c.m2026a() != this.f5155d.m2078c())) {
                ExpenseChartSummary.f3115L = C0302a.m2015a(m315i(), this.f5154c, this.f5155d, C0291c.STACKED);
                if (ExpenseChartSummary.f3120v == 1 || ExpenseChartSummary.f3120v > 3) {
                    ExpenseChartSummary.f3115L.setBackgroundColor(-16777216);
                }
            }
            if (this.f5153b.getChildCount() > 0) {
                this.f5153b.removeAllViews();
            }
            this.f5153b.addView(ExpenseChartSummary.f3115L, new LayoutParams(-1, -1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void m4169a(String[] strArr, String[] strArr2, String str) {
        ExpenseChartSummary.f3119u = "PIE";
        C0303a c0303a = new C0303a(this.f5156e);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        int i2 = 0;
        double d = 0.0d;
        int i3 = 0;
        while (i3 < strArr.length) {
            try {
                Object obj = strArr[i3];
                String str2 = strArr2[i3];
                int abs = Math.abs(aba.m3761b(str, str2));
                if (abs > 1 || aib.m3865b(str2).equals("") || aib.m3865b(str).equals("")) {
                    if (abs != 0) {
                        arrayList.add(obj);
                        hashMap.put(obj, "" + abs);
                        arrayList2.add(Integer.valueOf(abs));
                        arrayList3.add(Float.valueOf(Math.abs(pw.m4172a(str, str2))));
                        i++;
                    }
                    i3++;
                } else {
                    d = aba.m3742a(d, str2);
                    i2++;
                    i3++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Collections.sort(arrayList2, Collections.reverseOrder());
        if (i2 > 0) {
            i3 = Math.abs(aba.m3761b(str, "" + d));
            arrayList.add("Other " + i2 + " items");
            hashMap.put("Other " + i2 + " items", "" + i3);
            arrayList2.add(Integer.valueOf(Math.abs(aba.m3761b(str, "" + d))));
            arrayList3.add(Float.valueOf(Math.abs(pw.m4172a(str, "" + d))));
            i++;
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            int i5;
            int intValue = ((Integer) arrayList2.get(i4)).intValue();
            float floatValue = ((Float) arrayList3.get(i4)).floatValue();
            for (i5 = 0; i5 < arrayList.size(); i5++) {
                try {
                    String str3 = (String) hashMap.get(arrayList.get(i5));
                    if (str3 != null && str3.equals("" + intValue)) {
                        c0303a.m2021a((String) arrayList.get(i5), (double) floatValue);
                        hashMap.remove(str3);
                        arrayList.remove(i5);
                        break;
                    }
                } catch (Exception e2) {
                }
            }
        }
        C0310b c0310b = new C0310b();
        Random random = new Random();
        for (i3 = 0; i3 < i; i3++) {
            i5 = random.nextInt(256);
            intValue = random.nextInt(256);
            int nextInt = random.nextInt(256);
            C0311c c0311c = new C0311c();
            if (i3 >= co.f4427a.length) {
                c0311c.m2112a(Color.rgb(i5, intValue, nextInt));
            } else {
                c0311c.m2112a(co.f4427a[i3]);
            }
            c0311c.m2113a(NumberFormat.getPercentInstance());
            c0310b.m2071a(c0311c);
        }
        c0310b.m2070a(15.0f);
        c0310b.m2075b(17.0f);
        float f = m317j().getDisplayMetrics().density;
        if (((double) f) > 1.5d) {
            c0310b.m2070a(22.0f);
            c0310b.m2075b(22.0f);
        }
        if (((double) f) > 2.5d) {
            c0310b.m2070a(28.0f);
            c0310b.m2075b(28.0f);
        }
        c0310b.m2076b(-1);
        if (ExpenseChartSummary.f3120v == 0 || ExpenseChartSummary.f3120v == 2 || ExpenseChartSummary.f3120v == 3) {
            c0310b.m2076b(-16777216);
        }
        if (m317j().getConfiguration().orientation == 1) {
            c0310b.m2080c(130);
        } else {
            c0310b.m2080c(100);
        }
        c0310b.m2089g(true);
        c0310b.m2086f(true);
        c0310b.m2091h(true);
        ExpenseChartSummary.f3115L = C0302a.m2013a(m315i(), c0303a, c0310b);
        if (ExpenseChartSummary.f3120v == 1 || ExpenseChartSummary.f3120v > 3) {
            ExpenseChartSummary.f3115L.setBackgroundColor(-16777216);
        }
        if (this.f5153b.getChildCount() > 0) {
            this.f5153b.removeAllViews();
        }
        this.f5153b.addView(ExpenseChartSummary.f3115L, new LayoutParams(-2, -2));
    }

    public View m4170a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = LayoutInflater.from(m315i()).inflate(2130903051, null);
        this.f5153b = (LinearLayout) inflate.findViewById(2131558471);
        ((Button) inflate.findViewById(2131558472)).setVisibility(8);
        m4167a(ExpenseChartSummary.f3113I, this.f5152a);
        return inflate;
    }

    public void m4171a(Bundle bundle) {
        super.m283a(bundle);
        this.f5152a = m313h() != null ? m313h().getInt("num") : 1;
    }
}
