package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class WidgetConfigureBudget extends Activity {
    OnClickListener f3707a;
    private int f3708b;
    private RadioButton f3709c;
    private RadioButton f3710d;
    private RadioButton f3711e;
    private RadioButton f3712f;
    private RadioButton f3713g;
    private int f3714h;
    private CheckBox f3715i;

    public WidgetConfigureBudget() {
        this.f3708b = 0;
        this.f3714h = 2;
        this.f3707a = new ail(this);
    }

    static String m3667a(Context context, int i) {
        return context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getString("widget_" + i, "");
    }

    private void m3668a() {
        setContentView(2130903170);
        aib.m3858a((Context) this, (Button) findViewById(2131558449), -1);
        findViewById(2131558449).setOnClickListener(this.f3707a);
        this.f3709c = (RadioButton) findViewById(2131559099);
        this.f3710d = (RadioButton) findViewById(2131558647);
        this.f3711e = (RadioButton) findViewById(2131558648);
        this.f3712f = (RadioButton) findViewById(2131558649);
        this.f3713g = (RadioButton) findViewById(2131559100);
        this.f3715i = (CheckBox) findViewById(2131559086);
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f3708b = extras.getInt("appWidgetId", 0);
            String string = sharedPreferences.getString("widget_" + this.f3708b, null);
            if (string != null) {
                String[] split = string.split(";");
                this.f3714h = Integer.parseInt(split[0]);
                if (this.f3714h == 0) {
                    this.f3709c.setChecked(true);
                }
                if (this.f3714h == 1) {
                    this.f3710d.setChecked(true);
                }
                if (this.f3714h == 2) {
                    this.f3711e.setChecked(true);
                }
                if (this.f3714h == 3) {
                    this.f3712f.setChecked(true);
                }
                if (this.f3714h == 4) {
                    this.f3713g.setChecked(true);
                }
                if ("true".equalsIgnoreCase(split[1])) {
                    this.f3715i.setChecked(true);
                }
            }
        }
        if (this.f3708b == 0) {
            finish();
        }
    }

    static void m3669a(Context context, int i, String str) {
        Editor edit = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).edit();
        edit.putString("widget_" + i, str);
        edit.commit();
    }

    private void m3671b() {
        finish();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setResult(0);
        if (getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getBoolean("ENABLE_SECURITY", false)) {
            adl com_expensemanager_adl = new adl(this);
            com_expensemanager_adl.requestWindowFeature(1);
            OnCancelListener com_expensemanager_aij = new aij(this);
            OnDismissListener com_expensemanager_aik = new aik(this);
            com_expensemanager_adl.setOnCancelListener(com_expensemanager_aij);
            com_expensemanager_adl.setOnDismissListener(com_expensemanager_aik);
            com_expensemanager_adl.show();
            return;
        }
        m3668a();
    }
}
