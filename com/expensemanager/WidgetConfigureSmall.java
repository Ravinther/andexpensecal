package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import java.util.ArrayList;
import java.util.Arrays;

public class WidgetConfigureSmall extends Activity {
    private static String[] f3716c;
    OnClickListener f3717a;
    private int f3718b;
    private Spinner f3719d;
    private CheckBox f3720e;
    private CheckBox f3721f;
    private CheckBox f3722g;
    private CheckBox f3723h;
    private CheckBox f3724i;
    private CheckBox f3725j;
    private CheckBox f3726k;
    private CheckBox f3727l;
    private CheckBox f3728m;
    private CheckBox f3729n;
    private CheckBox f3730o;
    private CheckBox f3731p;
    private CheckBox f3732q;
    private CheckBox f3733r;
    private CheckBox f3734s;
    private Button f3735t;
    private boolean[] f3736u;
    private String f3737v;

    public WidgetConfigureSmall() {
        this.f3718b = 0;
        this.f3736u = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
        this.f3737v = null;
        this.f3717a = new aio(this);
    }

    static String m3681a(Context context, int i) {
        return context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getString("widget_small_" + i, "");
    }

    private void m3682a() {
        String string;
        int i;
        int i2;
        SpinnerAdapter arrayAdapter;
        setContentView(2130903171);
        this.f3735t = (Button) findViewById(2131558449);
        aib.m3858a((Context) this, this.f3735t, -1);
        findViewById(2131558449).setOnClickListener(this.f3717a);
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f3718b = extras.getInt("appWidgetId", 0);
            string = sharedPreferences.getString("widget_small_" + this.f3718b, null);
            if (string != null) {
                String[] split = string.split(",");
                this.f3737v = split[0];
                for (i = 1; i < split.length; i++) {
                    if ("true".equalsIgnoreCase(split[i])) {
                        this.f3736u[i - 1] = true;
                    } else {
                        this.f3736u[i - 1] = false;
                    }
                }
            }
        }
        if (this.f3718b == 0) {
            finish();
        }
        string = abd.m3786a((Context) this, new ro(this), "MY_ACCOUNT_NAMES", "Personal Expense");
        if (string.split(",").length > 1) {
            string = string + ",All";
        }
        f3716c = string.split(",");
        i = sharedPreferences.getInt("Default_Account_Index", 0);
        if (i > f3716c.length - 1 || i < 0) {
            i = 0;
        }
        if (this.f3737v != null) {
            i = new ArrayList(Arrays.asList(f3716c)).indexOf(this.f3737v);
            if (i == -1) {
                i2 = 0;
                arrayAdapter = new ArrayAdapter(this, 2130903151, f3716c);
                arrayAdapter.setDropDownViewResource(17367049);
                this.f3719d = (Spinner) findViewById(2131559087);
                this.f3719d.setAdapter(arrayAdapter);
                this.f3719d.setSelection(i2);
                this.f3720e = (CheckBox) findViewById(2131559088);
                this.f3720e.setChecked(this.f3736u[0]);
                this.f3721f = (CheckBox) findViewById(2131559089);
                this.f3721f.setChecked(this.f3736u[1]);
                this.f3726k = (CheckBox) findViewById(2131559090);
                this.f3726k.setChecked(this.f3736u[2]);
                this.f3727l = (CheckBox) findViewById(2131559091);
                this.f3727l.setChecked(this.f3736u[3]);
                this.f3728m = (CheckBox) findViewById(2131558576);
                this.f3728m.setChecked(this.f3736u[4]);
                this.f3730o = (CheckBox) findViewById(2131559092);
                this.f3730o.setChecked(this.f3736u[5]);
                this.f3729n = (CheckBox) findViewById(2131559093);
                this.f3729n.setChecked(this.f3736u[6]);
                this.f3722g = (CheckBox) findViewById(2131559094);
                this.f3722g.setChecked(this.f3736u[7]);
                this.f3723h = (CheckBox) findViewById(2131559095);
                this.f3723h.setChecked(this.f3736u[8]);
                this.f3724i = (CheckBox) findViewById(2131559096);
                this.f3724i.setChecked(this.f3736u[9]);
                this.f3725j = (CheckBox) findViewById(2131559097);
                this.f3725j.setChecked(this.f3736u[10]);
                this.f3731p = (CheckBox) findViewById(2131558578);
                this.f3731p.setChecked(this.f3736u[11]);
                this.f3733r = (CheckBox) findViewById(2131559102);
                this.f3733r.setChecked(this.f3736u[12]);
                this.f3734s = (CheckBox) findViewById(2131559101);
                this.f3734s.setChecked(this.f3736u[13]);
                this.f3732q = (CheckBox) findViewById(2131559086);
                this.f3732q.setChecked(this.f3736u[14]);
            }
        }
        i2 = i;
        arrayAdapter = new ArrayAdapter(this, 2130903151, f3716c);
        arrayAdapter.setDropDownViewResource(17367049);
        this.f3719d = (Spinner) findViewById(2131559087);
        this.f3719d.setAdapter(arrayAdapter);
        this.f3719d.setSelection(i2);
        this.f3720e = (CheckBox) findViewById(2131559088);
        this.f3720e.setChecked(this.f3736u[0]);
        this.f3721f = (CheckBox) findViewById(2131559089);
        this.f3721f.setChecked(this.f3736u[1]);
        this.f3726k = (CheckBox) findViewById(2131559090);
        this.f3726k.setChecked(this.f3736u[2]);
        this.f3727l = (CheckBox) findViewById(2131559091);
        this.f3727l.setChecked(this.f3736u[3]);
        this.f3728m = (CheckBox) findViewById(2131558576);
        this.f3728m.setChecked(this.f3736u[4]);
        this.f3730o = (CheckBox) findViewById(2131559092);
        this.f3730o.setChecked(this.f3736u[5]);
        this.f3729n = (CheckBox) findViewById(2131559093);
        this.f3729n.setChecked(this.f3736u[6]);
        this.f3722g = (CheckBox) findViewById(2131559094);
        this.f3722g.setChecked(this.f3736u[7]);
        this.f3723h = (CheckBox) findViewById(2131559095);
        this.f3723h.setChecked(this.f3736u[8]);
        this.f3724i = (CheckBox) findViewById(2131559096);
        this.f3724i.setChecked(this.f3736u[9]);
        this.f3725j = (CheckBox) findViewById(2131559097);
        this.f3725j.setChecked(this.f3736u[10]);
        this.f3731p = (CheckBox) findViewById(2131558578);
        this.f3731p.setChecked(this.f3736u[11]);
        this.f3733r = (CheckBox) findViewById(2131559102);
        this.f3733r.setChecked(this.f3736u[12]);
        this.f3734s = (CheckBox) findViewById(2131559101);
        this.f3734s.setChecked(this.f3736u[13]);
        this.f3732q = (CheckBox) findViewById(2131559086);
        this.f3732q.setChecked(this.f3736u[14]);
    }

    static void m3683a(Context context, int i, String str) {
        Editor edit = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).edit();
        edit.putString("widget_small_" + i, str);
        edit.commit();
    }

    private void m3685b() {
        finish();
    }

    static void m3686b(Context context, int i) {
        Editor edit = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).edit();
        edit.remove("widget_small_" + i);
        edit.commit();
    }

    private int m3688c() {
        int i = 0;
        if (this.f3720e.isChecked()) {
            i = 1;
        }
        if (this.f3721f.isChecked()) {
            i++;
        }
        if (this.f3726k.isChecked()) {
            i++;
        }
        if (this.f3727l.isChecked()) {
            i++;
        }
        if (this.f3728m.isChecked()) {
            i++;
        }
        if (this.f3730o.isChecked()) {
            i++;
        }
        if (this.f3729n.isChecked()) {
            i++;
        }
        if (this.f3722g.isChecked()) {
            i++;
        }
        if (this.f3723h.isChecked()) {
            i++;
        }
        if (this.f3724i.isChecked()) {
            i++;
        }
        if (this.f3725j.isChecked()) {
            i++;
        }
        return this.f3731p.isChecked() ? i + 1 : i;
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
            OnCancelListener com_expensemanager_aim = new aim(this);
            OnDismissListener com_expensemanager_ain = new ain(this);
            com_expensemanager_adl.setOnCancelListener(com_expensemanager_aim);
            com_expensemanager_adl.setOnDismissListener(com_expensemanager_ain);
            com_expensemanager_adl.show();
            return;
        }
        m3682a();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 0, 0, 2131099983).setIcon(2130837595).setShowAsAction(2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        if (itemId == 0) {
            this.f3735t.performClick();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
