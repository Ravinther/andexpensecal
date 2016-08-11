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

public class ExpenseChartSummary extends C0037o {
    private static Spinner f3112D;
    private static String f3113I;
    private static String f3114J;
    private static C0308b f3115L;
    static int f3116o;
    static ArrayList<HashMap<String, String>> f3117r;
    static ro f3118s;
    static String f3119u;
    static int f3120v;
    static boolean f3121w;
    private static TextView f3122y;
    private RadioButton f3123A;
    private RadioButton f3124B;
    private RadioButton f3125C;
    private Button f3126E;
    private Button f3127F;
    private RelativeLayout f3128G;
    private LinearLayout f3129H;
    private int f3130K;
    private OnDateSetListener f3131M;
    RelativeLayout f3132n;
    pu f3133p;
    MyTabPageIndicator f3134q;
    int f3135t;
    private Context f3136x;
    private RadioButton f3137z;

    static {
        f3113I = "category";
        f3114J = "Personal Expense";
        f3116o = 1;
        f3117r = new ArrayList();
        f3119u = "BAR";
        f3120v = 0;
        f3121w = false;
    }

    public ExpenseChartSummary() {
        this.f3136x = this;
        this.f3135t = 0;
        this.f3130K = 2131100025;
        this.f3131M = new pl(this);
    }

    private int m3031a(String str, ArrayList<HashMap<String, String>> arrayList) {
        String substring = str.substring(0, str.indexOf(" "));
        for (int i = 0; i < arrayList.size(); i++) {
            HashMap hashMap = (HashMap) arrayList.get(i);
            if (substring != null && substring.equals(hashMap.get("fromDate"))) {
                return i;
            }
        }
        return 0;
    }

    public static String m3034a(ro roVar, String str, List<Map<String, Object>> list, String str2, String str3, boolean z) {
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

    private void m3035a(int i, int i2, int i3, Button button) {
        CharSequence b = aib.m3867b(i + "-" + (i2 + 1) + "-" + i3, "yyyy-MM-dd", ExpenseManager.f3244t);
        if (!button.getText().toString().equals(b)) {
            button.setText(b);
            if (!getResources().getString(2131100132).equals(this.f3127F.getText().toString()) && !getResources().getString(2131099912).equals(this.f3126E.getText().toString())) {
                HashMap hashMap = new HashMap();
                hashMap.put("fromDate", this.f3126E.getText().toString());
                hashMap.put("toDate", this.f3127F.getText().toString());
                if (!(hashMap.get("fromDate") == null || hashMap.get("toDate") == null)) {
                    f3117r.add(hashMap);
                }
                f3116o = f3117r.size();
                this.f3133p.m145c();
                this.f3134q.m3495a();
                this.f3134q.setCurrentItem(f3117r.size() - 1);
            }
        }
    }

    public static void m3039a(ro roVar, HashMap<String, String> hashMap) {
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

    private void m3040a(HashMap<String, String> hashMap, ArrayList<HashMap<String, String>> arrayList) {
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

    private void m3041a(String[] strArr, TextView textView) {
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
        new Builder(this).setTitle(2131100026).setMultiChoiceItems(strArr, zArr, new pk(this, zArr)).setPositiveButton(2131099983, new pj(this, zArr, strArr, textView)).setNegativeButton(2131099754, new pi(this)).show();
    }

    private void m3045b(HashMap<String, String> hashMap, ArrayList<HashMap<String, String>> arrayList) {
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

    private void m3049c(HashMap<String, String> hashMap, ArrayList<HashMap<String, String>> arrayList) {
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

    private void m3055l() {
        Resources resources = this.f3136x.getResources();
        this.f3128G = (RelativeLayout) findViewById(2131558479);
        this.f3129H = (LinearLayout) findViewById(2131558768);
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558643);
        f3122y = (TextView) findViewById(2131558476);
        f3122y.setText(f3114J);
        this.f3132n = (RelativeLayout) findViewById(2131558473);
        Object a = abd.m3786a(this.f3136x, f3118s, "MY_ACCOUNT_NAMES", "Personal Expense");
        if ("All".equals(f3114J)) {
            f3122y.setText(a);
        }
        this.f3132n.setOnClickListener(new pg(this, a));
        HashMap hashMap = new HashMap();
        m3039a(f3118s, hashMap);
        f3117r.clear();
        if (!(hashMap.get("fromDate") == null || hashMap.get("toDate") == null)) {
            f3117r.add(hashMap);
        }
        f3116o = f3117r.size();
        this.f3126E = (Button) findViewById(2131558652);
        this.f3127F = (Button) findViewById(2131558654);
        linearLayout = (LinearLayout) findViewById(2131558650);
        TextView textView = (TextView) findViewById(2131558651);
        textView.setOnClickListener(new pm(this, textView));
        this.f3126E.setOnClickListener(new pn(this));
        this.f3127F.setOnClickListener(new po(this));
        this.f3137z = (RadioButton) findViewById(2131558646);
        this.f3123A = (RadioButton) findViewById(2131558647);
        this.f3124B = (RadioButton) findViewById(2131558648);
        this.f3125C = (RadioButton) findViewById(2131558649);
        this.f3137z.setOnClickListener(new pp(this, hashMap, textView));
        this.f3123A.setOnClickListener(new pq(this, hashMap, linearLayout));
        this.f3124B.setOnClickListener(new pr(this, hashMap, linearLayout));
        this.f3125C.setOnClickListener(new ps(this, hashMap, linearLayout));
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, new ArrayList(Arrays.asList(new String[]{resources.getString(2131099755), resources.getString(2131099932), resources.getString(2131100007), resources.getString(2131100011), resources.getString(2131100101), resources.getString(2131100110), resources.getString(2131100106), resources.getString(2131099757), resources.getString(2131099935), resources.getString(2131100108)})));
        arrayAdapter.setDropDownViewResource(17367049);
        f3112D = (Spinner) findViewById(2131558644);
        f3112D.setAdapter(arrayAdapter);
        f3112D.setOnItemSelectedListener(new pt(this));
        Button button = (Button) findViewById(2131558472);
        button.setText(this.f3130K);
        button.setOnClickListener(new ph(this, button));
        this.f3133p = new pu(m366f());
        ViewPager viewPager = (ViewPager) findViewById(2131558656);
        viewPager.setAdapter(this.f3133p);
        this.f3134q = (MyTabPageIndicator) findViewById(2131558655);
        this.f3134q.setViewPager(viewPager);
        if (getResources().getConfiguration().orientation != 2) {
            this.f3128G.setVisibility(0);
            this.f3129H.setVisibility(0);
            this.f3132n.setVisibility(0);
        } else if ((getResources().getConfiguration().screenLayout & 15) != 4 && (getResources().getConfiguration().screenLayout & 15) != 3) {
            this.f3129H.setVisibility(8);
            this.f3132n.setVisibility(8);
        }
    }

    private void m3056m() {
        Bitmap e = f3115L.m2053e();
        try {
            String str = f3114J + ".png";
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
        m3055l();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        f3120v = sharedPreferences.getInt("THEME_COLOR", 0);
        int i = sharedPreferences.getInt("CHART_THEME", -1);
        if (i != -1) {
            f3120v = i;
        }
        if (f3120v == 0 || f3120v == 2 || f3120v == 3) {
            setTheme(2131230725);
        } else {
            setTheme(2131230730);
            setTheme(2131230723);
        }
        f3118s = new ro(this);
        f3114J = getIntent().getStringExtra("account");
        if (f3114J == null || "".equals(f3114J)) {
            f3114J = "Personal Expense";
        }
        setContentView(2130903095);
        f3119u = "BAR";
        m3055l();
    }

    protected Dialog onCreateDialog(int i) {
        this.f3135t = i;
        Calendar instance = Calendar.getInstance();
        int i2 = instance.get(1);
        int i3 = instance.get(2);
        int i4 = instance.get(5);
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                try {
                    return new DatePickerDialog(this, this.f3131M, i2, i3, i4);
                } catch (Exception e) {
                    return new DatePickerDialog(this, this.f3131M, instance.get(1), instance.get(2), instance.get(5));
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                return new DatePickerDialog(this, this.f3131M, i2, i3, i4);
            default:
                return null;
        }
        return new DatePickerDialog(this, this.f3131M, instance.get(1), instance.get(2), instance.get(5));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 0, 0, 2131099869).setIcon(2130837600);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                m3056m();
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
