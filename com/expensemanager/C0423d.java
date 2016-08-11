package com.expensemanager;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.expensemanager.d */
final class C0423d implements FilenameFilter {
    C0423d() {
    }

    public boolean accept(File file, String str) {
        return str.endsWith(".jpg");
    }
}
