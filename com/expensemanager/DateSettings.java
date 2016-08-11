package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import java.util.Calendar;

public class DateSettings extends Activity {
    private Context f2651a;
    private String[] f2652b;
    private ro f2653c;

    public DateSettings() {
        this.f2651a = this;
        this.f2652b = new String[]{"yyyy-MM-dd 2011-12-31", "MM-dd-yyyy 12-31-2011", "dd-MM-yyyy 31-12-2011", "yyyy/MM/dd 2011/12/31", "MM/dd/yyyy 12/31/2011", "dd/MM/yyyy 31/12/2011", "yyyy.MM.dd 2011.12.31", "MM.dd.yyyy 12.31.2011", "dd.MM.yyyy 31.12.2011"};
    }

    protected void onCreate(Bundle bundle) {
        int i = 0;
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903065);
        setTitle(2131099794);
        this.f2653c = new ro(this);
        int a = abd.m3783a(this.f2651a, this.f2653c, "firstMonthOfYear", 0);
        int a2 = abd.m3783a(this.f2651a, this.f2653c, "firstDayOfMonth", 1);
        int a3 = abd.m3783a(this.f2651a, this.f2653c, "firstDayOfWeek", Calendar.getInstance().getFirstDayOfWeek());
        String a4 = abd.m3786a(this.f2651a, this.f2653c, "DATE_FORMAT", "yyyy-MM-dd");
        int i2 = 0;
        while (i2 < this.f2652b.length) {
            if (this.f2652b[i2].startsWith(a4)) {
                break;
            }
            i2++;
        }
        i2 = 0;
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, this.f2652b);
        arrayAdapter.setDropDownViewResource(17367049);
        Spinner spinner = (Spinner) findViewById(2131558512);
        spinner.setAdapter(arrayAdapter);
        spinner.setSelection(i2);
        String[] split = getResources().getString(2131100164).split(",");
        SpinnerAdapter arrayAdapter2 = new ArrayAdapter(this, 2130903151, split);
        arrayAdapter2.setDropDownViewResource(17367049);
        Spinner spinner2 = (Spinner) findViewById(2131558513);
        spinner2.setAdapter(arrayAdapter2);
        i2 = a3 > split.length ? Calendar.getInstance().getFirstDayOfWeek() : a2;
        spinner2.setSelection(a3 - 1);
        String[] strArr = new String[28];
        for (a2 = 0; a2 < 28; a2++) {
            strArr[a2] = "" + (a2 + 1);
        }
        arrayAdapter2 = new ArrayAdapter(this, 2130903151, strArr);
        arrayAdapter2.setDropDownViewResource(17367049);
        Spinner spinner3 = (Spinner) findViewById(2131558514);
        spinner3.setAdapter(arrayAdapter2);
        if (i2 > strArr.length) {
            i2 = 1;
        }
        spinner3.setSelection(i2 - 1);
        String string = getResources().getString(2131099964);
        SpinnerAdapter arrayAdapter3 = new ArrayAdapter(this, 2130903151, string.split(","));
        arrayAdapter3.setDropDownViewResource(17367049);
        Spinner spinner4 = (Spinner) findViewById(2131558515);
        spinner4.setAdapter(arrayAdapter3);
        if (a <= string.split(",").length) {
            i = a;
        }
        spinner4.setSelection(i);
        Button button = (Button) findViewById(2131558449);
        Button button2 = (Button) findViewById(2131558516);
        aib.m3858a((Context) this, button, -1);
        aib.m3858a((Context) this, button2, -1);
        button.setOnClickListener(new dn(this, spinner3, spinner2, spinner4, spinner));
        button2.setOnClickListener(new C0424do(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
