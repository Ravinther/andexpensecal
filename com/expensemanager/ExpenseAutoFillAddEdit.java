package com.expensemanager;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExpenseAutoFillAddEdit extends Activity {
    private Context f2863a;
    private CheckBox f2864b;
    private TextView f2865c;
    private TextView f2866d;
    private EditText f2867e;
    private EditText f2868f;
    private EditText f2869g;
    private TextView f2870h;
    private Button f2871i;
    private EditText f2872j;
    private String f2873k;
    private ro f2874l;
    private boolean f2875m;
    private Map<String, String> f2876n;
    private String f2877o;
    private String f2878p;

    public ExpenseAutoFillAddEdit() {
        this.f2863a = this;
        this.f2873k = "";
        this.f2875m = false;
        this.f2877o = "";
        this.f2878p = "";
    }

    public static Map<String, String> m2770a(ro roVar, String str) {
        Map<String, String> hashMap = new HashMap();
        try {
            if (!roVar.m4206d()) {
                roVar.m4193a();
            }
            Cursor f = roVar.m4208f(str, null);
            if (f != null && f.moveToFirst()) {
                int columnIndex = f.getColumnIndex("_id");
                int columnIndex2 = f.getColumnIndex("account");
                int columnIndex3 = f.getColumnIndex("amount");
                int columnIndex4 = f.getColumnIndex("category");
                int columnIndex5 = f.getColumnIndex("subcategory");
                int columnIndex6 = f.getColumnIndex("payment_method");
                int columnIndex7 = f.getColumnIndex("description");
                int columnIndex8 = f.getColumnIndex("reference_number");
                int columnIndex9 = f.getColumnIndex("property");
                int columnIndex10 = f.getColumnIndex("status");
                int columnIndex11 = f.getColumnIndex("address");
                int columnIndex12 = f.getColumnIndex("payee_payer");
                int columnIndex13 = f.getColumnIndex("modified");
                do {
                    String str2 = "" + f.getLong(columnIndex);
                    String string = f.getString(columnIndex2);
                    String string2 = f.getString(columnIndex3);
                    String string3 = f.getString(columnIndex4);
                    String string4 = f.getString(columnIndex5);
                    String string5 = f.getString(columnIndex6);
                    String string6 = f.getString(columnIndex7);
                    String string7 = f.getString(columnIndex8);
                    String string8 = f.getString(columnIndex9);
                    String string9 = f.getString(columnIndex10);
                    String string10 = f.getString(columnIndex11);
                    String string11 = f.getString(columnIndex12);
                    String str3 = "" + f.getLong(columnIndex13);
                    hashMap.put("rowId", str2);
                    hashMap.put("modifiedDate", str3);
                    hashMap.put("account", string);
                    hashMap.put("amount", string2);
                    hashMap.put("categoryDisplay", string3 + ":" + string4);
                    hashMap.put("paymentMethod", string5);
                    hashMap.put("referenceNumber", string7);
                    hashMap.put("property", string8);
                    hashMap.put("status", string9);
                    hashMap.put("address", string10);
                    hashMap.put("description", string6);
                    hashMap.put("payeePayer", string11);
                } while (f.moveToNext());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        roVar.m4201b();
        return hashMap;
    }

    public static void m2772a(ro roVar, String str, String str2, ArrayList<Map<String, String>> arrayList) {
        try {
            if (!roVar.m4206d()) {
                roVar.m4193a();
            }
            Cursor f = roVar.m4208f(str, str2);
            if (f != null && f.moveToFirst()) {
                int columnIndex = f.getColumnIndex("_id");
                int columnIndex2 = f.getColumnIndex("account");
                int columnIndex3 = f.getColumnIndex("amount");
                int columnIndex4 = f.getColumnIndex("category");
                int columnIndex5 = f.getColumnIndex("subcategory");
                int columnIndex6 = f.getColumnIndex("payment_method");
                int columnIndex7 = f.getColumnIndex("description");
                int columnIndex8 = f.getColumnIndex("reference_number");
                int columnIndex9 = f.getColumnIndex("property");
                int columnIndex10 = f.getColumnIndex("status");
                int columnIndex11 = f.getColumnIndex("address");
                int columnIndex12 = f.getColumnIndex("payee_payer");
                int columnIndex13 = f.getColumnIndex("modified");
                do {
                    String str3 = "" + f.getLong(columnIndex);
                    String string = f.getString(columnIndex2);
                    String string2 = f.getString(columnIndex3);
                    String string3 = f.getString(columnIndex4);
                    String string4 = f.getString(columnIndex5);
                    String string5 = f.getString(columnIndex6);
                    String string6 = f.getString(columnIndex7);
                    String string7 = f.getString(columnIndex8);
                    String string8 = f.getString(columnIndex9);
                    String string9 = f.getString(columnIndex10);
                    String string10 = f.getString(columnIndex11);
                    String string11 = f.getString(columnIndex12);
                    String str4 = "" + f.getLong(columnIndex13);
                    HashMap hashMap = new HashMap();
                    hashMap.put("rowId", str3);
                    hashMap.put("modifiedDate", str4);
                    hashMap.put("account", string);
                    hashMap.put("amount", string2);
                    hashMap.put("categoryDisplay", string3 + ":" + string4);
                    hashMap.put("paymentMethod", string5);
                    hashMap.put("referenceNumber", string7);
                    hashMap.put("property", string8);
                    hashMap.put("status", string9);
                    hashMap.put("address", string10);
                    hashMap.put("description", string6);
                    hashMap.put("payeePayer", string11);
                    if ("Income".equals(string3)) {
                        hashMap.put("incomeAmount", string2);
                    } else {
                        hashMap.put("expenseAmount", string2);
                    }
                    arrayList.add(hashMap);
                } while (f.moveToNext());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        roVar.m4201b();
    }

    private void m2773a(boolean z) {
        String trim = this.f2868f.getText().toString().trim();
        if ("".equals(aib.m3865b(trim))) {
            aib.m3849a(this.f2863a, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099708), getResources().getString(2131099983), null, null, null).show();
        } else if (trim == null || trim.indexOf("'") == -1) {
            String obj = this.f2867e.getText().toString();
            if (!(obj == null || "".equals(obj))) {
                try {
                    Double d = new Double(obj);
                } catch (Exception e) {
                    aib.m3849a(this.f2863a, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099718), getResources().getString(2131099983), null, null, null).show();
                    return;
                }
            }
            if (!this.f2874l.m4206d()) {
                this.f2874l.m4193a();
            }
            this.f2876n = m2770a(this.f2874l, "description='" + trim + "'");
            if (this.f2876n == null || this.f2876n.size() <= 0 || trim.equals(this.f2877o)) {
                boolean a;
                if (!this.f2874l.m4206d()) {
                    this.f2874l.m4193a();
                }
                try {
                    String obj2 = this.f2867e.getText().toString();
                    if (obj2 != null) {
                        obj2 = obj2.replaceAll(",", "");
                    }
                    String[] split = this.f2865c.getText().toString().split(":");
                    String str = split[0];
                    String str2 = "";
                    if (split.length > 1) {
                        str2 = split[1];
                    }
                    String charSequence = this.f2866d.getText().toString();
                    String obj3 = this.f2869g.getText().toString();
                    String charSequence2 = this.f2870h.getText().toString();
                    String charSequence3 = this.f2871i.getText().toString();
                    String str3 = "NO";
                    if (this.f2864b.isChecked()) {
                        str3 = "YES";
                    }
                    ContentValues a2 = this.f2874l.m4189a(charSequence2, this.f2873k, obj2, str, str2, charSequence, trim, obj3, charSequence3, this.f2872j.getText().toString(), str3, Long.valueOf(System.currentTimeMillis()).longValue());
                    a = z ? this.f2874l.m4185a("expense_payee_payer", a2) != -1 : this.f2874l.m4196a("expense_payee_payer", new Long(this.f2878p).longValue(), a2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    a = false;
                }
                this.f2874l.m4201b();
                if (a) {
                    Toast.makeText(this.f2863a, 2131100066, 1).show();
                    abd.m3805a(this.f2863a, a);
                    Intent intent = new Intent();
                    Bundle bundle = new Bundle();
                    bundle.putString("account", this.f2873k);
                    intent.putExtras(bundle);
                    setResult(-1, intent);
                    finish();
                    return;
                }
                aib.m3849a(this.f2863a, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099715), getResources().getString(2131099983), null, null, null).show();
                return;
            }
            aib.m3849a(this.f2863a, null, getResources().getString(2131099702), 17301543, getResources().getString(2131100048), getResources().getString(2131099983), null, null, null).show();
        } else {
            aib.m3849a(this.f2863a, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099703), getResources().getString(2131099983), null, null, null).show();
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence string;
        super.onActivityResult(i, i2, intent);
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = "";
        String str = "";
        String str2 = "";
        String str3 = "";
        String str4 = "";
        String str5 = "";
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                charSequence5 = extras.getString("category");
                charSequence6 = extras.getString("paymentMethod");
                str = extras.getString("amount");
                str2 = extras.getString("ref");
                str3 = extras.getString("description");
                str4 = extras.getString("status");
                charSequence = str;
                charSequence2 = str2;
                charSequence3 = str3;
                charSequence4 = str4;
                string = extras.getString("payee");
                switch (i) {
                    case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                        if (-1 == i2) {
                            this.f2865c.setText(charSequence5);
                        }
                    case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                        if (-1 == i2) {
                            this.f2870h.setText(string);
                            if (this.f2864b.isChecked()) {
                                this.f2868f.setText(string);
                            }
                        }
                    case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                        if (-1 == i2) {
                            if (charSequence != null && charSequence.trim().startsWith("-")) {
                                charSequence = charSequence.replace("-", "");
                            }
                            this.f2867e.setText(charSequence);
                            if (charSequence2 != null) {
                                this.f2869g.setText(charSequence2);
                            }
                            if (charSequence3 != null) {
                                this.f2868f.setText(charSequence3);
                            }
                        }
                    case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                        if (-1 == i2) {
                            this.f2866d.setText(charSequence6);
                        }
                    case adv.TitlePageIndicator_footerLineHeight /*6*/:
                        if (-1 == i2) {
                            this.f2871i.setText(charSequence4);
                        }
                    default:
                }
            }
        }
        String str6 = str5;
        Object obj = str;
        Object obj2 = str2;
        Object obj3 = str3;
        Object obj4 = str4;
        Object obj5 = str6;
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if (-1 == i2) {
                    this.f2865c.setText(charSequence5);
                }
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                if (-1 == i2) {
                    this.f2870h.setText(string);
                    if (this.f2864b.isChecked()) {
                        this.f2868f.setText(string);
                    }
                }
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                if (-1 == i2) {
                    charSequence = charSequence.replace("-", "");
                    this.f2867e.setText(charSequence);
                    if (charSequence2 != null) {
                        this.f2869g.setText(charSequence2);
                    }
                    if (charSequence3 != null) {
                        this.f2868f.setText(charSequence3);
                    }
                }
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                if (-1 == i2) {
                    this.f2866d.setText(charSequence6);
                }
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                if (-1 == i2) {
                    this.f2871i.setText(charSequence4);
                }
            default:
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(2131099726);
        getWindow().setSoftInputMode(3);
        this.f2874l = new ro(this);
        this.f2877o = getIntent().getStringExtra("description");
        getIntent().getStringExtra("account");
        setContentView(2130903083);
        String stringExtra = getIntent().getStringExtra("categoryDisplay");
        if (this.f2877o == null || "".equals(this.f2877o)) {
            this.f2875m = true;
        } else {
            this.f2876n = m2770a(this.f2874l, "description='" + this.f2877o + "'");
            if (this.f2876n == null || this.f2876n.size() == 0) {
                this.f2875m = true;
            }
        }
        this.f2864b = (CheckBox) findViewById(2131558700);
        this.f2864b.setOnClickListener(new jq(this));
        this.f2865c = (TextView) findViewById(2131558543);
        ((ImageButton) findViewById(2131558542)).setOnClickListener(new js(this, stringExtra));
        if (stringExtra != null && stringExtra.startsWith("Income")) {
            this.f2865c.setText(stringExtra);
            this.f2865c.setTextColor(co.f4429c);
        }
        this.f2870h = (TextView) findViewById(2131558522);
        TextView textView = (TextView) findViewById(2131558691);
        if (stringExtra == null || !stringExtra.startsWith("Income")) {
            textView.setText(2131100004);
        } else {
            textView.setText(2131100009);
        }
        ((ImageButton) findViewById(2131558521)).setOnClickListener(new jt(this, stringExtra));
        this.f2866d = (TextView) findViewById(2131558547);
        ((ImageButton) findViewById(2131558546)).setOnClickListener(new ju(this));
        this.f2867e = (EditText) findViewById(2131558526);
        ((ImageButton) findViewById(2131558525)).setOnClickListener(new jv(this));
        this.f2868f = (EditText) findViewById(2131558537);
        this.f2869g = (EditText) findViewById(2131558548);
        String[] split = abd.m3786a(this.f2863a, this.f2874l, "TRANSACTION_STATUS_KEY", getResources().getString(2131100103)).split(",");
        this.f2871i = (Button) findViewById(2131558549);
        if (split != null && split.length > 0) {
            this.f2871i.setText(split[0]);
        }
        this.f2871i.setOnClickListener(new jw(this));
        this.f2872j = (EditText) findViewById(2131558702);
        Button button = (Button) findViewById(2131558560);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new jx(this));
        button = (Button) findViewById(2131558559);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new jy(this));
        button = (Button) findViewById(2131558558);
        aib.m3858a((Context) this, button, 2130837530);
        button.setOnClickListener(new jz(this));
        Button button2 = (Button) findViewById(2131558493);
        aib.m3858a((Context) this, button2, -1);
        button2.setOnClickListener(new jr(this));
        if (!this.f2875m) {
            if ("YES".equalsIgnoreCase((String) this.f2876n.get("property"))) {
                this.f2864b.setChecked(true);
                this.f2868f.setEnabled(false);
            } else {
                this.f2864b.setChecked(false);
                this.f2868f.setEnabled(true);
            }
            this.f2865c.setText((CharSequence) this.f2876n.get("categoryDisplay"));
            this.f2867e.setText((CharSequence) this.f2876n.get("amount"));
            this.f2869g.setText((CharSequence) this.f2876n.get("referenceNumber"));
            this.f2868f.setText((CharSequence) this.f2876n.get("description"));
            this.f2871i.setText((CharSequence) this.f2876n.get("status"));
            this.f2866d.setText((CharSequence) this.f2876n.get("paymentMethod"));
            this.f2869g.setText((CharSequence) this.f2876n.get("referenceNumber"));
            this.f2872j.setText((CharSequence) this.f2876n.get("address"));
            this.f2870h.setText((CharSequence) this.f2876n.get("payeePayer"));
            this.f2878p = (String) this.f2876n.get("rowId");
            button.setVisibility(0);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 0, 0, 2131100065).setIcon(2130837591).setShowAsAction(2);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                m2773a(this.f2875m);
                return true;
            case 16908332:
                onBackPressed();
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
