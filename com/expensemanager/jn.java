package com.expensemanager;

class jn implements Runnable {
    final /* synthetic */ ExpenseAlertsService f4846a;

    jn(ExpenseAlertsService expenseAlertsService) {
        this.f4846a = expenseAlertsService;
    }

    public void run() {
        synchronized (this.f4846a.f2862c) {
            try {
                this.f4846a.m2759a();
                this.f4846a.m2762b();
                this.f4846a.m2764c();
                this.f4846a.m2766d();
            } catch (Exception e) {
            }
        }
        this.f4846a.stopSelf();
    }
}
