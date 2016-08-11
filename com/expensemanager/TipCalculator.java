package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TipCalculator extends Activity {
    TextView f3652a;
    TextView f3653b;
    TextView f3654c;
    TextView f3655d;
    EditText f3656e;
    EditText f3657f;
    EditText f3658g;
    EditText f3659h;
    LinearLayout f3660i;
    boolean f3661j;
    private Activity f3662k;

    public TipCalculator() {
        this.f3661j = false;
        this.f3662k = this;
    }

    private void m3623a() {
        this.f3660i = (LinearLayout) findViewById(2131558495);
        Button button = (Button) findViewById(2131558493);
        this.f3656e = (EditText) findViewById(2131559002);
        this.f3657f = (EditText) findViewById(2131558557);
        this.f3658g = (EditText) findViewById(2131559007);
        this.f3659h = (EditText) findViewById(2131559004);
        this.f3659h.setEnabled(false);
        this.f3658g.setEnabled(false);
        this.f3652a = (TextView) findViewById(2131559011);
        this.f3653b = (TextView) findViewById(2131559013);
        this.f3654c = (TextView) findViewById(2131559015);
        this.f3655d = (TextView) findViewById(2131559017);
        ImageButton imageButton = (ImageButton) findViewById(2131559005);
        ImageButton imageButton2 = (ImageButton) findViewById(2131559009);
        ImageButton imageButton3 = (ImageButton) findViewById(2131559008);
        ((ImageButton) findViewById(2131559006)).setOnClickListener(new aho(this));
        imageButton.setOnClickListener(new ahp(this));
        imageButton2.setOnClickListener(new ahq(this));
        imageButton3.setOnClickListener(new ahr(this));
        TextWatcher com_expensemanager_ahs = new ahs(this);
        this.f3656e.addTextChangedListener(com_expensemanager_ahs);
        this.f3657f.addTextChangedListener(com_expensemanager_ahs);
        this.f3658g.addTextChangedListener(com_expensemanager_ahs);
        this.f3659h.addTextChangedListener(com_expensemanager_ahs);
        button.setOnClickListener(new aht(this));
        button = (Button) findViewById(2131558507);
        Button button2 = (Button) findViewById(2131558506);
        aib.m3858a((Context) this, button, -1);
        aib.m3858a((Context) this, button2, -1);
        button.setOnClickListener(new ahu(this));
        button2.setOnClickListener(new ahv(this));
    }

    private void m3626b() {
        if (!this.f3656e.getText().toString().equals("")) {
            String obj = this.f3657f.getText().toString();
            if (obj == null || obj.equals("")) {
                obj = "0";
            }
            this.f3660i.setVisibility(0);
            try {
                double doubleValue = Float.valueOf(this.f3656e.getText().toString()).doubleValue();
                double doubleValue2 = Float.valueOf(obj).doubleValue();
                double doubleValue3 = Float.valueOf(this.f3658g.getText().toString()).doubleValue();
                double doubleValue4 = Float.valueOf(this.f3659h.getText().toString()).doubleValue();
                double d = (((1.0d + (doubleValue2 / 100.0d)) * doubleValue) * doubleValue3) / 100.0d;
                if (!this.f3661j) {
                    d = (doubleValue * doubleValue3) / 100.0d;
                }
                doubleValue3 = aib.m3864b(d / doubleValue4);
                d = aib.m3864b(d);
                doubleValue = aib.m3864b((doubleValue * ((doubleValue2 / 100.0d) + 1.0d)) + d);
                doubleValue2 = aib.m3864b(doubleValue / doubleValue4);
                this.f3652a.setText(aib.m3850a(d));
                this.f3653b.setText(aib.m3850a(doubleValue));
                this.f3654c.setText(aib.m3850a(doubleValue3));
                this.f3655d.setText(aib.m3850a(doubleValue2));
            } catch (Exception e) {
            }
        }
    }

    private void m3627c() {
        this.f3661j = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getBoolean("AFTER_TAX", false);
        int i = !this.f3661j ? 1 : 0;
        CharSequence[] charSequenceArr = new CharSequence[]{"Tip after tax", "Tip before tax"};
        Builder builder = new Builder(this);
        builder.setTitle("Setting");
        builder.setSingleChoiceItems(charSequenceArr, i, new ahw(this));
        builder.setNegativeButton("OK", null);
        builder.show();
        builder.create();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(getIntent().getStringExtra("title"));
        setContentView(2130903158);
        getWindow().setSoftInputMode(3);
        this.f3661j = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getBoolean("AFTER_TAX", false);
        m3623a();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492883, menu);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                break;
            case 2131559154:
                m3627c();
                break;
        }
        return super.onMenuItemSelected(i, menuItem);
    }
}
