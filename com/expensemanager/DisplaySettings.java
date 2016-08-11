package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.gms.C0607c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DisplaySettings extends Activity {
    Spinner f2686a;
    Spinner f2687b;
    NDSpinner f2688c;
    CheckBox f2689d;
    CheckBox f2690e;
    CheckBox f2691f;
    CheckBox f2692g;
    CheckBox f2693h;
    CheckBox f2694i;
    CheckBox f2695j;
    CheckBox f2696k;
    CheckBox f2697l;
    CheckBox f2698m;
    Spinner f2699n;
    Bitmap f2700o;
    Context f2701p;
    ro f2702q;
    private String[] f2703r;

    public DisplaySettings() {
        this.f2701p = this;
        this.f2703r = new String[]{"Never", "0:00", "1:00", "2:00", "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"};
    }

    private void m2594a() {
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        int selectedItemPosition = this.f2687b.getSelectedItemPosition();
        Editor edit = sharedPreferences.edit();
        edit.putInt("BUTTON_COLOR", selectedItemPosition);
        edit.putInt("ACTIONBAR_ID", this.f2686a.getSelectedItemPosition());
        edit.putInt("THEME_COLOR", this.f2688c.getSelectedItemPosition());
        edit.putBoolean("HOMEPAGE_BUTTOM", this.f2689d.isChecked());
        edit.putBoolean("EXIT_PROMPT", this.f2690e.isChecked());
        edit.putBoolean("DISPLAY_TODAY_BALANCE", this.f2691f.isChecked());
        edit.putBoolean("DISPLAY_THIS_WEEK_BALANCE", this.f2692g.isChecked());
        edit.putBoolean("DISPLAY_THIS_MONTH_BALANCE", this.f2693h.isChecked());
        edit.putBoolean("DISPLAY_TODAY_INCOME", this.f2696k.isChecked());
        edit.putBoolean("DISPLAY_WEEK_INCOME", this.f2697l.isChecked());
        edit.putBoolean("DISPLAY_MONTH_END_BALANCE", this.f2694i.isChecked());
        edit.putBoolean("DISPLAY_YEAR_TO_DATE_BALANCE", this.f2695j.isChecked());
        edit.putInt("DAILY_REMINDER_TIME", this.f2699n.getSelectedItemPosition());
        edit.commit();
        String str = "NO";
        if (this.f2698m.isChecked()) {
            str = "YES";
        }
        abd.m3811a(this.f2701p, this.f2702q, "expense_preference", "excludeTransfer", str);
        Intent intent = new Intent(this, ExpenseManager.class);
        intent.addFlags(67108864);
        startActivity(intent);
        if (this.f2700o != null) {
            try {
                this.f2700o.compress(CompressFormat.JPEG, 100, new FileOutputStream(new File(co.f4430d + "/background.jpg")));
                m2598a(new File(co.f4430d + "/background.jpg"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void m2595a(int i, int i2, int i3) {
        if (i == 1 || i > 3) {
            if (VERSION.SDK_INT >= 21) {
                setTheme(2131230724);
            } else {
                setTheme(2131230723);
            }
        } else if (VERSION.SDK_INT >= 21) {
            setTheme(2131230726);
        } else {
            setTheme(2131230725);
        }
        setContentView(2130903069);
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, getResources().getString(2131099749).split(","));
        arrayAdapter.setDropDownViewResource(17367049);
        this.f2687b = (Spinner) findViewById(2131558569);
        this.f2687b.setAdapter(arrayAdapter);
        this.f2687b.setSelection(i3);
        this.f2686a = (Spinner) findViewById(2131558568);
        this.f2686a.setAdapter(arrayAdapter);
        this.f2686a.setSelection(i2);
        arrayAdapter = new ArrayAdapter(this, 2130903151, getResources().getString(2131100118).split(","));
        arrayAdapter.setDropDownViewResource(17367049);
        this.f2688c = (NDSpinner) findViewById(2131558570);
        this.f2688c.setAdapter(arrayAdapter);
        this.f2688c.setSelection(i);
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        this.f2690e = (CheckBox) findViewById(2131558572);
        this.f2690e.setChecked(sharedPreferences.getBoolean("EXIT_PROMPT", false));
        this.f2691f = (CheckBox) findViewById(2131558573);
        this.f2691f.setChecked(sharedPreferences.getBoolean("DISPLAY_TODAY_BALANCE", false));
        this.f2692g = (CheckBox) findViewById(2131558574);
        this.f2692g.setChecked(sharedPreferences.getBoolean("DISPLAY_THIS_WEEK_BALANCE", true));
        this.f2693h = (CheckBox) findViewById(2131558575);
        this.f2693h.setChecked(sharedPreferences.getBoolean("DISPLAY_THIS_MONTH_BALANCE", true));
        this.f2694i = (CheckBox) findViewById(2131558576);
        this.f2694i.setChecked(sharedPreferences.getBoolean("DISPLAY_MONTH_END_BALANCE", false));
        this.f2695j = (CheckBox) findViewById(2131558577);
        this.f2695j.setChecked(sharedPreferences.getBoolean("DISPLAY_YEAR_TO_DATE_BALANCE", false));
        this.f2696k = (CheckBox) findViewById(2131558578);
        this.f2696k.setChecked(sharedPreferences.getBoolean("DISPLAY_TODAY_INCOME", false));
        this.f2697l = (CheckBox) findViewById(2131558579);
        this.f2697l.setChecked(sharedPreferences.getBoolean("DISPLAY_WEEK_INCOME", true));
        this.f2698m = (CheckBox) findViewById(2131558580);
        this.f2702q = new ro(this);
        if ("YES".equalsIgnoreCase(abd.m3786a(this.f2701p, this.f2702q, "excludeTransfer", "NO"))) {
            this.f2698m.setChecked(true);
        } else {
            this.f2698m.setChecked(false);
        }
        this.f2699n = (Spinner) findViewById(2131558581);
        SpinnerAdapter arrayAdapter2 = new ArrayAdapter(this, 2130903151, this.f2703r);
        arrayAdapter2.setDropDownViewResource(17367049);
        this.f2699n.setAdapter(arrayAdapter2);
        this.f2699n.setSelection(sharedPreferences.getInt("DAILY_REMINDER_TIME", 0));
        Button button = (Button) findViewById(2131558582);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new ew(this));
        Button button2 = (Button) findViewById(2131558583);
        aib.m3858a((Context) this, button2, -1);
        button2.setOnClickListener(new ex(this));
        this.f2686a.setOnItemSelectedListener(new ey(this));
        this.f2687b.setOnItemSelectedListener(new ez(this, button2, button));
        this.f2688c.setOnItemSelectedListener(new er(this));
    }

    public static void m2598a(File file) {
        try {
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(new FileInputStream(file), null, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int i3 = 2;
            if (i > 1200 || i2 > 1200) {
                i3 = 4;
            }
            if (i > 2400 || i2 > 2400) {
                i3 = 8;
            }
            Options options2 = new Options();
            options2.inSampleSize = i3;
            Bitmap decodeStream = BitmapFactory.decodeStream(new FileInputStream(file), null, options2);
            OutputStream fileOutputStream = new FileOutputStream(file);
            decodeStream.compress(CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if (i2 == -1) {
                    try {
                        this.f2700o = BitmapFactory.decodeStream(getContentResolver().openInputStream(intent.getData()));
                        getWindow().setBackgroundDrawable(new BitmapDrawable(getResources(), this.f2700o));
                        m2595a(6, this.f2686a.getSelectedItemPosition(), this.f2687b.getSelectedItemPosition());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            default:
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903069);
        setTitle(2131100081);
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        int i = sharedPreferences.getInt("BUTTON_COLOR", 1);
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, getResources().getString(2131099749).split(","));
        arrayAdapter.setDropDownViewResource(17367049);
        this.f2687b = (Spinner) findViewById(2131558569);
        this.f2687b.setAdapter(arrayAdapter);
        this.f2687b.setSelection(i);
        i = sharedPreferences.getInt("ACTIONBAR_ID", 1);
        this.f2686a = (Spinner) findViewById(2131558568);
        this.f2686a.setAdapter(arrayAdapter);
        this.f2686a.setSelection(i);
        i = sharedPreferences.getInt("THEME_COLOR", 0);
        arrayAdapter = new ArrayAdapter(this, 2130903151, getResources().getString(2131100118).split(","));
        arrayAdapter.setDropDownViewResource(17367049);
        this.f2688c = (NDSpinner) findViewById(2131558570);
        this.f2688c.setAdapter(arrayAdapter);
        this.f2688c.setSelection(i);
        this.f2689d = (CheckBox) findViewById(2131558571);
        this.f2689d.setChecked(sharedPreferences.getBoolean("HOMEPAGE_BUTTOM", true));
        this.f2690e = (CheckBox) findViewById(2131558572);
        this.f2690e.setChecked(sharedPreferences.getBoolean("EXIT_PROMPT", false));
        this.f2691f = (CheckBox) findViewById(2131558573);
        this.f2691f.setChecked(sharedPreferences.getBoolean("DISPLAY_TODAY_BALANCE", false));
        this.f2692g = (CheckBox) findViewById(2131558574);
        this.f2692g.setChecked(sharedPreferences.getBoolean("DISPLAY_THIS_WEEK_BALANCE", true));
        this.f2693h = (CheckBox) findViewById(2131558575);
        this.f2693h.setChecked(sharedPreferences.getBoolean("DISPLAY_THIS_MONTH_BALANCE", true));
        this.f2694i = (CheckBox) findViewById(2131558576);
        this.f2694i.setChecked(sharedPreferences.getBoolean("DISPLAY_MONTH_END_BALANCE", false));
        this.f2695j = (CheckBox) findViewById(2131558577);
        this.f2695j.setChecked(sharedPreferences.getBoolean("DISPLAY_YEAR_TO_DATE_BALANCE", false));
        this.f2696k = (CheckBox) findViewById(2131558578);
        this.f2696k.setChecked(sharedPreferences.getBoolean("DISPLAY_TODAY_INCOME", false));
        this.f2697l = (CheckBox) findViewById(2131558579);
        this.f2697l.setChecked(sharedPreferences.getBoolean("DISPLAY_WEEK_INCOME", true));
        this.f2698m = (CheckBox) findViewById(2131558580);
        this.f2702q = new ro(this);
        if ("YES".equalsIgnoreCase(abd.m3786a(this.f2701p, this.f2702q, "excludeTransfer", "NO"))) {
            this.f2698m.setChecked(true);
        } else {
            this.f2698m.setChecked(false);
        }
        this.f2699n = (Spinner) findViewById(2131558581);
        SpinnerAdapter arrayAdapter2 = new ArrayAdapter(this, 2130903151, this.f2703r);
        arrayAdapter2.setDropDownViewResource(17367049);
        this.f2699n.setAdapter(arrayAdapter2);
        this.f2699n.setSelection(sharedPreferences.getInt("DAILY_REMINDER_TIME", 0));
        Button button = (Button) findViewById(2131558582);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new eq(this));
        Button button2 = (Button) findViewById(2131558583);
        aib.m3858a((Context) this, button2, -1);
        button2.setOnClickListener(new es(this));
        this.f2686a.setOnItemSelectedListener(new et(this, getWindow()));
        this.f2687b.setOnItemSelectedListener(new eu(this, button2, button));
        this.f2688c.setOnItemSelectedListener(new ev(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492879, menu);
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            setResult(-1, new Intent());
            finish();
        }
        return false;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                dispatchKeyEvent(new KeyEvent(0, 4));
                return true;
            case 2131558449:
                m2594a();
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
