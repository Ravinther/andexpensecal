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
import java.util.List;

public class CreditCardAccountEditList extends ListActivity {
    private cs f2605a;
    private ListView f2606b;
    private Context f2607c;
    private ArrayList<String> f2608d;
    private String f2609e;
    private String f2610f;
    private ro f2611g;
    private ahz f2612h;
    private aia f2613i;

    public CreditCardAccountEditList() {
        this.f2605a = null;
        this.f2607c = this;
        this.f2610f = "";
        this.f2612h = new cq(this);
        this.f2613i = new cr(this);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (-1 == i2 && i == 0) {
            onCreate(null);
        }
    }

    public void onCreate(Bundle bundle) {
        int i = 0;
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903040);
        setTitle(2131099777);
        this.f2611g = new ro(this);
        this.f2609e = abd.m3786a(this.f2607c, this.f2611g, "MY_ACCOUNT_NAMES", "Personal Expense");
        ArrayList j = aib.m3878j(abd.m3786a(this.f2607c, this.f2611g, "CREDIT_CARD_ACCOUNT", null));
        if (this.f2609e != null && !"".equals(this.f2609e)) {
            int i2;
            this.f2608d = new ArrayList(Arrays.asList(this.f2609e.split(",")));
            List arrayList = new ArrayList(this.f2608d);
            for (i2 = 0; i2 < this.f2608d.size(); i2++) {
                if (j.contains(this.f2608d.get(i2))) {
                    arrayList.set(i2, ((String) this.f2608d.get(i2)) + " - " + getResources().getString(2131099777));
                }
            }
            this.f2606b = getListView();
            this.f2605a = new cs(this, this.f2607c, 2130903160, arrayList);
            setListAdapter(this.f2605a);
            i2 = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
            Drawable drawable = this.f2606b.getResources().getDrawable(17301522);
            if (i2 == 1 || i2 > 3) {
                drawable = this.f2606b.getResources().getDrawable(2130837574);
            }
            this.f2606b.setDivider(drawable);
            TouchListView touchListView = (TouchListView) getListView();
            touchListView.setDropListener(this.f2612h);
            touchListView.setRemoveListener(this.f2613i);
            this.f2606b.setOnItemClickListener(new cp(this));
            int a = abd.m3783a(this.f2607c, this.f2611g, "Default_Account_Index", 0);
            if (a < this.f2608d.size()) {
                i = a;
            }
            this.f2610f = (String) this.f2608d.get(i);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492886, menu);
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Intent intent = new Intent(this.f2607c, CreditCardList.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", getIntent().getStringExtra("account"));
            intent.putExtras(bundle);
            setResult(-1, intent);
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
                Collections.sort(this.f2608d, String.CASE_INSENSITIVE_ORDER);
                abd.m3811a(this.f2607c, this.f2611g, "expense_preference", "MY_ACCOUNT_NAMES", aib.m3857a(this.f2608d, ","));
                onCreate(null);
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
