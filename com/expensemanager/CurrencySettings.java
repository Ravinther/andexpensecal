package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;

public class CurrencySettings extends Activity {
    HashMap<String, String> f2640a;
    private Spinner f2641b;
    private LinearLayout f2642c;
    private dm f2643d;
    private String f2644e;
    private Activity f2645f;
    private ro f2646g;
    private ArrayList<String> f2647h;
    private ArrayList<String> f2648i;
    private String f2649j;
    private String[] f2650k;

    public CurrencySettings() {
        this.f2644e = "USD";
        this.f2645f = this;
        this.f2647h = new ArrayList();
        this.f2648i = new ArrayList();
        this.f2640a = new HashMap();
    }

    private void m2562a() {
        int a;
        this.f2649j = abd.m3786a(this.f2645f, this.f2646g, "MY_ACCOUNT_NAMES", "Personal Expense");
        this.f2650k = this.f2649j.split(",");
        int a2 = abd.m3783a(this.f2645f, this.f2646g, "BASE_CURRENCY_INDEX", -1);
        if (a2 == -1) {
            a = abd.m3783a(this.f2645f, this.f2646g, "Default_Account_Index", -1);
            String str = this.f2650k[0];
            if (this.f2650k != null && a < this.f2650k.length && a >= 0) {
                str = this.f2650k[a];
            }
            a = abd.m3783a(this.f2645f, this.f2646g, str + "_CURRENCY", -1);
        } else {
            a = a2;
        }
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, co.f4436j);
        arrayAdapter.setDropDownViewResource(17367049);
        this.f2641b = (Spinner) findViewById(2131558508);
        this.f2641b.setAdapter(arrayAdapter);
        this.f2641b.setSelection(a);
        Button button = (Button) findViewById(2131558507);
        Button button2 = (Button) findViewById(2131558506);
        aib.m3858a((Context) this, button, -1);
        aib.m3858a((Context) this, button2, -1);
        button.setOnClickListener(new dk(this));
        button2.setOnClickListener(new dl(this));
        m2564b();
    }

    private void m2564b() {
        View textView;
        View textView2;
        this.f2644e = aib.m3851a(this.f2641b.getSelectedItemPosition());
        this.f2642c = (LinearLayout) findViewById(2131558509);
        if (this.f2642c.getChildCount() > 0) {
            this.f2642c.removeAllViews();
        }
        int i = 0;
        while (this.f2650k != null && i < this.f2650k.length) {
            String a = aib.m3851a(abd.m3783a(this.f2645f, this.f2646g, this.f2650k[i] + "_CURRENCY", -1));
            if (!("".equals(aib.m3865b(this.f2644e)) || this.f2644e.equalsIgnoreCase(a))) {
                a = this.f2644e + "/" + a;
                if (!this.f2647h.contains(a)) {
                    this.f2647h.add(a);
                }
                this.f2648i.add(this.f2650k[i]);
            }
            i++;
        }
        float f = getResources().getDisplayMetrics().density;
        if (this.f2647h.size() > 0) {
            View linearLayout = new LinearLayout(this);
            linearLayout.setPadding(0, 0, 0, 5);
            linearLayout.setOrientation(0);
            View textView3 = new TextView(this);
            textView3.setWidth(Math.round(85.0f * f));
            textView3.setText(2131099781);
            textView3.setTypeface(null, 1);
            textView = new TextView(this);
            textView.setWidth(Math.round(100.0f * f));
            textView.setText(2131099989);
            textView.setTypeface(null, 1);
            textView2 = new TextView(this);
            textView2.setWidth(Math.round(100.0f * f));
            textView2.setText(2131099971);
            textView2.setTypeface(null, 1);
            if ((getResources().getConfiguration().screenLayout & 15) == 4 || (getResources().getConfiguration().screenLayout & 15) == 3) {
                textView3.setTextSize(24.0f);
                textView.setTextSize(24.0f);
                textView2.setTextSize(24.0f);
                textView3.setWidth(200);
                textView.setWidth(200);
                textView2.setWidth(200);
            }
            linearLayout.addView(textView3, new LayoutParams(-2, -2));
            linearLayout.addView(textView, new LayoutParams(-2, -2));
            linearLayout.addView(textView2, new LayoutParams(-2, -2));
            this.f2642c.addView(linearLayout, new LayoutParams(-1, -2));
        }
        for (int i2 = 0; i2 < this.f2647h.size(); i2++) {
            textView = new LinearLayout(this);
            textView.setOrientation(0);
            textView2 = new TextView(this);
            textView2.setWidth(Math.round(85.0f * f));
            textView2.setText((CharSequence) this.f2647h.get(i2));
            View textView4 = new TextView(this);
            textView4.setWidth(Math.round(100.0f * f));
            textView4.setText(2131099946);
            textView4.setId(i2);
            View editText = new EditText(this);
            editText.setRawInputType(8194);
            editText.setWidth(Math.round(100.0f * f));
            CharSequence a2 = abd.m3786a(this.f2645f, this.f2646g, ((String) this.f2647h.get(i2)).replace("/", ""), "");
            if (!"".equals(a2)) {
                editText.setText(a2);
            }
            if ((getResources().getConfiguration().screenLayout & 15) == 4 || (getResources().getConfiguration().screenLayout & 15) == 3) {
                textView2.setTextSize(24.0f);
                textView4.setTextSize(24.0f);
                textView2.setWidth(200);
                textView4.setWidth(200);
                editText.setTextSize(24.0f);
                editText.setWidth(200);
            }
            textView.addView(textView2, new LayoutParams(-2, -2));
            textView.addView(textView4, new LayoutParams(-2, -2));
            textView.addView(editText, new LayoutParams(-2, -2));
            this.f2642c.addView(textView, new LayoutParams(-1, -2));
        }
        if (this.f2647h.size() > 0) {
            linearLayout = new TextView(this);
            linearLayout.setText(2131099786);
            linearLayout.setTypeface(null, 2);
            if ((getResources().getConfiguration().screenLayout & 15) == 4) {
                linearLayout.setTextSize(25.0f);
            }
            this.f2642c.addView(linearLayout, new LayoutParams(-1, -2));
        }
        this.f2643d = new dm(this);
        this.f2643d.execute(new Context[]{this});
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(getResources().getString(2131099781));
        setContentView(2130903062);
        getWindow().setSoftInputMode(3);
        this.f2646g = new ro(this);
        m2562a();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
