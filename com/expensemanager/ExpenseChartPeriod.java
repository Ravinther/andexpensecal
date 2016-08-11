package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.gms.C0607c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class ExpenseChartPeriod extends Activity {
    int f3086a;
    ArrayList<String> f3087b;
    ro f3088c;
    ArrayList<String> f3089d;
    boolean f3090e;
    private Context f3091f;
    private TextView f3092g;
    private TextView f3093h;
    private TextView f3094i;
    private RadioButton f3095j;
    private RadioButton f3096k;
    private RadioButton f3097l;
    private Spinner f3098m;
    private RelativeLayout f3099n;
    private RelativeLayout f3100o;
    private TextView f3101p;
    private TextView f3102q;
    private TextView f3103r;
    private int f3104s;
    private int f3105t;
    private int f3106u;
    private int f3107v;
    private int f3108w;
    private int f3109x;
    private String f3110y;
    private OnDateSetListener f3111z;

    public ExpenseChartPeriod() {
        this.f3091f = this;
        this.f3110y = "Personal Expense";
        this.f3086a = 0;
        this.f3087b = new ArrayList();
        this.f3090e = false;
        this.f3111z = new pf(this);
    }

    private void m3008a() {
        this.f3092g.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f3104s + "-" + (this.f3105t + 1) + "-" + this.f3106u));
        this.f3093h.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f3107v + "-" + (this.f3108w + 1) + "-" + this.f3109x));
    }

    private void m3010a(String[] strArr, TextView textView) {
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
        new Builder(this).setTitle(2131100026).setMultiChoiceItems(strArr, zArr, new ox(this, zArr)).setPositiveButton(2131099983, new ow(this, zArr, strArr, textView)).setNegativeButton(2131100057, new ov(this, textView)).show();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(2131099764);
        getWindow().setSoftInputMode(3);
        Resources resources = this.f3091f.getResources();
        this.f3088c = new ro(this);
        this.f3110y = getIntent().getStringExtra("account");
        if (this.f3110y == null || "".equals(this.f3110y)) {
            this.f3110y = "Personal Expense";
        }
        setContentView(2130903094);
        this.f3094i = (TextView) findViewById(2131558476);
        this.f3094i.setText(this.f3110y);
        ImageButton imageButton = (ImageButton) findViewById(2131558475);
        CharSequence a = abd.m3786a(this.f3091f, this.f3088c, "MY_ACCOUNT_NAMES", "Personal Expense");
        String[] split = a.split(",");
        ArrayList arrayList = new ArrayList(Arrays.asList(split));
        if ("All".equalsIgnoreCase(this.f3110y)) {
            this.f3094i.setText(a);
        }
        imageButton.setOnClickListener(new or(this, split, arrayList));
        ((ImageButton) findViewById(2131558658)).setOnClickListener(new oy(this));
        this.f3092g = (TextView) findViewById(2131558652);
        this.f3093h = (TextView) findViewById(2131558654);
        ((ImageButton) findViewById(2131558762)).setOnClickListener(new oz(this));
        Calendar instance = Calendar.getInstance();
        this.f3104s = instance.get(1) - 1;
        this.f3105t = instance.get(2);
        this.f3106u = instance.get(5);
        this.f3107v = instance.get(1);
        this.f3108w = instance.get(2);
        this.f3109x = instance.get(5);
        m3008a();
        this.f3089d = new ArrayList(Arrays.asList(new String[]{resources.getString(2131099755), resources.getString(2131100106), resources.getString(2131100007), resources.getString(2131100011)}));
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, this.f3089d);
        arrayAdapter.setDropDownViewResource(17367049);
        this.f3098m = (Spinner) findViewById(2131558766);
        this.f3098m.setAdapter(arrayAdapter);
        this.f3098m.setOnItemSelectedListener(new pa(this, resources));
        this.f3095j = (RadioButton) findViewById(2131558647);
        this.f3096k = (RadioButton) findViewById(2131558648);
        this.f3097l = (RadioButton) findViewById(2131558649);
        this.f3103r = (TextView) findViewById(2131558541);
        this.f3101p = (TextView) findViewById(2131558720);
        this.f3099n = (RelativeLayout) findViewById(2131558479);
        this.f3099n.setOnClickListener(new pb(this));
        this.f3102q = (TextView) findViewById(2131558724);
        this.f3100o = (RelativeLayout) findViewById(2131558721);
        this.f3100o.setOnClickListener(new pc(this));
        Button button = (Button) findViewById(2131558449);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new pd(this));
        button = (Button) findViewById(2131558516);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new pe(this));
    }

    protected Dialog onCreateDialog(int i) {
        Calendar instance;
        this.f3086a = i;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                try {
                    return new DatePickerDialog(this, this.f3111z, this.f3104s, this.f3105t, this.f3106u);
                } catch (Exception e) {
                    instance = Calendar.getInstance();
                    return new DatePickerDialog(this, this.f3111z, instance.get(1), instance.get(2), instance.get(5));
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                return new DatePickerDialog(this, this.f3111z, this.f3107v, this.f3108w, this.f3109x);
            default:
                return null;
        }
        instance = Calendar.getInstance();
        return new DatePickerDialog(this, this.f3111z, instance.get(1), instance.get(2), instance.get(5));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        this.f3086a = i;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                ((DatePickerDialog) dialog).updateDate(this.f3104s, this.f3105t, this.f3106u);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                ((DatePickerDialog) dialog).updateDate(this.f3107v, this.f3108w, this.f3109x);
            default:
        }
    }
}
