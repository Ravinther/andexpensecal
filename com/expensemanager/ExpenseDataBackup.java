package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ExpenseDataBackup extends Activity {
    private static String f3166c;
    String f3167a;
    Context f3168b;
    private String f3169d;
    private String f3170e;
    private ro f3171f;

    static {
        f3166c = "";
    }

    public ExpenseDataBackup() {
        this.f3167a = "";
        this.f3168b = this;
        this.f3169d = "";
        this.f3170e = "";
    }

    private String m3091a() {
        List arrayList = new ArrayList();
        f3166c = ExpenseAccountActivities.m2602a(new ro(this), "", arrayList, true, "expensed ASC");
        return f3166c;
    }

    private String[] m3094a(String str) {
        try {
            return new File(str).list(new rn(this));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void m3097b() {
        File file = new File(co.f4434h);
        if (file.exists()) {
            String[] list = file.list();
            if (list != null && list.length != 0) {
                file = new File(co.f4430d);
                if (!file.exists()) {
                    file.mkdir();
                }
                file = new File(co.f4431e);
                if (!file.exists()) {
                    file.mkdir();
                }
                for (int i = 0; i < list.length; i++) {
                    try {
                        aib.m3863a(new File(co.f4434h + list[i]), aib.m3870c(co.f4431e, list[i]));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        this.f3171f = new ro(this);
        setTitle(2131099731);
        setContentView(2130903086);
        this.f3167a = getIntent().getStringExtra("account");
        f3166c = getIntent().getStringExtra("exportData");
        String str = "expensemanager.csv";
        TextView textView = (TextView) findViewById(2131558706);
        textView.setText(textView.getText().toString() + co.f4432f);
        textView = (TextView) findViewById(2131558713);
        textView.setText(textView.getText().toString() + co.f4430d + "/" + "expensemanager.csv");
        textView = (TextView) findViewById(2131558717);
        textView.setText(textView.getText().toString() + co.f4430d);
        Button button = (Button) findViewById(2131558714);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new qx(this));
        button = (Button) findViewById(2131558716);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new qy(this));
        button = (Button) findViewById(2131558718);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new qz(this));
        button = (Button) findViewById(2131558707);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new rc(this));
        button = (Button) findViewById(2131558708);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new rd(this));
        button = (Button) findViewById(2131558709);
        if (!"com.expensemanager.pro".equals(this.f3168b.getApplicationContext().getPackageName())) {
            button.setVisibility(8);
        }
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new rh(this));
        RadioButton radioButton = (RadioButton) findViewById(2131558711);
        RadioButton radioButton2 = (RadioButton) findViewById(2131558712);
        if (",".equals(abd.m3786a(this.f3168b, this.f3171f, "csv_delimiter", ","))) {
            radioButton.setChecked(true);
        } else {
            radioButton2.setChecked(true);
        }
        radioButton.setOnClickListener(new rl(this));
        radioButton2.setOnClickListener(new rm(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
