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

class cs extends ArrayAdapter<String> {
    final /* synthetic */ CreditCardAccountEditList f4440a;
    private List<String> f4441b;
    private int f4442c;

    public cs(CreditCardAccountEditList creditCardAccountEditList, Context context, int i, List<String> list) {
        this.f4440a = creditCardAccountEditList;
        super(context, i, list);
        this.f4441b = list;
        this.f4442c = i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        if (view == null) {
            view = this.f4440a.getLayoutInflater().inflate(this.f4442c, viewGroup, false);
        }
        ((TextView) view.findViewById(2131558423)).setText((CharSequence) this.f4441b.get(i));
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
