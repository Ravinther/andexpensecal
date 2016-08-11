package com.expensemanager;

import android.os.Bundle;
import android.support.v4.app.C0032l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.charts.C0489c;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.charts.PieChart;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ci extends C0032l {
    int f4415a;
    String f4416b;
    private HorizontalBarChart f4417c;
    private PieChart f4418d;
    private C0489c f4419e;

    public ci() {
        this.f4416b = "";
    }

    static ci m4014a(int i) {
        ci ciVar = new ci();
        Bundle bundle = new Bundle();
        bundle.putInt("num", i);
        ciVar.m311g(bundle);
        return ciVar;
    }

    private void m4016a(String str, int i) {
        String str2;
        String str3;
        int i2 = 0;
        ChartNewSummary.f2583s = new ro(m315i());
        List arrayList = new ArrayList();
        String str4 = "Income".equalsIgnoreCase(str) ? "account in (" + abd.m3792a(ChartNewSummary.f2576E.getText().toString()) + ") and " + "category" + "='Income' " : "account in (" + abd.m3792a(ChartNewSummary.f2576E.getText().toString()) + ") and " + "category" + "!='Income' ";
        if (ChartNewSummary.f2582r.size() > 1) {
            try {
                HashMap hashMap = (HashMap) ChartNewSummary.f2582r.get(i);
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
        if (ChartNewSummary.f2588y == 7) {
            str3 = str3 + " and " + "category" + "!='Account Transfer' ";
        }
        if (ChartNewSummary.f2588y == 8) {
            str3 = str3 + " and " + "subcategory" + "!='Account Transfer' ";
        }
        str2 = ChartNewSummary.f2588y == 9 ? str3 + " and " + "category" + " in (" + abd.m3792a(ChartNewSummary.f2573A.trim()) + ")" : str3;
        str3 = ChartNewSummary.f2576E.getText().toString();
        if (!"".equals(str3) && str3.split(",").length > 1) {
            ChartNewSummary.f2586w = true;
        }
        String a = ChartNewSummary.m2497a(ChartNewSummary.f2583s, str2, arrayList, str, "expensed DESC", ChartNewSummary.f2586w);
        boolean z = ChartNewSummary.f2588y == 8 || ChartNewSummary.f2588y == 1;
        List a2 = abd.m3801a(arrayList, z, "name");
        String[] strArr = new String[a2.size()];
        String[] strArr2 = new String[a2.size()];
        while (i2 < a2.size()) {
            Map map = (Map) a2.get(i2);
            str4 = aba.m3756a((String) map.get("name"));
            str3 = (ChartNewSummary.f2588y == 1 || ChartNewSummary.f2588y == 8) ? aba.m3756a((String) map.get("incomeAmount")) : aba.m3756a((String) map.get("expenseAmount"));
            String replaceAll = str3.replaceAll(",", "");
            strArr[i2] = "".equals(str4) ? "NA" : str4;
            strArr2[i2] = replaceAll;
            i2++;
        }
        if ("BAR".equals(ChartNewSummary.f2584u)) {
            m4017a(strArr, strArr2);
            this.f4419e = this.f4417c;
        } else {
            m4018a(strArr, strArr2, a);
            this.f4419e = this.f4418d;
        }
        ChartNewSummary.f2578O.put(Integer.valueOf(i), this.f4419e);
        C0489c c0489c = (C0489c) ChartNewSummary.f2578O.get(Integer.valueOf(ChartNewSummary.f2587x.getCurrentItem() - 1));
        C0489c c0489c2 = (C0489c) ChartNewSummary.f2578O.get(Integer.valueOf(ChartNewSummary.f2587x.getCurrentItem() - 2));
        C0489c c0489c3 = (C0489c) ChartNewSummary.f2578O.get(Integer.valueOf(ChartNewSummary.f2587x.getCurrentItem()));
        C0489c c0489c4 = (C0489c) ChartNewSummary.f2578O.get(Integer.valueOf(ChartNewSummary.f2587x.getCurrentItem() + 1));
        C0489c c0489c5 = (C0489c) ChartNewSummary.f2578O.get(Integer.valueOf(ChartNewSummary.f2587x.getCurrentItem() + 2));
        ChartNewSummary.f2578O.clear();
        ChartNewSummary.f2578O.put(Integer.valueOf(ChartNewSummary.f2587x.getCurrentItem() - 1), c0489c);
        ChartNewSummary.f2578O.put(Integer.valueOf(ChartNewSummary.f2587x.getCurrentItem() - 2), c0489c2);
        ChartNewSummary.f2578O.put(Integer.valueOf(ChartNewSummary.f2587x.getCurrentItem()), c0489c3);
        ChartNewSummary.f2578O.put(Integer.valueOf(ChartNewSummary.f2587x.getCurrentItem() + 1), c0489c4);
        ChartNewSummary.f2578O.put(Integer.valueOf(ChartNewSummary.f2587x.getCurrentItem() + 2), c0489c5);
        ChartNewSummary.f2583s.m4201b();
        this.f4419e.setOnChartValueSelectedListener(new cj(this, str2));
    }

    private void m4017a(String[] strArr, String[] strArr2) {
        this.f4417c.setVisibility(0);
        this.f4418d.setVisibility(8);
        ChartNewSummary.f2584u = "BAR";
        try {
            ck.m4027a(this.f4417c, ChartNewSummary.m2498a(strArr, ","), ChartNewSummary.m2498a(strArr2, ","), ChartNewSummary.f2574C, ChartNewSummary.f2575D, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void m4018a(String[] strArr, String[] strArr2, String str) {
        ChartNewSummary.f2584u = "PIE";
        this.f4417c.setVisibility(8);
        this.f4418d.setVisibility(0);
        this.f4416b = ck.m4023a(this.f4418d, ChartNewSummary.m2498a(strArr, ","), ChartNewSummary.m2498a(strArr2, ","), aba.m3767b(str), ChartNewSummary.f2574C);
    }

    public View m4019a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = LayoutInflater.from(m315i()).inflate(2130903056, null);
        this.f4417c = (HorizontalBarChart) inflate.findViewById(2131558413);
        this.f4418d = (PieChart) inflate.findViewById(2131558481);
        m4016a(ChartNewSummary.f2579P, this.f4415a);
        return inflate;
    }

    public void m4020a(Bundle bundle) {
        super.m283a(bundle);
        this.f4415a = m313h() != null ? m313h().getInt("num") : 1;
    }
}
