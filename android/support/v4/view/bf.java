package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;

public class bf extends LayoutParams {
    public boolean f430a;
    public int f431b;
    float f432c;
    boolean f433d;
    int f434e;
    int f435f;

    public bf() {
        super(-1, -1);
        this.f432c = 0.0f;
    }

    public bf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f432c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f356a);
        this.f431b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
