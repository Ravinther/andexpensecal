package com.expensemanager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.p032f.C0393c;
import com.github.mikephil.charting.p037c.C0476c;
import com.github.mikephil.charting.p037c.C0479f;
import com.github.mikephil.charting.p037c.C0483j;
import com.github.mikephil.charting.p037c.C0484k;
import com.github.mikephil.charting.p037c.C0485l;
import com.github.mikephil.charting.p039h.C0538d;
import com.github.mikephil.charting.p040d.C0499f;
import com.github.mikephil.charting.p040d.C0501a;
import com.github.mikephil.charting.p040d.C0504b;
import com.github.mikephil.charting.p040d.C0505h;
import com.github.mikephil.charting.p040d.C0506c;
import com.github.mikephil.charting.p040d.C0507i;
import com.github.mikephil.charting.p040d.C0509j;
import com.google.android.gms.C0607c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ChartNewMonthly extends Activity implements C0393c {
    static boolean f2517e;
    protected BarChart f2518a;
    protected LineChart f2519b;
    String[] f2520c;
    int f2521d;
    String f2522f;
    boolean f2523g;
    private int f2524h;
    private int f2525i;
    private String f2526j;
    private String f2527k;
    private TextView f2528l;
    private Spinner f2529m;
    private Spinner f2530n;
    private String f2531o;
    private ro f2532p;
    private Context f2533q;

    static {
        f2517e = false;
    }

    public ChartNewMonthly() {
        this.f2524h = -16777216;
        this.f2525i = co.f4428b;
        this.f2531o = "";
        this.f2533q = this;
        this.f2521d = 0;
        this.f2522f = "";
        this.f2523g = true;
    }

    private String m2450a(List<Map<String, Object>> list, int i) {
        double d = 0.0d;
        double d2 = 0.0d;
        for (int i2 = 0; i2 < list.size(); i2++) {
            String a;
            Map map = (Map) list.get(i2);
            String a2 = aba.m3756a((String) map.get("date"));
            String a3 = aba.m3756a((String) map.get("expense"));
            if (i == 1) {
                a3 = aba.m3756a((String) map.get("expense"));
            }
            if (i == 2) {
                a3 = aba.m3756a((String) map.get("income"));
            }
            if (i == 3) {
                a = aba.m3756a((String) map.get("subTotal"));
                if (a.indexOf("(") != -1) {
                    a = a.replace("(", "-").replace(")", "");
                }
            } else {
                a = a3;
            }
            a = a.replaceAll(",", "");
            if (i2 == 0) {
                this.f2526j = a2;
                this.f2527k = a;
            } else {
                this.f2526j += "," + a2;
                this.f2527k += "," + a;
            }
            d2 += aib.m3877i(a);
        }
        if (list.size() > 0) {
            d = d2 / ((double) list.size());
        }
        return aba.m3762b(d);
    }

    private void m2451a(List<Map<String, Object>> list) {
        try {
            String str = "expensed ASC";
            this.f2531o = this.f2528l.getText().toString();
            if (this.f2531o != null && this.f2531o.split(",").length == this.f2520c.length) {
                this.f2531o = "All";
            }
            this.f2522f = "account in (" + abd.m3792a(this.f2528l.getText().toString()) + ")";
            if ("All".equalsIgnoreCase(this.f2531o) || "".equalsIgnoreCase(this.f2531o)) {
                this.f2522f = "(category!='Account Transfer' and subcategory!='Account Transfer') and account in (" + abd.m3792a(ExpenseManager.f3245u) + ")";
            }
            int selectedItemPosition = this.f2530n.getSelectedItemPosition();
            String str2 = (String) this.f2530n.getItemAtPosition(selectedItemPosition);
            if (selectedItemPosition < this.f2530n.getCount() - 1) {
                int parseInt = Integer.parseInt(str2);
                Calendar instance = Calendar.getInstance();
                instance.set(1, parseInt);
                instance.set(2, ExpenseManager.f3241q);
                instance.set(5, ExpenseManager.f3242r);
                instance.add(5, -1);
                instance.set(11, 23);
                instance.set(12, 59);
                long timeInMillis = instance.getTimeInMillis();
                instance.add(1, 1);
                this.f2522f += " AND " + "expensed" + ">" + timeInMillis + " AND " + "expensed" + "<=" + instance.getTimeInMillis();
            }
            str2 = this.f2528l.getText().toString();
            if (!"".equals(str2) && str2.split(",").length > 1) {
                f2517e = true;
            }
            abd.m3809a(this.f2532p, this.f2522f, (List) list, str, f2517e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void m2453b() {
        this.f2532p = new ro(this);
        this.f2531o = getIntent().getStringExtra("account");
        this.f2528l = (TextView) findViewById(2131558476);
        this.f2528l.setText(this.f2531o);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(2131558473);
        Object a = abd.m3786a((Context) this, this.f2532p, "MY_ACCOUNT_NAMES", "Personal Expense");
        if ("All".equals(this.f2531o)) {
            this.f2528l.setText(a);
        }
        this.f2520c = a.split(",");
        relativeLayout.setOnClickListener(new av(this));
        this.f2528l.addTextChangedListener(new aw(this));
        Resources resources = getResources();
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, new ArrayList(Arrays.asList(new String[]{resources.getString(2131099722), resources.getString(2131099882), resources.getString(2131099932), resources.getString(2131099736), resources.getString(2131099945)})));
        arrayAdapter.setDropDownViewResource(17367049);
        this.f2529m = (Spinner) findViewById(2131558477);
        this.f2529m.setAdapter(arrayAdapter);
        this.f2529m.setSelection(0);
        this.f2529m.setOnItemSelectedListener(new ax(this));
        ArrayList arrayList = new ArrayList();
        pw.m4180a(this.f2532p, arrayList);
        Collections.sort(arrayList, Collections.reverseOrder());
        arrayList.add("All");
        arrayAdapter = new ArrayAdapter(this, 2130903151, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        this.f2530n = (Spinner) findViewById(2131558478);
        this.f2530n.setAdapter(arrayAdapter);
        this.f2530n.setOnItemSelectedListener(new ay(this));
        this.f2518a = (BarChart) findViewById(2131558413);
        this.f2518a.setOnChartValueSelectedListener(this);
        this.f2519b = (LineChart) findViewById(2131558481);
        m2456d();
    }

    private void m2455c() {
        boolean z = false;
        this.f2518a.setVisibility(0);
        this.f2519b.setVisibility(8);
        try {
            List arrayList = new ArrayList();
            m2451a(arrayList);
            int selectedItemPosition = this.f2529m.getSelectedItemPosition();
            m2450a(arrayList, selectedItemPosition);
            if (selectedItemPosition != 3) {
                z = true;
            }
            String str = null;
            if (this.f2529m.getSelectedItemPosition() == 1 || this.f2529m.getSelectedItemPosition() == 3 || this.f2529m.getSelectedItemPosition() == 3) {
                str = "average";
            }
            ck.m4029a(this.f2518a, this.f2526j, this.f2527k, this.f2524h, this.f2525i, z, str);
            this.f2518a.invalidate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void m2456d() {
        int i;
        this.f2518a.setVisibility(0);
        this.f2519b.setVisibility(8);
        List arrayList = new ArrayList();
        m2451a(arrayList);
        String[] strArr = new String[arrayList.size()];
        String[] strArr2 = new String[arrayList.size()];
        String[] strArr3 = new String[arrayList.size()];
        String[] strArr4 = new String[arrayList.size()];
        for (i = 0; i < arrayList.size(); i++) {
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
        String[] strArr5 = new String[]{getResources().getString(2131099882), getResources().getString(2131099932), getResources().getString(2131099736)};
        this.f2518a.setDrawGridBackground(false);
        this.f2518a.setDescription("");
        this.f2518a.setNoDataText("No Data Available.");
        if (strArr != null && strArr.length != 0) {
            int i2;
            this.f2518a.setDrawBarShadow(false);
            this.f2518a.setHighlightEnabled(true);
            this.f2518a.setTouchEnabled(true);
            this.f2518a.setDragEnabled(true);
            this.f2518a.setScaleEnabled(true);
            this.f2518a.setPinchZoom(true);
            C0485l axisLeft = this.f2518a.getAxisLeft();
            axisLeft.m4272a(this.f2524h);
            axisLeft.m4356d(false);
            this.f2518a.getAxisRight().m4274c(false);
            C0483j xAxis = this.f2518a.getXAxis();
            xAxis.m4336a(C0484k.BOTH_SIDED);
            xAxis.m4272a(this.f2524h);
            List arrayList2 = new ArrayList();
            for (Object add : strArr) {
                arrayList2.add(add);
            }
            List arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < 3; i3++) {
                List arrayList4 = new ArrayList();
                for (i2 = 0; i2 < strArr.length; i2++) {
                    double d = 0.0d;
                    if (i3 == 0) {
                        d = aib.m3877i(strArr2[i2]);
                    }
                    if (i3 == 1) {
                        d = aib.m3877i(strArr3[i2]);
                    }
                    if (i3 == 2) {
                        d = aib.m3877i(strArr4[i2]);
                    }
                    C0506c c0506c = new C0506c((float) d, i2);
                    c0506c.m4527a(strArr5[i3]);
                    arrayList4.add(c0506c);
                }
                C0504b c0504b = new C0504b(arrayList4, strArr5[i3]);
                i = co.f4428b;
                if (i3 == 0) {
                    c0504b.m4495c(i);
                    arrayList3.add(c0504b);
                }
                if (i3 == 1) {
                    c0504b.m4495c(co.f4429c);
                    arrayList3.add(c0504b);
                }
                if (i3 == 2) {
                    c0504b.m4495c(-16776961);
                    arrayList3.add(c0504b);
                }
            }
            C0499f c0501a = new C0501a(arrayList2, arrayList3);
            c0501a.m4465a(8.0f);
            c0501a.m4469b(this.f2524h);
            this.f2518a.setData(c0501a);
            this.f2518a.invalidate();
            C0476c legend = this.f2518a.getLegend();
            legend.m4299a(C0479f.RIGHT_OF_CHART_INSIDE);
            legend.m4272a(this.f2524h);
            legend.m4274c(true);
        }
    }

    private void m2458e() {
        int i;
        this.f2519b.setVisibility(0);
        this.f2518a.setVisibility(8);
        List arrayList = new ArrayList();
        m2451a(arrayList);
        String[] strArr = new String[arrayList.size()];
        String[] strArr2 = new String[arrayList.size()];
        String[] strArr3 = new String[arrayList.size()];
        String[] strArr4 = new String[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Map map = (Map) arrayList.get(i2);
            String a = aba.m3756a((String) map.get("date"));
            String replaceAll = aba.m3756a((String) map.get("expense")).replaceAll(",", "").replaceAll("-", "");
            String replace = replaceAll.indexOf("(") != -1 ? replaceAll.replace("(", "-").replace(")", "") : replaceAll;
            replaceAll = aba.m3756a((String) map.get("income")).replaceAll(",", "").replaceAll("-", "");
            String a2 = aba.m3756a((String) map.get("subTotal"));
            if (a2.indexOf("(") != -1) {
                a2 = a2.replace("(", "-").replace(")", "");
            }
            strArr[i2] = a;
            strArr2[i2] = replace;
            strArr3[i2] = replaceAll;
            strArr4[i2] = a2;
        }
        String[] strArr5 = new String[]{getResources().getString(2131099882), getResources().getString(2131099932), getResources().getString(2131099736)};
        this.f2519b.setDrawGridBackground(false);
        this.f2519b.setDescription("");
        this.f2519b.setHighlightEnabled(true);
        this.f2519b.setTouchEnabled(true);
        this.f2519b.setDragEnabled(true);
        this.f2519b.setScaleEnabled(true);
        this.f2519b.setPinchZoom(true);
        C0485l axisLeft = this.f2519b.getAxisLeft();
        axisLeft.m4272a(this.f2524h);
        axisLeft.m4356d(false);
        this.f2519b.getAxisRight().m4274c(false);
        C0483j xAxis = this.f2519b.getXAxis();
        xAxis.m4336a(C0484k.BOTH_SIDED);
        xAxis.m4272a(this.f2524h);
        List arrayList2 = new ArrayList();
        for (Object add : strArr) {
            arrayList2.add(add);
        }
        List arrayList3 = new ArrayList();
        for (int i3 = 0; i3 < 3; i3++) {
            List arrayList4 = new ArrayList();
            for (i = 0; i < strArr.length; i++) {
                double d = 0.0d;
                if (i3 == 0) {
                    d = aib.m3877i(strArr2[i]);
                }
                if (i3 == 1) {
                    d = aib.m3877i(strArr3[i]);
                }
                if (i3 == 2) {
                    d = aib.m3877i(strArr4[i]);
                }
                arrayList4.add(new C0505h((float) d, i));
            }
            C0509j c0509j = new C0509j(arrayList4, strArr5[i3]);
            c0509j.m4539c(2.5f);
            c0509j.m4544a(4.0f);
            i = co.f4428b;
            if (i3 == 1) {
                i = co.f4429c;
            }
            if (i3 == 2) {
                i = -16776961;
            }
            c0509j.m4495c(i);
            c0509j.m4551g(i);
            arrayList3.add(c0509j);
        }
        C0499f c0507i = new C0507i(arrayList2, arrayList3);
        c0507i.m4469b(this.f2524h);
        this.f2519b.setData(c0507i);
        this.f2519b.invalidate();
        C0476c legend = this.f2519b.getLegend();
        legend.m4299a(C0479f.RIGHT_OF_CHART_INSIDE);
        legend.m4272a(this.f2524h);
    }

    private void m2460f() {
        Bitmap chartBitmap = this.f2518a.getChartBitmap();
        if (!this.f2523g) {
            chartBitmap = this.f2519b.getChartBitmap();
        }
        ck.m4025a(this.f2533q, chartBitmap, getIntent().getStringExtra("title") + ".png", ((getResources().getString(2131099678) + ": " + this.f2528l.getText().toString() + "\n") + getResources().getString(2131099794) + ": " + this.f2530n.getSelectedItem().toString() + "\n") + getResources().getString(2131099764) + ": " + this.f2529m.getSelectedItem().toString() + "\n\\n");
    }

    public void m2462a() {
    }

    @SuppressLint({"NewApi"})
    public void m2463a(C0505h c0505h, int i, C0538d c0538d) {
        if (c0505h != null && ((double) c0505h.m4530c()) != 0.0d) {
            try {
                String[] split = this.f2518a.m4370b(c0505h.m4529b()).split("-");
                int k = aib.m3879k(split[0]);
                int k2 = aib.m3879k(split[1]);
                Calendar instance = Calendar.getInstance();
                instance.set(1, k);
                instance.set(2, k2 - 1);
                instance.set(5, ExpenseManager.f3242r);
                instance.set(11, 0);
                instance.set(12, 0);
                instance.set(13, 0);
                long timeInMillis = instance.getTimeInMillis();
                instance.add(2, 1);
                String str = this.f2522f + " AND " + "expensed" + ">=" + timeInMillis + " AND " + "expensed" + "<" + instance.getTimeInMillis();
                if (this.f2529m.getSelectedItemPosition() == 0) {
                    if (getResources().getString(2131099882).equals(c0505h.m4531d())) {
                        str = str + " AND " + "category" + "!='Income'";
                    }
                    if (getResources().getString(2131099932).equals(c0505h.m4531d())) {
                        str = str + " AND " + "category" + "='Income'";
                    }
                    if (getResources().getString(2131099736).equals(c0505h.m4531d())) {
                        str = str.replaceAll("Account Transfer", "null");
                    }
                }
                if (this.f2529m.getSelectedItemPosition() == 1) {
                    str = str + " AND " + "category" + "!='Income'";
                }
                if (this.f2529m.getSelectedItemPosition() == 2) {
                    str = str + " AND " + "category" + "='Income'";
                }
                Bundle bundle = new Bundle();
                Intent intent = new Intent(this, ExpenseAccountExpandableList.class);
                bundle.putString("title", getIntent().getStringExtra("title"));
                bundle.putString("account", getIntent().getStringExtra("account"));
                bundle.putString("whereClause", str);
                bundle.putInt("highlightId", 1);
                intent.putExtras(bundle);
                startActivityForResult(intent, 1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (-1 != i2) {
            return;
        }
        if (this.f2529m.getSelectedItemPosition() >= 4) {
            m2458e();
        } else if (this.f2529m.getSelectedItemPosition() == 0) {
            m2456d();
        } else {
            m2455c();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(getIntent().getStringExtra("title"));
        this.f2532p = new ro(this);
        int i = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        if (i == 1 || i > 3) {
            this.f2524h = -1;
        }
        setContentView(2130903057);
        m2453b();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 2, 0, 2131099869).setIcon(2130837600).setShowAsAction(2);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.LoadingImageView_circleCrop /*2*/:
                m2460f();
                return true;
            case 16908332:
                onBackPressed();
                break;
        }
        return super.onMenuItemSelected(i, menuItem);
    }
}
