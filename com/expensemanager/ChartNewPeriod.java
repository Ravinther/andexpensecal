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
import java.util.Map;

public class ChartNewPeriod extends Activity {
    int f2534a;
    ArrayList<String> f2535b;
    ro f2536c;
    ArrayList<String> f2537d;
    boolean f2538e;
    private Context f2539f;
    private TextView f2540g;
    private TextView f2541h;
    private TextView f2542i;
    private RadioButton f2543j;
    private RadioButton f2544k;
    private RadioButton f2545l;
    private Spinner f2546m;
    private RelativeLayout f2547n;
    private RelativeLayout f2548o;
    private TextView f2549p;
    private TextView f2550q;
    private TextView f2551r;
    private int f2552s;
    private int f2553t;
    private int f2554u;
    private int f2555v;
    private int f2556w;
    private int f2557x;
    private String f2558y;
    private OnDateSetListener f2559z;

    public ChartNewPeriod() {
        this.f2539f = this;
        this.f2558y = "Personal Expense";
        this.f2534a = 0;
        this.f2535b = new ArrayList();
        this.f2538e = false;
        this.f2559z = new bn(this);
    }

    private void m2466a() {
        this.f2540g.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f2552s + "-" + (this.f2553t + 1) + "-" + this.f2554u));
        this.f2541h.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f2555v + "-" + (this.f2556w + 1) + "-" + this.f2557x));
    }

    public static void m2467a(Context context, List<Map<String, Object>> list, String str, String str2, String str3, String str4, String str5, String str6) {
        if (list != null && list.size() != 0) {
            String[] strArr = new String[list.size()];
            String str7 = "";
            String str8 = "";
            double d = 0.0d;
            int i = 0;
            while (i < list.size()) {
                String replaceAll;
                Map map = (Map) list.get(i);
                String a = aba.m3756a((String) map.get("amount"));
                String a2 = aba.m3756a((String) map.get("expenseDate"));
                if (!str2.equals("CATEGORY_VIEW")) {
                    a2 = aba.m3756a((String) map.get("date"));
                }
                if ("expense".equalsIgnoreCase(str2)) {
                    replaceAll = aba.m3756a((String) map.get("expense")).replaceAll(",", "");
                    d = aba.m3742a(d, replaceAll);
                } else {
                    replaceAll = a;
                }
                if ("income".equalsIgnoreCase(str2)) {
                    replaceAll = aba.m3756a((String) map.get("income")).replaceAll(",", "");
                    d = aba.m3742a(d, replaceAll);
                }
                if ("balance".equalsIgnoreCase(str2)) {
                    replaceAll = aba.m3756a((String) map.get("subTotal"));
                    if (replaceAll.indexOf("(") != -1) {
                        replaceAll = replaceAll.replace("(", "-").replace(")", "");
                    }
                }
                replaceAll = replaceAll.replaceAll(",", "");
                if (replaceAll.indexOf("-") != -1) {
                    replaceAll = aba.m3767b(replaceAll.replace("-", "")).replaceAll(",", "");
                }
                if (i != 0) {
                    a2 = str8 + "," + a2;
                    replaceAll = str7 + "," + replaceAll;
                }
                if ("weekly".equalsIgnoreCase(str6)) {
                    strArr[i] = aba.m3756a((String) map.get("dateRange"));
                }
                i++;
                str7 = replaceAll;
                str8 = a2;
            }
            String a3 = aba.m3746a(d);
            Intent intent = new Intent(context, ChartNewPeriodChart.class);
            Bundle bundle = new Bundle();
            bundle.putString("xStr", str8);
            bundle.putString("yStr", str7);
            bundle.putString("total", a3);
            bundle.putString("title", str3);
            bundle.putString("viewType", str2);
            bundle.putString("dateType", str6);
            bundle.putString("account", str4);
            bundle.putString("whereClause", str5);
            bundle.putStringArray("dateRange", strArr);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    private void m2469a(String[] strArr, TextView textView) {
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
        new Builder(this).setTitle(2131100026).setMultiChoiceItems(strArr, zArr, new bf(this, zArr)).setPositiveButton(2131099983, new be(this, zArr, strArr, textView)).setNegativeButton(2131100057, new bd(this, textView)).show();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(getResources().getString(2131099966));
        getWindow().setSoftInputMode(3);
        Resources resources = this.f2539f.getResources();
        this.f2536c = new ro(this);
        this.f2558y = getIntent().getStringExtra("account");
        if (this.f2558y == null || "".equals(this.f2558y)) {
            this.f2558y = "Personal Expense";
        }
        setContentView(2130903094);
        this.f2542i = (TextView) findViewById(2131558476);
        this.f2542i.setText(this.f2558y);
        ImageButton imageButton = (ImageButton) findViewById(2131558475);
        CharSequence a = abd.m3786a(this.f2539f, this.f2536c, "MY_ACCOUNT_NAMES", "Personal Expense");
        String[] split = a.split(",");
        ArrayList arrayList = new ArrayList(Arrays.asList(split));
        if ("All".equalsIgnoreCase(this.f2558y)) {
            this.f2542i.setText(a);
        }
        imageButton.setOnClickListener(new az(this, split, arrayList));
        ((ImageButton) findViewById(2131558658)).setOnClickListener(new bg(this));
        this.f2540g = (TextView) findViewById(2131558652);
        this.f2541h = (TextView) findViewById(2131558654);
        ((ImageButton) findViewById(2131558762)).setOnClickListener(new bh(this));
        Calendar instance = Calendar.getInstance();
        this.f2552s = instance.get(1) - 1;
        this.f2553t = instance.get(2);
        this.f2554u = instance.get(5);
        this.f2555v = instance.get(1);
        this.f2556w = instance.get(2);
        this.f2557x = instance.get(5);
        m2466a();
        this.f2537d = new ArrayList(Arrays.asList(new String[]{resources.getString(2131099755), resources.getString(2131100106), resources.getString(2131100007), resources.getString(2131100011)}));
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, this.f2537d);
        arrayAdapter.setDropDownViewResource(17367049);
        this.f2546m = (Spinner) findViewById(2131558766);
        this.f2546m.setAdapter(arrayAdapter);
        this.f2546m.setOnItemSelectedListener(new bi(this, resources));
        this.f2543j = (RadioButton) findViewById(2131558647);
        this.f2544k = (RadioButton) findViewById(2131558648);
        this.f2545l = (RadioButton) findViewById(2131558649);
        this.f2551r = (TextView) findViewById(2131558541);
        this.f2549p = (TextView) findViewById(2131558720);
        this.f2547n = (RelativeLayout) findViewById(2131558479);
        this.f2547n.setOnClickListener(new bj(this));
        this.f2550q = (TextView) findViewById(2131558724);
        this.f2548o = (RelativeLayout) findViewById(2131558721);
        this.f2548o.setOnClickListener(new bk(this));
        Button button = (Button) findViewById(2131558449);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new bl(this));
        button = (Button) findViewById(2131558516);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new bm(this));
    }

    protected Dialog onCreateDialog(int i) {
        Calendar instance;
        this.f2534a = i;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                try {
                    return new DatePickerDialog(this, this.f2559z, this.f2552s, this.f2553t, this.f2554u);
                } catch (Exception e) {
                    instance = Calendar.getInstance();
                    return new DatePickerDialog(this, this.f2559z, instance.get(1), instance.get(2), instance.get(5));
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                return new DatePickerDialog(this, this.f2559z, this.f2555v, this.f2556w, this.f2557x);
            default:
                return null;
        }
        instance = Calendar.getInstance();
        return new DatePickerDialog(this, this.f2559z, instance.get(1), instance.get(2), instance.get(5));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        this.f2534a = i;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                ((DatePickerDialog) dialog).updateDate(this.f2552s, this.f2553t, this.f2554u);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                ((DatePickerDialog) dialog).updateDate(this.f2555v, this.f2556w, this.f2557x);
            default:
        }
    }
}
