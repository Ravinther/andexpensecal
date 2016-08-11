package com.expensemanager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.p032f.C0393c;
import com.github.mikephil.charting.p039h.C0538d;
import com.github.mikephil.charting.p040d.C0505h;
import com.google.android.gms.C0607c;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ChartNewBudgetChart extends Activity implements C0393c {
    Context f2430a;
    protected HorizontalBarChart f2431b;
    ro f2432c;
    String f2433d;
    List<Map<String, Object>> f2434e;
    private int f2435f;
    private int f2436g;

    public ChartNewBudgetChart() {
        this.f2435f = -16777216;
        this.f2436g = co.f4428b;
        this.f2430a = this;
    }

    public void m2383a() {
    }

    @SuppressLint({"NewApi"})
    public void m2384a(C0505h c0505h, int i, C0538d c0538d) {
        if (c0505h != null) {
            int intExtra = getIntent().getIntExtra("tab", -1);
            Map map = (Map) this.f2434e.get(c0505h.m4529b());
            if (intExtra == 1) {
                String[] split = ((String) map.get("dateRange")).split(" - ");
                this.f2433d += " AND " + ("expensed>=" + abd.m3818c(split[0]) + " AND " + "expensed" + "<=" + abd.m3820d(split[1]));
            }
            if (intExtra == 2) {
                long a = aba.m3744a(((String) map.get("date")) + "-" + ExpenseManager.f3242r, "yyyy-MM-dd", Locale.US);
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(a);
                instance.add(2, 1);
                this.f2433d += " AND " + ("expensed>=" + a + " AND " + "expensed" + "<" + instance.getTimeInMillis());
            }
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this, ExpenseAccountExpandableList.class);
            bundle.putString("title", getIntent().getStringExtra("title"));
            bundle.putString("account", getIntent().getStringExtra("account"));
            bundle.putString("whereClause", this.f2433d);
            bundle.putInt("highlightId", 1);
            intent.putExtras(bundle);
            startActivityForResult(intent, 1);
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (-1 == i2) {
            onCreate(null);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(getIntent().getStringExtra("title"));
        this.f2432c = new ro(this);
        int i = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        if (i == 1 || i > 3) {
            this.f2435f = -1;
        }
        setContentView(2130903056);
        this.f2431b = (HorizontalBarChart) findViewById(2131558413);
        this.f2431b.setOnChartValueSelectedListener(this);
        this.f2436g = co.f4428b;
        if ("income".equalsIgnoreCase(getIntent().getStringExtra("viewType"))) {
            this.f2436g = co.f4429c;
        }
        int intExtra = getIntent().getIntExtra("tab", -1);
        this.f2433d = getIntent().getStringExtra("whereClause");
        this.f2433d = this.f2433d.substring(this.f2433d.indexOf("category"));
        Calendar instance = Calendar.getInstance();
        int a = abd.m3783a((Context) this, this.f2432c, "firstDayOfMonth", 1);
        i = a - 1;
        if (i < 1) {
            i = instance.getActualMaximum(5);
        }
        if (instance.get(5) >= a && a != 1) {
            instance.add(2, 1);
        }
        instance.set(5, i);
        instance.set(11, 23);
        instance.set(12, 59);
        instance.set(12, 59);
        instance.set(13, 59);
        instance.set(14, 999);
        String str = this.f2433d + " AND " + "expensed" + "<=" + instance.getTimeInMillis();
        this.f2434e = new ArrayList();
        if (intExtra == 1) {
            ExpenseAccountActivities.m2614b(this.f2432c, str, this.f2434e, "expensed DESC");
        }
        if (intExtra == 2) {
            ExpenseAccountActivities.m2608a(this.f2432c, str, this.f2434e, "expensed DESC");
        }
        if (this.f2434e.size() > 30) {
            this.f2434e = this.f2434e.subList(0, 30);
        }
        Collections.reverse(this.f2434e);
        String str2 = "";
        a = 0;
        String str3 = "";
        while (a < this.f2434e.size()) {
            Map map = (Map) this.f2434e.get(a);
            String replaceAll = ((String) map.get("expense")).replaceAll(",", "");
            if ("".equals(str3)) {
                str3 = (String) map.get("date");
                str = replaceAll;
            } else {
                str3 = str3 + "," + ((String) map.get("date"));
                str = str2 + "," + replaceAll;
            }
            a++;
            str2 = str;
        }
        ck.m4027a(this.f2431b, str3, str2, this.f2435f, this.f2436g, getIntent().getStringExtra("amount"));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 2, 0, 2131099869).setIcon(2130837600).setShowAsAction(2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.LoadingImageView_circleCrop /*2*/:
                ck.m4025a(this.f2430a, this.f2431b.getChartBitmap(), getIntent().getStringExtra("title") + ".png", (getIntent().getStringExtra("title") + "\n") + getResources().getString(2131099678) + ": " + getIntent().getStringExtra("account") + "\n\n");
                break;
            case 16908332:
                onBackPressed();
                break;
        }
        return true;
    }
}
