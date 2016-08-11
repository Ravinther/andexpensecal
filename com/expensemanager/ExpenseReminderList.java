package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ListView;
import com.google.android.gms.C0607c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseReminderList extends Activity {
    private Button f3385a;
    private String f3386b;
    private Context f3387c;
    private ro f3388d;
    private List<Map<String, String>> f3389e;

    public ExpenseReminderList() {
        this.f3386b = "Personal Expense";
        this.f3387c = this;
    }

    private void m3366a(int i, String str, String str2) {
        OnClickListener zfVar = new zf(this, i, str);
        OnClickListener zgVar = new zg(this, i, str2);
        Builder builder = new Builder(this.f3387c);
        builder.setTitle(getResources().getString(2131099805)).setMessage(getResources().getString(2131099810)).setCancelable(false).setPositiveButton(getResources().getString(2131099802), zgVar).setNeutralButton(getResources().getString(2131100105), zfVar).setNegativeButton(getResources().getString(2131099754), null);
        builder.show();
    }

    public void m3370a(ro roVar, String str, Map<String, ArrayList<Map<String, String>>> map, String str2) {
        double d = 0.0d;
        double d2 = 0.0d;
        roVar.m4193a();
        Cursor a = roVar.m4192a(str, str2);
        if (a != null && a.moveToFirst()) {
            int columnIndex = a.getColumnIndex("_id");
            int columnIndex2 = a.getColumnIndex("account");
            int columnIndex3 = a.getColumnIndex("amount");
            int columnIndex4 = a.getColumnIndex("category");
            int columnIndex5 = a.getColumnIndex("subcategory");
            int columnIndex6 = a.getColumnIndex("expensed");
            int columnIndex7 = a.getColumnIndex("description");
            int columnIndex8 = a.getColumnIndex("payment_method");
            int columnIndex9 = a.getColumnIndex("reference_number");
            int columnIndex10 = a.getColumnIndex("property");
            int columnIndex11 = a.getColumnIndex("status");
            int columnIndex12 = a.getColumnIndex("property2");
            int columnIndex13 = a.getColumnIndex("expense_tag");
            int columnIndex14 = a.getColumnIndex("tax");
            int columnIndex15 = a.getColumnIndex("property3");
            int columnIndex16 = a.getColumnIndex("property4");
            int columnIndex17 = a.getColumnIndex("property5");
            while (true) {
                Object obj;
                Object obj2;
                Object obj3;
                Object obj4;
                HashMap hashMap = new HashMap();
                String str3 = "" + a.getLong(columnIndex);
                String b = aib.m3865b(a.getString(columnIndex2));
                String b2 = aib.m3865b(a.getString(columnIndex3));
                String b3 = aib.m3865b(a.getString(columnIndex4));
                long j = a.getLong(columnIndex6);
                String b4 = aib.m3865b(a.getString(columnIndex7));
                String b5 = aib.m3865b(a.getString(columnIndex5));
                String b6 = aib.m3865b(a.getString(columnIndex8));
                String b7 = aib.m3865b(a.getString(columnIndex9));
                String b8 = aib.m3865b(a.getString(columnIndex10));
                String b9 = aib.m3865b(a.getString(columnIndex11));
                String b10 = aib.m3865b(a.getString(columnIndex12));
                if (!"".equalsIgnoreCase(b10) && b4.indexOf("\u2605") == -1) {
                    b4 = b4 + "\u2605";
                }
                String str4 = b3 + "," + b4;
                if (b5 == null || "".equals(b5)) {
                    String str5 = str4;
                    str4 = b3;
                } else {
                    obj = b3 + ":" + b5 + "," + b4;
                    obj2 = b3 + ":" + b5;
                }
                String b11 = aib.m3865b(a.getString(columnIndex13));
                String b12 = aib.m3865b(a.getString(columnIndex14));
                String b13 = aib.m3865b(a.getString(columnIndex15));
                String b14 = aib.m3865b(a.getString(columnIndex16));
                String b15 = aib.m3865b(a.getString(columnIndex17));
                if (b11 == null || "".equals(b11)) {
                    b5 = b4;
                } else {
                    obj3 = b11 + ";" + b4;
                }
                hashMap.put("rowId", str3);
                hashMap.put("description", b4);
                hashMap.put("date", aba.m3749a(j, ExpenseManager.f3244t));
                hashMap.put("dateWithDay", aba.m3749a(j, ExpenseManager.f3244t + " EEE"));
                hashMap.put("category", obj2);
                hashMap.put("account", b);
                hashMap.put("paymentMethod", b6);
                hashMap.put("referenceNumber", b7);
                hashMap.put("property", b8);
                hashMap.put("status", b9);
                hashMap.put("property2", b10);
                hashMap.put("amount", b2);
                if ("Income".equalsIgnoreCase(b3)) {
                    hashMap.put("income", aba.m3767b(b2));
                    hashMap.put("expense", "");
                    b4 = b2;
                } else {
                    hashMap.put("expense", aba.m3767b(b2));
                    hashMap.put("income", "");
                    b4 = !b2.startsWith("-") ? "-" + b2 : b2.replaceFirst("-", "");
                }
                double a2 = aba.m3742a(d, b4);
                if (b7 == null || "".equals(b7)) {
                    String str6 = b6;
                } else {
                    obj4 = b6 + "|" + b7;
                }
                hashMap.put("paymentMethod_referenceNumber", obj4);
                hashMap.put("tag", b11);
                hashMap.put("tax", b12);
                hashMap.put("property3", b13);
                hashMap.put("property4", b14);
                hashMap.put("property5", b15);
                hashMap.put("fulldescription", obj3);
                hashMap.put("subTotal", aba.m3746a(a2));
                hashMap.put("desc", obj);
                d = aba.m3742a(d2, b12);
                hashMap.put("taxTotal", aba.m3746a(d));
                if (map.get(b13) != null) {
                    ((ArrayList) map.get(b13)).add(hashMap);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(hashMap);
                    map.put(b13, arrayList);
                }
                if (!a.moveToNext()) {
                    break;
                }
                d2 = d;
                d = a2;
            }
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.f3386b = extras.getString("account");
            }
        }
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
        setContentView(2130903109);
        setTitle(getResources().getString(2131100133) + ": " + new SimpleDateFormat(ExpenseManager.f3244t).format(Calendar.getInstance().getTime()));
        this.f3388d = new ro(this);
        this.f3386b = getIntent().getStringExtra("account");
        this.f3385a = (Button) findViewById(2131558853);
        this.f3385a.setVisibility(8);
        aib.m3858a((Context) this, this.f3385a, -1);
        this.f3385a.setOnClickListener(new zc(this));
        ListView listView = (ListView) findViewById(16908298);
        listView.setItemsCanFocus(true);
        this.f3389e = new ArrayList();
        aba.m3760a(this.f3387c, this.f3388d, "category!='Account Transfer' AND property2 LIKE 'Reminder%'", this.f3389e);
        Map hashMap = new HashMap();
        ro roVar = this.f3388d;
        m3370a(roVar, "property3 LIKE 'Reminder%'", hashMap, "expensed DESC");
        this.f3389e = abd.m3799a(this.f3389e, hashMap, true);
        listView.setAdapter(new zb(this.f3387c, 2130903110, this.f3389e, hashMap));
        listView.setOnItemClickListener(new zd(this, new String[]{getResources().getString(2131100002), getResources().getString(2131100163), getResources().getString(2131099860), getResources().getString(2131099802)}, hashMap));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492880, menu);
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Intent intent = new Intent(this.f3387c, ExpenseManager.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f3386b);
            intent.putExtras(bundle);
            setResult(-1, intent);
            finish();
        }
        return false;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131559115) {
            Bundle bundle = new Bundle();
            Intent intent = new Intent();
            bundle.putString("account", this.f3386b);
            bundle.putString("reminder", "YES");
            intent.putExtras(bundle);
            intent.setClass(this.f3387c, ExpenseRepeatingTransaction.class);
            startActivityForResult(intent, 0);
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            dispatchKeyEvent(new KeyEvent(0, 4));
            return true;
        }
    }
}
