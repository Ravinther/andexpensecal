package com.github.mikephil.charting.charts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.github.mikephil.charting.p032f.C0393c;
import com.github.mikephil.charting.p032f.C0515b;
import com.github.mikephil.charting.p035a.C0468a;
import com.github.mikephil.charting.p037c.C0476c;
import com.github.mikephil.charting.p037c.C0482i;
import com.github.mikephil.charting.p038e.C0488c;
import com.github.mikephil.charting.p039h.C0536k;
import com.github.mikephil.charting.p039h.C0537b;
import com.github.mikephil.charting.p039h.C0538d;
import com.github.mikephil.charting.p039h.C0544j;
import com.github.mikephil.charting.p039h.C0545l;
import com.github.mikephil.charting.p040d.C0499f;
import com.github.mikephil.charting.p040d.C0502g;
import com.github.mikephil.charting.p040d.C0505h;
import com.github.mikephil.charting.p041g.C0521c;
import com.github.mikephil.charting.p041g.C0524e;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressLint({"NewApi"})
/* renamed from: com.github.mikephil.charting.charts.c */
public abstract class C0489c<T extends C0499f<? extends C0502g<? extends C0505h>>> extends ViewGroup implements C0488c {
    protected boolean f5676A;
    protected boolean f5677B;
    protected float f5678C;
    protected float f5679D;
    protected float f5680E;
    protected boolean f5681F;
    protected boolean f5682G;
    protected C0476c f5683H;
    protected C0393c f5684I;
    protected C0524e f5685J;
    protected C0521c f5686K;
    protected C0545l f5687L;
    protected C0468a f5688M;
    protected Bitmap f5689N;
    protected Paint f5690O;
    protected C0538d[] f5691P;
    protected boolean f5692Q;
    protected C0482i f5693R;
    protected ArrayList<Runnable> f5694S;
    private boolean f5695a;
    private float f5696b;
    private String f5697c;
    private C0515b f5698d;
    private String f5699e;
    private boolean f5700f;
    private PointF f5701g;
    protected boolean f5702u;
    protected T f5703v;
    protected C0536k f5704w;
    protected Paint f5705x;
    protected Paint f5706y;
    protected String f5707z;

    public C0489c(Context context) {
        super(context);
        this.f5702u = false;
        this.f5703v = null;
        this.f5695a = true;
        this.f5696b = 0.9f;
        this.f5707z = "Description";
        this.f5676A = true;
        this.f5677B = false;
        this.f5678C = 1.0f;
        this.f5679D = 0.0f;
        this.f5680E = 0.0f;
        this.f5681F = true;
        this.f5682G = true;
        this.f5697c = "No chart data available.";
        this.f5700f = false;
        this.f5691P = new C0538d[0];
        this.f5692Q = true;
        this.f5694S = new ArrayList();
        m4366a();
    }

    public C0489c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5702u = false;
        this.f5703v = null;
        this.f5695a = true;
        this.f5696b = 0.9f;
        this.f5707z = "Description";
        this.f5676A = true;
        this.f5677B = false;
        this.f5678C = 1.0f;
        this.f5679D = 0.0f;
        this.f5680E = 0.0f;
        this.f5681F = true;
        this.f5682G = true;
        this.f5697c = "No chart data available.";
        this.f5700f = false;
        this.f5691P = new C0538d[0];
        this.f5692Q = true;
        this.f5694S = new ArrayList();
        m4366a();
    }

    public C0489c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5702u = false;
        this.f5703v = null;
        this.f5695a = true;
        this.f5696b = 0.9f;
        this.f5707z = "Description";
        this.f5676A = true;
        this.f5677B = false;
        this.f5678C = 1.0f;
        this.f5679D = 0.0f;
        this.f5680E = 0.0f;
        this.f5681F = true;
        this.f5682G = true;
        this.f5697c = "No chart data available.";
        this.f5700f = false;
        this.f5691P = new C0538d[0];
        this.f5692Q = true;
        this.f5694S = new ArrayList();
        m4366a();
    }

    protected void m4366a() {
        setWillNotDraw(false);
        if (VERSION.SDK_INT < 11) {
            this.f5688M = new C0468a();
        } else {
            this.f5688M = new C0468a(new C0497d(this));
        }
        C0544j.m4708a(getContext());
        this.f5704w = new C0537b(1);
        this.f5687L = new C0545l();
        this.f5683H = new C0476c();
        this.f5685J = new C0524e(this.f5687L, this.f5683H);
        this.f5705x = new Paint(1);
        this.f5705x.setColor(-16777216);
        this.f5705x.setTextAlign(Align.RIGHT);
        this.f5705x.setTextSize(C0544j.m4703a(9.0f));
        this.f5706y = new Paint(1);
        this.f5706y.setColor(Color.rgb(247, 189, 51));
        this.f5706y.setTextAlign(Align.CENTER);
        this.f5706y.setTextSize(C0544j.m4703a(12.0f));
        this.f5690O = new Paint(4);
        if (this.f5702u) {
            Log.i("", "Chart.init()");
        }
    }

    public void m4367a(C0538d c0538d) {
        if (c0538d == null) {
            this.f5691P = null;
        } else {
            if (this.f5702u) {
                Log.i("MPAndroidChart", "Highlighted: " + c0538d.toString());
            }
            this.f5691P = new C0538d[]{c0538d};
        }
        invalidate();
        if (this.f5684I == null) {
            return;
        }
        if (m4377u()) {
            this.f5684I.m2376a(this.f5703v.m4464a(c0538d), c0538d.m4685a(), c0538d);
            return;
        }
        this.f5684I.m2375a();
    }

    public void m4368a(C0538d[] c0538dArr) {
        this.f5691P = c0538dArr;
        invalidate();
    }

    protected abstract float[] m4369a(C0505h c0505h, int i);

    public String m4370b(int i) {
        return (this.f5703v == null || this.f5703v.m4481k() <= i) ? null : (String) this.f5703v.m4479i().get(i);
    }

    protected abstract void m4371b();

    protected void m4372b(Canvas canvas) {
        if (!this.f5707z.equals("")) {
            if (this.f5701g == null) {
                canvas.drawText(this.f5707z, (((float) getWidth()) - this.f5687L.m4725b()) - 10.0f, (((float) getHeight()) - this.f5687L.m4731d()) - 10.0f, this.f5705x);
            } else {
                canvas.drawText(this.f5707z, this.f5701g.x, this.f5701g.y, this.f5705x);
            }
        }
    }

    protected void m4373c(float f, float f2) {
        float max = (this.f5703v == null || this.f5703v.m4481k() < 2) ? Math.max(Math.abs(f), Math.abs(f2)) : Math.abs(f2 - f);
        this.f5704w = new C0537b(C0544j.m4715b(max));
    }

    protected void m4374c(Canvas canvas) {
        if (this.f5693R != null && this.f5692Q && m4377u()) {
            for (int i = 0; i < this.f5691P.length; i++) {
                int b = this.f5691P[i].m4687b();
                int a = this.f5691P[i].m4685a();
                if (((float) b) <= this.f5678C && ((float) b) <= this.f5678C * this.f5688M.m4255b()) {
                    C0505h a2 = this.f5703v.m4464a(this.f5691P[i]);
                    if (a2 != null) {
                        float[] a3 = m4369a(a2, a);
                        if (this.f5687L.m4728b(a3[0], a3[1])) {
                            this.f5693R.m4335a(a2, a);
                            this.f5693R.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
                            this.f5693R.layout(0, 0, this.f5693R.getMeasuredWidth(), this.f5693R.getMeasuredHeight());
                            if (a3[1] - ((float) this.f5693R.getHeight()) <= 0.0f) {
                                this.f5693R.m4334a(canvas, a3[0], (((float) this.f5693R.getHeight()) - a3[1]) + a3[1]);
                            } else {
                                this.f5693R.m4334a(canvas, a3[0], a3[1]);
                            }
                        }
                    }
                }
            }
        }
    }

    public C0468a getAnimator() {
        return this.f5688M;
    }

    public float getAverage() {
        return getYValueSum() / ((float) this.f5703v.m4478h());
    }

    public PointF getCenter() {
        return new PointF(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
    }

    public PointF getCenterOfView() {
        return getCenter();
    }

    public PointF getCenterOffsets() {
        return this.f5687L.m4745l();
    }

    public Bitmap getChartBitmap() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return createBitmap;
    }

    public RectF getContentRect() {
        return this.f5687L.m4744k();
    }

    public T getData() {
        return this.f5703v;
    }

    public C0536k getDefaultValueFormatter() {
        return this.f5704w;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.f5696b;
    }

    public C0538d[] getHighlighted() {
        return this.f5691P;
    }

    public ArrayList<Runnable> getJobs() {
        return this.f5694S;
    }

    public C0476c getLegend() {
        return this.f5683H;
    }

    public C0524e getLegendRenderer() {
        return this.f5685J;
    }

    public C0482i getMarkerView() {
        return this.f5693R;
    }

    public C0515b getOnChartGestureListener() {
        return this.f5698d;
    }

    public C0521c getRenderer() {
        return this.f5686K;
    }

    public int getValueCount() {
        return this.f5703v.m4478h();
    }

    public C0545l getViewPortHandler() {
        return this.f5687L;
    }

    public float getXChartMax() {
        return this.f5680E;
    }

    public float getXChartMin() {
        return this.f5679D;
    }

    public int getXValCount() {
        return this.f5703v.m4481k();
    }

    public float getYMax() {
        return this.f5703v.m4475e();
    }

    public float getYMin() {
        return this.f5703v.m4473d();
    }

    public float getYValueSum() {
        return this.f5703v.m4477g();
    }

    public abstract void m4375i();

    protected abstract void m4376j();

    protected void onDraw(Canvas canvas) {
        if (this.f5676A || this.f5703v == null || this.f5703v.m4478h() <= 0) {
            canvas.drawText(this.f5697c, (float) (getWidth() / 2), (float) (getHeight() / 2), this.f5706y);
            if (!TextUtils.isEmpty(this.f5699e)) {
                canvas.drawText(this.f5699e, (float) (getWidth() / 2), ((-this.f5706y.ascent()) + this.f5706y.descent()) + ((float) (getHeight() / 2)), this.f5706y);
            }
        } else if (!this.f5700f) {
            m4376j();
            this.f5700f = true;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.f5702u) {
            Log.i("MPAndroidChart", "OnSizeChanged()");
        }
        if (i > 0 && i2 > 0 && i < 10000 && i2 < 10000) {
            if (this.f5689N != null) {
                this.f5689N.recycle();
            }
            this.f5689N = Bitmap.createBitmap(i, i2, Config.ARGB_4444);
            this.f5687L.m4722a((float) i, (float) i2);
            if (this.f5702u) {
                Log.i("MPAndroidChart", "Setting chart dimens, width: " + i + ", height: " + i2);
            }
            Iterator it = this.f5694S.iterator();
            while (it.hasNext()) {
                post((Runnable) it.next());
            }
            this.f5694S.clear();
        }
        m4375i();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setData(T t) {
        if (t == null) {
            Log.e("MPAndroidChart", "Cannot set data for chart. Provided data object is null.");
            return;
        }
        this.f5676A = false;
        this.f5700f = false;
        this.f5703v = t;
        m4373c(t.m4473d(), t.m4475e());
        for (C0502g c0502g : this.f5703v.m4480j()) {
            if (c0502g.m4514x()) {
                c0502g.m4490a(this.f5704w);
            }
        }
        m4375i();
        if (this.f5702u) {
            Log.i("MPAndroidChart", "Data is set.");
        }
    }

    public void setDescription(String str) {
        if (str == null) {
            str = "";
        }
        this.f5707z = str;
    }

    public void setDescriptionColor(int i) {
        this.f5705x.setColor(i);
    }

    public void setDescriptionTextSize(float f) {
        float f2 = 16.0f;
        float f3 = 6.0f;
        if (f <= 16.0f) {
            f2 = f;
        }
        if (f2 >= 6.0f) {
            f3 = f2;
        }
        this.f5705x.setTextSize(C0544j.m4703a(f3));
    }

    public void setDescriptionTypeface(Typeface typeface) {
        this.f5705x.setTypeface(typeface);
    }

    public void setDragDecelerationEnabled(boolean z) {
        this.f5695a = z;
    }

    public void setDragDecelerationFrictionCoef(float f) {
        float f2 = 0.0f;
        if (f >= 0.0f) {
            f2 = f;
        }
        if (f2 >= 1.0f) {
            f2 = 0.999f;
        }
        this.f5696b = f2;
    }

    public void setDrawMarkerViews(boolean z) {
        this.f5692Q = z;
    }

    public void setHardwareAccelerationEnabled(boolean z) {
        if (VERSION.SDK_INT < 11) {
            Log.e("MPAndroidChart", "Cannot enable/disable hardware acceleration for devices below API level 11.");
        } else if (z) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setHighlightEnabled(boolean z) {
        this.f5682G = z;
    }

    public void setLogEnabled(boolean z) {
        this.f5702u = z;
    }

    public void setMarkerView(C0482i c0482i) {
        this.f5693R = c0482i;
    }

    public void setNoDataText(String str) {
        this.f5697c = str;
    }

    public void setNoDataTextDescription(String str) {
        this.f5699e = str;
    }

    public void setOnChartGestureListener(C0515b c0515b) {
        this.f5698d = c0515b;
    }

    public void setOnChartValueSelectedListener(C0393c c0393c) {
        this.f5684I = c0393c;
    }

    public void setRenderer(C0521c c0521c) {
        if (c0521c != null) {
            this.f5686K = c0521c;
        }
    }

    public void setTouchEnabled(boolean z) {
        this.f5681F = z;
    }

    public boolean m4377u() {
        return (this.f5691P == null || this.f5691P.length <= 0 || this.f5691P[0] == null) ? false : true;
    }

    public boolean m4378v() {
        return this.f5695a;
    }

    public boolean m4379w() {
        return this.f5702u;
    }

    public void m4380x() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void m4381y() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }
}
