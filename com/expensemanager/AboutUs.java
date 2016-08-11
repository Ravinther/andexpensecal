package com.expensemanager;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AboutUs extends ListActivity {
    private Context f2413a;

    public AboutUs() {
        this.f2413a = this;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(getResources().getString(2131099676));
        String[] split = getResources().getString(2131099677).split(",");
        try {
            String str = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            if (str != null) {
                split[0] = split[0] + " - v" + str;
                setTitle(getResources().getString(2131099676) + " - v" + str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        List arrayList = new ArrayList();
        for (String a : split) {
            Map hashMap = new HashMap();
            hashMap.put("text", aib.m3853a(a));
            arrayList.add(hashMap);
        }
        getListView().setAdapter(new cn(this, arrayList, 2130903148, new String[]{"text"}, new int[]{2131558423}));
        getListView().setTextFilterEnabled(true);
        getListView().setOnItemClickListener(new C0395a(this, split));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
