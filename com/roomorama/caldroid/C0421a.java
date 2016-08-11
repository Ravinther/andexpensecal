package com.roomorama.caldroid;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.C0032l;
import android.support.v4.app.C0033k;
import android.support.v4.view.C0022y;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import com.antonyt.infiniteviewpager.C0344a;
import com.antonyt.infiniteviewpager.InfiniteViewPager;
import com.p028a.C0342d;
import com.p028a.C0343e;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import p000a.p001a.C0000a;
import p000a.p001a.C0001b;

@SuppressLint({"DefaultLocale"})
/* renamed from: com.roomorama.caldroid.a */
public class C0421a extends C0033k {
    public static int ak;
    public static int al;
    public static int am;
    public static int an;
    public static int ao;
    public static int ap;
    public static int aq;
    public static int ar;
    public static int as;
    public static int at;
    public static int au;
    protected C0000a aA;
    protected C0000a aB;
    protected ArrayList<C0000a> aC;
    protected HashMap<String, Object> aD;
    protected HashMap<String, Object> aE;
    protected HashMap<C0000a, Integer> aF;
    protected HashMap<C0000a, Integer> aG;
    protected int aH;
    protected ArrayList<C0419g> aI;
    protected boolean aJ;
    protected boolean aK;
    protected boolean aL;
    private Time aM;
    private final StringBuilder aN;
    private Formatter aO;
    private Button aP;
    private Button aQ;
    private TextView aR;
    private GridView aS;
    private InfiniteViewPager aT;
    private C0789f aU;
    private ArrayList<C0791j> aV;
    private boolean aW;
    private OnItemClickListener aX;
    private OnItemLongClickListener aY;
    private C0411h aZ;
    public String aj;
    protected String av;
    protected int aw;
    protected int ax;
    protected ArrayList<C0000a> ay;
    protected ArrayList<C0000a> az;

    static {
        ak = 1;
        al = 2;
        am = 3;
        an = 4;
        ao = 5;
        ap = 6;
        aq = 7;
        ar = -1;
        as = -16777216;
        at = -1;
        au = -7829368;
    }

    public C0421a() {
        this.aj = "CaldroidFragment";
        this.aM = new Time();
        this.aN = new StringBuilder(50);
        this.aO = new Formatter(this.aN, Locale.getDefault());
        this.aw = -1;
        this.ax = -1;
        this.ay = new ArrayList();
        this.az = new ArrayList();
        this.aD = new HashMap();
        this.aE = new HashMap();
        this.aF = new HashMap();
        this.aG = new HashMap();
        this.aH = ak;
        this.aW = true;
        this.aI = new ArrayList();
        this.aJ = true;
        this.aK = true;
        this.aL = false;
    }

    private OnItemClickListener m3985X() {
        if (this.aX == null) {
            this.aX = new C0785b(this);
        }
        return this.aX;
    }

    private OnItemLongClickListener m3986Y() {
        if (this.aY == null) {
            this.aY = new C0786c(this);
        }
        return this.aY;
    }

    private void m3988b(View view) {
        C0000a c0000a = new C0000a(Integer.valueOf(this.ax), Integer.valueOf(this.aw), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0));
        this.aU = new C0789f(this);
        this.aU.m7153a(c0000a);
        C0419g a = m4001a(c0000a.m27b().intValue(), c0000a.m21a().intValue());
        this.aC = a.m3977a();
        C0000a a2 = c0000a.m20a(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), C0001b.LastDay);
        C0419g a3 = m4001a(a2.m27b().intValue(), a2.m21a().intValue());
        a2 = a2.m20a(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), C0001b.LastDay);
        C0419g a4 = m4001a(a2.m27b().intValue(), a2.m21a().intValue());
        c0000a = c0000a.m26b(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), C0001b.LastDay);
        C0419g a5 = m4001a(c0000a.m27b().intValue(), c0000a.m21a().intValue());
        this.aI.add(a);
        this.aI.add(a3);
        this.aI.add(a4);
        this.aI.add(a5);
        this.aU.m7154a(this.aI);
        this.aT = (InfiniteViewPager) view.findViewById(C0342d.months_infinite_pager);
        this.aT.setEnabled(this.aJ);
        this.aT.setSixWeeksInCalendar(this.aW);
        this.aT.setDatesInMonth(this.aC);
        C0022y c0792k = new C0792k(m321l());
        this.aV = c0792k.m7170d();
        for (int i = 0; i < 4; i++) {
            C0791j c0791j = (C0791j) this.aV.get(i);
            c0791j.m7167a((C0419g) this.aI.get(i));
            c0791j.m7165a(m3985X());
            c0791j.m7166a(m3986Y());
        }
        this.aT.setAdapter(new C0344a(c0792k));
        this.aT.setOnPageChangeListener(this.aU);
    }

    public C0793l m3989M() {
        return new C0793l(m315i(), 17367043, m3999W());
    }

    public Button m3990N() {
        return this.aP;
    }

    public HashMap<String, Object> m3991O() {
        this.aD.clear();
        this.aD.put("disableDates", this.ay);
        this.aD.put("selectedDates", this.az);
        this.aD.put("_minDateTime", this.aA);
        this.aD.put("_maxDateTime", this.aB);
        this.aD.put("startDayOfWeek", Integer.valueOf(this.aH));
        this.aD.put("sixWeeksInCalendar", Boolean.valueOf(this.aW));
        this.aD.put("_backgroundForDateTimeMap", this.aF);
        this.aD.put("_textColorForDateTimeMap", this.aG);
        return this.aD;
    }

    public HashMap<String, Object> m3992P() {
        return this.aE;
    }

    public Bundle m3993Q() {
        Bundle bundle = new Bundle();
        bundle.putInt("month", this.aw);
        bundle.putInt("year", this.ax);
        if (this.av != null) {
            bundle.putString("dialogTitle", this.av);
        }
        if (this.az != null && this.az.size() > 0) {
            bundle.putStringArrayList("selectedDates", C0790i.m7160a(this.az));
        }
        if (this.ay != null && this.ay.size() > 0) {
            bundle.putStringArrayList("disableDates", C0790i.m7160a(this.ay));
        }
        if (this.aA != null) {
            bundle.putString("minDate", this.aA.m22a("YYYY-MM-DD"));
        }
        if (this.aB != null) {
            bundle.putString("maxDate", this.aB.m22a("YYYY-MM-DD"));
        }
        bundle.putBoolean("showNavigationArrows", this.aK);
        bundle.putBoolean("enableSwipe", this.aJ);
        bundle.putInt("startDayOfWeek", this.aH);
        bundle.putBoolean("sixWeeksInCalendar", this.aW);
        return bundle;
    }

    public void m3994R() {
        this.aT.setCurrentItem(this.aU.m7150a() - 1);
    }

    public void m3995S() {
        this.aT.setCurrentItem(this.aU.m7150a() + 1);
    }

    protected void m3996T() {
        this.aM.year = this.ax;
        this.aM.month = this.aw - 1;
        this.aM.monthDay = 1;
        long toMillis = this.aM.toMillis(true);
        this.aN.setLength(0);
        this.aR.setText(DateUtils.formatDateRange(m315i(), this.aO, toMillis, toMillis, 52).toString());
    }

    public void m3997U() {
        if (this.aw != -1 && this.ax != -1) {
            m3996T();
            Iterator it = this.aI.iterator();
            while (it.hasNext()) {
                C0419g c0419g = (C0419g) it.next();
                c0419g.m3981a(m3991O());
                c0419g.m3983b(this.aE);
                c0419g.m3982b();
                c0419g.notifyDataSetChanged();
            }
        }
    }

    protected void m3998V() {
        Bundle h = m313h();
        if (h != null) {
            Iterator it;
            this.aw = h.getInt("month", -1);
            this.ax = h.getInt("year", -1);
            this.av = h.getString("dialogTitle");
            Dialog a = m336a();
            if (a != null) {
                if (this.av != null) {
                    a.setTitle(this.av);
                } else {
                    a.requestWindowFeature(1);
                }
            }
            this.aH = h.getInt("startDayOfWeek", 1);
            if (this.aH > 7) {
                this.aH %= 7;
            }
            this.aK = h.getBoolean("showNavigationArrows", true);
            this.aJ = h.getBoolean("enableSwipe", true);
            this.aW = h.getBoolean("sixWeeksInCalendar", true);
            this.aL = h.getBoolean("enableClickOnDisabledDates", false);
            ArrayList stringArrayList = h.getStringArrayList("disableDates");
            if (stringArrayList != null && stringArrayList.size() > 0) {
                this.ay.clear();
                it = stringArrayList.iterator();
                while (it.hasNext()) {
                    this.ay.add(C0790i.m7163b((String) it.next(), "yyyy-MM-dd"));
                }
            }
            stringArrayList = h.getStringArrayList("selectedDates");
            if (stringArrayList != null && stringArrayList.size() > 0) {
                this.az.clear();
                it = stringArrayList.iterator();
                while (it.hasNext()) {
                    this.az.add(C0790i.m7163b((String) it.next(), "yyyy-MM-dd"));
                }
            }
            String string = h.getString("minDate");
            if (string != null) {
                this.aA = C0790i.m7163b(string, null);
            }
            string = h.getString("maxDate");
            if (string != null) {
                this.aB = C0790i.m7163b(string, null);
            }
        }
        if (this.aw == -1 || this.ax == -1) {
            C0000a b = C0000a.m8b(TimeZone.getDefault());
            this.aw = b.m27b().intValue();
            this.ax = b.m21a().intValue();
        }
    }

    protected ArrayList<String> m3999W() {
        ArrayList<String> arrayList = new ArrayList();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE", Locale.getDefault());
        C0000a a = new C0000a(Integer.valueOf(2013), Integer.valueOf(2), Integer.valueOf(17), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0)).m19a(Integer.valueOf(this.aH - ak));
        for (int i = 0; i < 7; i++) {
            arrayList.add(simpleDateFormat.format(C0790i.m7161a(a)).toUpperCase());
            a = a.m19a(Integer.valueOf(1));
        }
        return arrayList;
    }

    public View m4000a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m3998V();
        if (m336a() != null) {
            m297c(true);
        }
        View inflate = layoutInflater.inflate(C0343e.calendar_view, viewGroup, false);
        this.aR = (TextView) inflate.findViewById(C0342d.calendar_month_year_textview);
        this.aP = (Button) inflate.findViewById(C0342d.calendar_left_arrow);
        this.aQ = (Button) inflate.findViewById(C0342d.calendar_right_arrow);
        this.aP.setOnClickListener(new C0787d(this));
        this.aQ.setOnClickListener(new C0788e(this));
        m4008g(this.aK);
        this.aS = (GridView) inflate.findViewById(C0342d.weekday_gridview);
        this.aS.setAdapter(m3989M());
        m3988b(inflate);
        m3997U();
        if (this.aZ != null) {
            this.aZ.m3968a();
        }
        return inflate;
    }

    public C0419g m4001a(int i, int i2) {
        return new C0419g(m315i(), i, i2, m3991O(), this.aE);
    }

    public void m4002a(C0000a c0000a) {
        this.aw = c0000a.m27b().intValue();
        this.ax = c0000a.m21a().intValue();
        if (this.aZ != null) {
            this.aZ.m3969a(this.aw, this.ax);
        }
        m3997U();
    }

    public void m4003a(Bundle bundle, String str) {
        bundle.putBundle(str, m3993Q());
    }

    public void m4004a(C0411h c0411h) {
        this.aZ = c0411h;
    }

    public void m4005b(Bundle bundle, String str) {
        if (bundle != null && bundle.containsKey(str)) {
            m311g(bundle.getBundle(str));
        }
    }

    public void m4006c() {
        super.m343c();
        try {
            Field declaredField = C0032l.class.getDeclaredField("E");
            declaredField.setAccessible(true);
            declaredField.set(this, null);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    public void m4007f() {
        if (m336a() != null && m324o()) {
            m336a().setDismissMessage(null);
        }
        super.m348f();
    }

    public void m4008g(boolean z) {
        this.aK = z;
        if (z) {
            this.aP.setVisibility(0);
            this.aQ.setVisibility(0);
            return;
        }
        this.aP.setVisibility(4);
        this.aQ.setVisibility(4);
    }
}
