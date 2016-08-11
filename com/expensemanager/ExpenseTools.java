package com.expensemanager;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;

public class ExpenseTools extends ListActivity {
    String f3473a;
    int[] f3474b;
    private Context f3475c;

    public ExpenseTools() {
        this.f3473a = "";
        this.f3474b = new int[]{2130837627, 2130837629, 2130837632, 2130837633, 2130837628, 2130837630, 2130837631};
        this.f3475c = this;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(getResources().getString(2131100138));
        this.f3473a = getIntent().getStringExtra("account");
        ro roVar = new ro(this);
        if (this.f3473a == null || "".equals(this.f3473a) || "All".equals(this.f3473a)) {
            this.f3473a = aba.m3772c((Context) this, roVar);
        }
        String[] split = getResources().getString(2131100137).split(",");
        getListView().setAdapter(new acd(this, this.f3474b, split));
        getListView().setTextFilterEnabled(true);
        getListView().setOnItemClickListener(new aaz(this, split));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Intent intent = new Intent(this.f3475c, ExpenseManager.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f3473a);
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
