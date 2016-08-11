package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.C0037o;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.C0607c;
import com.viewpagerindicator.TabPageIndicator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ExpenseAccountGroup extends C0037o {
    public static String f2731n;
    public static HashMap<String, String> f2732o;
    public static HashMap<String, HashMap<String, String>> f2733p;
    static TabPageIndicator f2734q;
    static String f2735r;
    private static ro f2736u;
    private static int f2737v;
    private static ViewPager f2738w;
    private static gj f2739x;
    private static ArrayList<String> f2740y;
    private Context f2741s;
    private String f2742t;

    static {
        f2731n = "Personal Expense";
        f2737v = 1;
        f2740y = new ArrayList();
        f2732o = ExpenseManager.f3246v;
        f2733p = new HashMap();
        f2735r = "NO";
    }

    public ExpenseAccountGroup() {
        this.f2741s = this;
        this.f2742t = "";
    }

    public static String m2641a(Context context, ro roVar, String str) {
        String str2;
        String str3 = "";
        int a = abd.m3783a(context, roVar, "BASE_CURRENCY_INDEX", -1);
        if (a == -1) {
            int a2 = abd.m3783a(context, roVar, "Default_Account_Index", -1);
            str2 = (String) f2740y.get(0);
            if (f2740y != null && a2 < f2740y.size() && a2 >= 0) {
                str2 = (String) f2740y.get(a2);
            }
            a = abd.m3783a(context, roVar, str2 + "_CURRENCY", -1);
        }
        if (a != -1) {
            str2 = co.f4436j[a];
            str2 = str2.substring(str2.indexOf(":") + 1);
        } else {
            str2 = str3;
        }
        return (str2 == null || "".equals(str2)) ? str : str + " (" + str2 + ")";
    }

    private void m2647l() {
        setContentView(2130903123);
        f2731n = abd.m3786a(this.f2741s, f2736u, "MY_ACCOUNT_NAMES", null);
        f2740y = new ArrayList();
        String a = abd.m3786a(this.f2741s, f2736u, "ACCOUNT_GROUP_NAME", "");
        if (!"".equals(a)) {
            f2740y = new ArrayList(Arrays.asList(a.split(",")));
        }
        f2740y.add("All");
        f2737v = f2740y.size();
        f2739x = new gj(m366f());
        f2738w = (ViewPager) findViewById(2131558656);
        f2738w.setAdapter(f2739x);
        f2734q = (TabPageIndicator) findViewById(2131558655);
        f2734q.setViewPager(f2738w);
        if (f2737v == 1) {
            f2734q.setVisibility(8);
        }
        setTitle(m2641a(this.f2741s, f2736u, (String) f2740y.get(f2738w.getCurrentItem())));
        f2734q.setOnPageChangeListener(new ft(this));
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!(f2740y == null || f2738w == null || f2738w.getCurrentItem() >= f2740y.size())) {
            this.f2742t = (String) f2740y.get(f2738w.getCurrentItem());
        }
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.f2742t = extras.getString("account");
            }
        }
        if (-1 == i2) {
            try {
                int currentItem = f2738w.getCurrentItem();
                f2740y = new ArrayList();
                String a = abd.m3786a(this.f2741s, f2736u, "ACCOUNT_GROUP_NAME", "");
                if (!"".equals(a)) {
                    f2740y = new ArrayList(Arrays.asList(a.split(",")));
                }
                f2740y.add("All");
                f2737v = f2740y.size();
                if (!(this.f2742t == null || "".equals(this.f2742t))) {
                    currentItem = f2740y.indexOf(this.f2742t);
                }
                f2739x.m145c();
                f2734q.m7177a();
                f2734q.setCurrentItem(currentItem);
                if (f2737v == 1) {
                    f2734q.setVisibility(8);
                } else {
                    f2734q.setVisibility(0);
                }
                setTitle(m2641a(this.f2741s, f2736u, (String) f2740y.get(f2738w.getCurrentItem())));
            } catch (Exception e) {
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        if (i == 1 || i > 3) {
            setTheme(2131230730);
        }
        abd.m3802a((Activity) this, true);
        if (getActionBar() != null) {
            getActionBar().setHomeButtonEnabled(true);
        }
        f2736u = new ro(this);
        f2735r = abd.m3786a(this.f2741s, f2736u, "excludeTransfer", "NO");
        m2647l();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 0, 0, 2131099860).setIcon(2130837596).setShowAsAction(2);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                startActivityForResult(new Intent(this.f2741s, ExpenseAccountGroupEditList.class), 0);
                return true;
            case 16908332:
                onBackPressed();
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
