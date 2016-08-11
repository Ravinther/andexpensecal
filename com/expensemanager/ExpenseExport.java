package com.expensemanager;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ExpenseExport extends Activity {
    String f3211a;
    Context f3212b;
    private String f3213c;
    private String f3214d;
    private Spinner f3215e;
    private String[] f3216f;
    private String f3217g;
    private ro f3218h;

    public ExpenseExport() {
        this.f3211a = "";
        this.f3212b = this;
        this.f3213c = "";
        this.f3214d = "";
        this.f3216f = new String[]{"Cash", "Bank", "CCard", "Invst", "Oth A", "Oth L"};
        this.f3217g = "MM/dd/yyyy";
    }

    private String m3160a() {
        List arrayList = new ArrayList();
        return ExpenseAccountActivities.m2602a(new ro(this), this.f3214d, arrayList, true, "expensed ASC");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m3162a(java.lang.String r7) {
        /*
        r6 = -1;
        r0 = 0;
        if (r7 == 0) goto L_0x0010;
    L_0x0004:
        r1 = "";
        r2 = r7.trim();
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x0013;
    L_0x0010:
        r1 = "";
    L_0x0012:
        return r1;
    L_0x0013:
        r1 = 11;
        r3 = new java.lang.String[r1];
        r1 = com.expensemanager.ExpenseManager.f3244t;
        r3[r0] = r1;
        r1 = 1;
        r2 = "yyyy-MM-dd";
        r3[r1] = r2;
        r1 = 2;
        r2 = "MM/dd/yyyy";
        r3[r1] = r2;
        r1 = 3;
        r2 = "MM-dd-yyyy";
        r3[r1] = r2;
        r1 = 4;
        r2 = "yyyy/MM/dd";
        r3[r1] = r2;
        r1 = 5;
        r2 = "dd-MM-yyyy";
        r3[r1] = r2;
        r1 = 6;
        r2 = "dd/MM/yyyy";
        r3[r1] = r2;
        r1 = 7;
        r2 = "yyyy.MM.dd";
        r3[r1] = r2;
        r1 = 8;
        r2 = "dd.MM.yyyy";
        r3[r1] = r2;
        r1 = 9;
        r2 = "MM.dd.yyyy";
        r3[r1] = r2;
        r1 = 10;
        r2 = "yyyy-dd-MM";
        r3[r1] = r2;
        r1 = "";
    L_0x0052:
        r2 = r3.length;
        if (r0 >= r2) goto L_0x0012;
    L_0x0055:
        r1 = new java.text.SimpleDateFormat;	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r2 = r3[r0];	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r1.<init>(r2);	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r2 = ":";
        r2 = r7.indexOf(r2);	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        if (r2 == r6) goto L_0x00c6;
    L_0x0064:
        r1 = new java.text.SimpleDateFormat;	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r2 = new java.lang.StringBuilder;	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r2.<init>();	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r4 = r3[r0];	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r2 = r2.append(r4);	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r4 = " HH:mm:ss";
        r2 = r2.append(r4);	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r2 = r2.toString();	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r4 = java.util.Locale.US;	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r1.<init>(r2, r4);	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r2 = r1;
    L_0x0081:
        r1 = 0;
        r2.setLenient(r1);	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r1 = new java.text.SimpleDateFormat;	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r4 = com.expensemanager.ExpenseManager.f3244t;	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r5 = java.util.Locale.US;	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r1.<init>(r4, r5);	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r4 = ":";
        r4 = r7.indexOf(r4);	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        if (r4 == r6) goto L_0x00b2;
    L_0x0096:
        r1 = new java.text.SimpleDateFormat;	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r4 = new java.lang.StringBuilder;	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r4.<init>();	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r5 = com.expensemanager.ExpenseManager.f3244t;	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r4 = r4.append(r5);	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r5 = " HH:mm:ss";
        r4 = r4.append(r5);	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r4 = r4.toString();	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r5 = java.util.Locale.US;	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r1.<init>(r4, r5);	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
    L_0x00b2:
        r2 = r2.parse(r7);	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        r1 = r1.format(r2);	 Catch:{ ParseException -> 0x00bc, IllegalArgumentException -> 0x00c2 }
        goto L_0x0012;
    L_0x00bc:
        r1 = move-exception;
        r1 = "";
    L_0x00bf:
        r0 = r0 + 1;
        goto L_0x0052;
    L_0x00c2:
        r1 = move-exception;
        r1 = "";
        goto L_0x00bf;
    L_0x00c6:
        r2 = r1;
        goto L_0x0081;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.expensemanager.ExpenseExport.a(java.lang.String):java.lang.String");
    }

    public static boolean m3163a(Context context, String str, String str2) {
        boolean z = true;
        ro roVar = new ro(context);
        roVar.m4193a();
        String a = abd.m3786a(context, roVar, "MY_ACCOUNT_NAMES", "Personal Expense");
        String a2 = abd.m3786a(context, roVar, "csv_delimiter", ",");
        ArrayList j = aib.m3878j(a);
        try {
            File file = new File(str);
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String str3 = a2;
                boolean z2 = true;
                while (true) {
                    a2 = bufferedReader.readLine();
                    if (a2 == null) {
                        break;
                    } else if (!"".equals(a2)) {
                        String str4 = "";
                        String str5 = "";
                        String str6 = "";
                        String str7 = "";
                        String str8 = "";
                        str4 = "";
                        String str9 = "";
                        String str10 = "";
                        String str11 = "";
                        String str12 = "";
                        str4 = "";
                        String str13 = "";
                        String str14 = "";
                        String str15 = "";
                        String str16 = "";
                        String str17 = "";
                        if (!a2.toLowerCase().startsWith("date")) {
                            String[] split = a2.split(str3);
                            if (split != null && split.length >= 2) {
                                String trim;
                                String a3 = m3162a(split[0].trim());
                                a2 = split[1].trim();
                                if (a2 != null) {
                                    a2 = a2.replaceAll(",", "");
                                }
                                int length = split.length;
                                if (r0 > 2) {
                                    trim = split[2].trim();
                                    if (!"".equals(trim)) {
                                        str5 = aba.m3777d(trim);
                                    }
                                }
                                length = split.length;
                                if (r0 > 3) {
                                    trim = split[3].trim();
                                    if (!"".equals(trim)) {
                                        str6 = aba.m3777d(trim);
                                    }
                                }
                                length = split.length;
                                if (r0 > 4) {
                                    if (!"".equals(split[4].trim())) {
                                        str7 = split[4].toLowerCase();
                                        str7 = str7.substring(0, 1).toUpperCase() + str7.substring(1);
                                    }
                                }
                                length = split.length;
                                if (r0 > 5) {
                                    if (!"".equals(split[5].trim())) {
                                        str8 = split[5].trim().replaceAll("\"", "");
                                    }
                                }
                                length = split.length;
                                if (r0 > 6) {
                                    if (!"".equals(split[6].trim())) {
                                        str9 = split[6].trim();
                                    }
                                }
                                length = split.length;
                                if (r0 > 7) {
                                    if (!"".equals(split[7].trim())) {
                                        str10 = split[7].trim();
                                    }
                                }
                                length = split.length;
                                if (r0 > 8) {
                                    if (!"".equals(split[8].trim())) {
                                        str11 = split[8].trim();
                                    }
                                }
                                length = split.length;
                                if (r0 > 9) {
                                    if (!"".equals(split[9].trim())) {
                                        str12 = split[9].trim();
                                    }
                                }
                                if (str2 == null) {
                                    length = split.length;
                                    if (r0 > 10) {
                                        if (!"".equals(split[10].trim())) {
                                            str4 = split[10].trim();
                                            if (!j.contains(str4)) {
                                                j.add(str4);
                                                a = a + "," + str4;
                                                abd.m3811a(context, roVar, "expense_preference", "MY_ACCOUNT_NAMES", a);
                                                trim = a;
                                            }
                                        }
                                    }
                                    trim = a;
                                } else {
                                    str4 = str2;
                                    trim = a;
                                }
                                int length2 = split.length;
                                if (r0 > 11) {
                                    if (!"".equals(split[11].trim())) {
                                        str13 = split[11].trim().replaceAll(";", ",");
                                    }
                                }
                                length2 = split.length;
                                if (r0 > 12) {
                                    if (!"".equals(split[12].trim())) {
                                        str14 = split[12].trim();
                                    }
                                }
                                if ("".equals(str5)) {
                                    str5 = context.getResources().getString(2131100152);
                                }
                                if (a2.startsWith("-")) {
                                    a2 = a2.replace("-", "");
                                } else {
                                    if ("Income".equalsIgnoreCase(str5)) {
                                        str5 = "Income";
                                    } else {
                                        a2 = "-" + a2;
                                    }
                                }
                                if ("".equals(a3)) {
                                    a = trim;
                                } else {
                                    DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t, Locale.US);
                                    if (a3.indexOf(":") != -1) {
                                        simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t + " HH:mm:ss", Locale.US);
                                    }
                                    ContentValues a4 = roVar.m4190a(str4, a2, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, simpleDateFormat.parse(a3).getTime(), Long.valueOf(System.currentTimeMillis()).longValue());
                                    if (!roVar.m4206d()) {
                                        roVar.m4193a();
                                    }
                                    roVar.m4185a("expense_report", a4);
                                    z2 = true;
                                    abd.m3805a(context, true);
                                    a = trim;
                                }
                            }
                        } else if (a2.indexOf(";") != -1) {
                            str3 = ";";
                        }
                    }
                }
                z = z2;
            }
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        roVar.m4201b();
        return z;
    }

    public static boolean m3164a(String str, String str2, String str3) {
        try {
            char[] cArr = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':'};
            for (int length = cArr.length - 1; length >= 0; length--) {
                str2 = str2.replace(cArr[length], '_');
            }
            File file = new File(str);
            if (!file.exists()) {
                file.mkdir();
            }
            File file2 = new File(file.getPath() + "/" + str2);
            if (!file2.exists() && file.exists()) {
                file2.createNewFile();
            }
            if (!file2.exists() || !file2.canWrite()) {
                return false;
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
            bufferedWriter.write(str3);
            bufferedWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String[] m3165a(String str, String str2) {
        try {
            return new File(str).list(new tb(str2));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private String m3166b() {
        List arrayList = new ArrayList();
        ExpenseAccountActivities.m2602a(new ro(this), this.f3214d, arrayList, false, "expensed ASC");
        int i = 0;
        StringBuffer append = new StringBuffer("!Account").append("\nN" + this.f3211a).append("\nT" + this.f3216f[this.f3215e.getSelectedItemPosition()]).append("\n^").append("\n!Type:" + this.f3216f[this.f3215e.getSelectedItemPosition()]);
        while (i < arrayList.size()) {
            Map map = (Map) arrayList.get(i);
            StringBuffer append2 = append.append("\nD" + aba.m3757a(ExpenseManager.f3244t, this.f3217g, (String) map.get("date")));
            String str = (String) map.get("amount");
            String str2 = (String) map.get("category");
            if (!(str2 == null || str2.startsWith("Income"))) {
                str = "-" + str;
            }
            append2 = append2.append("\nT" + str);
            str = (String) map.get("description");
            if (!(str == null || "".equals(str))) {
                append2 = append2.append("\nM" + str);
            }
            str = (String) map.get("status");
            if ("Cleared".equalsIgnoreCase(str)) {
                append2 = append2.append("\nCc");
            }
            if ("Reconciled".equalsIgnoreCase(str)) {
                append2 = append2.append("\nCR");
            }
            str = (String) map.get("referenceNumber");
            if (!(str == null || "".equals(str))) {
                append2 = append2.append("\nN" + str);
            }
            String str3 = (String) map.get("property");
            if (!(str3 == null || "".equals(str3))) {
                append2 = append2.append("\nP" + str3);
            }
            i++;
            append = append2.append("\nL" + str2).append("\n^");
        }
        return append.toString();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        this.f3218h = new ro(this);
        setContentView(2130903102);
        this.f3211a = getIntent().getStringExtra("account");
        this.f3214d = getIntent().getStringExtra("whereClause");
        String str = this.f3211a + "-" + aib.m3876h("yyyy-MM-dd-HHmmss") + ".csv";
        TextView textView = (TextView) findViewById(2131558713);
        textView.setText(textView.getText().toString() + co.f4430d + "/" + str);
        textView = (TextView) findViewById(2131558717);
        textView.setText(textView.getText().toString() + co.f4430d);
        textView = (TextView) findViewById(2131558715);
        textView.setText(textView.getText().toString() + str);
        RadioButton radioButton = (RadioButton) findViewById(2131558711);
        RadioButton radioButton2 = (RadioButton) findViewById(2131558712);
        if (",".equals(abd.m3786a(this.f3212b, this.f3218h, "csv_delimiter", ","))) {
            radioButton.setChecked(true);
        } else {
            radioButton2.setChecked(true);
        }
        radioButton.setOnClickListener(new st(this));
        radioButton2.setOnClickListener(new su(this));
        Button button = (Button) findViewById(2131558804);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new sv(this, str));
        button = (Button) findViewById(2131558805);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new sw(this, str));
        button = (Button) findViewById(2131558806);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new sx(this));
        this.f3215e = (Spinner) findViewById(2131558809);
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, getResources().getString(2131100035).split(","));
        arrayAdapter.setDropDownViewResource(17367049);
        this.f3215e.setAdapter(arrayAdapter);
        radioButton = (RadioButton) findViewById(2131558811);
        radioButton2 = (RadioButton) findViewById(2131558812);
        Button button2 = (Button) findViewById(2131558810);
        aib.m3858a((Context) this, button2, -1);
        button2.setOnClickListener(new ta(this, radioButton, radioButton2));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
