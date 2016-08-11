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

public class ExpensePaymentMethodList extends ListActivity {
    private yz f3375a;
    private ListView f3376b;
    private Context f3377c;
    private ArrayList<String> f3378d;
    private String f3379e;
    private ro f3380f;
    private boolean f3381g;
    private EditText f3382h;
    private ahz f3383i;
    private aia f3384j;

    public ExpensePaymentMethodList() {
        this.f3375a = null;
        this.f3377c = this;
        this.f3381g = false;
        this.f3383i = new yt(this);
        this.f3384j = new yu(this);
    }

    private LinearLayout m3351a() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(15, 5, 15, 5);
        View textView = new TextView(this);
        textView.setText(getResources().getString(2131100046));
        textView.setPadding(5, 5, 5, 5);
        textView.setTextSize(16.0f);
        this.f3382h = new EditText(this);
        linearLayout.addView(textView, new LayoutParams(-1, -2));
        linearLayout.addView(this.f3382h, new LayoutParams(-1, -2));
        return linearLayout;
    }

    private void m3356a(String str, int i) {
        new Builder(this.f3377c).setTitle(getResources().getString(2131099805)).setMessage(getResources().getString(2131099808) + str + "?").setPositiveButton(getResources().getString(2131099983), new yw(this, str)).setNegativeButton(getResources().getString(2131099754), new yv(this)).show();
    }

    public void m3364a(String str) {
        OnClickListener yyVar = new yy(this, str);
        aib.m3849a(this, m3351a(), getResources().getString(2131099860) + ": " + str, -1, null, getResources().getString(2131099983), yyVar, getResources().getString(2131099754), null).show();
        onCreate(null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903042);
        setTitle(getResources().getString(2131100013));
        String[] split = getResources().getString(2131100012).split(",");
        this.f3381g = getIntent().getBooleanExtra("isEdit", false);
        this.f3380f = new ro(this);
        this.f3379e = abd.m3786a(this.f3377c, this.f3380f, "PAYMENT_METHOD_KEY", aib.m3868b(split, ","));
        this.f3378d = new ArrayList(Arrays.asList(this.f3379e.split(",")));
        this.f3376b = getListView();
        ImageButton imageButton = (ImageButton) findViewById(2131558419);
        EditText editText = (EditText) findViewById(2131558418);
        this.f3375a = new yz(this, this.f3377c, 2130903161, this.f3378d);
        setListAdapter(this.f3375a);
        int i = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        Drawable drawable = this.f3376b.getResources().getDrawable(17301522);
        if (i == 1 || i > 3) {
            drawable = this.f3376b.getResources().getDrawable(2130837574);
        }
        this.f3376b.setDivider(drawable);
        TouchListView touchListView = (TouchListView) getListView();
        touchListView.setDropListener(this.f3383i);
        touchListView.setRemoveListener(this.f3384j);
        this.f3376b.setOnItemClickListener(new yr(this));
        registerForContextMenu(this.f3376b);
        imageButton.setOnClickListener(new ys(this, editText));
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558412);
        if (this.f3381g) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        m3364a((String) this.f3378d.get(((AdapterContextMenuInfo) contextMenuInfo).position));
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
                this.f3381g = true;
            } else {
                menuItem.setTitle(2131099860);
                menuItem.setIcon(2130837596);
                this.f3381g = false;
            }
            getIntent().putExtra("isEdit", this.f3381g);
            onCreate(null);
            return true;
        } else if (itemId == 2131559127) {
            this.f3375a.sort(new yx(this));
            Collections.sort(this.f3378d, String.CASE_INSENSITIVE_ORDER);
            this.f3375a.setNotifyOnChange(true);
            abd.m3811a(this.f3377c, this.f3380f, "expense_preference", "PAYMENT_METHOD_KEY", aib.m3857a(this.f3378d, ","));
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }
}
