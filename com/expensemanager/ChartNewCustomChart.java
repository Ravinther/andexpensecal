package com.expensemanager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.p032f.C0393c;
import com.github.mikephil.charting.p039h.C0538d;
import com.github.mikephil.charting.p040d.C0505h;
import com.google.android.gms.C0607c;

public class ChartNewCustomChart extends Activity implements C0393c {
    Context f2464a;
    protected HorizontalBarChart f2465b;
    protected PieChart f2466c;
    ro f2467d;
    String f2468e;
    String f2469f;
    String f2470g;
    String f2471h;
    boolean f2472i;
    private int f2473j;
    private int f2474k;

    public ChartNewCustomChart() {
        this.f2473j = -16777216;
        this.f2474k = co.f4428b;
        this.f2464a = this;
        this.f2468e = "";
        this.f2469f = "";
        this.f2470g = "";
        this.f2471h = "";
        this.f2472i = true;
    }

    public void m2410a() {
    }

    @SuppressLint({"NewApi"})
    public void m2411a(C0505h c0505h, int i, C0538d c0538d) {
        if (c0505h != null) {
            String b = this.f2465b.m4370b(c0505h.m4529b());
            if (!this.f2472i) {
                b = this.f2466c.m4370b(c0505h.m4529b());
            }
            b = getIntent().getStringExtra("whereClause") + "='" + b + "'";
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
        this.f2467d = new ro(this);
        int i = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        if (i == 1 || i > 3) {
            this.f2473j = -1;
        }
        setContentView(2130903056);
        this.f2465b = (HorizontalBarChart) findViewById(2131558413);
        this.f2465b.setOnChartValueSelectedListener(this);
        this.f2466c = (PieChart) findViewById(2131558481);
        this.f2466c.setOnChartValueSelectedListener(this);
        this.f2474k = co.f4428b;
        if ("income".equalsIgnoreCase(getIntent().getStringExtra("viewType"))) {
            this.f2474k = co.f4429c;
        }
        this.f2468e = getIntent().getStringExtra("xStr");
        this.f2469f = getIntent().getStringExtra("yStr");
        this.f2470g = getIntent().getStringExtra("total");
        this.f2470g = this.f2470g.replace("(", "");
        this.f2470g = this.f2470g.replace(")", "");
        ck.m4027a(this.f2465b, this.f2468e, this.f2469f, this.f2473j, this.f2474k, null);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 2, 0, 2131099869).setIcon(2130837600).setShowAsAction(2);
        menu.add(0, 0, 0, 2131100025).setIcon(2130837620).setShowAsAction(2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                if (!menuItem.getTitle().equals(getResources().getString(2131100025))) {
                    this.f2466c.setVisibility(8);
                    this.f2465b.setVisibility(0);
                    ck.m4027a(this.f2465b, this.f2468e, this.f2469f, this.f2473j, this.f2474k, null);
                    menuItem.setTitle(2131100025);
                    this.f2472i = true;
                    break;
                }
                this.f2465b.setVisibility(8);
                this.f2466c.setVisibility(0);
                this.f2471h = ck.m4023a(this.f2466c, this.f2468e, this.f2469f, this.f2470g, this.f2473j);
                menuItem.setTitle(2131099739);
                this.f2472i = false;
                break;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                Bitmap chartBitmap = this.f2465b.getChartBitmap();
                if (!this.f2472i) {
                    chartBitmap = this.f2466c.getChartBitmap();
                }
                ck.m4025a(this.f2464a, chartBitmap, getIntent().getStringExtra("title") + ".png", (getIntent().getStringExtra("title") + "\n") + getResources().getString(2131099678) + ": " + getIntent().getStringExtra("account") + "\n\n");
                break;
            case 16908332:
                onBackPressed();
                break;
        }
        return true;
    }
}
