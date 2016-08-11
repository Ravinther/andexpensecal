package com.expensemanager;

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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p018c.p019a.C0302a;
import p018c.p019a.p020a.C0291c;
import p018c.p019a.p020a.C0299j;
import p018c.p019a.p021b.C0306d;
import p018c.p019a.p022c.C0312d;

public class oh extends C0032l {
    int f5077a;
    LinearLayout f5078b;
    private C0306d f5079c;
    private C0312d f5080d;
    private String f5081e;

    public oh() {
        this.f5079c = new C0306d();
        this.f5080d = new C0312d();
    }

    static oh m4156a(int i) {
        oh ohVar = new oh();
        Bundle bundle = new Bundle();
        bundle.putInt("num", i);
        ohVar.m311g(bundle);
        return ohVar;
    }

    private void m4157a(String[] strArr, String[] strArr2) {
        ExpenseChartDate.f3052u = "BAR";
        try {
            List arrayList = new ArrayList();
            C0312d a = pw.m4175a(pw.m4181a(strArr2));
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
            pw.m4177a(m315i(), a, this.f5081e, "", pw.m4176a(m315i(), ExpenseChartDate.f3051s, m317j().getString(2131099723), ExpenseChartDate.f3047J), -0.5d, d3, d, d2 + (d2 / 10.0d), -7829368, -16777216);
            a.m2168e(0.0d);
            if (ExpenseChartDate.f3053v == 0 || ExpenseChartDate.f3053v == 2 || ExpenseChartDate.f3053v == 3) {
                a.m2186r(-1);
                a.m2076b(-12303292);
                a.m2190v(-12303292);
                a.m2153a(0, -12303292);
            }
            this.f5080d = a;
            this.f5079c = pw.m4174a(strArr, (double[]) obj);
            if (!(this.f5079c == null || this.f5080d == null || this.f5079c.m2026a() != this.f5080d.m2078c())) {
                ExpenseChartDate.f3048L = C0302a.m2015a(m315i(), this.f5079c, this.f5080d, C0291c.STACKED);
                if (ExpenseChartDate.f3053v == 1 || ExpenseChartDate.f3053v > 3) {
                    ExpenseChartDate.f3048L.setBackgroundColor(-16777216);
                }
            }
            if (this.f5078b.getChildCount() > 0) {
                this.f5078b.removeAllViews();
            }
            this.f5078b.addView(ExpenseChartDate.f3048L, new LayoutParams(-1, -1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void m4158a(String[] strArr, String[] strArr2, String str) {
        ExpenseChartDate.f3052u = "LINE";
        this.f5081e = "Expense Weekly Chart";
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[]{-16711936};
        if (ExpenseChartDate.f3053v == 0 || ExpenseChartDate.f3053v == 2 || ExpenseChartDate.f3053v == 3) {
            iArr = new int[]{-16777216};
        }
        C0299j[] c0299jArr = new C0299j[]{C0299j.CIRCLE};
        C0312d c0312d = new C0312d();
        pw.m4179a(c0312d, iArr, c0299jArr);
        c0312d.m2183o(0);
        c0312d.m2185q(10);
        Object obj = new double[strArr.length];
        double d = 0.0d;
        int i = 0;
        double d2 = 0.0d;
        while (i < strArr.length) {
            c0312d.m2152a((double) i, strArr[i] + "      ");
            c0312d.m2154a(Align.CENTER);
            String replace = strArr2[i].replace(":", "");
            if (replace.trim().equals("")) {
                replace = "0";
            }
            obj[i] = (double) aib.m3879k(replace.trim());
            double max = Math.max(d2, obj[i]);
            d = Math.min(d, obj[i]);
            i++;
            d2 = max;
        }
        double d3 = d < 0.0d ? d + (d / 10.0d) : d;
        arrayList.add(obj);
        pw.m4177a(m315i(), c0312d, this.f5081e, "", pw.m4176a(m315i(), ExpenseChartDate.f3051s, m317j().getString(2131099723), ExpenseChartDate.f3047J), -0.5d, 0.5d + ((double) strArr.length), d3, d2 + (d2 / 10.0d), -7829368, -16777216);
        if (ExpenseChartDate.f3053v == 0 || ExpenseChartDate.f3053v == 2 || ExpenseChartDate.f3053v == 3) {
            c0312d.m2186r(-1);
            c0312d.m2076b(-12303292);
            c0312d.m2190v(-12303292);
            c0312d.m2153a(0, -12303292);
        }
        ExpenseChartDate.f3048L = C0302a.m2014a(m315i(), pw.m4173a(new String[]{this.f5081e}, (List) arrayList), c0312d);
        if (ExpenseChartDate.f3053v == 1 || ExpenseChartDate.f3053v > 3) {
            ExpenseChartDate.f3048L.setBackgroundColor(-16777216);
        }
        if (this.f5078b.getChildCount() > 0) {
            this.f5078b.removeAllViews();
        }
        this.f5078b.addView(ExpenseChartDate.f3048L, new LayoutParams(-2, -2));
    }

    private void m4159b(int i) {
        String str;
        String str2;
        List c;
        ArrayList arrayList;
        String str3;
        List list;
        List list2;
        String a;
        List b;
        String[] strArr;
        String[] strArr2;
        int i2;
        Map map;
        ExpenseChartDate.f3051s = new ro(m315i());
        List arrayList2 = new ArrayList();
        String str4 = "account in (" + abd.m3792a(ExpenseChartDate.f3055y.getText().toString()) + ") and " + "category" + "!='Income' ";
        List arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Object obj;
        Object obj2;
        if (ExpenseChartDate.f3050r.size() > 0) {
            try {
                HashMap hashMap = (HashMap) ExpenseChartDate.f3050r.get(i);
                str = (String) hashMap.get("fromDate");
                str2 = (String) hashMap.get("toDate");
                DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
                Date parse = simpleDateFormat.parse(str);
                simpleDateFormat.parse(str2);
                str4 = (str4 + " AND " + "expensed" + ">=" + abd.m3818c(str)) + " AND " + "expensed" + "<=" + abd.m3820d(str2);
                arrayList3 = ExpenseChartDate.m2962a(parse);
                try {
                    c = ExpenseChartDate.m2977c(parse);
                } catch (Exception e) {
                    arrayList = arrayList4;
                    c = arrayList3;
                    str3 = str4;
                    obj = arrayList5;
                    obj2 = arrayList;
                    list = c;
                    str2 = str3;
                    str = ExpenseChartDate.f3045D.getSelectedItemPosition() != 0 ? str2 + " and " + "category" + "!='Account Transfer' " : str2;
                    str2 = "";
                    str3 = ExpenseChartDate.f3055y.getText().toString();
                    ExpenseChartDate.f3054w = true;
                    if (ExpenseChartDate.f3042A.isChecked()) {
                        str2 = ExpenseChartDate.m2961a(ExpenseChartDate.f3051s, str, arrayList2, list, "Weekly", ExpenseChartDate.f3054w);
                    }
                    if (ExpenseChartDate.f3043B.isChecked()) {
                        str2 = ExpenseChartDate.m2961a(ExpenseChartDate.f3051s, str, arrayList2, list2, "Monthly", ExpenseChartDate.f3054w);
                    }
                    a = ExpenseChartDate.f3044C.isChecked() ? ExpenseChartDate.m2961a(ExpenseChartDate.f3051s, str, arrayList2, b, "Yearly", ExpenseChartDate.f3054w) : str2;
                    strArr = new String[arrayList2.size()];
                    strArr2 = new String[arrayList2.size()];
                    for (i2 = 0; i2 < arrayList2.size(); i2++) {
                        map = (Map) arrayList2.get(i2);
                        str = aba.m3756a((String) map.get("expenseDate"));
                        str2 = aba.m3756a((String) map.get("amount")).replaceAll(",", "").replaceAll("-", "");
                        strArr[i2] = str;
                        strArr2[i2] = str2;
                    }
                    if ("BAR".equals(ExpenseChartDate.f3052u)) {
                        m4158a(strArr, strArr2, a);
                    } else {
                        m4157a(strArr, strArr2);
                    }
                    ExpenseChartDate.f3051s.m4201b();
                }
                try {
                    list2 = c;
                    list = arrayList3;
                    str2 = str4;
                    b = ExpenseChartDate.m2972b(parse);
                } catch (Exception e2) {
                    List list3 = c;
                    str3 = str4;
                    c = arrayList3;
                    obj = arrayList5;
                    obj2 = arrayList;
                    list = c;
                    str2 = str3;
                    if (ExpenseChartDate.f3045D.getSelectedItemPosition() != 0) {
                    }
                    str2 = "";
                    str3 = ExpenseChartDate.f3055y.getText().toString();
                    ExpenseChartDate.f3054w = true;
                    if (ExpenseChartDate.f3042A.isChecked()) {
                        str2 = ExpenseChartDate.m2961a(ExpenseChartDate.f3051s, str, arrayList2, list, "Weekly", ExpenseChartDate.f3054w);
                    }
                    if (ExpenseChartDate.f3043B.isChecked()) {
                        str2 = ExpenseChartDate.m2961a(ExpenseChartDate.f3051s, str, arrayList2, list2, "Monthly", ExpenseChartDate.f3054w);
                    }
                    if (ExpenseChartDate.f3044C.isChecked()) {
                    }
                    strArr = new String[arrayList2.size()];
                    strArr2 = new String[arrayList2.size()];
                    for (i2 = 0; i2 < arrayList2.size(); i2++) {
                        map = (Map) arrayList2.get(i2);
                        str = aba.m3756a((String) map.get("expenseDate"));
                        str2 = aba.m3756a((String) map.get("amount")).replaceAll(",", "").replaceAll("-", "");
                        strArr[i2] = str;
                        strArr2[i2] = str2;
                    }
                    if ("BAR".equals(ExpenseChartDate.f3052u)) {
                        m4158a(strArr, strArr2, a);
                    } else {
                        m4157a(strArr, strArr2);
                    }
                    ExpenseChartDate.f3051s.m4201b();
                }
            } catch (Exception e3) {
                arrayList = arrayList4;
                c = arrayList3;
                str3 = str4;
                obj = arrayList5;
                obj2 = arrayList;
                list = c;
                str2 = str3;
                if (ExpenseChartDate.f3045D.getSelectedItemPosition() != 0) {
                }
                str2 = "";
                str3 = ExpenseChartDate.f3055y.getText().toString();
                ExpenseChartDate.f3054w = true;
                if (ExpenseChartDate.f3042A.isChecked()) {
                    str2 = ExpenseChartDate.m2961a(ExpenseChartDate.f3051s, str, arrayList2, list, "Weekly", ExpenseChartDate.f3054w);
                }
                if (ExpenseChartDate.f3043B.isChecked()) {
                    str2 = ExpenseChartDate.m2961a(ExpenseChartDate.f3051s, str, arrayList2, list2, "Monthly", ExpenseChartDate.f3054w);
                }
                if (ExpenseChartDate.f3044C.isChecked()) {
                }
                strArr = new String[arrayList2.size()];
                strArr2 = new String[arrayList2.size()];
                for (i2 = 0; i2 < arrayList2.size(); i2++) {
                    map = (Map) arrayList2.get(i2);
                    str = aba.m3756a((String) map.get("expenseDate"));
                    str2 = aba.m3756a((String) map.get("amount")).replaceAll(",", "").replaceAll("-", "");
                    strArr[i2] = str;
                    strArr2[i2] = str2;
                }
                if ("BAR".equals(ExpenseChartDate.f3052u)) {
                    m4158a(strArr, strArr2, a);
                } else {
                    m4157a(strArr, strArr2);
                }
                ExpenseChartDate.f3051s.m4201b();
            }
        }
        obj2 = arrayList4;
        str2 = str4;
        obj = arrayList5;
        list = arrayList3;
        if (ExpenseChartDate.f3045D.getSelectedItemPosition() != 0) {
        }
        str2 = "";
        str3 = ExpenseChartDate.f3055y.getText().toString();
        if (!"".equals(str3) && str3.split(",").length > 1) {
            ExpenseChartDate.f3054w = true;
        }
        if (ExpenseChartDate.f3042A.isChecked()) {
            str2 = ExpenseChartDate.m2961a(ExpenseChartDate.f3051s, str, arrayList2, list, "Weekly", ExpenseChartDate.f3054w);
        }
        if (ExpenseChartDate.f3043B.isChecked()) {
            str2 = ExpenseChartDate.m2961a(ExpenseChartDate.f3051s, str, arrayList2, list2, "Monthly", ExpenseChartDate.f3054w);
        }
        if (ExpenseChartDate.f3044C.isChecked()) {
        }
        strArr = new String[arrayList2.size()];
        strArr2 = new String[arrayList2.size()];
        for (i2 = 0; i2 < arrayList2.size(); i2++) {
            map = (Map) arrayList2.get(i2);
            str = aba.m3756a((String) map.get("expenseDate"));
            str2 = aba.m3756a((String) map.get("amount")).replaceAll(",", "").replaceAll("-", "");
            strArr[i2] = str;
            strArr2[i2] = str2;
        }
        if ("BAR".equals(ExpenseChartDate.f3052u)) {
            m4157a(strArr, strArr2);
        } else {
            m4158a(strArr, strArr2, a);
        }
        ExpenseChartDate.f3051s.m4201b();
    }

    public View m4160a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = LayoutInflater.from(m315i()).inflate(2130903051, null);
        this.f5078b = (LinearLayout) inflate.findViewById(2131558471);
        this.f5078b.setBackgroundColor(0);
        ((Button) inflate.findViewById(2131558472)).setVisibility(8);
        m4159b(this.f5077a);
        return inflate;
    }

    public void m4161a(Bundle bundle) {
        super.m283a(bundle);
        this.f5077a = m313h() != null ? m313h().getInt("num") : 1;
    }
}
