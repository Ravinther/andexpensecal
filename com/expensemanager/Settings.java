package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Settings extends ListActivity {
    private Context f3590a;

    public Settings() {
        this.f3590a = this;
    }

    private void m3557a() {
        CharSequence[] split = getResources().getString(2131099943).split(",");
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        new Builder(this).setTitle(2131100026).setSingleChoiceItems(split, sharedPreferences.getInt("LANGUAGE_ID", 7), new afl(this, sharedPreferences)).setPositiveButton(2131099983, new afk(this)).setNegativeButton(2131099754, new afj(this)).show();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(getResources().getString(2131100081));
        String[] split = getResources().getString(2131100080).split(",");
        List arrayList = new ArrayList();
        for (Object put : split) {
            Map hashMap = new HashMap();
            hashMap.put("text", put);
            arrayList.add(hashMap);
        }
        setListAdapter(new cn(this, arrayList, 2130903148, new String[]{"text"}, new int[]{2131558423}));
        getListView().setTextFilterEnabled(true);
        getListView().setOnItemClickListener(new afi(this));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Intent intent = new Intent(this.f3590a, ExpenseManager.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", getIntent().getStringExtra("account"));
            intent.putExtras(bundle);
            setResult(-1, intent);
            finish();
        }
        return false;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        dispatchKeyEvent(new KeyEvent(0, 4));
        return true;
    }
}
