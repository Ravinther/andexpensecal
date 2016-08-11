package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.gms.C0607c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseBudgetAdd extends Activity {
    private static boolean f2889p;
    private OnDateSetListener f2890A;
    long f2891a;
    int f2892b;
    private Context f2893c;
    private TextView f2894d;
    private TextView f2895e;
    private TextView f2896f;
    private TextView f2897g;
    private TextView f2898h;
    private Spinner f2899i;
    private EditText f2900j;
    private CheckBox f2901k;
    private EditText f2902l;
    private EditText f2903m;
    private Button f2904n;
    private String f2905o;
    private ro f2906q;
    private CheckBox f2907r;
    private Button f2908s;
    private Button f2909t;
    private int f2910u;
    private int f2911v;
    private int f2912w;
    private int f2913x;
    private int f2914y;
    private int f2915z;

    static {
        f2889p = false;
    }

    public ExpenseBudgetAdd() {
        this.f2893c = this;
        this.f2905o = "Personal Expense";
        this.f2891a = 0;
        this.f2892b = 0;
        this.f2890A = new kr(this);
    }

    public static int m2800a(ro roVar, ArrayList<String> arrayList, Map<String, ArrayList<String>> map) {
        Exception e;
        int count;
        try {
            if (!roVar.m4206d()) {
                roVar.m4193a();
            }
            Cursor c = roVar.m4204c();
            if (c == null || c.getCount() == 0) {
                return 0;
            }
            if (c.moveToFirst()) {
                int columnIndex = c.getColumnIndex("category");
                int columnIndex2 = c.getColumnIndex("subcategory");
                do {
                    String string = c.getString(columnIndex);
                    String string2 = c.getString(columnIndex2);
                    if (arrayList.contains(string)) {
                        ArrayList arrayList2 = (ArrayList) map.get(string);
                        if (!arrayList2.contains(string2)) {
                            arrayList2.add(string2);
                        }
                    } else {
                        arrayList.add(string);
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(string2);
                        map.put(string, arrayList3);
                    }
                } while (c.moveToNext());
            }
            count = c.getCount();
            if (c != null) {
                try {
                    c.close();
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return count;
                }
            }
            roVar.m4201b();
            return count;
        } catch (Exception e3) {
            Exception exception = e3;
            count = 0;
            e = exception;
        }
    }

    private void m2802a() {
        if (this.f2892b == 0) {
            CharSequence a = aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f2910u + "-" + (this.f2911v + 1) + "-" + this.f2912w);
            this.f2909t.setText(a);
            if (!"".equals(a)) {
                this.f2907r.setEnabled(true);
            }
        }
        if (this.f2892b == 1) {
            this.f2908s.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f2913x + "-" + (this.f2914y + 1) + "-" + this.f2915z));
        }
    }

    private void m2804a(String[] strArr, TextView textView, boolean z, String str) {
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
        if (str == null) {
            string = getResources().getString(2131100057);
        } else {
            Object obj = str;
        }
        new Builder(this).setTitle(2131100026).setMultiChoiceItems(strArr, zArr, new ku(this, zArr)).setPositiveButton(2131099983, new kt(this, zArr, strArr, textView, str, z)).setNegativeButton(string, new ks(this, z, textView, str)).show();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(2131099973);
        getWindow().setSoftInputMode(3);
        this.f2906q = new ro(this);
        String stringExtra = getIntent().getStringExtra("rowId");
        if (stringExtra != null) {
            this.f2891a = (long) Integer.valueOf(stringExtra).intValue();
        }
        this.f2905o = getIntent().getStringExtra("account");
        if (this.f2905o == null || "".equals(this.f2905o)) {
            this.f2905o = "Personal Expense";
        }
        setContentView(2130903087);
        boolean booleanExtra = getIntent().getBooleanExtra("isNew", true);
        String string = getResources().getString(2131099719);
        this.f2894d = (TextView) findViewById(2131558476);
        this.f2894d.setText(string);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(2131558473);
        Object a = abd.m3786a(this.f2893c, this.f2906q, "MY_ACCOUNT_NAMES", "Personal Expense");
        if ("All".equals(this.f2905o)) {
            this.f2894d.setText(a);
        }
        relativeLayout.setOnClickListener(new kn(this, a, string));
        ArrayList arrayList = new ArrayList();
        Object hashMap = new HashMap();
        m2800a(this.f2906q, arrayList, hashMap);
        String string2 = getResources().getString(2131099720);
        this.f2895e = (TextView) findViewById(2131558720);
        ((RelativeLayout) findViewById(2131558479)).setOnClickListener(new kv(this, arrayList, string2));
        this.f2896f = (TextView) findViewById(2131558724);
        ((RelativeLayout) findViewById(2131558721)).setOnClickListener(new kw(this, hashMap));
        this.f2897g = (TextView) findViewById(2131558547);
        ((RelativeLayout) findViewById(2131558725)).setOnClickListener(new kx(this));
        this.f2898h = (TextView) findViewById(2131558553);
        ((RelativeLayout) findViewById(2131558726)).setOnClickListener(new ky(this));
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, getResources().getString(2131100020).split(","));
        arrayAdapter.setDropDownViewResource(17367049);
        this.f2899i = (Spinner) findViewById(2131558728);
        this.f2899i.setAdapter(arrayAdapter);
        this.f2899i.setSelection(2);
        this.f2907r = (CheckBox) findViewById(2131558729);
        this.f2907r.setEnabled(false);
        this.f2909t = (Button) findViewById(2131558652);
        this.f2908s = (Button) findViewById(2131558654);
        this.f2909t.setOnClickListener(new kz(this));
        this.f2908s.setOnClickListener(new la(this));
        Calendar instance = Calendar.getInstance();
        this.f2910u = instance.get(1) - 1;
        this.f2911v = instance.get(2);
        this.f2912w = instance.get(5);
        this.f2913x = instance.get(1);
        this.f2914y = instance.get(2);
        this.f2915z = instance.get(5);
        this.f2900j = (EditText) findViewById(2131558503);
        this.f2902l = (EditText) findViewById(2131558730);
        this.f2901k = (CheckBox) findViewById(2131558580);
        this.f2903m = (EditText) findViewById(2131558731);
        Button button = (Button) findViewById(2131558582);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new lb(this));
        button = (Button) findViewById(2131558732);
        aib.m3858a((Context) this, button, 2130837530);
        button.setOnClickListener(new lc(this));
        this.f2904n = (Button) findViewById(2131558583);
        aib.m3858a((Context) this, this.f2904n, -1);
        this.f2904n.setOnClickListener(new ko(this, string, string2, booleanExtra));
        if (booleanExtra) {
            button.setVisibility(8);
            return;
        }
        setTitle(2131099860);
        CharSequence a2 = aib.m3853a(getIntent().getStringExtra("amount"));
        CharSequence a3 = aib.m3853a(getIntent().getStringExtra("category"));
        CharSequence a4 = aib.m3853a(getIntent().getStringExtra("subcategory"));
        int intExtra = getIntent().getIntExtra("period", 2);
        String a5 = aib.m3853a(getIntent().getStringExtra("property"));
        CharSequence a6 = aib.m3853a(getIntent().getStringExtra("property2"));
        CharSequence a7 = aib.m3853a(getIntent().getStringExtra("property3"));
        this.f2899i.setSelection(intExtra);
        if ("All".equalsIgnoreCase(this.f2905o) || "All-1".equalsIgnoreCase(this.f2905o)) {
            this.f2905o = getResources().getString(2131099719);
        }
        if ("All".equalsIgnoreCase(a3) || "All-1".equalsIgnoreCase(a3)) {
            a3 = getResources().getString(2131099720);
        }
        if ("All".equalsIgnoreCase(a4)) {
            a4 = "";
        }
        this.f2894d.setText(this.f2905o);
        this.f2895e.setText(a3);
        this.f2896f.setText(a4);
        this.f2897g.setText(a6);
        this.f2898h.setText(a7);
        this.f2900j.setText(a2);
        this.f2902l.setText(aib.m3853a(getIntent().getStringExtra("alertAmount")));
        this.f2903m.setText(aib.m3853a(getIntent().getStringExtra("description")));
        button.setVisibility(0);
        if ("All-1".equalsIgnoreCase(getIntent().getStringExtra("category"))) {
            this.f2901k.setChecked(true);
            this.f2901k.setVisibility(0);
            if ("All".equalsIgnoreCase(this.f2905o) || "All-1".equalsIgnoreCase(this.f2905o)) {
                this.f2901k.setEnabled(false);
            }
        } else if ("All".equalsIgnoreCase(getIntent().getStringExtra("category"))) {
            this.f2901k.setEnabled(true);
            this.f2901k.setVisibility(0);
        } else {
            this.f2901k.setChecked(false);
            this.f2901k.setVisibility(8);
        }
        String[] split = a5.split(";");
        if (split.length > 0 && !"".equals(split[0])) {
            this.f2909t.setText(aib.m3867b(split[0], "yyyy-MM-dd", ExpenseManager.f3244t));
            this.f2907r.setEnabled(true);
        }
        if (split.length > 1 && !"".equals(split[1])) {
            this.f2908s.setText(aib.m3867b(split[1], "yyyy-MM-dd", ExpenseManager.f3244t));
        }
        if (split.length > 2) {
            this.f2907r.setChecked("YES".equalsIgnoreCase(split[2]));
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
            simpleDateFormat.setLenient(false);
            if (split.length > 0 && !"".equals(split[0])) {
                instance.setTime(simpleDateFormat.parse(split[0]));
                this.f2910u = instance.get(1);
                this.f2911v = instance.get(2);
                this.f2912w = instance.get(5);
            }
            if (split.length > 1 && !"".equals(split[1])) {
                instance.setTime(simpleDateFormat.parse(split[1]));
                this.f2913x = instance.get(1);
                this.f2914y = instance.get(2);
                this.f2915z = instance.get(5);
            }
        } catch (Exception e) {
        }
    }

    protected Dialog onCreateDialog(int i) {
        Calendar instance;
        this.f2892b = i;
        Dialog datePickerDialog;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                try {
                    datePickerDialog = new DatePickerDialog(this, this.f2890A, this.f2910u, this.f2911v, this.f2912w);
                    datePickerDialog.setButton(-2, getString(2131100057), new kp(this));
                    return datePickerDialog;
                } catch (Exception e) {
                    instance = Calendar.getInstance();
                    return new DatePickerDialog(this, this.f2890A, instance.get(1), instance.get(2), instance.get(5));
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                datePickerDialog = new DatePickerDialog(this, this.f2890A, this.f2913x, this.f2914y, this.f2915z);
                datePickerDialog.setButton(-2, getString(2131100057), new kq(this));
                return datePickerDialog;
            default:
                return null;
        }
        instance = Calendar.getInstance();
        return new DatePickerDialog(this, this.f2890A, instance.get(1), instance.get(2), instance.get(5));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 0, 0, 2131100065).setIcon(2130837591).setShowAsAction(2);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f2904n.performClick();
                return true;
            case 16908332:
                onBackPressed();
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        this.f2892b = i;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                ((DatePickerDialog) dialog).updateDate(this.f2910u, this.f2911v, this.f2912w);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                ((DatePickerDialog) dialog).updateDate(this.f2913x, this.f2914y, this.f2915z);
            default:
        }
    }
}
