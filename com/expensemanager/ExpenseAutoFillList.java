package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.Button;
import android.widget.ListView;
import com.google.android.gms.C0607c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class ExpenseAutoFillList extends Activity {
    private Button f2879a;
    private Button f2880b;
    private String f2881c;
    private Context f2882d;
    private ro f2883e;
    private ArrayList<Map<String, String>> f2884f;
    private boolean f2885g;
    private km f2886h;
    private ahz f2887i;
    private aia f2888j;

    public ExpenseAutoFillList() {
        this.f2881c = "Personal Expense";
        this.f2882d = this;
        this.f2885g = false;
        this.f2887i = new kg(this);
        this.f2888j = new kh(this);
    }

    private void m2788a() {
        if (this.f2884f != null && this.f2884f.size() != 0) {
            CharSequence[] charSequenceArr = new String[this.f2884f.size()];
            for (int i = 0; i < this.f2884f.size(); i++) {
                charSequenceArr[i] = (String) ((Map) this.f2884f.get(i)).get("description");
            }
            SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
            Editor edit = sharedPreferences.edit();
            new Builder(this).setTitle("Select Prefill for QuickAdd and Widget Add").setSingleChoiceItems(charSequenceArr, new ArrayList(Arrays.asList(charSequenceArr)).indexOf(sharedPreferences.getString("PREFILL", "")), new kd(this, edit, charSequenceArr)).setPositiveButton(2131099983, new kl(this, edit)).setNegativeButton(2131099767, new kk(this, edit)).show();
        }
    }

    private void m2790a(ro roVar) {
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        for (int i = 0; i < this.f2886h.getCount(); i++) {
            try {
                roVar.m4194a("update expense_payee_payer set modified=" + (System.currentTimeMillis() + ((long) i)) + " where " + "_id" + "=" + ((String) ((Map) this.f2886h.getItem(i)).get("rowId")));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        roVar.m4201b();
    }

    private void m2791a(String str, String str2) {
        new Builder(this.f2882d).setTitle(2131099805).setMessage(getResources().getText(2131099808).toString() + str2 + "?").setPositiveButton(2131099983, new kj(this, str)).setNegativeButton(2131099754, new ki(this)).show();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.f2881c = extras.getString("account");
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
        Map map = (Map) this.f2884f.get(((AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (menuItem.getItemId() == 1) {
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this.f2882d, ExpenseAutoFillAddEdit.class);
            bundle.putString("description", (String) map.get("description"));
            bundle.putString("account", (String) map.get("account"));
            bundle.putString("categoryDisplay", getIntent().getStringExtra("categoryDisplay"));
            intent.putExtras(bundle);
            startActivityForResult(intent, 0);
        }
        if (menuItem.getItemId() == 2) {
            m2791a((String) map.get("rowId"), (String) map.get("description"));
        }
        return super.onContextItemSelected(menuItem);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle("Auto Fill");
        setContentView(2130903084);
        this.f2883e = new ro(this);
        this.f2881c = getIntent().getStringExtra("account");
        String stringExtra = getIntent().getStringExtra("categoryDisplay");
        this.f2879a = (Button) findViewById(2131558704);
        this.f2879a.setVisibility(8);
        aib.m3858a((Context) this, this.f2879a, -1);
        this.f2879a.setOnClickListener(new kc(this, stringExtra));
        ListView listView = (ListView) findViewById(16908298);
        listView.setItemsCanFocus(true);
        String str = "category!='Income'";
        if (stringExtra != null && stringExtra.startsWith("Income")) {
            str = "category='Income'";
        }
        this.f2884f = new ArrayList();
        ExpenseAutoFillAddEdit.m2772a(this.f2883e, str, "modified ASC", this.f2884f);
        this.f2886h = new km(this);
        listView.setAdapter(this.f2886h);
        listView.setOnItemClickListener(new ke(this));
        registerForContextMenu(listView);
        TouchListView touchListView = (TouchListView) listView;
        touchListView.setDropListener(this.f2887i);
        touchListView.setRemoveListener(this.f2888j);
        this.f2880b = (Button) findViewById(2131558703);
        this.f2880b.setVisibility(8);
        aib.m3858a((Context) this, this.f2880b, -1);
        this.f2880b.setOnClickListener(new kf(this));
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        if (view.getId() == 16908298) {
            contextMenu.setHeaderTitle((String) ((Map) this.f2884f.get(((AdapterContextMenuInfo) contextMenuInfo).position)).get("description"));
            contextMenu.add(0, 1, 0, 2131099860);
            contextMenu.add(0, 2, 0, 2131099802);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492867, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131559115) {
            Intent intent = new Intent(this.f2882d, ExpenseAutoFillAddEdit.class);
            Bundle bundle = new Bundle();
            bundle.putString("categoryDisplay", getIntent().getStringExtra("categoryDisplay"));
            bundle.putString("account", this.f2881c);
            intent.putExtras(bundle);
            startActivityForResult(intent, 0);
            return true;
        } else if (itemId == 2131559127) {
            if (getResources().getString(2131100094).equals(menuItem.getTitle())) {
                menuItem.setTitle(2131100065);
                menuItem.setIcon(2130837591);
                this.f2885g = true;
                this.f2886h.notifyDataSetChanged();
                return true;
            }
            menuItem.setTitle(2131100094);
            menuItem.setIcon(2130837609);
            this.f2885g = false;
            this.f2886h.notifyDataSetChanged();
            m2790a(this.f2883e);
            return true;
        } else if (itemId == 2131559151) {
            m2788a();
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }
}
