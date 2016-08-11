package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class PinSetup extends Activity {
    EditText f3555a;
    EditText f3556b;
    EditText f3557c;
    EditText f3558d;
    private Context f3559e;
    private CheckBox f3560f;

    public PinSetup() {
        this.f3559e = this;
    }

    private void m3522a() {
        Editor edit = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).edit();
        if (this.f3560f.isChecked()) {
            edit.putBoolean("ENABLE_SECURITY", true);
            edit.commit();
            String obj = this.f3555a.getText().toString();
            String obj2 = this.f3556b.getText().toString();
            String obj3 = this.f3557c.getText().toString();
            String obj4 = this.f3558d.getText().toString();
            if (obj == null || obj.length() < 4) {
                aib.m3849a(this.f3559e, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099999), getResources().getString(2131099983), null, null, null).show();
                return;
            } else if (obj == null || !obj.equals(obj2)) {
                aib.m3849a(this.f3559e, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099995), getResources().getString(2131099983), null, null, null).show();
                return;
            } else {
                edit.putString("NEW_PIN", C0445f.m4101a(obj));
                edit.putString("SECURITY_QUESTION", obj3);
                edit.putString("SECURITY_ANSWER", obj4);
                edit.commit();
                setResult(0, new Intent());
                finish();
                return;
            }
        }
        edit.putBoolean("ENABLE_SECURITY", false);
        edit.remove("NEW_PIN");
        edit.commit();
        setResult(0, new Intent());
        finish();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(2131099997);
        setContentView(2130903140);
        getWindow().setSoftInputMode(3);
        boolean z = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getBoolean("ENABLE_SECURITY", false);
        this.f3560f = (CheckBox) findViewById(2131558965);
        this.f3560f.setChecked(z);
        this.f3555a = (EditText) findViewById(2131558969);
        this.f3556b = (EditText) findViewById(2131558970);
        this.f3557c = (EditText) findViewById(2131558971);
        this.f3558d = (EditText) findViewById(2131558968);
        if (this.f3560f.isChecked()) {
            this.f3555a.setEnabled(true);
            this.f3556b.setEnabled(true);
            this.f3557c.setEnabled(true);
            this.f3558d.setEnabled(true);
        } else {
            this.f3555a.setEnabled(false);
            this.f3556b.setEnabled(false);
            this.f3557c.setEnabled(false);
            this.f3558d.setEnabled(false);
        }
        this.f3560f.setOnClickListener(new adq(this));
        Button button = (Button) findViewById(2131558506);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new adr(this));
        button = (Button) findViewById(2131558507);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new ads(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492879, menu);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                return true;
            case 2131558449:
                m3522a();
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
