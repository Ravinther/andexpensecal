package com.expensemanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import java.util.List;
import java.util.Map;

public class cm extends SimpleAdapter {
    SharedPreferences f4425a;
    private int[] f4426b;

    public cm(Context context, List<Map<String, Object>> list, int i, String[] strArr, int[] iArr) {
        super(context, list, i, strArr, iArr);
        this.f4426b = new int[]{-1, -2302756};
        this.f4425a = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
    }

    public cm(Context context, List<Map<String, String>> list, int i, String[] strArr, int[] iArr, String str) {
        super(context, list, i, strArr, iArr);
        this.f4426b = new int[]{-1, -2302756};
        this.f4425a = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        int length = i % this.f4426b.length;
        int i2 = this.f4425a.getInt("THEME_COLOR", 0);
        if (i2 == 1 || i2 > 3) {
            this.f4426b = new int[]{-16777216, -13027015};
        }
        view2.setBackgroundColor(this.f4426b[length]);
        return view2;
    }
}
