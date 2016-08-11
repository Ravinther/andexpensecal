package com.expensemanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class cl extends SimpleAdapter {
    SharedPreferences f4422a;
    List<Map<String, Object>> f4423b;
    private int[] f4424c;

    public cl(Context context, List<Map<String, Object>> list, int i, String[] strArr, int[] iArr) {
        super(context, list, i, strArr, iArr);
        this.f4424c = new int[]{822083583, -1141049649};
        this.f4422a = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        this.f4423b = list;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        View view2 = super.getView(i, view, viewGroup);
        int length = i % this.f4424c.length;
        int i3 = co.f4428b;
        int i4 = this.f4422a.getInt("THEME_COLOR", 0);
        if (i4 == 1 || i4 > 3) {
            this.f4424c = new int[]{0, -1724303047};
            i4 = -1;
            i2 = -256;
        } else {
            i4 = -16777216;
            i2 = i3;
        }
        view2.setBackgroundColor(this.f4424c[length]);
        Map map = (Map) this.f4423b.get(i);
        String str = (String) map.get("account");
        String str2 = (String) map.get("status");
        str = this.f4422a.getString(str + "_" + "ACTIVITY_DEFAULT_STATUS_HIGHLIGHT", "");
        if (!("".equals(str2) || "".equals(str))) {
            ArrayList arrayList = new ArrayList(Arrays.asList(str.split(",")));
            TextView textView = (TextView) view2.findViewById(2131558670);
            if (textView == null) {
                return view2;
            }
            if (arrayList.contains(str2)) {
                textView.setTextColor(i2);
                textView.setTypeface(null, 1);
            } else {
                textView.setTextColor(i4);
                textView.setTypeface(null, 0);
            }
        }
        return view2;
    }
}
