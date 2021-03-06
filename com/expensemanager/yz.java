package com.expensemanager;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import java.util.Random;

class yz extends ArrayAdapter<String> {
    final /* synthetic */ ExpensePaymentMethodList f5509a;
    private List<String> f5510b;
    private int f5511c;

    public yz(ExpensePaymentMethodList expensePaymentMethodList, Context context, int i, List<String> list) {
        this.f5509a = expensePaymentMethodList;
        super(context, i, list);
        this.f5510b = list;
        this.f5511c = i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        if (view == null) {
            view = this.f5509a.getLayoutInflater().inflate(this.f5511c, viewGroup, false);
        }
        ((TextView) view.findViewById(2131558423)).setText((CharSequence) this.f5510b.get(i));
        ImageView imageView = (ImageView) view.findViewById(2131558668);
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
        if (this.f5509a.f3381g) {
            imageView.setVisibility(0);
            linearLayout.setVisibility(0);
        } else {
            imageView.setVisibility(8);
            linearLayout.setVisibility(8);
        }
        imageView.setOnClickListener(new za(this, i));
        int[] iArr = new int[]{822083583, -1143087651};
        i3 = this.f5509a.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        if (i3 == 1 || i3 > 3) {
            iArr = new int[]{0, -1724303047};
        }
        view.setBackgroundColor(iArr[i % 2]);
        return view;
    }
}
