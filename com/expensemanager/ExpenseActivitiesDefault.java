package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.gms.C0607c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class ExpenseActivitiesDefault extends Activity {
    int f2838a;
    ro f2839b;
    private Context f2840c;
    private Button f2841d;
    private Button f2842e;
    private RadioButton f2843f;
    private RadioButton f2844g;
    private RadioButton f2845h;
    private RadioButton f2846i;
    private RadioButton f2847j;
    private RadioButton f2848k;
    private TextView f2849l;
    private TextView f2850m;
    private CheckBox f2851n;
    private int f2852o;
    private int f2853p;
    private int f2854q;
    private int f2855r;
    private int f2856s;
    private int f2857t;
    private String f2858u;
    private OnDateSetListener f2859v;

    public ExpenseActivitiesDefault() {
        this.f2840c = this;
        this.f2858u = "Personal Expense";
        this.f2838a = 0;
        this.f2859v = new jl(this);
    }

    public static String m2735a(Context context, String str) {
        String string;
        String str2 = "";
        SharedPreferences sharedPreferences = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        int i = sharedPreferences.getInt(str + "_" + "ACTIVITY_DEFAULT_DATE", 0);
        if (i == 0) {
            str2 = "expensed<=" + aib.m3847a();
        }
        if (i == 1) {
            str2 = aba.m3771c(0, str, 0);
        }
        if (i == 2) {
            Calendar instance = Calendar.getInstance();
            instance.set(6, 1);
            str2 = "expensed>=" + instance.getTimeInMillis() + " and " + "expensed" + "<=" + aib.m3847a();
        }
        if (i == 3) {
            instance = Calendar.getInstance();
            instance.add(2, -1);
            str2 = "expensed>=" + instance.getTimeInMillis() + " and " + "expensed" + "<=" + aib.m3847a();
        }
        if (i == 4) {
            string = sharedPreferences.getString(str + "_" + "ACTIVITY_DEFAULT_FROM_DATE", "");
            String string2 = sharedPreferences.getString(str + "_" + "ACTIVITY_DEFAULT_TO_DATE", "");
            try {
                string = "expensed>=" + abd.m3818c(string) + " and " + "expensed" + "<=" + abd.m3820d(string2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (i == 5) {
                instance = Calendar.getInstance();
                if (instance.get(5) < ExpenseManager.f3242r) {
                    instance.add(2, -1);
                }
                instance.set(5, ExpenseManager.f3242r);
                long timeInMillis = instance.getTimeInMillis();
                instance.add(2, 1);
                instance.set(11, 0);
                instance.set(12, 0);
                instance.set(13, 0);
                string = "expensed>=" + timeInMillis + " and " + "expensed" + "<" + instance.getTimeInMillis();
            }
            str2 = sharedPreferences.getString(str + "_" + "ACTIVITY_DEFAULT_STATUS", "");
            if (!(str2 == null || "".endsWith(str2))) {
                string = string + " and " + "status" + " in (" + abd.m3792a(str2.trim()) + ")";
            }
            return ("All".equals(str) || i == 1) ? string : "account='" + str + "' and " + string;
        }
        string = str2;
        if (i == 5) {
            instance = Calendar.getInstance();
            if (instance.get(5) < ExpenseManager.f3242r) {
                instance.add(2, -1);
            }
            instance.set(5, ExpenseManager.f3242r);
            long timeInMillis2 = instance.getTimeInMillis();
            instance.add(2, 1);
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            string = "expensed>=" + timeInMillis2 + " and " + "expensed" + "<" + instance.getTimeInMillis();
        }
        str2 = sharedPreferences.getString(str + "_" + "ACTIVITY_DEFAULT_STATUS", "");
        string = string + " and " + "status" + " in (" + abd.m3792a(str2.trim()) + ")";
        if ("All".equals(str)) {
            return string;
        }
    }

    private void m2737a() {
        this.f2841d.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f2852o + "-" + (this.f2853p + 1) + "-" + this.f2854q));
        this.f2842e.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f2855r + "-" + (this.f2856s + 1) + "-" + this.f2857t));
    }

    private void m2739a(String[] strArr, TextView textView) {
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
        new Builder(this).setTitle(2131100026).setMultiChoiceItems(strArr, zArr, new je(this, zArr)).setPositiveButton(2131099983, new jd(this, zArr, strArr, textView)).setNegativeButton(2131100057, new jm(this, textView)).show();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle) {
        CharSequence string;
        CharSequence string2;
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903081);
        this.f2839b = new ro(this);
        this.f2858u = getIntent().getStringExtra("account");
        if (this.f2858u == null || "".equals(this.f2858u)) {
            this.f2858u = "Personal Expense";
        }
        setTitle(this.f2858u);
        this.f2841d = (Button) findViewById(2131558652);
        this.f2842e = (Button) findViewById(2131558654);
        this.f2841d.setOnClickListener(new jc(this));
        this.f2842e.setOnClickListener(new jf(this));
        Calendar instance = Calendar.getInstance();
        this.f2852o = instance.get(1) - 1;
        this.f2853p = instance.get(2);
        this.f2854q = instance.get(5);
        this.f2855r = instance.get(1);
        this.f2856s = instance.get(2);
        this.f2857t = instance.get(5);
        m2737a();
        this.f2843f = (RadioButton) findViewById(2131558677);
        this.f2844g = (RadioButton) findViewById(2131558678);
        this.f2845h = (RadioButton) findViewById(2131558679);
        this.f2846i = (RadioButton) findViewById(2131558680);
        this.f2848k = (RadioButton) findViewById(2131558681);
        this.f2847j = (RadioButton) findViewById(2131558682);
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        int i = sharedPreferences.getInt(this.f2858u + "_" + "ACTIVITY_DEFAULT_DATE", 0);
        if (i == 0) {
            this.f2843f.setChecked(true);
        }
        if (i == 1) {
            this.f2844g.setChecked(true);
        }
        if (i == 2) {
            this.f2845h.setChecked(true);
        }
        if (i == 3) {
            this.f2846i.setChecked(true);
        }
        if (i == 4) {
            this.f2847j.setChecked(true);
            string = sharedPreferences.getString(this.f2858u + "_" + "ACTIVITY_DEFAULT_FROM_DATE", "");
            string2 = sharedPreferences.getString(this.f2858u + "_" + "ACTIVITY_DEFAULT_TO_DATE", "");
            if ("".equals(string) && "".equals(string2)) {
                m2737a();
            } else {
                this.f2841d.setText(string);
                this.f2842e.setText(string2);
            }
        }
        if (i == 5) {
            this.f2848k.setChecked(true);
        }
        string = sharedPreferences.getString(this.f2858u + "_" + "ACTIVITY_DEFAULT_STATUS", "");
        string2 = sharedPreferences.getString(this.f2858u + "_" + "ACTIVITY_DEFAULT_STATUS_HIGHLIGHT", "");
        this.f2849l = (TextView) findViewById(2131558685);
        this.f2849l.setText(string);
        this.f2849l.setOnClickListener(new jg(this));
        this.f2850m = (TextView) findViewById(2131558687);
        this.f2850m.setText(string2);
        this.f2850m.setOnClickListener(new jh(this));
        this.f2851n = (CheckBox) findViewById(2131558688);
        this.f2851n.setChecked(sharedPreferences.getBoolean("transaction_time", false));
        Button button = (Button) findViewById(2131558689);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new ji(this));
        button = (Button) findViewById(2131558506);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new jj(this));
        button = (Button) findViewById(2131558507);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new jk(this, sharedPreferences));
    }

    protected Dialog onCreateDialog(int i) {
        Calendar instance;
        this.f2838a = i;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                try {
                    return new DatePickerDialog(this, this.f2859v, this.f2852o, this.f2853p, this.f2854q);
                } catch (Exception e) {
                    instance = Calendar.getInstance();
                    return new DatePickerDialog(this, this.f2859v, instance.get(1), instance.get(2), instance.get(5));
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                return new DatePickerDialog(this, this.f2859v, this.f2855r, this.f2856s, this.f2857t);
            default:
                return null;
        }
        instance = Calendar.getInstance();
        return new DatePickerDialog(this, this.f2859v, instance.get(1), instance.get(2), instance.get(5));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        this.f2838a = i;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                ((DatePickerDialog) dialog).updateDate(this.f2852o, this.f2853p, this.f2854q);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                ((DatePickerDialog) dialog).updateDate(this.f2855r, this.f2856s, this.f2857t);
            default:
        }
    }
}
