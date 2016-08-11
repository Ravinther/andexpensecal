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
import com.github.mikephil.charting.p037c.C0480g;
import com.github.mikephil.charting.p037c.C0481h;
import com.github.mikephil.charting.p039h.C0538d;
import com.github.mikephil.charting.p040d.C0505h;
import com.google.android.gms.C0607c;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ChartNewPeriodChart extends Activity implements C0393c {
    Context f2560a;
    protected HorizontalBarChart f2561b;
    ro f2562c;
    String f2563d;
    String f2564e;
    String f2565f;
    String f2566g;
    boolean f2567h;
    private int f2568i;
    private int f2569j;

    public ChartNewPeriodChart() {
        this.f2568i = -16777216;
        this.f2569j = co.f4428b;
        this.f2560a = this;
        this.f2563d = "";
        this.f2564e = "";
        this.f2565f = "";
        this.f2566g = "";
        this.f2567h = true;
    }

    public void m2488a() {
    }

    @SuppressLint({"NewApi"})
    public void m2489a(C0505h c0505h, int i, C0538d c0538d) {
        if (c0505h != null && ((double) c0505h.m4530c()) != 0.0d) {
            try {
                Calendar instance;
                String b = this.f2561b.m4370b(c0505h.m4529b());
                b + "-" + ExpenseManager.f3242r;
                String stringExtra = getIntent().getStringExtra("dateType");
                String str = "";
                String str2 = "";
                String stringExtra2 = getIntent().getStringExtra("whereClause");
                if ("monthly".equalsIgnoreCase(stringExtra)) {
                    str2 = b + "-" + ExpenseManager.f3242r;
                    Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(str2);
                    str = aib.m3867b(str2, "yyyy-MM-dd", ExpenseManager.f3244t);
                    instance = Calendar.getInstance();
                    instance.setTimeInMillis(parse.getTime());
                    instance.add(2, 1);
                    instance.add(5, -1);
                    str2 = aba.m3749a(instance.getTimeInMillis(), ExpenseManager.f3244t);
                }
                if ("weekly".equalsIgnoreCase(stringExtra)) {
                    String[] stringArrayExtra = getIntent().getStringArrayExtra("dateRange");
                    if (stringArrayExtra != null) {
                        stringArrayExtra = stringArrayExtra[c0505h.m4529b()].split(" - ");
                        if (stringArrayExtra.length == 2) {
                            str = stringArrayExtra[0];
                            str2 = stringArrayExtra[1];
                        } else {
                            return;
                        }
                    }
                    return;
                }
                if ("yearly".equalsIgnoreCase(stringExtra)) {
                    str2 = b + "-" + (ExpenseManager.f3241q + 1) + "-" + ExpenseManager.f3242r;
                    Date parse2 = new SimpleDateFormat("yyyy-DD-dd").parse(str2);
                    str = aib.m3867b(str2, "yyyy-MM-dd", ExpenseManager.f3244t);
                    instance = Calendar.getInstance();
                    instance.setTimeInMillis(parse2.getTime());
                    instance.add(1, 1);
                    instance.add(5, -1);
                    str2 = aba.m3749a(instance.getTimeInMillis(), ExpenseManager.f3244t);
                }
                str2 = (stringExtra2 + " AND " + "expensed" + ">=" + abd.m3818c(str)) + " AND " + "expensed" + "<=" + abd.m3820d(str2);
                Bundle bundle = new Bundle();
                Intent intent = new Intent(this, ExpenseAccountExpandableList.class);
                bundle.putString("title", getIntent().getStringExtra("title"));
                bundle.putString("account", getIntent().getStringExtra("account"));
                bundle.putString("whereClause", str2);
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
        if (-1 == i2) {
            onCreate(null);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(getIntent().getStringExtra("title"));
        this.f2562c = new ro(this);
        int i = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        if (i == 1 || i > 3) {
            this.f2568i = -1;
        }
        setContentView(2130903056);
        this.f2561b = (HorizontalBarChart) findViewById(2131558413);
        this.f2561b.setOnChartValueSelectedListener(this);
        this.f2569j = co.f4428b;
        if ("income".equalsIgnoreCase(getIntent().getStringExtra("viewType"))) {
            this.f2569j = co.f4429c;
        }
        this.f2563d = getIntent().getStringExtra("xStr");
        this.f2564e = getIntent().getStringExtra("yStr");
        this.f2565f = getIntent().getStringExtra("total");
        this.f2565f = this.f2565f.replace("(", "");
        this.f2565f = this.f2565f.replace(")", "");
        ck.m4027a(this.f2561b, this.f2563d, this.f2564e, this.f2568i, this.f2569j, null);
        if (this.f2564e != null && !"".equals(this.f2564e) && this.f2565f != null && !"".equals(this.f2565f)) {
            String a = aib.m3850a(aib.m3877i(this.f2565f) / ((double) this.f2564e.split(",").length));
            C0480g c0480g = new C0480g((float) aib.m3877i(a), "Avg:" + a);
            c0480g.m4320a(0.5f);
            c0480g.m4321a(20.0f, 10.0f, 0.0f);
            c0480g.m4323a(C0481h.POS_RIGHT);
            c0480g.m4325b(10.0f);
            c0480g.m4326b(this.f2568i);
            c0480g.m4322a(this.f2568i);
            this.f2561b.getAxisLeft().m4282a(c0480g);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 2, 0, 2131099869).setIcon(2130837600).setShowAsAction(2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.LoadingImageView_circleCrop /*2*/:
                ck.m4025a(this.f2560a, this.f2561b.getChartBitmap(), getIntent().getStringExtra("title") + ".png", (getIntent().getStringExtra("title") + "\n") + getResources().getString(2131099678) + ": " + getIntent().getStringExtra("account") + "\n\n");
                break;
            case 16908332:
                onBackPressed();
                break;
        }
        return true;
    }
}
