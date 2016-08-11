package com.expensemanager;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.viewpagerindicator.C0797e;

class acx extends TextView {
    final /* synthetic */ MyTabPageIndicator f3937a;
    private int f3938b;

    public acx(MyTabPageIndicator myTabPageIndicator, Context context) {
        this.f3937a = myTabPageIndicator;
        super(context, null, C0797e.vpiTabPageIndicatorStyle);
    }

    public int m3832a() {
        return this.f3938b;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3937a.f3526g > 0 && getMeasuredWidth() > this.f3937a.f3526g) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(this.f3937a.f3526g, 1073741824), i2);
        }
    }
}
