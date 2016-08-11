package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class SMSAddEdit extends Activity {
    String f3561a;
    private TextView f3562b;
    private TextView f3563c;
    private TextView f3564d;
    private TextView f3565e;
    private EditText f3566f;
    private TextView f3567g;
    private TextView f3568h;
    private TextView f3569i;
    private ro f3570j;
    private String f3571k;
    private Context f3572l;

    public SMSAddEdit() {
        this.f3572l = this;
    }

    private void m3527a(String[] strArr, TextView textView) {
        new Builder(this).setTitle(2131100026).setSingleChoiceItems(strArr, new ArrayList(Arrays.asList(strArr)).indexOf(textView.getText().toString()), new aeh(this, strArr)).setPositiveButton(2131099983, new aeg(this, textView)).setNegativeButton(2131099754, new aef(this, textView)).show();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        CharSequence charSequence = "";
        CharSequence charSequence2 = "";
        CharSequence charSequence3 = "";
        CharSequence charSequence4 = "";
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                charSequence = extras.getString("category");
                charSequence2 = extras.getString("account");
                charSequence3 = extras.getString("paymentMethod");
                charSequence4 = extras.getString("status");
            }
        }
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                if (-1 == i2 && charSequence2 != null && !"".equals(charSequence2)) {
                    this.f3562b.setText(charSequence2);
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if (-1 == i2) {
                    this.f3563c.setText(charSequence);
                }
            case C0607c.LoadingImageView_circleCrop /*2*/:
                if (-1 == i2) {
                    this.f3564d.setText(charSequence3);
                    String[] split = abd.m3786a(this.f3572l, this.f3570j, "TRANSACTION_STATUS_KEY", getResources().getString(2131100103)).split(",");
                    if (split != null && split.length > 0) {
                        ArrayList arrayList = new ArrayList(Arrays.asList(split));
                        if ("Cash".equalsIgnoreCase(this.f3564d.getText().toString()) && arrayList.contains("Cleared")) {
                            this.f3565e.setText("Cleared");
                        }
                        if ("Credit Card".equalsIgnoreCase(this.f3564d.getText().toString()) && arrayList.contains("Uncleared")) {
                            this.f3565e.setText("Uncleared");
                        }
                    }
                }
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                if (-1 == i2) {
                    this.f3565e.setText(charSequence4);
                }
            default:
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903152);
        getWindow().setSoftInputMode(3);
        this.f3561a = getIntent().getStringExtra("sender_no");
        setTitle(getResources().getString(2131100092) + ": " + this.f3561a);
        this.f3570j = new ro(this);
        String[] split = abd.m3786a((Context) this, this.f3570j, "MY_ACCOUNT_NAMES", "Personal Expense").split(",");
        this.f3562b = (TextView) findViewById(2131558476);
        this.f3562b.setText(split[0]);
        ((ImageButton) findViewById(2131558475)).setOnClickListener(new adw(this, split));
        this.f3569i = (TextView) findViewById(2131558652);
        this.f3569i.setText(new SimpleDateFormat(ExpenseManager.f3244t).format(new Date()));
        ((ImageButton) findViewById(2131558529)).setOnClickListener(new aei(this));
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558539);
        TextView textView = (TextView) findViewById(2131558538);
        textView.setOnClickListener(new ael(this, sharedPreferences, textView, linearLayout));
        if (sharedPreferences.getBoolean(this.f3571k + "_isOption", false)) {
            linearLayout.setVisibility(0);
            textView.setText(getResources().getString(2131099918));
        }
        if ((getResources().getConfiguration().screenLayout & 15) == 4 || (getResources().getConfiguration().screenLayout & 15) == 3) {
            linearLayout.setVisibility(0);
            textView.setVisibility(8);
        }
        this.f3563c = (TextView) findViewById(2131558543);
        ((ImageButton) findViewById(2131558542)).setOnClickListener(new aem(this));
        TextView textView2 = (TextView) findViewById(2131558541);
        textView2.setPaintFlags(textView2.getPaintFlags() | 8);
        textView2.setOnClickListener(new aen(this));
        this.f3564d = (TextView) findViewById(2131558547);
        this.f3564d.setText(2131099777);
        ((ImageButton) findViewById(2131558546)).setOnClickListener(new aeo(this));
        ImageButton imageButton = (ImageButton) findViewById(2131558987);
        String[] split2 = abd.m3786a(this.f3572l, this.f3570j, "TRANSACTION_STATUS_KEY", "Uncleared").split(",");
        this.f3565e = (TextView) findViewById(2131558684);
        this.f3565e.setText(split2[0]);
        imageButton.setOnClickListener(new aep(this));
        this.f3566f = (EditText) findViewById(2131558548);
        this.f3568h = (TextView) findViewById(2131558993);
        this.f3568h.setText(getIntent().getStringExtra("message"));
        this.f3567g = (TextView) findViewById(2131558992);
        this.f3567g.setText(getIntent().getStringExtra("message"));
        this.f3567g.setOnClickListener(new aeq(this));
        ((TextView) findViewById(2131558990)).setOnClickListener(new aes(this));
        ((Button) findViewById(2131558991)).setOnClickListener(new adx(this));
        Button button = (Button) findViewById(2131558996);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new adz(this));
        button = (Button) findViewById(2131558995);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new aeb(this));
        button = (Button) findViewById(2131558994);
        if (getIntent().getBooleanExtra("isEdit", false)) {
            button.setVisibility(0);
        }
        aib.m3858a((Context) this, button, 2130837530);
        button.setOnClickListener(new aec(this));
        if (getIntent().getBooleanExtra("isEdit", false)) {
            String a = abd.m3786a(this.f3572l, this.f3570j, "SMS_" + this.f3561a, "");
            if (a != null && !"".equals(a)) {
                String[] split3 = a.split("\\|");
                if (split3.length > 0) {
                    this.f3562b.setText(split3[0]);
                }
                if (split3.length > 1) {
                    this.f3563c.setText(split3[1]);
                }
                if (split3.length > 2) {
                    this.f3564d.setText(split3[2]);
                }
                if (split3.length > 3) {
                    this.f3565e.setText(split3[3]);
                }
                if (split3.length > 4) {
                    this.f3566f.setText(split3[4]);
                }
                if (split3.length > 5) {
                    this.f3567g.setText(split3[5]);
                }
                if (split3.length > 5) {
                    this.f3568h.setText(split3[5]);
                }
                if (split3.length > 6) {
                    this.f3569i.setText(aba.m3749a(Long.parseLong(split3[6]), ExpenseManager.f3244t));
                } else {
                    this.f3569i.setText(null);
                }
                if (this.f3563c.getText().toString().startsWith("Income")) {
                    this.f3563c.setTextColor(co.f4429c);
                } else {
                    this.f3563c.setTextColor(co.f4428b);
                }
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }
}
