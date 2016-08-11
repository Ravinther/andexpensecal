package com.expensemanager;

import java.io.File;
import java.io.FilenameFilter;

final class tb implements FilenameFilter {
    final /* synthetic */ String f5285a;

    tb(String str) {
        this.f5285a = str;
    }

    public boolean accept(File file, String str) {
        return str.endsWith(this.f5285a);
    }
}
