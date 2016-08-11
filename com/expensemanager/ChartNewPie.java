package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.p032f.C0393c;
import com.github.mikephil.charting.p039h.C0538d;
import com.github.mikephil.charting.p040d.C0505h;
import com.google.android.gms.C0607c;

public class ChartNewPie extends Activity implements C0393c {
    String f2570a;
    private PieChart f2571b;
    private int f2572c;

    public ChartNewPie() {
        this.f2572c = -16777216;
        this.f2570a = "";
    }

    public void m2490a() {
    }

    public void m2491a(C0505h c0505h, int i, C0538d c0538d) {
        if (c0505h != null && ((double) c0505h.m4530c()) != 0.0d) {
            String str = "account in (" + abd.m3792a(getIntent().getStringExtra("account")) + ")";
            if (getResources().getString(2131099886).equals(getIntent().getStringExtra("title"))) {
                str = !this.f2571b.m4370b(c0505h.m4529b()).startsWith("Other") ? str + " AND " + "category" + "='" + this.f2571b.m4370b(c0505h.m4529b()) + "' AND " + "category" + "!='Income' " : str + " AND " + "category" + " in (" + abd.m3792a(this.f2570a) + ")" + " AND " + "category" + "!='Income' ";
            }
            if (getResources().getString(2131099933).equals(getIntent().getStringExtra("title"))) {
                str = !this.f2571b.m4370b(c0505h.m4529b()).startsWith("Other") ? str + " AND " + "subcategory" + "='" + this.f2571b.m4370b(c0505h.m4529b()) + "' AND " + "category" + "='Income' " : str + " AND " + "subcategory" + " in (" + abd.m3792a(this.f2570a) + ")" + " AND " + "category" + "='Income' ";
            }
            if (getResources().getString(2131100107).equals(getIntent().getStringExtra("title"))) {
                String stringExtra = getIntent().getStringExtra("category");
                str = !this.f2571b.m4370b(c0505h.m4529b()).startsWith("Other") ? str + " AND " + "subcategory" + "='" + this.f2571b.m4370b(c0505h.m4529b()) + "' AND " + "category" + "='" + stringExtra + "' " : str + " AND " + "subcategory" + " in (" + abd.m3792a(this.f2570a) + ")" + " AND " + "category" + "='" + stringExtra + "' ";
            }
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this, ExpenseAccountExpandableList.class);
            bundle.putString("title", getIntent().getStringExtra("title"));
            bundle.putString("account", getIntent().getStringExtra("account"));
            bundle.putString("whereClause", str);
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
        setTitle(getIntent().getStringExtra("account"));
        int i = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        if (i == 1 || i > 3) {
            this.f2572c = -1;
        }
        setContentView(2130903058);
        this.f2571b = (PieChart) findViewById(2131558413);
        this.f2571b.setOnChartValueSelectedListener(this);
        this.f2570a = ck.m4023a(this.f2571b, getIntent().getStringExtra("xStr"), getIntent().getStringExtra("yStr"), getIntent().getStringExtra("total"), this.f2572c);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 2, 0, 2131099869).setIcon(2130837600).setShowAsAction(2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.LoadingImageView_circleCrop /*2*/:
                ck.m4025a((Context) this, this.f2571b.getChartBitmap(), getIntent().getStringExtra("title") + ".png", (getIntent().getStringExtra("title") + "\n") + getResources().getString(2131099678) + ": " + getIntent().getStringExtra("account") + "\n\n");
                break;
            case 16908332:
                onBackPressed();
                break;
        }
        return true;
    }
}
