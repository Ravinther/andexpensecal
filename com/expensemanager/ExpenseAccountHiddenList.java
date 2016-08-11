package com.expensemanager;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseAccountHiddenList extends ListActivity {
    String[] f2753a;
    private Context f2754b;

    public ExpenseAccountHiddenList() {
        this.f2754b = this;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (-1 == i2 && i == 0) {
            setResult(-1, new Intent(this.f2754b, ExpenseAccountList.class));
            finish();
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        AdapterContextMenuInfo adapterContextMenuInfo = (AdapterContextMenuInfo) menuItem.getMenuInfo();
        Intent intent = new Intent(this, ExpenseAccountActivities.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f2753a[adapterContextMenuInfo.position]);
        intent.putExtras(bundle);
        startActivityForResult(intent, 0);
        return super.onContextItemSelected(menuItem);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(getResources().getString(2131099917));
        String a = abd.m3786a(this.f2754b, new ro(this), "HIDDEN_ACCOUNT_NAMES", null);
        if (a != null && !"".equals(a)) {
            this.f2753a = a.split(",");
            List arrayList = new ArrayList();
            for (String a2 : this.f2753a) {
                Map hashMap = new HashMap();
                hashMap.put("text", aib.m3853a(a2));
                arrayList.add(hashMap);
            }
            getListView().setAdapter(new cn(this, arrayList, 2130903148, new String[]{"text"}, new int[]{2131558423}));
            getListView().setTextFilterEnabled(true);
            getListView().setOnItemClickListener(new gr(this));
            registerForContextMenu(getListView());
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.setHeaderTitle(this.f2753a[((AdapterContextMenuInfo) contextMenuInfo).position]);
        contextMenu.add(0, 100, 0, 2131100163);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
