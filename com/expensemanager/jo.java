package com.expensemanager;

import android.os.Binder;
import android.os.Parcel;

class jo extends Binder {
    final /* synthetic */ ExpenseAlertsService f4847a;

    jo(ExpenseAlertsService expenseAlertsService) {
        this.f4847a = expenseAlertsService;
    }

    protected boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
