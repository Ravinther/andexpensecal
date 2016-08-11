package com.expensemanager;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import com.google.android.gms.C0607c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TagList extends ListActivity {
    ListView f3642a;
    private ArrayList<String> f3643b;
    private Button f3644c;
    private Button f3645d;
    private Button f3646e;
    private ro f3647f;
    private Context f3648g;
    private String f3649h;

    public TagList() {
        this.f3643b = new ArrayList();
        this.f3648g = this;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                if (-1 == i2) {
                    onCreate(null);
                }
            default:
        }
    }

    public void onCreate(Bundle bundle) {
        int i = 0;
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903156);
        setTitle(2131100110);
        this.f3647f = new ro(this);
        String[] split = abd.m3786a((Context) this, this.f3647f, "EXPENSE_TAG", getResources().getString(2131100111)).split(",");
        this.f3643b = new ArrayList(Arrays.asList(split));
        setListAdapter(new ArrayAdapter(this, 17367056, split));
        this.f3642a = getListView();
        this.f3642a.setItemsCanFocus(false);
        this.f3642a.setChoiceMode(2);
        this.f3649h = getIntent().getStringExtra("tag");
        if (!(this.f3649h == null || "".equals(this.f3649h))) {
            split = this.f3649h.split(",");
            while (i < split.length) {
                this.f3642a.setItemChecked(this.f3643b.indexOf(split[i]), true);
                i++;
            }
        }
        this.f3645d = (Button) findViewById(2131558703);
        this.f3645d.setVisibility(8);
        aib.m3858a((Context) this, this.f3645d, -1);
        this.f3645d.setOnClickListener(new ahl(this));
        this.f3644c = (Button) findViewById(2131558998);
        this.f3644c.setVisibility(8);
        aib.m3858a((Context) this, this.f3644c, -1);
        this.f3644c.setOnClickListener(new ahm(this));
        this.f3646e = (Button) findViewById(2131558583);
        this.f3646e.setVisibility(8);
        aib.m3858a((Context) this, this.f3646e, -1);
        this.f3646e.setOnClickListener(new ahn(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492888, menu);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        int i2 = 0;
        Intent intent;
        Bundle bundle;
        switch (menuItem.getItemId()) {
            case 2131558449:
                SparseBooleanArray checkedItemPositions = this.f3642a.getCheckedItemPositions();
                ArrayList arrayList = new ArrayList();
                while (i2 < this.f3643b.size()) {
                    if (checkedItemPositions.get(i2)) {
                        arrayList.add(this.f3643b.get(i2));
                    }
                    i2++;
                }
                String a = aib.m3857a(arrayList, ",");
                intent = new Intent();
                bundle = new Bundle();
                bundle.putString("tag", a);
                intent.putExtras(bundle);
                setResult(-1, intent);
                finish();
                return true;
            case 2131558493:
                Intent intent2 = new Intent();
                Bundle bundle2 = new Bundle();
                bundle2.putString("tag", "");
                intent2.putExtras(bundle2);
                setResult(-1, intent2);
                finish();
                return true;
            case 2131559116:
                intent = new Intent(this.f3648g, SortableItemList.class);
                bundle = new Bundle();
                bundle.putInt("default_string_resource", 2131100111);
                bundle.putString("saved_string_key", "EXPENSE_TAG");
                bundle.putString("selected_item_key", "tag");
                bundle.putBoolean("isEdit", true);
                intent.putExtras(bundle);
                startActivityForResult(intent, 0);
                return true;
            case 2131559127:
                Collections.sort(this.f3643b);
                abd.m3811a(this.f3648g, this.f3647f, "expense_preference", "EXPENSE_TAG", aib.m3857a(this.f3643b, ","));
                onCreate(null);
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
