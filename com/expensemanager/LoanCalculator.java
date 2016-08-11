package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoanCalculator extends Activity {
    EditText f3504a;
    EditText f3505b;
    EditText f3506c;
    EditText f3507d;
    EditText f3508e;
    EditText f3509f;
    EditText f3510g;
    EditText f3511h;
    EditText f3512i;
    Button f3513j;
    int f3514k;
    double f3515l;
    private Context f3516m;
    private String f3517n;

    public LoanCalculator() {
        this.f3516m = this;
    }

    public static double m3483a(double d, double d2, int i) {
        double d3 = (d2 / 100.0d) / 12.0d;
        double pow = ((d * d3) * Math.pow(1.0d + d3, (double) i)) / (Math.pow(1.0d + d3, (double) i) - 1.0d);
        if (d3 == 0.0d) {
            pow = d / ((double) i);
        }
        return ((double) Math.round(pow * 100.0d)) / 100.0d;
    }

    private void m3486a() {
        this.f3504a = (EditText) findViewById(2131558927);
        this.f3505b = (EditText) findViewById(2131558912);
        this.f3506c = (EditText) findViewById(2131558928);
        this.f3507d = (EditText) findViewById(2131558929);
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558931);
        Button button = (Button) findViewById(2131558494);
        Button button2 = (Button) findViewById(2131558493);
        this.f3513j = (Button) findViewById(2131558936);
        Button button3 = (Button) findViewById(2131558507);
        Button button4 = (Button) findViewById(2131558952);
        aib.m3858a((Context) this, button, -1);
        aib.m3858a((Context) this, button2, -1);
        aib.m3858a((Context) this, button3, -1);
        aib.m3858a((Context) this, button4, -1);
        TextView textView = (TextView) findViewById(2131558944);
        TextView textView2 = (TextView) findViewById(2131558945);
        TextView textView3 = (TextView) findViewById(2131558946);
        TextView textView4 = (TextView) findViewById(2131558947);
        TextView textView5 = (TextView) findViewById(2131558948);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(2131558937);
        this.f3508e = (EditText) findViewById(2131558930);
        TextView textView6 = (TextView) findViewById(2131558950);
        TextView textView7 = (TextView) findViewById(2131558951);
        LinearLayout linearLayout3 = (LinearLayout) findViewById(2131558949);
        this.f3509f = (EditText) findViewById(2131558935);
        this.f3510g = (EditText) findViewById(2131558932);
        this.f3511h = (EditText) findViewById(2131558933);
        this.f3512i = (EditText) findViewById(2131558934);
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        this.f3512i.setText(sharedPreferences.getString("pmi", ""));
        TextView textView8 = (TextView) findViewById(2131558940);
        TextView textView9 = (TextView) findViewById(2131558939);
        TextView textView10 = (TextView) findViewById(2131558943);
        TextView textView11 = (TextView) findViewById(2131558942);
        LinearLayout linearLayout4 = (LinearLayout) findViewById(2131558938);
        this.f3504a.addTextChangedListener(aib.f4143a);
        this.f3508e.addTextChangedListener(aib.f4143a);
        this.f3510g.addTextChangedListener(aib.f4143a);
        this.f3511h.addTextChangedListener(aib.f4143a);
        this.f3509f.addTextChangedListener(aib.f4143a);
        button.setOnClickListener(new acn(this, textView6, textView7, linearLayout3, textView9, textView8, textView11, textView10, linearLayout4, sharedPreferences, textView, textView2, textView3, textView4, textView5, linearLayout2));
        this.f3513j.setOnClickListener(new acp(this, linearLayout));
        button2.setOnClickListener(new acq(this));
        button3.setOnClickListener(new acr(this));
        button4.setOnClickListener(new acs(this));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(getIntent().getStringExtra("title"));
        setContentView(2130903133);
        getWindow().setSoftInputMode(3);
        m3486a();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
