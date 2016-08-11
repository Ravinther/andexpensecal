package com.expensemanager;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import java.util.Random;

class gq extends ArrayAdapter<String> {
    final /* synthetic */ ExpenseAccountGroupEditList f4703a;
    private List<String> f4704b;
    private int f4705c;

    public gq(ExpenseAccountGroupEditList expenseAccountGroupEditList, Context context, int i, List<String> list) {
        this.f4703a = expenseAccountGroupEditList;
        super(context, i, list);
        this.f4704b = list;
        this.f4705c = i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        if (view == null) {
            view = this.f4703a.getLayoutInflater().inflate(this.f4705c, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(2131558421);
        ((TextView) view.findViewById(2131558423)).setText(((String) this.f4704b.get(i)) + " (" + aib.m3851a(abd.m3783a(this.f4703a.f2745c, this.f4703a.f2750h, "BASE_CURRENCY_INDEX", -1)) + ")");
        textView.setText(abd.m3786a(this.f4703a.f2745c, this.f4703a.f2750h, "ACCOUNT_GROUP_NAME_" + ((String) this.f4704b.get(i)), ""));
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
        return view;
    }
}
