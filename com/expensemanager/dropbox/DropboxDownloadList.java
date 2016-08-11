package com.expensemanager.dropbox;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import com.expensemanager.abd;
import java.util.ArrayList;

public class DropboxDownloadList extends ListActivity {
    Context f4506a;
    ArrayList<String> f4507b;

    public DropboxDownloadList() {
        this.f4506a = this;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        this.f4507b = getIntent().getStringArrayListExtra("files");
        setListAdapter(new ArrayAdapter(this, 17367043, this.f4507b));
        getListView().setOnItemClickListener(new C0435k(this, getIntent().getStringExtra("dropboxPath")));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        if ("/ExpenseManager/Receipt/".equals(getIntent().getStringExtra("dropboxPath"))) {
            menu.add(0, 0, 0, 2131100076).setIcon(2130837607).setShowAsAction(8);
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        if (itemId == 0) {
            new C0436l(this, getIntent().getStringExtra("dropboxPath")).execute(new Context[]{this.f4506a});
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
