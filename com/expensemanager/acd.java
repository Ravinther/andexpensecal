package com.expensemanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class acd extends BaseAdapter {
    private LayoutInflater f3890a;
    private int[] f3891b;
    private String[] f3892c;

    public acd(Context context, int[] iArr, String[] strArr) {
        this.f3890a = LayoutInflater.from(context);
        this.f3891b = iArr;
        this.f3892c = strArr;
    }

    public int getCount() {
        return this.f3892c.length;
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ace com_expensemanager_ace;
        if (view == null) {
            view = this.f3890a.inflate(2130903130, null);
            ace com_expensemanager_ace2 = new ace();
            com_expensemanager_ace2.f3893a = (TextView) view.findViewById(2131558925);
            com_expensemanager_ace2.f3894b = (ImageView) view.findViewById(2131558411);
            view.setTag(com_expensemanager_ace2);
            com_expensemanager_ace = com_expensemanager_ace2;
        } else {
            com_expensemanager_ace = (ace) view.getTag();
        }
        com_expensemanager_ace.f3893a.setText(this.f3892c[i]);
        com_expensemanager_ace.f3894b.setImageResource(this.f3891b[i]);
        return view;
    }
}
