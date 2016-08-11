package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
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

public class WidgetConfigureSummary extends Activity {
    private static String[] f3738d;
    private static TextView f3739e;
    private static Spinner f3740j;
    private static String f3741o;
    int f3742a;
    OnClickListener f3743b;
    private int f3744c;
    private RadioButton f3745f;
    private RadioButton f3746g;
    private RadioButton f3747h;
    private RadioButton f3748i;
    private Button f3749k;
    private Button f3750l;
    private int f3751m;
    private Spinner f3752n;
    private String f3753p;
    private OnDateSetListener f3754q;

    static {
        f3741o = "category";
    }

    public WidgetConfigureSummary() {
        this.f3744c = 0;
        this.f3751m = 0;
        this.f3742a = 0;
        this.f3753p = null;
        this.f3754q = new ais(this);
        this.f3743b = new ait(this);
    }

    static String m3709a(Context context, int i) {
        return context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getString("widget_" + i, "");
    }

    private void m3711a(int i, int i2, int i3, Button button) {
        CharSequence b = aib.m3867b(i + "-" + (i2 + 1) + "-" + i3, "yyyy-MM-dd", ExpenseManager.f3244t);
        if (!button.getText().toString().equals(b)) {
            button.setText(b);
        }
    }

    static void m3712a(Context context, int i, String str) {
        Editor edit = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).edit();
        edit.putString("widget_" + i, str);
        edit.commit();
    }

    private void m3716a(String[] strArr, TextView textView) {
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
        new Builder(this).setTitle(2131100026).setMultiChoiceItems(strArr, zArr, new aiw(this, zArr)).setPositiveButton(2131099983, new aiv(this, zArr, strArr, textView)).setNegativeButton(2131099754, new aiu(this)).show();
    }

    private void m3720c() {
        setContentView(2130903172);
        aib.m3858a((Context) this, (Button) findViewById(2131558449), -1);
        findViewById(2131558449).setOnClickListener(this.f3743b);
        String a = abd.m3786a((Context) this, new ro(this), "MY_ACCOUNT_NAMES", "Personal Expense");
        f3738d = a.split(",");
        f3739e = (TextView) findViewById(2131558476);
        f3739e.setText(f3738d[0]);
        ((RelativeLayout) findViewById(2131558473)).setOnClickListener(new aiz(this, a));
        Resources resources = getResources();
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, new ArrayList(Arrays.asList(new String[]{resources.getString(2131099755), resources.getString(2131099932), resources.getString(2131100007), resources.getString(2131100011), resources.getString(2131100101), resources.getString(2131100110), resources.getString(2131100106), resources.getString(2131099757), resources.getString(2131099935)})));
        arrayAdapter.setDropDownViewResource(17367049);
        f3740j = (Spinner) findViewById(2131558644);
        f3740j.setAdapter(arrayAdapter);
        f3740j.setOnItemSelectedListener(new aja(this));
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558650);
        this.f3745f = (RadioButton) findViewById(2131558646);
        this.f3746g = (RadioButton) findViewById(2131558647);
        this.f3747h = (RadioButton) findViewById(2131558648);
        this.f3748i = (RadioButton) findViewById(2131558649);
        this.f3745f.setOnClickListener(new ajb(this, linearLayout));
        this.f3746g.setOnClickListener(new ajc(this, linearLayout));
        this.f3747h.setOnClickListener(new ajd(this, linearLayout));
        this.f3748i.setOnClickListener(new aje(this, linearLayout));
        this.f3752n = (Spinner) findViewById(2131559103);
        SpinnerAdapter arrayAdapter2 = new ArrayAdapter(this, 2130903151, getResources().getString(2131099749).split(","));
        arrayAdapter2.setDropDownViewResource(17367049);
        this.f3752n.setAdapter(arrayAdapter2);
        this.f3749k = (Button) findViewById(2131558652);
        this.f3750l = (Button) findViewById(2131558654);
        this.f3749k.setOnClickListener(new aiq(this));
        this.f3750l.setOnClickListener(new air(this));
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f3744c = extras.getInt("appWidgetId", 0);
            a = sharedPreferences.getString("widget_" + this.f3744c, null);
            if (a != null) {
                String[] split = a.split(";");
                this.f3753p = split[0];
                f3739e.setText(this.f3753p);
                f3740j.setSelection(Integer.parseInt(split[1]));
                this.f3751m = Integer.parseInt(split[2]);
                if (this.f3751m == 0) {
                    this.f3745f.setChecked(true);
                    String str = split[3];
                    if (!"NO".equalsIgnoreCase(str)) {
                        String[] split2 = str.split(",");
                        this.f3749k.setText(split2[0]);
                        this.f3750l.setText(split2[1]);
                    }
                }
                if (this.f3751m == 1) {
                    this.f3746g.setChecked(true);
                }
                if (this.f3751m == 2) {
                    this.f3747h.setChecked(true);
                }
                if (this.f3751m == 3) {
                    this.f3748i.setChecked(true);
                }
                if (this.f3751m == 0) {
                    linearLayout.setVisibility(0);
                } else {
                    linearLayout.setVisibility(8);
                }
                this.f3752n.setSelection(Integer.parseInt(split[4]));
            }
        }
        if (this.f3744c == 0) {
            finish();
        }
    }

    private void m3722d() {
        finish();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setResult(0);
        if (VERSION.SDK_INT < 14) {
            aib.m3849a(this, null, "Alert", 17301543, "This widget supports Android version 4.0 and above only.", "OK", new aip(this), null, null).show();
        } else if (getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getBoolean("ENABLE_SECURITY", false)) {
            adl com_expensemanager_adl = new adl(this);
            com_expensemanager_adl.requestWindowFeature(1);
            OnCancelListener com_expensemanager_aix = new aix(this);
            OnDismissListener com_expensemanager_aiy = new aiy(this);
            com_expensemanager_adl.setOnCancelListener(com_expensemanager_aix);
            com_expensemanager_adl.setOnDismissListener(com_expensemanager_aiy);
            com_expensemanager_adl.show();
        } else {
            m3720c();
        }
    }

    protected Dialog onCreateDialog(int i) {
        this.f3742a = i;
        Calendar instance = Calendar.getInstance();
        int i2 = instance.get(1);
        int i3 = instance.get(2);
        int i4 = instance.get(5);
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                try {
                    return new DatePickerDialog(this, this.f3754q, i2, i3, i4);
                } catch (Exception e) {
                    return new DatePickerDialog(this, this.f3754q, instance.get(1), instance.get(2), instance.get(5));
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                return new DatePickerDialog(this, this.f3754q, i2, i3, i4);
            default:
                return null;
        }
        return new DatePickerDialog(this, this.f3754q, instance.get(1), instance.get(2), instance.get(5));
    }
}
