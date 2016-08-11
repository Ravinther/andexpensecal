package com.expensemanager;

import android.app.ActionBar.OnNavigationListener;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.C0037o;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class ExpenseAccountSummary extends C0037o {
    private static Spinner f2770D;
    private static String f2771G;
    private static String f2772H;
    static int f2773n;
    static ArrayList<HashMap<String, String>> f2774q;
    static ro f2775r;
    static boolean f2776t;
    static int f2777u;
    static int f2778v;
    static String f2779w;
    private static TextView f2780y;
    private RadioButton f2781A;
    private RadioButton f2782B;
    private RadioButton f2783C;
    private Button f2784E;
    private Button f2785F;
    private String f2786I;
    private OnDateSetListener f2787J;
    hx f2788o;
    MyTabPageIndicator f2789p;
    int f2790s;
    private Context f2791x;
    private RadioButton f2792z;

    static {
        f2771G = "category";
        f2772H = "Personal Expense";
        f2773n = 1;
        f2774q = new ArrayList();
        f2776t = false;
        f2777u = 1;
        f2778v = 0;
        f2779w = "Date Period:";
    }

    public ExpenseAccountSummary() {
        this.f2791x = this;
        this.f2790s = 0;
        this.f2786I = "";
        this.f2787J = new hn(this);
    }

    public static int m2675a(String str, ArrayList<HashMap<String, String>> arrayList) {
        String substring = str.substring(0, str.indexOf(" "));
        for (int i = 0; i < arrayList.size(); i++) {
            HashMap hashMap = (HashMap) arrayList.get(i);
            if (substring != null && substring.equals(hashMap.get("fromDate"))) {
                return i;
            }
        }
        return 0;
    }

    private void m2677a(int i, int i2, int i3, Button button) {
        Editor edit = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).edit();
        CharSequence a = aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, i + "-" + (i2 + 1) + "-" + i3);
        String str = "fromDate";
        if (button.getId() == 2131558654) {
            str = "toDate";
        }
        edit.putString(str, a);
        edit.commit();
        if (!button.getText().toString().equals(a)) {
            button.setText(a);
            if (!getResources().getString(2131100132).equals(this.f2785F.getText().toString()) && !getResources().getString(2131099912).equals(this.f2784E.getText().toString())) {
                HashMap hashMap = new HashMap();
                hashMap.put("fromDate", this.f2784E.getText().toString());
                hashMap.put("toDate", this.f2785F.getText().toString());
                if (!(hashMap.get("fromDate") == null || hashMap.get("toDate") == null)) {
                    f2774q.add(hashMap);
                }
                f2773n = f2774q.size();
                this.f2788o.m145c();
                this.f2789p.m3495a();
                this.f2789p.setCurrentItem(f2774q.size() - 1);
            }
        }
    }

    public static void m2678a(Context context) {
        try {
            int i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            SharedPreferences sharedPreferences = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
            int i2 = sharedPreferences.getInt("versionCode", -1);
            if (i2 == -1 || i2 < i) {
                Dialog dialog = new Dialog(context, 16973840);
                dialog.setContentView(2130903137);
                ((LinearLayout) dialog.findViewById(2131558957)).setOnClickListener(new ho(sharedPreferences, i, dialog));
                dialog.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2681a(com.expensemanager.ro r20, java.lang.String r21, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r22, java.lang.String r23, java.lang.String r24, boolean r25) {
        /*
        r20.m4193a();
        r0 = r20;
        r1 = r21;
        r2 = r24;
        r8 = r0.m4192a(r1, r2);
        r9 = new java.util.HashMap;
        r9.<init>();
        r10 = new java.util.HashMap;
        r10.<init>();
        r11 = new java.util.ArrayList;
        r11.<init>();
        r4 = "";
        if (r8 == 0) goto L_0x0310;
    L_0x0020:
        r5 = r8.moveToFirst();
        if (r5 == 0) goto L_0x0310;
    L_0x0026:
        r4 = "account";
        r12 = r8.getColumnIndex(r4);
        r4 = "amount";
        r13 = r8.getColumnIndex(r4);
        r4 = "category";
        r14 = r8.getColumnIndex(r4);
        r4 = "subcategory";
        r15 = r8.getColumnIndex(r4);
        r0 = r23;
        r4 = r8.getColumnIndex(r0);
        r5 = "Income";
        r0 = r23;
        r5 = r5.equalsIgnoreCase(r0);
        if (r5 == 0) goto L_0x030d;
    L_0x004e:
        r4 = "category";
        r4 = r8.getColumnIndex(r4);
        r6 = r4;
    L_0x0055:
        r7 = r8.getString(r12);
        r5 = r8.getString(r13);
        r4 = com.expensemanager.ExpenseManager.f3246v;
        if (r4 == 0) goto L_0x0070;
    L_0x0061:
        if (r25 == 0) goto L_0x0070;
    L_0x0063:
        r4 = com.expensemanager.ExpenseManager.f3246v;
        r4 = r4.get(r7);
        r4 = (java.lang.String) r4;
        r4 = com.expensemanager.abd.m3793a(r5, r4);
        r5 = r4;
    L_0x0070:
        r16 = r8.getString(r14);
        r17 = r8.getString(r15);
        r4 = r8.getString(r6);
        r18 = com.expensemanager.aib.m3865b(r4);
        r4 = "Income";
        r0 = r23;
        r4 = r4.equalsIgnoreCase(r0);
        if (r4 == 0) goto L_0x0125;
    L_0x008a:
        r0 = r17;
        r4 = r11.contains(r0);
        if (r4 != 0) goto L_0x0097;
    L_0x0092:
        r0 = r17;
        r11.add(r0);
    L_0x0097:
        r4 = "Income";
        r0 = r16;
        r4 = r4.equalsIgnoreCase(r0);
        if (r4 == 0) goto L_0x01af;
    L_0x00a1:
        r4 = "expense_tag";
        r0 = r23;
        r4 = r0.equalsIgnoreCase(r4);
        if (r4 != 0) goto L_0x01af;
    L_0x00ab:
        r4 = "property";
        r0 = r23;
        r4 = r0.equalsIgnoreCase(r4);
        if (r4 != 0) goto L_0x01af;
    L_0x00b5:
        r0 = r17;
        r4 = r10.get(r0);
        if (r4 != 0) goto L_0x0183;
    L_0x00bd:
        r4 = com.expensemanager.aib.m3865b(r5);
        r0 = r17;
        r10.put(r0, r4);
    L_0x00c6:
        r4 = r8.moveToNext();
        if (r4 != 0) goto L_0x0055;
    L_0x00cc:
        r6 = r7;
    L_0x00cd:
        r4 = 0;
        r7 = r4;
    L_0x00cf:
        r4 = r11.size();
        if (r7 >= r4) goto L_0x0304;
    L_0x00d5:
        r12 = new java.util.HashMap;
        r12.<init>();
        r4 = r11.get(r7);
        r4 = (java.lang.String) r4;
        r5 = r9.get(r4);
        r5 = (java.lang.String) r5;
        r13 = com.expensemanager.aba.m3756a(r5);
        r5 = r10.get(r4);
        r5 = (java.lang.String) r5;
        r5 = com.expensemanager.aba.m3756a(r5);
        r14 = "name";
        r12.put(r14, r4);
        r4 = "account";
        r12.put(r4, r6);
        r14 = "expense";
        r4 = "";
        r4 = r4.equals(r13);
        if (r4 == 0) goto L_0x02f8;
    L_0x0108:
        r4 = "";
    L_0x010a:
        r12.put(r14, r4);
        r13 = "income";
        r4 = "";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x02fe;
    L_0x0117:
        r4 = "";
    L_0x0119:
        r12.put(r13, r4);
        r0 = r22;
        r0.add(r12);
        r4 = r7 + 1;
        r7 = r4;
        goto L_0x00cf;
    L_0x0125:
        r4 = "subcategory";
        r0 = r23;
        r4 = r0.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x0174;
    L_0x012f:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = r16;
        r4 = r4.append(r0);
        r19 = ":";
        r0 = r19;
        r4 = r4.append(r0);
        r0 = r17;
        r4 = r4.append(r0);
        r4 = r4.toString();
        r4 = r11.contains(r4);
        if (r4 != 0) goto L_0x0097;
    L_0x0152:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = r16;
        r4 = r4.append(r0);
        r19 = ":";
        r0 = r19;
        r4 = r4.append(r0);
        r0 = r17;
        r4 = r4.append(r0);
        r4 = r4.toString();
        r11.add(r4);
        goto L_0x0097;
    L_0x0174:
        r0 = r18;
        r4 = r11.contains(r0);
        if (r4 != 0) goto L_0x0097;
    L_0x017c:
        r0 = r18;
        r11.add(r0);
        goto L_0x0097;
    L_0x0183:
        r0 = r17;
        r4 = r10.get(r0);
        r4 = (java.lang.String) r4;
        r4 = com.expensemanager.aba.m3743a(r4, r5);
        r16 = new java.lang.StringBuilder;
        r16.<init>();
        r18 = "";
        r0 = r16;
        r1 = r18;
        r16 = r0.append(r1);
        r0 = r16;
        r4 = r0.append(r4);
        r4 = r4.toString();
        r0 = r17;
        r10.put(r0, r4);
        goto L_0x00c6;
    L_0x01af:
        r4 = "Income";
        r0 = r16;
        r4 = r4.equalsIgnoreCase(r0);
        if (r4 == 0) goto L_0x0208;
    L_0x01b9:
        r4 = "expense_tag";
        r0 = r23;
        r4 = r0.equalsIgnoreCase(r4);
        if (r4 != 0) goto L_0x01cd;
    L_0x01c3:
        r4 = "property";
        r0 = r23;
        r4 = r0.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x0208;
    L_0x01cd:
        r0 = r18;
        r4 = r10.get(r0);
        if (r4 != 0) goto L_0x01e0;
    L_0x01d5:
        r4 = com.expensemanager.aib.m3865b(r5);
        r0 = r18;
        r10.put(r0, r4);
        goto L_0x00c6;
    L_0x01e0:
        r0 = r18;
        r4 = r10.get(r0);
        r4 = (java.lang.String) r4;
        r4 = com.expensemanager.aba.m3743a(r4, r5);
        r16 = new java.lang.StringBuilder;
        r16.<init>();
        r17 = "";
        r16 = r16.append(r17);
        r0 = r16;
        r4 = r0.append(r4);
        r4 = r4.toString();
        r0 = r18;
        r10.put(r0, r4);
        goto L_0x00c6;
    L_0x0208:
        r4 = "subcategory";
        r0 = r23;
        r4 = r0.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x02bd;
    L_0x0212:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = r16;
        r4 = r4.append(r0);
        r18 = ":";
        r0 = r18;
        r4 = r4.append(r0);
        r0 = r17;
        r4 = r4.append(r0);
        r4 = r4.toString();
        r4 = r9.get(r4);
        if (r4 != 0) goto L_0x025b;
    L_0x0235:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = r16;
        r4 = r4.append(r0);
        r16 = ":";
        r0 = r16;
        r4 = r4.append(r0);
        r0 = r17;
        r4 = r4.append(r0);
        r4 = r4.toString();
        r5 = com.expensemanager.aib.m3865b(r5);
        r9.put(r4, r5);
        goto L_0x00c6;
    L_0x025b:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = r16;
        r4 = r4.append(r0);
        r18 = ":";
        r0 = r18;
        r4 = r4.append(r0);
        r0 = r17;
        r4 = r4.append(r0);
        r4 = r4.toString();
        r4 = r9.get(r4);
        r4 = (java.lang.String) r4;
        r4 = com.expensemanager.aba.m3743a(r4, r5);
        r18 = new java.lang.StringBuilder;
        r18.<init>();
        r0 = r18;
        r1 = r16;
        r16 = r0.append(r1);
        r18 = ":";
        r0 = r16;
        r1 = r18;
        r16 = r0.append(r1);
        r16 = r16.append(r17);
        r16 = r16.toString();
        r17 = new java.lang.StringBuilder;
        r17.<init>();
        r18 = "";
        r17 = r17.append(r18);
        r0 = r17;
        r4 = r0.append(r4);
        r4 = r4.toString();
        r0 = r16;
        r9.put(r0, r4);
        goto L_0x00c6;
    L_0x02bd:
        r0 = r18;
        r4 = r9.get(r0);
        if (r4 != 0) goto L_0x02d0;
    L_0x02c5:
        r4 = com.expensemanager.aib.m3865b(r5);
        r0 = r18;
        r9.put(r0, r4);
        goto L_0x00c6;
    L_0x02d0:
        r0 = r18;
        r4 = r9.get(r0);
        r4 = (java.lang.String) r4;
        r4 = com.expensemanager.aba.m3743a(r4, r5);
        r16 = new java.lang.StringBuilder;
        r16.<init>();
        r17 = "";
        r16 = r16.append(r17);
        r0 = r16;
        r4 = r0.append(r4);
        r4 = r4.toString();
        r0 = r18;
        r9.put(r0, r4);
        goto L_0x00c6;
    L_0x02f8:
        r4 = com.expensemanager.aba.m3767b(r13);
        goto L_0x010a;
    L_0x02fe:
        r4 = com.expensemanager.aba.m3767b(r5);
        goto L_0x0119;
    L_0x0304:
        if (r8 == 0) goto L_0x0309;
    L_0x0306:
        r8.close();
    L_0x0309:
        r20.m4201b();
        return;
    L_0x030d:
        r6 = r4;
        goto L_0x0055;
    L_0x0310:
        r6 = r4;
        goto L_0x00cd;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.expensemanager.ExpenseAccountSummary.a(com.expensemanager.ro, java.lang.String, java.util.List, java.lang.String, java.lang.String, boolean):void");
    }

    public static void m2682a(ro roVar, HashMap<String, String> hashMap) {
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

    public static void m2683a(HashMap<String, String> hashMap, ArrayList<HashMap<String, String>> arrayList) {
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

    private void m2684a(String[] strArr, TextView textView) {
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
        new Builder(this).setTitle(2131100026).setMultiChoiceItems(strArr, zArr, new hm(this, zArr)).setPositiveButton(2131099983, new hl(this, zArr, strArr, textView)).setNegativeButton(2131099754, new hk(this)).show();
    }

    public static void m2687b(HashMap<String, String> hashMap, ArrayList<HashMap<String, String>> arrayList) {
        try {
            String str = (String) hashMap.get("fromDate");
            Calendar instance = Calendar.getInstance();
            instance.add(1, -5);
            String a = instance.getTimeInMillis() > aba.m3744a(str, ExpenseManager.f3244t, Locale.US) ? aba.m3749a(instance.getTimeInMillis(), ExpenseManager.f3244t) : str;
            str = (String) hashMap.get("toDate");
            DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
            Date parse = simpleDateFormat.parse(a);
            Calendar instance2 = Calendar.getInstance();
            instance2.setTime(parse);
            Date parse2 = simpleDateFormat.parse(str);
            do {
                HashMap hashMap2 = new HashMap();
                instance2.set(7, ExpenseManager.f3243s);
                hashMap2.put("fromDate", simpleDateFormat.format(instance2.getTime()));
                instance2.add(7, 6);
                hashMap2.put("toDate", simpleDateFormat.format(instance2.getTime()));
                arrayList.add(hashMap2);
                instance2.add(7, 1);
            } while (!instance2.getTime().after(parse2));
        } catch (Exception e) {
        }
    }

    public static void m2690c(HashMap<String, String> hashMap, ArrayList<HashMap<String, String>> arrayList) {
        try {
            String str = (String) hashMap.get("fromDate");
            Calendar instance = Calendar.getInstance();
            instance.add(1, -10);
            String a = instance.getTimeInMillis() > aba.m3744a(str, ExpenseManager.f3244t, Locale.US) ? aba.m3749a(instance.getTimeInMillis(), ExpenseManager.f3244t) : str;
            str = (String) hashMap.get("toDate");
            DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
            Date parse = simpleDateFormat.parse(a);
            Calendar instance2 = Calendar.getInstance();
            instance2.setTime(parse);
            Date parse2 = simpleDateFormat.parse(str);
            do {
                HashMap hashMap2 = new HashMap();
                instance2.set(5, ExpenseManager.f3242r);
                hashMap2.put("fromDate", simpleDateFormat.format(instance2.getTime()));
                instance2.add(2, 1);
                instance2.add(5, -1);
                hashMap2.put("toDate", simpleDateFormat.format(instance2.getTime()));
                arrayList.add(hashMap2);
                instance2.add(5, 1);
            } while (!instance2.getTime().after(parse2));
        } catch (Exception e) {
        }
    }

    private void m2695j() {
        if (this.f2784E.getText().equals(getResources().getString(2131099912)) && this.f2785F.getText().equals(getResources().getString(2131100132))) {
            SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
            String string = sharedPreferences.getString("fromDate", null);
            String string2 = sharedPreferences.getString("toDate", null);
            CharSequence a = aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, string);
            CharSequence a2 = aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, string2);
            if (a != null && !"".equals(a) && a2 != null && !"".equals(a2)) {
                this.f2784E.setText(a);
                this.f2785F.setText(a2);
                HashMap hashMap = new HashMap();
                hashMap.put("fromDate", this.f2784E.getText().toString());
                hashMap.put("toDate", this.f2785F.getText().toString());
                if (!(hashMap.get("fromDate") == null || hashMap.get("toDate") == null)) {
                    f2774q.add(hashMap);
                }
                f2773n = f2774q.size();
                this.f2788o.m145c();
                this.f2789p.m3495a();
                this.f2789p.setCurrentItem(f2774q.size() - 1);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        if (i == 1 || i > 3) {
            setTheme(2131230730);
        }
        abd.m3802a((Activity) this, true);
        Resources resources = this.f2791x.getResources();
        f2775r = new ro(this);
        f2772H = getIntent().getStringExtra("account");
        if (f2772H == null || "".equals(f2772H)) {
            f2772H = "Personal Expense";
        }
        setContentView(2130903074);
        f2780y = (TextView) findViewById(2131558476);
        f2780y.setText(f2772H);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(2131558473);
        Object a = abd.m3786a(this.f2791x, f2775r, "MY_ACCOUNT_NAMES", "Personal Expense");
        if ("All".equals(f2772H)) {
            f2780y.setText(a);
        }
        relativeLayout.setOnClickListener(new hi(this, a));
        HashMap hashMap = new HashMap();
        m2682a(f2775r, hashMap);
        f2774q.clear();
        if (!(hashMap.get("fromDate") == null || hashMap.get("toDate") == null)) {
            f2774q.add(hashMap);
        }
        f2773n = f2774q.size();
        this.f2784E = (Button) findViewById(2131558652);
        this.f2785F = (Button) findViewById(2131558654);
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558650);
        TextView textView = (TextView) findViewById(2131558651);
        textView.setOnClickListener(new hp(this, textView, (TextView) findViewById(2131558653)));
        this.f2784E.setOnClickListener(new hq(this));
        this.f2785F.setOnClickListener(new hr(this));
        this.f2792z = (RadioButton) findViewById(2131558646);
        this.f2781A = (RadioButton) findViewById(2131558647);
        this.f2782B = (RadioButton) findViewById(2131558648);
        this.f2783C = (RadioButton) findViewById(2131558649);
        this.f2792z.setOnClickListener(new hs(this, hashMap, textView, linearLayout));
        this.f2781A.setOnClickListener(new ht(this, hashMap, linearLayout));
        this.f2782B.setOnClickListener(new hu(this, hashMap, linearLayout));
        this.f2783C.setOnClickListener(new hv(this, hashMap, linearLayout));
        List arrayList = new ArrayList(Arrays.asList(new String[]{resources.getString(2131099755), resources.getString(2131099932), resources.getString(2131100007), resources.getString(2131100011), resources.getString(2131100101), resources.getString(2131100110) + " - " + resources.getString(2131099882), resources.getString(2131100106), resources.getString(2131099757), resources.getString(2131099935), resources.getString(2131100110) + " - " + resources.getString(2131099932), resources.getString(2131100009) + " - " + resources.getString(2131099932)}));
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        f2770D = (Spinner) findViewById(2131558644);
        f2770D.setAdapter(arrayAdapter);
        f2770D.setOnItemSelectedListener(new hw(this));
        this.f2788o = new hx(m366f());
        ViewPager viewPager = (ViewPager) findViewById(2131558656);
        viewPager.setAdapter(this.f2788o);
        this.f2789p = (MyTabPageIndicator) findViewById(2131558655);
        this.f2789p.setViewPager(viewPager);
        arrayAdapter = new ArrayAdapter(this, 2130903149, arrayList);
        arrayAdapter.setDropDownViewResource(2130903150);
        OnNavigationListener hjVar = new hj(this);
        getActionBar().setNavigationMode(1);
        getActionBar().setDisplayShowTitleEnabled(false);
        getActionBar().setListNavigationCallbacks(arrayAdapter, hjVar);
        getActionBar().setSelectedNavigationItem(f2778v);
        if (f2774q.size() > 0) {
            this.f2786I = ((String) ((HashMap) f2774q.get(viewPager.getCurrentItem())).get("fromDate")) + " - " + ((String) ((HashMap) f2774q.get(viewPager.getCurrentItem())).get("toDate"));
        }
        m2678a(this.f2791x);
    }

    protected Dialog onCreateDialog(int i) {
        this.f2790s = i;
        Calendar instance = Calendar.getInstance();
        int i2 = instance.get(1);
        int i3 = instance.get(2);
        int i4 = instance.get(5);
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                try {
                    return new DatePickerDialog(this, this.f2787J, i2, i3, i4);
                } catch (Exception e) {
                    return new DatePickerDialog(this, this.f2787J, instance.get(1), instance.get(2), instance.get(5));
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                return new DatePickerDialog(this, this.f2787J, i2, i3, i4);
            default:
                return null;
        }
        return new DatePickerDialog(this, this.f2787J, instance.get(1), instance.get(2), instance.get(5));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            setResult(-1, new Intent(this.f2791x, ExpenseManager.class));
            finish();
        }
        return false;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onMenuItemSelected(i, menuItem);
        }
        dispatchKeyEvent(new KeyEvent(0, 4));
        return true;
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        Calendar instance = Calendar.getInstance();
        int i2 = instance.get(1);
        int i3 = instance.get(2);
        int i4 = instance.get(5);
        this.f2790s = i;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                ((DatePickerDialog) dialog).updateDate(i2, i3, i4);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                ((DatePickerDialog) dialog).updateDate(i2, i3, i4);
            default:
        }
    }
}
