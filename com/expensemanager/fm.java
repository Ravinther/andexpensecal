package com.expensemanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

class fm extends SimpleAdapter {
    SharedPreferences f4645a;
    List<Map<String, Object>> f4646b;
    int f4647c;
    final /* synthetic */ ExpenseAccountActivities f4648d;
    private int[] f4649e;

    public fm(ExpenseAccountActivities expenseAccountActivities, Context context, List<Map<String, Object>> list, int i, String[] strArr, int[] iArr) {
        this.f4648d = expenseAccountActivities;
        super(context, list, i, strArr, iArr);
        this.f4649e = new int[]{822083583, -1141049649};
        this.f4647c = -16777216;
        this.f4645a = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        this.f4646b = list;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        int length = i % this.f4649e.length;
        int i2 = co.f4428b;
        int i3 = this.f4645a.getInt("THEME_COLOR", 0);
        if (i3 == 1 || i3 > 3) {
            this.f4649e = new int[]{0, -1724303047};
            i2 = -256;
            this.f4647c = -1;
        }
        int i4 = i2;
        view2.setBackgroundColor(this.f4649e[length]);
        Map map = (Map) this.f4646b.get(i);
        String str = (String) map.get("status");
        String string = this.f4645a.getString(((String) map.get("account")) + "_" + "ACTIVITY_DEFAULT_STATUS_HIGHLIGHT", "");
        if (!("".equals(str) || "".equals(string))) {
            ArrayList arrayList = new ArrayList(Arrays.asList(string.split(",")));
            TextView textView = (TextView) view2.findViewById(2131558670);
            if (textView == null) {
                return view2;
            }
            if (arrayList.contains(str)) {
                textView.setTextColor(i4);
                textView.setTypeface(null, 1);
            } else {
                textView.setTextColor(this.f4647c);
                textView.setTypeface(null, 0);
            }
        }
        Button button = (Button) view2.findViewById(2131558423);
        String str2 = (String) map.get("rowId");
        if (this.f4648d.f2717m.contains(str2)) {
            button.setTextColor(co.f4428b);
        }
        button.setOnClickListener(new fn(this, str2, button));
        return view2;
    }
}
