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

class ahj extends ArrayAdapter<String> {
    final /* synthetic */ SortableItemList f4124a;
    private List<String> f4125b;
    private int f4126c;

    public ahj(SortableItemList sortableItemList, Context context, int i, List<String> list) {
        this.f4124a = sortableItemList;
        super(context, i, list);
        this.f4125b = list;
        this.f4126c = i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        if (view == null) {
            view = this.f4124a.getLayoutInflater().inflate(this.f4126c, viewGroup, false);
        }
        ((TextView) view.findViewById(2131558423)).setText((CharSequence) this.f4125b.get(i));
        ImageView imageView = (ImageView) view.findViewById(2131558668);
        imageView.setOnClickListener(new ahk(this, i));
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
        if (this.f4124a.f3639i) {
            imageView.setVisibility(0);
            linearLayout.setVisibility(0);
        } else {
            imageView.setVisibility(8);
            linearLayout.setVisibility(8);
        }
        int[] iArr = new int[]{822083583, -1143087651};
        i3 = this.f4124a.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        if (i3 == 1 || i3 > 3) {
            iArr = new int[]{0, -1724303047};
        }
        view.setBackgroundColor(iArr[i % 2]);
        return view;
    }
}
