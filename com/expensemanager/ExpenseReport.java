package com.expensemanager;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.C0607c;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p007b.C0282e;
import p007b.C0286o;
import p007b.C0287p;
import p007b.p008a.ab;
import p007b.p010e.C0151j;
import p007b.p010e.C0241q;
import p007b.p010e.C0242r;
import p007b.p010e.C0265b;
import p007b.p010e.C0269e;
import p007b.p010e.C0271f;
import p007b.p010e.C0273g;
import p007b.p010e.C0277l;
import p007b.p010e.C0278m;
import p007b.p011c.C0183d;
import p007b.p011c.C0224o;

public class ExpenseReport extends Activity {
    int f3440a;
    int f3441b;
    String f3442c;
    private Context f3443d;
    private TextView f3444e;
    private EditText f3445f;
    private EditText f3446g;
    private EditText f3447h;
    private EditText f3448i;
    private EditText f3449j;
    private EditText f3450k;
    private EditText f3451l;
    private EditText f3452m;
    private int f3453n;
    private int f3454o;
    private int f3455p;
    private String f3456q;
    private C0277l f3457r;
    private C0277l f3458s;
    private OnDateSetListener f3459t;

    public ExpenseReport() {
        this.f3443d = this;
        this.f3456q = "Personal Expense";
        this.f3440a = 0;
        this.f3441b = 0;
        this.f3459t = new aav(this);
    }

    private String m3417a(Context context, String str, ArrayList<String> arrayList, String str2) {
        StringBuffer append = new StringBuffer().append("<head><title>Expense Report</title></head>").append("From: <b>" + (this.f3445f.getText().toString() + ",&nbsp;" + this.f3446g.getText().toString()) + "</b><br>");
        if (!"".equals(this.f3449j.getText().toString())) {
            append = append.append("Description: <b>" + this.f3449j.getText().toString() + "</b><br>");
        }
        if (!"".equals(this.f3450k.getText().toString())) {
            append = append.append("Charge Code: <b>" + this.f3450k.getText().toString() + "</b><br>");
        }
        if (!"".equals(this.f3451l.getText().toString())) {
            append = append.append("Contract Name: <b>" + this.f3451l.getText().toString() + "</b><br>");
        }
        if (!"".equals(this.f3452m.getText().toString())) {
            append = append.append("Additional Comments: <b>" + this.f3452m.getText().toString() + "</b><br>");
        }
        return append.append(ExpenseCustomActivities.m3060a(context, str, str2, arrayList)).toString();
    }

    private void m3418a() {
        this.f3444e.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f3453n + "-" + (this.f3454o + 1) + "-" + this.f3455p));
    }

    private void m3419a(C0241q c0241q) {
        int i;
        this.f3458s = new C0277l(new C0278m(C0278m.f1980c, 10));
        this.f3458s.m1841c(true);
        this.f3457r = new C0277l(new C0278m(C0278m.f1980c, 10, C0278m.f1984g, false, C0224o.f1485a));
        this.f3457r.m1841c(true);
        for (i = 0; i < 12; i++) {
            C0282e a = c0241q.m1730a(i);
            a.m1849b(true);
            c0241q.m1734a(i, a);
        }
        m3421a(c0241q, 0, 0, "From");
        m3426b(c0241q, 1, 0, this.f3445f.getText().toString());
        m3426b(c0241q, 2, 0, this.f3446g.getText().toString());
        i = 1;
        if (!"".equals(this.f3449j.getText().toString())) {
            m3421a(c0241q, 0, 1, "Description");
            m3426b(c0241q, 1, 1, this.f3449j.getText().toString());
            i = 2;
        }
        if (!"".equals(this.f3450k.getText().toString())) {
            m3421a(c0241q, 0, i, "Charge Code");
            m3426b(c0241q, 1, i, this.f3450k.getText().toString());
            i++;
        }
        if (!"".equals(this.f3451l.getText().toString())) {
            m3421a(c0241q, 0, i, "Contract Name");
            m3426b(c0241q, 1, i, this.f3451l.getText().toString());
            i++;
        }
        if (!"".equals(this.f3452m.getText().toString())) {
            m3421a(c0241q, 0, i, "Additional Comments");
            m3426b(c0241q, 1, i, this.f3452m.getText().toString());
            i++;
        }
        ro roVar = new ro(this.f3443d);
        List arrayList = new ArrayList();
        ExpenseAccountActivities.m2602a(roVar, this.f3442c, arrayList, false, "expensed DESC");
        m3421a(c0241q, 0, i, getResources().getString(2131099678));
        m3421a(c0241q, 1, i, getResources().getString(2131099794));
        m3421a(c0241q, 2, i, getResources().getString(2131099723));
        m3421a(c0241q, 3, i, getResources().getString(2131100115));
        m3421a(c0241q, 4, i, getResources().getString(2131100007));
        m3421a(c0241q, 5, i, getResources().getString(2131100011));
        m3421a(c0241q, 6, i, getResources().getString(2131099755));
        m3421a(c0241q, 7, i, getResources().getString(2131100106));
        m3421a(c0241q, 8, i, getResources().getString(2131100039));
        m3421a(c0241q, 9, i, getResources().getString(2131100101));
        m3421a(c0241q, 10, i, getResources().getString(2131100110));
        m3421a(c0241q, 11, i, getResources().getString(2131099813));
        m3421a(c0241q, 12, i, getResources().getString(2131100037));
        int i2 = i + 1;
        ab c0265b = new C0265b(ExpenseManager.f3244t);
        if (getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getBoolean("transaction_time", false)) {
            c0265b = new C0265b(ExpenseManager.f3244t + " HH:mm:ss");
        }
        C0277l c0277l = new C0277l(c0265b);
        int size = arrayList.size() - 1;
        double d = 0.0d;
        double d2 = 0.0d;
        int i3 = i2;
        while (size >= 0) {
            String str;
            String str2;
            double a2;
            Map map = (Map) arrayList.get(size);
            String str3 = (String) map.get("amount");
            r18 = !((String) map.get("category")).toUpperCase().startsWith("INCOME") ? !str3.startsWith("-") ? "-" + str3 : str3.replace("-", "") : str3;
            str3 = (String) map.get("category");
            String str4 = "";
            if (str3 != null) {
                String[] split = str3.split(":");
                if (split.length > 0) {
                    str3 = split[0];
                }
                if (split.length > 1) {
                    str = split[1];
                    str2 = str3;
                    m3426b(c0241q, 0, i3, (String) map.get("account"));
                    m3422a(c0241q, 1, i3, (String) map.get("dateLong"), c0277l);
                    m3420a(c0241q, 2, i3, aib.m3877i(r18), false);
                    if (map.get("tax") != null) {
                        if (!"".equals((String) map.get("tax"))) {
                            m3420a(c0241q, 3, i3, aib.m3877i((String) map.get("tax")), false);
                        }
                    }
                    m3426b(c0241q, 4, i3, (String) map.get("property"));
                    m3426b(c0241q, 5, i3, (String) map.get("paymentMethod"));
                    m3426b(c0241q, 6, i3, str2);
                    m3426b(c0241q, 7, i3, str);
                    m3426b(c0241q, 8, i3, (String) map.get("referenceNumber"));
                    m3426b(c0241q, 9, i3, (String) map.get("status"));
                    m3426b(c0241q, 10, i3, (String) map.get("tag"));
                    m3426b(c0241q, 11, i3, (String) map.get("description"));
                    m3426b(c0241q, 12, i3, (String) map.get("property2"));
                    i2 = i3 + 1;
                    a2 = aba.m3742a(d2, r18);
                    size--;
                    d = aba.m3742a(d, (String) map.get("tax"));
                    d2 = a2;
                    i3 = i2;
                }
            }
            str = str4;
            str2 = str3;
            m3426b(c0241q, 0, i3, (String) map.get("account"));
            m3422a(c0241q, 1, i3, (String) map.get("dateLong"), c0277l);
            m3420a(c0241q, 2, i3, aib.m3877i(r18), false);
            if (map.get("tax") != null) {
                if (!"".equals((String) map.get("tax"))) {
                    m3420a(c0241q, 3, i3, aib.m3877i((String) map.get("tax")), false);
                }
            }
            m3426b(c0241q, 4, i3, (String) map.get("property"));
            m3426b(c0241q, 5, i3, (String) map.get("paymentMethod"));
            m3426b(c0241q, 6, i3, str2);
            m3426b(c0241q, 7, i3, str);
            m3426b(c0241q, 8, i3, (String) map.get("referenceNumber"));
            m3426b(c0241q, 9, i3, (String) map.get("status"));
            m3426b(c0241q, 10, i3, (String) map.get("tag"));
            m3426b(c0241q, 11, i3, (String) map.get("description"));
            m3426b(c0241q, 12, i3, (String) map.get("property2"));
            i2 = i3 + 1;
            a2 = aba.m3742a(d2, r18);
            size--;
            d = aba.m3742a(d, (String) map.get("tax"));
            d2 = a2;
            i3 = i2;
        }
        m3421a(c0241q, 1, i3, "Total");
        m3420a(c0241q, 2, i3, aib.m3877i(aib.m3850a(d2)), true);
        m3420a(c0241q, 3, i3, aib.m3877i(aib.m3850a(d)), true);
    }

    private void m3420a(C0241q c0241q, int i, int i2, double d, boolean z) {
        C0151j c0273g = new C0273g(i, i2, d);
        if (z) {
            c0273g = new C0273g(i, i2, d, this.f3457r);
        }
        c0241q.m1735a(c0273g);
    }

    private void m3421a(C0241q c0241q, int i, int i2, String str) {
        c0241q.m1735a(new C0271f(i, i2, str, this.f3457r));
    }

    private void m3422a(C0241q c0241q, int i, int i2, String str, C0277l c0277l) {
        try {
            Calendar instance = Calendar.getInstance();
            TimeZone timeZone = TimeZone.getDefault();
            instance.setTimeInMillis((Long.parseLong(str) + ((long) timeZone.getRawOffset())) + ((long) timeZone.getDSTSavings()));
            C0151j c0269e = new C0269e(i, i2, instance.getTime());
            c0269e.m1605a((C0183d) c0277l);
            c0241q.m1735a(c0269e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void m3426b(C0241q c0241q, int i, int i2, String str) {
        c0241q.m1735a(new C0271f(i, i2, str, this.f3458s));
    }

    private void m3427b(String str) {
        String obj = this.f3449j.getText().toString();
        if (obj == null || obj.indexOf("'") == -1) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("From: " + this.f3445f.getText().toString() + " " + this.f3446g.getText().toString() + "\n");
            stringBuffer.append("Date: " + this.f3444e.getText().toString() + "\n");
            if (!"".equals(this.f3449j.getText().toString())) {
                stringBuffer.append("Description: " + this.f3449j.getText().toString() + "\n");
            }
            if (!"".equals(this.f3450k.getText().toString())) {
                stringBuffer.append("Charge Code: " + this.f3450k.getText().toString() + "\n");
            }
            if (!"".equals(this.f3451l.getText().toString())) {
                stringBuffer.append("Contract Name: " + this.f3451l.getText().toString() + "\n");
            }
            if (!"".equals(this.f3452m.getText().toString())) {
                stringBuffer.append("Additional Comment: " + this.f3452m.getText().toString() + "\n");
            }
            ArrayList arrayList = new ArrayList();
            obj = this.f3449j.getText().toString();
            if (obj == null || obj.equals("")) {
                obj = getResources().getString(2131099725);
            }
            String h = aib.m3876h("yyyy-MM-dd-HHmmss");
            String str2 = obj + "-" + h + ".html";
            if (ExpenseExport.m3164a(co.f4430d, str2, m3417a(this.f3443d, this.f3442c, arrayList, this.f3456q))) {
                boolean a = ExpenseCustomActivities.m3065a(arrayList, "receipts.zip");
                Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
                intent.putExtra("android.intent.extra.SUBJECT", getResources().getString(2131099887) + ":" + obj);
                intent.putExtra("android.intent.extra.TEXT", stringBuffer.toString());
                ArrayList arrayList2 = new ArrayList();
                if ("HTML".equalsIgnoreCase(str)) {
                    arrayList2.add(Uri.fromFile(new File(co.f4430d + "/" + str2)));
                }
                if (a) {
                    arrayList2.add(Uri.fromFile(new File(co.f4430d + "/" + "receipts.zip")));
                }
                if ("Excel".equalsIgnoreCase(str)) {
                    try {
                        obj = obj + "-" + h + ".xls";
                        m3437a(obj);
                        arrayList2.add(Uri.fromFile(new File(co.f4430d + "/" + obj)));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList2);
                this.f3443d.startActivity(Intent.createChooser(intent, "Send mail..."));
            }
            Editor edit = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).edit();
            edit.putString("fromEmail", this.f3446g.getText().toString());
            edit.putString("fromName", this.f3445f.getText().toString());
            edit.commit();
            return;
        }
        aib.m3849a(this.f3443d, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099703), getResources().getString(2131099983), null, null, null).show();
    }

    public void m3437a(String str) {
        File file = new File(co.f4430d + "/" + str);
        C0287p c0287p = new C0287p();
        c0287p.m1905a(new Locale("en", "EN"));
        C0242r a = C0286o.m1902a(file, c0287p);
        a.m1763a("Expense Report", 0);
        m3419a(a.m1765c(0));
        a.m1766c();
        a.m1764b();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        CharSequence charSequence = "";
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.f3456q = extras.getString("account");
                charSequence = extras.getString("amount");
            }
        }
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                if (-1 == i2) {
                    if (charSequence != null && charSequence.trim().startsWith("-")) {
                        charSequence = charSequence.replace("-", "");
                    }
                    this.f3448i.setText(charSequence);
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if (i2 == -1 && intent != null) {
                    try {
                        Cursor query = getContentResolver().query(intent.getData(), null, null, null, null);
                        if (query != null && query.moveToFirst()) {
                            Cursor query2 = getContentResolver().query(Email.CONTENT_URI, null, "contact_id = " + query.getString(query.getColumnIndex("_id")), null, null);
                            while (query2.moveToNext()) {
                                CharSequence string = query2.getString(query2.getColumnIndex("data1"));
                                this.f3447h.setText(string);
                                if (string != null && !"".equals(string)) {
                                    query2.close();
                                }
                            }
                            query2.close();
                        }
                        query.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            default:
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle("Expense Reporting");
        getWindow().setSoftInputMode(3);
        this.f3456q = getIntent().getStringExtra("account");
        if (this.f3456q == null || "".equals(this.f3456q)) {
            this.f3456q = "Personal Expense";
        }
        setContentView(2130903117);
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        this.f3445f = (EditText) findViewById(2131558882);
        this.f3446g = (EditText) findViewById(2131558884);
        this.f3445f.setText(sharedPreferences.getString("fromName", null));
        this.f3446g.setText(sharedPreferences.getString("fromEmail", null));
        Account[] accounts = AccountManager.get(this).getAccounts();
        if (accounts != null && accounts.length > 0) {
            this.f3446g.setText(accounts[0].name);
        }
        ((ImageButton) findViewById(2131558886)).setOnClickListener(new aap(this));
        this.f3447h = (EditText) findViewById(2131558887);
        this.f3447h.setText(sharedPreferences.getString("toEmail", null));
        ((RelativeLayout) findViewById(2131558650)).setOnClickListener(new aaq(this));
        this.f3444e = (TextView) findViewById(2131558652);
        Calendar instance = Calendar.getInstance();
        this.f3453n = instance.get(1);
        this.f3454o = instance.get(2);
        this.f3455p = instance.get(5);
        m3418a();
        this.f3448i = (EditText) findViewById(2131558503);
        ((ImageButton) findViewById(2131558525)).setOnClickListener(new aar(this));
        this.f3449j = (EditText) findViewById(2131558667);
        this.f3450k = (EditText) findViewById(2131558888);
        this.f3451l = (EditText) findViewById(2131558889);
        this.f3452m = (EditText) findViewById(2131558890);
        this.f3442c = getIntent().getStringExtra("whereClause");
        Button button = (Button) findViewById(2131558893);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new aas(this));
        button = (Button) findViewById(2131558891);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new aat(this));
        button = (Button) findViewById(2131558892);
        aib.m3858a((Context) this, button, -1);
        if (VERSION.SDK_INT < 19) {
            button.setVisibility(8);
        }
        button.setOnClickListener(new aau(this));
    }

    protected Dialog onCreateDialog(int i) {
        this.f3440a = i;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                return new DatePickerDialog(this, this.f3459t, this.f3453n, this.f3454o, this.f3455p);
            default:
                return null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                ((DatePickerDialog) dialog).updateDate(this.f3453n, this.f3454o, this.f3455p);
            default:
        }
    }
}
