package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CreditCardPayOffCalculator extends Activity {
    int f2624a;
    String f2625b;
    private Context f2626c;

    public CreditCardPayOffCalculator() {
        this.f2626c = this;
        this.f2624a = 0;
        this.f2625b = "";
    }

    public static double m2537a(double d, double d2, double d3) {
        double d4 = (d2 / 100.0d) / 12.0d;
        return d4 != 0.0d ? (-Math.log(1.0d - ((d4 * d) / d3))) / Math.log(d4 + 1.0d) : d / d3;
    }

    public static double m2538a(double d, double d2, int i) {
        double d3 = (d2 / 100.0d) / 12.0d;
        double pow = ((d * d3) * Math.pow(1.0d + d3, (double) i)) / (Math.pow(1.0d + d3, (double) i) - 1.0d);
        if (d3 == 0.0d) {
            pow = d / ((double) i);
        }
        return ((double) Math.round(pow * 100.0d)) / 100.0d;
    }

    private void m2540a() {
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558495);
        Button button = (Button) findViewById(2131558494);
        Button button2 = (Button) findViewById(2131558493);
        Button button3 = (Button) findViewById(2131558497);
        aib.m3858a((Context) this, button2, -1);
        aib.m3858a((Context) this, button, -1);
        aib.m3858a((Context) this, button3, -1);
        EditText editText = (EditText) findViewById(2131558485);
        EditText editText2 = (EditText) findViewById(2131558487);
        EditText editText3 = (EditText) findViewById(2131558489);
        EditText editText4 = (EditText) findViewById(2131558491);
        editText.addTextChangedListener(aib.f4143a);
        editText3.addTextChangedListener(aib.f4143a);
        editText3.setOnKeyListener(new cy(this, editText4));
        editText4.setOnKeyListener(new cz(this, editText3));
        button.setOnClickListener(new da(this, editText, editText2, editText3, editText4, linearLayout, (TextView) findViewById(2131558496)));
        button2.setOnClickListener(new db(this));
        button3.setOnClickListener(new dc(this, editText3, editText4));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(getIntent().getStringExtra("title"));
        setContentView(2130903060);
        getWindow().setSoftInputMode(3);
        m2540a();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
