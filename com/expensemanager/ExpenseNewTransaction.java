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
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.method.TextKeyListener;
import android.text.method.TextKeyListener.Capitalize;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
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

public class ExpenseNewTransaction extends Activity {
    private EditText f3327A;
    private EditText f3328B;
    private EditText f3329C;
    private String f3330D;
    private long f3331E;
    private OnDateSetListener f3332F;
    private OnTimeSetListener f3333G;
    private Context f3334a;
    private TextView f3335b;
    private TextView f3336c;
    private TextView f3337d;
    private TextView f3338e;
    private TextView f3339f;
    private EditText f3340g;
    private AutoCompleteTextView f3341h;
    private EditText f3342i;
    private AutoCompleteTextView f3343j;
    private Button f3344k;
    private ImageButton f3345l;
    private Bitmap f3346m;
    private boolean f3347n;
    private TextView f3348o;
    private EditText f3349p;
    private EditText f3350q;
    private Button f3351r;
    private int f3352s;
    private int f3353t;
    private int f3354u;
    private int f3355v;
    private int f3356w;
    private String f3357x;
    private ro f3358y;
    private EditText f3359z;

    public ExpenseNewTransaction() {
        this.f3334a = this;
        this.f3347n = false;
        this.f3357x = "Personal Expense";
        this.f3330D = "";
        this.f3331E = -1;
        this.f3332F = new xq(this);
        this.f3333G = new xr(this);
    }

    private void m3301a(String str) {
        try {
            String obj;
            boolean a;
            Double.valueOf(this.f3340g.getText().toString());
            long j = 0;
            this.f3358y.m4193a();
            try {
                File file;
                this.f3357x = this.f3337d.getText().toString();
                obj = this.f3340g.getText().toString();
                if (obj != null) {
                    obj = obj.replaceAll(",", "");
                }
                String[] split = this.f3338e.getText().toString().split(":");
                String str2 = split[0];
                String str3 = "";
                if (split.length > 1) {
                    str3 = split[1];
                }
                String charSequence = this.f3339f.getText().toString();
                String a2 = aib.m3853a(this.f3341h.getText().toString());
                String obj2 = this.f3342i.getText().toString();
                String a3 = aib.m3853a(this.f3343j.getText().toString());
                String charSequence2 = this.f3344k.getText().toString();
                String str4 = "";
                Long valueOf = Long.valueOf(System.currentTimeMillis());
                j = aba.m3744a(this.f3335b.getText().toString() + " " + this.f3336c.getText().toString(), ExpenseManager.f3244t + " HH:mm", Locale.US);
                if (("Edit".equalsIgnoreCase(str) || "EditActivity".equalsIgnoreCase(str)) && this.f3346m != null) {
                    str4 = getIntent().getStringExtra("property2");
                }
                if (this.f3346m != null && this.f3347n) {
                    str4 = aba.m3749a(j, "yyyy-MM-dd-HH-mm-ss") + "-" + new Random().nextInt(1000) + ".jpg";
                }
                String charSequence3 = this.f3348o.getText().toString();
                String obj3 = this.f3349p.getText().toString();
                if ("YES".equals(getIntent().getStringExtra("reminder")) && getIntent().getStringExtra("reminder_Id") != null) {
                    this.f3330D = getIntent().getStringExtra("reminder_Id");
                }
                String str5 = "";
                if (!"".equals(this.f3350q.getText().toString())) {
                    str5 = this.f3350q.getText().toString() + " " + this.f3351r.getText().toString();
                }
                ContentValues a4 = this.f3358y.m4190a(this.f3357x, obj, str2, str3, charSequence, a2, obj2, a3, charSequence2, str4, charSequence3, obj3, this.f3330D, str5, "", j, valueOf.longValue());
                long j2;
                if ("Edit".equalsIgnoreCase(str) || "EditActivity".equalsIgnoreCase(str)) {
                    long longExtra = getIntent().getLongExtra("rowId", 0);
                    long j3 = longExtra;
                    a = this.f3358y.m4196a("expense_report", longExtra, a4);
                    j2 = j3;
                } else {
                    j2 = this.f3358y.m4185a("expense_report", a4);
                    a = true;
                }
                if (this.f3346m != null && this.f3347n) {
                    file = new File(co.f4431e + "tmp.jpg");
                    if (file.exists() && !"".equals(str4)) {
                        AttachPicture.m2371a(new File(co.f4431e + "tmp.jpg"));
                        file.renameTo(new File(co.f4431e + str4));
                    }
                }
                if (!(this.f3346m != null || r4 == -1 || "".equals(str4))) {
                    file = new File(co.f4431e + str4);
                    if (file.exists()) {
                        file.delete();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                a = false;
            }
            this.f3358y.m4201b();
            if (a) {
                abd.m3805a(this.f3334a, a);
                new yf(this).execute(new Context[]{this.f3334a});
                SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
                String string = sharedPreferences.getString(this.f3357x + "_" + "PAYMENT_METHOD_KEY", null);
                obj = this.f3339f.getText().toString();
                if (!(obj == null || obj.equals(string))) {
                    Editor edit = sharedPreferences.edit();
                    edit.putString(this.f3357x + "_" + "PAYMENT_METHOD_KEY", obj);
                    edit.commit();
                }
                if ("OKNEW".equalsIgnoreCase(str)) {
                    Toast.makeText(this.f3334a, 2131100066, 1).show();
                    return;
                } else if ("widget".equalsIgnoreCase(str)) {
                    Toast.makeText(this.f3334a, 2131100066, 1).show();
                    finish();
                    return;
                } else {
                    Intent intent = new Intent();
                    Bundle bundle = new Bundle();
                    bundle.putLong("date", j);
                    bundle.putString("account", this.f3357x);
                    bundle.putInt("position", getIntent().getIntExtra("position", 0));
                    intent.putExtras(bundle);
                    setResult(-1, intent);
                    finish();
                    return;
                }
            }
            aib.m3849a(this.f3334a, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099715), getResources().getString(2131099983), null, null, null).show();
        } catch (Exception e2) {
            aib.m3849a(this.f3334a, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099718), getResources().getString(2131099983), null, null, null).show();
        }
    }

    private void m3302a(String str, boolean z) {
        Map a = ExpenseAutoFillAddEdit.m2770a(this.f3358y, "description='" + str + "'");
        if (a != null && a.size() > 0) {
            if (!z || "YES".equalsIgnoreCase((String) a.get("property"))) {
                this.f3338e.setText((CharSequence) a.get("categoryDisplay"));
                if ("".equals(this.f3340g.getText().toString())) {
                    this.f3340g.setText((CharSequence) a.get("amount"));
                }
                this.f3342i.setText((CharSequence) a.get("referenceNumber"));
                if (!"YES".equalsIgnoreCase((String) a.get("property"))) {
                    this.f3341h.setText((CharSequence) a.get("description"));
                }
                this.f3344k.setText((CharSequence) a.get("status"));
                this.f3339f.setText((CharSequence) a.get("paymentMethod"));
                this.f3343j.setText((CharSequence) a.get("payeePayer"));
            }
        }
    }

    private void m3303a(String[] strArr, TextView textView) {
        new Builder(this).setTitle(2131100026).setSingleChoiceItems(strArr, new ArrayList(Arrays.asList(strArr)).indexOf(textView.getText().toString()), new xx(this, strArr)).setPositiveButton(2131099983, new xv(this, textView)).setNegativeButton(2131099754, new xu(this, textView)).show();
    }

    private static String m3306b(int i) {
        return i >= 10 ? String.valueOf(i) : "0" + String.valueOf(i);
    }

    private void m3307b() {
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
        SharedPreferences sharedPreferences;
        LinearLayout linearLayout;
        Button button;
        float f;
        Button button2;
        Button button3;
        Button button4;
        Map a2;
        String b;
        CharSequence replace;
        Object replaceAll;
        File file;
        Bundle extras;
        CharSequence string2;
        CharSequence string3;
        String stringExtra = getIntent().getStringExtra("fromWhere");
        this.f3335b = (TextView) findViewById(2131558530);
        ((ImageButton) findViewById(2131558529)).setOnClickListener(new xj(this));
        this.f3336c = (TextView) findViewById(2131558690);
        this.f3336c.setText(aba.m3749a(System.currentTimeMillis(), "HH:mm"));
        this.f3336c.setPaintFlags(this.f3336c.getPaintFlags() | 8);
        this.f3336c.setOnClickListener(new xw(this));
        this.f3355v = aib.m3879k(aba.m3749a(System.currentTimeMillis(), "HH"));
        this.f3356w = aib.m3879k(aba.m3749a(System.currentTimeMillis(), "mm"));
        this.f3337d = (TextView) findViewById(2131558476);
        this.f3337d.setText(this.f3357x);
        ((ImageButton) findViewById(2131558475)).setOnClickListener(new xy(this));
        String stringExtra2 = getIntent().getStringExtra("category");
        this.f3338e = (TextView) findViewById(2131558543);
        ((ImageButton) findViewById(2131558542)).setOnClickListener(new xz(this, stringExtra2));
        if (stringExtra2 == null || !stringExtra2.startsWith("Income")) {
            this.f3338e.setTextColor(co.f4428b);
        } else {
            this.f3338e.setText(stringExtra2);
            this.f3338e.setTextColor(co.f4429c);
        }
        this.f3338e.setOnClickListener(new ya(this));
        if (!("Edit".equalsIgnoreCase(stringExtra) || "EditActivity".equalsIgnoreCase(stringExtra))) {
            TextView textView2 = (TextView) findViewById(2131558541);
            textView2.setPaintFlags(textView2.getPaintFlags() | 8);
            textView2.setOnClickListener(new yc(this));
        }
        this.f3343j = (AutoCompleteTextView) findViewById(2131558522);
        String str2 = "PAYEE_LIST";
        String[] strArr = ExpensePayList.f3360a;
        if (stringExtra2 != null && stringExtra2.startsWith("Income")) {
            str2 = "PAYER_LIST";
            strArr = ExpensePayList.f3361b;
        }
        str2 = abd.m3786a(this.f3334a, this.f3358y, str2, "");
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
            List a3 = abd.m3798a(this.f3358y, str, "property");
            if (!(asList == null || a3 == null)) {
                List arrayList2 = new ArrayList(asList);
                for (int i = 0; i < a3.size(); i++) {
                    if (!arrayList2.contains(a3.get(i))) {
                        arrayList2.add(a3.get(i));
                    }
                }
                objArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                if (objArr != null && objArr.length > 0) {
                    this.f3343j.setAdapter(new ArrayAdapter(this, 17367057, objArr));
                }
                this.f3343j.setOnItemClickListener(new yd(this, stringExtra));
                imageButton = (ImageButton) findViewById(2131558521);
                textView = (TextView) findViewById(2131558691);
                if (stringExtra2 == null && stringExtra2.startsWith("Income")) {
                    textView.setText(2131100009);
                } else {
                    textView.setText(2131100004);
                }
                imageButton.setOnClickListener(new ye(this, stringExtra2));
                instance = Calendar.getInstance();
                this.f3352s = instance.get(1);
                this.f3353t = instance.get(2);
                this.f3354u = instance.get(5);
                m3312c();
                string = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getString(this.f3357x + "_" + "PAYMENT_METHOD_KEY", null);
                this.f3339f = (TextView) findViewById(2131558547);
                if (string != null) {
                    str = getResources().getString(2131100012);
                    str2 = abd.m3786a(this.f3334a, this.f3358y, "PAYMENT_METHOD_KEY", str);
                    if (!str2.equals("")) {
                        str = str2;
                    }
                    strArr = str.split(",");
                    if (strArr != null && strArr.length > 0) {
                        this.f3339f.setText(strArr[0]);
                    }
                } else {
                    this.f3339f.setText(string);
                }
                ((ImageButton) findViewById(2131558546)).setOnClickListener(new wx(this));
                this.f3340g = (EditText) findViewById(2131558526);
                ((ImageButton) findViewById(2131558525)).setOnClickListener(new wy(this));
                if (getIntent().getStringExtra("amount") != null) {
                    this.f3340g.setText(getIntent().getStringExtra("amount"));
                }
                this.f3341h = (AutoCompleteTextView) findViewById(2131558537);
                a = abd.m3798a(this.f3358y, "account='" + this.f3357x + "'", "description");
                strArr = (String[]) a.toArray(new String[a.size()]);
                if (strArr != null && strArr.length > 0) {
                    this.f3341h.setAdapter(new ArrayAdapter(this, 17367057, strArr));
                }
                this.f3341h.setKeyListener(TextKeyListener.getInstance(true, Capitalize.NONE));
                this.f3342i = (EditText) findViewById(2131558548);
                split2 = abd.m3786a(this.f3334a, this.f3358y, "TRANSACTION_STATUS_KEY", getResources().getString(2131100103)).split(",");
                this.f3344k = (Button) findViewById(2131558549);
                if (split2 != null && split2.length > 0) {
                    this.f3344k.setText(split2[0]);
                    arrayList = new ArrayList(Arrays.asList(split2));
                    if ("Cash".equalsIgnoreCase(this.f3339f.getText().toString()) && arrayList.contains("Cleared")) {
                        this.f3344k.setText("Cleared");
                    }
                }
                this.f3344k.setOnClickListener(new wz(this));
                this.f3345l = (ImageButton) findViewById(2131558535);
                this.f3345l.setOnClickListener(new xa(this));
                this.f3348o = (TextView) findViewById(2131558553);
                ((ImageButton) findViewById(2131558552)).setOnClickListener(new xd(this));
                this.f3349p = (EditText) findViewById(2131558557);
                ((ImageButton) findViewById(2131558556)).setOnClickListener(new xe(this));
                this.f3350q = (EditText) findViewById(2131558695);
                this.f3351r = (Button) findViewById(2131558694);
                this.f3351r.setOnClickListener(new xf(this));
                sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
                linearLayout = (LinearLayout) findViewById(2131558539);
                textView = (TextView) findViewById(2131558538);
                textView.setOnClickListener(new xg(this, sharedPreferences, textView, linearLayout));
                if (sharedPreferences.getBoolean(this.f3357x + "_isOption", false)) {
                    linearLayout.setVisibility(0);
                    textView.setText(getResources().getString(2131099918));
                }
                if ((getResources().getConfiguration().screenLayout & 15) == 4 || (getResources().getConfiguration().screenLayout & 15) == 3) {
                    linearLayout.setVisibility(0);
                    textView.setVisibility(8);
                }
                button = (Button) findViewById(2131558560);
                aib.m3858a((Context) this, button, -1);
                button.setOnClickListener(new xh(this, stringExtra));
                button = (Button) findViewById(2131558559);
                aib.m3858a((Context) this, button, -1);
                button.setOnClickListener(new xi(this));
                f = getResources().getDisplayMetrics().density;
                button.setPadding((int) ((2.0d * ((double) f)) + 0.5d), (int) ((10.0d * ((double) f)) + 0.5d), (int) ((2.0d * ((double) f)) + 0.5d), (int) ((10.0d * ((double) f)) + 0.5d));
                button = (Button) findViewById(2131558558);
                aib.m3858a((Context) this, button, 2130837530);
                button.setOnClickListener(new xk(this));
                button2 = (Button) findViewById(2131558698);
                aib.m3858a((Context) this, button2, -1);
                button2.setOnClickListener(new xn(this));
                button3 = (Button) findViewById(2131558696);
                aib.m3858a((Context) this, button3, -1);
                button3.setOnClickListener(new xo(this));
                button4 = (Button) findViewById(2131558697);
                aib.m3858a((Context) this, button4, -1);
                button4.setOnClickListener(new xp(this));
                button4.setPadding((int) ((2.0d * ((double) f)) + 0.5d), (int) ((10.0d * ((double) f)) + 0.5d), (int) ((2.0d * ((double) f)) + 0.5d), (int) ((10.0d * ((double) f)) + 0.5d));
                if ("Edit".equalsIgnoreCase(stringExtra) || "EditActivity".equalsIgnoreCase(stringExtra)) {
                    setTitle(2131099863);
                    a2 = ExpenseNewAccount.m3276a(this.f3358y, getIntent().getLongExtra("rowId", -1));
                    this.f3335b.setText((CharSequence) a2.get("date"));
                    b = aib.m3865b((String) a2.get("category"));
                    if (!(a2.get("subcategory") == null || "".equals(a2.get("subcategory")))) {
                        b = b + ":" + ((String) a2.get("subcategory"));
                    }
                    this.f3338e.setText(aib.m3865b(b));
                    this.f3343j.setText(aib.m3865b((String) a2.get("property")));
                    this.f3337d.setText(aib.m3865b((String) a2.get("account")));
                    replace = aib.m3853a((String) a2.get("amount")).replaceAll(",", "").replace("+", "");
                    if (replace.startsWith("(")) {
                        replace = aba.m3782h(replace);
                    }
                    this.f3340g.setText(replace);
                    replaceAll = aib.m3865b((String) a2.get("description")).replaceAll("\u2605", "");
                    this.f3341h.setText(replaceAll);
                    this.f3342i.setText(aib.m3865b((String) a2.get("referenceNumber")));
                    this.f3343j.setText(aib.m3865b((String) a2.get("property")));
                    replace = (String) a2.get("status");
                    if ((replace == null || "".equals(replace)) && split2 != null) {
                        replace = split2[0];
                    }
                    this.f3344k.setText(replace);
                    this.f3339f.setText(aib.m3865b((String) a2.get("paymentMethod")));
                    button.setVisibility(0);
                    button2.setVisibility(0);
                    button4.setVisibility(8);
                    if (replaceAll == null && replaceAll.startsWith("Repeating:")) {
                        this.f3341h.setEnabled(false);
                    } else {
                        this.f3341h.setEnabled(true);
                    }
                    if (!(a2.get("date") == null || "".equals(a2.get("date")))) {
                        try {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
                            simpleDateFormat.setLenient(false);
                            instance.setTime(simpleDateFormat.parse((String) a2.get("date")));
                            this.f3352s = instance.get(1);
                            this.f3353t = instance.get(2);
                            this.f3354u = instance.get(5);
                            this.f3336c.setText(aba.m3749a(Long.parseLong((String) a2.get("dateLong")), "HH:mm"));
                            strArr = this.f3336c.getText().toString().split(":");
                            this.f3355v = aib.m3879k(strArr[0]);
                            this.f3356w = aib.m3879k(strArr[1]);
                        } catch (Exception e) {
                        }
                    }
                    str = (String) a2.get("property2");
                    if (!(str == null || "".equals(str))) {
                        file = new File(co.f4431e + str);
                        if (file.exists()) {
                            this.f3346m = AttachPicture.m2370a(file, Math.round(60.0f * f));
                            if (this.f3346m != null) {
                                this.f3346m = Bitmap.createScaledBitmap(this.f3346m, Math.round(55.0f * f), Math.round(65.0f * f), false);
                                this.f3345l.setImageBitmap(this.f3346m);
                            }
                        }
                    }
                    this.f3348o.setText(aib.m3865b((String) a2.get("tag")));
                    this.f3349p.setText(aib.m3865b((String) a2.get("tax")));
                    this.f3330D = aib.m3865b((String) a2.get("property3"));
                    strArr = ((String) a2.get("property4")).split(" ");
                    if (strArr.length > 0) {
                        this.f3350q.setText(strArr[0]);
                    }
                    if (strArr.length > 1) {
                        this.f3351r.setText(strArr[1]);
                    }
                    button3.setVisibility(8);
                    if (a2.get("dateLong") != null) {
                        this.f3331E = Long.parseLong((String) a2.get("dateLong"));
                    }
                }
                if ("tools".equalsIgnoreCase(stringExtra)) {
                    extras = getIntent().getExtras();
                    if (extras != null) {
                        string2 = extras.getString("amount");
                        string3 = extras.getString("ref");
                        string = extras.getString("description");
                        if (string2 != null && string2.trim().startsWith("-")) {
                            string2 = string2.replace("-", "");
                        }
                        this.f3340g.setText(string2);
                        if (string3 != null) {
                            this.f3342i.setText(string3);
                        }
                        if (string != null) {
                            this.f3341h.setText(string);
                        }
                    }
                }
                if ("YES".equals(getIntent().getStringExtra("reminder")) && !"Edit".equalsIgnoreCase(stringExtra)) {
                    m3309b(getIntent().getStringExtra("description"));
                }
                if ("widget".equalsIgnoreCase(getIntent().getStringExtra("fromWhere"))) {
                    str = sharedPreferences.getString("PREFILL", "");
                    if (!"".equals(str)) {
                        m3302a(str, false);
                    }
                }
                if ("widgetAdd".equalsIgnoreCase(getIntent().getStringExtra("fromWhere")) || (getIntent().getBooleanExtra("isSMS", false) && !"EditActivity".equalsIgnoreCase(stringExtra))) {
                    this.f3338e.setText(getIntent().getStringExtra("category"));
                    this.f3339f.setText(getIntent().getStringExtra("paymentMethod"));
                    this.f3343j.setText(getIntent().getStringExtra("payee"));
                    this.f3344k.setText(getIntent().getStringExtra("status"));
                    this.f3342i.setText(getIntent().getStringExtra("referenceNumber"));
                    this.f3341h.setText(getIntent().getStringExtra("description"));
                    this.f3348o.setText(getIntent().getStringExtra("tag"));
                    if (getIntent().getLongExtra("dateLong", 0) > 0) {
                        this.f3335b.setText(aba.m3749a(getIntent().getLongExtra("dateLong", 0), ExpenseManager.f3244t));
                        this.f3336c.setText(aba.m3749a(getIntent().getLongExtra("dateLong", 0), "HH:mm"));
                    }
                }
                if ("DailyViewNew".equals(stringExtra)) {
                    this.f3335b.setText(getIntent().getStringExtra("date"));
                    this.f3341h.setText(getIntent().getStringExtra("description"));
                    this.f3340g.setText(getIntent().getStringExtra("amount"));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        objArr = split;
        this.f3343j.setAdapter(new ArrayAdapter(this, 17367057, objArr));
        this.f3343j.setOnItemClickListener(new yd(this, stringExtra));
        imageButton = (ImageButton) findViewById(2131558521);
        textView = (TextView) findViewById(2131558691);
        if (stringExtra2 == null) {
        }
        textView.setText(2131100004);
        imageButton.setOnClickListener(new ye(this, stringExtra2));
        instance = Calendar.getInstance();
        this.f3352s = instance.get(1);
        this.f3353t = instance.get(2);
        this.f3354u = instance.get(5);
        m3312c();
        string = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getString(this.f3357x + "_" + "PAYMENT_METHOD_KEY", null);
        this.f3339f = (TextView) findViewById(2131558547);
        if (string != null) {
            this.f3339f.setText(string);
        } else {
            str = getResources().getString(2131100012);
            str2 = abd.m3786a(this.f3334a, this.f3358y, "PAYMENT_METHOD_KEY", str);
            if (str2.equals("")) {
                str = str2;
            }
            strArr = str.split(",");
            this.f3339f.setText(strArr[0]);
        }
        ((ImageButton) findViewById(2131558546)).setOnClickListener(new wx(this));
        this.f3340g = (EditText) findViewById(2131558526);
        ((ImageButton) findViewById(2131558525)).setOnClickListener(new wy(this));
        if (getIntent().getStringExtra("amount") != null) {
            this.f3340g.setText(getIntent().getStringExtra("amount"));
        }
        this.f3341h = (AutoCompleteTextView) findViewById(2131558537);
        a = abd.m3798a(this.f3358y, "account='" + this.f3357x + "'", "description");
        strArr = (String[]) a.toArray(new String[a.size()]);
        this.f3341h.setAdapter(new ArrayAdapter(this, 17367057, strArr));
        this.f3341h.setKeyListener(TextKeyListener.getInstance(true, Capitalize.NONE));
        this.f3342i = (EditText) findViewById(2131558548);
        split2 = abd.m3786a(this.f3334a, this.f3358y, "TRANSACTION_STATUS_KEY", getResources().getString(2131100103)).split(",");
        this.f3344k = (Button) findViewById(2131558549);
        this.f3344k.setText(split2[0]);
        arrayList = new ArrayList(Arrays.asList(split2));
        this.f3344k.setText("Cleared");
        this.f3344k.setOnClickListener(new wz(this));
        this.f3345l = (ImageButton) findViewById(2131558535);
        this.f3345l.setOnClickListener(new xa(this));
        this.f3348o = (TextView) findViewById(2131558553);
        ((ImageButton) findViewById(2131558552)).setOnClickListener(new xd(this));
        this.f3349p = (EditText) findViewById(2131558557);
        ((ImageButton) findViewById(2131558556)).setOnClickListener(new xe(this));
        this.f3350q = (EditText) findViewById(2131558695);
        this.f3351r = (Button) findViewById(2131558694);
        this.f3351r.setOnClickListener(new xf(this));
        sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        linearLayout = (LinearLayout) findViewById(2131558539);
        textView = (TextView) findViewById(2131558538);
        textView.setOnClickListener(new xg(this, sharedPreferences, textView, linearLayout));
        if (sharedPreferences.getBoolean(this.f3357x + "_isOption", false)) {
            linearLayout.setVisibility(0);
            textView.setText(getResources().getString(2131099918));
        }
        linearLayout.setVisibility(0);
        textView.setVisibility(8);
        button = (Button) findViewById(2131558560);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new xh(this, stringExtra));
        button = (Button) findViewById(2131558559);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new xi(this));
        f = getResources().getDisplayMetrics().density;
        button.setPadding((int) ((2.0d * ((double) f)) + 0.5d), (int) ((10.0d * ((double) f)) + 0.5d), (int) ((2.0d * ((double) f)) + 0.5d), (int) ((10.0d * ((double) f)) + 0.5d));
        button = (Button) findViewById(2131558558);
        aib.m3858a((Context) this, button, 2130837530);
        button.setOnClickListener(new xk(this));
        button2 = (Button) findViewById(2131558698);
        aib.m3858a((Context) this, button2, -1);
        button2.setOnClickListener(new xn(this));
        button3 = (Button) findViewById(2131558696);
        aib.m3858a((Context) this, button3, -1);
        button3.setOnClickListener(new xo(this));
        button4 = (Button) findViewById(2131558697);
        aib.m3858a((Context) this, button4, -1);
        button4.setOnClickListener(new xp(this));
        button4.setPadding((int) ((2.0d * ((double) f)) + 0.5d), (int) ((10.0d * ((double) f)) + 0.5d), (int) ((2.0d * ((double) f)) + 0.5d), (int) ((10.0d * ((double) f)) + 0.5d));
        setTitle(2131099863);
        a2 = ExpenseNewAccount.m3276a(this.f3358y, getIntent().getLongExtra("rowId", -1));
        this.f3335b.setText((CharSequence) a2.get("date"));
        b = aib.m3865b((String) a2.get("category"));
        b = b + ":" + ((String) a2.get("subcategory"));
        this.f3338e.setText(aib.m3865b(b));
        this.f3343j.setText(aib.m3865b((String) a2.get("property")));
        this.f3337d.setText(aib.m3865b((String) a2.get("account")));
        replace = aib.m3853a((String) a2.get("amount")).replaceAll(",", "").replace("+", "");
        if (replace.startsWith("(")) {
            replace = aba.m3782h(replace);
        }
        this.f3340g.setText(replace);
        replaceAll = aib.m3865b((String) a2.get("description")).replaceAll("\u2605", "");
        this.f3341h.setText(replaceAll);
        this.f3342i.setText(aib.m3865b((String) a2.get("referenceNumber")));
        this.f3343j.setText(aib.m3865b((String) a2.get("property")));
        replace = (String) a2.get("status");
        replace = split2[0];
        this.f3344k.setText(replace);
        this.f3339f.setText(aib.m3865b((String) a2.get("paymentMethod")));
        button.setVisibility(0);
        button2.setVisibility(0);
        button4.setVisibility(8);
        if (replaceAll == null) {
        }
        try {
            this.f3341h.setEnabled(true);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(ExpenseManager.f3244t);
            simpleDateFormat2.setLenient(false);
            instance.setTime(simpleDateFormat2.parse((String) a2.get("date")));
            this.f3352s = instance.get(1);
            this.f3353t = instance.get(2);
            this.f3354u = instance.get(5);
            this.f3336c.setText(aba.m3749a(Long.parseLong((String) a2.get("dateLong")), "HH:mm"));
            strArr = this.f3336c.getText().toString().split(":");
            this.f3355v = aib.m3879k(strArr[0]);
            this.f3356w = aib.m3879k(strArr[1]);
            str = (String) a2.get("property2");
            file = new File(co.f4431e + str);
            if (file.exists()) {
                this.f3346m = AttachPicture.m2370a(file, Math.round(60.0f * f));
                if (this.f3346m != null) {
                    this.f3346m = Bitmap.createScaledBitmap(this.f3346m, Math.round(55.0f * f), Math.round(65.0f * f), false);
                    this.f3345l.setImageBitmap(this.f3346m);
                }
            }
            this.f3348o.setText(aib.m3865b((String) a2.get("tag")));
            this.f3349p.setText(aib.m3865b((String) a2.get("tax")));
            this.f3330D = aib.m3865b((String) a2.get("property3"));
            strArr = ((String) a2.get("property4")).split(" ");
            if (strArr.length > 0) {
                this.f3350q.setText(strArr[0]);
            }
            if (strArr.length > 1) {
                this.f3351r.setText(strArr[1]);
            }
            button3.setVisibility(8);
            if (a2.get("dateLong") != null) {
                this.f3331E = Long.parseLong((String) a2.get("dateLong"));
            }
        } catch (Exception e22) {
            e22.printStackTrace();
        }
        if ("tools".equalsIgnoreCase(stringExtra)) {
            extras = getIntent().getExtras();
            if (extras != null) {
                string2 = extras.getString("amount");
                string3 = extras.getString("ref");
                string = extras.getString("description");
                string2 = string2.replace("-", "");
                this.f3340g.setText(string2);
                if (string3 != null) {
                    this.f3342i.setText(string3);
                }
                if (string != null) {
                    this.f3341h.setText(string);
                }
            }
        }
        m3309b(getIntent().getStringExtra("description"));
        if ("widget".equalsIgnoreCase(getIntent().getStringExtra("fromWhere"))) {
            str = sharedPreferences.getString("PREFILL", "");
            if ("".equals(str)) {
                m3302a(str, false);
            }
        }
        this.f3338e.setText(getIntent().getStringExtra("category"));
        this.f3339f.setText(getIntent().getStringExtra("paymentMethod"));
        this.f3343j.setText(getIntent().getStringExtra("payee"));
        this.f3344k.setText(getIntent().getStringExtra("status"));
        this.f3342i.setText(getIntent().getStringExtra("referenceNumber"));
        this.f3341h.setText(getIntent().getStringExtra("description"));
        this.f3348o.setText(getIntent().getStringExtra("tag"));
        if (getIntent().getLongExtra("dateLong", 0) > 0) {
            this.f3335b.setText(aba.m3749a(getIntent().getLongExtra("dateLong", 0), ExpenseManager.f3244t));
            this.f3336c.setText(aba.m3749a(getIntent().getLongExtra("dateLong", 0), "HH:mm"));
        }
        if ("DailyViewNew".equals(stringExtra)) {
            this.f3335b.setText(getIntent().getStringExtra("date"));
            this.f3341h.setText(getIntent().getStringExtra("description"));
            this.f3340g.setText(getIntent().getStringExtra("amount"));
        }
    }

    private void m3309b(String str) {
        String str2 = "description='" + str + "' AND " + "category" + "!='Account Transfer'" + " AND " + "property2" + " LIKE 'Reminder%'";
        List arrayList = new ArrayList();
        aba.m3760a(this.f3334a, this.f3358y, str2, arrayList);
        if (arrayList != null && arrayList.size() != 0) {
            Map map = (Map) arrayList.get(0);
            if (map != null && map.size() > 0) {
                this.f3337d.setText((CharSequence) map.get("account"));
                this.f3338e.setText((CharSequence) map.get("category"));
                CharSequence charSequence = (String) map.get("expenseAmount");
                if (charSequence != null) {
                    charSequence = charSequence.replaceAll(",", "");
                }
                this.f3340g.setText(charSequence);
                this.f3342i.setText((CharSequence) map.get("referenceNumber"));
                this.f3344k.setText((CharSequence) map.get("status"));
                this.f3339f.setText((CharSequence) map.get("paymentMethod"));
                this.f3343j.setText((CharSequence) map.get("property"));
                this.f3341h.setText("Reminder:" + ((String) map.get("description")));
                this.f3341h.setEnabled(false);
                this.f3349p.setText((CharSequence) map.get("property3"));
            }
        }
    }

    private void m3312c() {
        this.f3335b.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f3352s + "-" + (this.f3353t + 1) + "-" + this.f3354u));
    }

    private LinearLayout m3314d() {
        CharSequence a = abd.m3786a(this.f3334a, this.f3358y, "MILEAGE_CONVERSION", null);
        xt xtVar = new xt(this);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(5, 5, 5, 5);
        View textView = new TextView(this);
        textView.setText(2131099950);
        textView.setTextSize(16.0f);
        textView.setPadding(5, 0, 0, 0);
        this.f3359z = new EditText(this);
        this.f3359z.setInputType(8195);
        this.f3359z.setFilters(new InputFilter[]{xtVar});
        View textView2 = new TextView(this);
        textView2.setText(2131099952);
        textView2.setTextSize(16.0f);
        textView2.setPadding(5, 0, 0, 0);
        this.f3327A = new EditText(this);
        this.f3327A.setInputType(8195);
        this.f3327A.setFilters(new InputFilter[]{xtVar});
        this.f3327A.setText(a);
        View textView3 = new TextView(this);
        textView3.setText(2131099910);
        textView3.setTextSize(16.0f);
        textView3.setPadding(5, 0, 0, 0);
        this.f3328B = new EditText(this);
        View textView4 = new TextView(this);
        textView4.setText(2131100130);
        textView4.setTextSize(16.0f);
        textView4.setPadding(5, 0, 0, 0);
        this.f3329C = new EditText(this);
        View textView5 = new TextView(this);
        textView5.setText(2131099953);
        linearLayout.addView(textView, new LayoutParams(-1, -2));
        linearLayout.addView(this.f3359z, new LayoutParams(-1, -2));
        linearLayout.addView(textView2, new LayoutParams(-1, -2));
        linearLayout.addView(this.f3327A, new LayoutParams(-1, -2));
        linearLayout.addView(textView3, new LayoutParams(-1, -2));
        linearLayout.addView(this.f3328B, new LayoutParams(-1, -2));
        linearLayout.addView(textView4, new LayoutParams(-1, -2));
        linearLayout.addView(this.f3329C, new LayoutParams(-1, -2));
        linearLayout.addView(textView5, new LayoutParams(-1, -2));
        return linearLayout;
    }

    public void m3334a() {
        OnClickListener xsVar = new xs(this);
        aib.m3849a(this, m3314d(), getResources().getString(2131099951), 17301659, null, getResources().getString(2131099983), xsVar, getResources().getString(2131099754), null).show();
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
                    this.f3337d.setText(charSequence2);
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if (-1 == i2) {
                    this.f3338e.setText(charSequence);
                }
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                if (-1 == i2) {
                    this.f3343j.setText(charSequence6);
                    str = getIntent().getStringExtra("fromWhere");
                    if (!"Edit".equalsIgnoreCase(str) && !"EditActivity".equalsIgnoreCase(str)) {
                        m3302a(this.f3343j.getText().toString(), true);
                    }
                }
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                if (-1 == i2) {
                    this.f3340g.setText(charSequence4);
                    if (charSequence5 != null) {
                        this.f3342i.setText(charSequence5);
                    }
                    if (str2 != null) {
                        this.f3341h.setText(str2);
                    }
                }
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                if (-1 == i2) {
                    this.f3339f.setText(charSequence3);
                    String[] split = abd.m3786a(this.f3334a, this.f3358y, "TRANSACTION_STATUS_KEY", getResources().getString(2131100103)).split(",");
                    if (split != null && split.length > 0) {
                        ArrayList arrayList = new ArrayList(Arrays.asList(split));
                        if ("Cash".equalsIgnoreCase(this.f3339f.getText().toString()) && arrayList.contains("Cleared")) {
                            this.f3344k.setText("Cleared");
                        }
                        if ("Credit Card".equalsIgnoreCase(this.f3339f.getText().toString()) && arrayList.contains("Uncleared")) {
                            this.f3344k.setText("Uncleared");
                        }
                    }
                }
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                if (-1 == i2) {
                    this.f3344k.setText(charSequence7);
                }
            case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                if (-1 == i2) {
                    float f = getResources().getDisplayMetrics().density;
                    AttachPicture.m2371a(new File(co.f4431e + "tmp.jpg"));
                    this.f3346m = AttachPicture.m2370a(new File(co.f4431e + "tmp.jpg"), Math.round(60.0f * f));
                    if (this.f3346m != null) {
                        this.f3346m = Bitmap.createScaledBitmap(this.f3346m, Math.round(55.0f * f), Math.round(f * 65.0f), false);
                        this.f3345l.setImageBitmap(this.f3346m);
                        this.f3347n = true;
                    }
                }
            case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                if (-1 == i2) {
                    m3302a(str2, false);
                }
            case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                if (-1 == i2) {
                    this.f3348o.setText(charSequence8);
                }
            case adv.TitlePageIndicator_footerPadding /*10*/:
                if (-1 == i2) {
                    this.f3349p.setText(charSequence4);
                }
            case adv.TitlePageIndicator_linePosition /*11*/:
                if (-1 == i2) {
                    this.f3351r.setText(charSequence9);
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
        if (!"widget".equalsIgnoreCase(getIntent().getStringExtra("fromWhere"))) {
            getWindow().setSoftInputMode(3);
        }
        this.f3358y = new ro(this);
        setContentView(2130903082);
        this.f3357x = getIntent().getStringExtra("account");
        if (this.f3357x == null || "".equals(this.f3357x) || "All".equals(this.f3357x)) {
            this.f3357x = aba.m3772c((Context) this, this.f3358y);
        }
        Object arrayList = new ArrayList(Arrays.asList(abd.m3786a(this.f3334a, this.f3358y, "MY_ACCOUNT_NAMES", "Personal Expense").split(",")));
        int indexOf = arrayList.indexOf(this.f3357x);
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903149, arrayList);
        arrayAdapter.setDropDownViewResource(2130903150);
        OnNavigationListener wwVar = new ww(this, arrayList);
        getActionBar().setNavigationMode(1);
        getActionBar().setDisplayShowTitleEnabled(false);
        getActionBar().setListNavigationCallbacks(arrayAdapter, wwVar);
        getActionBar().setSelectedNavigationItem(indexOf);
        m3307b();
    }

    protected Dialog onCreateDialog(int i) {
        Calendar instance;
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                try {
                    return new DatePickerDialog(this, this.f3332F, this.f3352s, this.f3353t, this.f3354u);
                } catch (Exception e) {
                    instance = Calendar.getInstance();
                    return new DatePickerDialog(this, this.f3332F, instance.get(1), instance.get(2), instance.get(5));
                }
            case C0607c.LoadingImageView_circleCrop /*2*/:
                try {
                    return new TimePickerDialog(this, this.f3333G, this.f3355v, this.f3356w, false);
                } catch (Exception e2) {
                    instance = Calendar.getInstance();
                    return new TimePickerDialog(this, this.f3333G, instance.get(11), instance.get(12), false);
                }
            default:
                return null;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492866, menu);
        if (getIntent().getStringExtra("category") == null || !getIntent().getStringExtra("category").startsWith("Income")) {
            menu.findItem(2131559149).setTitle(2131099696);
        } else {
            menu.findItem(2131559149).setTitle(2131099695);
        }
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            setResult(-1, new Intent(this.f3334a, ExpenseManager.class));
            finish();
        }
        return false;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intent;
        Bundle bundle;
        switch (menuItem.getItemId()) {
            case 16908332:
                dispatchKeyEvent(new KeyEvent(0, 4));
                return true;
            case 2131558449:
                m3301a(getIntent().getStringExtra("fromWhere"));
                return true;
            case 2131559120:
                intent = new Intent(this, ExpenseRepeatingTransferList.class);
                bundle = new Bundle();
                bundle.putString("account", this.f3357x);
                intent.putExtras(bundle);
                startActivityForResult(intent, 0);
                return true;
            case 2131559121:
                startActivityForResult(new Intent(this.f3334a, CurrencyConverter.class), 4);
                return true;
            case 2131559147:
                intent = new Intent(this, ExpenseManager.class);
                bundle = new Bundle();
                bundle.putString("account", this.f3357x);
                intent.putExtras(bundle);
                startActivity(intent);
                return true;
            case 2131559148:
                m3334a();
                return true;
            case 2131559149:
                String stringExtra = getIntent().getStringExtra("category");
                if (stringExtra == null || !stringExtra.startsWith("Income")) {
                    getIntent().putExtra("category", "Income");
                    menuItem.setTitle(2131099695);
                } else {
                    getIntent().removeExtra("category");
                    menuItem.setTitle(2131099696);
                }
                onCreate(null);
                return true;
            case 2131559150:
                intent = new Intent(this, ExpenseAutoFillList.class);
                bundle = new Bundle();
                bundle.putString("account", this.f3357x);
                bundle.putString("categoryDisplay", this.f3338e.getText().toString());
                intent.putExtras(bundle);
                startActivityForResult(intent, 8);
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                try {
                    ((DatePickerDialog) dialog).updateDate(this.f3352s, this.f3353t, this.f3354u);
                } catch (Exception e) {
                    Calendar instance = Calendar.getInstance();
                    ((DatePickerDialog) dialog).updateDate(instance.get(1), instance.get(2), instance.get(5));
                }
            default:
        }
    }
}
