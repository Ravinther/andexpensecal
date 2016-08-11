package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.gms.C0607c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class ExpenseChartCustom extends Activity {
    private OnDateSetListener f3015A;
    int f3016a;
    ArrayList<String> f3017b;
    ro f3018c;
    ArrayList<String> f3019d;
    boolean f3020e;
    private Context f3021f;
    private TextView f3022g;
    private TextView f3023h;
    private TextView f3024i;
    private RadioButton f3025j;
    private RadioButton f3026k;
    private RadioButton f3027l;
    private Spinner f3028m;
    private CheckBox f3029n;
    private CheckBox f3030o;
    private RelativeLayout f3031p;
    private RelativeLayout f3032q;
    private TextView f3033r;
    private TextView f3034s;
    private int f3035t;
    private int f3036u;
    private int f3037v;
    private int f3038w;
    private int f3039x;
    private int f3040y;
    private String f3041z;

    public ExpenseChartCustom() {
        this.f3021f = this;
        this.f3041z = "Personal Expense";
        this.f3016a = 0;
        this.f3017b = new ArrayList();
        this.f3020e = false;
        this.f3015A = new ng(this);
    }

    private void m2934a() {
        this.f3022g.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f3035t + "-" + (this.f3036u + 1) + "-" + this.f3037v));
        this.f3023h.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f3038w + "-" + (this.f3039x + 1) + "-" + this.f3040y));
    }

    public static void m2935a(Context context, List<Map<String, Object>> list, String str, String str2, String str3, String str4) {
        String replaceAll;
        String str5 = "";
        String str6 = "";
        double d = 0.0d;
        int i = 0;
        while (i < list.size()) {
            Map map = (Map) list.get(i);
            String a = aba.m3756a((String) map.get("name"));
            String a2 = aba.m3756a((String) map.get("amount"));
            if ("expense".equalsIgnoreCase(str2)) {
                a2 = aba.m3756a((String) map.get("expense")).replaceAll(",", "");
                d = aba.m3742a(d, a2);
            }
            if ("income".equalsIgnoreCase(str2)) {
                a2 = aba.m3756a((String) map.get("income")).replaceAll(",", "");
                d = aba.m3742a(d, a2);
            }
            if ("balance".equalsIgnoreCase(str2)) {
                a2 = aba.m3756a((String) map.get("subTotal"));
                if (a2.indexOf("(") != -1) {
                    a2 = a2.replace("(", "-").replace(")", "");
                }
            }
            replaceAll = a2.replaceAll(",", "");
            if (replaceAll.indexOf("-") != -1) {
                replaceAll = aba.m3767b(replaceAll.replace("-", "")).replaceAll(",", "");
            }
            if (i == 0) {
                a2 = a;
            } else {
                a2 = str6 + "," + a;
                replaceAll = str5 + "," + replaceAll;
            }
            i++;
            str5 = replaceAll;
            str6 = a2;
        }
        replaceAll = aba.m3746a(d);
        Intent intent = new Intent(context, ExpenseChartBuilder.class);
        Bundle bundle = new Bundle();
        bundle.putString("xStr", str6);
        bundle.putString("yStr", str5);
        bundle.putString("total", replaceAll);
        bundle.putString("title", str3);
        bundle.putString("viewType", "category");
        bundle.putString("account", str4);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    private void m2937a(String[] strArr, TextView textView) {
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
        new Builder(this).setTitle(2131100026).setMultiChoiceItems(strArr, zArr, new nj(this, zArr)).setPositiveButton(2131099983, new ni(this, zArr, strArr, textView)).setNegativeButton(2131100057, new nh(this, textView)).show();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(2131099764);
        getWindow().setSoftInputMode(3);
        Resources resources = this.f3021f.getResources();
        this.f3018c = new ro(this);
        this.f3041z = getIntent().getStringExtra("account");
        if (this.f3041z == null || "".equals(this.f3041z)) {
            this.f3041z = "Personal Expense";
        }
        setContentView(2130903092);
        this.f3024i = (TextView) findViewById(2131558476);
        this.f3024i.setText(this.f3041z);
        ImageButton imageButton = (ImageButton) findViewById(2131558475);
        Object a = abd.m3786a(this.f3021f, this.f3018c, "MY_ACCOUNT_NAMES", "Personal Expense");
        String[] split = a.split(",");
        ArrayList arrayList = new ArrayList(Arrays.asList(split));
        if ("All".equalsIgnoreCase(this.f3041z)) {
            this.f3024i.setText(a);
        }
        imageButton.setOnClickListener(new na(this, split, arrayList));
        ((ImageButton) findViewById(2131558658)).setOnClickListener(new nk(this));
        this.f3022g = (TextView) findViewById(2131558652);
        this.f3023h = (TextView) findViewById(2131558654);
        ((ImageButton) findViewById(2131558762)).setOnClickListener(new nl(this));
        Calendar instance = Calendar.getInstance();
        this.f3035t = instance.get(1) - 1;
        this.f3036u = instance.get(2);
        this.f3037v = instance.get(5);
        this.f3038w = instance.get(1);
        this.f3039x = instance.get(2);
        this.f3040y = instance.get(5);
        m2934a();
        split = new String[]{resources.getString(2131099957), resources.getString(2131099755), resources.getString(2131100106), resources.getString(2131100007), resources.getString(2131100011), resources.getString(2131100101)};
        this.f3019d = new ArrayList(Arrays.asList(split));
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, this.f3019d);
        arrayAdapter.setDropDownViewResource(17367049);
        this.f3028m = (Spinner) findViewById(2131558766);
        this.f3028m.setAdapter(arrayAdapter);
        this.f3028m.setOnItemSelectedListener(new nm(this));
        this.f3025j = (RadioButton) findViewById(2131558763);
        this.f3026k = (RadioButton) findViewById(2131558764);
        this.f3027l = (RadioButton) findViewById(2131558765);
        this.f3025j.setOnClickListener(new nn(this, resources, arrayAdapter));
        this.f3026k.setOnClickListener(new no(this, resources, arrayAdapter));
        this.f3027l.setOnClickListener(new np(this, resources, arrayAdapter));
        this.f3033r = (TextView) findViewById(2131558720);
        this.f3031p = (RelativeLayout) findViewById(2131558479);
        this.f3031p.setOnClickListener(new nq(this));
        this.f3034s = (TextView) findViewById(2131558724);
        this.f3032q = (RelativeLayout) findViewById(2131558721);
        this.f3032q.setOnClickListener(new nr(this));
        this.f3029n = (CheckBox) findViewById(2131558580);
        this.f3030o = (CheckBox) findViewById(2131558767);
        Button button = (Button) findViewById(2131558449);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new ne(this, split, a));
        button = (Button) findViewById(2131558516);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new nf(this));
    }

    protected Dialog onCreateDialog(int i) {
        Calendar instance;
        this.f3016a = i;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                try {
                    return new DatePickerDialog(this, this.f3015A, this.f3035t, this.f3036u, this.f3037v);
                } catch (Exception e) {
                    instance = Calendar.getInstance();
                    return new DatePickerDialog(this, this.f3015A, instance.get(1), instance.get(2), instance.get(5));
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                return new DatePickerDialog(this, this.f3015A, this.f3038w, this.f3039x, this.f3040y);
            default:
                return null;
        }
        instance = Calendar.getInstance();
        return new DatePickerDialog(this, this.f3015A, instance.get(1), instance.get(2), instance.get(5));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        this.f3016a = i;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                ((DatePickerDialog) dialog).updateDate(this.f3035t, this.f3036u, this.f3037v);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                ((DatePickerDialog) dialog).updateDate(this.f3038w, this.f3039x, this.f3040y);
            default:
        }
    }
}
