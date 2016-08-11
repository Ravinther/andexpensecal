package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import com.google.android.gms.C0607c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExpenseAccountGroupEditList extends ListActivity {
    private gq f2743a;
    private ListView f2744b;
    private Context f2745c;
    private ArrayList<String> f2746d;
    private String f2747e;
    private ListView f2748f;
    private EditText f2749g;
    private ro f2750h;
    private ahz f2751i;
    private aia f2752j;

    public ExpenseAccountGroupEditList() {
        this.f2743a = null;
        this.f2745c = this;
        this.f2751i = new gl(this);
        this.f2752j = new gm(this);
    }

    private void m2651a(int i) {
        Builder builder = new Builder(this);
        builder.setTitle(null);
        builder.setView(m2654b(i));
        builder.setPositiveButton(2131099983, new gn(this, i));
        builder.setNegativeButton(2131099754, new go(this));
        if (i > -1) {
            builder.setNeutralButton(2131099802, new gp(this, i));
        }
        builder.show();
    }

    private LinearLayout m2654b(int i) {
        String[] split = abd.m3786a(this.f2745c, this.f2750h, "MY_ACCOUNT_NAMES", "Personal Expense").split(",");
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(15, 25, 15, 15);
        this.f2749g = new EditText(this);
        this.f2749g.setHint(2131099682);
        this.f2748f = new ListView(this);
        this.f2748f.setAdapter(new ArrayAdapter(this, 17367056, split));
        this.f2748f.setItemsCanFocus(false);
        this.f2748f.setChoiceMode(2);
        if (i > -1) {
            this.f2749g.setText((CharSequence) this.f2746d.get(i));
            String str = (String) this.f2746d.get(i);
            if (!(str == null || "".equals(str))) {
                str = abd.m3786a(this.f2745c, this.f2750h, "ACCOUNT_GROUP_NAME_" + str, "");
                List arrayList = new ArrayList(Arrays.asList(split));
                String[] split2 = str.split(",");
                for (Object indexOf : split2) {
                    int indexOf2 = arrayList.indexOf(indexOf);
                    if (indexOf2 < split.length && indexOf2 != -1) {
                        this.f2748f.setItemChecked(indexOf2, true);
                    }
                }
            }
        }
        linearLayout.addView(this.f2749g, new LayoutParams(-1, -2));
        linearLayout.addView(this.f2748f, new LayoutParams(-1, -1));
        return linearLayout;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (-1 == i2 && i == 0) {
            setResult(-1, new Intent(this.f2745c, ExpenseAccountGroup.class));
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903040);
        setTitle(2131099860);
        this.f2750h = new ro(this);
        this.f2746d = new ArrayList();
        this.f2747e = abd.m3786a(this.f2745c, this.f2750h, "ACCOUNT_GROUP_NAME", "");
        if (!"".equals(this.f2747e)) {
            this.f2746d = new ArrayList(Arrays.asList(this.f2747e.split(",")));
            this.f2744b = getListView();
            this.f2743a = new gq(this, this.f2745c, 2130903163, this.f2746d);
            setListAdapter(this.f2743a);
            int i = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
            Drawable drawable = this.f2744b.getResources().getDrawable(17301522);
            if (i == 1 || i > 3) {
                drawable = this.f2744b.getResources().getDrawable(2130837574);
            }
            this.f2744b.setDivider(drawable);
            TouchListView touchListView = (TouchListView) getListView();
            touchListView.setDropListener(this.f2751i);
            touchListView.setRemoveListener(this.f2752j);
            this.f2744b.setOnItemClickListener(new gk(this));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 0, 0, 2131099689).setIcon(2130837599).setShowAsAction(2);
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            setResult(-1, new Intent(this.f2745c, ExpenseAccountList.class));
            finish();
        }
        return false;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                m2651a(-1);
                return true;
            case 16908332:
                dispatchKeyEvent(new KeyEvent(0, 4));
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
