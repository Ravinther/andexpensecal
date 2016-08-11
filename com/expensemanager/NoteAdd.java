package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Map;

public class NoteAdd extends Activity {
    private Context f3530a;
    private boolean f3531b;
    private EditText f3532c;
    private EditText f3533d;
    private ArrayList<Map<String, String>> f3534e;
    private ro f3535f;
    private String f3536g;
    private String f3537h;

    public NoteAdd() {
        this.f3530a = this;
        this.f3531b = true;
        this.f3536g = "";
    }

    private void m3499a() {
        new Builder(this.f3530a).setTitle(2131099805).setMessage(getResources().getText(2131099808).toString() + this.f3532c.getText().toString() + "?").setPositiveButton(2131099983, new adc(this)).setNegativeButton(2131099754, new adb(this)).show();
    }

    private void m3501a(boolean z) {
        String trim = this.f3532c.getText().toString().trim();
        String trim2 = this.f3533d.getText().toString().trim();
        if ("".equals(aib.m3865b(trim)) && "".equals(aib.m3865b(trim2))) {
            aib.m3849a(this.f3530a, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099708), getResources().getString(2131099983), null, null, null).show();
            return;
        }
        boolean a;
        if (!this.f3535f.m4206d()) {
            this.f3535f.m4193a();
        }
        try {
            String str = "" + (getIntent().getIntExtra("count", 0) + 1);
            String str2 = "";
            String str3 = "";
            String str4 = "0";
            String str5 = "";
            if (!z) {
                Map map = (Map) this.f3534e.get(0);
                this.f3536g = aib.m3853a((String) map.get("transactionId"));
                str = aib.m3853a((String) map.get("order"));
                str2 = aib.m3853a((String) map.get("reminder"));
                str3 = aib.m3853a((String) map.get("tag"));
                str5 = aib.m3853a((String) map.get("property"));
            }
            ContentValues a2 = this.f3535f.m4186a(trim, trim2, str, this.f3536g, str3, str2, str4, str5, Long.valueOf(System.currentTimeMillis()).longValue());
            a = z ? this.f3535f.m4185a("expense_note", a2) != -1 : this.f3535f.m4196a("expense_note", Long.valueOf(getIntent().getStringExtra("rowId")).longValue(), a2);
        } catch (Exception e) {
            e.printStackTrace();
            a = false;
        }
        this.f3535f.m4201b();
        if (a) {
            Toast.makeText(this.f3530a, 2131100066, 1).show();
            abd.m3805a(this.f3530a, a);
            setResult(-1, new Intent());
            finish();
            return;
        }
        aib.m3849a(this.f3530a, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099715), getResources().getString(2131099983), null, null, null).show();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(2131099979);
        setContentView(2130903134);
        this.f3535f = new ro(this);
        this.f3537h = getIntent().getStringExtra("rowId");
        this.f3532c = (EditText) findViewById(2131558954);
        this.f3533d = (EditText) findViewById(2131558955);
        if (this.f3537h != null) {
            this.f3531b = false;
        }
        Button button = (Button) findViewById(2131558506);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new acy(this));
        button = (Button) findViewById(2131558507);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new acz(this));
        button = (Button) findViewById(2131558614);
        aib.m3858a((Context) this, button, 2130837530);
        button.setOnClickListener(new ada(this));
        if (!this.f3531b) {
            String str = "_id=" + this.f3537h + " and " + "status" + "='0'";
            this.f3534e = new ArrayList();
            NoteList.m3507a(this.f3535f, str, "note_order ASC", this.f3534e);
            Map map = (Map) this.f3534e.get(0);
            this.f3532c.setText((CharSequence) map.get("title"));
            this.f3533d.setText((CharSequence) map.get("content"));
            button.setVisibility(0);
        }
        String stringExtra = getIntent().getStringExtra("fromWhere");
        if (stringExtra != null && "transaction".equalsIgnoreCase(stringExtra)) {
            this.f3533d.setText(getIntent().getStringExtra("content"));
            this.f3536g = getIntent().getStringExtra("transactionId");
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492877, menu);
        if (this.f3531b) {
            menu.getItem(0).setVisible(false);
        }
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                return true;
            case 2131558449:
                m3501a(this.f3531b);
                return true;
            case 2131558668:
                m3499a();
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
