package com.expensemanager;

import android.os.Bundle;
import android.support.v4.app.C0032l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.C0489c;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.p037c.C0476c;
import com.github.mikephil.charting.p037c.C0479f;
import com.github.mikephil.charting.p037c.C0480g;
import com.github.mikephil.charting.p037c.C0481h;
import com.github.mikephil.charting.p037c.C0483j;
import com.github.mikephil.charting.p037c.C0484k;
import com.github.mikephil.charting.p037c.C0485l;
import com.github.mikephil.charting.p040d.C0499f;
import com.github.mikephil.charting.p040d.C0505h;
import com.github.mikephil.charting.p040d.C0507i;
import com.github.mikephil.charting.p040d.C0509j;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class as extends C0032l {
    int f4218a;
    private C0489c f4219b;
    private BarChart f4220c;
    private LineChart f4221d;

    static as m3885a(int i) {
        as asVar = new as();
        Bundle bundle = new Bundle();
        bundle.putInt("num", i);
        asVar.m311g(bundle);
        return asVar;
    }

    private void m3887a(String[] strArr, String[] strArr2, String str) {
        this.f4220c.setVisibility(0);
        this.f4221d.setVisibility(8);
        ChartNewDate.f2489v = "BAR";
        try {
            ck.m4027a(this.f4220c, aib.m3868b(strArr, ","), aib.m3868b(strArr2, ","), ChartNewDate.f2492z, ChartNewDate.f2475A, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void m3888b(int i) {
        String str;
        String str2;
        List c;
        List list;
        List list2;
        List b;
        String str3;
        Object obj;
        Object obj2;
        ArrayList arrayList;
        String[] strArr;
        String[] strArr2;
        int i2;
        Map map;
        String a;
        C0489c c0489c;
        C0489c c0489c2;
        C0489c c0489c3;
        C0489c c0489c4;
        C0489c c0489c5;
        ChartNewDate.f2488t = new ro(m315i());
        List arrayList2 = new ArrayList();
        String str4 = "account in (" + abd.m3792a(ChartNewDate.f2476B.getText().toString()) + ") and " + "category" + "!='Income' ";
        List arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        if (ChartNewDate.f2487s.size() > 0) {
            try {
                HashMap hashMap = (HashMap) ChartNewDate.f2487s.get(i);
                str = (String) hashMap.get("fromDate");
                str2 = (String) hashMap.get("toDate");
                DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
                Date parse = simpleDateFormat.parse(str);
                simpleDateFormat.parse(str2);
                str4 = (str4 + " AND " + "expensed" + ">=" + abd.m3818c(str)) + " AND " + "expensed" + "<=" + abd.m3820d(str2);
                arrayList3 = ChartNewDate.m2416a(parse);
                try {
                    c = ChartNewDate.m2431c(parse);
                    try {
                        list = c;
                        list2 = arrayList3;
                        str2 = str4;
                        b = ChartNewDate.m2426b(parse);
                    } catch (Exception e) {
                        List list3 = c;
                        str3 = str4;
                        c = arrayList3;
                        obj = arrayList5;
                        obj2 = arrayList;
                        list2 = c;
                        str2 = str3;
                        str = ChartNewDate.f2491x != 0 ? str2 : str2 + " and " + "category" + "!='Account Transfer' ";
                        str2 = "";
                        str3 = ChartNewDate.f2476B.getText().toString();
                        ChartNewDate.f2490w = true;
                        if (ChartNewDate.f2478D.isChecked()) {
                            str2 = ChartNewDate.m2415a(ChartNewDate.f2488t, str, arrayList2, list2, "Weekly", ChartNewDate.f2490w);
                        }
                        if (ChartNewDate.f2479E.isChecked()) {
                            str2 = ChartNewDate.m2415a(ChartNewDate.f2488t, str, arrayList2, list, "Monthly", ChartNewDate.f2490w);
                        }
                        str3 = ChartNewDate.f2480F.isChecked() ? str2 : ChartNewDate.m2415a(ChartNewDate.f2488t, str, arrayList2, b, "Yearly", ChartNewDate.f2490w);
                        strArr = new String[arrayList2.size()];
                        strArr2 = new String[arrayList2.size()];
                        for (i2 = 0; i2 < arrayList2.size(); i2++) {
                            map = (Map) arrayList2.get(i2);
                            a = aba.m3756a((String) map.get("expenseDate"));
                            str2 = aba.m3756a((String) map.get("amount")).replaceAll(",", "").replaceAll("-", "");
                            strArr[i2] = a;
                            strArr2[i2] = str2;
                        }
                        if ("BAR".equals(ChartNewDate.f2489v)) {
                            m3887a(strArr, strArr2, str3);
                            this.f4219b = this.f4220c;
                        } else {
                            m3889b(strArr, strArr2, str3);
                            this.f4219b = this.f4221d;
                        }
                        ChartNewDate.f2484N.put(Integer.valueOf(i), this.f4219b);
                        c0489c = (C0489c) ChartNewDate.f2484N.get(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() - 1));
                        c0489c2 = (C0489c) ChartNewDate.f2484N.get(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() - 2));
                        c0489c3 = (C0489c) ChartNewDate.f2484N.get(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem()));
                        c0489c4 = (C0489c) ChartNewDate.f2484N.get(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() + 1));
                        c0489c5 = (C0489c) ChartNewDate.f2484N.get(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() + 2));
                        ChartNewDate.f2484N.clear();
                        ChartNewDate.f2484N.put(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() - 1), c0489c);
                        ChartNewDate.f2484N.put(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() - 2), c0489c2);
                        ChartNewDate.f2484N.put(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem()), c0489c3);
                        ChartNewDate.f2484N.put(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() + 1), c0489c4);
                        ChartNewDate.f2484N.put(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() + 2), c0489c5);
                        ChartNewDate.f2488t.m4201b();
                        this.f4220c.setOnChartValueSelectedListener(new at(this, str));
                    }
                } catch (Exception e2) {
                    arrayList = arrayList4;
                    c = arrayList3;
                    str3 = str4;
                    obj = arrayList5;
                    obj2 = arrayList;
                    list2 = c;
                    str2 = str3;
                    if (ChartNewDate.f2491x != 0) {
                    }
                    str2 = "";
                    str3 = ChartNewDate.f2476B.getText().toString();
                    ChartNewDate.f2490w = true;
                    if (ChartNewDate.f2478D.isChecked()) {
                        str2 = ChartNewDate.m2415a(ChartNewDate.f2488t, str, arrayList2, list2, "Weekly", ChartNewDate.f2490w);
                    }
                    if (ChartNewDate.f2479E.isChecked()) {
                        str2 = ChartNewDate.m2415a(ChartNewDate.f2488t, str, arrayList2, list, "Monthly", ChartNewDate.f2490w);
                    }
                    if (ChartNewDate.f2480F.isChecked()) {
                    }
                    strArr = new String[arrayList2.size()];
                    strArr2 = new String[arrayList2.size()];
                    for (i2 = 0; i2 < arrayList2.size(); i2++) {
                        map = (Map) arrayList2.get(i2);
                        a = aba.m3756a((String) map.get("expenseDate"));
                        str2 = aba.m3756a((String) map.get("amount")).replaceAll(",", "").replaceAll("-", "");
                        strArr[i2] = a;
                        strArr2[i2] = str2;
                    }
                    if ("BAR".equals(ChartNewDate.f2489v)) {
                        m3889b(strArr, strArr2, str3);
                        this.f4219b = this.f4221d;
                    } else {
                        m3887a(strArr, strArr2, str3);
                        this.f4219b = this.f4220c;
                    }
                    ChartNewDate.f2484N.put(Integer.valueOf(i), this.f4219b);
                    c0489c = (C0489c) ChartNewDate.f2484N.get(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() - 1));
                    c0489c2 = (C0489c) ChartNewDate.f2484N.get(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() - 2));
                    c0489c3 = (C0489c) ChartNewDate.f2484N.get(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem()));
                    c0489c4 = (C0489c) ChartNewDate.f2484N.get(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() + 1));
                    c0489c5 = (C0489c) ChartNewDate.f2484N.get(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() + 2));
                    ChartNewDate.f2484N.clear();
                    ChartNewDate.f2484N.put(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() - 1), c0489c);
                    ChartNewDate.f2484N.put(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() - 2), c0489c2);
                    ChartNewDate.f2484N.put(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem()), c0489c3);
                    ChartNewDate.f2484N.put(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() + 1), c0489c4);
                    ChartNewDate.f2484N.put(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() + 2), c0489c5);
                    ChartNewDate.f2488t.m4201b();
                    this.f4220c.setOnChartValueSelectedListener(new at(this, str));
                }
            } catch (Exception e3) {
                arrayList = arrayList4;
                c = arrayList3;
                str3 = str4;
                obj = arrayList5;
                obj2 = arrayList;
                list2 = c;
                str2 = str3;
                if (ChartNewDate.f2491x != 0) {
                }
                str2 = "";
                str3 = ChartNewDate.f2476B.getText().toString();
                ChartNewDate.f2490w = true;
                if (ChartNewDate.f2478D.isChecked()) {
                    str2 = ChartNewDate.m2415a(ChartNewDate.f2488t, str, arrayList2, list2, "Weekly", ChartNewDate.f2490w);
                }
                if (ChartNewDate.f2479E.isChecked()) {
                    str2 = ChartNewDate.m2415a(ChartNewDate.f2488t, str, arrayList2, list, "Monthly", ChartNewDate.f2490w);
                }
                if (ChartNewDate.f2480F.isChecked()) {
                }
                strArr = new String[arrayList2.size()];
                strArr2 = new String[arrayList2.size()];
                for (i2 = 0; i2 < arrayList2.size(); i2++) {
                    map = (Map) arrayList2.get(i2);
                    a = aba.m3756a((String) map.get("expenseDate"));
                    str2 = aba.m3756a((String) map.get("amount")).replaceAll(",", "").replaceAll("-", "");
                    strArr[i2] = a;
                    strArr2[i2] = str2;
                }
                if ("BAR".equals(ChartNewDate.f2489v)) {
                    m3887a(strArr, strArr2, str3);
                    this.f4219b = this.f4220c;
                } else {
                    m3889b(strArr, strArr2, str3);
                    this.f4219b = this.f4221d;
                }
                ChartNewDate.f2484N.put(Integer.valueOf(i), this.f4219b);
                c0489c = (C0489c) ChartNewDate.f2484N.get(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() - 1));
                c0489c2 = (C0489c) ChartNewDate.f2484N.get(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() - 2));
                c0489c3 = (C0489c) ChartNewDate.f2484N.get(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem()));
                c0489c4 = (C0489c) ChartNewDate.f2484N.get(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() + 1));
                c0489c5 = (C0489c) ChartNewDate.f2484N.get(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() + 2));
                ChartNewDate.f2484N.clear();
                ChartNewDate.f2484N.put(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() - 1), c0489c);
                ChartNewDate.f2484N.put(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() - 2), c0489c2);
                ChartNewDate.f2484N.put(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem()), c0489c3);
                ChartNewDate.f2484N.put(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() + 1), c0489c4);
                ChartNewDate.f2484N.put(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() + 2), c0489c5);
                ChartNewDate.f2488t.m4201b();
                this.f4220c.setOnChartValueSelectedListener(new at(this, str));
            }
        }
        obj2 = arrayList4;
        str2 = str4;
        obj = arrayList5;
        list2 = arrayList3;
        if (ChartNewDate.f2491x != 0) {
        }
        str2 = "";
        str3 = ChartNewDate.f2476B.getText().toString();
        if (!"".equals(str3) && str3.split(",").length > 1) {
            ChartNewDate.f2490w = true;
        }
        if (ChartNewDate.f2478D.isChecked()) {
            str2 = ChartNewDate.m2415a(ChartNewDate.f2488t, str, arrayList2, list2, "Weekly", ChartNewDate.f2490w);
        }
        if (ChartNewDate.f2479E.isChecked()) {
            str2 = ChartNewDate.m2415a(ChartNewDate.f2488t, str, arrayList2, list, "Monthly", ChartNewDate.f2490w);
        }
        if (ChartNewDate.f2480F.isChecked()) {
        }
        strArr = new String[arrayList2.size()];
        strArr2 = new String[arrayList2.size()];
        for (i2 = 0; i2 < arrayList2.size(); i2++) {
            map = (Map) arrayList2.get(i2);
            a = aba.m3756a((String) map.get("expenseDate"));
            str2 = aba.m3756a((String) map.get("amount")).replaceAll(",", "").replaceAll("-", "");
            strArr[i2] = a;
            strArr2[i2] = str2;
        }
        if ("BAR".equals(ChartNewDate.f2489v)) {
            m3887a(strArr, strArr2, str3);
            this.f4219b = this.f4220c;
        } else {
            m3889b(strArr, strArr2, str3);
            this.f4219b = this.f4221d;
        }
        ChartNewDate.f2484N.put(Integer.valueOf(i), this.f4219b);
        c0489c = (C0489c) ChartNewDate.f2484N.get(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() - 1));
        c0489c2 = (C0489c) ChartNewDate.f2484N.get(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() - 2));
        c0489c3 = (C0489c) ChartNewDate.f2484N.get(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem()));
        c0489c4 = (C0489c) ChartNewDate.f2484N.get(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() + 1));
        c0489c5 = (C0489c) ChartNewDate.f2484N.get(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() + 2));
        ChartNewDate.f2484N.clear();
        ChartNewDate.f2484N.put(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() - 1), c0489c);
        ChartNewDate.f2484N.put(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() - 2), c0489c2);
        ChartNewDate.f2484N.put(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem()), c0489c3);
        ChartNewDate.f2484N.put(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() + 1), c0489c4);
        ChartNewDate.f2484N.put(Integer.valueOf(ChartNewDate.f2486r.getCurrentItem() + 2), c0489c5);
        ChartNewDate.f2488t.m4201b();
        this.f4220c.setOnChartValueSelectedListener(new at(this, str));
    }

    private void m3889b(String[] strArr, String[] strArr2, String str) {
        this.f4221d.setVisibility(0);
        this.f4220c.setVisibility(8);
        ChartNewDate.f2489v = "LINE";
        this.f4221d.setDrawGridBackground(false);
        this.f4221d.setDescription("");
        this.f4221d.setNoDataText("No Data Available.");
        if (strArr != null && strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int i;
            this.f4221d.setHighlightEnabled(true);
            this.f4221d.setTouchEnabled(true);
            this.f4221d.setDragEnabled(true);
            this.f4221d.setScaleEnabled(true);
            this.f4221d.setPinchZoom(true);
            C0485l axisLeft = this.f4221d.getAxisLeft();
            axisLeft.m4272a(ChartNewDate.f2492z);
            axisLeft.m4356d(true);
            String a = aib.m3850a(aib.m3877i(str) / ((double) strArr2.length));
            C0480g c0480g = new C0480g((float) aib.m3877i(a), "Avg:" + a);
            c0480g.m4320a(2.0f);
            c0480g.m4321a(20.0f, 10.0f, 0.0f);
            c0480g.m4323a(C0481h.POS_RIGHT);
            c0480g.m4325b(10.0f);
            c0480g.m4326b(ChartNewDate.f2492z);
            axisLeft.m4282a(c0480g);
            this.f4221d.getAxisRight().m4274c(false);
            C0483j xAxis = this.f4221d.getXAxis();
            xAxis.m4336a(C0484k.BOTH_SIDED);
            xAxis.m4272a(ChartNewDate.f2492z);
            List arrayList = new ArrayList();
            for (Object add : strArr) {
                arrayList.add(add);
            }
            List arrayList2 = new ArrayList();
            List arrayList3 = new ArrayList();
            for (i = 0; i < strArr.length; i++) {
                arrayList3.add(new C0505h((float) aib.m3877i(strArr2[i]), i));
            }
            C0509j c0509j = new C0509j(arrayList3, null);
            c0509j.m4539c(2.5f);
            c0509j.m4544a(4.0f);
            c0509j.m4495c(ChartNewDate.f2475A);
            c0509j.m4551g(ChartNewDate.f2475A);
            arrayList2.add(c0509j);
            C0499f c0507i = new C0507i(arrayList, arrayList2);
            c0507i.m4469b(ChartNewDate.f2492z);
            c0507i.m4465a(9.0f);
            this.f4221d.setData(c0507i);
            this.f4221d.invalidate();
            C0476c legend = this.f4221d.getLegend();
            legend.m4299a(C0479f.RIGHT_OF_CHART_INSIDE);
            legend.m4272a(ChartNewDate.f2492z);
            legend.m4274c(false);
        }
    }

    public View m3890a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = LayoutInflater.from(m315i()).inflate(2130903055, null);
        this.f4220c = (BarChart) inflate.findViewById(2131558413);
        this.f4221d = (LineChart) inflate.findViewById(2131558481);
        m3888b(this.f4218a);
        return inflate;
    }

    public void m3891a(Bundle bundle) {
        super.m283a(bundle);
        this.f4218a = m313h() != null ? m313h().getInt("num") : 1;
    }
}
