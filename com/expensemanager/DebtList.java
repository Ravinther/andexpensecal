package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.C0607c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DebtList extends Activity {
    double f2674a;
    double f2675b;
    String f2676c;
    String f2677d;
    private ro f2678e;
    private Context f2679f;

    public DebtList() {
        this.f2674a = 0.0d;
        this.f2675b = 0.0d;
        this.f2679f = this;
    }

    private double m2587a(ro roVar, String str, Map<String, Object> map, String str2) {
        double i = aib.m3877i(str2);
        double d = 0.0d;
        double i2 = aib.m3877i(str2);
        String a = aib.m3852a(map.get("category"));
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        Cursor a2 = roVar.m4192a(str, "expensed ASC");
        if (a2 == null || !a2.moveToFirst()) {
            map.put("amount", "" + i2);
            map.put("paid", "" + d);
            map.put("remaining", "" + i);
            if (a2 != null) {
                a2.close();
            }
            roVar.m4201b();
            return i;
        }
        int columnIndex = a2.getColumnIndex("amount");
        int columnIndex2 = a2.getColumnIndex("category");
        do {
            String string = a2.getString(columnIndex);
            String string2 = a2.getString(columnIndex2);
            if (a.startsWith("Income")) {
                if ("Income".equalsIgnoreCase(string2)) {
                    i2 = aba.m3742a(i2, string);
                    i = aba.m3742a(i, string);
                } else {
                    d = aba.m3742a(d, string);
                    i = aba.m3742a(i, "-" + string);
                }
            } else if ("Income".equalsIgnoreCase(string2)) {
                d = aba.m3742a(d, string);
                i = aba.m3742a(i, "-" + string);
            } else {
                i2 = aba.m3742a(i2, string);
                i = aba.m3742a(i, string);
            }
        } while (a2.moveToNext());
        map.put("amount", "" + i2);
        map.put("paid", "" + d);
        map.put("remaining", "" + i);
        if (a2 != null) {
            a2.close();
        }
        roVar.m4201b();
        return i;
    }

    private void m2589a() {
        this.f2674a = 0.0d;
        this.f2675b = 0.0d;
        List arrayList = new ArrayList();
        ExpenseAccountActivities.m2602a(this.f2678e, this.f2677d, arrayList, false, this.f2676c);
        List arrayList2 = new ArrayList();
        List arrayList3 = new ArrayList();
        int i = 0;
        while (arrayList != null && i < arrayList.size()) {
            Map map = (Map) arrayList.get(i);
            double a = m2587a(this.f2678e, "expense_tag='" + aib.m3852a(map.get("rowId")) + "'", map, (String) map.get("amount"));
            String a2 = aib.m3852a(map.get("category"));
            if (a <= 0.0d) {
                map.put("remaining", "" + a);
                arrayList3.add(map);
            } else {
                arrayList2.add(map);
            }
            if (a2.startsWith("Income")) {
                this.f2674a = aba.m3742a(this.f2674a, "" + a);
            } else {
                this.f2675b = aba.m3742a(this.f2675b, "" + a);
            }
            i++;
        }
        int i2 = 0;
        while (arrayList != null && i2 < arrayList3.size()) {
            arrayList2.add(arrayList3.get(i2));
            i2++;
        }
        ListView listView = (ListView) findViewById(2131558561);
        listView.setAdapter(new en(this, 2130903046, arrayList2));
        listView.setOnItemClickListener(new ek(this));
        TextView textView = (TextView) findViewById(2131558565);
        TextView textView2 = (TextView) findViewById(2131558455);
        ((TextView) findViewById(2131558564)).setText(aib.m3850a(this.f2674a));
        textView.setText(aib.m3850a(this.f2675b));
        textView2.setText(aba.m3762b(this.f2674a - this.f2675b));
        if (this.f2674a - this.f2675b < 0.0d) {
            textView2.setTextColor(co.f4428b);
        }
        if (this.f2674a - this.f2675b > 0.0d) {
            textView2.setTextColor(co.f4429c);
        }
    }

    private void m2591b() {
        aib.m3849a(this.f2679f, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099812), getResources().getString(2131099983), new em(this), getResources().getString(2131099754), null).show();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                if (-1 == i2) {
                    onCreate(null);
                }
            default:
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(getResources().getString(2131099799));
        setContentView(2130903067);
        this.f2678e = new ro(this);
        this.f2676c = "expensed ASC";
        this.f2677d = "expense_tag LIKE '%-%-%' AND (account='$Debt' OR property3='$Debt')";
        m2589a();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492871, menu);
        menu.findItem(2131559157).setTitle(getResources().getString(2131100095) + " " + getResources().getString(2131099944));
        menu.findItem(2131559158).setTitle(getResources().getString(2131100095) + " " + getResources().getString(2131099741));
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        Bundle bundle;
        Intent intent;
        if (itemId == 2131559155) {
            bundle = new Bundle();
            intent = new Intent();
            bundle.putString("account", "Debt");
            bundle.putInt("action", 2131099944);
            intent.putExtras(bundle);
            intent.setClass(this.f2679f, DebtAddEdit.class);
            startActivityForResult(intent, 0);
        } else if (itemId == 2131559156) {
            bundle = new Bundle();
            intent = new Intent();
            bundle.putString("account", "Debt");
            bundle.putString("category", "Income");
            bundle.putInt("action", 2131099741);
            intent.putExtras(bundle);
            intent.setClass(this.f2679f, DebtAddEdit.class);
            startActivityForResult(intent, 0);
        } else if (itemId == 2131559157) {
            this.f2676c = "expensed ASC";
            this.f2677d = "category!='Income' AND expense_tag LIKE '%-%-%' AND (account='$Debt' OR property3='$Debt')";
            m2589a();
        } else if (itemId == 2131559158) {
            this.f2676c = "expensed ASC";
            this.f2677d = "category='Income' AND expense_tag LIKE '%-%-%' AND (account='$Debt' OR property3='$Debt')";
            m2589a();
        } else if (itemId == 2131559159) {
            m2591b();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
