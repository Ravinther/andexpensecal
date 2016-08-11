package com.expensemanager;

import android.app.ActionBar.OnNavigationListener;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ExpenseRepeatingTransaction extends Activity {
    private String[] f3402A;
    private ro f3403B;
    private EditText f3404C;
    private String f3405D;
    private boolean f3406E;
    private OnDateSetListener f3407F;
    String f3408a;
    long f3409b;
    String f3410c;
    long f3411d;
    String f3412e;
    private Context f3413f;
    private Button f3414g;
    private Spinner f3415h;
    private EditText f3416i;
    private EditText f3417j;
    private EditText f3418k;
    private Button f3419l;
    private Button f3420m;
    private Spinner f3421n;
    private Spinner f3422o;
    private Button f3423p;
    private Button f3424q;
    private CheckBox f3425r;
    private Button f3426s;
    private EditText f3427t;
    private Button f3428u;
    private int f3429v;
    private int f3430w;
    private int f3431x;
    private String f3432y;
    private String[] f3433z;

    public ExpenseRepeatingTransaction() {
        this.f3413f = this;
        this.f3432y = "Personal Expense";
        this.f3433z = new String[]{"Never", "On due date", "1 Day before due", "2 Days before due", "3 Days before due", "4 Days before due", "5 Days before due", "6 Days before due", "7 Days before due"};
        this.f3402A = new String[]{"0:00", "1:00", "2:00", "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"};
        this.f3408a = "0";
        this.f3409b = 0;
        this.f3410c = "";
        this.f3411d = 0;
        this.f3406E = false;
        this.f3412e = "NO";
        this.f3407F = new zz(this);
    }

    private void m3383a() {
        this.f3419l.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f3429v + "-" + (this.f3430w + 1) + "-" + this.f3431x));
    }

    private void m3384a(String str) {
        if (!this.f3403B.m4206d()) {
            this.f3403B.m4193a();
        }
        boolean z = true;
        try {
            String trim = this.f3417j.getText().toString().trim();
            String trim2 = this.f3416i.getText().toString().trim();
            String charSequence = this.f3420m.getText().toString();
            String[] split = charSequence.split(":");
            String str2 = split[0];
            String str3 = "";
            if (split.length > 1) {
                str3 = split[1];
            }
            String charSequence2 = this.f3414g.getText().toString();
            String str4 = qa.f5164c[(int) this.f3415h.getSelectedItemId()];
            String obj = this.f3418k.getText().toString();
            long selectedItemId = this.f3421n.getSelectedItemId();
            String str5 = selectedItemId + "," + this.f3422o.getSelectedItemId();
            String charSequence3 = this.f3424q.getText().toString();
            if (!"YES".equalsIgnoreCase(getIntent().getStringExtra("reminder"))) {
                if (this.f3425r.isChecked()) {
                    this.f3412e = "YES";
                } else {
                    this.f3412e = "NO";
                }
            }
            String charSequence4 = this.f3419l.getText().toString();
            if ("Account Transfer".equalsIgnoreCase(charSequence)) {
                this.f3432y = this.f3426s.getText().toString();
            }
            long a = aba.m3744a(charSequence4, ExpenseManager.f3244t, Locale.US);
            long time = new Date().getTime();
            this.f3410c = this.f3423p.getText().toString();
            if (!"Edit".equalsIgnoreCase(str) && "YES".equalsIgnoreCase(getIntent().getStringExtra("reminder"))) {
                this.f3412e = "Reminder:" + new Date().getTime();
            }
            String obj2 = this.f3427t.getText().toString();
            this.f3408a = "0";
            if ("Edit".equalsIgnoreCase(str) && this.f3406E) {
                this.f3408a = "" + aba.m3770c(charSequence4, str4, obj);
            }
            ContentValues a2 = this.f3403B.m4188a(this.f3432y, trim, trim2, obj, str2, str3, charSequence2, str4, str5, this.f3408a, this.f3409b, a, time, this.f3410c, charSequence3, this.f3412e, obj2);
            if ("Edit".equalsIgnoreCase(str)) {
                if (!this.f3406E || "YES".equalsIgnoreCase(this.f3412e)) {
                    String str6 = "account='" + this.f3432y + "' and " + "description" + "='" + "Repeating:" + trim + "'";
                    if (this.f3406E && "YES".equalsIgnoreCase(this.f3412e)) {
                        str6 = str6 + " and " + "expensed" + ">" + aib.m3847a();
                    }
                    str6 = "DELETE from expense_report where " + str6;
                    if ("Account Transfer".equalsIgnoreCase(charSequence)) {
                        if (this.f3406E) {
                            str6 = "DELETE from expense_report where " + ("description='Transfer:" + trim + "' and " + "expensed" + ">" + aib.m3847a());
                        } else {
                            str6 = "DELETE from expense_report where " + ("description='Transfer:" + trim + "'");
                        }
                    }
                    this.f3403B.m4194a(str6);
                }
                z = this.f3403B.m4196a("expense_repeating", this.f3411d, a2);
            } else if (this.f3403B.m4185a("expense_repeating", a2) == -1) {
                z = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        if (z) {
            abd.m3805a(this.f3413f, z);
            Intent intent = new Intent(this.f3413f, ExpenseRepeatingList.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f3432y);
            intent.putExtras(bundle);
            setResult(-1, intent);
            finish();
        } else {
            aib.m3849a(this.f3413f, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099715), getResources().getString(2131099983), null, null, null).show();
        }
        this.f3403B.m4201b();
    }

    private LinearLayout m3388b(String str) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(5, 5, 5, 5);
        View textView = new TextView(this);
        StringBuffer stringBuffer = new StringBuffer(this.f3405D);
        if (stringBuffer.length() == 6) {
            stringBuffer.insert(3, '/');
        }
        textView.setText(getResources().getString(2131099787) + ": " + stringBuffer.toString());
        if (VERSION.SDK_INT < 14) {
            textView.setTextColor(-1);
        }
        textView.setTextSize(16.0f);
        this.f3404C = new EditText(this);
        this.f3404C.setInputType(8195);
        String charSequence = this.f3414g.getText().toString();
        if (!"Edit".equalsIgnoreCase(str) || charSequence == null || "".equals(charSequence) || charSequence.indexOf("=") == -1 || charSequence.indexOf("|") == -1) {
            new aaj(this).execute(new Context[]{this});
        } else {
            this.f3404C.setText(charSequence.substring(charSequence.indexOf("=") + 1));
        }
        View textView2 = new TextView(this);
        if (VERSION.SDK_INT < 14) {
            textView2.setTextColor(-1);
        }
        textView2.setText(2131100150);
        linearLayout.addView(textView, new LayoutParams(-1, -2));
        linearLayout.addView(this.f3404C, new LayoutParams(-1, -2));
        linearLayout.addView(textView2, new LayoutParams(-1, -2));
        return linearLayout;
    }

    private void m3389b() {
        PendingIntent service = PendingIntent.getService(this, 0, new Intent(this, ExpenseAlertsService.class), 0);
        AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
        alarmManager.cancel(service);
        alarmManager.setRepeating(3, SystemClock.elapsedRealtime(), 3600000, service);
    }

    private String m3393c(String str) {
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

    private void m3397d(String str) {
        String charSequence = this.f3423p.getText().toString();
        int a = abd.m3783a(this.f3413f, this.f3403B, this.f3426s.getText().toString() + "_CURRENCY", -1);
        int a2 = abd.m3783a(this.f3413f, this.f3403B, charSequence + "_CURRENCY", -1);
        if (a == -1 || a2 == -1 || a == a2) {
            m3384a(str);
            return;
        }
        String str2 = co.f4436j[a];
        charSequence = co.f4436j[a2];
        str2 = str2.split(":")[1];
        this.f3405D = str2 + charSequence.split(":")[1];
        aib.m3849a(this.f3413f, m3388b(str), getResources().getString(2131099784), 17301659, null, getResources().getString(2131099983), new aaa(this, str), getResources().getString(2131099754), null).show();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence string;
        super.onActivityResult(i, i2, intent);
        CharSequence charSequence3 = "";
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = "";
        String str = "";
        String str2 = "";
        String str3 = "";
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                charSequence3 = extras.getString("category");
                charSequence4 = extras.getString("payee");
                charSequence5 = extras.getString("paymentMethod");
                str = extras.getString("amount");
                str2 = extras.getString("status");
                charSequence = str;
                charSequence2 = str2;
                string = extras.getString("account");
                switch (i) {
                    case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                        if (-1 == i2) {
                            this.f3420m.setText(charSequence3);
                        }
                    case C0607c.LoadingImageView_circleCrop /*2*/:
                        if (-1 == i2) {
                            this.f3414g.setText(charSequence5);
                        }
                    case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                        if (-1 == i2) {
                            this.f3423p.setText(charSequence4);
                        }
                    case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                        if (-1 == i2) {
                            if (charSequence != null && charSequence.trim().startsWith("-")) {
                                charSequence = charSequence.replace("-", "");
                            }
                            this.f3416i.setText(charSequence);
                        }
                    case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                        if (-1 == i2) {
                            this.f3424q.setText(charSequence2);
                        }
                    case adv.TitlePageIndicator_footerLineHeight /*6*/:
                        if (-1 == i2) {
                            this.f3426s.setText(string);
                        }
                    case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                        if (-1 == i2) {
                            this.f3423p.setText(string);
                        }
                    case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                        if (-1 == i2) {
                            if (charSequence != null && charSequence.trim().startsWith("-")) {
                                charSequence = charSequence.replace("-", "");
                            }
                            this.f3427t.setText(charSequence);
                        }
                    default:
                }
            }
        }
        String str4 = str3;
        Object obj = str;
        Object obj2 = str2;
        Object obj3 = str4;
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if (-1 == i2) {
                    this.f3420m.setText(charSequence3);
                }
            case C0607c.LoadingImageView_circleCrop /*2*/:
                if (-1 == i2) {
                    this.f3414g.setText(charSequence5);
                }
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                if (-1 == i2) {
                    this.f3423p.setText(charSequence4);
                }
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                if (-1 == i2) {
                    charSequence = charSequence.replace("-", "");
                    this.f3416i.setText(charSequence);
                }
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                if (-1 == i2) {
                    this.f3424q.setText(charSequence2);
                }
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                if (-1 == i2) {
                    this.f3426s.setText(string);
                }
            case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                if (-1 == i2) {
                    this.f3423p.setText(string);
                }
            case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                if (-1 == i2) {
                    charSequence = charSequence.replace("-", "");
                    this.f3427t.setText(charSequence);
                }
            default:
        }
    }

    protected void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903113);
        getWindow().setSoftInputMode(3);
        this.f3403B = new ro(this);
        this.f3433z = getResources().getString(2131100044).split(",");
        String stringExtra = getIntent().getStringExtra("rowId");
        if (stringExtra != null) {
            this.f3411d = (long) new Integer(stringExtra).intValue();
        }
        this.f3432y = getIntent().getStringExtra("account");
        if (this.f3432y == null || "".equals(this.f3432y)) {
            this.f3432y = "Personal Expense";
        }
        Object arrayList = new ArrayList(Arrays.asList(abd.m3786a(this.f3413f, this.f3403B, "MY_ACCOUNT_NAMES", "Personal Expense").split(",")));
        int indexOf = arrayList.indexOf(this.f3432y);
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903149, arrayList);
        arrayAdapter.setDropDownViewResource(2130903150);
        OnNavigationListener zoVar = new zo(this, arrayList);
        getActionBar().setNavigationMode(1);
        getActionBar().setDisplayShowTitleEnabled(false);
        getActionBar().setListNavigationCallbacks(arrayAdapter, zoVar);
        getActionBar().setSelectedNavigationItem(indexOf);
        ((ImageButton) findViewById(2131558525)).setOnClickListener(new aab(this));
        ((ImageButton) findViewById(2131558556)).setOnClickListener(new aac(this));
        this.f3427t = (EditText) findViewById(2131558861);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(2131558859);
        if ("Account Transfer".equalsIgnoreCase(getIntent().getStringExtra("category"))) {
            relativeLayout.setVisibility(8);
        } else {
            relativeLayout.setVisibility(0);
        }
        this.f3419l = (Button) findViewById(2131558869);
        this.f3419l.setOnClickListener(new aad(this));
        this.f3420m = (Button) findViewById(2131558874);
        String stringExtra2 = getIntent().getStringExtra("category");
        if (stringExtra2 == null || !"Income".equals(stringExtra2)) {
            setTitle(getResources().getString(2131100049) + ": " + this.f3432y);
        } else {
            this.f3420m.setText(stringExtra2);
            setTitle(getResources().getString(2131100050) + ": " + this.f3432y);
        }
        this.f3420m.setOnClickListener(new aae(this));
        this.f3423p = (Button) findViewById(2131558873);
        this.f3423p.setOnClickListener(new aaf(this));
        TextView textView = (TextView) findViewById(2131558691);
        if (stringExtra2 == null || !stringExtra2.startsWith("Income")) {
            textView.setText(getResources().getString(2131100004));
        } else {
            textView.setText(getResources().getString(2131100009));
        }
        Calendar instance = Calendar.getInstance();
        this.f3429v = instance.get(1);
        this.f3430w = instance.get(2);
        this.f3431x = instance.get(5);
        m3383a();
        this.f3414g = (Button) findViewById(2131558875);
        this.f3414g.setOnClickListener(new aag(this));
        Object[] split = getResources().getString(2131099908).split(",");
        if (split == null || split.length != qa.f5163b.length) {
            split = qa.f5163b;
        }
        arrayAdapter = new ArrayAdapter(this, 2130903151, split);
        arrayAdapter.setDropDownViewResource(17367049);
        this.f3415h = (Spinner) findViewById(2131558868);
        this.f3415h.setAdapter(arrayAdapter);
        this.f3415h.setSelection(5);
        this.f3416i = (EditText) findViewById(2131558858);
        this.f3417j = (EditText) findViewById(2131558857);
        this.f3418k = (EditText) findViewById(2131558864);
        ((Button) findViewById(2131558863)).setOnClickListener(new aah(this));
        this.f3425r = (CheckBox) findViewById(2131558866);
        ((Button) findViewById(2131558867)).setOnClickListener(new aai(this));
        this.f3424q = (Button) findViewById(2131558876);
        this.f3424q.setOnClickListener(new zp(this));
        LinearLayout linearLayout = (LinearLayout) findViewById(2131558870);
        this.f3426s = (Button) findViewById(2131558872);
        if (stringExtra2 == null || !"Account Transfer".equals(stringExtra2)) {
            linearLayout.setVisibility(8);
            this.f3420m.setEnabled(true);
        } else {
            setTitle(getResources().getString(2131099687));
            linearLayout.setVisibility(0);
            this.f3420m.setText("Account Transfer");
            this.f3420m.setEnabled(false);
            this.f3426s.setText(this.f3432y);
        }
        this.f3426s.setOnClickListener(new zq(this));
        this.f3421n = (Spinner) findViewById(2131558613);
        SpinnerAdapter arrayAdapter2 = new ArrayAdapter(this, 2130903151, this.f3433z);
        arrayAdapter2.setDropDownViewResource(17367049);
        this.f3421n.setAdapter(arrayAdapter2);
        this.f3421n.setSelection(0);
        this.f3422o = (Spinner) findViewById(2131558581);
        arrayAdapter2 = new ArrayAdapter(this, 2130903151, this.f3402A);
        arrayAdapter2.setDropDownViewResource(17367049);
        this.f3422o.setAdapter(arrayAdapter2);
        this.f3422o.setSelection(0);
        String stringExtra3 = getIntent().getStringExtra("fromWhere");
        this.f3428u = (Button) findViewById(2131558560);
        aib.m3858a((Context) this, this.f3428u, -1);
        this.f3428u.setOnClickListener(new zr(this, stringExtra3));
        Button button = (Button) findViewById(2131558559);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new zu(this));
        button = (Button) findViewById(2131558558);
        aib.m3858a((Context) this, button, 2130837530);
        button.setOnClickListener(new zv(this));
        if ("Edit".equalsIgnoreCase(stringExtra3) || "Copy".equalsIgnoreCase(stringExtra3)) {
            Map map;
            int intValue;
            str = "_id=" + this.f3411d + " and " + "account" + "='" + this.f3432y + "'";
            List arrayList2 = new ArrayList();
            aba.m3760a(this.f3413f, this.f3403B, str, arrayList2);
            setTitle(2131099860);
            HashMap hashMap = new HashMap();
            if (arrayList2 == null || arrayList2.size() <= 0) {
                Object obj = hashMap;
            } else {
                map = (Map) arrayList2.get(0);
            }
            this.f3419l.setText((CharSequence) map.get("firstExpenseDate"));
            this.f3420m.setText((CharSequence) map.get("category"));
            str = (String) map.get("category");
            this.f3416i.setText((CharSequence) map.get("amount"));
            this.f3417j.setText((CharSequence) map.get("description"));
            this.f3414g.setText((CharSequence) map.get("paymentMethod"));
            this.f3415h.setSelection(aib.m3846a(qa.f5163b, (String) map.get("frequency")));
            this.f3418k.setText((CharSequence) map.get("numberOfPayment"));
            this.f3408a = (String) map.get("paidCycle");
            this.f3410c = (String) map.get("property");
            this.f3423p.setText(this.f3410c);
            this.f3409b = aba.m3778e((String) map.get("nextPaymentDateLong"));
            this.f3425r.setChecked("YES".equalsIgnoreCase((String) map.get("property2")));
            this.f3412e = aib.m3865b((String) map.get("property2"));
            this.f3427t.setText((CharSequence) map.get("property3"));
            this.f3424q.setText((CharSequence) map.get("status"));
            try {
                String[] split2 = ((String) map.get("remindTime")).split(",");
                this.f3421n.setSelection(new Integer(split2[0]).intValue());
                this.f3422o.setSelection(new Integer(split2[1]).intValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
            if ("Edit".equalsIgnoreCase(stringExtra3)) {
                button.setVisibility(0);
            }
            try {
                intValue = new Integer(this.f3408a).intValue();
            } catch (Exception e2) {
                intValue = 0;
            }
            if (intValue > 0 && "Edit".equalsIgnoreCase(stringExtra3)) {
                this.f3417j.setEnabled(false);
            }
            if (str == null || !str.startsWith("Income")) {
                textView.setText(getResources().getText(2131100004));
            } else {
                textView.setText(getResources().getText(2131100009));
            }
            if (!(map.get("firstExpenseDate") == null || "".equals(map.get("firstExpenseDate")))) {
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
                    simpleDateFormat.setLenient(false);
                    instance.setTime(simpleDateFormat.parse((String) map.get("firstExpenseDate")));
                    this.f3429v = instance.get(1);
                    this.f3430w = instance.get(2);
                    this.f3431x = instance.get(5);
                } catch (Exception e3) {
                }
            }
        } else {
            str = stringExtra2;
        }
        if ("Account Transfer".equalsIgnoreCase(str)) {
            this.f3426s.setText(this.f3432y);
            textView.setText(2131100131);
        }
        if ("tools".equalsIgnoreCase(stringExtra3)) {
            CharSequence stringExtra4 = getIntent().getStringExtra("monthlyPayment");
            CharSequence stringExtra5 = getIntent().getStringExtra("month");
            this.f3416i.setText(stringExtra4);
            this.f3418k.setText(stringExtra5);
        }
        if ("YES".equalsIgnoreCase(getIntent().getStringExtra("reminder"))) {
            ((LinearLayout) findViewById(2131558865)).setVisibility(8);
            setTitle(2131100042);
        }
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                try {
                    return new DatePickerDialog(this, this.f3407F, this.f3429v, this.f3430w, this.f3431x);
                } catch (Exception e) {
                    Calendar instance = Calendar.getInstance();
                    return new DatePickerDialog(this, this.f3407F, instance.get(1), instance.get(2), instance.get(5));
                }
            default:
                return null;
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
                this.f3428u.performClick();
                return true;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                Intent intent = new Intent(this, ExpenseManager.class);
                Bundle bundle = new Bundle();
                bundle.putString("account", this.f3432y);
                intent.putExtras(bundle);
                startActivity(intent);
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
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                ((DatePickerDialog) dialog).updateDate(this.f3429v, this.f3430w, this.f3431x);
            default:
        }
    }
}
