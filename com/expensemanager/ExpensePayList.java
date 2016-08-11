package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.ListActivity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
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
import com.google.android.gms.C0607c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExpensePayList extends ListActivity {
    public static String[] f3360a;
    public static String[] f3361b;
    private yo f3362c;
    private ListView f3363d;
    private Context f3364e;
    private ArrayList<String> f3365f;
    private String f3366g;
    private String f3367h;
    private String f3368i;
    private EditText f3369j;
    private String f3370k;
    private ro f3371l;
    private boolean f3372m;
    private ahz f3373n;
    private aia f3374o;

    static {
        f3360a = new String[]{"Amazon", "Best Buy", "Costco", "Walmart", "NA"};
        f3361b = new String[]{"My Employer", "My Bank", "My Government", "My Pension", "NA"};
    }

    public ExpensePayList() {
        this.f3362c = null;
        this.f3364e = this;
        this.f3367h = "PAYEE_LIST";
        this.f3368i = aib.m3868b(f3360a, ",");
        this.f3372m = false;
        this.f3373n = new yi(this);
        this.f3374o = new yj(this);
    }

    private LinearLayout m3335a() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(15, 5, 15, 5);
        View textView = new TextView(this);
        textView.setText(2131099972);
        textView.setText(getResources().getString(2131100046));
        textView.setPadding(5, 5, 5, 5);
        textView.setTextSize(16.0f);
        this.f3369j = new EditText(this);
        linearLayout.addView(textView, new LayoutParams(-1, -2));
        linearLayout.addView(this.f3369j, new LayoutParams(-1, -2));
        return linearLayout;
    }

    private void m3340a(String str, int i) {
        new Builder(this.f3364e).setTitle(getResources().getString(2131099805)).setMessage(getResources().getString(2131099808) + str + "?").setPositiveButton(2131099983, new yl(this, str)).setNegativeButton(2131099754, new yk(this)).show();
    }

    public void m3350a(String str) {
        OnClickListener ymVar = new ym(this, str);
        aib.m3849a(this, m3335a(), getResources().getString(2131099860) + ": " + str, -1, null, getResources().getString(2131099983), ymVar, getResources().getString(2131099754), null).show();
        onCreate(null);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if (-1 == i2) {
                    onCreate(null);
                }
            default:
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903042);
        this.f3371l = new ro(this);
        this.f3372m = getIntent().getBooleanExtra("isEdit", false);
        this.f3370k = getIntent().getStringExtra("categoryDisplay");
        if (this.f3370k == null || !this.f3370k.startsWith("Income")) {
            this.f3367h = "PAYEE_LIST";
            this.f3368i = aib.m3868b(f3360a, ",");
            setTitle("Payee List");
        } else {
            this.f3367h = "PAYER_LIST";
            this.f3368i = aib.m3868b(f3361b, ",");
            setTitle("Payer List");
        }
        this.f3366g = abd.m3786a(this.f3364e, this.f3371l, this.f3367h, this.f3368i);
        this.f3365f = new ArrayList(Arrays.asList(this.f3366g.split(",")));
        this.f3363d = getListView();
        ImageButton imageButton = (ImageButton) findViewById(2131558419);
        EditText editText = (EditText) findViewById(2131558418);
        this.f3362c = new yo(this, this.f3364e, 2130903161, this.f3365f);
        setListAdapter(this.f3362c);
        int i = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        Drawable drawable = this.f3363d.getResources().getDrawable(17301522);
        if (i == 1 || i > 3) {
            drawable = this.f3363d.getResources().getDrawable(2130837574);
        }
        this.f3363d.setDivider(drawable);
        TouchListView touchListView = (TouchListView) getListView();
        touchListView.setDropListener(this.f3373n);
        touchListView.setRemoveListener(this.f3374o);
        this.f3363d.setOnItemClickListener(new yg(this));
        registerForContextMenu(this.f3363d);
        imageButton.setOnClickListener(new yh(this, editText));
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558412);
        if (this.f3372m) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        m3350a((String) this.f3365f.get(((AdapterContextMenuInfo) contextMenuInfo).position));
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
                this.f3372m = true;
            } else {
                menuItem.setTitle(2131099860);
                menuItem.setIcon(2130837596);
                this.f3372m = false;
            }
            getIntent().putExtra("isEdit", this.f3372m);
            onCreate(null);
            return true;
        } else if (itemId == 2131559127) {
            this.f3362c.sort(new yn(this));
            Collections.sort(this.f3365f, String.CASE_INSENSITIVE_ORDER);
            this.f3362c.setNotifyOnChange(true);
            abd.m3811a(this.f3364e, this.f3371l, "expense_preference", this.f3367h, aib.m3857a(this.f3365f, ","));
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }
}
