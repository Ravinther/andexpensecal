package com.expensemanager;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterestTable extends Activity {
    private void m3481a() {
        String stringExtra = getIntent().getStringExtra("Principal Amount");
        String stringExtra2 = getIntent().getStringExtra("Interest Rate");
        String stringExtra3 = getIntent().getStringExtra("Period");
        String stringExtra4 = getIntent().getStringExtra("Monthly Deposit");
        String stringExtra5 = getIntent().getStringExtra("Compounding");
        double i = aib.m3877i(stringExtra);
        double i2 = aib.m3877i(stringExtra4);
        if (stringExtra3 == null || "".equals(stringExtra3)) {
            stringExtra3 = "0";
        }
        int intValue = new Integer(stringExtra3).intValue();
        double i3 = aib.m3877i(stringExtra2);
        List arrayList = new ArrayList();
        for (int i4 = 1; i4 <= intValue; i4++) {
            Map hashMap = new HashMap();
            double d = (double) i4;
            double d2 = (i3 / 12.0d) / 100.0d;
            d2 = (((Math.pow(1.0d + d2, d) - 1.0d) * i2) / d2) + (Math.pow(1.0d + d2, d) * i);
            if ("Daily".equalsIgnoreCase(stringExtra5)) {
                d2 = (i3 / 365.0d) / 100.0d;
                d2 = ((((12.0d * i2) / 365.0d) * (Math.pow(1.0d + d2, (d / 12.0d) * 365.0d) - 1.0d)) / d2) + (Math.pow(1.0d + d2, (d / 12.0d) * 365.0d) * i);
            }
            if ("Quarterly".equalsIgnoreCase(stringExtra5)) {
                d2 = (i3 / 4.0d) / 100.0d;
                d2 = (((3.0d * i2) * (Math.pow(1.0d + d2, d / 3.0d) - 1.0d)) / d2) + (Math.pow(1.0d + d2, d / 3.0d) * i);
            }
            if ("Semiannually".equalsIgnoreCase(stringExtra5)) {
                d2 = (i3 / 2.0d) / 100.0d;
                d2 = (((6.0d * i2) * (Math.pow(1.0d + d2, d / 6.0d) - 1.0d)) / d2) + (Math.pow(1.0d + d2, d / 6.0d) * i);
            }
            if ("Annually".equalsIgnoreCase(stringExtra5)) {
                d2 = i3 / 100.0d;
                d2 = (((12.0d * i2) * (Math.pow(1.0d + d2, d / 12.0d) - 1.0d)) / d2) + (Math.pow(1.0d + d2, d / 12.0d) * i);
            }
            if ("No Compound".equalsIgnoreCase(stringExtra5)) {
                d2 = ((1.0d + (((d / 12.0d) * i3) / 100.0d)) * i) + (i2 * d);
            }
            d2 = aib.m3864b(d2);
            d = aib.m3864b((d2 - i) - (d * i2));
            hashMap.put("months", "" + i4);
            hashMap.put("interest", aib.m3850a(d));
            hashMap.put("balance", aib.m3850a(d2));
            arrayList.add(hashMap);
        }
        ((ListView) findViewById(2131558561)).setAdapter(new cm(this, arrayList, 2130903128, new String[]{"months", "interest", "balance"}, new int[]{2131558423, 2131558421, 2131558424}, null));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903129);
        setTitle("Interest Table");
        m3481a();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
