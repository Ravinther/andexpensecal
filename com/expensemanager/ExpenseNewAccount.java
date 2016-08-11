package com.expensemanager;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.gms.C0607c;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ExpenseNewAccount extends Activity {
    long f3306a;
    private Context f3307b;
    private EditText f3308c;
    private EditText f3309d;
    private EditText f3310e;
    private Spinner f3311f;
    private CheckBox f3312g;
    private Spinner f3313h;
    private CheckBox f3314i;
    private CheckBox f3315j;
    private Spinner f3316k;
    private Spinner f3317l;
    private EditText f3318m;
    private Spinner f3319n;
    private int f3320o;
    private String f3321p;
    private String f3322q;
    private Map<String, String> f3323r;
    private ro f3324s;
    private String f3325t;
    private Button f3326u;

    public ExpenseNewAccount() {
        this.f3307b = this;
        this.f3321p = null;
        this.f3322q = null;
        this.f3306a = -1;
    }

    private long m3273a(Context context, boolean z, String str, long j, String str2) {
        String replaceAll;
        ro roVar = new ro(this);
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        if (str2 != null) {
            try {
                replaceAll = str2.replaceAll(",", "");
            } catch (Exception e) {
                e.printStackTrace();
                j = -1;
            }
        } else {
            replaceAll = str2;
        }
        String str3 = "Income";
        if (replaceAll.startsWith("-")) {
            str3 = "Uncategorized";
            replaceAll = replaceAll.replace("-", "");
        }
        String str4 = "Initial Balance";
        String str5 = "";
        String str6 = "Initial Balance";
        String str7 = "";
        String str8 = "";
        String str9 = "Cleared";
        String str10 = "";
        String str11 = "";
        String str12 = "";
        String str13 = "";
        String str14 = "";
        String str15 = "";
        DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t, Locale.US);
        Date date = new Date();
        try {
            date = simpleDateFormat.parse(simpleDateFormat.format(date));
        } catch (Exception e2) {
        }
        long time = date.getTime();
        long currentTimeMillis = System.currentTimeMillis();
        if (!(z || this.f3323r == null)) {
            String str16 = (String) this.f3323r.get("date");
            if (str16 != null) {
                if (!"".equals(str16)) {
                    time = aba.m3744a(str16, ExpenseManager.f3244t, Locale.US);
                }
            }
        }
        ContentValues a = roVar.m4190a(str, replaceAll, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, time, currentTimeMillis);
        if (z || j == -1) {
            if (!"".equals(replaceAll)) {
                j = roVar.m4185a("expense_report", a);
            }
            roVar.m4201b();
            return j;
        }
        roVar.m4196a("expense_report", j, a);
        roVar.m4201b();
        return j;
    }

    public static Map<String, String> m3276a(ro roVar, long j) {
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        Cursor a = roVar.m4191a(j);
        Map<String, String> hashMap = new HashMap();
        if (a == null || !a.moveToFirst()) {
            if (a != null) {
                a.close();
            }
            roVar.m4201b();
            return hashMap;
        }
        int columnIndex = a.getColumnIndex("account");
        int columnIndex2 = a.getColumnIndex("amount");
        int columnIndex3 = a.getColumnIndex("category");
        int columnIndex4 = a.getColumnIndex("subcategory");
        int columnIndex5 = a.getColumnIndex("payment_method");
        int columnIndex6 = a.getColumnIndex("description");
        int columnIndex7 = a.getColumnIndex("reference_number");
        int columnIndex8 = a.getColumnIndex("status");
        int columnIndex9 = a.getColumnIndex("property");
        int columnIndex10 = a.getColumnIndex("property2");
        int columnIndex11 = a.getColumnIndex("expensed");
        int columnIndex12 = a.getColumnIndex("expense_tag");
        int columnIndex13 = a.getColumnIndex("tax");
        int columnIndex14 = a.getColumnIndex("property3");
        int columnIndex15 = a.getColumnIndex("property4");
        int columnIndex16 = a.getColumnIndex("property5");
        do {
            String string = a.getString(columnIndex);
            String string2 = a.getString(columnIndex2);
            String string3 = a.getString(columnIndex3);
            String string4 = a.getString(columnIndex4);
            String string5 = a.getString(columnIndex5);
            String string6 = a.getString(columnIndex6);
            String string7 = a.getString(columnIndex7);
            String string8 = a.getString(columnIndex8);
            String string9 = a.getString(columnIndex9);
            String b = aib.m3865b(a.getString(columnIndex10));
            long j2 = a.getLong(columnIndex11);
            String b2 = aib.m3865b(a.getString(columnIndex12));
            String b3 = aib.m3865b(a.getString(columnIndex13));
            String b4 = aib.m3865b(a.getString(columnIndex14));
            String b5 = aib.m3865b(a.getString(columnIndex15));
            String b6 = aib.m3865b(a.getString(columnIndex16));
            hashMap.put("dateLong", "" + j2);
            String str = "date";
            hashMap.put(r39, aba.m3749a(j2, ExpenseManager.f3244t));
            hashMap.put("account", aib.m3853a(string));
            hashMap.put("amount", aib.m3853a(string2));
            hashMap.put("category", aib.m3853a(string3));
            hashMap.put("subcategory", aib.m3853a(string4));
            hashMap.put("paymentMethod", aib.m3853a(string5));
            hashMap.put("description", aib.m3853a(string6));
            hashMap.put("referenceNumber", aib.m3853a(string7));
            hashMap.put("status", aib.m3853a(string8));
            hashMap.put("property", aib.m3853a(string9));
            hashMap.put("property2", aib.m3853a(b));
            hashMap.put("tag", b2);
            hashMap.put("tax", b3);
            hashMap.put("property3", b4);
            hashMap.put("property4", b5);
            hashMap.put("property5", b6);
        } while (a.moveToNext());
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
        return hashMap;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        CharSequence charSequence = "";
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                charSequence = extras.getString("amount");
            }
        }
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                if (-1 == i2) {
                    this.f3309d.setText(charSequence);
                }
            default:
        }
    }

    protected void onCreate(Bundle bundle) {
        int a;
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setSoftInputMode(3);
        setContentView(2130903071);
        this.f3324s = new ro(this);
        this.f3320o = abd.m3783a(this.f3307b, this.f3324s, "Default_Account_Index", 0);
        this.f3322q = abd.m3786a(this.f3307b, this.f3324s, "CREDIT_CARD_ACCOUNT", null);
        boolean booleanExtra = getIntent().getBooleanExtra("isNew", true);
        String stringExtra = getIntent().getStringExtra("account");
        String a2 = abd.m3786a(this.f3307b, this.f3324s, "MY_ACCOUNT_NAMES", null);
        if (!booleanExtra) {
            a = abd.m3783a(this.f3307b, this.f3324s, stringExtra + "_CURRENCY", 0);
        } else if (a2 != null) {
            a = abd.m3783a(this.f3307b, this.f3324s, a2.split(",")[0] + "_CURRENCY", 0);
        } else {
            a = 0;
        }
        this.f3308c = (EditText) findViewById(2131558599);
        this.f3310e = (EditText) findViewById(2131558600);
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, co.f4436j);
        arrayAdapter.setDropDownViewResource(17367049);
        this.f3311f = (Spinner) findViewById(2131558601);
        this.f3311f.setAdapter(arrayAdapter);
        this.f3311f.setSelection(a);
        this.f3309d = (EditText) findViewById(2131558503);
        ((ImageButton) findViewById(2131558525)).setOnClickListener(new wo(this));
        this.f3312g = (CheckBox) findViewById(2131558603);
        this.f3312g.setOnClickListener(new wp(this));
        arrayAdapter = new ArrayAdapter(this, 2130903151, getResources().getString(2131099954).split(","));
        arrayAdapter.setDropDownViewResource(17367049);
        this.f3313h = (Spinner) findViewById(2131558604);
        this.f3313h.setAdapter(arrayAdapter);
        this.f3314i = (CheckBox) findViewById(2131558605);
        if (!(booleanExtra || aib.m3865b(a2).indexOf(",") == -1) || getIntent().getBooleanExtra("isHidden", false)) {
            this.f3314i.setVisibility(0);
        }
        if (getIntent().getBooleanExtra("isHidden", false)) {
            this.f3314i.setChecked(true);
            this.f3308c.setEnabled(false);
        }
        this.f3314i.setOnClickListener(new wq(this, stringExtra));
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558608);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(2131558610);
        LinearLayout linearLayout3 = (LinearLayout) findViewById(2131558612);
        this.f3318m = (EditText) findViewById(2131558607);
        this.f3315j = (CheckBox) findViewById(2131558606);
        this.f3315j.setOnClickListener(new wr(this, linearLayout, linearLayout2, linearLayout3));
        String[] strArr = new String[30];
        for (int i = 0; i < 30; i++) {
            strArr[i] = "" + (i + 1);
        }
        SpinnerAdapter arrayAdapter2 = new ArrayAdapter(this, 2130903151, strArr);
        arrayAdapter2.setDropDownViewResource(17367049);
        this.f3316k = (Spinner) findViewById(2131558609);
        this.f3316k.setAdapter(arrayAdapter2);
        this.f3317l = (Spinner) findViewById(2131558611);
        this.f3317l.setAdapter(arrayAdapter2);
        this.f3319n = (Spinner) findViewById(2131558613);
        SpinnerAdapter arrayAdapter3 = new ArrayAdapter(this, 2130903151, getResources().getString(2131100044).split(","));
        arrayAdapter3.setDropDownViewResource(17367049);
        this.f3319n.setAdapter(arrayAdapter3);
        this.f3319n.setSelection(0);
        this.f3326u = (Button) findViewById(2131558507);
        aib.m3858a((Context) this, this.f3326u, -1);
        this.f3326u.setOnClickListener(new ws(this, booleanExtra, stringExtra));
        Button button = (Button) findViewById(2131558506);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new wt(this));
        button = (Button) findViewById(2131558614);
        aib.m3858a((Context) this, button, 2130837530);
        if (!booleanExtra) {
            button.setVisibility(0);
        }
        button.setOnClickListener(new wu(this, stringExtra));
        if (!booleanExtra) {
            this.f3308c.setText(stringExtra);
            CharSequence a3 = abd.m3786a(this.f3307b, this.f3324s, stringExtra + "_DESCRIPTION", "");
            this.f3310e.setText(a3);
            if ("Personal Expense".equals(stringExtra) && "".equals(a3)) {
                this.f3310e.setText("Personal Expense Account");
            }
            this.f3306a = (long) abd.m3783a(this.f3307b, this.f3324s, stringExtra + "_rowId", -1);
            if (this.f3306a != -1) {
                this.f3323r = m3276a(new ro(this), this.f3306a);
                a3 = (String) this.f3323r.get("amount");
                if (!("Income".equalsIgnoreCase((String) this.f3323r.get("category")) || a3 == null)) {
                    a3 = "-" + a3;
                }
                if (a3 == null || "".equals(a3)) {
                    this.f3306a = -1;
                } else {
                    this.f3309d.setText(a3);
                }
            }
            this.f3321p = abd.m3786a(this.f3307b, this.f3324s, stringExtra + "_" + "AUTO_ACCOUNT", null);
            if ("mi".equals(this.f3321p) || "km".equals(this.f3321p)) {
                this.f3312g.setChecked(true);
                if ("km".equals(this.f3321p)) {
                    this.f3313h.setSelection(1);
                }
            }
            if (this.f3312g.isChecked()) {
                this.f3313h.setEnabled(true);
            } else {
                this.f3313h.setEnabled(false);
            }
            this.f3325t = co.f4436j[a].split(":")[1] + "/" + this.f3321p;
            ArrayList j = aib.m3878j(this.f3322q);
            if (j != null && j.contains(stringExtra)) {
                this.f3315j.setChecked(true);
                linearLayout.setVisibility(0);
                linearLayout2.setVisibility(0);
                linearLayout3.setVisibility(0);
                this.f3318m.setVisibility(0);
                String a4 = abd.m3786a(this.f3307b, this.f3324s, stringExtra + "_" + "CREDIT_CARD_ACCOUNT", null);
                if (a4 != null) {
                    int intValue;
                    String[] split = a4.split(",");
                    if (split.length > 0) {
                        this.f3318m.setText(split[0]);
                    }
                    if (split.length > 1) {
                        intValue = Integer.valueOf(split[1]).intValue() - 1;
                        if (intValue < this.f3316k.getCount()) {
                            this.f3316k.setSelection(intValue);
                        }
                    }
                    if (split.length > 2) {
                        intValue = Integer.valueOf(split[2]).intValue() - 1;
                        if (intValue < this.f3317l.getCount()) {
                            this.f3317l.setSelection(intValue);
                        }
                    }
                    if (split.length > 3 && !"".endsWith(split[3])) {
                        this.f3319n.setSelection(Integer.parseInt(split[3]));
                    }
                }
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 1, 0, 2131100065).setIcon(2130837591).setShowAsAction(2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        if (itemId == 1) {
            this.f3326u.performClick();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
