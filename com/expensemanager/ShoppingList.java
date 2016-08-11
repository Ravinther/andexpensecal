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
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ShoppingList extends ListActivity {
    private afq f3591a;
    private ListView f3592b;
    private Context f3593c;
    private ro f3594d;
    private List<Map<String, Object>> f3595e;
    private ahz f3596f;
    private aia f3597g;

    public ShoppingList() {
        this.f3591a = null;
        this.f3593c = this;
        this.f3596f = new afn(this);
        this.f3597g = new afo(this);
    }

    private void m3560a() {
        aib.m3849a(this.f3593c, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099768), getResources().getString(2131099983), new afp(this), getResources().getString(2131099754), null).show();
    }

    private void m3562a(ro roVar) {
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        for (int i = 0; i < this.f3591a.getCount(); i++) {
            Map map = (Map) this.f3591a.getItem(i);
            if (aba.m3744a((String) map.get("date"), ExpenseManager.f3244t, Locale.US) <= 0) {
                boolean a = roVar.m4198a("expense_report", "_id = " + ((String) map.get("rowId")), "expensed", "" + (i - this.f3591a.getCount()));
                if (a) {
                    abd.m3805a(this.f3593c, a);
                }
            }
        }
        roVar.m4201b();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        onCreate(null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903040);
        setTitle(2131100082);
        this.f3594d = new ro(this);
        this.f3595e = new ArrayList();
        ExpenseAccountActivities.m2602a(this.f3594d, "property3='$ShoppingList' OR account='$ShoppingList'", this.f3595e, false, "expensed DESC");
        this.f3592b = getListView();
        this.f3591a = new afq(this, this.f3593c, 2130903144, this.f3595e);
        setListAdapter(this.f3591a);
        int i = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        Drawable drawable = this.f3592b.getResources().getDrawable(17301522);
        if (i == 1 || i > 3) {
            drawable = this.f3592b.getResources().getDrawable(2130837574);
        }
        this.f3592b.setDivider(drawable);
        TouchListView touchListView = (TouchListView) getListView();
        touchListView.setDropListener(this.f3596f);
        touchListView.setRemoveListener(this.f3597g);
        this.f3592b.setOnItemClickListener(new afm(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492884, menu);
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            setResult(-1, new Intent(this.f3593c, MoreFeatures.class));
            finish();
        }
        return false;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                dispatchKeyEvent(new KeyEvent(0, 4));
                return true;
            case 2131558962:
                m3560a();
                return true;
            case 2131559115:
                Intent intent = new Intent(this.f3593c, ShoppingListAddEdit.class);
                Bundle bundle = new Bundle();
                bundle.putString("fromWhere", "new");
                bundle.putString("account", getIntent().getStringExtra("account"));
                intent.putExtras(bundle);
                startActivityForResult(intent, 0);
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
