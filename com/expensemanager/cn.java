package com.expensemanager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class cn extends SimpleAdapter {
    public cn(Context context, List<Map<String, String>> list, int i, String[] strArr, int[] iArr) {
        super(context, list, i, strArr, iArr);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        int i2 = -16711681;
        if (co.f4427a.length <= i) {
            try {
                i2 = co.f4427a[new Random().nextInt(co.f4427a.length)];
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            i2 = co.f4427a[i];
        }
        view2.findViewById(2131558984).setBackgroundColor(i2);
        return view2;
    }
}
