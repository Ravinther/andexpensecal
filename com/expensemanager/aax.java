package com.expensemanager;

class aax implements Runnable {
    final /* synthetic */ ExpenseSyncService f3824a;

    aax(ExpenseSyncService expenseSyncService) {
        this.f3824a = expenseSyncService;
    }

    public void run() {
        synchronized (this.f3824a.f3472b) {
            try {
                this.f3824a.m3443a();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f3824a.stopSelf();
    }
}
