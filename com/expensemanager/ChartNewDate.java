package com.expensemanager;

import android.app.ActionBar.OnNavigationListener;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.C0037o;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.github.mikephil.charting.charts.C0489c;
import com.google.android.gms.C0607c;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChartNewDate extends C0037o {
    private static int f2475A;
    private static TextView f2476B;
    private static RadioButton f2477C;
    private static RadioButton f2478D;
    private static RadioButton f2479E;
    private static RadioButton f2480F;
    private static Spinner f2481G;
    private static String f2482L;
    private static String f2483M;
    private static HashMap<Integer, C0489c> f2484N;
    static int f2485o;
    static ViewPager f2486r;
    static ArrayList<HashMap<String, String>> f2487s;
    static ro f2488t;
    static String f2489v;
    static boolean f2490w;
    static int f2491x;
    private static int f2492z;
    private Button f2493H;
    private Button f2494I;
    private RelativeLayout f2495J;
    private LinearLayout f2496K;
    private int f2497O;
    private OnDateSetListener f2498P;
    RelativeLayout f2499n;
    ar f2500p;
    MyTabPageIndicator f2501q;
    int f2502u;
    private Context f2503y;

    static {
        f2492z = -16777216;
        f2475A = co.f4428b;
        f2482L = "category";
        f2483M = "Personal Expense";
        f2485o = 1;
        f2487s = new ArrayList();
        f2489v = "LINE";
        f2490w = false;
        f2491x = 0;
    }

    public ChartNewDate() {
        this.f2503y = this;
        this.f2502u = 0;
        this.f2497O = 2131099739;
        this.f2498P = new ai(this);
    }

    public static int m2413a(String str, ArrayList<HashMap<String, String>> arrayList) {
        String substring = str.substring(0, str.indexOf(" "));
        for (int i = 0; i < arrayList.size(); i++) {
            HashMap hashMap = (HashMap) arrayList.get(i);
            if (substring != null && substring.equals(hashMap.get("fromDate"))) {
                return i;
            }
        }
        return 0;
    }

    public static String m2415a(ro roVar, String str, List<Map<String, Object>> list, List<String> list2, String str2, boolean z) {
        double d;
        String string;
        String string2;
        String a;
        roVar.m4193a();
        Cursor a2 = roVar.m4192a(str, "expensed DESC");
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        Object obj = "";
        if (a2 == null || !a2.moveToFirst()) {
            d = 0.0d;
        } else {
            double a3;
            int columnIndex = a2.getColumnIndex("account");
            int columnIndex2 = a2.getColumnIndex("amount");
            int columnIndex3 = a2.getColumnIndex("expensed");
            int columnIndex4 = a2.getColumnIndex("category");
            d = 0.0d;
            while (true) {
                String str3;
                string = a2.getString(columnIndex);
                string2 = a2.getString(columnIndex2);
                a = (ExpenseManager.f3246v == null || !z) ? string2 : abd.m3793a(string2, (String) ExpenseManager.f3246v.get(string));
                Object a4 = aba.m3749a(a2.getLong(columnIndex3), ExpenseManager.f3244t);
                string2 = "";
                if ("Income".equalsIgnoreCase(a2.getString(columnIndex4))) {
                    string2 = a;
                    str3 = a;
                } else {
                    str3 = "-" + a;
                }
                if ("Yearly".equalsIgnoreCase(str2)) {
                    a4 = aba.m3749a(a2.getLong(columnIndex3), "yy-MM");
                }
                if (hashMap.get(a4) == null) {
                    hashMap.put(a4, aba.m3781g(str3));
                } else {
                    hashMap.put(a4, "" + aba.m3743a((String) hashMap.get(a4), str3));
                }
                if (hashMap2.get(a4) == null) {
                    hashMap2.put(a4, aba.m3781g(string2));
                } else {
                    hashMap2.put(a4, "" + aba.m3743a((String) hashMap2.get(a4), string2));
                }
                a3 = aba.m3742a(d, str3);
                if (!a2.moveToNext()) {
                    break;
                }
                d = a3;
            }
            obj = string;
            d = a3;
        }
        for (int i = 0; i < list2.size(); i++) {
            Object obj2;
            Object a5;
            Map hashMap3 = new HashMap();
            a = (String) list2.get(i);
            string = aba.m3756a((String) hashMap.get(a));
            String a6 = aba.m3756a((String) hashMap2.get(a));
            if ("".equals(string)) {
                obj2 = "0";
            } else {
                string2 = string;
            }
            if ("Weekly".equalsIgnoreCase(str2)) {
                a5 = aba.m3757a(ExpenseManager.f3244t, "EEE yy-MM-dd", a);
            } else {
                string = a;
            }
            if ("Monthly".equalsIgnoreCase(str2)) {
                a5 = aba.m3757a(ExpenseManager.f3244t, "yy-MM-dd", a);
            }
            hashMap3.put("expenseDate", a5);
            hashMap3.put("amount", obj2);
            hashMap3.put("incomeValue", a6);
            hashMap3.put("account", obj);
            list.add(hashMap3);
        }
        if (a2 != null) {
            a2.close();
        }
        roVar.m4201b();
        return aba.m3746a(d);
    }

    public static List<String> m2416a(Date date) {
        List<String> arrayList = new ArrayList();
        Calendar instance = Calendar.getInstance();
        for (int i = 0; i < 7; i++) {
            instance.setTime(date);
            instance.add(6, i);
            arrayList.add(aba.m3749a(instance.getTimeInMillis(), ExpenseManager.f3244t));
        }
        return arrayList;
    }

    private void m2417a(int i, int i2, int i3, Button button) {
        CharSequence b = aib.m3867b(i + "-" + (i2 + 1) + "-" + i3, "yyyy-MM-dd", ExpenseManager.f3244t);
        if (!button.getText().toString().equals(b)) {
            button.setText(b);
            if (!getResources().getString(2131100132).equals(this.f2494I.getText().toString()) && !getResources().getString(2131099912).equals(this.f2493H.getText().toString())) {
                HashMap hashMap = new HashMap();
                hashMap.put("fromDate", this.f2493H.getText().toString());
                hashMap.put("toDate", this.f2494I.getText().toString());
                if (!(hashMap.get("fromDate") == null || hashMap.get("toDate") == null)) {
                    f2487s.add(hashMap);
                }
                f2485o = f2487s.size();
                this.f2500p.m145c();
                this.f2501q.m3495a();
                this.f2501q.setCurrentItem(f2487s.size() - 1);
            }
        }
    }

    public static void m2421a(ro roVar, HashMap<String, String> hashMap) {
        int i = 0;
        Object obj = "";
        roVar.m4193a();
        Cursor b = roVar.m4200b("expensed", null, "expensed ASC");
        if (b != null) {
            try {
                if (b.moveToFirst()) {
                    int columnIndex = b.getColumnIndex("expensed");
                    do {
                        obj = aba.m3749a(b.getLong(columnIndex), ExpenseManager.f3244t);
                        if (i == 0) {
                            hashMap.put("fromDate", obj);
                        }
                        i++;
                    } while (b.moveToNext());
                }
            } catch (Exception e) {
            }
        }
        DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
        if (new Date().after(simpleDateFormat.parse(obj))) {
            obj = simpleDateFormat.format(new Date());
        }
        hashMap.put("toDate", obj);
        if (b != null) {
            b.close();
        }
        roVar.m4201b();
    }

    private void m2422a(HashMap<String, String> hashMap, ArrayList<HashMap<String, String>> arrayList) {
        try {
            String str = (String) hashMap.get("fromDate");
            String str2 = (String) hashMap.get("toDate");
            DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
            Date parse = simpleDateFormat.parse(str);
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            parse = simpleDateFormat.parse(str2);
            do {
                HashMap hashMap2 = new HashMap();
                instance.set(2, ExpenseManager.f3241q);
                instance.set(5, ExpenseManager.f3242r);
                hashMap2.put("fromDate", simpleDateFormat.format(instance.getTime()));
                instance.add(1, 1);
                instance.add(6, -1);
                hashMap2.put("toDate", simpleDateFormat.format(instance.getTime()));
                arrayList.add(hashMap2);
                instance.add(6, 1);
            } while (!instance.getTime().after(parse));
        } catch (Exception e) {
        }
    }

    private void m2423a(String[] strArr, TextView textView) {
        boolean[] zArr = new boolean[strArr.length];
        String charSequence = textView.getText().toString();
        if (!(charSequence == null || "".equals(charSequence))) {
            List arrayList = new ArrayList(Arrays.asList(strArr));
            String[] split = charSequence.split(",");
            for (Object indexOf : split) {
                int indexOf2 = arrayList.indexOf(indexOf);
                if (indexOf2 < zArr.length && indexOf2 != -1) {
                    zArr[indexOf2] = true;
                }
            }
        }
        new Builder(this).setTitle(2131100026).setMultiChoiceItems(strArr, zArr, new ah(this, zArr)).setPositiveButton(2131099983, new ag(this, zArr, strArr, textView)).setNegativeButton(2131099754, new af(this)).show();
    }

    public static List<String> m2426b(Date date) {
        List<String> arrayList = new ArrayList();
        Calendar instance = Calendar.getInstance();
        for (int i = 0; i < 12; i++) {
            instance.setTime(date);
            instance.add(2, i);
            arrayList.add(aba.m3749a(instance.getTimeInMillis(), "yy-MM"));
        }
        return arrayList;
    }

    private void m2428b(HashMap<String, String> hashMap, ArrayList<HashMap<String, String>> arrayList) {
        try {
            String str = (String) hashMap.get("fromDate");
            String str2 = (String) hashMap.get("toDate");
            DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
            Date parse = simpleDateFormat.parse(str);
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            parse = simpleDateFormat.parse(str2);
            do {
                HashMap hashMap2 = new HashMap();
                instance.set(7, ExpenseManager.f3243s);
                hashMap2.put("fromDate", simpleDateFormat.format(instance.getTime()));
                instance.add(7, 6);
                hashMap2.put("toDate", simpleDateFormat.format(instance.getTime()));
                arrayList.add(hashMap2);
                instance.add(7, 1);
            } while (!instance.getTime().after(parse));
        } catch (Exception e) {
        }
    }

    public static List<String> m2431c(Date date) {
        List<String> arrayList = new ArrayList();
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(date);
        instance2.add(2, 1);
        int i = 0;
        do {
            instance.setTime(date);
            instance.add(6, i);
            arrayList.add(aba.m3749a(instance.getTimeInMillis(), ExpenseManager.f3244t));
            i++;
        } while (instance.before(instance2));
        return arrayList;
    }

    private void m2433c(HashMap<String, String> hashMap, ArrayList<HashMap<String, String>> arrayList) {
        try {
            String str = (String) hashMap.get("fromDate");
            String str2 = (String) hashMap.get("toDate");
            DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
            Date parse = simpleDateFormat.parse(str);
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            parse = simpleDateFormat.parse(str2);
            do {
                HashMap hashMap2 = new HashMap();
                instance.set(5, ExpenseManager.f3242r);
                hashMap2.put("fromDate", simpleDateFormat.format(instance.getTime()));
                instance.add(2, 1);
                instance.add(5, -1);
                hashMap2.put("toDate", simpleDateFormat.format(instance.getTime()));
                arrayList.add(hashMap2);
                instance.add(5, 1);
            } while (!instance.getTime().after(parse));
        } catch (Exception e) {
        }
    }

    private void m2442o() {
        Resources resources = this.f2503y.getResources();
        this.f2495J = (RelativeLayout) findViewById(2131558479);
        this.f2496K = (LinearLayout) findViewById(2131558768);
        f2476B = (TextView) findViewById(2131558476);
        f2476B.setText(f2483M);
        this.f2499n = (RelativeLayout) findViewById(2131558473);
        Object a = abd.m3786a(this.f2503y, f2488t, "MY_ACCOUNT_NAMES", "Personal Expense");
        if ("All".equals(f2483M)) {
            f2476B.setText(a);
        }
        this.f2499n.setOnClickListener(new ac(this, a));
        HashMap hashMap = new HashMap();
        m2421a(f2488t, hashMap);
        f2487s.clear();
        if (!(hashMap.get("fromDate") == null || hashMap.get("toDate") == null)) {
            f2487s.add(hashMap);
        }
        m2428b(hashMap, f2487s);
        f2485o = f2487s.size();
        this.f2493H = (Button) findViewById(2131558652);
        this.f2494I = (Button) findViewById(2131558654);
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558650);
        TextView textView = (TextView) findViewById(2131558651);
        textView.setOnClickListener(new aj(this, textView));
        this.f2493H.setOnClickListener(new ak(this));
        this.f2494I.setOnClickListener(new al(this));
        f2477C = (RadioButton) findViewById(2131558646);
        f2477C.setVisibility(8);
        f2478D = (RadioButton) findViewById(2131558647);
        f2479E = (RadioButton) findViewById(2131558648);
        f2480F = (RadioButton) findViewById(2131558649);
        f2477C.setOnClickListener(new am(this, hashMap, textView));
        f2478D.setOnClickListener(new an(this, hashMap, linearLayout));
        f2479E.setOnClickListener(new ao(this, hashMap, linearLayout));
        f2480F.setOnClickListener(new ap(this, hashMap, linearLayout));
        f2478D.setChecked(true);
        List arrayList = new ArrayList(Arrays.asList(new String[]{resources.getString(2131099881), resources.getString(2131099931)}));
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        f2481G = (Spinner) findViewById(2131558644);
        f2481G.setAdapter(arrayAdapter);
        f2481G.setOnItemSelectedListener(new aq(this));
        Button button = (Button) findViewById(2131558472);
        button.setText(this.f2497O);
        button.setOnClickListener(new ad(this, button));
        this.f2500p = new ar(m366f());
        f2486r = (ViewPager) findViewById(2131558656);
        f2486r.setAdapter(this.f2500p);
        this.f2501q = (MyTabPageIndicator) findViewById(2131558655);
        this.f2501q.setViewPager(f2486r);
        this.f2501q.setCurrentItem(m2413a(aba.m3763b(0), f2487s));
        if (getResources().getConfiguration().orientation != 2) {
            this.f2495J.setVisibility(0);
            this.f2496K.setVisibility(0);
            this.f2499n.setVisibility(0);
        } else if (!((getResources().getConfiguration().screenLayout & 15) == 4 || (getResources().getConfiguration().screenLayout & 15) == 3)) {
            this.f2499n.setVisibility(8);
        }
        this.f2495J.setVisibility(8);
        f2484N = new HashMap();
        SpinnerAdapter arrayAdapter2 = new ArrayAdapter(this, 2130903149, arrayList);
        arrayAdapter2.setDropDownViewResource(2130903150);
        OnNavigationListener aeVar = new ae(this);
        getActionBar().setNavigationMode(1);
        getActionBar().setDisplayShowTitleEnabled(false);
        getActionBar().setListNavigationCallbacks(arrayAdapter2, aeVar);
        getActionBar().setSelectedNavigationItem(f2491x);
    }

    private void m2443p() {
        if (f2484N.get(Integer.valueOf(f2486r.getCurrentItem())) != null) {
            ck.m4025a(this.f2503y, ((C0489c) f2484N.get(Integer.valueOf(f2486r.getCurrentItem()))).getChartBitmap(), getIntent().getStringExtra("title") + ".png", (getIntent().getStringExtra("title") + "\n") + getResources().getString(2131099678) + ": " + f2476B.getText().toString() + "\n\n");
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (-1 != i2) {
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m2442o();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        if (i == 1 || i > 3) {
            setTheme(2131230730);
            f2492z = -1;
        } else {
            f2492z = -16777216;
        }
        abd.m3802a((Activity) this, true);
        setTitle(getIntent().getStringExtra("title"));
        f2488t = new ro(this);
        f2483M = getIntent().getStringExtra("account");
        if (f2483M == null || "".equals(f2483M)) {
            f2483M = "Personal Expense";
        }
        setContentView(2130903093);
        f2489v = "LINE";
        m2442o();
    }

    protected Dialog onCreateDialog(int i) {
        this.f2502u = i;
        Calendar instance = Calendar.getInstance();
        int i2 = instance.get(1);
        int i3 = instance.get(2);
        int i4 = instance.get(5);
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                try {
                    return new DatePickerDialog(this, this.f2498P, i2, i3, i4);
                } catch (Exception e) {
                    return new DatePickerDialog(this, this.f2498P, instance.get(1), instance.get(2), instance.get(5));
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                return new DatePickerDialog(this, this.f2498P, i2, i3, i4);
            default:
                return null;
        }
        return new DatePickerDialog(this, this.f2498P, instance.get(1), instance.get(2), instance.get(5));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 0, 0, 2131099869).setIcon(2130837600).setShowAsAction(2);
        menu.add(0, 1, 1, 2131099764).setIcon(2130837609).setShowAsAction(2);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                m2443p();
                return true;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if ("LINE".equals(f2489v)) {
                    menuItem.setIcon(2130837604);
                    f2489v = "BAR";
                    this.f2497O = 2131099945;
                } else {
                    menuItem.setIcon(2130837609);
                    f2489v = "LINE";
                    this.f2497O = 2131099739;
                }
                this.f2500p.m145c();
                break;
            case 16908332:
                onBackPressed();
                break;
        }
        return super.onMenuItemSelected(i, menuItem);
    }
}
