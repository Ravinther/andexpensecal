package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.ListActivity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExpenseIncomeCategoryList extends ListActivity {
    private tq f3226a;
    private ListView f3227b;
    private Context f3228c;
    private ArrayList<String> f3229d;
    private String f3230e;
    private ro f3231f;
    private boolean f3232g;
    private EditText f3233h;
    private ahz f3234i;
    private aia f3235j;

    public ExpenseIncomeCategoryList() {
        this.f3226a = null;
        this.f3228c = this;
        this.f3232g = false;
        this.f3234i = new tk(this);
        this.f3235j = new tl(this);
    }

    private LinearLayout m3180a() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(15, 5, 15, 5);
        View textView = new TextView(this);
        textView.setText(2131099972);
        textView.setText(getResources().getString(2131100046));
        textView.setPadding(5, 5, 5, 5);
        textView.setTextSize(16.0f);
        this.f3233h = new EditText(this);
        linearLayout.addView(textView, new LayoutParams(-1, -2));
        linearLayout.addView(this.f3233h, new LayoutParams(-1, -2));
        return linearLayout;
    }

    private void m3185a(String str, int i) {
        new Builder(this.f3228c).setTitle("Delete confirmation?").setMessage("Are you sure that you want to delete income category: " + str + "?").setPositiveButton(2131099983, new tn(this, str)).setNegativeButton(2131099754, new tm(this)).show();
    }

    public void m3193a(String str) {
        OnClickListener tpVar = new tp(this, str);
        aib.m3849a(this, m3180a(), getResources().getString(2131099860) + ": " + str, -1, null, getResources().getString(2131099983), tpVar, getResources().getString(2131099754), null).show();
        onCreate(null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903042);
        setTitle("Income Category List");
        this.f3231f = new ro(this);
        this.f3232g = getIntent().getBooleanExtra("isEdit", false);
        this.f3230e = abd.m3786a(this.f3228c, this.f3231f, "INCOME_CATEGORY_LIST", getResources().getString(2131099934));
        this.f3229d = new ArrayList(Arrays.asList(this.f3230e.split(",")));
        this.f3227b = getListView();
        ImageButton imageButton = (ImageButton) findViewById(2131558419);
        EditText editText = (EditText) findViewById(2131558418);
        this.f3226a = new tq(this, this.f3228c, 2130903161, this.f3229d);
        setListAdapter(this.f3226a);
        int i = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        Drawable drawable = this.f3227b.getResources().getDrawable(17301522);
        if (i == 1 || i > 3) {
            drawable = this.f3227b.getResources().getDrawable(2130837574);
        }
        this.f3227b.setDivider(drawable);
        TouchListView touchListView = (TouchListView) getListView();
        touchListView.setDropListener(this.f3234i);
        touchListView.setRemoveListener(this.f3235j);
        this.f3227b.setOnItemClickListener(new ti(this));
        registerForContextMenu(this.f3227b);
        imageButton.setOnClickListener(new tj(this, editText));
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558412);
        if (this.f3232g) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        m3193a((String) this.f3229d.get(((AdapterContextMenuInfo) contextMenuInfo).position));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492873, menu);
        if (getIntent().getBooleanExtra("isEdit", false)) {
            menu.getItem(1).setVisible(false);
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131559116) {
            if (getResources().getString(2131099860).equals(menuItem.getTitle())) {
                menuItem.setTitle(2131099983);
                menuItem.setIcon(2130837591);
                this.f3232g = true;
            } else {
                menuItem.setTitle(2131099860);
                menuItem.setIcon(2130837596);
                this.f3232g = false;
            }
            getIntent().putExtra("isEdit", this.f3232g);
            onCreate(null);
            return true;
        } else if (itemId == 2131559127) {
            this.f3226a.sort(new to(this));
            Collections.sort(this.f3229d, String.CASE_INSENSITIVE_ORDER);
            this.f3226a.setNotifyOnChange(true);
            abd.m3811a(this.f3228c, this.f3231f, "expense_preference", "INCOME_CATEGORY_LIST", aib.m3857a(this.f3229d, ","));
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }
}
