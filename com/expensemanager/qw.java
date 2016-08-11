package com.expensemanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
import java.util.Map;

public class qw extends ArrayAdapter<Map<String, Object>> {
    private List<Map<String, Object>> f5199a;
    private int f5200b;
    private LayoutInflater f5201c;

    public qw(Context context, int i, List<Map<String, Object>> list) {
        super(context, i, list);
        this.f5199a = list;
        this.f5200b = i;
        this.f5201c = LayoutInflater.from(context);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f5201c.inflate(this.f5200b, null);
        }
        Map map = (Map) this.f5199a.get(i);
        if (map != null) {
            CharSequence trim;
            TextView textView = (TextView) view.findViewById(2131558423);
            TextView textView2 = (TextView) view.findViewById(2131558421);
            TextView textView3 = (TextView) view.findViewById(2131558424);
            TextView textView4 = (TextView) view.findViewById(2131558422);
            TextView textView5 = (TextView) view.findViewById(2131558425);
            String str = (String) map.get("amount");
            if (str != null) {
                trim = str.trim();
            } else {
                Object obj = str;
            }
            str = (String) map.get("category");
            if (str == null || !str.startsWith("Income")) {
                textView.setTextColor(co.f4428b);
            } else {
                textView.setTextColor(co.f4429c);
            }
            textView.setText(trim);
            textView2.setText((String) map.get("category"));
            textView3.setText((String) map.get("paymentMethod"));
            textView4.setText((String) map.get("description"));
            if (ExpenseAccountActivities.f2705e) {
                textView4.setText((String) map.get("fulldescription"));
            }
            textView5.setText((String) map.get("property"));
        }
        return view;
    }
}
