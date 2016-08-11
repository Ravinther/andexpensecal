package com.expensemanager;

import android.app.ActionBar.OnNavigationListener;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.method.TextKeyListener;
import android.text.method.TextKeyListener.Capitalize;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class DebtAddEdit extends Activity {
    private Context f2654a;
    private TextView f2655b;
    private TextView f2656c;
    private TextView f2657d;
    private TextView f2658e;
    private TextView f2659f;
    private EditText f2660g;
    private AutoCompleteTextView f2661h;
    private EditText f2662i;
    private AutoCompleteTextView f2663j;
    private Button f2664k;
    private ImageButton f2665l;
    private Bitmap f2666m;
    private boolean f2667n;
    private TextView f2668o;
    private TextView f2669p;
    private EditText f2670q;
    private String f2671r;
    private ro f2672s;
    private String f2673t;

    public DebtAddEdit() {
        this.f2654a = this;
        this.f2667n = false;
        this.f2671r = "Personal Expense";
        this.f2673t = "$Debt";
    }

    private void m2574a() {
        CharSequence string;
        String string2;
        String[] split;
        String[] split2;
        String stringExtra = getIntent().getStringExtra("fromWhere");
        this.f2655b = (TextView) findViewById(2131558530);
        ImageButton imageButton = (ImageButton) findViewById(2131558529);
        this.f2657d = (TextView) findViewById(2131558476);
        this.f2657d.setText(this.f2671r);
        ((ImageButton) findViewById(2131558475)).setOnClickListener(new dy(this));
        Object stringExtra2 = getIntent().getStringExtra("category");
        this.f2658e = (TextView) findViewById(2131558543);
        ((ImageButton) findViewById(2131558542)).setOnClickListener(new dz(this));
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        if (stringExtra2 == null || !stringExtra2.startsWith("Income")) {
            string = sharedPreferences.getString("DEFAULT_DEBT_EXPENSE_CATEGORY", null);
            if (string != null) {
                this.f2658e.setText(string);
            }
            this.f2658e.setTextColor(co.f4428b);
        } else {
            string = sharedPreferences.getString("DEFAULT_DEBT_INCOME_CATEGORY", null);
            if (string != null) {
                this.f2658e.setText(string);
            } else {
                this.f2658e.setText(stringExtra2);
            }
            this.f2658e.setTextColor(co.f4429c);
        }
        this.f2663j = (AutoCompleteTextView) findViewById(2131558522);
        String str = "PAYEE_LIST";
        Object[] objArr = ExpensePayList.f3360a;
        if (stringExtra2 != null && stringExtra2.startsWith("Income")) {
            str = "PAYER_LIST";
            objArr = ExpensePayList.f3361b;
        }
        str = abd.m3786a(this.f2654a, this.f2672s, str, "");
        if (!(str == null || "".equals(str))) {
            objArr = str.split(",");
        }
        if (objArr != null && objArr.length > 0) {
            this.f2663j.setAdapter(new ArrayAdapter(this, 17367057, objArr));
        }
        ImageButton imageButton2 = (ImageButton) findViewById(2131558521);
        this.f2668o = (TextView) findViewById(2131558520);
        this.f2668o.setText(getIntent().getIntExtra("action", -1));
        if (getIntent().getIntExtra("action", -1) == 2131099944 || getIntent().getIntExtra("action", -1) == 2131100003) {
            this.f2668o.setTextColor(co.f4428b);
        }
        if (getIntent().getIntExtra("action", -1) == 2131099741 || getIntent().getIntExtra("action", -1) == 2131100038) {
            this.f2668o.setTextColor(co.f4429c);
        }
        str = Build.MANUFACTURER;
        if (str != null) {
            str = str.toUpperCase();
        }
        String str2 = Build.MODEL;
        if (str2 != null) {
            str2 = str2.toUpperCase();
        }
        if (!(str.indexOf("SONY") == -1 && r3.indexOf("XPERIA") == -1)) {
            imageButton2.setVisibility(4);
        }
        imageButton2.setOnClickListener(new ea(this));
        CharSequence string3 = sharedPreferences.getString(this.f2671r + "_" + "PAYMENT_METHOD_KEY", null);
        this.f2659f = (TextView) findViewById(2131558547);
        if (string3 == null) {
            string2 = getResources().getString(2131100012);
            str = abd.m3786a(this.f2654a, this.f2672s, "PAYMENT_METHOD_KEY", string2);
            if (!str.equals("")) {
                string2 = str;
            }
            split = string2.split(",");
            if (split != null && split.length > 0) {
                this.f2659f.setText(split[0]);
            }
        } else {
            this.f2659f.setText(string3);
        }
        ((ImageButton) findViewById(2131558546)).setOnClickListener(new eb(this));
        this.f2660g = (EditText) findViewById(2131558526);
        ((ImageButton) findViewById(2131558525)).setOnClickListener(new ec(this));
        this.f2661h = (AutoCompleteTextView) findViewById(2131558537);
        List a = abd.m3798a(this.f2672s, "account='" + this.f2671r + "'", "description");
        split = (String[]) a.toArray(new String[a.size()]);
        if (split != null && split.length > 0) {
            this.f2661h.setAdapter(new ArrayAdapter(this, 17367057, split));
        }
        this.f2661h.setKeyListener(TextKeyListener.getInstance(true, Capitalize.NONE));
        this.f2662i = (EditText) findViewById(2131558548);
        String[] split3 = abd.m3786a(this.f2654a, this.f2672s, "TRANSACTION_STATUS_KEY", getResources().getString(2131100103)).split(",");
        this.f2664k = (Button) findViewById(2131558549);
        if (split3 != null && split3.length > 0) {
            this.f2664k.setText(split3[0]);
            ArrayList arrayList = new ArrayList(Arrays.asList(split3));
            if ("Cash".equalsIgnoreCase(this.f2659f.getText().toString()) && arrayList.contains("Cleared")) {
                this.f2664k.setText("Cleared");
            }
        }
        this.f2664k.setOnClickListener(new ed(this));
        this.f2665l = (ImageButton) findViewById(2131558535);
        this.f2665l.setOnClickListener(new ee(this));
        imageButton2 = (ImageButton) findViewById(2131558533);
        this.f2656c = (TextView) findViewById(2131558534);
        Calendar instance = Calendar.getInstance();
        instance.add(1, 1);
        this.f2656c.setText(new SimpleDateFormat(ExpenseManager.f3244t).format(instance.getTime()));
        this.f2655b.setText(new SimpleDateFormat(ExpenseManager.f3244t).format(new Date()));
        OnClickListener ehVar = new eh(this);
        imageButton.setOnClickListener(ehVar);
        imageButton2.setOnClickListener(ehVar);
        this.f2669p = (TextView) findViewById(2131558553);
        ((ImageButton) findViewById(2131558552)).setOnClickListener(new dq(this));
        this.f2670q = (EditText) findViewById(2131558557);
        ((ImageButton) findViewById(2131558556)).setOnClickListener(new dr(this));
        SharedPreferences sharedPreferences2 = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558539);
        TextView textView = (TextView) findViewById(2131558538);
        textView.setOnClickListener(new ds(this, sharedPreferences2, textView, linearLayout));
        if (sharedPreferences2.getBoolean(this.f2671r + "_isOption", false)) {
            linearLayout.setVisibility(0);
            textView.setText(getResources().getString(2131099918));
        }
        if ((getResources().getConfiguration().screenLayout & 15) == 4 || (getResources().getConfiguration().screenLayout & 15) == 3) {
            linearLayout.setVisibility(0);
            textView.setVisibility(8);
        }
        Button button = (Button) findViewById(2131558560);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new dt(this, stringExtra));
        button = (Button) findViewById(2131558559);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new du(this));
        float f = getResources().getDisplayMetrics().density;
        button = (Button) findViewById(2131558558);
        aib.m3858a((Context) this, button, 2130837530);
        button.setOnClickListener(new dv(this));
        if ("Edit".equalsIgnoreCase(stringExtra)) {
            try {
                this.f2668o.setEnabled(false);
                this.f2668o.setText(getIntent().getIntExtra("action", -1));
                if (getIntent().getIntExtra("action", -1) == 2131099944 || getIntent().getIntExtra("action", -1) == 2131100003) {
                    this.f2668o.setTextColor(co.f4428b);
                }
                if (getIntent().getIntExtra("action", -1) == 2131099741 || getIntent().getIntExtra("action", -1) == 2131100038) {
                    this.f2668o.setTextColor(co.f4429c);
                }
                Map a2 = ExpenseNewAccount.m3276a(this.f2672s, getIntent().getLongExtra("rowId", -1));
                this.f2655b.setText((CharSequence) a2.get("date"));
                string2 = aib.m3865b((String) a2.get("category"));
                if (!(a2.get("subcategory") == null || "".equals(a2.get("subcategory")))) {
                    string2 = string2 + ":" + ((String) a2.get("subcategory"));
                }
                this.f2658e.setText(aib.m3865b(string2));
                if (string2.startsWith("Income")) {
                    this.f2658e.setTextColor(co.f4429c);
                } else {
                    this.f2658e.setTextColor(co.f4428b);
                }
                this.f2663j.setText(aib.m3865b((String) a2.get("property")));
                this.f2657d.setText(aib.m3865b((String) a2.get("account")));
                string = aib.m3853a((String) a2.get("amount")).replaceAll(",", "").replace("+", "");
                if (string.startsWith("(")) {
                    string = aba.m3782h(string);
                }
                this.f2660g.setText(string);
                Object replaceAll = aib.m3865b((String) a2.get("description")).replaceAll("\u2605", "");
                this.f2661h.setText(replaceAll);
                this.f2662i.setText(aib.m3865b((String) a2.get("referenceNumber")));
                this.f2663j.setText(aib.m3865b((String) a2.get("property")));
                string = (String) a2.get("status");
                if ((string == null || "".equals(string)) && split3 != null) {
                    string = split3[0];
                }
                this.f2664k.setText(string);
                this.f2659f.setText(aib.m3865b((String) a2.get("paymentMethod")));
                button.setVisibility(0);
                if (replaceAll == null || !replaceAll.startsWith("Repeating:")) {
                    this.f2661h.setEnabled(true);
                } else {
                    this.f2661h.setEnabled(false);
                }
                String str3 = (String) a2.get("property2");
                if (!(str3 == null || "".equals(str3))) {
                    File file = new File(co.f4431e + str3);
                    if (file.exists()) {
                        this.f2666m = AttachPicture.m2370a(file, Math.round(60.0f * f));
                        if (this.f2666m != null) {
                            this.f2666m = Bitmap.createScaledBitmap(this.f2666m, Math.round(55.0f * f), Math.round(f * 65.0f), false);
                            this.f2665l.setImageBitmap(this.f2666m);
                        }
                    }
                }
                this.f2669p.setText(aib.m3865b((String) a2.get("tag")));
                str3 = getIntent().getStringExtra("dueDate");
                this.f2656c.setText(aib.m3867b(str3, "yyyy-MM-dd", ExpenseManager.f3244t));
                split2 = str3.split(":");
                if (split2.length > 1) {
                    this.f2656c.setText(aib.m3867b(split2[1], "yyyy-MM-dd", ExpenseManager.f3244t));
                }
                this.f2670q.setText(aib.m3865b((String) a2.get("tax")));
                this.f2673t = aib.m3865b((String) a2.get("property3"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if ("payment".equalsIgnoreCase(stringExtra)) {
            this.f2668o.setEnabled(false);
            this.f2668o.setText(getIntent().getIntExtra("action", -1));
            if (getIntent().getIntExtra("action", -1) == 2131099944 || getIntent().getIntExtra("action", -1) == 2131100003) {
                this.f2668o.setTextColor(co.f4428b);
            }
            if (getIntent().getIntExtra("action", -1) == 2131099741 || getIntent().getIntExtra("action", -1) == 2131100038) {
                this.f2668o.setTextColor(co.f4429c);
            }
            this.f2663j.setText(getIntent().getStringExtra("property"));
            this.f2660g.setText(getIntent().getStringExtra("remainingAmount").replaceAll(",", ""));
            split2 = getIntent().getStringExtra("dueDate").split(":");
            if (split2.length > 1) {
                this.f2656c.setText(aib.m3867b(split2[1], "yyyy-MM-dd", ExpenseManager.f3244t));
            }
            this.f2669p.setText(getIntent().getStringExtra("rowIdStr"));
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(2131558531);
        if ("payment".equalsIgnoreCase(stringExtra) || ("edit".equalsIgnoreCase(stringExtra) && getIntent().getStringExtra("rowIdStr") != null)) {
            relativeLayout.setVisibility(8);
        }
    }

    private void m2575a(String str) {
        try {
            Double.valueOf(this.f2660g.getText().toString());
            if ("".equals(this.f2663j.getText().toString())) {
                aib.m3849a(this.f2654a, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099705), getResources().getString(2131099983), null, null, null).show();
                return;
            }
            String obj;
            boolean a;
            long j = 0;
            this.f2672s.m4193a();
            try {
                long j2;
                File file;
                this.f2671r = this.f2657d.getText().toString();
                obj = this.f2660g.getText().toString();
                if (obj != null) {
                    obj = obj.replaceAll(",", "");
                }
                String[] split = this.f2658e.getText().toString().split(":");
                String str2 = split[0];
                String str3 = "";
                if (split.length > 1) {
                    str3 = split[1];
                }
                String charSequence = this.f2659f.getText().toString();
                String a2 = aib.m3853a(this.f2661h.getText().toString());
                String obj2 = this.f2662i.getText().toString();
                String a3 = aib.m3853a(this.f2663j.getText().toString());
                String charSequence2 = this.f2664k.getText().toString();
                String str4 = "";
                Long valueOf = Long.valueOf(System.currentTimeMillis());
                j = abd.m3785a(this.f2655b.getText().toString(), ExpenseManager.f3244t, Locale.US);
                if (("Edit".equalsIgnoreCase(str) || "EditActivity".equalsIgnoreCase(str)) && this.f2666m != null) {
                    str4 = getIntent().getStringExtra("property2");
                }
                if (this.f2666m != null && this.f2667n) {
                    str4 = aba.m3749a(j, "yyyy-MM-dd-HH-mm-ss") + "-" + new Random().nextInt(1000) + ".jpg";
                }
                String charSequence3 = this.f2669p.getText().toString();
                if (!("".equals(this.f2656c.getText().toString()) || "payment".equalsIgnoreCase(str) || getIntent().getStringExtra("rowIdStr") != null)) {
                    charSequence3 = aib.m3867b(this.f2656c.getText().toString(), ExpenseManager.f3244t, "yyyy-MM-dd");
                }
                String obj3 = this.f2670q.getText().toString();
                if ("YES".equals(getIntent().getStringExtra("reminder")) && getIntent().getStringExtra("reminder_Id") != null) {
                    this.f2673t = getIntent().getStringExtra("reminder_Id");
                }
                ContentValues a4 = this.f2672s.m4190a(this.f2671r, obj, str2, str3, charSequence, a2, obj2, a3, charSequence2, str4, charSequence3, obj3, this.f2673t, "", "", j, valueOf.longValue());
                if ("Edit".equalsIgnoreCase(str) || "EditActivity".equalsIgnoreCase(str)) {
                    long longExtra = getIntent().getLongExtra("rowId", 0);
                    long j3 = longExtra;
                    a = this.f2672s.m4196a("expense_report", longExtra, a4);
                    j2 = j3;
                } else {
                    j2 = this.f2672s.m4185a("expense_report", a4);
                    a = true;
                }
                if (this.f2666m != null && this.f2667n) {
                    file = new File(co.f4431e + "tmp.jpg");
                    if (file.exists() && !"".equals(str4)) {
                        AttachPicture.m2371a(new File(co.f4431e + "tmp.jpg"));
                        file.renameTo(new File(co.f4431e + str4));
                    }
                }
                if (!(this.f2666m != null || j2 == -1 || "".equals(str4))) {
                    file = new File(co.f4431e + str4);
                    if (file.exists()) {
                        file.delete();
                    }
                }
                if ("Edit".equalsIgnoreCase(str)) {
                    m2576a(this.f2672s, "UPDATE expense_report SET property='" + a3 + "' where " + "expense_tag" + "='" + j2 + "'");
                }
            } catch (Exception e) {
                e.printStackTrace();
                a = false;
            }
            this.f2672s.m4201b();
            if (a) {
                abd.m3805a(this.f2654a, a);
                if (!("Edit".equalsIgnoreCase(str) || "EditActivity".equalsIgnoreCase(str))) {
                    new ej(this).execute(new Context[]{this.f2654a});
                }
                SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
                Editor edit = sharedPreferences.edit();
                String string = sharedPreferences.getString(this.f2671r + "_" + "PAYMENT_METHOD_KEY", null);
                obj = this.f2659f.getText().toString();
                if (!(obj == null || obj.equals(string))) {
                    edit.putString(this.f2671r + "_" + "PAYMENT_METHOD_KEY", obj);
                }
                string = this.f2658e.getText().toString();
                if (string == null || !string.startsWith("Income")) {
                    edit.putString("DEFAULT_DEBT_EXPENSE_CATEGORY", string);
                } else {
                    edit.putString("DEFAULT_DEBT_INCOME_CATEGORY", string);
                }
                edit.commit();
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putLong("date", j);
                bundle.putString("account", this.f2671r);
                bundle.putInt("position", getIntent().getIntExtra("position", 0));
                intent.putExtras(bundle);
                setResult(-1, intent);
                finish();
                return;
            }
            aib.m3849a(this.f2654a, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099715), getResources().getString(2131099983), null, null, null).show();
        } catch (Exception e2) {
            aib.m3849a(this.f2654a, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099718), getResources().getString(2131099983), null, null, null).show();
        }
    }

    public static boolean m2576a(ro roVar, String str) {
        boolean z = false;
        roVar.m4193a();
        try {
            roVar.m4194a(str);
            z = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        roVar.m4201b();
        return z;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        CharSequence charSequence = "";
        CharSequence charSequence2 = "";
        String str = "";
        CharSequence charSequence3 = "";
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = "";
        str = "";
        CharSequence charSequence7 = "";
        CharSequence charSequence8 = "";
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                charSequence = extras.getString("category");
                charSequence2 = extras.getString("account");
                extras.getString("date");
                charSequence3 = extras.getString("paymentMethod");
                charSequence4 = extras.getString("amount");
                charSequence5 = extras.getString("ref");
                charSequence6 = extras.getString("description");
                extras.getString("payee");
                charSequence7 = extras.getString("status");
                charSequence8 = extras.getString("tag");
            }
        }
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                if (-1 == i2 && charSequence2 != null && !"".equals(charSequence2)) {
                    this.f2657d.setText(charSequence2);
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if (-1 == i2) {
                    this.f2658e.setText(charSequence);
                }
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                if (-1 == i2 && intent != null) {
                    try {
                        Cursor query = getContentResolver().query(intent.getData(), null, null, null, null);
                        if (query != null && query.moveToFirst()) {
                            this.f2663j.setText(query.getString(query.getColumnIndex("display_name")));
                        }
                    } catch (Exception e) {
                    }
                }
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                if (-1 == i2) {
                    this.f2660g.setText(charSequence4);
                    if (charSequence5 != null) {
                        this.f2662i.setText(charSequence5);
                    }
                    if (charSequence6 != null) {
                        this.f2661h.setText(charSequence6);
                    }
                }
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                if (-1 == i2) {
                    this.f2659f.setText(charSequence3);
                    String[] split = abd.m3786a(this.f2654a, this.f2672s, "TRANSACTION_STATUS_KEY", getResources().getString(2131100103)).split(",");
                    if (split != null && split.length > 0) {
                        ArrayList arrayList = new ArrayList(Arrays.asList(split));
                        if ("Cash".equalsIgnoreCase(this.f2659f.getText().toString()) && arrayList.contains("Cleared")) {
                            this.f2664k.setText("Cleared");
                        }
                        if ("Credit Card".equalsIgnoreCase(this.f2659f.getText().toString()) && arrayList.contains("Uncleared")) {
                            this.f2664k.setText("Uncleared");
                        }
                    }
                }
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                if (-1 == i2) {
                    this.f2664k.setText(charSequence7);
                }
            case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                if (-1 == i2) {
                    float f = getResources().getDisplayMetrics().density;
                    AttachPicture.m2371a(new File(co.f4431e + "tmp.jpg"));
                    this.f2666m = AttachPicture.m2370a(new File(co.f4431e + "tmp.jpg"), Math.round(60.0f * f));
                    if (this.f2666m != null) {
                        this.f2666m = Bitmap.createScaledBitmap(this.f2666m, Math.round(55.0f * f), Math.round(f * 65.0f), false);
                        this.f2665l.setImageBitmap(this.f2666m);
                        this.f2667n = true;
                    }
                }
            case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                if (-1 == i2) {
                    this.f2669p.setText(charSequence8);
                }
            case adv.TitlePageIndicator_footerPadding /*10*/:
                if (-1 == i2) {
                    this.f2670q.setText(charSequence4);
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
        this.f2672s = new ro(this);
        setContentView(2130903066);
        setTitle(2131099799);
        this.f2671r = getIntent().getStringExtra("account");
        if (this.f2671r == null || "".equals(this.f2671r) || "All".equals(this.f2671r)) {
            this.f2671r = "$Debt";
        }
        Object arrayList = new ArrayList(Arrays.asList(abd.m3786a(this.f2654a, this.f2672s, "MY_ACCOUNT_NAMES", "Personal Expense").split(",")));
        arrayList.add(0, "$Debt");
        int indexOf = arrayList.indexOf(this.f2671r);
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903149, arrayList);
        arrayAdapter.setDropDownViewResource(2130903150);
        OnNavigationListener dpVar = new dp(this, arrayList);
        getActionBar().setNavigationMode(1);
        getActionBar().setDisplayShowTitleEnabled(false);
        getActionBar().setListNavigationCallbacks(arrayAdapter, dpVar);
        getActionBar().setSelectedNavigationItem(indexOf);
        m2574a();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 0, 0, 2131099726).setIcon(2130837591).setShowAsAction(2);
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            setResult(-1, new Intent(this.f2654a, ExpenseManager.class));
            finish();
        }
        return false;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                m2575a(getIntent().getStringExtra("fromWhere"));
                return true;
            case 16908332:
                dispatchKeyEvent(new KeyEvent(0, 4));
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
