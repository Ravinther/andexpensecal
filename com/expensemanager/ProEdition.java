package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

public class ProEdition extends Activity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903141);
        Button button = (Button) findViewById(2131558583);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new adt(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
