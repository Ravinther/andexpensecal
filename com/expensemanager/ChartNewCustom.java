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

public class ChartNewCustom extends Activity {
    private OnDateSetListener f2437A;
    int f2438a;
    ArrayList<String> f2439b;
    ro f2440c;
    ArrayList<String> f2441d;
    boolean f2442e;
    private Context f2443f;
    private TextView f2444g;
    private TextView f2445h;
    private TextView f2446i;
    private RadioButton f2447j;
    private RadioButton f2448k;
    private RadioButton f2449l;
    private Spinner f2450m;
    private CheckBox f2451n;
    private CheckBox f2452o;
    private RelativeLayout f2453p;
    private RelativeLayout f2454q;
    private TextView f2455r;
    private TextView f2456s;
    private int f2457t;
    private int f2458u;
    private int f2459v;
    private int f2460w;
    private int f2461x;
    private int f2462y;
    private String f2463z;

    public ChartNewCustom() {
        this.f2443f = this;
        this.f2463z = "Personal Expense";
        this.f2438a = 0;
        this.f2439b = new ArrayList();
        this.f2442e = false;
        this.f2437A = new C0457q(this);
    }

    private void m2387a() {
        this.f2444g.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f2457t + "-" + (this.f2458u + 1) + "-" + this.f2459v));
        this.f2445h.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f2460w + "-" + (this.f2461x + 1) + "-" + this.f2462y));
    }

    public static void m2388a(Context context, List<Map<String, Object>> list, String str, String str2, String str3, String str4, String str5) {
        String replaceAll;
        List a = !"income".equalsIgnoreCase(str2) ? ck.m4024a((List) list, false, "name", true) : ck.m4024a((List) list, true, "name", true);
        double d = 0.0d;
        String str6 = "";
        String str7 = "";
        int i = 0;
        while (i < a.size()) {
            Map map = (Map) a.get(i);
            String a2 = aba.m3756a((String) map.get("name"));
            String a3 = aba.m3756a((String) map.get("amount"));
            if ("expense".equalsIgnoreCase(str2)) {
                a3 = aba.m3756a((String) map.get("expense")).replaceAll(",", "");
                d = aba.m3742a(d, a3);
            }
            if ("income".equalsIgnoreCase(str2)) {
                a3 = aba.m3756a((String) map.get("income")).replaceAll(",", "");
                d = aba.m3742a(d, a3);
            }
            if ("balance".equalsIgnoreCase(str2)) {
                a3 = aba.m3756a((String) map.get("subTotal"));
                if (a3.indexOf("(") != -1) {
                    a3 = a3.replace("(", "-").replace(")", "");
                }
            }
            replaceAll = a3.replaceAll(",", "");
            if (replaceAll.indexOf("-") != -1) {
                replaceAll = aba.m3767b(replaceAll.replace("-", "")).replaceAll(",", "");
            }
            a3 = aib.m3865b(a2).equals("") ? "NA" : a2;
            if (i != 0) {
                a3 = str7 + "," + a3;
                replaceAll = str6 + "," + replaceAll;
            }
            i++;
            str6 = replaceAll;
            str7 = a3;
        }
        replaceAll = aba.m3746a(d);
        Intent intent = new Intent(context, ChartNewCustomChart.class);
        Bundle bundle = new Bundle();
        bundle.putString("xStr", str7);
        bundle.putString("yStr", str6);
        bundle.putString("total", replaceAll);
        bundle.putString("title", str3);
        bundle.putString("viewType", str2);
        bundle.putString("account", str4);
        bundle.putString("whereClause", str5);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    private void m2390a(String[] strArr, TextView textView) {
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
        new Builder(this).setTitle(2131100026).setMultiChoiceItems(strArr, zArr, new C0460t(this, zArr)).setPositiveButton(2131099983, new C0459s(this, zArr, strArr, textView)).setNegativeButton(2131100057, new C0458r(this, textView)).show();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(getResources().getString(2131099970));
        getWindow().setSoftInputMode(3);
        Resources resources = this.f2443f.getResources();
        this.f2440c = new ro(this);
        this.f2463z = getIntent().getStringExtra("account");
        if (this.f2463z == null || "".equals(this.f2463z)) {
            this.f2463z = "Personal Expense";
        }
        setContentView(2130903092);
        this.f2446i = (TextView) findViewById(2131558476);
        this.f2446i.setText(this.f2463z);
        ImageButton imageButton = (ImageButton) findViewById(2131558475);
        Object a = abd.m3786a(this.f2443f, this.f2440c, "MY_ACCOUNT_NAMES", "Personal Expense");
        String[] split = a.split(",");
        ArrayList arrayList = new ArrayList(Arrays.asList(split));
        if ("All".equalsIgnoreCase(this.f2463z)) {
            this.f2446i.setText(a);
        }
        imageButton.setOnClickListener(new C0451k(this, split, arrayList));
        ((ImageButton) findViewById(2131558658)).setOnClickListener(new C0461u(this));
        this.f2444g = (TextView) findViewById(2131558652);
        this.f2445h = (TextView) findViewById(2131558654);
        ((ImageButton) findViewById(2131558762)).setOnClickListener(new C0463v(this));
        Calendar instance = Calendar.getInstance();
        this.f2457t = instance.get(1) - 1;
        this.f2458u = instance.get(2);
        this.f2459v = instance.get(5);
        this.f2460w = instance.get(1);
        this.f2461x = instance.get(2);
        this.f2462y = instance.get(5);
        m2387a();
        split = new String[]{resources.getString(2131099755), resources.getString(2131100106), resources.getString(2131100007), resources.getString(2131100011), resources.getString(2131100101), resources.getString(2131100110)};
        this.f2441d = new ArrayList(Arrays.asList(split));
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, this.f2441d);
        arrayAdapter.setDropDownViewResource(17367049);
        this.f2450m = (Spinner) findViewById(2131558766);
        this.f2450m.setAdapter(arrayAdapter);
        this.f2450m.setOnItemSelectedListener(new C0464w(this));
        this.f2447j = (RadioButton) findViewById(2131558763);
        this.f2448k = (RadioButton) findViewById(2131558764);
        this.f2449l = (RadioButton) findViewById(2131558765);
        this.f2449l.setVisibility(8);
        this.f2447j.setOnClickListener(new C0465x(this, resources, arrayAdapter));
        this.f2448k.setOnClickListener(new C0466y(this, resources, arrayAdapter));
        this.f2449l.setOnClickListener(new C0467z(this, arrayAdapter));
        this.f2455r = (TextView) findViewById(2131558720);
        this.f2453p = (RelativeLayout) findViewById(2131558479);
        this.f2453p.setOnClickListener(new aa(this));
        this.f2456s = (TextView) findViewById(2131558724);
        this.f2454q = (RelativeLayout) findViewById(2131558721);
        this.f2454q.setOnClickListener(new ab(this));
        this.f2451n = (CheckBox) findViewById(2131558580);
        this.f2452o = (CheckBox) findViewById(2131558767);
        Button button = (Button) findViewById(2131558449);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new C0455o(this, split, a));
        button = (Button) findViewById(2131558516);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new C0456p(this));
    }

    protected Dialog onCreateDialog(int i) {
        Calendar instance;
        this.f2438a = i;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                try {
                    return new DatePickerDialog(this, this.f2437A, this.f2457t, this.f2458u, this.f2459v);
                } catch (Exception e) {
                    instance = Calendar.getInstance();
                    return new DatePickerDialog(this, this.f2437A, instance.get(1), instance.get(2), instance.get(5));
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                return new DatePickerDialog(this, this.f2437A, this.f2460w, this.f2461x, this.f2462y);
            default:
                return null;
        }
        instance = Calendar.getInstance();
        return new DatePickerDialog(this, this.f2437A, instance.get(1), instance.get(2), instance.get(5));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        this.f2438a = i;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                ((DatePickerDialog) dialog).updateDate(this.f2457t, this.f2458u, this.f2459v);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                ((DatePickerDialog) dialog).updateDate(this.f2460w, this.f2461x, this.f2462y);
            default:
        }
    }
}
