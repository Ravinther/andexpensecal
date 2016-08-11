package com.expensemanager;

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
import android.widget.Button;
import android.widget.ListView;
import com.google.android.gms.C0607c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExpenseRepeatingTransferList extends Activity {
    private Button f3434a;
    private Button f3435b;
    private String f3436c;
    private Context f3437d;
    private ro f3438e;
    private List<Map<String, String>> f3439f;

    public ExpenseRepeatingTransferList() {
        this.f3436c = "Personal Expense";
        this.f3437d = this;
    }

    private void m3412a(int i, String str, String str2, String str3) {
        OnClickListener com_expensemanager_aan = new aan(this, i, str);
        OnClickListener com_expensemanager_aao = new aao(this, i, str2, str3, str);
        Builder builder = new Builder(this.f3437d);
        builder.setTitle(getResources().getString(2131099805)).setMessage(getResources().getString(2131099810)).setCancelable(false).setPositiveButton(getResources().getString(2131099802), com_expensemanager_aao).setNeutralButton(getResources().getString(2131100105), com_expensemanager_aan).setNegativeButton(getResources().getString(2131099754), null);
        builder.show();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.f3436c = extras.getString("account");
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
        int i = 0;
        Map map = (Map) this.f3439f.get(((AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (menuItem.getItemId() == 1) {
            String str = "Transfer:" + ((String) map.get("description"));
            String str2 = "description='" + str + "'";
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this.f3437d, ExpenseAccountActivities.class);
            bundle.putString("title", str);
            bundle.putString("account", (String) map.get("account"));
            bundle.putString("whereClause", str2);
            intent.putExtras(bundle);
            startActivityForResult(intent, 0);
        }
        if (menuItem.getItemId() == 2) {
            str = (String) map.get("description");
            str2 = (String) map.get("rowId");
            if (!(str2 == null || "".equals(str2))) {
                i = new Integer(str2).intValue();
            }
            m3412a(i, str, (String) map.get("account"), (String) map.get("property"));
        }
        return super.onContextItemSelected(menuItem);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903116);
        this.f3438e = new ro(this);
        aba.m3759a((Context) this, this.f3438e);
        this.f3436c = getIntent().getStringExtra("account");
        if ("All".equals(this.f3436c)) {
            this.f3436c = aba.m3772c((Context) this, this.f3438e);
        }
        setTitle(2131099687);
        this.f3435b = (Button) findViewById(2131558879);
        this.f3435b.setVisibility(8);
        aib.m3858a((Context) this, this.f3435b, -1);
        this.f3435b.setOnClickListener(new aak(this));
        this.f3434a = (Button) findViewById(2131558880);
        this.f3434a.setVisibility(8);
        aib.m3858a((Context) this, this.f3434a, -1);
        this.f3434a.setOnClickListener(new aal(this));
        ListView listView = (ListView) findViewById(16908298);
        listView.setItemsCanFocus(true);
        this.f3439f = new ArrayList();
        aba.m3760a(this.f3437d, this.f3438e, "category='Account Transfer'", this.f3439f);
        listView.setAdapter(new cm(this, this.f3439f, 2130903115, new String[]{"description", "frequency", "expenseAmount", "incomeAmount", "from_to", "paidCycleText", "nextPaymentDateStr", "numberOfPaymentText"}, new int[]{2131558423, 2131558421, 2131558424, 2131558422, 2131558425, 2131558426, 2131558671, 2131558670}, null));
        listView.setOnItemClickListener(new aam(this));
        registerForContextMenu(listView);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        if (view.getId() == 16908298) {
            contextMenu.setHeaderTitle((String) ((Map) this.f3439f.get(((AdapterContextMenuInfo) contextMenuInfo).position)).get("description"));
            contextMenu.add(0, 1, 0, 2131100163);
            contextMenu.add(0, 2, 0, 2131099802);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492889, menu);
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Intent intent = new Intent(this.f3437d, ExpenseManager.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f3436c);
            intent.putExtras(bundle);
            setResult(-1, intent);
            finish();
        }
        return false;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        Bundle bundle;
        Intent intent;
        if (itemId == 2131559152) {
            bundle = new Bundle();
            intent = new Intent();
            bundle.putString("account", this.f3436c);
            bundle.putString("category", "Account Transfer");
            intent.putExtras(bundle);
            intent.setClass(this.f3437d, ExpenseAccountTransfer.class);
            startActivityForResult(intent, 0);
            return true;
        } else if (itemId == 2131559169) {
            bundle = new Bundle();
            intent = new Intent();
            bundle.putString("account", this.f3436c);
            bundle.putString("category", "Account Transfer");
            intent.putExtras(bundle);
            intent.setClass(this.f3437d, ExpenseRepeatingTransaction.class);
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
