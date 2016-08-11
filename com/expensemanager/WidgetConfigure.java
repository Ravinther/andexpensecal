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

public class WidgetConfigure extends Activity {
    private static String[] f3685c;
    OnClickListener f3686a;
    private int f3687b;
    private Spinner f3688d;
    private CheckBox f3689e;
    private CheckBox f3690f;
    private CheckBox f3691g;
    private CheckBox f3692h;
    private CheckBox f3693i;
    private CheckBox f3694j;
    private CheckBox f3695k;
    private CheckBox f3696l;
    private CheckBox f3697m;
    private CheckBox f3698n;
    private CheckBox f3699o;
    private CheckBox f3700p;
    private CheckBox f3701q;
    private CheckBox f3702r;
    private CheckBox f3703s;
    private Button f3704t;
    private boolean[] f3705u;
    private String f3706v;

    public WidgetConfigure() {
        this.f3687b = 0;
        this.f3705u = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, false, true, true};
        this.f3706v = null;
        this.f3686a = new aii(this);
    }

    static String m3642a(Context context, int i) {
        return context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getString("widget_" + i, "");
    }

    private void m3643a() {
        int i;
        int i2;
        SpinnerAdapter arrayAdapter;
        setContentView(2130903169);
        this.f3704t = (Button) findViewById(2131558449);
        aib.m3858a((Context) this, this.f3704t, -1);
        findViewById(2131558449).setOnClickListener(this.f3686a);
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f3687b = extras.getInt("appWidgetId", 0);
            String string = sharedPreferences.getString("widget_" + this.f3687b, null);
            if (string != null) {
                String[] split = string.split(",");
                this.f3706v = split[0];
                for (i = 1; i < split.length; i++) {
                    if ("true".equalsIgnoreCase(split[i])) {
                        this.f3705u[i - 1] = true;
                    } else {
                        this.f3705u[i - 1] = false;
                    }
                }
            }
        }
        if (this.f3687b == 0) {
            finish();
        }
        f3685c = abd.m3786a((Context) this, new ro(this), "MY_ACCOUNT_NAMES", "Personal Expense").split(",");
        i = sharedPreferences.getInt("Default_Account_Index", 0);
        if (i > f3685c.length - 1 || i < 0) {
            i = 0;
        }
        if (this.f3706v != null) {
            i = new ArrayList(Arrays.asList(f3685c)).indexOf(this.f3706v);
            if (i == -1) {
                i2 = 0;
                arrayAdapter = new ArrayAdapter(this, 2130903151, f3685c);
                arrayAdapter.setDropDownViewResource(17367049);
                this.f3688d = (Spinner) findViewById(2131559087);
                this.f3688d.setAdapter(arrayAdapter);
                this.f3688d.setSelection(i2);
                this.f3689e = (CheckBox) findViewById(2131559088);
                this.f3689e.setChecked(this.f3705u[0]);
                this.f3690f = (CheckBox) findViewById(2131559089);
                this.f3690f.setChecked(this.f3705u[1]);
                this.f3696l = (CheckBox) findViewById(2131559090);
                this.f3696l.setChecked(this.f3705u[2]);
                this.f3697m = (CheckBox) findViewById(2131559091);
                this.f3697m.setChecked(this.f3705u[3]);
                this.f3698n = (CheckBox) findViewById(2131558576);
                this.f3698n.setChecked(this.f3705u[4]);
                this.f3700p = (CheckBox) findViewById(2131559092);
                this.f3700p.setChecked(this.f3705u[5]);
                this.f3699o = (CheckBox) findViewById(2131559093);
                this.f3699o.setChecked(this.f3705u[6]);
                this.f3691g = (CheckBox) findViewById(2131559094);
                this.f3691g.setChecked(this.f3705u[7]);
                this.f3692h = (CheckBox) findViewById(2131559095);
                this.f3692h.setChecked(this.f3705u[8]);
                this.f3693i = (CheckBox) findViewById(2131559096);
                this.f3693i.setChecked(this.f3705u[9]);
                this.f3694j = (CheckBox) findViewById(2131559097);
                this.f3694j.setChecked(this.f3705u[10]);
                this.f3695k = (CheckBox) findViewById(2131559098);
                this.f3695k.setChecked(this.f3705u[11]);
                this.f3701q = (CheckBox) findViewById(2131559086);
                this.f3701q.setChecked(this.f3705u[12]);
                this.f3702r = (CheckBox) findViewById(2131558575);
                this.f3702r.setChecked(this.f3705u[13]);
                this.f3703s = (CheckBox) findViewById(2131558574);
                this.f3703s.setChecked(this.f3705u[14]);
            }
        }
        i2 = i;
        arrayAdapter = new ArrayAdapter(this, 2130903151, f3685c);
        arrayAdapter.setDropDownViewResource(17367049);
        this.f3688d = (Spinner) findViewById(2131559087);
        this.f3688d.setAdapter(arrayAdapter);
        this.f3688d.setSelection(i2);
        this.f3689e = (CheckBox) findViewById(2131559088);
        this.f3689e.setChecked(this.f3705u[0]);
        this.f3690f = (CheckBox) findViewById(2131559089);
        this.f3690f.setChecked(this.f3705u[1]);
        this.f3696l = (CheckBox) findViewById(2131559090);
        this.f3696l.setChecked(this.f3705u[2]);
        this.f3697m = (CheckBox) findViewById(2131559091);
        this.f3697m.setChecked(this.f3705u[3]);
        this.f3698n = (CheckBox) findViewById(2131558576);
        this.f3698n.setChecked(this.f3705u[4]);
        this.f3700p = (CheckBox) findViewById(2131559092);
        this.f3700p.setChecked(this.f3705u[5]);
        this.f3699o = (CheckBox) findViewById(2131559093);
        this.f3699o.setChecked(this.f3705u[6]);
        this.f3691g = (CheckBox) findViewById(2131559094);
        this.f3691g.setChecked(this.f3705u[7]);
        this.f3692h = (CheckBox) findViewById(2131559095);
        this.f3692h.setChecked(this.f3705u[8]);
        this.f3693i = (CheckBox) findViewById(2131559096);
        this.f3693i.setChecked(this.f3705u[9]);
        this.f3694j = (CheckBox) findViewById(2131559097);
        this.f3694j.setChecked(this.f3705u[10]);
        this.f3695k = (CheckBox) findViewById(2131559098);
        this.f3695k.setChecked(this.f3705u[11]);
        this.f3701q = (CheckBox) findViewById(2131559086);
        this.f3701q.setChecked(this.f3705u[12]);
        this.f3702r = (CheckBox) findViewById(2131558575);
        this.f3702r.setChecked(this.f3705u[13]);
        this.f3703s = (CheckBox) findViewById(2131558574);
        this.f3703s.setChecked(this.f3705u[14]);
    }

    static void m3644a(Context context, int i, String str) {
        Editor edit = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).edit();
        edit.putString("widget_" + i, str);
        edit.commit();
    }

    private void m3646b() {
        finish();
    }

    static void m3647b(Context context, int i) {
        Editor edit = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).edit();
        edit.remove("widget_" + i);
        edit.commit();
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
            OnCancelListener com_expensemanager_aig = new aig(this);
            OnDismissListener com_expensemanager_aih = new aih(this);
            com_expensemanager_adl.setOnCancelListener(com_expensemanager_aig);
            com_expensemanager_adl.setOnDismissListener(com_expensemanager_aih);
            com_expensemanager_adl.show();
            return;
        }
        m3643a();
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
            this.f3704t.performClick();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
