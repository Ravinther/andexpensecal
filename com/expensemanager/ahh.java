package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.ArrayList;
import java.util.Arrays;

class ahh implements OnClickListener {
    final /* synthetic */ String f4121a;
    final /* synthetic */ SortableItemList f4122b;

    ahh(SortableItemList sortableItemList, String str) {
        this.f4122b = sortableItemList;
        this.f4121a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ArrayList arrayList = new ArrayList(Arrays.asList(this.f4122b.f3635e.split(",")));
        arrayList.remove(this.f4121a);
        abd.m3811a(this.f4122b.f3633c, this.f4122b.f3638h, "expense_preference", this.f4122b.f3636f, aib.m3857a(arrayList, ","));
        this.f4122b.onCreate(null);
    }
}
