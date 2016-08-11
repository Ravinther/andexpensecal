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
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortableItemList extends ListActivity {
    private ahj f3631a;
    private ListView f3632b;
    private Context f3633c;
    private ArrayList<String> f3634d;
    private String f3635e;
    private String f3636f;
    private int f3637g;
    private ro f3638h;
    private boolean f3639i;
    private ahz f3640j;
    private aia f3641k;

    public SortableItemList() {
        this.f3631a = null;
        this.f3633c = this;
        this.f3639i = false;
        this.f3640j = new ahe(this);
        this.f3641k = new ahf(this);
    }

    private void m3612a(String str, int i) {
        new Builder(this.f3633c).setTitle(getResources().getString(2131099805)).setMessage(getResources().getString(2131099808) + str + "?").setPositiveButton(getResources().getString(2131099983), new ahh(this, str)).setNegativeButton(getResources().getString(2131099754), new ahg(this)).show();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903042);
        this.f3638h = new ro(this);
        this.f3639i = getIntent().getBooleanExtra("isEdit", false);
        CharSequence stringExtra = getIntent().getStringExtra("title");
        if (!(stringExtra == null || "".equals(stringExtra))) {
            setTitle(stringExtra);
        }
        this.f3637g = getIntent().getIntExtra("default_string_resource", -1);
        String string = getResources().getString(this.f3637g);
        this.f3636f = getIntent().getStringExtra("saved_string_key");
        this.f3635e = abd.m3786a(this.f3633c, this.f3638h, this.f3636f, string);
        this.f3634d = new ArrayList(Arrays.asList(this.f3635e.split(",")));
        this.f3632b = getListView();
        ImageButton imageButton = (ImageButton) findViewById(2131558419);
        EditText editText = (EditText) findViewById(2131558418);
        this.f3631a = new ahj(this, this.f3633c, 2130903161, this.f3634d);
        setListAdapter(this.f3631a);
        int i = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        Drawable drawable = this.f3632b.getResources().getDrawable(17301522);
        if (i == 1 || i > 3) {
            drawable = this.f3632b.getResources().getDrawable(2130837574);
        }
        this.f3632b.setDivider(drawable);
        TouchListView touchListView = (TouchListView) getListView();
        touchListView.setDropListener(this.f3640j);
        touchListView.setRemoveListener(this.f3641k);
        this.f3632b.setOnItemClickListener(new ahc(this));
        imageButton.setOnClickListener(new ahd(this, editText));
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558412);
        if (this.f3639i) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492873, menu);
        if (getIntent().getBooleanExtra("isEdit", false)) {
            menu.getItem(1).setVisible(false);
        }
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && "EXPENSE_TAG".equals(this.f3636f)) {
            setResult(-1, new Intent());
            finish();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131559116) {
            if (getResources().getString(2131099860).equals(menuItem.getTitle())) {
                menuItem.setTitle(2131099983);
                menuItem.setIcon(2130837591);
                this.f3639i = true;
            } else {
                menuItem.setTitle(2131099860);
                menuItem.setIcon(2130837596);
                this.f3639i = false;
            }
            getIntent().putExtra("isEdit", this.f3639i);
            onCreate(null);
            return true;
        } else if (itemId == 2131559127) {
            this.f3631a.sort(new ahi(this));
            Collections.sort(this.f3634d, String.CASE_INSENSITIVE_ORDER);
            this.f3631a.setNotifyOnChange(true);
            abd.m3811a(this.f3633c, this.f3638h, "expense_preference", this.f3636f, aib.m3857a(this.f3634d, ","));
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            dispatchKeyEvent(new KeyEvent(0, 4));
            onBackPressed();
            return true;
        }
    }
}
