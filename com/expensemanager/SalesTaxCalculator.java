package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SalesTaxCalculator extends Activity {
    TextView f3582a;
    TextView f3583b;
    TextView f3584c;
    EditText f3585d;
    EditText f3586e;
    EditText f3587f;
    LinearLayout f3588g;
    private Activity f3589h;

    public SalesTaxCalculator() {
        this.f3589h = this;
    }

    private void m3552a() {
        this.f3588g = (LinearLayout) findViewById(2131558495);
        Button button = (Button) findViewById(2131558493);
        this.f3585d = (EditText) findViewById(2131558974);
        this.f3586e = (EditText) findViewById(2131558557);
        this.f3587f = (EditText) findViewById(2131558976);
        this.f3582a = (TextView) findViewById(2131558982);
        this.f3583b = (TextView) findViewById(2131558979);
        this.f3584c = (TextView) findViewById(2131558980);
        TextWatcher com_expensemanager_afe = new afe(this);
        this.f3585d.addTextChangedListener(aib.f4143a);
        this.f3585d.addTextChangedListener(com_expensemanager_afe);
        this.f3586e.addTextChangedListener(com_expensemanager_afe);
        this.f3587f.addTextChangedListener(com_expensemanager_afe);
        button.setOnClickListener(new aff(this));
        button = (Button) findViewById(2131558507);
        Button button2 = (Button) findViewById(2131558506);
        aib.m3858a((Context) this, button, -1);
        aib.m3858a((Context) this, button2, -1);
        button.setOnClickListener(new afg(this));
        button2.setOnClickListener(new afh(this));
    }

    private void m3555b() {
        if (!this.f3585d.getText().toString().equals("")) {
            String obj = this.f3586e.getText().toString();
            if (obj == null || obj.equals("")) {
                obj = "0";
            }
            String obj2 = this.f3587f.getText().toString();
            if (obj2 == null || obj2.equals("")) {
                obj2 = "0";
            }
            this.f3588g.setVisibility(0);
            try {
                double i = aib.m3877i(this.f3585d.getText().toString());
                double doubleValue = Double.valueOf(obj).doubleValue();
                double doubleValue2 = Double.valueOf(obj2).doubleValue();
                if (doubleValue2 > 100.0d) {
                    doubleValue2 = 100.0d;
                }
                double d = ((1.0d - (doubleValue2 / 100.0d)) * i) * (1.0d + (doubleValue / 100.0d));
                double d2 = ((doubleValue2 / 100.0d) * i) * (1.0d + (doubleValue / 100.0d));
                doubleValue2 = (((1.0d - (doubleValue2 / 100.0d)) * i) * doubleValue) / 100.0d;
                this.f3582a.setText(aib.m3850a(d));
                this.f3583b.setText(aib.m3850a(d2));
                this.f3584c.setText(aib.m3850a(doubleValue2));
            } catch (Exception e) {
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(getIntent().getStringExtra("title"));
        setContentView(2130903142);
        getWindow().setSoftInputMode(3);
        m3552a();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
