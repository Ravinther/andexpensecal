package com.expensemanager;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.C0607c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class ExpenseMileageNewEdit extends Activity {
    private Context f3268a;
    private Button f3269b;
    private Button f3270c;
    private Button f3271d;
    private EditText f3272e;
    private EditText f3273f;
    private EditText f3274g;
    private TextView f3275h;
    private EditText f3276i;
    private EditText f3277j;
    private EditText f3278k;
    private Button f3279l;
    private Button f3280m;
    private Button f3281n;
    private Spinner f3282o;
    private RadioGroup f3283p;
    private int f3284q;
    private int f3285r;
    private int f3286s;
    private String f3287t;
    private ro f3288u;
    private OnDateSetListener f3289v;

    public ExpenseMileageNewEdit() {
        this.f3268a = this;
        this.f3287t = "Personal Expense";
        this.f3289v = new vu(this);
    }

    private void m3232a() {
        this.f3269b.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f3284q + "-" + (this.f3285r + 1) + "-" + this.f3286s));
    }

    private void m3235a(String str) {
        try {
            Double.valueOf(this.f3270c.getText().toString());
            if (this.f3278k.getText().toString().startsWith("-")) {
                aib.m3849a(this.f3268a, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099718), getResources().getString(2131099983), null, null, null).show();
                return;
            }
            long j = 0;
            this.f3288u.m4193a();
            boolean a;
            try {
                String charSequence = this.f3270c.getText().toString();
                if (charSequence != null) {
                    charSequence = charSequence.replaceAll(",", "");
                }
                String[] split = this.f3271d.getText().toString().split(":");
                String str2 = split[0];
                String str3 = "";
                if (split.length > 1) {
                    str3 = split[1];
                }
                String str4 = this.f3274g.getText().toString() + " " + this.f3275h.getText().toString();
                String obj = this.f3272e.getText().toString();
                String str5 = this.f3278k.getText().toString() + "/" + this.f3276i.getText().toString() + "/" + this.f3277j.getText().toString();
                String string = this.f3268a.getResources().getString(2131100021);
                if (this.f3282o.getSelectedItemPosition() == 1) {
                    string = this.f3268a.getResources().getString(2131099747);
                }
                String str6 = "";
                if (!("".equals(this.f3279l.getText().toString()) || "".equals(this.f3280m.getText().toString()))) {
                    int indexOfChild = this.f3283p.indexOfChild(findViewById(this.f3283p.getCheckedRadioButtonId()));
                    String string2 = getResources().getString(2131100064);
                    if (indexOfChild == 1) {
                        string2 = getResources().getString(2131099988);
                    }
                    str6 = this.f3279l.getText().toString() + "/" + this.f3280m.getText().toString() + "/" + string2;
                }
                Long valueOf = Long.valueOf(System.currentTimeMillis());
                j = abd.m3785a(this.f3269b.getText().toString(), ExpenseManager.f3244t, Locale.US);
                ro roVar = this.f3288u;
                String str7 = this.f3287t;
                ContentValues a2 = roVar.m4190a(str7, charSequence, str2, str3, str4, obj, str5, string, str6, "", this.f3281n.getText().toString(), "", "", "", "", j, valueOf.longValue());
                Editor edit;
                Intent intent;
                Bundle bundle;
                if ("Edit".equalsIgnoreCase(str) || "EditActivity".equalsIgnoreCase(str)) {
                    a = this.f3288u.m4196a("expense_report", getIntent().getLongExtra("rowId", 0), a2);
                    this.f3288u.m4201b();
                    if (a) {
                        aib.m3849a(this.f3268a, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099715), getResources().getString(2131099983), null, null, null).show();
                        return;
                    }
                    abd.m3805a(this.f3268a, a);
                    new wd(this).execute(new Context[]{this.f3268a});
                    edit = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).edit();
                    edit.putString("rate", this.f3274g.getText().toString());
                    edit.putString("category", this.f3271d.getText().toString());
                    if (!("Edit".equalsIgnoreCase(str) || "EditActivity".equalsIgnoreCase(str))) {
                        edit.putString("END_ODOMETER", this.f3277j.getText().toString());
                    }
                    edit.commit();
                    if ("widget".equalsIgnoreCase(str)) {
                        intent = new Intent();
                        bundle = new Bundle();
                        bundle.putLong("date", j);
                        bundle.putString("account", this.f3287t);
                        bundle.putInt("position", getIntent().getIntExtra("position", 0));
                        intent.putExtras(bundle);
                        setResult(-1, intent);
                        finish();
                    }
                    Toast.makeText(this.f3268a, 2131100066, 1).show();
                    finish();
                    return;
                }
                this.f3288u.m4185a("expense_report", a2);
                a = true;
                this.f3288u.m4201b();
                if (a) {
                    aib.m3849a(this.f3268a, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099715), getResources().getString(2131099983), null, null, null).show();
                    return;
                }
                abd.m3805a(this.f3268a, a);
                new wd(this).execute(new Context[]{this.f3268a});
                edit = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).edit();
                edit.putString("rate", this.f3274g.getText().toString());
                edit.putString("category", this.f3271d.getText().toString());
                edit.putString("END_ODOMETER", this.f3277j.getText().toString());
                edit.commit();
                if ("widget".equalsIgnoreCase(str)) {
                    Toast.makeText(this.f3268a, 2131100066, 1).show();
                    finish();
                    return;
                }
                intent = new Intent();
                bundle = new Bundle();
                bundle.putLong("date", j);
                bundle.putString("account", this.f3287t);
                bundle.putInt("position", getIntent().getIntExtra("position", 0));
                intent.putExtras(bundle);
                setResult(-1, intent);
                finish();
            } catch (Exception e) {
                e.printStackTrace();
                a = false;
            }
        } catch (Exception e2) {
            aib.m3849a(this.f3268a, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099718), getResources().getString(2131099983), null, null, null).show();
        }
    }

    private void m3237b() {
        String obj = this.f3276i.getText().toString();
        String obj2 = this.f3277j.getText().toString();
        try {
            double doubleValue = Double.valueOf(obj).doubleValue();
            this.f3278k.setText("" + aib.m3864b(Double.valueOf(obj2).doubleValue() - doubleValue));
        } catch (Exception e) {
        }
    }

    private void m3241c() {
        try {
            String trim = this.f3278k.getText().toString().trim();
            String str = "".equals(trim) ? "0" : trim;
            trim = this.f3274g.getText().toString().trim();
            if ("".equals(trim) || ".".equals(trim)) {
                trim = "0";
            }
            this.f3270c.setText(aba.m3773c("" + (Double.valueOf(trim).doubleValue() * Double.valueOf(str).doubleValue())));
        } catch (Exception e) {
        }
    }

    private void m3243d() {
        try {
            if (!"".equals(this.f3279l.getText().toString()) && !"".equals(this.f3280m.getText().toString())) {
                String string = this.f3283p.indexOfChild(findViewById(this.f3283p.getCheckedRadioButtonId())) == 1 ? getResources().getString(2131099988) : getResources().getString(2131100064);
                List a = abd.m3798a(this.f3288u, "status='" + (this.f3279l.getText().toString() + "/" + this.f3280m.getText().toString() + "/" + string) + "'", "reference_number");
                if (a == null || a.size() == 0) {
                    a = abd.m3798a(this.f3288u, "status='" + (this.f3280m.getText().toString() + "/" + this.f3279l.getText().toString() + "/" + string) + "'", "reference_number");
                }
                if (a == null || a.size() == 0) {
                    this.f3278k.setText(null);
                    return;
                }
                String[] split = ((String) a.get(0)).split("/");
                if (split.length > 0) {
                    this.f3278k.setText(split[0]);
                } else {
                    this.f3278k.setText(null);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence string;
        super.onActivityResult(i, i2, intent);
        CharSequence charSequence3 = "";
        String str = "";
        String str2 = "";
        String str3 = "";
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                charSequence3 = extras.getString("category");
                str = extras.getString("amount");
                str2 = extras.getString("tag");
                charSequence = str;
                charSequence2 = str2;
                string = extras.getString("location");
                switch (i) {
                    case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                        if (-1 == i2) {
                            this.f3271d.setText(charSequence3);
                        }
                    case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                        if (-1 == i2) {
                            if (charSequence != null && charSequence.trim().startsWith("-")) {
                                charSequence = charSequence.replace("-", "");
                            }
                            this.f3270c.setText(charSequence);
                        }
                    case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                        if (-1 == i2) {
                            this.f3279l.setText(string);
                        }
                        if (!"".equals(this.f3279l.getText().toString()) || "".equals(this.f3280m.getText().toString())) {
                            this.f3283p.setVisibility(8);
                        }
                        this.f3283p.setVisibility(0);
                        m3243d();
                        return;
                    case adv.TitlePageIndicator_footerLineHeight /*6*/:
                        if (-1 == i2) {
                            this.f3280m.setText(string);
                        }
                        if (!"".equals(this.f3279l.getText().toString()) || "".equals(this.f3280m.getText().toString())) {
                            this.f3283p.setVisibility(8);
                        }
                        this.f3283p.setVisibility(0);
                        m3243d();
                        return;
                    case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                        if (-1 == i2) {
                            this.f3281n.setText(charSequence2);
                        }
                    default:
                }
            }
        }
        String str4 = str3;
        Object obj = str;
        Object obj2 = str2;
        Object obj3 = str4;
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if (-1 == i2) {
                    this.f3271d.setText(charSequence3);
                }
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                if (-1 == i2) {
                    charSequence = charSequence.replace("-", "");
                    this.f3270c.setText(charSequence);
                }
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                if (-1 == i2) {
                    this.f3279l.setText(string);
                }
                if ("".equals(this.f3279l.getText().toString())) {
                    break;
                }
                this.f3283p.setVisibility(8);
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                if (-1 == i2) {
                    this.f3280m.setText(string);
                }
                if ("".equals(this.f3279l.getText().toString())) {
                    break;
                }
                this.f3283p.setVisibility(8);
            case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                if (-1 == i2) {
                    this.f3281n.setText(charSequence2);
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
        getWindow().setSoftInputMode(3);
        this.f3288u = new ro(this);
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        this.f3287t = getIntent().getStringExtra("account");
        setTitle(this.f3287t);
        if (this.f3287t == null || "".equals(this.f3287t) || "All".equals(this.f3287t)) {
            this.f3287t = aba.m3772c((Context) this, this.f3288u);
        }
        String stringExtra = getIntent().getStringExtra("fromWhere");
        setContentView(2130903104);
        this.f3269b = (Button) findViewById(2131558529);
        this.f3269b.setOnClickListener(new vk(this));
        CharSequence string = sharedPreferences.getString("rate", "");
        this.f3275h = (TextView) findViewById(2131558845);
        this.f3274g = (EditText) findViewById(2131558844);
        this.f3274g.setText(string);
        String a = abd.m3786a((Context) this, this.f3288u, this.f3287t + "_" + "AUTO_ACCOUNT", "mi");
        String str = co.f4436j[abd.m3783a((Context) this, this.f3288u, this.f3287t + "_CURRENCY", 0)];
        this.f3275h.setText(str.substring(str.indexOf(":") + 1) + "/" + a);
        this.f3276i = (EditText) findViewById(2131558835);
        this.f3277j = (EditText) findViewById(2131558838);
        this.f3278k = (EditText) findViewById(2131558841);
        this.f3276i.setText(sharedPreferences.getString("END_ODOMETER", null));
        TextWatcher vvVar = new vv(this);
        TextWatcher vwVar = new vw(this);
        this.f3276i.addTextChangedListener(vvVar);
        this.f3277j.addTextChangedListener(vvVar);
        this.f3278k.addTextChangedListener(vwVar);
        this.f3274g.addTextChangedListener(vwVar);
        this.f3271d = (Button) findViewById(2131558542);
        this.f3271d.setText(sharedPreferences.getString("category", "Automobile:Mileage"));
        this.f3271d.setOnClickListener(new vx(this));
        Calendar instance = Calendar.getInstance();
        this.f3284q = instance.get(1);
        this.f3285r = instance.get(2);
        this.f3286s = instance.get(5);
        m3232a();
        this.f3270c = (Button) findViewById(2131558526);
        this.f3270c.setOnClickListener(new vy(this));
        this.f3272e = (EditText) findViewById(2131558537);
        this.f3279l = (Button) findViewById(2131558825);
        this.f3279l.setOnClickListener(new vz(this));
        this.f3279l.setOnLongClickListener(new wa(this));
        this.f3280m = (Button) findViewById(2131558828);
        this.f3280m.setOnClickListener(new wb(this));
        this.f3280m.setOnLongClickListener(new wc(this));
        this.f3283p = (RadioGroup) findViewById(2131558829);
        if ("".equals(this.f3279l.getText().toString()) || "".equals(this.f3280m.getText().toString())) {
            this.f3283p.setVisibility(8);
        } else {
            this.f3283p.setVisibility(0);
        }
        this.f3283p.setOnCheckedChangeListener(new vl(this));
        Resources resources = this.f3268a.getResources();
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, new ArrayList(Arrays.asList(new String[]{resources.getString(2131100021), resources.getString(2131099747)})));
        arrayAdapter.setDropDownViewResource(17367049);
        this.f3282o = (Spinner) findViewById(2131558849);
        this.f3282o.setAdapter(arrayAdapter);
        this.f3281n = (Button) findViewById(2131558850);
        this.f3281n.setOnClickListener(new vm(this));
        this.f3281n.setOnLongClickListener(new vn(this));
        Button button = (Button) findViewById(2131558560);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new vo(this, stringExtra));
        button = (Button) findViewById(2131558559);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new vp(this));
        button = (Button) findViewById(2131558558);
        aib.m3858a((Context) this, button, 2130837530);
        button.setOnClickListener(new vq(this));
        Button button2 = (Button) findViewById(2131558698);
        aib.m3858a((Context) this, button2, -1);
        button2.setOnClickListener(new vt(this));
        if ("EditActivity".equalsIgnoreCase(stringExtra)) {
            this.f3269b.setText(getIntent().getStringExtra("date"));
            this.f3271d.setText(getIntent().getStringExtra("category"));
            this.f3270c.setText(getIntent().getStringExtra("amount"));
            Object stringExtra2 = getIntent().getStringExtra("description");
            this.f3272e.setText(stringExtra2);
            String[] split = getIntent().getStringExtra("referenceNumber").split("/");
            if (split.length > 0) {
                this.f3278k.setText(split[0]);
            }
            if (split.length > 1) {
                this.f3276i.setText(split[1]);
            }
            if (split.length > 2) {
                this.f3277j.setText(split[2]);
            }
            String stringExtra3 = getIntent().getStringExtra("paymentMethod");
            CharSequence charSequence = this.f3275h.getText().toString();
            if (stringExtra3.indexOf(charSequence) != -1) {
                this.f3274g.setText(stringExtra3.replace(charSequence, "").trim());
            }
            button.setVisibility(0);
            button2.setVisibility(0);
            if (stringExtra2 == null || !stringExtra2.startsWith("Repeating:")) {
                this.f3272e.setEnabled(true);
            } else {
                this.f3272e.setEnabled(false);
            }
            if (!(getIntent().getStringExtra("date") == null || "".equals(getIntent().getStringExtra("date")))) {
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
                    simpleDateFormat.setLenient(false);
                    instance.setTime(simpleDateFormat.parse(getIntent().getStringExtra("date")));
                    this.f3284q = instance.get(1);
                    this.f3285r = instance.get(2);
                    this.f3286s = instance.get(5);
                } catch (Exception e) {
                }
            }
            a = getIntent().getStringExtra("status");
            if (!(a == null || "".equals(a))) {
                String[] split2 = a.split("/");
                if (split2.length > 0) {
                    this.f3279l.setText(split2[0]);
                }
                if (split2.length > 1) {
                    this.f3280m.setText(split2[1]);
                }
                if (split2.length > 2 && !"".equals(split2[2])) {
                    this.f3283p.setVisibility(0);
                    if (split2[2].equalsIgnoreCase(getResources().getString(2131100064))) {
                        this.f3283p.check(2131558830);
                    } else {
                        this.f3283p.check(2131558831);
                    }
                }
            }
            if (getIntent().getStringExtra("property").equalsIgnoreCase(getResources().getString(2131100021))) {
                this.f3282o.setSelection(0);
            } else {
                this.f3282o.setSelection(1);
            }
            this.f3281n.setText(getIntent().getStringExtra("tag"));
        }
        if ("tools".equalsIgnoreCase(stringExtra)) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                CharSequence string2 = extras.getString("amount");
                CharSequence string3 = extras.getString("ref");
                CharSequence string4 = extras.getString("description");
                if (string2 != null && string2.trim().startsWith("-")) {
                    string2 = string2.replace("-", "");
                }
                this.f3270c.setText(string2);
                if (string3 != null) {
                    this.f3273f.setText(string3);
                }
                if (string4 != null) {
                    this.f3272e.setText(string4);
                }
            }
        }
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                try {
                    return new DatePickerDialog(this, this.f3289v, this.f3284q, this.f3285r, this.f3286s);
                } catch (Exception e) {
                    Calendar instance = Calendar.getInstance();
                    return new DatePickerDialog(this, this.f3289v, instance.get(1), instance.get(2), instance.get(5));
                }
            default:
                return null;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                Intent intent = new Intent(this, ExpenseManager.class);
                Bundle bundle = new Bundle();
                bundle.putString("account", this.f3287t);
                intent.putExtras(bundle);
                startActivity(intent);
                return true;
            case 16908332:
                onBackPressed();
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                ((DatePickerDialog) dialog).updateDate(this.f3284q, this.f3285r, this.f3286s);
            default:
        }
    }
}
