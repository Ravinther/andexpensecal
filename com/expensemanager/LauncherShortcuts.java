package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.os.Bundle;
import android.os.Parcelable;

public class LauncherShortcuts extends Activity {
    private void m3482a() {
        ExpenseManager.f3244t = abd.m3786a((Context) this, new ro(this), "DATE_FORMAT", "yyyy-MM-dd");
        Parcelable intent = new Intent("android.intent.action.MAIN");
        intent.setClassName(this, ExpenseNewTransaction.class.getName());
        intent.putExtra("com.expensemanager.LauncherShortcuts", "Expense Manager Provided This Shortcut");
        intent.putExtra("fromWhere", "widget");
        Intent intent2 = new Intent();
        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
        intent2.putExtra("android.intent.extra.shortcut.NAME", getString(2131100084));
        intent = ShortcutIconResource.fromContext(this, 2130837578);
        if ("com.expensemanager.pro".equals(getApplicationContext().getPackageName())) {
            intent = ShortcutIconResource.fromContext(this, 2130837579);
        }
        intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", intent);
        setResult(-1, intent2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if ("android.intent.action.CREATE_SHORTCUT".equals(getIntent().getAction())) {
            m3482a();
            finish();
        }
    }
}
