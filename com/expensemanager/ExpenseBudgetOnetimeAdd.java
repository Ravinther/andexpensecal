package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.C0607c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

public class ExpenseBudgetOnetimeAdd extends Activity {
    private static boolean f2953o;
    long f2954a;
    int f2955b;
    private Context f2956c;
    private TextView f2957d;
    private TextView f2958e;
    private TextView f2959f;
    private TextView f2960g;
    private TextView f2961h;
    private EditText f2962i;
    private CheckBox f2963j;
    private EditText f2964k;
    private EditText f2965l;
    private Button f2966m;
    private String f2967n;
    private ro f2968p;
    private Button f2969q;
    private Button f2970r;
    private int f2971s;
    private int f2972t;
    private int f2973u;
    private int f2974v;
    private int f2975w;
    private int f2976x;
    private OnDateSetListener f2977y;

    static {
        f2953o = false;
    }

    public ExpenseBudgetOnetimeAdd() {
        this.f2956c = this;
        this.f2967n = "Personal Expense";
        this.f2954a = 0;
        this.f2955b = 0;
        this.f2977y = new mb(this);
    }

    private void m2872a() {
        if (this.f2955b == 0) {
            this.f2970r.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f2971s + "-" + (this.f2972t + 1) + "-" + this.f2973u));
        }
        if (this.f2955b == 1) {
            this.f2969q.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f2974v + "-" + (this.f2975w + 1) + "-" + this.f2976x));
        }
    }

    private void m2874a(String[] strArr, TextView textView, boolean z) {
        CharSequence string;
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
        charSequence = getResources().getString(2131100057);
        if (z) {
            string = getResources().getString(2131099720);
        } else {
            Object obj = charSequence;
        }
        new Builder(this).setTitle(2131100026).setMultiChoiceItems(strArr, zArr, new me(this, zArr)).setPositiveButton(2131099983, new md(this, zArr, strArr, textView, z)).setNegativeButton(string, new mc(this, z, textView)).show();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(2131099973);
        getWindow().setSoftInputMode(3);
        this.f2968p = new ro(this);
        String stringExtra = getIntent().getStringExtra("rowId");
        if (stringExtra != null) {
            this.f2954a = (long) Integer.valueOf(stringExtra).intValue();
        }
        this.f2967n = getIntent().getStringExtra("account");
        if (this.f2967n == null || "".equals(this.f2967n)) {
            this.f2967n = "Personal Expense";
        }
        setContentView(2130903090);
        boolean booleanExtra = getIntent().getBooleanExtra("isNew", true);
        this.f2957d = (TextView) findViewById(2131558476);
        this.f2957d.setText(this.f2967n);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(2131558473);
        Object a = abd.m3786a(this.f2956c, this.f2968p, "MY_ACCOUNT_NAMES", "Personal Expense");
        if ("All".equals(this.f2967n)) {
            this.f2957d.setText(a);
        }
        relativeLayout.setOnClickListener(new lx(this, a));
        ArrayList arrayList = new ArrayList();
        Object hashMap = new HashMap();
        ExpenseBudgetAdd.m2800a(this.f2968p, arrayList, hashMap);
        this.f2958e = (TextView) findViewById(2131558720);
        ((RelativeLayout) findViewById(2131558479)).setOnClickListener(new mf(this, arrayList));
        this.f2959f = (TextView) findViewById(2131558724);
        ((RelativeLayout) findViewById(2131558721)).setOnClickListener(new mg(this, hashMap));
        this.f2960g = (TextView) findViewById(2131558547);
        ((RelativeLayout) findViewById(2131558725)).setOnClickListener(new mh(this));
        this.f2961h = (TextView) findViewById(2131558553);
        ((RelativeLayout) findViewById(2131558726)).setOnClickListener(new mi(this));
        this.f2970r = (Button) findViewById(2131558652);
        this.f2969q = (Button) findViewById(2131558654);
        this.f2970r.setOnClickListener(new mj(this));
        this.f2969q.setOnClickListener(new mk(this));
        Calendar instance = Calendar.getInstance();
        this.f2971s = instance.get(1) - 1;
        this.f2972t = instance.get(2);
        this.f2973u = instance.get(5);
        this.f2974v = instance.get(1);
        this.f2975w = instance.get(2);
        this.f2976x = instance.get(5);
        this.f2962i = (EditText) findViewById(2131558503);
        this.f2964k = (EditText) findViewById(2131558730);
        this.f2963j = (CheckBox) findViewById(2131558580);
        this.f2965l = (EditText) findViewById(2131558731);
        Button button = (Button) findViewById(2131558582);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new ml(this));
        button = (Button) findViewById(2131558732);
        aib.m3858a((Context) this, button, 2130837530);
        button.setOnClickListener(new mm(this));
        this.f2966m = (Button) findViewById(2131558583);
        aib.m3858a((Context) this, this.f2966m, -1);
        this.f2966m.setOnClickListener(new ly(this, booleanExtra));
        Button button2 = (Button) findViewById(2131558753);
        aib.m3858a((Context) this, button2, -1);
        if (booleanExtra) {
            button.setVisibility(8);
            button2.setVisibility(8);
            return;
        }
        setTitle(2131099860);
        CharSequence a2 = aib.m3853a(getIntent().getStringExtra("account"));
        CharSequence a3 = aib.m3853a(getIntent().getStringExtra("amount"));
        CharSequence a4 = aib.m3853a(getIntent().getStringExtra("category"));
        CharSequence a5 = aib.m3853a(getIntent().getStringExtra("subcategory"));
        String a6 = aib.m3853a(getIntent().getStringExtra("property"));
        CharSequence a7 = aib.m3853a(getIntent().getStringExtra("property2"));
        CharSequence a8 = aib.m3853a(getIntent().getStringExtra("property3"));
        if ("All".equals(a4) || "All-1".equals(a4)) {
            a4 = getResources().getString(2131099720);
        }
        this.f2957d.setText(a2);
        this.f2958e.setText(a4);
        this.f2959f.setText(a5);
        this.f2960g.setText(a7);
        this.f2961h.setText(a8);
        this.f2962i.setText(a3);
        this.f2964k.setText(aib.m3853a(getIntent().getStringExtra("alertAmount")));
        this.f2965l.setText(aib.m3853a(getIntent().getStringExtra("description")));
        button.setVisibility(0);
        button2.setVisibility(0);
        if ("All-1".equalsIgnoreCase(getIntent().getStringExtra("category"))) {
            this.f2963j.setChecked(true);
            this.f2963j.setVisibility(0);
        } else if ("All".equalsIgnoreCase(getIntent().getStringExtra("category"))) {
            this.f2963j.setVisibility(0);
        } else {
            this.f2963j.setChecked(false);
            this.f2963j.setVisibility(8);
        }
        String[] split = a6.split(";");
        if (split.length > 0 && !"".equals(split[0])) {
            this.f2970r.setText(aib.m3867b(split[0], "yyyy-MM-dd", ExpenseManager.f3244t));
        }
        if (split.length > 1 && !"".equals(split[1])) {
            this.f2969q.setText(aib.m3867b(split[1], "yyyy-MM-dd", ExpenseManager.f3244t));
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
            simpleDateFormat.setLenient(false);
            if (split.length > 0 && !"".equals(split[0])) {
                instance.setTime(simpleDateFormat.parse(split[0]));
                this.f2971s = instance.get(1);
                this.f2972t = instance.get(2);
                this.f2973u = instance.get(5);
            }
            if (split.length > 1 && !"".equals(split[1])) {
                instance.setTime(simpleDateFormat.parse(split[1]));
                this.f2974v = instance.get(1);
                this.f2975w = instance.get(2);
                this.f2976x = instance.get(5);
            }
        } catch (Exception e) {
        }
    }

    protected Dialog onCreateDialog(int i) {
        Calendar instance;
        this.f2955b = i;
        Dialog datePickerDialog;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                try {
                    datePickerDialog = new DatePickerDialog(this, this.f2977y, this.f2971s, this.f2972t, this.f2973u);
                    datePickerDialog.setButton(-2, getString(2131100057), new lz(this));
                    return datePickerDialog;
                } catch (Exception e) {
                    instance = Calendar.getInstance();
                    return new DatePickerDialog(this, this.f2977y, instance.get(1), instance.get(2), instance.get(5));
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                datePickerDialog = new DatePickerDialog(this, this.f2977y, this.f2974v, this.f2975w, this.f2976x);
                datePickerDialog.setButton(-2, getString(2131100057), new ma(this));
                return datePickerDialog;
            default:
                return null;
        }
        instance = Calendar.getInstance();
        return new DatePickerDialog(this, this.f2977y, instance.get(1), instance.get(2), instance.get(5));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 0, 0, 2131100065).setIcon(2130837591).setShowAsAction(2);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f2966m.performClick();
                return true;
            case 16908332:
                onBackPressed();
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        this.f2955b = i;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                ((DatePickerDialog) dialog).updateDate(this.f2971s, this.f2972t, this.f2973u);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                ((DatePickerDialog) dialog).updateDate(this.f2974v, this.f2975w, this.f2976x);
            default:
        }
    }
}
