package com.expensemanager;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.expensemanager.dropbox.DBRoulette;

public class ExpenseSyncService extends Service {
    Runnable f3471a;
    private final IBinder f3472b;

    public ExpenseSyncService() {
        this.f3471a = new aax(this);
        this.f3472b = new aay(this);
    }

    private void m3443a() {
        DBRoulette.m4063b((Context) this);
        GoogleDrive.m3448a((Context) this);
        abd.m3805a((Context) this, false);
    }

    public IBinder onBind(Intent intent) {
        return this.f3472b;
    }

    public void onCreate() {
        new Thread(null, this.f3471a, "ExpenseSyncService").start();
    }
}
