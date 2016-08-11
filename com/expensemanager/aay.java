package com.expensemanager;

import android.os.Binder;
import android.os.Parcel;

class aay extends Binder {
    final /* synthetic */ ExpenseSyncService f3825a;

    aay(ExpenseSyncService expenseSyncService) {
        this.f3825a = expenseSyncService;
    }

    protected boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
