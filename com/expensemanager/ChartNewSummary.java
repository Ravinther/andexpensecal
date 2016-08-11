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

public class ChartNewSummary extends C0037o {
    static String f2573A;
    private static int f2574C;
    private static int f2575D;
    private static TextView f2576E;
    private static Spinner f2577J;
    private static HashMap<Integer, C0489c> f2578O;
    private static String f2579P;
    private static String f2580Q;
    static int f2581o;
    static ArrayList<HashMap<String, String>> f2582r;
    static ro f2583s;
    static String f2584u;
    static int f2585v;
    static boolean f2586w;
    static ViewPager f2587x;
    static int f2588y;
    private Context f2589B;
    private RadioButton f2590F;
    private RadioButton f2591G;
    private RadioButton f2592H;
    private RadioButton f2593I;
    private Button f2594K;
    private Button f2595L;
    private RelativeLayout f2596M;
    private LinearLayout f2597N;
    private int f2598R;
    private OnDateSetListener f2599S;
    RelativeLayout f2600n;
    ch f2601p;
    MyTabPageIndicator f2602q;
    int f2603t;
    ArrayList<String> f2604z;

    static {
        f2574C = -16777216;
        f2575D = co.f4428b;
        f2579P = "category";
        f2580Q = "Personal Expense";
        f2581o = 1;
        f2582r = new ArrayList();
        f2584u = "PIE";
        f2585v = 0;
        f2586w = false;
        f2588y = 0;
        f2573A = "";
    }

    public ChartNewSummary() {
        this.f2589B = this;
        this.f2603t = 0;
        this.f2598R = 2131100025;
        this.f2599S = new bu(this);
    }

    private int m2495a(String str, ArrayList<HashMap<String, String>> arrayList) {
        String substring = str.substring(0, str.indexOf(" "));
        for (int i = 0; i < arrayList.size(); i++) {
            HashMap hashMap = (HashMap) arrayList.get(i);
            if (substring != null && substring.equals(hashMap.get("fromDate"))) {
                return i;
            }
        }
        return 0;
    }

    public static String m2497a(ro roVar, String str, List<Map<String, Object>> list, String str2, String str3, boolean z) {
        String string;
        roVar.m4193a();
        Cursor a = roVar.m4192a(str, str3);
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        List arrayList = new ArrayList();
        String str4 = "";
        double d = 0.0d;
        if (a == null || !a.moveToFirst()) {
            String str5 = str4;
        } else {
            double d2;
            int columnIndex;
            String string2;
            double a2;
            int columnIndex2 = a.getColumnIndex("account");
            int columnIndex3 = a.getColumnIndex("amount");
            int columnIndex4 = a.getColumnIndex("category");
            int columnIndex5 = a.getColumnIndex("subcategory");
            int columnIndex6 = a.getColumnIndex(str2);
            if ("Income".equalsIgnoreCase(str2)) {
                d2 = 0.0d;
                columnIndex = a.getColumnIndex("category");
            } else {
                d2 = 0.0d;
                columnIndex = columnIndex6;
            }
            while (true) {
                string2 = a.getString(columnIndex2);
                string = a.getString(columnIndex3);
                if (ExpenseManager.f3246v != null && z) {
                    string = abd.m3793a(string, (String) ExpenseManager.f3246v.get(string2));
                }
                String string3 = a.getString(columnIndex4);
                String string4 = a.getString(columnIndex5);
                String b = aib.m3865b(a.getString(columnIndex));
                if ("Income".equalsIgnoreCase(str2)) {
                    if (!arrayList.contains(string4)) {
                        arrayList.add(string4);
                    }
                } else if (str2 == "subcategory") {
                    if (!arrayList.contains(string3 + ":" + string4)) {
                        arrayList.add(string3 + ":" + string4);
                    }
                } else if (!arrayList.contains(b)) {
                    arrayList.add(b);
                }
                if ("Income".equalsIgnoreCase(string3)) {
                    if (hashMap2.get(string4) == null) {
                        hashMap2.put(string4, aib.m3865b(string));
                    } else {
                        hashMap2.put(string4, "" + aba.m3743a((String) hashMap2.get(string4), string));
                    }
                } else if (str2 == "subcategory") {
                    if (hashMap.get(string3 + ":" + string4) == null) {
                        hashMap.put(string3 + ":" + string4, aib.m3865b(string));
                    } else {
                        hashMap.put(string3 + ":" + string4, "" + aba.m3743a((String) hashMap.get(string3 + ":" + string4), string));
                    }
                } else if (hashMap.get(b) == null) {
                    hashMap.put(b, aib.m3865b(string));
                } else {
                    hashMap.put(b, "" + aba.m3743a((String) hashMap.get(b), string));
                }
                a2 = aba.m3742a(d2, string);
                if (!a.moveToNext()) {
                    break;
                }
                d2 = a2;
            }
            Object obj = string2;
            d = a2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            Map hashMap3 = new HashMap();
            str4 = (String) arrayList.get(i);
            String a3 = aba.m3756a((String) hashMap.get(str4));
            string = aba.m3756a((String) hashMap2.get(str4));
            hashMap3.put("name", str4);
            hashMap3.put("account", obj);
            hashMap3.put("expense", "".equals(a3) ? "" : aba.m3767b(a3));
            hashMap3.put("income", "".equals(string) ? "" : aba.m3767b(string));
            list.add(hashMap3);
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
        return "" + d;
    }

    public static String m2498a(String[] strArr, String str) {
        String str2 = "";
        if (strArr != null && strArr.length > 0) {
            str2 = strArr[strArr.length - 1].trim();
            for (int i = 1; i < strArr.length; i++) {
                str2 = str2 + str + strArr[(strArr.length - 1) - i].trim();
            }
        }
        return str2;
    }

    private void m2499a(int i, int i2, int i3, Button button) {
        CharSequence b = aib.m3867b(i + "-" + (i2 + 1) + "-" + i3, "yyyy-MM-dd", ExpenseManager.f3244t);
        if (!button.getText().toString().equals(b)) {
            button.setText(b);
            if (!getResources().getString(2131100132).equals(this.f2595L.getText().toString()) && !getResources().getString(2131099912).equals(this.f2594K.getText().toString())) {
                HashMap hashMap = new HashMap();
                hashMap.put("fromDate", this.f2594K.getText().toString());
                hashMap.put("toDate", this.f2595L.getText().toString());
                if (!(hashMap.get("fromDate") == null || hashMap.get("toDate") == null)) {
                    f2582r.add(hashMap);
                }
                f2581o = f2582r.size();
                this.f2601p.m145c();
                this.f2602q.m3495a();
                this.f2602q.setCurrentItem(f2582r.size() - 1);
            }
        }
    }

    public static void m2504a(ro roVar, HashMap<String, String> hashMap) {
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

    private void m2505a(HashMap<String, String> hashMap, ArrayList<HashMap<String, String>> arrayList) {
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

    private void m2506a(String[] strArr) {
        boolean[] zArr = new boolean[strArr.length];
        new Builder(this).setTitle(2131100026).setMultiChoiceItems(strArr, zArr, new by(this, zArr)).setPositiveButton(2131099983, new bx(this, zArr, strArr)).setNegativeButton(2131099754, new bw(this)).setNeutralButton(2131100076, new bv(this, strArr)).show();
    }

    private void m2507a(String[] strArr, TextView textView) {
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
        new Builder(this).setTitle(2131100026).setMultiChoiceItems(strArr, zArr, new bt(this, zArr)).setPositiveButton(2131099983, new bs(this, zArr, strArr, textView)).setNegativeButton(2131099754, new br(this)).show();
    }

    private void m2511b(HashMap<String, String> hashMap, ArrayList<HashMap<String, String>> arrayList) {
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

    private void m2515c(HashMap<String, String> hashMap, ArrayList<HashMap<String, String>> arrayList) {
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

    private void m2522m() {
        Resources resources = this.f2589B.getResources();
        this.f2596M = (RelativeLayout) findViewById(2131558479);
        this.f2597N = (LinearLayout) findViewById(2131558768);
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558643);
        f2576E = (TextView) findViewById(2131558476);
        f2576E.setText(f2580Q);
        this.f2600n = (RelativeLayout) findViewById(2131558473);
        Object a = abd.m3786a(this.f2589B, f2583s, "MY_ACCOUNT_NAMES", "Personal Expense");
        if ("All".equals(f2580Q)) {
            f2576E.setText(a);
        }
        this.f2600n.setOnClickListener(new bo(this, a));
        HashMap hashMap = new HashMap();
        m2504a(f2583s, hashMap);
        f2582r.clear();
        if (!(hashMap.get("fromDate") == null || hashMap.get("toDate") == null)) {
            f2582r.add(hashMap);
        }
        f2581o = f2582r.size();
        this.f2594K = (Button) findViewById(2131558652);
        this.f2595L = (Button) findViewById(2131558654);
        linearLayout = (LinearLayout) findViewById(2131558650);
        TextView textView = (TextView) findViewById(2131558651);
        textView.setOnClickListener(new bz(this, textView));
        this.f2594K.setOnClickListener(new ca(this));
        this.f2595L.setOnClickListener(new cb(this));
        this.f2590F = (RadioButton) findViewById(2131558646);
        this.f2591G = (RadioButton) findViewById(2131558647);
        this.f2592H = (RadioButton) findViewById(2131558648);
        this.f2593I = (RadioButton) findViewById(2131558649);
        this.f2590F.setOnClickListener(new cc(this, hashMap, textView));
        this.f2591G.setOnClickListener(new cd(this, hashMap, linearLayout));
        this.f2592H.setOnClickListener(new ce(this, hashMap, linearLayout));
        this.f2593I.setOnClickListener(new cf(this, hashMap, linearLayout));
        this.f2604z = new ArrayList(Arrays.asList(new String[]{resources.getString(2131099755), resources.getString(2131099932), resources.getString(2131100007), resources.getString(2131100011), resources.getString(2131100101), resources.getString(2131100110), resources.getString(2131100106), resources.getString(2131099757), resources.getString(2131099935), resources.getString(2131100108)}));
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, this.f2604z);
        arrayAdapter.setDropDownViewResource(17367049);
        f2577J = (Spinner) findViewById(2131558644);
        f2577J.setAdapter(arrayAdapter);
        f2577J.setOnItemSelectedListener(new cg(this));
        Button button = (Button) findViewById(2131558472);
        button.setText(this.f2598R);
        button.setOnClickListener(new bp(this, button));
        this.f2601p = new ch(m366f());
        f2587x = (ViewPager) findViewById(2131558656);
        f2587x.setAdapter(this.f2601p);
        this.f2602q = (MyTabPageIndicator) findViewById(2131558655);
        this.f2602q.setViewPager(f2587x);
        if (getResources().getConfiguration().orientation != 2) {
            this.f2596M.setVisibility(0);
            this.f2597N.setVisibility(0);
            this.f2600n.setVisibility(0);
        } else if (!((getResources().getConfiguration().screenLayout & 15) == 4 || (getResources().getConfiguration().screenLayout & 15) == 3)) {
            this.f2597N.setVisibility(8);
            this.f2600n.setVisibility(8);
        }
        this.f2596M.setVisibility(8);
        SpinnerAdapter arrayAdapter2 = new ArrayAdapter(this, 2130903149, this.f2604z);
        arrayAdapter2.setDropDownViewResource(2130903150);
        OnNavigationListener bqVar = new bq(this);
        getActionBar().setNavigationMode(1);
        getActionBar().setDisplayShowTitleEnabled(false);
        getActionBar().setListNavigationCallbacks(arrayAdapter2, bqVar);
        getActionBar().setSelectedNavigationItem(f2588y);
    }

    private void m2523n() {
        if (f2578O.get(Integer.valueOf(f2587x.getCurrentItem())) != null) {
            ck.m4025a(this.f2589B, ((C0489c) f2578O.get(Integer.valueOf(f2587x.getCurrentItem()))).getChartBitmap(), getIntent().getStringExtra("title") + ".png", ((getResources().getString(2131099678) + ": " + f2576E.getText().toString() + "\n") + getResources().getString(2131099794) + ": " + ((String) ((HashMap) f2582r.get(f2587x.getCurrentItem())).get("fromDate")) + " - " + ((String) ((HashMap) f2582r.get(f2587x.getCurrentItem())).get("toDate")) + "\n") + getResources().getString(2131099764) + ": " + ((String) this.f2604z.get(f2588y)) + "\n\n");
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (-1 == i2) {
            this.f2601p.m145c();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m2522m();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        if (i == 1 || i > 3) {
            setTheme(2131230730);
            f2574C = -1;
        } else {
            f2574C = -16777216;
        }
        abd.m3802a((Activity) this, true);
        f2583s = new ro(this);
        f2580Q = getIntent().getStringExtra("account");
        if (f2580Q == null || "".equals(f2580Q)) {
            f2580Q = "Personal Expense";
        }
        setContentView(2130903095);
        setTitle(2131099756);
        f2584u = "BAR";
        f2578O = new HashMap();
        m2522m();
    }

    protected Dialog onCreateDialog(int i) {
        this.f2603t = i;
        Calendar instance = Calendar.getInstance();
        int i2 = instance.get(1);
        int i3 = instance.get(2);
        int i4 = instance.get(5);
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                try {
                    return new DatePickerDialog(this, this.f2599S, i2, i3, i4);
                } catch (Exception e) {
                    return new DatePickerDialog(this, this.f2599S, instance.get(1), instance.get(2), instance.get(5));
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                return new DatePickerDialog(this, this.f2599S, i2, i3, i4);
            default:
                return null;
        }
        return new DatePickerDialog(this, this.f2599S, instance.get(1), instance.get(2), instance.get(5));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 0, 0, 2131099869).setIcon(2130837600).setShowAsAction(2);
        menu.add(0, 1, 1, 2131099764).setIcon(2130837620).setShowAsAction(2);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                m2523n();
                return true;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if ("PIE".equals(f2584u)) {
                    menuItem.setIcon(2130837620);
                    f2584u = "BAR";
                    this.f2598R = 2131100025;
                } else {
                    menuItem.setIcon(2130837609);
                    f2584u = "PIE";
                    this.f2598R = 2131099739;
                }
                this.f2601p.m145c();
                break;
            case 16908332:
                onBackPressed();
                break;
        }
        return super.onMenuItemSelected(i, menuItem);
    }
}
