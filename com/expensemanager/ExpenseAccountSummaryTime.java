package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.expensemanager.caldroid.CaldroidActivity;
import com.google.android.gms.C0607c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ExpenseAccountSummaryTime extends Activity {
    int f2793a;
    ArrayList<String> f2794b;
    ro f2795c;
    ArrayList<String> f2796d;
    String f2797e;
    List<Map<String, Object>> f2798f;
    String f2799g;
    String f2800h;
    String f2801i;
    boolean f2802j;
    private Context f2803k;
    private TextView f2804l;
    private Spinner f2805m;
    private Spinner f2806n;
    private RelativeLayout f2807o;
    private RelativeLayout f2808p;
    private TextView f2809q;
    private TextView f2810r;
    private TextView f2811s;
    private ListView f2812t;
    private cm f2813u;
    private String f2814v;

    public ExpenseAccountSummaryTime() {
        this.f2803k = this;
        this.f2814v = "Personal Expense";
        this.f2793a = 0;
        this.f2794b = new ArrayList();
        this.f2799g = "";
        this.f2800h = "expense";
        this.f2801i = "";
        this.f2802j = false;
    }

    private void m2697a() {
        Object stringExtra = getIntent().getStringExtra("name");
        if (stringExtra != null) {
            if (stringExtra.indexOf(":") == -1) {
                this.f2809q.setText(stringExtra);
                if (this.f2805m.getSelectedItemPosition() == 1) {
                    this.f2809q.setText("Income");
                    this.f2810r.setText(stringExtra);
                }
            } else {
                String[] split = stringExtra.split(":");
                this.f2809q.setText(split[0]);
                if (split.length > 1) {
                    this.f2810r.setText(split[1]);
                }
            }
            getIntent().removeExtra("name");
        }
        try {
            String charSequence;
            String str;
            String str2;
            double d;
            String charSequence2 = this.f2804l.getText().toString();
            this.f2797e = "account in (" + abd.m3792a(charSequence2) + ")";
            this.f2798f = new ArrayList();
            this.f2800h = "expense";
            if (charSequence2 != null && charSequence2.split(",").length > 1) {
                this.f2802j = true;
            }
            int selectedItemPosition = this.f2805m.getSelectedItemPosition();
            String str3 = "expensed DESC";
            if (selectedItemPosition == 0) {
                charSequence = this.f2809q.getText().toString();
                if ("".equals(charSequence)) {
                    this.f2799g = getResources().getString(2131099720);
                } else {
                    this.f2799g = ((String) this.f2805m.getSelectedItem()) + ":" + charSequence;
                }
                if (!(charSequence == null || "".endsWith(charSequence))) {
                    this.f2797e += " and " + "category" + " in (" + abd.m3792a(charSequence.trim()) + ")";
                }
                if ("Income".equals(charSequence.trim())) {
                    this.f2800h = "income";
                } else {
                    this.f2797e += " and " + "category" + "!='Income'";
                    this.f2800h = "expense";
                }
            }
            if (selectedItemPosition == 1) {
                charSequence2 = this.f2809q.getText().toString();
                if (!(charSequence2 == null || "".equals(charSequence2))) {
                    this.f2797e += " and " + "category" + " in (" + abd.m3792a(charSequence2.trim()) + ")";
                }
                charSequence = this.f2810r.getText().toString();
                if (!(charSequence == null || "".equals(charSequence))) {
                    this.f2797e += " and " + "subcategory" + " in (" + abd.m3792a(charSequence.trim()) + ")";
                }
                if ("".equals(charSequence2)) {
                    this.f2799g = getResources().getString(2131099720);
                } else {
                    this.f2799g = charSequence2;
                }
                if (!"".equals(charSequence)) {
                    this.f2799g = charSequence2 + ":" + charSequence;
                } else if ("".equals(charSequence2)) {
                    this.f2799g = getResources().getString(2131099720);
                }
                this.f2800h = "income";
            }
            if (selectedItemPosition == 2) {
                charSequence = this.f2809q.getText().toString();
                if ("".equals(charSequence)) {
                    this.f2799g = (String) this.f2805m.getSelectedItem();
                } else {
                    this.f2799g = ((String) this.f2805m.getSelectedItem()) + ":" + charSequence;
                }
                if (!(charSequence == null || "".endsWith(charSequence))) {
                    this.f2797e += " and " + "property" + " in (" + abd.m3792a(charSequence.trim()) + ")";
                }
                this.f2797e += " and " + "category" + "!='Income'";
            }
            if (selectedItemPosition == 3) {
                charSequence = this.f2809q.getText().toString();
                if ("".equals(charSequence)) {
                    this.f2799g = (String) this.f2805m.getSelectedItem();
                } else {
                    this.f2799g = ((String) this.f2805m.getSelectedItem()) + ":" + charSequence;
                }
                if (!(charSequence == null || "".endsWith(charSequence))) {
                    this.f2797e += " and " + "payment_method" + " in (" + abd.m3792a(charSequence.trim()) + ")";
                }
                this.f2797e += " and " + "category" + "!='Income'";
            }
            if (selectedItemPosition == 4) {
                charSequence = this.f2809q.getText().toString();
                if ("".equals(charSequence)) {
                    this.f2799g = (String) this.f2805m.getSelectedItem();
                } else {
                    this.f2799g = ((String) this.f2805m.getSelectedItem()) + ":" + charSequence;
                }
                if (!(charSequence == null || "".endsWith(charSequence))) {
                    this.f2797e += " and " + "status" + " in (" + abd.m3792a(charSequence.trim()) + ")";
                }
                this.f2797e += " and " + "category" + "!='Income'";
            }
            if (selectedItemPosition == 5) {
                charSequence2 = this.f2809q.getText().toString();
                if ("".equals(charSequence2)) {
                    this.f2799g = getResources().getString(2131099720);
                } else {
                    this.f2799g = charSequence2;
                }
                if (!(charSequence2 == null || "".endsWith(charSequence2))) {
                    this.f2797e += " and " + "expense_tag" + " in (" + abd.m3792a(charSequence2.trim()) + ")";
                }
                this.f2797e += " and " + "category" + "!='Income'";
            }
            if (selectedItemPosition == 6) {
                charSequence2 = this.f2809q.getText().toString();
                if (!(charSequence2 == null || "".equals(charSequence2))) {
                    this.f2797e += " and " + "category" + " in (" + abd.m3792a(charSequence2.trim()) + ")";
                }
                charSequence = this.f2810r.getText().toString();
                if (!(charSequence == null || "".equals(charSequence))) {
                    this.f2797e += " and " + "subcategory" + " in (" + abd.m3792a(charSequence.trim()) + ")";
                }
                this.f2797e += " and " + "category" + "!='Income'";
                if ("".equals(charSequence2)) {
                    this.f2799g = getResources().getString(2131099720);
                } else {
                    this.f2799g = charSequence2;
                }
                if (!"".equals(charSequence)) {
                    this.f2799g = charSequence2 + ":" + charSequence;
                } else if ("".equals(charSequence2)) {
                    this.f2799g = getResources().getString(2131099720);
                }
            }
            if (this.f2806n.getSelectedItemPosition() == 1) {
                abd.m3809a(this.f2795c, this.f2797e, this.f2798f, str3, this.f2802j);
            }
            if (this.f2806n.getSelectedItemPosition() == 0) {
                abd.m3817b(this.f2795c, this.f2797e, this.f2798f, str3, this.f2802j);
            }
            if (this.f2806n.getSelectedItemPosition() == 2) {
                abd.m3819c(this.f2795c, this.f2797e, this.f2798f, str3, this.f2802j);
            }
            this.f2812t = (ListView) findViewById(16908298);
            str3 = "expense";
            if (selectedItemPosition == 1) {
                str = "income";
                str2 = null;
            } else {
                str = null;
                str2 = str3;
            }
            str3 = this.f2806n.getSelectedItemPosition() == 0 ? "dateRange" : "date";
            this.f2813u = new cm(this, this.f2798f, 2130903120, new String[]{str3, str2, str}, new int[]{2131558423, 2131558421, 2131558424});
            this.f2812t.setAdapter(this.f2813u);
            this.f2812t.setOnItemClickListener(new ii(this));
            TextView textView = (TextView) findViewById(2131558896);
            str3 = getResources().getString(2131099956);
            if (this.f2806n.getSelectedItemPosition() == 0) {
                str3 = getResources().getString(2131100165);
            }
            if (this.f2806n.getSelectedItemPosition() == 1) {
                str3 = getResources().getString(2131099956);
            }
            if (this.f2806n.getSelectedItemPosition() == 2) {
                str3 = getResources().getString(2131100179);
            }
            String str4 = str3 + " " + getResources().getString(2131099729) + ": ";
            double d2 = 0.0d;
            double d3 = 0.0d;
            for (int i = 0; i < this.f2798f.size(); i++) {
                Map map = (Map) this.f2798f.get(i);
                charSequence = (String) map.get("expense");
                str3 = (String) map.get("income");
                if (charSequence == null || "".equals(charSequence)) {
                    charSequence = "0";
                }
                d3 += Double.parseDouble(charSequence.replaceAll(",", ""));
                if (str3 == null || "".equals(str3)) {
                    str3 = "0";
                }
                d2 += Double.parseDouble(str3.replaceAll(",", ""));
            }
            if (this.f2798f.size() <= 0) {
                d = 0.0d;
            } else if (selectedItemPosition == 1) {
                d = d2 / ((double) this.f2798f.size());
                textView.setTextColor(-16217592);
                this.f2801i = "" + d2;
            } else {
                d = d3 / ((double) this.f2798f.size());
                textView.setTextColor(co.f4428b);
                this.f2801i = "" + d3;
            }
            str3 = "Total: " + aib.m3850a(d3);
            if (selectedItemPosition == 1) {
                str3 = "Total: " + aib.m3850a(d2);
            }
            textView.setText(str4 + aib.m3850a(d) + "   " + str3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        registerForContextMenu(this.f2812t);
    }

    private void m2699a(String[] strArr, TextView textView) {
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
        new Builder(this).setTitle(2131100026).setMultiChoiceItems(strArr, zArr, new il(this, zArr)).setPositiveButton(2131099983, new ik(this, zArr, strArr, textView)).setNegativeButton(2131100057, new ij(this, textView)).show();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                if (-1 == i2) {
                    m2697a();
                }
            default:
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        Map map = (Map) this.f2798f.get(((AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (menuItem.getItemId() == 1) {
            String[] split;
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this, CaldroidActivity.class);
            if (this.f2806n.getSelectedItemPosition() == 0) {
                split = ((String) map.get("dateRange")).split(" - ");
                try {
                    Date parse = new SimpleDateFormat(ExpenseManager.f3244t).parse(split[0]);
                    Calendar instance = Calendar.getInstance();
                    instance.setTime(parse);
                    bundle.putInt("month", instance.get(2) + 1);
                    bundle.putInt("year", instance.get(1));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (this.f2806n.getSelectedItemPosition() == 1) {
                split = ((String) map.get("date")).split("-");
                bundle.putInt("month", Integer.parseInt(split[1]));
                bundle.putInt("year", Integer.parseInt(split[0]));
            }
            if (this.f2806n.getSelectedItemPosition() == 2) {
                String str = (String) map.get("date");
                str.split("-");
                bundle.putInt("month", 1);
                bundle.putInt("year", Integer.parseInt(str));
            }
            bundle.putString("account", this.f2804l.getText().toString().split(",")[0]);
            intent.putExtras(bundle);
            startActivity(intent);
        }
        return super.onContextItemSelected(menuItem);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(2131099686);
        getWindow().setSoftInputMode(3);
        Resources resources = this.f2803k.getResources();
        this.f2795c = new ro(this);
        this.f2814v = getIntent().getStringExtra("account");
        if (this.f2814v == null || "".equals(this.f2814v)) {
            this.f2814v = "Personal Expense";
        }
        setContentView(2130903122);
        this.f2804l = (TextView) findViewById(2131558476);
        this.f2804l.setText(this.f2814v);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(2131558473);
        String[] split = abd.m3786a(this.f2803k, this.f2795c, "MY_ACCOUNT_NAMES", "Personal Expense").split(",");
        relativeLayout.setOnClickListener(new ia(this, split, new ArrayList(Arrays.asList(split))));
        this.f2796d = new ArrayList(Arrays.asList(new String[]{resources.getString(2131100165), resources.getString(2131099956), resources.getString(2131100179)}));
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, this.f2796d);
        arrayAdapter.setDropDownViewResource(17367049);
        this.f2806n = (Spinner) findViewById(2131558895);
        this.f2806n.setAdapter(arrayAdapter);
        this.f2806n.setSelection(getIntent().getIntExtra("timeMode", 1));
        this.f2806n.setOnItemSelectedListener(new ie(this));
        this.f2796d = new ArrayList(Arrays.asList(new String[]{resources.getString(2131099755), resources.getString(2131099932), resources.getString(2131100007), resources.getString(2131100011), resources.getString(2131100101), resources.getString(2131100110), resources.getString(2131100106)}));
        arrayAdapter = new ArrayAdapter(this, 2130903151, this.f2796d);
        arrayAdapter.setDropDownViewResource(17367049);
        this.f2805m = (Spinner) findViewById(2131558766);
        this.f2805m.setAdapter(arrayAdapter);
        this.f2805m.setSelection(getIntent().getIntExtra("typeId", 0));
        this.f2805m.setOnItemSelectedListener(new C0449if(this, resources));
        this.f2811s = (TextView) findViewById(2131558541);
        this.f2809q = (TextView) findViewById(2131558720);
        this.f2807o = (RelativeLayout) findViewById(2131558479);
        this.f2807o.setOnClickListener(new ig(this));
        this.f2810r = (TextView) findViewById(2131558724);
        this.f2808p = (RelativeLayout) findViewById(2131558721);
        this.f2808p.setOnClickListener(new ih(this));
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        CharSequence charSequence;
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        Map map = (Map) this.f2798f.get(((AdapterContextMenuInfo) contextMenuInfo).position);
        String str = (String) map.get("date");
        if (this.f2806n.getSelectedItemPosition() == 0) {
            charSequence = (String) map.get("dateRange");
        } else {
            Object obj = str;
        }
        contextMenu.setHeaderTitle(charSequence);
        contextMenu.add(0, 1, 0, 2131099751);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492887, menu);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        String charSequence;
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                return true;
            case 2131558471:
                charSequence = this.f2804l.getText().toString();
                Collections.reverse(this.f2798f);
                ChartNewPeriod.m2467a(this.f2803k, this.f2798f, this.f2801i, this.f2800h, this.f2799g, charSequence, this.f2797e, (String) this.f2806n.getSelectedItem());
                return true;
            case 2131559127:
                String str;
                String str2;
                boolean z = this.f2805m.getSelectedItemPosition() == 8 || this.f2805m.getSelectedItemPosition() == 1;
                List a = abd.m3801a(this.f2798f, z, this.f2806n.getSelectedItemPosition() == 0 ? "dateRange" : "date");
                String str3 = "expense";
                if (this.f2805m.getSelectedItemPosition() == 1) {
                    str = "income";
                    str2 = null;
                } else {
                    str = null;
                    str2 = str3;
                }
                this.f2813u = new cm(this, a, 2130903120, new String[]{charSequence, str2, str}, new int[]{2131558423, 2131558421, 2131558424});
                this.f2812t.setAdapter(this.f2813u);
                this.f2813u.notifyDataSetChanged();
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
