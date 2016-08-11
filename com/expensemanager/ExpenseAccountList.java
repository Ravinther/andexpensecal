package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import com.google.android.gms.C0607c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

public class ExpenseAccountList extends ListActivity {
    HashMap<String, String> f2755a;
    String f2756b;
    private Button f2757c;
    private Button f2758d;
    private Button f2759e;
    private String f2760f;
    private String[] f2761g;
    private String[] f2762h;
    private Context f2763i;
    private int f2764j;
    private String f2765k;
    private ro f2766l;
    private HashMap<String, String> f2767m;
    private TextView f2768n;
    private String f2769o;

    public ExpenseAccountList() {
        this.f2763i = this;
        this.f2764j = 0;
        this.f2765k = "Personal Expense";
        this.f2767m = new HashMap();
        this.f2769o = "";
        this.f2755a = new HashMap();
        this.f2756b = null;
    }

    public static HashMap<String, String> m2664a(ro roVar, String str, HashMap<String, String> hashMap) {
        double d = 0.0d;
        try {
            double d2;
            double d3;
            String str2 = "account='" + str + "'";
            if ("All".equalsIgnoreCase(str)) {
                str2 = "";
            }
            if (!roVar.m4206d()) {
                roVar.m4193a();
            }
            Cursor a = roVar.m4192a(str2, "expensed ASC");
            if (a == null || !a.moveToFirst()) {
                d2 = 0.0d;
                d3 = 0.0d;
            } else {
                int columnIndex = a.getColumnIndex("amount");
                int columnIndex2 = a.getColumnIndex("category");
                d2 = 0.0d;
                d3 = 0.0d;
                double d4 = 0.0d;
                while (true) {
                    String str3;
                    String string = a.getString(columnIndex);
                    String str4;
                    if ("Income".equalsIgnoreCase(a.getString(columnIndex2))) {
                        d3 = aba.m3742a(d3, string);
                        str4 = string;
                        d = d2;
                        d2 = d3;
                        str3 = str4;
                    } else {
                        d2 = aba.m3742a(d2, string);
                        str4 = "-" + string;
                        d = d2;
                        d2 = d3;
                        str3 = str4;
                    }
                    d3 = aba.m3742a(d4, str3);
                    if (!a.moveToNext()) {
                        break;
                    }
                    d4 = d3;
                    d3 = d2;
                    d2 = d;
                }
            }
            hashMap.put(str + "_balance", aba.m3746a(d3));
            hashMap.put(str + "_income", aba.m3746a(d2));
            hashMap.put(str + "_expense", aba.m3746a(d));
            if (a != null) {
                a.close();
            }
            roVar.m4201b();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashMap;
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
        setTitle(2131099678);
        setContentView(2130903073);
        this.f2766l = new ro(this);
        this.f2755a = abd.m3796a(this.f2766l);
        this.f2757c = (Button) findViewById(2131558639);
        this.f2757c.setVisibility(8);
        aib.m3858a((Context) this, this.f2757c, -1);
        this.f2757c.setOnClickListener(new gs(this));
        this.f2764j = abd.m3784a((String) this.f2755a.get("Default_Account_Index"), 0);
        this.f2758d = (Button) findViewById(2131558640);
        this.f2758d.setVisibility(8);
        aib.m3858a((Context) this, this.f2758d, -1);
        this.f2758d.setOnClickListener(new gt(this));
        this.f2759e = (Button) findViewById(2131558641);
        this.f2759e.setVisibility(8);
        aib.m3858a((Context) this, this.f2759e, -1);
        this.f2759e.setOnClickListener(new gw(this));
        String str = (String) this.f2755a.get("MY_ACCOUNT_NAMES");
        if (str == null || "".equals(str)) {
            str = "Personal Expense";
        }
        if (this.f2756b != null) {
            str = this.f2756b;
        }
        this.f2761g = str.split(",");
        this.f2762h = new String[this.f2761g.length];
        if (this.f2764j >= this.f2761g.length) {
            this.f2764j = 0;
        }
        if (this.f2761g != null && this.f2764j < this.f2761g.length && this.f2764j >= 0) {
            this.f2765k = this.f2761g[this.f2764j];
        }
        int i = 0;
        while (this.f2761g != null && i < this.f2761g.length) {
            this.f2762h[i] = aib.m3865b((String) this.f2755a.get(this.f2761g[i] + "_DESCRIPTION"));
            i++;
        }
        if ("".equals(this.f2762h[0])) {
            this.f2762h[0] = "Personal Expense Account";
        }
        this.f2768n = (TextView) findViewById(2131558642);
        for (String a : this.f2761g) {
            this.f2767m = m2664a(this.f2766l, a, this.f2767m);
        }
        ListView listView = (ListView) findViewById(16908298);
        listView.setItemsCanFocus(true);
        listView.setAdapter(new hd(this, this));
        int a2 = abd.m3784a((String) this.f2755a.get("BASE_CURRENCY_INDEX"), -1);
        if (a2 != -1) {
            this.f2769o = aib.m3851a(a2);
        } else {
            this.f2769o = aib.m3851a(abd.m3784a((String) this.f2755a.get(this.f2765k + "_CURRENCY"), -1));
        }
        new hc(this).execute(new Context[]{this});
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492864, menu);
        MenuItem findItem = menu.findItem(2131559122);
        SearchView searchView = (SearchView) menu.findItem(2131559122).getActionView();
        ArrayList arrayList = new ArrayList();
        searchView.setOnSuggestionListener(new gx(this, arrayList, searchView));
        searchView.setOnQueryTextListener(new gy(this, arrayList, searchView));
        searchView.setOnQueryTextFocusChangeListener(new gz(this, findItem, searchView));
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) searchView.findViewById(searchView.getContext().getResources().getIdentifier("android:id/search_src_text", null, null));
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(autoCompleteTextView, Integer.valueOf(0));
        } catch (Exception e) {
        }
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            setResult(-1, new Intent(this.f2763i, ExpenseManager.class));
            finish();
        }
        return false;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        Intent intent;
        Bundle bundle;
        if (itemId == 2131559115) {
            intent = new Intent(this.f2763i, ExpenseNewAccount.class);
            bundle = new Bundle();
            bundle.putBoolean("isNew", true);
            intent.putExtras(bundle);
            startActivityForResult(intent, 0);
            return true;
        } else if (itemId == 2131559118) {
            startActivityForResult(new Intent(this.f2763i, ExpenseAccountGroup.class), 0);
            return true;
        } else if (itemId == 2131559116) {
            startActivityForResult(new Intent(this.f2763i, ExpenseAccountEditList.class), 0);
            return true;
        } else if (itemId == 2131558605) {
            startActivityForResult(new Intent(this.f2763i, ExpenseAccountHiddenList.class), 0);
            return true;
        } else if (itemId == 2131559119) {
            Builder builder = new Builder(this.f2763i);
            builder.setTitle(2131100023);
            builder.setSingleChoiceItems(this.f2761g, this.f2764j, new ha(this));
            builder.setPositiveButton(2131099983, new hb(this));
            builder.create();
            builder.show();
            return true;
        } else if (itemId == 2131559120) {
            intent = new Intent(this, ExpenseRepeatingTransferList.class);
            bundle = new Bundle();
            bundle.putString("account", this.f2765k);
            intent.putExtras(bundle);
            startActivityForResult(intent, 0);
            return true;
        } else if (itemId == 2131559121) {
            startActivityForResult(new Intent(this, CurrencySettings.class), 0);
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            dispatchKeyEvent(new KeyEvent(0, 4));
            return true;
        }
    }
}
