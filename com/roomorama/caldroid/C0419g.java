package com.roomorama.caldroid;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.p028a.C0340b;
import com.p028a.C0341c;
import com.p028a.C0343e;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import p000a.p001a.C0000a;

/* renamed from: com.roomorama.caldroid.g */
public class C0419g extends BaseAdapter {
    protected ArrayList<C0000a> f4380f;
    protected int f4381g;
    protected int f4382h;
    protected Context f4383i;
    protected ArrayList<C0000a> f4384j;
    protected ArrayList<C0000a> f4385k;
    protected HashMap<C0000a, Integer> f4386l;
    protected HashMap<C0000a, Integer> f4387m;
    protected C0000a f4388n;
    protected C0000a f4389o;
    protected C0000a f4390p;
    protected int f4391q;
    protected boolean f4392r;
    protected Resources f4393s;
    protected HashMap<String, Object> f4394t;
    protected HashMap<String, Object> f4395u;

    public C0419g(Context context, int i, int i2, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        this.f4386l = new HashMap();
        this.f4387m = new HashMap();
        this.f4381g = i;
        this.f4382h = i2;
        this.f4383i = context;
        this.f4394t = hashMap;
        this.f4395u = hashMap2;
        this.f4393s = context.getResources();
        m3976d();
    }

    private void m3976d() {
        Iterator it;
        this.f4384j = (ArrayList) this.f4394t.get("disableDates");
        if (this.f4384j != null) {
            this.f4386l.clear();
            it = this.f4384j.iterator();
            while (it.hasNext()) {
                this.f4386l.put((C0000a) it.next(), Integer.valueOf(1));
            }
        }
        this.f4385k = (ArrayList) this.f4394t.get("selectedDates");
        if (this.f4385k != null) {
            this.f4387m.clear();
            it = this.f4385k.iterator();
            while (it.hasNext()) {
                this.f4387m.put((C0000a) it.next(), Integer.valueOf(1));
            }
        }
        this.f4388n = (C0000a) this.f4394t.get("_minDateTime");
        this.f4389o = (C0000a) this.f4394t.get("_maxDateTime");
        this.f4391q = ((Integer) this.f4394t.get("startDayOfWeek")).intValue();
        this.f4392r = ((Boolean) this.f4394t.get("sixWeeksInCalendar")).booleanValue();
        this.f4380f = C0790i.m7159a(this.f4381g, this.f4382h, this.f4391q, this.f4392r);
    }

    public ArrayList<C0000a> m3977a() {
        return this.f4380f;
    }

    protected void m3978a(int i, TextView textView) {
        Object obj;
        Object obj2 = null;
        textView.setTextColor(-16777216);
        C0000a c0000a = (C0000a) this.f4380f.get(i);
        if (c0000a.m27b().intValue() != this.f4381g) {
            textView.setTextColor(this.f4393s.getColor(C0340b.caldroid_darker_gray));
        }
        if ((this.f4388n == null || !c0000a.m23a(this.f4388n)) && ((this.f4389o == null || !c0000a.m28b(this.f4389o)) && (this.f4384j == null || !this.f4386l.containsKey(c0000a)))) {
            int i2 = 1;
        } else {
            textView.setTextColor(C0421a.au);
            if (C0421a.at == -1) {
                textView.setBackgroundResource(C0341c.disable_cell);
            } else {
                textView.setBackgroundResource(C0421a.at);
            }
            if (c0000a.equals(m3984c())) {
                textView.setBackgroundResource(C0341c.red_border_gray_bg);
                obj = null;
            } else {
                obj = null;
            }
        }
        if (this.f4385k == null || !this.f4387m.containsKey(c0000a)) {
            int i3 = 1;
        } else {
            if (C0421a.ar != -1) {
                textView.setBackgroundResource(C0421a.ar);
            } else {
                textView.setBackgroundColor(this.f4393s.getColor(C0340b.caldroid_sky_blue));
            }
            textView.setTextColor(C0421a.as);
        }
        if (!(obj == null || r3 == null)) {
            if (c0000a.equals(m3984c())) {
                textView.setBackgroundResource(C0341c.red_border);
            } else {
                textView.setBackgroundResource(C0341c.cell_bg);
            }
        }
        textView.setText("" + c0000a.m31c());
        m3980a(c0000a, textView, textView);
    }

    public void m3979a(C0000a c0000a) {
        this.f4381g = c0000a.m27b().intValue();
        this.f4382h = c0000a.m21a().intValue();
        this.f4380f = C0790i.m7159a(this.f4381g, this.f4382h, this.f4391q, this.f4392r);
    }

    protected void m3980a(C0000a c0000a, View view, TextView textView) {
        Integer num;
        HashMap hashMap = (HashMap) this.f4394t.get("_backgroundForDateTimeMap");
        if (hashMap != null) {
            num = (Integer) hashMap.get(c0000a);
            if (num != null) {
                view.setBackgroundResource(num.intValue());
            }
        }
        hashMap = (HashMap) this.f4394t.get("_textColorForDateTimeMap");
        if (hashMap != null) {
            num = (Integer) hashMap.get(c0000a);
            if (num != null) {
                textView.setTextColor(this.f4393s.getColor(num.intValue()));
            }
        }
    }

    public void m3981a(HashMap<String, Object> hashMap) {
        this.f4394t = hashMap;
        m3976d();
    }

    public void m3982b() {
        this.f4390p = C0790i.m7158a(new Date());
    }

    public void m3983b(HashMap<String, Object> hashMap) {
        this.f4395u = hashMap;
    }

    protected C0000a m3984c() {
        if (this.f4390p == null) {
            this.f4390p = C0790i.m7158a(new Date());
        }
        return this.f4390p;
    }

    public int getCount() {
        return this.f4380f.size();
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = view == null ? (TextView) ((LayoutInflater) this.f4383i.getSystemService("layout_inflater")).inflate(C0343e.date_cell, null) : (TextView) view;
        m3978a(i, view2);
        return view2;
    }
}
