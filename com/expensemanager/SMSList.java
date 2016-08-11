package com.expensemanager;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import com.google.android.gms.C0607c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SMSList extends ListActivity {
    List<Map<String, String>> f3573a;
    Context f3574b;
    String f3575c;
    Map<String, String> f3576d;
    SharedPreferences f3577e;
    private ro f3578f;

    public SMSList() {
        this.f3574b = this;
        this.f3576d = new HashMap();
    }

    private void m3539a(ListView listView, int i) {
        listView.post(new aeu(this, listView, i));
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        int i3 = 0;
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                i3 = extras.getInt("position");
            }
        }
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                if (-1 == i2) {
                    onCreate(null);
                    break;
                }
                break;
        }
        m3539a(getListView(), i3);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        this.f3577e = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        this.f3578f = new ro(this);
        this.f3575c = getIntent().getStringExtra("sender_no");
        setTitle(getResources().getString(2131100092) + ": " + this.f3575c);
        this.f3576d = SMSMain.m3545a(this.f3574b, this.f3578f, this.f3575c);
        String str = this.f3575c;
        this.f3573a = SMSMain.m3544a((Context) this, this.f3575c.replace("_1", "").replace("_2", ""), -1);
        getListView().setAdapter(new aex(this, this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492882, menu);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                return true;
            case 2131559153:
                OnClickListener com_expensemanager_aev = new aev(this);
                aib.m3849a(this.f3574b, null, getResources().getString(2131100090), 17301543, getResources().getString(2131100091), getResources().getString(2131099983), new aew(this), getResources().getString(2131099754), com_expensemanager_aev).show();
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
