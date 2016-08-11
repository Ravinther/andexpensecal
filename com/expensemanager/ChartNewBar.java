package com.expensemanager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.p032f.C0393c;
import com.github.mikephil.charting.p039h.C0538d;
import com.github.mikephil.charting.p040d.C0505h;
import com.google.android.gms.C0607c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChartNewBar extends Activity implements C0393c {
    Context f2419a;
    TextView f2420b;
    String[] f2421c;
    protected HorizontalBarChart f2422d;
    Spinner f2423e;
    ro f2424f;
    String f2425g;
    String f2426h;
    String f2427i;
    private int f2428j;
    private int f2429k;

    public ChartNewBar() {
        this.f2428j = -16777216;
        this.f2429k = co.f4428b;
        this.f2419a = this;
        this.f2425g = "";
        this.f2426h = "";
        this.f2427i = "";
    }

    private void m2379b() {
        List list;
        int i = false;
        List arrayList = new ArrayList();
        boolean z = this.f2421c.length > 1;
        String str = "";
        if (getResources().getString(2131099886).equals(getIntent().getStringExtra("title"))) {
            this.f2427i = aba.m3755a(this.f2424f, "category!='Income' AND account in (" + abd.m3792a(this.f2420b.getText().toString()) + ")", arrayList, z);
            arrayList = ck.m4024a(arrayList, false, "category", false);
            this.f2429k = co.f4428b;
        }
        if (getResources().getString(2131099933).equals(getIntent().getStringExtra("title"))) {
            this.f2427i = abd.m3791a(this.f2424f, "category='Income' AND account in (" + abd.m3792a(this.f2420b.getText().toString()) + ")", arrayList, z);
            arrayList = ck.m4024a(arrayList, true, "category", true);
            this.f2429k = co.f4429c;
            list = arrayList;
        } else {
            list = arrayList;
        }
        if (getResources().getString(2131100107).equals(getIntent().getStringExtra("title"))) {
            this.f2427i = abd.m3791a(this.f2424f, "category='" + ((String) this.f2423e.getSelectedItem()) + "'" + " AND " + "account" + " in (" + abd.m3792a(this.f2420b.getText().toString()) + ")", list, z);
            list = ck.m4024a(list, false, "category", true);
            this.f2429k = co.f4428b;
        }
        this.f2427i = this.f2427i.replace("(", "");
        this.f2427i = this.f2427i.replace(")", "");
        while (i < list.size()) {
            Map map = (Map) list.get(i);
            String a = aba.m3756a((String) map.get("category"));
            String replaceAll = aba.m3756a((String) map.get("amount")).replaceAll(",", "").replaceAll("-", "");
            if (i == 0) {
                this.f2425g = a;
                this.f2426h = replaceAll;
            } else {
                this.f2425g += "," + a;
                this.f2426h += "," + replaceAll;
            }
            i++;
        }
    }

    public void m2381a() {
    }

    @SuppressLint({"NewApi"})
    public void m2382a(C0505h c0505h, int i, C0538d c0538d) {
        if (c0505h != null && ((double) c0505h.m4530c()) != 0.0d) {
            String[] split = this.f2425g.split(",");
            String str = "account in (" + abd.m3792a(this.f2420b.getText().toString()) + ")";
            if (getResources().getString(2131099886).equals(getIntent().getStringExtra("title"))) {
                str = str + " AND " + "category" + "='" + split[c0505h.m4529b()] + "' AND " + "category" + "!='Income' ";
            }
            String str2 = getResources().getString(2131099933).equals(getIntent().getStringExtra("title")) ? str + " AND " + "subcategory" + "='" + split[c0505h.m4529b()] + "' AND " + "category" + "='Income' " : str;
            if (getResources().getString(2131100107).equals(getIntent().getStringExtra("title"))) {
                str2 = str2 + " AND " + "subcategory" + "='" + split[c0505h.m4529b()] + "' AND " + "category" + "='" + ((String) this.f2423e.getSelectedItem()) + "'";
            }
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this, ExpenseAccountExpandableList.class);
            bundle.putString("title", getIntent().getStringExtra("title"));
            bundle.putString("account", this.f2420b.getText().toString());
            bundle.putString("whereClause", str2);
            bundle.putInt("highlightId", 1);
            intent.putExtras(bundle);
            startActivityForResult(intent, 1);
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (-1 == i2) {
            m2379b();
            ck.m4027a(this.f2422d, this.f2425g, this.f2426h, this.f2428j, this.f2429k, null);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(getIntent().getStringExtra("title"));
        this.f2424f = new ro(this);
        int i = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        if (i == 1 || i > 3) {
            this.f2428j = -1;
        }
        setContentView(2130903054);
        this.f2422d = (HorizontalBarChart) findViewById(2131558413);
        this.f2422d.setOnChartValueSelectedListener(this);
        CharSequence stringExtra = getIntent().getStringExtra("account");
        this.f2420b = (TextView) findViewById(2131558476);
        this.f2420b.setText(stringExtra);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(2131558473);
        Object a = abd.m3786a((Context) this, this.f2424f, "MY_ACCOUNT_NAMES", "Personal Expense");
        if ("All".equals(stringExtra)) {
            this.f2420b.setText(a);
        }
        this.f2421c = a.split(",");
        relativeLayout.setOnClickListener(new C0447h(this));
        this.f2420b.addTextChangedListener(new C0448i(this));
        if (getResources().getString(2131100107).equals(getIntent().getStringExtra("title"))) {
            ((LinearLayout) findViewById(2131558479)).setVisibility(0);
            this.f2423e = (Spinner) findViewById(2131558480);
            this.f2423e.setSelection(0);
            List arrayList = new ArrayList();
            ExpenseBudgetAdd.m2800a(this.f2424f, arrayList, new HashMap());
            SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, arrayList);
            arrayAdapter.setDropDownViewResource(17367049);
            this.f2423e.setAdapter(arrayAdapter);
            this.f2423e.setOnItemSelectedListener(new C0450j(this));
        }
        m2379b();
        ck.m4027a(this.f2422d, this.f2425g, this.f2426h, this.f2428j, this.f2429k, null);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 2, 0, 2131099869).setIcon(2130837600).setShowAsAction(2);
        menu.add(0, 0, 0, 2131100025).setIcon(2130837620).setShowAsAction(2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                Intent intent = new Intent(this, ChartNewPie.class);
                Bundle bundle = new Bundle();
                bundle.putString("xStr", this.f2425g);
                bundle.putString("yStr", this.f2426h);
                bundle.putString("total", this.f2427i);
                bundle.putString("title", getIntent().getStringExtra("title"));
                bundle.putString("account", this.f2420b.getText().toString());
                if (this.f2423e != null) {
                    bundle.putString("category", (String) this.f2423e.getSelectedItem());
                }
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                ck.m4025a(this.f2419a, this.f2422d.getChartBitmap(), getIntent().getStringExtra("title") + ".png", (getIntent().getStringExtra("title") + "\n") + getResources().getString(2131099678) + ": " + this.f2420b.getText().toString() + "\n\n");
                break;
            case 16908332:
                onBackPressed();
                break;
        }
        return true;
    }
}
