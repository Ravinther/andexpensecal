package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class InterestCalculator extends Activity {
    Context f3497a;
    private Spinner f3498b;
    private String[] f3499c;
    private EditText f3500d;
    private EditText f3501e;
    private EditText f3502f;
    private EditText f3503g;

    public InterestCalculator() {
        this.f3497a = this;
        this.f3499c = new String[]{"Daily", "Monthly", "Quarterly", "Semiannually", "Annually", "No Compound"};
    }

    private void m3475a() {
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558495);
        Button button = (Button) findViewById(2131558494);
        Button button2 = (Button) findViewById(2131558493);
        Button button3 = (Button) findViewById(2131558923);
        Button button4 = (Button) findViewById(2131558924);
        Button button5 = (Button) findViewById(2131558916);
        aib.m3858a((Context) this, button, -1);
        aib.m3858a((Context) this, button2, -1);
        aib.m3858a((Context) this, button3, -1);
        aib.m3858a((Context) this, button4, -1);
        aib.m3858a((Context) this, button5, -1);
        this.f3500d = (EditText) findViewById(2131558907);
        this.f3501e = (EditText) findViewById(2131558909);
        this.f3502f = (EditText) findViewById(2131558911);
        this.f3503g = (EditText) findViewById(2131558913);
        this.f3500d.addTextChangedListener(aib.f4143a);
        this.f3501e.addTextChangedListener(aib.f4143a);
        TextView textView = (TextView) findViewById(2131558918);
        TextView textView2 = (TextView) findViewById(2131558920);
        TextView textView3 = (TextView) findViewById(2131558922);
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, getResources().getString(2131099773).split(","));
        arrayAdapter.setDropDownViewResource(17367049);
        this.f3498b = (Spinner) findViewById(2131558915);
        this.f3498b.setAdapter(arrayAdapter);
        this.f3498b.setSelection(1);
        button.setOnClickListener(new acf(this, linearLayout, textView, textView2, textView3));
        button2.setOnClickListener(new acg(this));
        button5.setOnClickListener(new ach(this));
        button4.setOnClickListener(new aci(this, textView2));
        button3.setOnClickListener(new acj(this, textView3));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(getIntent().getStringExtra("title"));
        setContentView(2130903127);
        getWindow().setSoftInputMode(3);
        m3475a();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
