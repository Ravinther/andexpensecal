package com.expensemanager;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

class afq extends ArrayAdapter<Map<String, Object>> {
    final /* synthetic */ ShoppingList f4055a;
    private List<Map<String, Object>> f4056b;
    private int f4057c;

    public afq(ShoppingList shoppingList, Context context, int i, List<Map<String, Object>> list) {
        this.f4055a = shoppingList;
        super(context, i, list);
        this.f4056b = list;
        this.f4057c = i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        if (view == null) {
            view = this.f4055a.getLayoutInflater().inflate(this.f4057c, viewGroup, false);
        }
        Map map = (Map) this.f4056b.get(i);
        ((TextView) view.findViewById(2131558423)).setText((String) map.get("description"));
        ((TextView) view.findViewById(2131558421)).setText((String) map.get("property4"));
        CheckBox checkBox = (CheckBox) view.findViewById(2131558983);
        TextView textView = (TextView) view.findViewById(2131558424);
        String str = (String) map.get("date");
        if (aba.m3744a(str, ExpenseManager.f3244t, Locale.US) > 0 || !"$ShoppingList".equalsIgnoreCase((String) map.get("account"))) {
            textView.setText(this.f4055a.getResources().getString(2131099795) + ": " + str);
            checkBox.setChecked(true);
        }
        ((TextView) view.findViewById(2131558705)).setText("" + (i + 1));
        int i3 = -16711681;
        if (co.f4427a.length <= i) {
            try {
                i2 = co.f4427a[new Random().nextInt(co.f4427a.length)];
            } catch (Exception e) {
                e.printStackTrace();
                i2 = i3;
            }
        } else {
            i2 = co.f4427a[i];
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(2131558411);
        Drawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setColorFilter(i2, Mode.SRC_ATOP);
        linearLayout.setBackgroundDrawable(shapeDrawable);
        checkBox.setOnClickListener(new afr(this, map, checkBox, textView));
        return view;
    }
}
