package com.expensemanager;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.C0607c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChartNewList extends ListActivity {
    Context f2515a;
    String f2516b;

    public ChartNewList() {
        this.f2515a = this;
        this.f2516b = "";
    }

    private void m2446a(int i, String str) {
        if (str.equals(getResources().getString(2131099756))) {
            Intent intent = new Intent(this.f2515a, ChartNewSummary.class);
            Bundle bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString("account", this.f2516b);
            intent.putExtras(bundle);
            this.f2515a.startActivity(intent);
        }
        if (str.equals(getResources().getString(2131099796))) {
            intent = new Intent(this.f2515a, ChartNewDate.class);
            bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString("account", this.f2516b);
            intent.putExtras(bundle);
            this.f2515a.startActivity(intent);
        }
        if (str.equals(getResources().getString(2131099959))) {
            intent = new Intent(this.f2515a, ChartNewMonthly.class);
            bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString("account", this.f2516b);
            intent.putExtras(bundle);
            this.f2515a.startActivity(intent);
        }
        if (str.equals(getResources().getString(2131099886))) {
            intent = new Intent(this.f2515a, ChartNewBar.class);
            bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString("account", this.f2516b);
            intent.putExtras(bundle);
            startActivity(intent);
        }
        if (str.equals(getResources().getString(2131099933))) {
            intent = new Intent(this.f2515a, ChartNewBar.class);
            bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString("account", this.f2516b);
            intent.putExtras(bundle);
            startActivity(intent);
        }
        if (str.equals(getResources().getString(2131100107))) {
            intent = new Intent(this.f2515a, ChartNewBar.class);
            bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString("account", this.f2516b);
            intent.putExtras(bundle);
            startActivity(intent);
        }
        if (str.equals(getResources().getString(2131099970))) {
            intent = new Intent(this.f2515a, ChartNewCustom.class);
            bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString("account", this.f2516b);
            bundle.putString("type", "new");
            intent.putExtras(bundle);
            this.f2515a.startActivity(intent);
        }
        if (str.equals(getResources().getString(2131099966))) {
            intent = new Intent(this.f2515a, ChartNewPeriod.class);
            bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString("account", this.f2516b);
            intent.putExtras(bundle);
            this.f2515a.startActivity(intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(2131099764);
        this.f2516b = getIntent().getStringExtra("account");
        Resources resources = getResources();
        String[] strArr = new String[]{resources.getString(2131099756), resources.getString(2131099796), resources.getString(2131099959), resources.getString(2131099886), resources.getString(2131099933), resources.getString(2131100107), resources.getString(2131099970), resources.getString(2131099966)};
        List arrayList = new ArrayList();
        for (Object put : strArr) {
            Map hashMap = new HashMap();
            hashMap.put("text", put);
            arrayList.add(hashMap);
        }
        setListAdapter(new cn(this, arrayList, 2130903148, new String[]{"text"}, new int[]{2131558423}));
        getListView().setOnItemClickListener(new au(this, strArr));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 0, 0, 2131099985).setShowAsAction(2);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                startActivity(new Intent(this.f2515a, ExpenseChartList.class));
                break;
            case 16908332:
                onBackPressed();
                break;
        }
        return super.onMenuItemSelected(i, menuItem);
    }
}
