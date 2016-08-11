package com.expensemanager;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import com.google.android.gms.ads.InterstitialAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoreFeatures extends ListActivity {
    private Context f3518a;
    private InterstitialAd f3519b;

    public MoreFeatures() {
        this.f3518a = this;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(getResources().getString(2131099967));
        List arrayList = new ArrayList();
        Map hashMap = new HashMap();
        hashMap.put("text", getResources().getString(2131099777));
        arrayList.add(hashMap);
        hashMap = new HashMap();
        hashMap.put("text", getResources().getString(2131099799));
        arrayList.add(hashMap);
        hashMap = new HashMap();
        hashMap.put("text", getResources().getString(2131100088));
        arrayList.add(hashMap);
        hashMap = new HashMap();
        hashMap.put("text", getResources().getString(2131100082));
        arrayList.add(hashMap);
        getListView().setAdapter(new cn(this, arrayList, 2130903148, new String[]{"text"}, new int[]{2131558423}));
        getListView().setOnItemClickListener(new act(this));
        this.f3519b = abf.m3822b(this);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Intent intent = new Intent(this.f3518a, ExpenseManager.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", getIntent().getStringExtra("account"));
            intent.putExtras(bundle);
            setResult(-1, intent);
            finish();
            if (this.f3519b != null && this.f3519b.isLoaded()) {
                this.f3519b.show();
            }
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
