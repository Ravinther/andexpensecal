package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
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
import com.google.android.gms.C0607c;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p018c.p019a.C0308b;

public class ExpenseChartDate extends C0037o {
    private static RadioButton f3042A;
    private static RadioButton f3043B;
    private static RadioButton f3044C;
    private static Spinner f3045D;
    private static String f3046I;
    private static String f3047J;
    private static C0308b f3048L;
    static int f3049o;
    static ArrayList<HashMap<String, String>> f3050r;
    static ro f3051s;
    static String f3052u;
    static int f3053v;
    static boolean f3054w;
    private static TextView f3055y;
    private static RadioButton f3056z;
    private Button f3057E;
    private Button f3058F;
    private RelativeLayout f3059G;
    private LinearLayout f3060H;
    private int f3061K;
    private OnDateSetListener f3062M;
    RelativeLayout f3063n;
    og f3064p;
    MyTabPageIndicator f3065q;
    int f3066t;
    private Context f3067x;

    static {
        f3046I = "category";
        f3047J = "Personal Expense";
        f3049o = 1;
        f3050r = new ArrayList();
        f3052u = "LINE";
        f3053v = 0;
        f3054w = false;
    }

    public ExpenseChartDate() {
        this.f3067x = this;
        this.f3066t = 0;
        this.f3061K = 2131099739;
        this.f3062M = new nx(this);
    }

    public static int m2958a(String str, ArrayList<HashMap<String, String>> arrayList) {
        String substring = str.substring(0, str.indexOf(" "));
        for (int i = 0; i < arrayList.size(); i++) {
            HashMap hashMap = (HashMap) arrayList.get(i);
            if (substring != null && substring.equals(hashMap.get("fromDate"))) {
                return i;
            }
        }
        return 0;
    }

    public static String m2961a(ro roVar, String str, List<Map<String, Object>> list, List<String> list2, String str2, boolean z) {
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
                a5 = aba.m3757a(ExpenseManager.f3244t, "EEE MM-dd", a);
            } else {
                string = a;
            }
            if ("Monthly".equalsIgnoreCase(str2)) {
                a5 = aba.m3757a(ExpenseManager.f3244t, "MM-dd", a);
                if ((i / 2) * 2 != i) {
                    a5 = "";
                }
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

    public static List<String> m2962a(Date date) {
        List<String> arrayList = new ArrayList();
        Calendar instance = Calendar.getInstance();
        for (int i = 0; i < 7; i++) {
            instance.setTime(date);
            instance.add(6, i);
            arrayList.add(aba.m3749a(instance.getTimeInMillis(), ExpenseManager.f3244t));
        }
        return arrayList;
    }

    private void m2963a(int i, int i2, int i3, Button button) {
        CharSequence b = aib.m3867b(i + "-" + (i2 + 1) + "-" + i3, "yyyy-MM-dd", ExpenseManager.f3244t);
        if (!button.getText().toString().equals(b)) {
            button.setText(b);
            if (!getResources().getString(2131100132).equals(this.f3058F.getText().toString()) && !getResources().getString(2131099912).equals(this.f3057E.getText().toString())) {
                HashMap hashMap = new HashMap();
                hashMap.put("fromDate", this.f3057E.getText().toString());
                hashMap.put("toDate", this.f3058F.getText().toString());
                if (!(hashMap.get("fromDate") == null || hashMap.get("toDate") == null)) {
                    f3050r.add(hashMap);
                }
                f3049o = f3050r.size();
                this.f3064p.m145c();
                this.f3065q.m3495a();
                this.f3065q.setCurrentItem(f3050r.size() - 1);
            }
        }
    }

    public static void m2967a(ro roVar, HashMap<String, String> hashMap) {
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

    private void m2968a(HashMap<String, String> hashMap, ArrayList<HashMap<String, String>> arrayList) {
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

    private void m2969a(String[] strArr, TextView textView) {
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
        new Builder(this).setTitle(2131100026).setMultiChoiceItems(strArr, zArr, new nw(this, zArr)).setPositiveButton(2131099983, new nv(this, zArr, strArr, textView)).setNegativeButton(2131099754, new nu(this)).show();
    }

    public static List<String> m2972b(Date date) {
        List<String> arrayList = new ArrayList();
        Calendar instance = Calendar.getInstance();
        for (int i = 0; i < 12; i++) {
            instance.setTime(date);
            instance.add(2, i);
            arrayList.add(aba.m3749a(instance.getTimeInMillis(), "yy-MM"));
        }
        return arrayList;
    }

    private void m2974b(HashMap<String, String> hashMap, ArrayList<HashMap<String, String>> arrayList) {
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

    public static List<String> m2977c(Date date) {
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

    private void m2979c(HashMap<String, String> hashMap, ArrayList<HashMap<String, String>> arrayList) {
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

    private void m2987n() {
        Resources resources = this.f3067x.getResources();
        this.f3059G = (RelativeLayout) findViewById(2131558479);
        this.f3060H = (LinearLayout) findViewById(2131558768);
        f3055y = (TextView) findViewById(2131558476);
        f3055y.setText(f3047J);
        this.f3063n = (RelativeLayout) findViewById(2131558473);
        Object a = abd.m3786a(this.f3067x, f3051s, "MY_ACCOUNT_NAMES", "Personal Expense");
        if ("All".equals(f3047J)) {
            f3055y.setText(a);
        }
        this.f3063n.setOnClickListener(new ns(this, a));
        HashMap hashMap = new HashMap();
        m2967a(f3051s, hashMap);
        f3050r.clear();
        if (!(hashMap.get("fromDate") == null || hashMap.get("toDate") == null)) {
            f3050r.add(hashMap);
        }
        m2974b(hashMap, f3050r);
        f3049o = f3050r.size();
        this.f3057E = (Button) findViewById(2131558652);
        this.f3058F = (Button) findViewById(2131558654);
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558650);
        TextView textView = (TextView) findViewById(2131558651);
        textView.setOnClickListener(new ny(this, textView));
        this.f3057E.setOnClickListener(new nz(this));
        this.f3058F.setOnClickListener(new oa(this));
        f3056z = (RadioButton) findViewById(2131558646);
        f3056z.setVisibility(8);
        f3042A = (RadioButton) findViewById(2131558647);
        f3043B = (RadioButton) findViewById(2131558648);
        f3044C = (RadioButton) findViewById(2131558649);
        f3056z.setOnClickListener(new ob(this, hashMap, textView));
        f3042A.setOnClickListener(new oc(this, hashMap, linearLayout));
        f3043B.setOnClickListener(new od(this, hashMap, linearLayout));
        f3044C.setOnClickListener(new oe(this, hashMap, linearLayout));
        f3042A.setChecked(true);
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, new ArrayList(Arrays.asList(new String[]{resources.getString(2131099881), resources.getString(2131099931)})));
        arrayAdapter.setDropDownViewResource(17367049);
        f3045D = (Spinner) findViewById(2131558644);
        f3045D.setAdapter(arrayAdapter);
        f3045D.setOnItemSelectedListener(new of(this));
        Button button = (Button) findViewById(2131558472);
        button.setText(this.f3061K);
        button.setOnClickListener(new nt(this, button));
        this.f3064p = new og(m366f());
        ViewPager viewPager = (ViewPager) findViewById(2131558656);
        viewPager.setAdapter(this.f3064p);
        this.f3065q = (MyTabPageIndicator) findViewById(2131558655);
        this.f3065q.setViewPager(viewPager);
        this.f3065q.setCurrentItem(m2958a(aba.m3763b(0), f3050r));
        if (getResources().getConfiguration().orientation != 2) {
            this.f3059G.setVisibility(0);
            this.f3060H.setVisibility(0);
            this.f3063n.setVisibility(0);
        } else if ((getResources().getConfiguration().screenLayout & 15) != 4 && (getResources().getConfiguration().screenLayout & 15) != 3) {
            this.f3063n.setVisibility(8);
        }
    }

    private void m2988o() {
        Bitmap e = f3048L.m2053e();
        try {
            String str = f3047J + ".png";
            e.compress(CompressFormat.PNG, 100, new FileOutputStream(new File(co.f4430d, str)));
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("plain/text");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
            intent.putExtra("android.intent.extra.SUBJECT", getResources().getString(2131099725) + ":" + str);
            intent.putExtra("android.intent.extra.TEXT", getResources().getString(2131099869));
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(co.f4430d + "/" + str)));
            startActivity(Intent.createChooser(intent, "Send mail..."));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m2987n();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        f3053v = sharedPreferences.getInt("THEME_COLOR", 0);
        int i = sharedPreferences.getInt("CHART_THEME", -1);
        if (i != -1) {
            f3053v = i;
        }
        if (f3053v == 0 || f3053v == 2 || f3053v == 3) {
            setTheme(2131230725);
        } else {
            setTheme(2131230730);
            setTheme(2131230723);
        }
        f3051s = new ro(this);
        f3047J = getIntent().getStringExtra("account");
        if (f3047J == null || "".equals(f3047J)) {
            f3047J = "Personal Expense";
        }
        setContentView(2130903093);
        m2987n();
    }

    protected Dialog onCreateDialog(int i) {
        this.f3066t = i;
        Calendar instance = Calendar.getInstance();
        int i2 = instance.get(1);
        int i3 = instance.get(2);
        int i4 = instance.get(5);
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                try {
                    return new DatePickerDialog(this, this.f3062M, i2, i3, i4);
                } catch (Exception e) {
                    return new DatePickerDialog(this, this.f3062M, instance.get(1), instance.get(2), instance.get(5));
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                return new DatePickerDialog(this, this.f3062M, i2, i3, i4);
            default:
                return null;
        }
        return new DatePickerDialog(this, this.f3062M, instance.get(1), instance.get(2), instance.get(5));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 0, 0, 2131099869).setIcon(2130837600).setShowAsAction(2);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                m2988o();
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
