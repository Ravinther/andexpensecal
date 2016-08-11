package com.expensemanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class aex extends BaseAdapter {
    final /* synthetic */ SMSList f4021a;
    private LayoutInflater f4022b;

    public aex(SMSList sMSList, Context context) {
        this.f4021a = sMSList;
        this.f4022b = LayoutInflater.from(context);
    }

    public int getCount() {
        return this.f4021a.f3573a.size();
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = this.f4022b.inflate(2130903155, null);
        Map map = (Map) this.f4021a.f3573a.get(i);
        String str = (String) map.get("date");
        String trim = ((String) map.get("body")).replaceAll("'", "").trim();
        List arrayList = new ArrayList();
        ExpenseAccountActivities.m2602a(this.f4021a.f3578f, "expensed='" + str + "' or " + "description" + "='" + trim + "'", arrayList, false, null);
        TextView textView = (TextView) inflate.findViewById(2131558421);
        ((TextView) inflate.findViewById(2131558423)).setText((CharSequence) map.get("body"));
        textView.setText(aba.m3749a(Long.parseLong(str), ExpenseManager.f3244t + " HH:mm:ss"));
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(2131558643);
        linearLayout.setId(i);
        linearLayout.setOnClickListener(new aey(this, arrayList, map, i, str));
        boolean z = arrayList == null || arrayList.size() == 0;
        int i2 = this.f4021a.f3577e.getInt("THEME_COLOR", 0);
        if (!z) {
            if (i2 == 1 || i2 > 3) {
                inflate.setBackgroundColor(-1149206400);
            } else {
                inflate.setBackgroundColor(-1141049649);
            }
        }
        return inflate;
    }
}
