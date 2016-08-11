package com.expensemanager;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Color;
import android.net.Uri;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.p037c.C0476c;
import com.github.mikephil.charting.p037c.C0478e;
import com.github.mikephil.charting.p037c.C0479f;
import com.github.mikephil.charting.p037c.C0480g;
import com.github.mikephil.charting.p037c.C0481h;
import com.github.mikephil.charting.p037c.C0483j;
import com.github.mikephil.charting.p037c.C0484k;
import com.github.mikephil.charting.p037c.C0485l;
import com.github.mikephil.charting.p039h.C0539e;
import com.github.mikephil.charting.p040d.C0499f;
import com.github.mikephil.charting.p040d.C0501a;
import com.github.mikephil.charting.p040d.C0504b;
import com.github.mikephil.charting.p040d.C0506c;
import com.github.mikephil.charting.p040d.C0510l;
import com.github.mikephil.charting.p040d.C0511m;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ck {
    public static String m4023a(PieChart pieChart, String str, String str2, String str3, int i) {
        int i2;
        pieChart.setUsePercentValues(true);
        pieChart.setDescription("");
        pieChart.setNoDataText("No Data Available.");
        if (str == null || "".equals(str) || str2 == null || "".equals(str2)) {
            return "";
        }
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColorTransparent(true);
        pieChart.setHoleRadius(58.0f);
        pieChart.setTransparentCircleRadius(61.0f);
        pieChart.setDrawCenterText(true);
        pieChart.setRotationAngle(0.0f);
        pieChart.setRotationEnabled(true);
        pieChart.setCenterText(str3);
        pieChart.setCenterTextColor(i);
        String[] split = str.split(",");
        List arrayList = new ArrayList();
        String[] split2 = str2.split(",");
        List arrayList2 = new ArrayList();
        String str4 = "";
        int i3 = 0;
        double d = 0.0d;
        int i4 = 0;
        int i5 = 0;
        while (i5 < split.length) {
            int i6;
            String str5;
            try {
                String str6 = split[i5];
                String str7 = split2[i5];
                int abs = Math.abs(aba.m3761b(str3, str7));
                if (abs > 1 || aib.m3865b(str7).equals("") || aib.m3865b(str3).equals("") || split.length <= 6) {
                    if (abs != 0) {
                        arrayList.add(str6);
                        arrayList2.add(new C0506c((float) aib.m3877i(str7), i4));
                        i6 = i4 + 1;
                    } else {
                        i6 = i4;
                    }
                    i4 = i3;
                    str5 = str4;
                    i5++;
                    str4 = str5;
                    i3 = i4;
                    i4 = i6;
                } else {
                    d = aba.m3742a(d, str7);
                    i3++;
                    if (!str4.equals("")) {
                        str6 = str4 + "," + str6;
                    }
                    i2 = i4;
                    i4 = i3;
                    str5 = str6;
                    i6 = i2;
                    i5++;
                    str4 = str5;
                    i3 = i4;
                    i4 = i6;
                }
            } catch (Exception e) {
                Exception exception = e;
                i6 = i3;
                exception.printStackTrace();
                str5 = str4;
                i2 = i6;
                i6 = i4;
                i4 = i2;
            }
        }
        if (i3 > 0) {
            arrayList.add("Other " + i3 + " items");
            arrayList2.add(new C0506c((float) d, i4));
        }
        C0511m c0511m = new C0511m(arrayList2, null);
        c0511m.m4557a(3.0f);
        c0511m.m4559c(5.0f);
        Random random = new Random();
        List arrayList3 = new ArrayList();
        for (i6 = 0; i6 < arrayList.size(); i6++) {
            if (i6 >= co.f4427a.length) {
                arrayList3.add(Integer.valueOf(Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256))));
            } else {
                arrayList3.add(Integer.valueOf(co.f4427a[i6]));
            }
        }
        c0511m.m4491a(arrayList3);
        C0499f c0510l = new C0510l(arrayList, c0511m);
        c0510l.m4466a(new C0539e());
        c0510l.m4465a(11.0f);
        c0510l.m4469b(-1);
        pieChart.setData(c0510l);
        pieChart.m4368a(null);
        pieChart.invalidate();
        C0476c legend = pieChart.getLegend();
        legend.m4299a(C0479f.RIGHT_OF_CHART);
        legend.m4308c(7.0f);
        legend.m4311d(5.0f);
        legend.m4272a(i);
        return str4;
    }

    public static List<Map<String, Object>> m4024a(List<Map<String, Object>> list, boolean z, String str, boolean z2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        List<Map<String, Object>> arrayList = new ArrayList();
        ack[] com_expensemanager_ackArr = new ack[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String replace = aib.m3865b((String) ((Map) list.get(i)).get("amount")).replaceAll(",", "").replace("(", "").replace(")", "").replace(":", "");
            String str2 = (String) ((Map) list.get(i)).get("account");
            String b = ((String) ((Map) list.get(i)).get("expense")) != null ? aib.m3865b((String) ((Map) list.get(i)).get("expense")) : replace;
            if (((String) ((Map) list.get(i)).get("income")) != null) {
                replace = aib.m3865b((String) ((Map) list.get(i)).get("income"));
            }
            double d = 0.0d;
            double d2 = 0.0d;
            if (!(b == null || "".equals(b))) {
                d = aib.m3877i(b);
            }
            if (!(replace == null || "".equals(replace))) {
                d2 = aib.m3877i(replace);
            }
            com_expensemanager_ackArr[i] = new ack(str2, (String) ((Map) list.get(i)).get(str), d, d2, z);
        }
        if (z2) {
            Arrays.sort(com_expensemanager_ackArr, new acm());
        } else {
            Arrays.sort(com_expensemanager_ackArr, new acl());
        }
        for (int size = list.size(); size > 0; size--) {
            ack com_expensemanager_ack = com_expensemanager_ackArr[size - 1];
            Map hashMap = new HashMap();
            replace = aib.m3850a(com_expensemanager_ack.m3825c());
            String a = aib.m3850a(com_expensemanager_ack.m3826d());
            if (!z) {
                hashMap.put("expense", replace);
                hashMap.put("expenseAmount", aib.m3850a(com_expensemanager_ack.m3825c()));
                hashMap.put("amount", replace);
            }
            if (z) {
                hashMap.put("income", a);
                hashMap.put("incomeAmount", aib.m3850a(com_expensemanager_ack.m3826d()));
                hashMap.put("amount", a);
            }
            hashMap.put(str, com_expensemanager_ack.m3824b());
            hashMap.put("account", com_expensemanager_ack.m3823a());
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public static void m4025a(Context context, Bitmap bitmap, String str, String str2) {
        try {
            bitmap.compress(CompressFormat.PNG, 100, new FileOutputStream(new File(co.f4430d, str)));
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("plain/text");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
            intent.putExtra("android.intent.extra.SUBJECT", context.getResources().getString(2131099725) + ":" + str);
            intent.putExtra("android.intent.extra.TEXT", str2);
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(co.f4430d + "/" + str)));
            context.startActivity(Intent.createChooser(intent, "Send mail..."));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void m4026a(BarChart barChart, String str, String str2, int i, int i2) {
        int i3;
        String[] split = str.split(",");
        List arrayList = new ArrayList();
        for (Object add : split) {
            arrayList.add(add);
        }
        split = str2.split(",");
        List arrayList2 = new ArrayList();
        for (i3 = 0; i3 < split.length; i3++) {
            arrayList2.add(new C0506c((float) aib.m3877i(split[i3]), i3));
        }
        C0504b c0504b = new C0504b(arrayList2, null);
        c0504b.m4521a(35.0f);
        c0504b.m4495c(i2);
        List arrayList3 = new ArrayList();
        arrayList3.add(c0504b);
        C0499f c0501a = new C0501a(arrayList, arrayList3);
        c0501a.m4465a(9.0f);
        c0501a.m4469b(i);
        barChart.setData(c0501a);
        barChart.setHighlightPerDragEnabled(false);
    }

    public static void m4027a(BarChart barChart, String str, String str2, int i, int i2, String str3) {
        barChart.setDrawValueAboveBar(true);
        barChart.setDescription("");
        barChart.setNoDataText("No Data Available.");
        if (str != null && !"".equals(str) && str2 != null && !"".equals(str2)) {
            barChart.setMaxVisibleValueCount(60);
            barChart.setPinchZoom(false);
            barChart.setDrawBarShadow(false);
            barChart.setDrawGridBackground(false);
            barChart.setHorizontalScrollBarEnabled(true);
            C0483j xAxis = barChart.getXAxis();
            xAxis.m4336a(C0484k.BOTTOM);
            xAxis.m4283a(true);
            xAxis.m4281a(0.3f);
            xAxis.m4272a(i);
            C0485l axisLeft = barChart.getAxisLeft();
            axisLeft.m4354b(5);
            axisLeft.m4272a(i);
            axisLeft.m4285b(true);
            axisLeft.m4283a(true);
            axisLeft.m4281a(0.3f);
            C0485l axisRight = barChart.getAxisRight();
            axisRight.m4283a(false);
            axisRight.m4354b(5);
            axisRight.m4272a(i);
            axisRight.m4285b(true);
            if (str3 != null) {
                C0480g c0480g = new C0480g((float) aib.m3877i(str3), str3);
                c0480g.m4320a(0.5f);
                c0480g.m4322a(i);
                c0480g.m4321a(20.0f, 10.0f, 0.0f);
                c0480g.m4323a(C0481h.POS_RIGHT);
                c0480g.m4325b(10.0f);
                c0480g.m4326b(i);
                axisLeft.m4282a(c0480g);
                axisRight.m4282a(c0480g);
            }
            m4026a(barChart, str, str2, i, i2);
            C0476c legend = barChart.getLegend();
            legend.m4299a(C0479f.BELOW_CHART_LEFT);
            legend.m4298a(C0478e.SQUARE);
            legend.m4297a(9.0f);
            legend.m4273b(11.0f);
            legend.m4308c(4.0f);
            legend.m4272a(i);
            legend.m4274c(false);
            barChart.setHighlightPerDragEnabled(false);
            barChart.invalidate();
        }
    }

    public static void m4028a(BarChart barChart, String str, String str2, int i, int i2, boolean z) {
        int i3 = 0;
        String[] split = str.split(",");
        List arrayList = new ArrayList();
        for (Object add : split) {
            arrayList.add(add);
        }
        String[] split2 = str2.split(",");
        List arrayList2 = new ArrayList();
        int[] iArr = new int[split2.length];
        while (i3 < split2.length) {
            float i4 = (float) aib.m3877i(split2[i3]);
            arrayList2.add(new C0506c(i4, i3));
            if (i4 < 0.0f) {
                iArr[i3] = co.f4428b;
            } else {
                iArr[i3] = co.f4429c;
            }
            i3++;
        }
        C0504b c0504b = new C0504b(arrayList2, null);
        c0504b.m4521a(35.0f);
        if (z) {
            c0504b.m4495c(i2);
        } else {
            c0504b.m4492a(iArr);
        }
        List arrayList3 = new ArrayList();
        arrayList3.add(c0504b);
        C0499f c0501a = new C0501a(arrayList, arrayList3);
        c0501a.m4465a(9.0f);
        c0501a.m4469b(i);
        barChart.setData(c0501a);
    }

    public static void m4029a(BarChart barChart, String str, String str2, int i, int i2, boolean z, String str3) {
        barChart.setDrawValueAboveBar(true);
        barChart.setDescription("");
        barChart.setNoDataText("No Data Available.");
        if (str != null && !"".equals(str) && str2 != null && !"".equals(str2)) {
            barChart.setMaxVisibleValueCount(60);
            barChart.setPinchZoom(false);
            barChart.setDrawBarShadow(false);
            barChart.setDrawGridBackground(false);
            C0483j xAxis = barChart.getXAxis();
            xAxis.m4336a(C0484k.BOTH_SIDED);
            xAxis.m4283a(false);
            xAxis.m4272a(i);
            xAxis.m4283a(true);
            C0485l axisLeft = barChart.getAxisLeft();
            axisLeft.m4354b(5);
            axisLeft.m4272a(i);
            axisLeft.m4356d(z);
            if (str3 != null) {
                C0480g c0480g = new C0480g(barChart.getAverage(), "Avg: " + aba.m3746a((double) barChart.getAverage()));
                c0480g.m4320a(0.5f);
                c0480g.m4321a(20.0f, 10.0f, 0.0f);
                c0480g.m4323a(C0481h.POS_RIGHT);
                c0480g.m4325b(10.0f);
                c0480g.m4326b(i);
                c0480g.m4322a(i);
                axisLeft.m4292h();
                axisLeft.m4282a(c0480g);
            }
            barChart.getAxisRight().m4274c(false);
            m4028a(barChart, str, str2, i, i2, z);
            C0476c legend = barChart.getLegend();
            legend.m4299a(C0479f.BELOW_CHART_LEFT);
            legend.m4298a(C0478e.SQUARE);
            legend.m4297a(9.0f);
            legend.m4273b(11.0f);
            legend.m4308c(4.0f);
            legend.m4272a(i);
            legend.m4274c(false);
            barChart.setHighlightPerDragEnabled(false);
        }
    }
}
