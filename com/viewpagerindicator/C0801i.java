package com.viewpagerindicator;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.TextView;

/* renamed from: com.viewpagerindicator.i */
class C0801i extends TextView {
    final /* synthetic */ TabPageIndicator f7794a;
    private int f7795b;

    public C0801i(TabPageIndicator tabPageIndicator, Context context) {
        this.f7794a = tabPageIndicator;
        super(context, null, C0797e.vpiTabPageIndicatorStyle);
    }

    public int m7189a() {
        return this.f7795b;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f7794a.f7782g > 0 && getMeasuredWidth() > this.f7794a.f7782g) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(this.f7794a.f7782g, 1073741824), i2);
        }
    }
}
