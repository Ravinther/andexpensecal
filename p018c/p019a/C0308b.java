package p018c.p019a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import p018c.p019a.p020a.C0288a;
import p018c.p019a.p020a.C0289n;
import p018c.p019a.p020a.C0295k;
import p018c.p019a.p021b.C0304b;
import p018c.p019a.p021b.C0305c;
import p018c.p019a.p022c.C0310b;
import p018c.p019a.p022c.C0312d;
import p018c.p019a.p023d.C0319b;
import p018c.p019a.p023d.C0322e;

/* renamed from: c.a.b */
public class C0308b extends View {
    private static final int f2126j;
    private C0288a f2127a;
    private C0310b f2128b;
    private Rect f2129c;
    private Handler f2130d;
    private RectF f2131e;
    private Bitmap f2132f;
    private Bitmap f2133g;
    private Bitmap f2134h;
    private int f2135i;
    private C0322e f2136k;
    private C0322e f2137l;
    private C0319b f2138m;
    private Paint f2139n;
    private C0325d f2140o;
    private float f2141p;
    private float f2142q;
    private boolean f2143r;

    static {
        f2126j = Color.argb(175, 150, 150, 150);
    }

    public C0308b(Context context, C0288a c0288a) {
        int intValue;
        super(context);
        this.f2129c = new Rect();
        this.f2131e = new RectF();
        this.f2135i = 50;
        this.f2139n = new Paint();
        this.f2127a = c0288a;
        this.f2130d = new Handler();
        if (this.f2127a instanceof C0289n) {
            this.f2128b = ((C0289n) this.f2127a).m1962c();
        } else {
            this.f2128b = ((C0295k) this.f2127a).m1984a();
        }
        if (this.f2128b.m2108y()) {
            this.f2132f = BitmapFactory.decodeStream(C0308b.class.getResourceAsStream("image/zoom_in.png"));
            this.f2133g = BitmapFactory.decodeStream(C0308b.class.getResourceAsStream("image/zoom_out.png"));
            this.f2134h = BitmapFactory.decodeStream(C0308b.class.getResourceAsStream("image/zoom-1.png"));
        }
        if ((this.f2128b instanceof C0312d) && ((C0312d) this.f2128b).m2144W() == 0) {
            ((C0312d) this.f2128b).m2186r(this.f2139n.getColor());
        }
        if ((this.f2128b.m2107x() && this.f2128b.m2108y()) || this.f2128b.m2109z()) {
            this.f2136k = new C0322e(this.f2127a, true, this.f2128b.m2059A());
            this.f2137l = new C0322e(this.f2127a, false, this.f2128b.m2059A());
            this.f2138m = new C0319b(this.f2127a);
        }
        try {
            intValue = Integer.valueOf(VERSION.SDK).intValue();
        } catch (Exception e) {
            intValue = 7;
        }
        if (intValue < 7) {
            this.f2140o = new C0329f(this, this.f2127a);
        } else {
            this.f2140o = new C0328e(this, this.f2127a);
        }
    }

    public void m2049a() {
        if (this.f2136k != null) {
            this.f2136k.m2217b(0);
            m2052d();
        }
    }

    public void m2050b() {
        if (this.f2137l != null) {
            this.f2137l.m2217b(0);
            m2052d();
        }
    }

    public void m2051c() {
        if (this.f2138m != null) {
            this.f2138m.m2209a();
            this.f2136k.m2215a();
            m2052d();
        }
    }

    public void m2052d() {
        this.f2130d.post(new C0317c(this));
    }

    public Bitmap m2053e() {
        setDrawingCacheEnabled(false);
        if (!isDrawingCacheEnabled()) {
            setDrawingCacheEnabled(true);
        }
        if (this.f2128b.m2087f()) {
            setDrawingCacheBackgroundColor(this.f2128b.m2084e());
        }
        setDrawingCacheQuality(1048576);
        return getDrawingCache(true);
    }

    public C0305c getCurrentSeriesAndPoint() {
        return this.f2127a.m1929a(new C0304b(this.f2141p, this.f2142q));
    }

    protected RectF getZoomRectangle() {
        return this.f2131e;
    }

    protected void onDraw(Canvas canvas) {
        int i = 0;
        super.onDraw(canvas);
        canvas.getClipBounds(this.f2129c);
        int i2 = this.f2129c.top;
        int i3 = this.f2129c.left;
        int width = this.f2129c.width();
        int height = this.f2129c.height();
        if (this.f2128b.m2065G()) {
            width = getMeasuredWidth();
            height = getMeasuredHeight();
            i2 = 0;
        } else {
            i = i3;
        }
        this.f2127a.m1931a(canvas, i, i2, width, height, this.f2139n);
        if (this.f2128b != null && this.f2128b.m2107x() && this.f2128b.m2108y()) {
            this.f2139n.setColor(f2126j);
            this.f2135i = Math.max(this.f2135i, Math.min(width, height) / 7);
            this.f2131e.set((float) ((i + width) - (this.f2135i * 3)), ((float) (i2 + height)) - (((float) this.f2135i) * 0.775f), (float) (i + width), (float) (i2 + height));
            canvas.drawRoundRect(this.f2131e, (float) (this.f2135i / 3), (float) (this.f2135i / 3), this.f2139n);
            float f = ((float) (i2 + height)) - (((float) this.f2135i) * 0.625f);
            canvas.drawBitmap(this.f2132f, ((float) (i + width)) - (((float) this.f2135i) * 2.75f), f, null);
            canvas.drawBitmap(this.f2133g, ((float) (i + width)) - (((float) this.f2135i) * 1.75f), f, null);
            canvas.drawBitmap(this.f2134h, ((float) (i + width)) - (((float) this.f2135i) * 0.75f), f, null);
        }
        this.f2143r = true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2141p = motionEvent.getX();
            this.f2142q = motionEvent.getY();
        }
        return (this.f2128b != null && this.f2143r && ((this.f2128b.m2060B() || this.f2128b.m2107x()) && this.f2140o.m2220a(motionEvent))) ? true : super.onTouchEvent(motionEvent);
    }

    public void setZoomRate(float f) {
        if (this.f2136k != null && this.f2137l != null) {
            this.f2136k.m2216a(f);
            this.f2137l.m2216a(f);
        }
    }
}
