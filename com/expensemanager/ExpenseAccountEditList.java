package com.expensemanager;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExpenseAccountEditList extends ListActivity {
    private fr f2719a;
    private ListView f2720b;
    private Context f2721c;
    private ArrayList<String> f2722d;
    private String f2723e;
    private String f2724f;
    private ro f2725g;
    private ahz f2726h;
    private aia f2727i;

    public ExpenseAccountEditList() {
        this.f2719a = null;
        this.f2721c = this;
        this.f2724f = "";
        this.f2726h = new fp(this);
        this.f2727i = new fq(this);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (-1 == i2 && i == 0) {
            setResult(-1, new Intent(this.f2721c, ExpenseAccountList.class));
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903040);
        setTitle(2131099860);
        this.f2725g = new ro(this);
        this.f2723e = abd.m3786a(this.f2721c, this.f2725g, "MY_ACCOUNT_NAMES", "Personal Expense");
        this.f2722d = new ArrayList(Arrays.asList(this.f2723e.split(",")));
        this.f2720b = getListView();
        this.f2719a = new fr(this, this.f2721c, 2130903160, this.f2722d);
        setListAdapter(this.f2719a);
        int i = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        Drawable drawable = this.f2720b.getResources().getDrawable(17301522);
        if (i == 1 || i > 3) {
            drawable = this.f2720b.getResources().getDrawable(2130837574);
        }
        this.f2720b.setDivider(drawable);
        TouchListView touchListView = (TouchListView) getListView();
        touchListView.setDropListener(this.f2726h);
        touchListView.setRemoveListener(this.f2727i);
        this.f2720b.setOnItemClickListener(new fo(this));
        int a = abd.m3783a(this.f2721c, this.f2725g, "Default_Account_Index", 0);
        if (a >= this.f2722d.size()) {
            a = 0;
        }
        this.f2724f = (String) this.f2722d.get(a);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492886, menu);
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            setResult(-1, new Intent(this.f2721c, ExpenseAccountList.class));
            finish();
        }
        return false;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                dispatchKeyEvent(new KeyEvent(0, 4));
                return true;
            case 2131559127:
                Collections.sort(this.f2722d, String.CASE_INSENSITIVE_ORDER);
                abd.m3811a(this.f2721c, this.f2725g, "expense_preference", "MY_ACCOUNT_NAMES", aib.m3857a(this.f2722d, ","));
                onCreate(null);
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
