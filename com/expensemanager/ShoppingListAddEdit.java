package com.expensemanager;

import android.app.ActionBar.OnNavigationListener;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.method.TextKeyListener;
import android.text.method.TextKeyListener.Capitalize;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class ShoppingListAddEdit extends Activity {
    private ro f3598A;
    private String f3599B;
    private long f3600C;
    private LinearLayout f3601D;
    private boolean f3602E;
    private OnDateSetListener f3603F;
    private OnTimeSetListener f3604G;
    private Context f3605a;
    private EditText f3606b;
    private Button f3607c;
    private CheckBox f3608d;
    private TextView f3609e;
    private TextView f3610f;
    private TextView f3611g;
    private TextView f3612h;
    private TextView f3613i;
    private EditText f3614j;
    private AutoCompleteTextView f3615k;
    private EditText f3616l;
    private AutoCompleteTextView f3617m;
    private Button f3618n;
    private ImageButton f3619o;
    private Bitmap f3620p;
    private boolean f3621q;
    private TextView f3622r;
    private EditText f3623s;
    private TextView f3624t;
    private int f3625u;
    private int f3626v;
    private int f3627w;
    private int f3628x;
    private int f3629y;
    private String f3630z;

    public ShoppingListAddEdit() {
        this.f3605a = this;
        this.f3621q = false;
        this.f3630z = "Personal Expense";
        this.f3599B = "";
        this.f3600C = -1;
        this.f3602E = false;
        this.f3603F = new agp(this);
        this.f3604G = new agq(this);
    }

    private void m3570a() {
        Object[] split;
        String str;
        Object[] objArr;
        ImageButton imageButton;
        TextView textView;
        Calendar instance;
        CharSequence string;
        List a;
        String[] split2;
        ArrayList arrayList;
        Button button;
        float f;
        Button button2;
        Button button3;
        Map a2;
        CharSequence replace;
        File file;
        String stringExtra = getIntent().getStringExtra("fromWhere");
        this.f3606b = (EditText) findViewById(2131558695);
        this.f3607c = (Button) findViewById(2131558694);
        this.f3607c.setOnClickListener(new agf(this));
        this.f3608d = (CheckBox) findViewById(2131558983);
        if ("Edit".equalsIgnoreCase(stringExtra)) {
            this.f3608d.setVisibility(0);
        }
        this.f3608d.setOnClickListener(new agt(this));
        this.f3609e = (TextView) findViewById(2131558530);
        ((ImageButton) findViewById(2131558529)).setOnClickListener(new agv(this));
        this.f3610f = (TextView) findViewById(2131558690);
        this.f3610f.setText(aba.m3749a(System.currentTimeMillis(), "HH:mm"));
        this.f3610f.setPaintFlags(this.f3610f.getPaintFlags() | 8);
        this.f3610f.setOnClickListener(new agw(this));
        this.f3628x = aib.m3879k(aba.m3749a(System.currentTimeMillis(), "HH"));
        this.f3629y = aib.m3879k(aba.m3749a(System.currentTimeMillis(), "mm"));
        this.f3611g = (TextView) findViewById(2131558476);
        this.f3611g.setText(this.f3630z);
        ((ImageButton) findViewById(2131558475)).setOnClickListener(new agx(this));
        String stringExtra2 = getIntent().getStringExtra("category");
        this.f3612h = (TextView) findViewById(2131558543);
        ((ImageButton) findViewById(2131558542)).setOnClickListener(new agy(this, stringExtra2));
        if (stringExtra2 == null || !stringExtra2.startsWith("Income")) {
            this.f3612h.setTextColor(co.f4428b);
        } else {
            this.f3612h.setText(stringExtra2);
            this.f3612h.setTextColor(co.f4429c);
        }
        if (!this.f3612h.getText().toString().startsWith("Income")) {
            this.f3612h.setOnClickListener(new agz(this));
        }
        if (!"Edit".equalsIgnoreCase(stringExtra)) {
            TextView textView2 = (TextView) findViewById(2131558541);
            textView2.setPaintFlags(textView2.getPaintFlags() | 8);
            textView2.setOnClickListener(new ahb(this));
        }
        this.f3617m = (AutoCompleteTextView) findViewById(2131558522);
        String str2 = "PAYEE_LIST";
        String[] strArr = ExpensePayList.f3360a;
        if (stringExtra2 != null && stringExtra2.startsWith("Income")) {
            str2 = "PAYER_LIST";
            strArr = ExpensePayList.f3361b;
        }
        str2 = abd.m3786a(this.f3605a, this.f3598A, str2, "");
        if (str2 == null || "".equals(str2)) {
            String[] strArr2 = strArr;
        } else {
            split = str2.split(",");
        }
        try {
            Collection asList = Arrays.asList(split);
            str = "category!='Income'";
            if (stringExtra2 != null && stringExtra2.startsWith("Income")) {
                str = "category='Income'";
            }
            List a3 = abd.m3798a(this.f3598A, str, "property");
            if (!(asList == null || a3 == null)) {
                List arrayList2 = new ArrayList(asList);
                for (int i = 0; i < a3.size(); i++) {
                    if (!arrayList2.contains(a3.get(i))) {
                        arrayList2.add(a3.get(i));
                    }
                }
                objArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                if (objArr != null && objArr.length > 0) {
                    this.f3617m.setAdapter(new ArrayAdapter(this, 17367057, objArr));
                }
                this.f3617m.setOnItemClickListener(new aft(this, stringExtra));
                imageButton = (ImageButton) findViewById(2131558521);
                textView = (TextView) findViewById(2131558691);
                if (stringExtra2 == null && stringExtra2.startsWith("Income")) {
                    textView.setText(2131100009);
                } else {
                    textView.setText(2131100004);
                }
                imageButton.setOnClickListener(new afu(this, stringExtra2));
                instance = Calendar.getInstance();
                this.f3625u = instance.get(1);
                this.f3626v = instance.get(2);
                this.f3627w = instance.get(5);
                m3579b();
                string = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getString(this.f3630z + "_" + "PAYMENT_METHOD_KEY", null);
                this.f3613i = (TextView) findViewById(2131558547);
                if (string != null) {
                    str = getResources().getString(2131100012);
                    str2 = abd.m3786a(this.f3605a, this.f3598A, "PAYMENT_METHOD_KEY", str);
                    if (!str2.equals("")) {
                        str = str2;
                    }
                    strArr = str.split(",");
                    if (strArr != null && strArr.length > 0) {
                        this.f3613i.setText(strArr[0]);
                    }
                } else {
                    this.f3613i.setText(string);
                }
                ((ImageButton) findViewById(2131558546)).setOnClickListener(new afv(this));
                this.f3614j = (EditText) findViewById(2131558526);
                ((ImageButton) findViewById(2131558525)).setOnClickListener(new afw(this));
                if (getIntent().getStringExtra("amount") != null) {
                    this.f3614j.setText(getIntent().getStringExtra("amount"));
                }
                this.f3615k = (AutoCompleteTextView) findViewById(2131558537);
                a = abd.m3798a(this.f3598A, "", "description");
                strArr = (String[]) a.toArray(new String[a.size()]);
                if (strArr != null && strArr.length > 0) {
                    this.f3615k.setAdapter(new ArrayAdapter(this, 17367057, strArr));
                }
                this.f3615k.setKeyListener(TextKeyListener.getInstance(true, Capitalize.NONE));
                this.f3615k.setOnItemClickListener(new afx(this, stringExtra));
                this.f3616l = (EditText) findViewById(2131558548);
                split2 = abd.m3786a(this.f3605a, this.f3598A, "TRANSACTION_STATUS_KEY", getResources().getString(2131100103)).split(",");
                this.f3618n = (Button) findViewById(2131558549);
                if (split2 != null && split2.length > 0) {
                    this.f3618n.setText(split2[0]);
                    arrayList = new ArrayList(Arrays.asList(split2));
                    if ("Cash".equalsIgnoreCase(this.f3613i.getText().toString()) && arrayList.contains("Cleared")) {
                        this.f3618n.setText("Cleared");
                    }
                }
                this.f3618n.setOnClickListener(new afy(this));
                this.f3619o = (ImageButton) findViewById(2131558535);
                this.f3619o.setOnClickListener(new afz(this));
                this.f3622r = (TextView) findViewById(2131558553);
                ((ImageButton) findViewById(2131558552)).setOnClickListener(new agc(this));
                this.f3623s = (EditText) findViewById(2131558557);
                ((ImageButton) findViewById(2131558556)).setOnClickListener(new agd(this));
                this.f3601D = (LinearLayout) findViewById(2131558539);
                this.f3624t = (TextView) findViewById(2131558538);
                this.f3624t.setOnClickListener(new age(this));
                if ((getResources().getConfiguration().screenLayout & 15) == 4 || (getResources().getConfiguration().screenLayout & 15) == 3) {
                    this.f3601D.setVisibility(0);
                    this.f3624t.setVisibility(8);
                }
                button = (Button) findViewById(2131558560);
                aib.m3858a((Context) this, button, -1);
                button.setOnClickListener(new agg(this, stringExtra));
                button = (Button) findViewById(2131558559);
                aib.m3858a((Context) this, button, -1);
                button.setOnClickListener(new agh(this));
                f = getResources().getDisplayMetrics().density;
                button.setPadding((int) ((2.0d * ((double) f)) + 0.5d), (int) ((10.0d * ((double) f)) + 0.5d), (int) ((2.0d * ((double) f)) + 0.5d), (int) ((10.0d * ((double) f)) + 0.5d));
                button = (Button) findViewById(2131558558);
                aib.m3858a((Context) this, button, 2130837530);
                button.setOnClickListener(new agi(this));
                button2 = (Button) findViewById(2131558698);
                aib.m3858a((Context) this, button2, -1);
                button2.setOnClickListener(new agm(this));
                button3 = (Button) findViewById(2131558696);
                aib.m3858a((Context) this, button3, -1);
                button3.setOnClickListener(new agn(this));
                button3 = (Button) findViewById(2131558697);
                aib.m3858a((Context) this, button3, -1);
                button3.setOnClickListener(new ago(this));
                if ("Edit".equalsIgnoreCase(stringExtra)) {
                    Object replaceAll;
                    setTitle(2131099863);
                    a2 = ExpenseNewAccount.m3276a(this.f3598A, getIntent().getLongExtra("rowId", -1));
                    stringExtra = aib.m3865b((String) a2.get("category"));
                    if (!(a2.get("subcategory") == null || "".equals(a2.get("subcategory")))) {
                        stringExtra = stringExtra + ":" + ((String) a2.get("subcategory"));
                    }
                    this.f3612h.setText(aib.m3865b(stringExtra));
                    this.f3617m.setText(aib.m3865b((String) a2.get("property")));
                    this.f3611g.setText(aib.m3865b((String) a2.get("account")));
                    replace = aib.m3853a((String) a2.get("amount")).replaceAll(",", "").replace("+", "");
                    if (replace.startsWith("(")) {
                        replace = aba.m3782h(replace);
                    }
                    this.f3614j.setText(replace);
                    replaceAll = aib.m3865b((String) a2.get("description")).replaceAll("\u2605", "");
                    this.f3615k.setText(replaceAll);
                    this.f3616l.setText(aib.m3865b((String) a2.get("referenceNumber")));
                    this.f3617m.setText(aib.m3865b((String) a2.get("property")));
                    replace = (String) a2.get("status");
                    if ((replace == null || "".equals(replace)) && split2 != null) {
                        replace = split2[0];
                    }
                    this.f3618n.setText(replace);
                    this.f3613i.setText(aib.m3865b((String) a2.get("paymentMethod")));
                    button.setVisibility(0);
                    button2.setVisibility(0);
                    button3.setVisibility(8);
                    if (replaceAll == null && replaceAll.startsWith("Repeating:")) {
                        this.f3615k.setEnabled(false);
                    } else {
                        try {
                            this.f3615k.setEnabled(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                    if (a2.get("dateLong") != null && Long.parseLong((String) a2.get("dateLong")) > 0) {
                        try {
                            this.f3602E = true;
                            this.f3608d.setChecked(true);
                            this.f3609e.setText((CharSequence) a2.get("date"));
                            this.f3601D.setVisibility(0);
                            this.f3624t.setText(getResources().getString(2131099918));
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
                            simpleDateFormat.setLenient(false);
                            instance.setTime(simpleDateFormat.parse((String) a2.get("date")));
                            this.f3625u = instance.get(1);
                            this.f3626v = instance.get(2);
                            this.f3627w = instance.get(5);
                            this.f3610f.setText(aba.m3749a(Long.parseLong((String) a2.get("dateLong")), "HH:mm"));
                            strArr = this.f3610f.getText().toString().split(":");
                            this.f3628x = aib.m3879k(strArr[0]);
                            this.f3629y = aib.m3879k(strArr[1]);
                        } catch (Exception e2) {
                        }
                    }
                    str = (String) a2.get("property2");
                    if (!(str == null || "".equals(str))) {
                        file = new File(co.f4431e + str);
                        if (file.exists()) {
                            this.f3620p = AttachPicture.m2370a(file, Math.round(60.0f * f));
                            if (this.f3620p != null) {
                                this.f3620p = Bitmap.createScaledBitmap(this.f3620p, Math.round(55.0f * f), Math.round(65.0f * f), false);
                                this.f3619o.setImageBitmap(this.f3620p);
                            }
                        }
                    }
                    this.f3622r.setText(aib.m3865b((String) a2.get("tag")));
                    this.f3623s.setText(aib.m3865b((String) a2.get("tax")));
                    this.f3599B = aib.m3865b((String) a2.get("property3"));
                    strArr = ((String) a2.get("property4")).split(" ");
                    if (strArr.length > 0) {
                        this.f3606b.setText(strArr[0]);
                    }
                    if (strArr.length > 1) {
                        this.f3607c.setText(strArr[1]);
                    }
                    if (a2.get("dateLong") != null) {
                        this.f3600C = Long.parseLong((String) a2.get("dateLong"));
                    }
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        objArr = split;
        this.f3617m.setAdapter(new ArrayAdapter(this, 17367057, objArr));
        this.f3617m.setOnItemClickListener(new aft(this, stringExtra));
        imageButton = (ImageButton) findViewById(2131558521);
        textView = (TextView) findViewById(2131558691);
        if (stringExtra2 == null) {
        }
        textView.setText(2131100004);
        imageButton.setOnClickListener(new afu(this, stringExtra2));
        instance = Calendar.getInstance();
        this.f3625u = instance.get(1);
        this.f3626v = instance.get(2);
        this.f3627w = instance.get(5);
        m3579b();
        string = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getString(this.f3630z + "_" + "PAYMENT_METHOD_KEY", null);
        this.f3613i = (TextView) findViewById(2131558547);
        if (string != null) {
            this.f3613i.setText(string);
        } else {
            str = getResources().getString(2131100012);
            str2 = abd.m3786a(this.f3605a, this.f3598A, "PAYMENT_METHOD_KEY", str);
            if (str2.equals("")) {
                str = str2;
            }
            strArr = str.split(",");
            this.f3613i.setText(strArr[0]);
        }
        ((ImageButton) findViewById(2131558546)).setOnClickListener(new afv(this));
        this.f3614j = (EditText) findViewById(2131558526);
        ((ImageButton) findViewById(2131558525)).setOnClickListener(new afw(this));
        if (getIntent().getStringExtra("amount") != null) {
            this.f3614j.setText(getIntent().getStringExtra("amount"));
        }
        this.f3615k = (AutoCompleteTextView) findViewById(2131558537);
        a = abd.m3798a(this.f3598A, "", "description");
        strArr = (String[]) a.toArray(new String[a.size()]);
        this.f3615k.setAdapter(new ArrayAdapter(this, 17367057, strArr));
        this.f3615k.setKeyListener(TextKeyListener.getInstance(true, Capitalize.NONE));
        this.f3615k.setOnItemClickListener(new afx(this, stringExtra));
        this.f3616l = (EditText) findViewById(2131558548);
        split2 = abd.m3786a(this.f3605a, this.f3598A, "TRANSACTION_STATUS_KEY", getResources().getString(2131100103)).split(",");
        this.f3618n = (Button) findViewById(2131558549);
        this.f3618n.setText(split2[0]);
        arrayList = new ArrayList(Arrays.asList(split2));
        this.f3618n.setText("Cleared");
        this.f3618n.setOnClickListener(new afy(this));
        this.f3619o = (ImageButton) findViewById(2131558535);
        this.f3619o.setOnClickListener(new afz(this));
        this.f3622r = (TextView) findViewById(2131558553);
        ((ImageButton) findViewById(2131558552)).setOnClickListener(new agc(this));
        this.f3623s = (EditText) findViewById(2131558557);
        ((ImageButton) findViewById(2131558556)).setOnClickListener(new agd(this));
        this.f3601D = (LinearLayout) findViewById(2131558539);
        this.f3624t = (TextView) findViewById(2131558538);
        this.f3624t.setOnClickListener(new age(this));
        this.f3601D.setVisibility(0);
        this.f3624t.setVisibility(8);
        button = (Button) findViewById(2131558560);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new agg(this, stringExtra));
        button = (Button) findViewById(2131558559);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new agh(this));
        f = getResources().getDisplayMetrics().density;
        button.setPadding((int) ((2.0d * ((double) f)) + 0.5d), (int) ((10.0d * ((double) f)) + 0.5d), (int) ((2.0d * ((double) f)) + 0.5d), (int) ((10.0d * ((double) f)) + 0.5d));
        button = (Button) findViewById(2131558558);
        aib.m3858a((Context) this, button, 2130837530);
        button.setOnClickListener(new agi(this));
        button2 = (Button) findViewById(2131558698);
        aib.m3858a((Context) this, button2, -1);
        button2.setOnClickListener(new agm(this));
        button3 = (Button) findViewById(2131558696);
        aib.m3858a((Context) this, button3, -1);
        button3.setOnClickListener(new agn(this));
        button3 = (Button) findViewById(2131558697);
        aib.m3858a((Context) this, button3, -1);
        button3.setOnClickListener(new ago(this));
        if ("Edit".equalsIgnoreCase(stringExtra)) {
            setTitle(2131099863);
            a2 = ExpenseNewAccount.m3276a(this.f3598A, getIntent().getLongExtra("rowId", -1));
            stringExtra = aib.m3865b((String) a2.get("category"));
            stringExtra = stringExtra + ":" + ((String) a2.get("subcategory"));
            this.f3612h.setText(aib.m3865b(stringExtra));
            this.f3617m.setText(aib.m3865b((String) a2.get("property")));
            this.f3611g.setText(aib.m3865b((String) a2.get("account")));
            replace = aib.m3853a((String) a2.get("amount")).replaceAll(",", "").replace("+", "");
            if (replace.startsWith("(")) {
                replace = aba.m3782h(replace);
            }
            this.f3614j.setText(replace);
            replaceAll = aib.m3865b((String) a2.get("description")).replaceAll("\u2605", "");
            this.f3615k.setText(replaceAll);
            this.f3616l.setText(aib.m3865b((String) a2.get("referenceNumber")));
            this.f3617m.setText(aib.m3865b((String) a2.get("property")));
            replace = (String) a2.get("status");
            replace = split2[0];
            this.f3618n.setText(replace);
            this.f3613i.setText(aib.m3865b((String) a2.get("paymentMethod")));
            button.setVisibility(0);
            button2.setVisibility(0);
            button3.setVisibility(8);
            if (replaceAll == null) {
            }
            this.f3615k.setEnabled(true);
            this.f3602E = true;
            this.f3608d.setChecked(true);
            this.f3609e.setText((CharSequence) a2.get("date"));
            this.f3601D.setVisibility(0);
            this.f3624t.setText(getResources().getString(2131099918));
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(ExpenseManager.f3244t);
            simpleDateFormat2.setLenient(false);
            instance.setTime(simpleDateFormat2.parse((String) a2.get("date")));
            this.f3625u = instance.get(1);
            this.f3626v = instance.get(2);
            this.f3627w = instance.get(5);
            this.f3610f.setText(aba.m3749a(Long.parseLong((String) a2.get("dateLong")), "HH:mm"));
            strArr = this.f3610f.getText().toString().split(":");
            this.f3628x = aib.m3879k(strArr[0]);
            this.f3629y = aib.m3879k(strArr[1]);
            str = (String) a2.get("property2");
            file = new File(co.f4431e + str);
            if (file.exists()) {
                this.f3620p = AttachPicture.m2370a(file, Math.round(60.0f * f));
                if (this.f3620p != null) {
                    this.f3620p = Bitmap.createScaledBitmap(this.f3620p, Math.round(55.0f * f), Math.round(65.0f * f), false);
                    this.f3619o.setImageBitmap(this.f3620p);
                }
            }
            this.f3622r.setText(aib.m3865b((String) a2.get("tag")));
            this.f3623s.setText(aib.m3865b((String) a2.get("tax")));
            this.f3599B = aib.m3865b((String) a2.get("property3"));
            strArr = ((String) a2.get("property4")).split(" ");
            if (strArr.length > 0) {
                this.f3606b.setText(strArr[0]);
            }
            if (strArr.length > 1) {
                this.f3607c.setText(strArr[1]);
            }
            if (a2.get("dateLong") != null) {
                this.f3600C = Long.parseLong((String) a2.get("dateLong"));
            }
        }
    }

    private void m3573a(String str) {
        String obj;
        boolean a;
        long j = 0;
        this.f3598A.m4193a();
        try {
            File file;
            this.f3630z = this.f3611g.getText().toString();
            obj = this.f3614j.getText().toString();
            if (obj != null) {
                obj = obj.replaceAll(",", "");
            }
            String[] split = this.f3612h.getText().toString().split(":");
            String str2 = split[0];
            String str3 = "";
            if (split.length > 1) {
                str3 = split[1];
            }
            String charSequence = this.f3613i.getText().toString();
            String a2 = aib.m3853a(this.f3615k.getText().toString());
            String obj2 = this.f3616l.getText().toString();
            String a3 = aib.m3853a(this.f3617m.getText().toString());
            String charSequence2 = this.f3618n.getText().toString();
            String str4 = "";
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            j = aba.m3744a(this.f3609e.getText().toString() + " " + this.f3610f.getText().toString(), ExpenseManager.f3244t + " HH:mm", Locale.US);
            if ("Edit".equalsIgnoreCase(str) && this.f3620p != null) {
                str4 = getIntent().getStringExtra("property2");
            }
            if (this.f3620p != null && this.f3621q) {
                str4 = aba.m3749a(j, "yyyy-MM-dd-HH-mm-ss") + "-" + new Random().nextInt(1000) + ".jpg";
            }
            String charSequence3 = this.f3622r.getText().toString();
            String obj3 = this.f3623s.getText().toString();
            this.f3599B = "$ShoppingList";
            String str5 = "";
            if (!"".equals(this.f3606b.getText().toString())) {
                str5 = this.f3606b.getText().toString() + " " + this.f3607c.getText().toString();
            }
            String str6 = "";
            if (!"Edit".equalsIgnoreCase(str)) {
                j = 0;
                this.f3630z = "$ShoppingList";
                this.f3599B = this.f3611g.getText().toString();
            }
            if ("Edit".equalsIgnoreCase(str) && this.f3602E && !this.f3608d.isChecked()) {
                j = 0;
                this.f3630z = "$ShoppingList";
                this.f3599B = this.f3611g.getText().toString();
            }
            if (!(!"Edit".equalsIgnoreCase(str) || this.f3602E || this.f3608d.isChecked())) {
                j = this.f3600C;
                this.f3630z = "$ShoppingList";
                this.f3599B = this.f3611g.getText().toString();
            }
            if (this.f3608d.isChecked()) {
                this.f3630z = this.f3611g.getText().toString();
                this.f3599B = "$ShoppingList";
            }
            if ("NEW".equalsIgnoreCase(str)) {
                j = 0;
                this.f3630z = "$ShoppingList";
                this.f3599B = this.f3611g.getText().toString();
            }
            ContentValues a4 = this.f3598A.m4190a(this.f3630z, obj, str2, str3, charSequence, a2, obj2, a3, charSequence2, str4, charSequence3, obj3, this.f3599B, str5, str6, j, valueOf.longValue());
            long j2;
            if ("Edit".equalsIgnoreCase(str)) {
                long longExtra = getIntent().getLongExtra("rowId", 0);
                long j3 = longExtra;
                a = this.f3598A.m4196a("expense_report", longExtra, a4);
                j2 = j3;
            } else {
                j2 = this.f3598A.m4185a("expense_report", a4);
                a = true;
            }
            if (this.f3620p != null && this.f3621q) {
                file = new File(co.f4431e + "tmp.jpg");
                if (file.exists() && !"".equals(str4)) {
                    AttachPicture.m2371a(new File(co.f4431e + "tmp.jpg"));
                    file.renameTo(new File(co.f4431e + str4));
                }
            }
            if (!(this.f3620p != null || r4 == -1 || "".equals(str4))) {
                file = new File(co.f4431e + str4);
                if (file.exists()) {
                    file.delete();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            a = false;
        }
        this.f3598A.m4201b();
        if (a) {
            abd.m3805a(this.f3605a, a);
            SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
            String string = sharedPreferences.getString(this.f3630z + "_" + "PAYMENT_METHOD_KEY", null);
            obj = this.f3613i.getText().toString();
            if (!(obj == null || obj.equals(string))) {
                Editor edit = sharedPreferences.edit();
                edit.putString(this.f3630z + "_" + "PAYMENT_METHOD_KEY", obj);
                edit.commit();
            }
            if ("OKNEW".equalsIgnoreCase(str)) {
                Toast.makeText(this.f3605a, 2131100066, 1).show();
                return;
            }
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putLong("date", j);
            bundle.putString("account", this.f3630z);
            bundle.putInt("position", getIntent().getIntExtra("position", 0));
            intent.putExtras(bundle);
            setResult(-1, intent);
            finish();
            return;
        }
        aib.m3849a(this.f3605a, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099715), getResources().getString(2131099983), null, null, null).show();
    }

    private void m3574a(String str, boolean z) {
        Map a = ExpenseAutoFillAddEdit.m2770a(this.f3598A, "description='" + str + "'");
        if (a != null && a.size() > 0) {
            if (!z || "YES".equalsIgnoreCase((String) a.get("property"))) {
                this.f3612h.setText((CharSequence) a.get("categoryDisplay"));
                if ("".equals(this.f3614j.getText().toString())) {
                    this.f3614j.setText((CharSequence) a.get("amount"));
                }
                this.f3616l.setText((CharSequence) a.get("referenceNumber"));
                if (!"YES".equalsIgnoreCase((String) a.get("property"))) {
                    this.f3615k.setText((CharSequence) a.get("description"));
                }
                this.f3618n.setText((CharSequence) a.get("status"));
                this.f3613i.setText((CharSequence) a.get("paymentMethod"));
                this.f3617m.setText((CharSequence) a.get("payeePayer"));
            }
        }
    }

    private void m3575a(String[] strArr, TextView textView) {
        new Builder(this).setTitle(2131100026).setSingleChoiceItems(strArr, new ArrayList(Arrays.asList(strArr)).indexOf(textView.getText().toString()), new agu(this, strArr)).setPositiveButton(2131099983, new ags(this, textView)).setNegativeButton(2131099754, new agr(this, textView)).show();
    }

    private static String m3578b(int i) {
        return i >= 10 ? String.valueOf(i) : "0" + String.valueOf(i);
    }

    private void m3579b() {
        this.f3609e.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f3625u + "-" + (this.f3626v + 1) + "-" + this.f3627w));
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        CharSequence charSequence = "";
        CharSequence charSequence2 = "";
        String str = "";
        CharSequence charSequence3 = "";
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = "";
        String str2 = "";
        CharSequence charSequence6 = "";
        CharSequence charSequence7 = "";
        CharSequence charSequence8 = "";
        CharSequence charSequence9 = "";
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                charSequence = extras.getString("category");
                charSequence2 = extras.getString("account");
                extras.getString("date");
                charSequence3 = extras.getString("paymentMethod");
                charSequence4 = extras.getString("amount");
                charSequence5 = extras.getString("ref");
                str2 = extras.getString("description");
                charSequence6 = extras.getString("payee");
                charSequence7 = extras.getString("status");
                charSequence8 = extras.getString("tag");
                charSequence9 = extras.getString("unit");
            }
        }
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                if (-1 == i2 && charSequence2 != null && !"".equals(charSequence2)) {
                    this.f3611g.setText(charSequence2);
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if (-1 == i2) {
                    this.f3612h.setText(charSequence);
                }
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                if (-1 == i2) {
                    this.f3617m.setText(charSequence6);
                    if (!"Edit".equalsIgnoreCase(getIntent().getStringExtra("fromWhere"))) {
                        m3574a(this.f3617m.getText().toString(), true);
                    }
                }
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                if (-1 == i2) {
                    this.f3614j.setText(charSequence4);
                    if (charSequence5 != null) {
                        this.f3616l.setText(charSequence5);
                    }
                    if (str2 != null) {
                        this.f3615k.setText(str2);
                    }
                }
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                if (-1 == i2) {
                    this.f3613i.setText(charSequence3);
                    String[] split = abd.m3786a(this.f3605a, this.f3598A, "TRANSACTION_STATUS_KEY", getResources().getString(2131100103)).split(",");
                    if (split != null && split.length > 0) {
                        ArrayList arrayList = new ArrayList(Arrays.asList(split));
                        if ("Cash".equalsIgnoreCase(this.f3613i.getText().toString()) && arrayList.contains("Cleared")) {
                            this.f3618n.setText("Cleared");
                        }
                        if ("Credit Card".equalsIgnoreCase(this.f3613i.getText().toString()) && arrayList.contains("Uncleared")) {
                            this.f3618n.setText("Uncleared");
                        }
                    }
                }
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                if (-1 == i2) {
                    this.f3618n.setText(charSequence7);
                }
            case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                if (-1 == i2) {
                    float f = getResources().getDisplayMetrics().density;
                    AttachPicture.m2371a(new File(co.f4431e + "tmp.jpg"));
                    this.f3620p = AttachPicture.m2370a(new File(co.f4431e + "tmp.jpg"), Math.round(60.0f * f));
                    if (this.f3620p != null) {
                        this.f3620p = Bitmap.createScaledBitmap(this.f3620p, Math.round(55.0f * f), Math.round(f * 65.0f), false);
                        this.f3619o.setImageBitmap(this.f3620p);
                        this.f3621q = true;
                    }
                }
            case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                if (-1 == i2) {
                    m3574a(str2, false);
                }
            case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                if (-1 == i2) {
                    this.f3622r.setText(charSequence8);
                }
            case adv.TitlePageIndicator_footerPadding /*10*/:
                if (-1 == i2) {
                    this.f3623s.setText(charSequence4);
                }
            case adv.TitlePageIndicator_linePosition /*11*/:
                if (-1 == i2) {
                    this.f3607c.setText(charSequence9);
                }
            default:
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        if ("Edit".equalsIgnoreCase(getIntent().getStringExtra("fromWhere"))) {
            getWindow().setSoftInputMode(3);
        }
        this.f3598A = new ro(this);
        setContentView(2130903143);
        this.f3630z = getIntent().getStringExtra("account");
        if ("$ShoppingList".equalsIgnoreCase(this.f3630z)) {
            this.f3630z = getIntent().getStringExtra("property3");
        }
        if (this.f3630z == null || "".equals(this.f3630z) || "All".equals(this.f3630z)) {
            this.f3630z = aba.m3772c((Context) this, this.f3598A);
        }
        Object arrayList = new ArrayList(Arrays.asList(abd.m3786a(this.f3605a, this.f3598A, "MY_ACCOUNT_NAMES", "Personal Expense").split(",")));
        int indexOf = arrayList.indexOf(this.f3630z);
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903149, arrayList);
        arrayAdapter.setDropDownViewResource(2130903150);
        OnNavigationListener com_expensemanager_afs = new afs(this, arrayList);
        getActionBar().setNavigationMode(1);
        getActionBar().setDisplayShowTitleEnabled(false);
        getActionBar().setListNavigationCallbacks(arrayAdapter, com_expensemanager_afs);
        getActionBar().setSelectedNavigationItem(indexOf);
        m3570a();
    }

    protected Dialog onCreateDialog(int i) {
        Calendar instance;
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                try {
                    return new DatePickerDialog(this, this.f3603F, this.f3625u, this.f3626v, this.f3627w);
                } catch (Exception e) {
                    instance = Calendar.getInstance();
                    return new DatePickerDialog(this, this.f3603F, instance.get(1), instance.get(2), instance.get(5));
                }
            case C0607c.LoadingImageView_circleCrop /*2*/:
                try {
                    return new TimePickerDialog(this, this.f3604G, this.f3628x, this.f3629y, false);
                } catch (Exception e2) {
                    instance = Calendar.getInstance();
                    return new TimePickerDialog(this, this.f3604G, instance.get(11), instance.get(12), false);
                }
            default:
                return null;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 1, 0, 2131100065).setIcon(2130837591).setShowAsAction(2);
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            setResult(-1, new Intent(this.f3605a, ExpenseManager.class));
            finish();
        }
        return false;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                m3573a(getIntent().getStringExtra("fromWhere"));
                return true;
            case 16908332:
                dispatchKeyEvent(new KeyEvent(0, 4));
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                try {
                    ((DatePickerDialog) dialog).updateDate(this.f3625u, this.f3626v, this.f3627w);
                } catch (Exception e) {
                    Calendar instance = Calendar.getInstance();
                    ((DatePickerDialog) dialog).updateDate(instance.get(1), instance.get(2), instance.get(5));
                }
            default:
        }
    }
}
