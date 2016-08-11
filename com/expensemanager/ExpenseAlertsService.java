package com.expensemanager;

import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class ExpenseAlertsService extends Service {
    NotificationManager f2860a;
    Runnable f2861b;
    private final IBinder f2862c;

    public ExpenseAlertsService() {
        this.f2861b = new jn(this);
        this.f2862c = new jo(this);
    }

    private void m2759a() {
        ArrayList b = aba.m3769b((Context) this, new ro(this));
        for (int i = 0; i < b.size(); i++) {
            String str = (String) b.get(i);
            m2760a(str.substring(0, str.indexOf("@")), str.substring(str.indexOf("@") + 1), new Random().nextInt(100));
        }
    }

    private void m2760a(String str, String str2, int i) {
        Notification notification = new Notification(2130837626, str2, System.currentTimeMillis());
        notification.flags = 16;
        notification.defaults |= 1;
        Intent intent = new Intent(this, ExpenseRepeatingList.class);
        if ("$Reminder".equalsIgnoreCase(str)) {
            intent = new Intent(this, ExpenseReminderList.class);
        }
        if ("$Transfer".equalsIgnoreCase(str)) {
            intent = new Intent(this, ExpenseRepeatingTransferList.class);
        }
        Bundle bundle = new Bundle();
        bundle.putString("account", str);
        intent.putExtras(bundle);
        notification.setLatestEventInfo(this, getText(2131099725), str2, PendingIntent.getActivity(this, i, intent, 134217728));
        this.f2860a.notify(2131099725 + i, notification);
    }

    private void m2761a(String str, String str2, int i, int i2) {
        Notification notification = new Notification(2130837626, str2, System.currentTimeMillis());
        notification.flags = 16;
        notification.defaults |= 1;
        Intent intent = new Intent(this, ExpenseBudgetList.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", "All");
        bundle.putInt("tabId", i);
        intent.putExtras(bundle);
        notification.setLatestEventInfo(this, str, str2, PendingIntent.getActivity(this, i2, intent, 134217728));
        this.f2860a.notify(2131099725 + i2, notification);
    }

    private void m2762b() {
        ro roVar = new ro(this);
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        List arrayList3 = new ArrayList();
        List arrayList4 = new ArrayList();
        abd.m3812a((Context) this, roVar, (ArrayList) arrayList, (ArrayList) arrayList2, (ArrayList) arrayList3, (ArrayList) arrayList4);
        String format = new SimpleDateFormat(ExpenseManager.f3244t).format(Calendar.getInstance().getTime());
        String str = "expensed=" + aba.m3744a(format, ExpenseManager.f3244t, Locale.US) + " and " + "category" + "!='Income'";
        List arrayList5 = new ArrayList();
        ExpenseBudgetList.m2835a(roVar, str, arrayList, arrayList5, null);
        str = aba.m3747a(0, "All", 2).replace("='null'", "!='null'");
        List arrayList6 = new ArrayList();
        ExpenseBudgetList.m2835a(roVar, str, arrayList2, arrayList6, null);
        str = aba.m3764b(0, "All", 2).replace("='null'", "!='null'");
        List arrayList7 = new ArrayList();
        ExpenseBudgetList.m2835a(roVar, str, arrayList3, arrayList7, null);
        str = aba.m3771c(0, "All", 2).replace("='null'", "!='null'");
        List arrayList8 = new ArrayList();
        ExpenseBudgetList.m2835a(roVar, str, arrayList4, arrayList8, null);
        List a = ExpenseBudgetOnetimeList.m2895a(roVar);
        List arrayList9 = new ArrayList();
        ExpenseBudgetOnetimeList.m2898a(roVar, a, null, arrayList9);
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 4);
        String string = sharedPreferences.getString("BUDGET_ALERT", "");
        Editor edit = sharedPreferences.edit();
        if (!string.equals(format)) {
            Random random = new Random();
            String a2 = abd.m3788a((Context) this, arrayList, arrayList5);
            if (!"".equals(a2)) {
                m2761a(getResources().getString(2131099791) + " " + getResources().getString(2131099744), a2, 0, random.nextInt(100));
                edit.putString("BUDGET_ALERT", format);
            }
            a2 = abd.m3788a((Context) this, arrayList2, arrayList6);
            if (!"".equals(a2)) {
                m2761a(getResources().getString(2131100165) + " " + getResources().getString(2131099744), a2, 1, random.nextInt(100));
                edit.putString("BUDGET_ALERT", format);
            }
            a2 = abd.m3788a((Context) this, arrayList3, arrayList7);
            if (!"".equals(a2)) {
                m2761a(getResources().getString(2131099956) + " " + getResources().getString(2131099744), a2, 2, random.nextInt(100));
                edit.putString("BUDGET_ALERT", format);
            }
            a2 = abd.m3788a((Context) this, arrayList4, arrayList8);
            if (!"".equals(a2)) {
                m2761a(getResources().getString(2131100179) + " " + getResources().getString(2131099744), a2, 3, random.nextInt(100));
                edit.putString("BUDGET_ALERT", format);
            }
            a2 = abd.m3788a((Context) this, a, arrayList9);
            if (!"".equals(a2)) {
                m2761a(getResources().getString(2131099986) + " " + getResources().getString(2131099744), a2, 4, random.nextInt(100));
                edit.putString("BUDGET_ALERT", format);
            }
            edit.commit();
        }
    }

    private void m2764c() {
        CharSequence string = getResources().getString(2131099792);
        String format = new SimpleDateFormat(ExpenseManager.f3244t).format(Calendar.getInstance().getTime());
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        String string2 = sharedPreferences.getString("INPUT_ALERT", "");
        Editor edit = sharedPreferences.edit();
        int nextInt = new Random().nextInt(100);
        int i = Calendar.getInstance().get(11);
        int i2 = sharedPreferences.getInt("DAILY_REMINDER_TIME", 0);
        if (i2 != 0 && !string2.equals(format) && i == i2 - 1) {
            CharSequence charSequence = getResources().getString(2131099725) + " - " + format;
            Notification notification = new Notification(2130837626, string, System.currentTimeMillis());
            notification.flags = 16;
            notification.defaults |= 1;
            notification.setLatestEventInfo(this, charSequence, string, PendingIntent.getActivity(this, nextInt, new Intent(this, ExpenseManager.class), 134217728));
            this.f2860a.notify(2131099725 + nextInt, notification);
            edit.putString("INPUT_ALERT", format);
            edit.commit();
        }
    }

    private void m2766d() {
        ro roVar = new ro(this);
        String a = abd.m3786a((Context) this, roVar, "CREDIT_CARD_ACCOUNT", null);
        if (a != null && !"".equals(a)) {
            ArrayList j = aib.m3878j(a);
            for (int i = 0; i < j.size(); i++) {
                a = abd.m3786a((Context) this, roVar, ((String) j.get(i)) + "_" + "CREDIT_CARD_ACCOUNT", null);
                if (!(a == null || "".equals(a))) {
                    String[] split = a.split(",");
                    int i2 = 1;
                    int i3 = 28;
                    if (split.length > 1) {
                        i2 = Integer.valueOf(split[1]).intValue();
                        i3 = Integer.valueOf(split[2]).intValue();
                    }
                    if (split.length <= 3 || !"0".equals(split[3])) {
                        int parseInt = Integer.parseInt(split[3]);
                        Calendar instance = Calendar.getInstance();
                        instance.set(5, i3);
                        if (Calendar.getInstance().after(instance)) {
                            instance.add(2, 1);
                        }
                        i3 = ((int) (instance.getTimeInMillis() - Calendar.getInstance().getTimeInMillis())) / 86400000;
                        instance.set(11, 23);
                        instance.set(12, 59);
                        instance.set(13, 59);
                        instance.set(14, 999);
                        if (i3 <= parseInt) {
                            Calendar instance2 = Calendar.getInstance();
                            if (instance2.get(5) + 1 >= i2) {
                                instance2.set(5, i2 - 1);
                                instance2.add(5, -1);
                            } else {
                                instance2.set(5, i2 - 1);
                                instance2.add(2, -1);
                                instance2.add(5, -1);
                            }
                            instance2.set(11, 23);
                            instance2.set(12, 59);
                            instance2.set(13, 59);
                            instance2.set(14, 999);
                            String a2 = aba.m3750a(roVar, "account='" + ((String) j.get(i)) + "' AND " + "category" + "!='Income'" + " AND " + "expensed" + "<" + instance2.getTimeInMillis());
                            a = aba.m3762b(aba.m3743a("-" + a2, aba.m3750a(roVar, "account='" + ((String) j.get(i)) + "' AND " + "category" + "='Income'" + " AND " + "expensed" + "<=" + instance.getTimeInMillis())));
                            if (aib.m3877i(a) < 0.0d) {
                                CharSequence replace = a.replace("-", "");
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
                                String format = simpleDateFormat.format(Calendar.getInstance().getTime());
                                replace = getResources().getString(2131099761).replace("###", (CharSequence) j.get(i)).replace("$$$", replace).replace("%%%", simpleDateFormat.format(instance.getTime()));
                                SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
                                a = sharedPreferences.getString(((String) j.get(i)) + "_CREDIT_CARD_ALERT", "");
                                Editor edit = sharedPreferences.edit();
                                int nextInt = new Random().nextInt(100);
                                int i4 = Calendar.getInstance().get(11);
                                int i5 = sharedPreferences.getInt("DAILY_REMINDER_TIME", 21);
                                if (!a.equals(format) && i4 == i5) {
                                    CharSequence charSequence = getResources().getString(2131099856) + " - " + simpleDateFormat.format(instance.getTime());
                                    Builder contentIntent = new Builder(this).setContentTitle(charSequence).setContentText(replace).setSmallIcon(2130837626).setStyle(new BigTextStyle().bigText(replace)).setContentIntent(PendingIntent.getActivity(this, nextInt, new Intent(this, ExpenseManager.class), 134217728));
                                    Notification notification = contentIntent.getNotification();
                                    if (VERSION.SDK_INT > 15) {
                                        notification = contentIntent.build();
                                    }
                                    notification.flags = 16;
                                    notification.defaults |= 1;
                                    this.f2860a.notify(2131099725 + nextInt, notification);
                                    edit.putString(((String) j.get(i)) + "_CREDIT_CARD_ALERT", format);
                                    edit.commit();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f2862c;
    }

    public void onCreate() {
        this.f2860a = (NotificationManager) getSystemService("notification");
        new Thread(null, this.f2861b, "ExpenseAlertsService").start();
    }

    public void onDestroy() {
    }
}
