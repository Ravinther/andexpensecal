package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.util.Locale;

public class CurrencyConverter extends Activity {
    private Spinner f2627a;
    private Spinner f2628b;
    private TextView f2629c;
    private EditText f2630d;
    private EditText f2631e;
    private TextView f2632f;
    private dh f2633g;
    private double f2634h;
    private String f2635i;
    private String f2636j;
    private String f2637k;
    private Activity f2638l;
    private ro f2639m;

    public CurrencyConverter() {
        this.f2635i = "1";
        this.f2636j = "";
        this.f2638l = this;
    }

    public static String m2541a(double d) {
        DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getInstance(Locale.US);
        decimalFormat.setMaximumFractionDigits(4);
        return decimalFormat.format(d);
    }

    public static String m2544a(String str) {
        return (str == null || "".endsWith(str)) ? str : str.split(":")[1];
    }

    private void m2545a() {
        int a = abd.m3783a(this.f2638l, this.f2639m, "FROM_CURRENCY", 0);
        int a2 = abd.m3783a(this.f2638l, this.f2639m, "TO_CURRENCY", 1);
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, co.f4436j);
        arrayAdapter.setDropDownViewResource(17367049);
        this.f2627a = (Spinner) findViewById(2131558499);
        this.f2627a.setAdapter(arrayAdapter);
        this.f2627a.setSelection(a);
        this.f2628b = (Spinner) findViewById(2131558500);
        this.f2628b.setAdapter(arrayAdapter);
        this.f2628b.setSelection(a2);
        this.f2630d = (EditText) findViewById(2131558503);
        this.f2630d.setText(this.f2635i);
        this.f2631e = (EditText) findViewById(2131558502);
        this.f2631e.requestFocus();
        TextWatcher ddVar = new dd(this);
        this.f2630d.addTextChangedListener(aib.f4143a);
        this.f2630d.addTextChangedListener(ddVar);
        this.f2631e.addTextChangedListener(ddVar);
        ((ImageView) findViewById(2131558501)).setOnClickListener(new de(this));
        Button button = (Button) findViewById(2131558507);
        Button button2 = (Button) findViewById(2131558506);
        aib.m3858a((Context) this, button, -1);
        aib.m3858a((Context) this, button2, -1);
        button.setOnClickListener(new df(this));
        button2.setOnClickListener(new dg(this));
        this.f2629c = (TextView) findViewById(2131558504);
        this.f2632f = (TextView) findViewById(2131558505);
        this.f2633g = new dh(this);
        this.f2633g.execute(new Context[]{this});
    }

    private String m2547b() {
        Exception e;
        String str = "";
        String str2;
        try {
            str2 = aib.m3871c(this.f2627a.getSelectedItem().toString()).split(":")[1];
            str2 = aib.m3855a(str2 + aib.m3871c(this.f2628b.getSelectedItem().toString()).split(":")[1] + "=X", "snl1d1t1", "US");
            if (str2 == null || "".equals(str2)) {
                str2 = abd.m3786a(this.f2638l, this.f2639m, "CURRENCY_RATE", "");
            } else {
                abd.m3811a(this.f2638l, this.f2639m, "expense_preference", "CURRENCY_RATE", str2);
            }
            if (str2 == null || "".equals(str2)) {
                return "";
            }
            String[] split = str2.replaceAll("\"", "").split(",");
            String obj = this.f2630d.getText().toString();
            Double valueOf = Double.valueOf(aib.m3877i(obj));
            this.f2634h = new Double(split[2]).doubleValue();
            this.f2637k = m2541a(valueOf.doubleValue() * this.f2634h);
            str = (obj + " " + m2544a(this.f2627a.getSelectedItem().toString())) + " = ";
            str2 = str + this.f2637k + " " + m2544a(this.f2628b.getSelectedItem().toString());
            try {
                str = m2541a(valueOf.doubleValue() / this.f2634h);
                this.f2636j = obj + " " + m2544a(this.f2628b.getSelectedItem().toString());
                this.f2636j += " = ";
                this.f2636j += str + " " + m2544a(this.f2627a.getSelectedItem().toString());
                return str2;
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return str2;
            }
        } catch (Exception e3) {
            Exception exception = e3;
            str2 = str;
            e = exception;
            e.printStackTrace();
            return str2;
        }
    }

    private String m2550c() {
        String obj;
        Exception e;
        String str = "";
        try {
            String obj2 = this.f2630d.getText().toString();
            obj = this.f2631e.getText().toString();
            if ("".equals(obj2)) {
                if (this.f2629c != null) {
                    this.f2629c.setText(null);
                }
                if (this.f2632f != null) {
                    this.f2632f.setText(null);
                }
                return "";
            }
            if (obj == null || "".equals(obj)) {
                obj = this.f2631e.getHint().toString();
            }
            Double d = new Double(obj);
            Double valueOf = Double.valueOf(aib.m3877i(obj2));
            this.f2637k = m2541a(valueOf.doubleValue() * d.doubleValue());
            obj = ((obj2 + " " + m2544a(this.f2627a.getSelectedItem().toString())) + " = ") + this.f2637k + " " + m2544a(this.f2628b.getSelectedItem().toString());
            try {
                this.f2629c.setText(obj);
                this.f2632f.setText(((obj2 + " " + m2544a(this.f2628b.getSelectedItem().toString())) + " = ") + m2541a(valueOf.doubleValue() / d.doubleValue()) + " " + m2544a(this.f2627a.getSelectedItem().toString()));
                return obj;
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return obj;
            }
        } catch (Exception e3) {
            Exception exception = e3;
            obj = str;
            e = exception;
            e.printStackTrace();
            return obj;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(getResources().getString(2131099784));
        setContentView(2130903061);
        getWindow().setSoftInputMode(3);
        this.f2639m = new ro(this);
        m2545a();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
