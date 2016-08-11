package com.expensemanager;

import java.io.File;
import java.io.FilenameFilter;

class rn implements FilenameFilter {
    final /* synthetic */ ExpenseDataBackup f5223a;

    rn(ExpenseDataBackup expenseDataBackup) {
        this.f5223a = expenseDataBackup;
    }

    public boolean accept(File file, String str) {
        return str.endsWith(".csv");
    }
}
