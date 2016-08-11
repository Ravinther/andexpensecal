package com.expensemanager;

import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Map;
import java.util.Random;

class km extends ArrayAdapter<Map<String, String>> {
    final /* synthetic */ ExpenseAutoFillList f4887a;

    km(ExpenseAutoFillList expenseAutoFillList) {
        this.f4887a = expenseAutoFillList;
        super(expenseAutoFillList, 2130903085, expenseAutoFillList.f2884f);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        if (view == null) {
            view = this.f4887a.getLayoutInflater().inflate(2130903085, viewGroup, false);
        }
        int i3 = this.f4887a.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(2131558643);
        int[] iArr = new int[]{822083583, -1141049649};
        int length = i % iArr.length;
        if (i3 == 1 || i3 > 3) {
            iArr = new int[]{0, -1724303047};
        }
        relativeLayout.setBackgroundColor(iArr[length]);
        ((TextView) view.findViewById(2131558705)).setText("" + (i + 1));
        int i4 = -16711681;
        if (co.f4427a.length <= i) {
            try {
                i2 = co.f4427a[new Random().nextInt(co.f4427a.length)];
            } catch (Exception e) {
                e.printStackTrace();
                i2 = i4;
            }
        } else {
            i2 = co.f4427a[i];
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(2131558411);
        Drawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setColorFilter(i2, Mode.SRC_ATOP);
        linearLayout.setBackgroundDrawable(shapeDrawable);
        if (this.f4887a.f2885g) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
        Map map = (Map) this.f4887a.f2884f.get(i);
        TextView textView = (TextView) view.findViewById(2131558424);
        TextView textView2 = (TextView) view.findViewById(2131558422);
        TextView textView3 = (TextView) view.findViewById(2131558425);
        TextView textView4 = (TextView) view.findViewById(2131558426);
        TextView textView5 = (TextView) view.findViewById(2131558671);
        TextView textView6 = (TextView) view.findViewById(2131558670);
        ((TextView) view.findViewById(2131558423)).setText((CharSequence) map.get("description"));
        textView.setText((CharSequence) map.get("expenseAmount"));
        textView2.setText((CharSequence) map.get("incomeAmount"));
        textView3.setText((CharSequence) map.get("payeePayer"));
        textView4.setText((CharSequence) map.get("paymentMethod"));
        textView5.setText((CharSequence) map.get("categoryDisplay"));
        textView6.setText((CharSequence) map.get("status"));
        return view;
    }
}
