package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ExpenseAccountTransfer extends Activity {
    int f2815a;
    int f2816b;
    String f2817c;
    boolean f2818d;
    private Context f2819e;
    private TextView f2820f;
    private TextView f2821g;
    private TextView f2822h;
    private TextView f2823i;
    private EditText f2824j;
    private EditText f2825k;
    private EditText f2826l;
    private Spinner f2827m;
    private EditText f2828n;
    private EditText f2829o;
    private String f2830p;
    private Button f2831q;
    private int f2832r;
    private int f2833s;
    private int f2834t;
    private String f2835u;
    private ro f2836v;
    private OnDateSetListener f2837w;

    public ExpenseAccountTransfer() {
        this.f2819e = this;
        this.f2835u = "Personal Expense";
        this.f2815a = 0;
        this.f2816b = 0;
        this.f2818d = false;
        this.f2837w = new in(this);
    }

    private String m2712a(String str) {
        String str2 = "";
        String a;
        try {
            a = aib.m3856a(str, "CURRENCY", false);
            if (a == null) {
                return str2;
            }
            HashMap g = aib.m3875g(a);
            if (g != null) {
                str2 = aib.m3865b((String) g.get(str));
            }
            return str2.replaceAll(",", "");
        } catch (Exception e) {
            Exception exception = e;
            a = str2;
            exception.printStackTrace();
            return a;
        }
    }

    private void m2713a() {
        this.f2820f.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f2832r + "-" + (this.f2833s + 1) + "-" + this.f2834t));
        if ("Edit".equalsIgnoreCase(getIntent().getStringExtra("fromWhere")) && this.f2825k != null) {
            String obj = this.f2825k.getText().toString();
            long a = aba.m3744a(obj, ExpenseManager.f3244t + " " + "HH:mm:ss", Locale.US);
            if (a == 0) {
                String[] split = obj.split(" ");
                if (split.length > 1) {
                    a = aba.m3744a(split[1], "HH:mm:ss", Locale.US);
                }
            }
            CharSequence f = aib.m3874f(ExpenseManager.f3244t + " " + "HH:mm:ss");
            if (a > 0) {
                this.f2825k.setText(f);
            }
        }
    }

    private void m2714a(int i, String str, String str2, String str3) {
        OnClickListener iqVar = new iq(this, i, str);
        OnClickListener irVar = new ir(this, i, str2, str3, str);
        Builder builder = new Builder(this.f2819e);
        builder.setTitle(getResources().getString(2131099805)).setMessage(getResources().getString(2131099810)).setCancelable(false).setPositiveButton(getResources().getString(2131099802), irVar).setNeutralButton(getResources().getString(2131100105), iqVar).setNegativeButton(getResources().getString(2131099754), null);
        builder.show();
    }

    private void m2717a(String str, String str2) {
        boolean z = true;
        long j = 0;
        ro roVar = new ro(this.f2819e);
        roVar.m4193a();
        try {
            this.f2835u = this.f2821g.getText().toString();
            String charSequence = this.f2822h.getText().toString();
            String obj = this.f2824j.getText().toString();
            if (obj != null) {
                obj = obj.replaceAll(",", "");
            }
            String[] split = "Account Transfer".split(":");
            String str3 = split[0];
            String str4 = "";
            if (split.length > 1) {
                str4 = split[1];
            }
            String charSequence2 = this.f2823i.getText().toString();
            String obj2 = this.f2825k.getText().toString();
            String obj3 = this.f2826l.getText().toString();
            String str5 = (String) this.f2827m.getSelectedItem();
            String str6 = "";
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            j = aba.m3744a(this.f2820f.getText().toString(), ExpenseManager.f3244t, Locale.US);
            String str7 = "";
            String str8 = "";
            String str9 = "";
            String str10 = "";
            String str11 = "";
            if (!(str == null || "".equals(str))) {
                if (charSequence2 == null || "".equals(charSequence2)) {
                    charSequence2 = "|" + this.f2830p + "=" + this.f2828n.getText().toString();
                } else {
                    if (charSequence2.indexOf("|") != -1) {
                        charSequence2 = charSequence2.substring(0, charSequence2.indexOf("|"));
                    }
                    charSequence2 = charSequence2 + "|" + this.f2830p + "=" + this.f2828n.getText().toString();
                }
            }
            if ("".equals(aib.m3865b(obj2))) {
                obj2 = aib.m3874f(ExpenseManager.f3244t + " " + "HH:mm:ss");
            }
            ContentValues a = roVar.m4188a(this.f2835u, obj2, obj, "1", str3, str4, charSequence2, "0d", "0,0", "1", 0, j, valueOf.longValue(), charSequence, str5, "YES", obj3);
            if (!"Edit".equalsIgnoreCase(str2) || this.f2818d) {
                this.f2816b = (int) roVar.m4185a("expense_repeating", a);
                if (this.f2816b == -1) {
                    z = false;
                }
            } else {
                z = roVar.m4196a("expense_repeating", (long) this.f2816b, a);
                roVar.m4194a("DELETE from expense_report where " + ("description='Transfer:" + this.f2817c + "'"));
            }
            String str12 = !obj2.trim().startsWith("Transfer:") ? "Transfer:" + obj2 : obj2;
            long a2 = roVar.m4185a("expense_report", roVar.m4190a(this.f2835u, obj, str3, str4, charSequence2, str12, obj3, charSequence, str5, str6, str7, str8, str9, str10, str11, j, valueOf.longValue()));
            if (a2 != -1) {
                String str13 = (str == null || "".equals(str)) ? obj : str;
                a2 = roVar.m4185a("expense_report", roVar.m4190a(charSequence, str13, "Income", "Account Transfer", charSequence2, str12, obj3, this.f2835u, str5, str6, str7, str8, str9, str10, str11, j, valueOf.longValue()));
            }
            if (a2 == -1) {
                z = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        roVar.m4201b();
        if (z) {
            String charSequence3 = this.f2823i.getText().toString();
            if (!(charSequence3 == null || "".equals(charSequence3.trim()))) {
                if (charSequence3.indexOf("|") != -1) {
                    charSequence3 = charSequence3.substring(0, charSequence3.indexOf("|"));
                }
                abd.m3811a(this.f2819e, roVar, "expense_preference", "TRANSFER_PAYMENT_METHOD_KEY", charSequence3);
            }
            abd.m3805a(this.f2819e, z);
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putLong("date", j);
            bundle.putString("account", this.f2835u);
            bundle.putString("toAccount", getIntent().getStringExtra("toAccount"));
            intent.putExtras(bundle);
            setResult(-1, intent);
            finish();
            return;
        }
        aib.m3849a(this.f2819e, null, this.f2819e.getResources().getString(2131099702), 17301543, this.f2819e.getResources().getString(2131099717), this.f2819e.getResources().getString(2131099983), null, null, null).show();
    }

    private LinearLayout m2719b() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(15, 5, 15, 5);
        View textView = new TextView(this);
        StringBuffer stringBuffer = new StringBuffer(this.f2830p);
        if (stringBuffer.length() == 6) {
            stringBuffer.insert(3, '/');
        }
        textView.setText(getResources().getString(2131099787) + ": " + stringBuffer.toString());
        if (VERSION.SDK_INT < 14) {
            textView.setTextColor(-1);
        }
        textView.setTextSize(16.0f);
        this.f2828n = new EditText(this);
        this.f2828n.setInputType(8195);
        this.f2829o = new EditText(this);
        this.f2829o.setHint(2131099723);
        this.f2829o.setInputType(8195);
        TextWatcher ioVar = new io(this);
        TextWatcher ipVar = new ip(this);
        this.f2828n.addTextChangedListener(ioVar);
        this.f2829o.addTextChangedListener(ipVar);
        new jb(this).execute(new Context[]{this});
        View textView2 = new TextView(this);
        textView2.setText(2131100150);
        linearLayout.addView(textView, new LayoutParams(-1, -2));
        linearLayout.addView(this.f2828n, new LayoutParams(-1, -2));
        linearLayout.addView(this.f2829o, new LayoutParams(-1, -2));
        linearLayout.addView(textView2, new LayoutParams(-1, -2));
        return linearLayout;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        CharSequence charSequence = "";
        CharSequence charSequence2 = "";
        CharSequence charSequence3 = "";
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                charSequence = extras.getString("account");
                charSequence2 = extras.getString("paymentMethod");
                charSequence3 = extras.getString("amount");
            }
        }
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                if (-1 == i2 && charSequence != null && !"".equals(charSequence)) {
                    this.f2821g.setText(charSequence);
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if (-1 == i2 && charSequence != null && !"".equals(charSequence)) {
                    this.f2822h.setText(charSequence);
                }
            case C0607c.LoadingImageView_circleCrop /*2*/:
                if (-1 == i2) {
                    this.f2823i.setText(charSequence2);
                }
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                if (-1 == i2) {
                    if (charSequence3 != null && charSequence3.trim().startsWith("-")) {
                        charSequence3 = charSequence3.replace("-", "");
                    }
                    this.f2824j.setText(charSequence3);
                }
            default:
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(2131099687);
        getWindow().setSoftInputMode(3);
        this.f2836v = new ro(this);
        String stringExtra = getIntent().getStringExtra("rowId");
        if (stringExtra != null) {
            this.f2816b = new Integer(stringExtra).intValue();
        }
        String stringExtra2 = getIntent().getStringExtra("fromWhere");
        this.f2835u = getIntent().getStringExtra("account");
        if (this.f2835u == null || "".equals(this.f2835u)) {
            this.f2835u = "Personal Expense";
        }
        setContentView(2130903075);
        this.f2821g = (TextView) findViewById(2131558661);
        this.f2821g.setText(this.f2835u);
        ((ImageButton) findViewById(2131558660)).setOnClickListener(new im(this));
        this.f2822h = (TextView) findViewById(2131558664);
        if (getIntent().getStringExtra("toAccount") != null) {
            this.f2821g.setText(null);
            this.f2822h.setText(getIntent().getStringExtra("toAccount"));
        }
        ((ImageButton) findViewById(2131558663)).setOnClickListener(new is(this));
        ((ImageButton) findViewById(2131558658)).setOnClickListener(new it(this));
        this.f2820f = (TextView) findViewById(2131558652);
        Calendar instance = Calendar.getInstance();
        this.f2832r = instance.get(1);
        this.f2833s = instance.get(2);
        this.f2834t = instance.get(5);
        m2713a();
        this.f2824j = (EditText) findViewById(2131558503);
        this.f2824j.setText(getIntent().getStringExtra("amount"));
        ((ImageButton) findViewById(2131558525)).setOnClickListener(new iu(this));
        this.f2825k = (EditText) findViewById(2131558667);
        this.f2825k.setHint(aib.m3874f(ExpenseManager.f3244t + " " + "HH:mm:ss"));
        this.f2826l = (EditText) findViewById(2131558548);
        stringExtra = getResources().getString(2131100012);
        String a = abd.m3786a(this.f2819e, this.f2836v, "PAYMENT_METHOD_KEY", stringExtra);
        if (!a.equals("")) {
            stringExtra = a;
        }
        CharSequence a2 = abd.m3786a(this.f2819e, this.f2836v, "TRANSFER_PAYMENT_METHOD_KEY", stringExtra.split(",")[0]);
        this.f2823i = (TextView) findViewById(2131558547);
        this.f2823i.setText(a2);
        String[] split = abd.m3786a(this.f2819e, this.f2836v, "TRANSACTION_STATUS_KEY", getResources().getString(2131100103)).split(",");
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, split);
        arrayAdapter.setDropDownViewResource(17367049);
        this.f2827m = (Spinner) findViewById(2131558665);
        this.f2827m.setAdapter(arrayAdapter);
        this.f2827m.setSelection(0);
        ((ImageButton) findViewById(2131558546)).setOnClickListener(new iv(this));
        Button button = (Button) findViewById(2131558516);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new iw(this));
        this.f2831q = (Button) findViewById(2131558449);
        aib.m3858a((Context) this, this.f2831q, -1);
        this.f2831q.setOnClickListener(new ix(this, stringExtra2));
        if ("Edit".equalsIgnoreCase(stringExtra2)) {
            Map map;
            stringExtra = "_id=" + this.f2816b + " and " + "account" + "='" + this.f2835u + "'";
            List arrayList = new ArrayList();
            aba.m3760a(this.f2819e, this.f2836v, stringExtra, arrayList);
            HashMap hashMap = new HashMap();
            if (arrayList == null || arrayList.size() <= 0) {
                Object obj = hashMap;
            } else {
                map = (Map) arrayList.get(0);
            }
            stringExtra = (String) map.get("description");
            this.f2820f.setText((CharSequence) map.get("firstExpenseDate"));
            this.f2824j.setText((CharSequence) map.get("amount"));
            this.f2825k.setText((CharSequence) map.get("description"));
            this.f2823i.setText((CharSequence) map.get("paymentMethod"));
            this.f2822h.setText((CharSequence) map.get("property"));
            this.f2826l.setText((CharSequence) map.get("property3"));
            this.f2817c = (String) map.get("description");
            this.f2827m.setSelection(new ArrayList(Arrays.asList(split)).indexOf(map.get("status")));
            Button button2 = (Button) findViewById(2131558668);
            aib.m3858a((Context) this, button2, 2130837530);
            button2.setOnClickListener(new iz(this, stringExtra));
            button2.setVisibility(0);
            button = (Button) findViewById(2131558669);
            aib.m3858a((Context) this, button, -1);
            button.setVisibility(0);
            button.setOnClickListener(new ja(this));
        }
        if ("calendar".equalsIgnoreCase(getIntent().getStringExtra("fromWhere"))) {
            this.f2820f.setText(getIntent().getStringExtra("date"));
        }
    }

    protected Dialog onCreateDialog(int i) {
        this.f2815a = i;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                return new DatePickerDialog(this, this.f2837w, this.f2832r, this.f2833s, this.f2834t);
            default:
                return null;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 1, 0, 2131100065).setIcon(2130837591).setShowAsAction(2);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f2831q.performClick();
                return true;
            case 16908332:
                onBackPressed();
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                ((DatePickerDialog) dialog).updateDate(this.f2832r, this.f2833s, this.f2834t);
            default:
        }
    }
}
