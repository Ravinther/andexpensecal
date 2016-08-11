package com.expensemanager;

import java.util.Comparator;

class ahi implements Comparator<String> {
    final /* synthetic */ SortableItemList f4123a;

    ahi(SortableItemList sortableItemList) {
        this.f4123a = sortableItemList;
    }

    public int m3842a(String str, String str2) {
        return str.compareTo(str2);
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m3842a((String) obj, (String) obj2);
    }
}
