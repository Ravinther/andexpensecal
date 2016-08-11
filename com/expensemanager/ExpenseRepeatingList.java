package com.expensemanager;

import android.app.ActionBar.OnNavigationListener;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SpinnerAdapter;
import com.google.android.gms.C0607c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExpenseRepeatingList extends Activity {
    private Button f3396a;
    private Button f3397b;
    private String f3398c;
    private Context f3399d;
    private ro f3400e;
    private List<Map<String, String>> f3401f;

    public ExpenseRepeatingList() {
        this.f3398c = "Personal Expense";
        this.f3399d = this;
    }

    private void m3374a() {
        ListView listView = (ListView) findViewById(16908298);
        listView.setItemsCanFocus(true);
        String str = "account='" + this.f3398c + "' AND " + "category" + "!='Account Transfer'" + " AND " + "property2" + " NOT LIKE 'Reminder%'";
        this.f3401f = new ArrayList();
        aba.m3760a(this.f3399d, this.f3400e, str, this.f3401f);
        this.f3401f = abd.m3800a(this.f3401f, true);
        listView.setAdapter(new cm(this, this.f3401f, 2130903115, new String[]{"description", "frequency", "expenseAmount", "incomeAmount", "property", "paidCycleText", "category", "nextPaymentDateStr"}, new int[]{2131558423, 2131558421, 2131558424, 2131558422, 2131558425, 2131558426, 2131558671, 2131558670}, null));
        listView.setOnItemClickListener(new zl(this));
        registerForContextMenu(listView);
    }

    private void m3375a(int i, String str) {
        OnClickListener zmVar = new zm(this, i, str);
        OnClickListener znVar = new zn(this, i, str);
        Builder builder = new Builder(this.f3399d);
        builder.setTitle(getResources().getString(2131099805)).setMessage(getResources().getString(2131099810)).setCancelable(false).setPositiveButton(getResources().getString(2131099802), znVar).setNeutralButton(getResources().getString(2131100105), zmVar).setNegativeButton(getResources().getString(2131099754), null);
        builder.show();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.f3398c = extras.getString("account");
                getIntent().putExtra("account", this.f3398c);
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

    public boolean onContextItemSelected(MenuItem menuItem) {
        Map map = (Map) this.f3401f.get(((AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (menuItem.getItemId() == 1) {
            String str = "Repeating:" + ((String) map.get("description"));
            String str2 = "account='" + this.f3398c + "' and " + "description" + "='" + str + "'";
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this.f3399d, ExpenseAccountActivities.class);
            bundle.putString("title", str);
            bundle.putString("account", (String) map.get("account"));
            bundle.putString("whereClause", str2);
            intent.putExtras(bundle);
            startActivityForResult(intent, 0);
        }
        if (menuItem.getItemId() == 2) {
            str = (String) map.get("description");
            str2 = (String) map.get("rowId");
            int intValue = (str2 == null || "".endsWith(str2)) ? 0 : Integer.valueOf(str2).intValue();
            m3375a(intValue, str);
        }
        if (menuItem.getItemId() == 3) {
            Bundle bundle2 = new Bundle();
            Intent intent2 = new Intent(this.f3399d, ExpenseRepeatingTransaction.class);
            bundle2.putString("account", (String) map.get("account"));
            bundle2.putString("rowId", (String) map.get("rowId"));
            bundle2.putString("fromWhere", "Copy");
            intent2.putExtras(bundle2);
            startActivityForResult(intent2, 0);
        }
        return super.onContextItemSelected(menuItem);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903114);
        this.f3400e = new ro(this);
        aba.m3759a((Context) this, this.f3400e);
        this.f3398c = getIntent().getStringExtra("account");
        if ("All".equals(this.f3398c)) {
            this.f3398c = aba.m3772c((Context) this, this.f3400e);
        }
        setTitle(getResources().getString(2131100047) + ": " + this.f3398c);
        Object arrayList = new ArrayList(Arrays.asList(abd.m3786a(this.f3399d, this.f3400e, "MY_ACCOUNT_NAMES", "Personal Expense").split(",")));
        int indexOf = arrayList.indexOf(this.f3398c);
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903149, arrayList);
        arrayAdapter.setDropDownViewResource(2130903150);
        OnNavigationListener ziVar = new zi(this, arrayList);
        getActionBar().setNavigationMode(1);
        getActionBar().setDisplayShowTitleEnabled(false);
        getActionBar().setListNavigationCallbacks(arrayAdapter, ziVar);
        getActionBar().setSelectedNavigationItem(indexOf);
        this.f3396a = (Button) findViewById(2131558878);
        this.f3396a.setVisibility(8);
        aib.m3858a((Context) this, this.f3396a, -1);
        this.f3396a.setOnClickListener(new zj(this));
        this.f3397b = (Button) findViewById(2131558877);
        this.f3397b.setVisibility(8);
        aib.m3858a((Context) this, this.f3397b, -1);
        this.f3397b.setOnClickListener(new zk(this));
        m3374a();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        if (view.getId() == 16908298) {
            contextMenu.setHeaderTitle(getResources().getString(2131100051) + ": " + ((String) ((Map) this.f3401f.get(((AdapterContextMenuInfo) contextMenuInfo).position)).get("description")));
            contextMenu.add(0, 1, 0, 2131100051);
            contextMenu.add(0, 2, 0, 2131099802);
            contextMenu.add(0, 3, 0, 2131100067);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492881, menu);
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Intent intent = new Intent(this.f3399d, ExpenseManager.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f3398c);
            intent.putExtras(bundle);
            setResult(-1, intent);
            finish();
        }
        return false;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Bundle bundle = new Bundle();
        Intent intent = new Intent();
        switch (menuItem.getItemId()) {
            case 16908332:
                dispatchKeyEvent(new KeyEvent(0, 4));
                return true;
            case 2131559167:
                bundle.putString("account", this.f3398c);
                bundle.putString("category", "Income");
                intent.putExtras(bundle);
                intent.setClass(this.f3399d, ExpenseRepeatingTransaction.class);
                startActivityForResult(intent, 0);
                return true;
            case 2131559168:
                bundle.putString("account", this.f3398c);
                intent.putExtras(bundle);
                intent.setClass(this.f3399d, ExpenseRepeatingTransaction.class);
                startActivityForResult(intent, 0);
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
