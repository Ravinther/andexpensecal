package com.expensemanager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.p032f.C0393c;
import com.github.mikephil.charting.p039h.C0538d;
import com.github.mikephil.charting.p040d.C0505h;
import com.google.android.gms.C0607c;

public class ChartNewDetailsChart extends Activity implements C0393c {
    Context f2504a;
    protected BarChart f2505b;
    protected PieChart f2506c;
    ro f2507d;
    String f2508e;
    String f2509f;
    String f2510g;
    String f2511h;
    boolean f2512i;
    private int f2513j;
    private int f2514k;

    public ChartNewDetailsChart() {
        this.f2513j = -16777216;
        this.f2514k = co.f4428b;
        this.f2504a = this;
        this.f2508e = "";
        this.f2509f = "";
        this.f2510g = "";
        this.f2511h = "";
        this.f2512i = true;
    }

    public void m2444a() {
    }

    @SuppressLint({"NewApi"})
    public void m2445a(C0505h c0505h, int i, C0538d c0538d) {
        if (c0505h != null) {
            String b = this.f2505b.m4370b(c0505h.m4529b());
            if (!this.f2512i) {
                b = this.f2506c.m4370b(c0505h.m4529b());
            }
            String stringExtra = getIntent().getStringExtra("whereClause");
            if (getIntent().getIntExtra("typeId", 2) == 1) {
                stringExtra = stringExtra + " and " + "category" + "='Income'";
            }
            if (getIntent().getIntExtra("typeId", 2) == 2) {
                stringExtra = stringExtra + " and " + "category" + "!='Income'";
            }
            b = !"CATEGORY_VIEW".equalsIgnoreCase(getIntent().getStringExtra("viewType")) ? stringExtra + " AND " + "expensed" + ">=" + abd.m3818c(b) + " AND " + "expensed" + "<=" + abd.m3820d(b) : stringExtra + "AND " + "category" + "='" + b + "'";
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this, ExpenseAccountExpandableList.class);
            bundle.putString("title", getIntent().getStringExtra("title"));
            bundle.putString("account", getIntent().getStringExtra("account"));
            bundle.putString("whereClause", b);
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
        this.f2507d = new ro(this);
        int i = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        if (i == 1 || i > 3) {
            this.f2513j = -1;
        }
        this.f2514k = co.f4428b;
        if (getIntent().getIntExtra("typeId", 2) == 1) {
            this.f2514k = co.f4429c;
        }
        this.f2508e = getIntent().getStringExtra("xStr");
        this.f2509f = getIntent().getStringExtra("yStr");
        this.f2510g = getIntent().getStringExtra("total");
        this.f2510g = this.f2510g.replace("(", "");
        this.f2510g = this.f2510g.replace(")", "");
        if (getIntent().getIntExtra("typeId", 2) != 0 || "CATEGORY_VIEW".equalsIgnoreCase(getIntent().getStringExtra("viewType"))) {
            setContentView(2130903056);
            this.f2505b = (HorizontalBarChart) findViewById(2131558413);
            ck.m4027a(this.f2505b, this.f2508e, this.f2509f, this.f2513j, this.f2514k, null);
        } else {
            setContentView(2130903059);
            this.f2505b = (BarChart) findViewById(2131558413);
            ck.m4029a(this.f2505b, this.f2508e, this.f2509f, this.f2513j, this.f2514k, false, null);
        }
        this.f2506c = (PieChart) findViewById(2131558481);
        this.f2506c.setOnChartValueSelectedListener(this);
        this.f2505b.setOnChartValueSelectedListener(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if ("CATEGORY_VIEW".equalsIgnoreCase(getIntent().getStringExtra("viewType")) && getIntent().getIntExtra("typeId", 2) != 0) {
            menu.add(0, 0, 0, 2131100025).setShowAsAction(2);
        }
        menu.add(0, 2, 0, 2131099869).setIcon(2130837600).setShowAsAction(2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                if (!menuItem.getTitle().equals(getResources().getString(2131100025))) {
                    this.f2506c.setVisibility(8);
                    this.f2505b.setVisibility(0);
                    ck.m4027a(this.f2505b, this.f2508e, this.f2509f, this.f2513j, this.f2514k, null);
                    menuItem.setTitle(2131100025);
                    this.f2512i = true;
                    break;
                }
                this.f2505b.setVisibility(8);
                this.f2506c.setVisibility(0);
                this.f2511h = ck.m4023a(this.f2506c, this.f2508e, this.f2509f, this.f2510g, this.f2513j);
                menuItem.setTitle(2131099739);
                this.f2512i = false;
                break;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                Bitmap chartBitmap = this.f2505b.getChartBitmap();
                if (!this.f2512i) {
                    chartBitmap = this.f2506c.getChartBitmap();
                }
                ck.m4025a(this.f2504a, chartBitmap, getIntent().getStringExtra("title") + ".png", (getIntent().getStringExtra("title") + "\n") + getResources().getString(2131099678) + ": " + getIntent().getStringExtra("account") + "\n\n");
                break;
            case 16908332:
                onBackPressed();
                break;
        }
        return true;
    }
}
