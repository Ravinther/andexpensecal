package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class ahd implements OnClickListener {
    final /* synthetic */ EditText f4116a;
    final /* synthetic */ SortableItemList f4117b;

    ahd(SortableItemList sortableItemList, EditText editText) {
        this.f4117b = sortableItemList;
        this.f4116a = editText;
    }

    public void onClick(View view) {
        CharSequence obj = this.f4116a.getText().toString();
        if (obj != null && !"".equals(obj)) {
            if (obj.indexOf("'") != -1) {
                aib.m3849a(this.f4117b.f3633c, null, this.f4117b.getResources().getString(2131099702), 17301543, this.f4117b.getResources().getString(2131099703), this.f4117b.getResources().getString(2131099983), null, null, null).show();
                return;
            }
            if (this.f4117b.f3635e == null || "".equals(this.f4117b.f3635e)) {
                this.f4117b.f3635e = obj.trim();
            } else {
                this.f4117b.f3635e = this.f4117b.f3635e + "," + obj.trim();
            }
            abd.m3811a(this.f4117b.f3633c, this.f4117b.f3638h, "expense_preference", this.f4117b.f3636f, this.f4117b.f3635e);
            this.f4116a.setHint(obj);
            this.f4116a.setText("");
            this.f4117b.onCreate(null);
            abd.m3806a(this.f4117b.f3632b, this.f4117b.f3631a.getCount());
        }
    }
}
