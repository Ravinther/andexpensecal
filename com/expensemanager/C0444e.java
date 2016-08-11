package com.expensemanager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import java.io.File;

/* renamed from: com.expensemanager.e */
public class C0444e extends BaseAdapter {
    final /* synthetic */ AttachPicture f4572a;
    private Context f4573b;

    public C0444e(AttachPicture attachPicture, Context context) {
        this.f4572a = attachPicture;
        this.f4573b = context;
    }

    public int getCount() {
        return this.f4572a.f2414a.length;
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View imageView = new ImageView(this.f4573b);
        imageView.setImageBitmap(AttachPicture.m2370a(new File(co.f4431e + this.f4572a.f2414a[i]), 70));
        imageView.setAdjustViewBounds(true);
        imageView.setLayoutParams(new LayoutParams(-2, -2));
        imageView.setBackgroundResource(2130837580);
        return imageView;
    }
}
