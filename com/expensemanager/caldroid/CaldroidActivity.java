package com.expensemanager.caldroid;

import android.annotation.SuppressLint;
import android.app.ActionBar.OnNavigationListener;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.C0037o;
import android.support.v4.app.ad;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.expensemanager.ExpenseAccountSummaryTime;
import com.expensemanager.ExpenseManager;
import com.expensemanager.aba;
import com.expensemanager.abd;
import com.expensemanager.ro;
import com.google.android.gms.C0607c;
import com.roomorama.caldroid.C0421a;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@SuppressLint({"SimpleDateFormat"})
public class CaldroidActivity extends C0037o {
    private C0421a f4355n;
    private ro f4356o;
    private Context f4357p;
    private String f4358q;
    private String f4359r;
    private int f4360s;
    private int f4361t;

    public CaldroidActivity() {
        this.f4357p = this;
        this.f4358q = "Personal Expense";
        this.f4359r = "";
        this.f4360s = 2014;
        this.f4361t = 1;
    }

    public static String m3952a(double d) {
        String str = "";
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        if (d >= 10000.0d) {
            decimalFormat.applyPattern("#,###");
            return decimalFormat.format(d);
        }
        decimalFormat.applyPattern("#,###.00");
        return decimalFormat.format(d);
    }

    private String m3953a(int i, int i2, String str) {
        Calendar instance = Calendar.getInstance();
        instance.set(2, i - 1);
        instance.set(1, i2);
        instance.set(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long timeInMillis = instance.getTimeInMillis();
        Calendar instance2 = Calendar.getInstance();
        instance2.set(2, i);
        instance2.set(1, i2);
        instance2.set(5, 1);
        instance2.set(11, 0);
        instance2.set(12, 0);
        instance2.set(13, 0);
        instance2.set(14, 0);
        String str2 = "expensed>=" + timeInMillis + " AND " + "expensed" + "<" + instance2.getTimeInMillis();
        if (!"All".equalsIgnoreCase(str)) {
            return str2 + " AND " + "account" + " in (" + abd.m3792a(str) + ")";
        }
        return ((str2 + " AND " + "category" + "!='Account Transfer' ") + " AND " + "subcategory" + "!='Account Transfer' ") + " AND " + "account" + " in (" + abd.m3792a(this.f4359r) + ")";
    }

    private String m3958a(ro roVar, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        roVar.m4193a();
        Cursor a = roVar.m4192a(str, "expensed DESC");
        if (a != null && a.moveToFirst()) {
            int columnIndex = a.getColumnIndex("account");
            int columnIndex2 = a.getColumnIndex("amount");
            int columnIndex3 = a.getColumnIndex("expensed");
            int columnIndex4 = a.getColumnIndex("category");
            double d4 = 0.0d;
            d = 0.0d;
            d2 = 0.0d;
            while (true) {
                String str2;
                String string = a.getString(columnIndex);
                String string2 = a.getString(columnIndex2);
                if (ExpenseManager.f3246v != null) {
                    if ("All".equalsIgnoreCase(this.f4358q)) {
                        string2 = abd.m3793a(string2, (String) ExpenseManager.f3246v.get(string));
                    }
                }
                String a2 = aba.m3749a(a.getLong(columnIndex3), "yyyy-MM-dd");
                Map<String, String> map4;
                if ("Income".equalsIgnoreCase(a.getString(columnIndex4))) {
                    if (map.get(a2) == null) {
                        map.put(a2, m3964b(string2));
                    } else {
                        map4 = map;
                        map4.put(a2, "" + aba.m3743a((String) map.get(a2), string2));
                    }
                    d3 = d2;
                    d2 = aba.m3742a(d, string2);
                    str2 = string2;
                } else {
                    d2 = aba.m3742a(d2, string2);
                    if (map2.get(a2) == null) {
                        map2.put(a2, m3964b(string2));
                    } else {
                        map4 = map2;
                        map4.put(a2, "" + aba.m3743a((String) map2.get(a2), string2));
                    }
                    String str3 = "-" + string2;
                    d3 = d2;
                    d2 = d;
                }
                d = aba.m3742a(d4, str2);
                if (!a.moveToNext()) {
                    break;
                }
                d4 = d;
                d = d2;
                d2 = d3;
            }
        }
        map3.put("total", aba.m3762b(d));
        map3.put("incomeTotal", aba.m3746a(d2));
        map3.put("expenseTotal", aba.m3746a(d3));
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
        return aba.m3746a(d);
    }

    private String m3959a(String str, int i, int i2) {
        String str2 = "account in (" + abd.m3792a(str) + ")";
        HashMap hashMap = null;
        if ("All".equalsIgnoreCase(str)) {
            str2 = "account in (" + abd.m3792a(this.f4359r) + ")";
            hashMap = ExpenseManager.f3246v;
        }
        Calendar instance = Calendar.getInstance();
        instance.set(1, i);
        instance.set(2, i2 - 1);
        instance.set(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return abd.m3813b(this.f4356o, str2 + " and " + "expensed" + "<" + instance.getTimeInMillis(), hashMap);
    }

    private void m3960a(Bundle bundle) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
        this.f4355n = new C0422j();
        if (bundle != null) {
            this.f4355n.m4005b(bundle, "CALDROID_SAVED_STATE");
        } else {
            Bundle bundle2 = new Bundle();
            Calendar instance = Calendar.getInstance();
            int intExtra = getIntent().getIntExtra("year", instance.get(1));
            bundle2.putInt("month", getIntent().getIntExtra("month", instance.get(2) + 1));
            bundle2.putInt("year", intExtra);
            bundle2.putBoolean("enableSwipe", true);
            bundle2.putBoolean("sixWeeksInCalendar", true);
            bundle2.putInt("startDayOfWeek", ExpenseManager.f3243s);
            this.f4355n.m311g(bundle2);
        }
        ad a = m366f().m369a();
        a.m161a(2131558457, this.f4355n);
        a.m160a();
        this.f4355n.m4004a(new C0412b(this, simpleDateFormat, (TextView) findViewById(2131558454), (TextView) findViewById(2131558456), (TextView) findViewById(2131558455)));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m3964b(java.lang.String r3) {
        /*
        if (r3 == 0) goto L_0x000a;
    L_0x0002:
        r0 = "";
        r0 = r0.equals(r3);	 Catch:{ Exception -> 0x0025 }
        if (r0 == 0) goto L_0x000c;
    L_0x000a:
        r3 = "0";
    L_0x000c:
        r0 = ",";
        r1 = "";
        r0 = r3.replaceAll(r0, r1);	 Catch:{ Exception -> 0x0025 }
        r1 = "(";
        r2 = "";
        r0 = r0.replace(r1, r2);	 Catch:{ Exception -> 0x0025 }
        r1 = ")";
        r2 = "";
        r0 = r0.replace(r1, r2);	 Catch:{ Exception -> 0x0025 }
    L_0x0024:
        return r0;
    L_0x0025:
        r0 = move-exception;
        r0.printStackTrace();
        r0 = "";
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.expensemanager.caldroid.CaldroidActivity.b(java.lang.String):java.lang.String");
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                if (-1 == i2) {
                    getIntent().putExtra("year", this.f4360s);
                    getIntent().putExtra("month", this.f4361t);
                    m3960a(null);
                }
            default:
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTheme(2131230725);
        int i = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        if (i == 1 || i > 3) {
            setTheme(2131230723);
        }
        setContentView(2130903048);
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558457);
        if (i == 1 || i > 3) {
            linearLayout.setBackgroundColor(-13421773);
        } else {
            linearLayout.setBackgroundColor(-986896);
        }
        this.f4358q = getIntent().getStringExtra("account");
        this.f4356o = new ro(this);
        this.f4359r = abd.m3786a(this.f4357p, this.f4356o, "MY_ACCOUNT_NAMES", "Personal Expense");
        Object arrayList = new ArrayList(Arrays.asList(this.f4359r.split(",")));
        if (arrayList.size() > 1) {
            arrayList.add("All");
        }
        int indexOf = arrayList.indexOf(getIntent().getStringExtra("account"));
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903149, arrayList);
        arrayAdapter.setDropDownViewResource(2130903150);
        OnNavigationListener c0410a = new C0410a(this, arrayList);
        getActionBar().setNavigationMode(1);
        getActionBar().setDisplayShowTitleEnabled(false);
        getActionBar().setListNavigationCallbacks(arrayAdapter, c0410a);
        getActionBar().setSelectedNavigationItem(indexOf);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492869, menu);
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Intent intent = new Intent(this.f4357p, ExpenseManager.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f4358q);
            intent.putExtras(bundle);
            setResult(-1, intent);
            finish();
        }
        return false;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        int i2 = 0;
        switch (menuItem.getItemId()) {
            case 16908332:
                dispatchKeyEvent(new KeyEvent(0, 4));
                return true;
            case 2131559153:
                Bundle bundle = new Bundle();
                Intent intent = new Intent(this, ExpenseAccountSummaryTime.class);
                bundle.putString("account", getIntent().getStringExtra("account"));
                bundle.putInt("typeId", 0);
                bundle.putInt("timeMode", 1);
                intent.putExtras(bundle);
                startActivity(intent);
                return true;
            case 2131559154:
                String a = abd.m3786a(this.f4357p, this.f4356o, "CALENDAR_SETTINGS", "0,1,2");
                CharSequence[] split = getResources().getString(2131099753).split(",");
                boolean[] zArr = new boolean[split.length];
                String[] split2 = a.split(",");
                while (i2 < split2.length) {
                    if (!"".equals(split2[i2])) {
                        zArr[Integer.parseInt(split2[i2])] = true;
                    }
                    i2++;
                }
                new Builder(this).setTitle(2131100026).setMultiChoiceItems(split, zArr, new C0418h(this, zArr)).setPositiveButton(2131099983, new C0417g(this, zArr)).setNegativeButton(2131099754, new C0416f(this)).show();
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f4355n != null) {
            this.f4355n.m4003a(bundle, "CALDROID_SAVED_STATE");
        }
    }
}
