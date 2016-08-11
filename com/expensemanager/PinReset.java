package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PinReset extends Activity {
    EditText f3550a;
    EditText f3551b;
    TextView f3552c;
    EditText f3553d;
    private Context f3554e;

    public PinReset() {
        this.f3554e = this;
    }

    private void m3519a() {
        finish();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle("Reset PIN");
        setContentView(2130903139);
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        CharSequence string = sharedPreferences.getString("SECURITY_QUESTION", null);
        String string2 = sharedPreferences.getString("SECURITY_ANSWER", null);
        this.f3550a = (EditText) findViewById(2131558969);
        this.f3551b = (EditText) findViewById(2131558970);
        this.f3552c = (TextView) findViewById(2131558967);
        this.f3553d = (EditText) findViewById(2131558968);
        Button button = (Button) findViewById(2131558506);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new adm(this));
        button = (Button) findViewById(2131558507);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new adn(this, string2));
        if (string == null || string.equals("")) {
            OnClickListener com_expensemanager_ado = new ado(this);
            aib.m3849a(this.f3554e, null, getResources().getString(2131100058), 17301543, getResources().getString(2131100059), getResources().getString(2131099983), new adp(this), getResources().getString(2131099916), com_expensemanager_ado).show();
            return;
        }
        this.f3552c.setText(string);
    }
}
