package com.expensemanager;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Settings.Secure;
import android.support.v4.app.C0037o;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.p033a.p034a.C0462m;
import com.google.android.p033a.p034a.C0563a;
import com.google.android.p033a.p034a.C0571i;
import com.google.android.p033a.p034a.C0580t;
import com.viewpagerindicator.TabPageIndicator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;

public class ExpenseManager extends C0037o {
    private static ro f3236D;
    private static int f3237E;
    private static ViewPager f3238F;
    private static uy f3239G;
    private static ArrayList<String> f3240H;
    public static int f3241q;
    public static int f3242r;
    public static int f3243s;
    public static String f3244t;
    public static String f3245u;
    public static HashMap<String, String> f3246v;
    static String f3247x;
    private static final byte[] f3248y;
    private C0462m f3249A;
    private Context f3250B;
    private String f3251C;
    boolean f3252n;
    boolean f3253o;
    boolean f3254p;
    TabPageIndicator f3255w;
    private C0571i f3256z;

    static {
        f3248y = new byte[]{(byte) -46, (byte) 65, (byte) 30, Byte.MIN_VALUE, (byte) -103, (byte) -57, (byte) 74, (byte) -64, (byte) 51, (byte) 88, (byte) -95, (byte) -45, (byte) 77, (byte) -117, (byte) -36, (byte) -113, (byte) -11, (byte) 32, (byte) -64, (byte) 89};
        f3241q = 0;
        f3242r = 1;
        f3243s = Calendar.getInstance().getFirstDayOfWeek();
        f3244t = "yyyy-MM-dd";
        f3245u = "Personal Expense";
        f3237E = 1;
        f3240H = new ArrayList();
        f3246v = null;
        f3247x = "NO";
    }

    public ExpenseManager() {
        this.f3250B = this;
        this.f3251C = "";
    }

    public static String m3194a(Context context, ro roVar, String str) {
        String str2;
        String str3 = "";
        int a = abd.m3783a(context, roVar, str + "_CURRENCY", -1);
        if ("All".equalsIgnoreCase(str)) {
            a = abd.m3783a(context, roVar, "BASE_CURRENCY_INDEX", -1);
            if (a == -1) {
                int a2 = abd.m3783a(context, roVar, "Default_Account_Index", -1);
                str2 = (String) f3240H.get(0);
                if (f3240H != null && a2 < f3240H.size() && a2 >= 0) {
                    str2 = (String) f3240H.get(a2);
                }
                a = abd.m3783a(context, roVar, str2 + "_CURRENCY", -1);
            }
        }
        if (a != -1) {
            str2 = co.f4436j[a];
            str2 = str2.substring(str2.indexOf(":") + 1);
        } else {
            str2 = str3;
        }
        return (str2 == null || "".equals(str2)) ? str : str + " (" + str2 + ")";
    }

    private void m3206l() {
        setContentView(2130903123);
        f3245u = abd.m3786a(this.f3250B, f3236D, "MY_ACCOUNT_NAMES", null);
        if (f3245u == null) {
            abd.m3803a(this.f3250B, f3236D);
            f3245u = abd.m3786a(this.f3250B, f3236D, "MY_ACCOUNT_NAMES", null);
        }
        this.f3251C = getIntent().getStringExtra("account");
        if (this.f3251C == null || "".equals(this.f3251C)) {
            if (f3245u == null || "".equals(f3245u)) {
                this.f3251C = getResources().getString(2131100022);
                abd.m3811a(this.f3250B, f3236D, "expense_preference", "MY_ACCOUNT_NAMES", this.f3251C);
            } else {
                String[] split = f3245u.split(",");
                int a = abd.m3783a(this.f3250B, f3236D, "Default_Account_Index", 0);
                if (a > split.length - 1 || a < 0) {
                    a = 0;
                }
                this.f3251C = split[a];
            }
        }
        if (f3245u == null) {
            f3245u = getResources().getString(2131100022);
        }
        f3240H = new ArrayList(Arrays.asList(f3245u.split(",")));
        if (f3240H.size() > 1) {
            f3240H.add("All");
        }
        f3237E = f3240H.size();
        f3239G = new uy(m366f());
        f3238F = (ViewPager) findViewById(2131558656);
        f3238F.setAdapter(f3239G);
        this.f3255w = (TabPageIndicator) findViewById(2131558655);
        this.f3255w.setViewPager(f3238F);
        if (f3237E == 1) {
            this.f3255w.setVisibility(8);
        }
        if (!(f3240H == null || f3240H.indexOf(this.f3251C) == -1)) {
            f3238F.setCurrentItem(f3240H.indexOf(this.f3251C));
        }
        setTitle(m3194a(this.f3250B, f3236D, (String) f3240H.get(f3238F.getCurrentItem())));
        if (VERSION.SDK_INT >= 14) {
            this.f3255w.setOnPageChangeListener(new tv(this));
        }
    }

    private void m3207m() {
        try {
            PendingIntent service = PendingIntent.getService(this, 0, new Intent(this, ExpenseAlertsService.class), 0);
            AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
            alarmManager.cancel(service);
            alarmManager.setRepeating(3, SystemClock.elapsedRealtime(), 3600000, service);
            service = PendingIntent.getService(this, 0, new Intent(this, ExpenseSyncService.class), 0);
            alarmManager = (AlarmManager) getSystemService("alarm");
            alarmManager.cancel(service);
            alarmManager.setRepeating(3, SystemClock.elapsedRealtime(), 60000, service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void m3208n() {
        finish();
    }

    private void m3209o() {
        this.f3254p = false;
        this.f3253o = true;
        setProgressBarIndeterminateVisibility(true);
        this.f3256z.m4849a(this.f3249A);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!(f3240H == null || f3238F == null || f3238F.getCurrentItem() >= f3240H.size())) {
            this.f3251C = (String) f3240H.get(f3238F.getCurrentItem());
        }
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.f3251C = extras.getString("account");
            }
        }
        if (-1 == i2) {
            try {
                int currentItem = f3238F.getCurrentItem();
                f3245u = abd.m3786a(this.f3250B, f3236D, "MY_ACCOUNT_NAMES", "Personal Expense");
                f3240H = new ArrayList(Arrays.asList(f3245u.split(",")));
                if (f3240H.size() > 1) {
                    f3240H.add("All");
                }
                f3237E = f3240H.size();
                if (!(this.f3251C == null || "".equals(this.f3251C))) {
                    currentItem = f3240H.indexOf(this.f3251C);
                }
                f3239G.m145c();
                this.f3255w.m7177a();
                this.f3255w.setCurrentItem(currentItem);
                if (f3237E == 1) {
                    this.f3255w.setVisibility(8);
                } else {
                    this.f3255w.setVisibility(0);
                }
                setTitle(m3194a(this.f3250B, f3236D, (String) f3240H.get(f3238F.getCurrentItem())));
            } catch (Exception e) {
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        int i = sharedPreferences.getInt("THEME_COLOR", 0);
        if (i == 1 || i > 3) {
            setTheme(2131230730);
        }
        abd.m3802a((Activity) this, true);
        if (!("LICENSED".equalsIgnoreCase(C0445f.m4106b(sharedPreferences.getString("LICENSE_CHECK", ""))) || "com.expensemanager".equals(this.f3250B.getApplicationContext().getPackageName()))) {
            String string = Secure.getString(getContentResolver(), "android_id");
            this.f3249A = new uz();
            this.f3256z = new C0571i(this, new C0580t(this, new C0563a(f3248y, getPackageName(), string)), "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmia81OvR5o1e2RxTzr+h8cYkT4a3YvSIIi6SSfuQdEBtUjnY5POKeRMBrpLL71kTPUv6Eq+nt5uP7xXib/zEjnCyhDkH9YFPGrpvA4kCmcTalYiJ1qpFyWEf4RLStDbXvMx3wByyAY67TfkGRgNXr/p/zp+DAK9Jv9ykKZpHd1ZCM4Dy1/2Z3cYSdoDkSyoHvyDkzEIPJbNBJsO9f9VG4AyGOpFub87Y/PwJW0V/P1fbH3phnZwdwYXki4fHAwpoowXQjH1nEH/btQk9flLB/PU4eaeRdZs7HmLeyxehmHNeBYKoGFtX6Gu7pKQjj4i3fWpbjI63k4STUk7A2Dd9yQIDAQAB");
            m3209o();
        }
        if (getActionBar() != null) {
            getActionBar().setHomeButtonEnabled(true);
            getActionBar().setDisplayHomeAsUpEnabled(false);
        }
        f3236D = new ro(this);
        try {
            f3241q = abd.m3783a(this.f3250B, f3236D, "firstMonthOfYear", 0);
            f3242r = abd.m3783a(this.f3250B, f3236D, "firstDayOfMonth", 1);
            f3243s = abd.m3783a(this.f3250B, f3236D, "firstDayOfWeek", Calendar.getInstance().getFirstDayOfWeek());
            f3244t = abd.m3786a(this.f3250B, f3236D, "DATE_FORMAT", f3244t);
            f3246v = new HashMap();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            String[] split = abd.m3786a(this.f3250B, f3236D, "MY_ACCOUNT_NAMES", "Personal Expense").split(",");
            String a = abd.m3787a(this.f3250B, f3236D, split, hashMap, hashMap2);
            if (hashMap != null && hashMap.size() > 0) {
                new va(this, a, split, hashMap, hashMap2).execute(new Context[]{this});
            }
            aba.m3759a((Context) this, f3236D);
            if (sharedPreferences.getBoolean("SMS_AUTO", false)) {
                SMSMain.m3548a(this.f3250B, f3236D);
            }
            f3247x = abd.m3786a(this.f3250B, f3236D, "excludeTransfer", "NO");
        } catch (Exception e) {
        }
        boolean z = sharedPreferences.getBoolean("ENABLE_SECURITY", false);
        boolean z2 = sharedPreferences.getBoolean("AUTO_SYNC", false);
        boolean z3 = sharedPreferences.getBoolean("SYNC_FLAG", false);
        String string2 = sharedPreferences.getString("PIN", null);
        if (z && string2 != null) {
            aib.m3849a(this.f3250B, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099998), getResources().getString(2131099983), null, null, null).show();
            Editor edit = sharedPreferences.edit();
            edit.remove("PIN");
            edit.putBoolean("ENABLE_SECURITY", false);
            edit.commit();
            z = false;
        }
        string2 = sharedPreferences.getString("NEW_PIN", null);
        if (z && string2 != null) {
            if (z2 && !z3) {
                new vb(this, false).execute(new Context[]{this});
            }
            adl com_expensemanager_adl = new adl(this);
            com_expensemanager_adl.requestWindowFeature(1);
            OnCancelListener ttVar = new tt(this);
            OnDismissListener tuVar = new tu(this);
            com_expensemanager_adl.setOnCancelListener(ttVar);
            com_expensemanager_adl.setOnDismissListener(tuVar);
            com_expensemanager_adl.getWindow().setSoftInputMode(3);
            com_expensemanager_adl.show();
        } else if (!z2 || z3) {
            m3206l();
        } else {
            new vb(this, true).execute(new Context[]{this});
        }
    }

    protected Dialog onCreateDialog(int i) {
        return new Builder(this).setTitle("UNLICENSED APPLICATION").setMessage("This application is not licensed, please buy it from the play store.").setPositiveButton("Buy", new ub(this)).setNegativeButton("Exit", new ua(this)).setNeutralButton("Re-Check", new tz(this)).setCancelable(false).setOnKeyListener(new ty(this)).create();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492875, menu);
        if ("com.expensemanager.pro".equals(this.f3250B.getApplicationContext().getPackageName())) {
            MenuItem findItem = menu.findItem(2131559165);
            if (findItem != null) {
                findItem.setVisible(false);
            }
        }
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 || i == 3) {
            new ux(this).execute(new Context[]{this});
            if (getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getBoolean("EXIT_PROMPT", false)) {
                new Builder(this).setTitle(2131099702).setMessage(2131100033).setPositiveButton(2131099983, new tx(this)).setNegativeButton(2131099754, new tw(this)).show();
            } else {
                m3208n();
            }
        }
        return false;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (!(f3238F == null || f3238F.getCurrentItem() == -1 || f3238F.getCurrentItem() >= f3240H.size())) {
            this.f3251C = (String) f3240H.get(f3238F.getCurrentItem());
        }
        Intent intent;
        Bundle bundle;
        switch (menuItem.getItemId()) {
            case 16908332:
                startActivityForResult(new Intent(this.f3250B, ExpenseAccountList.class), 0);
                return true;
            case 2131558538:
                intent = new Intent(this.f3250B, MoreFeatures.class);
                bundle = new Bundle();
                bundle.putString("account", this.f3251C);
                intent.putExtras(bundle);
                startActivityForResult(intent, 0);
                return true;
            case 2131559123:
                startActivityForResult(new Intent(this.f3250B, ExpenseAccountList.class), 0);
                return true;
            case 2131559154:
                intent = new Intent(this.f3250B, Settings.class);
                bundle = new Bundle();
                bundle.putString("account", this.f3251C);
                intent.putExtras(bundle);
                startActivityForResult(intent, 0);
                return true;
            case 2131559162:
                intent = new Intent(this.f3250B, ExpenseReminderList.class);
                bundle = new Bundle();
                bundle.putString("account", this.f3251C);
                intent.putExtras(bundle);
                startActivityForResult(intent, 0);
                return true;
            case 2131559163:
                startActivityForResult(new Intent(this, NoteList.class), 0);
                return true;
            case 2131559164:
                intent = new Intent(this.f3250B, ExpenseTools.class);
                bundle = new Bundle();
                bundle.putString("account", this.f3251C);
                intent.putExtras(bundle);
                startActivityForResult(intent, 0);
                return true;
            case 2131559165:
                startActivity(new Intent(this, ProEdition.class));
                return true;
            case 2131559166:
                startActivityForResult(new Intent(this, AboutUs.class), 0);
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
