package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;

@id
public class aa {
    private final int f6183a;
    private final int f6184b;
    private final int f6185c;
    private final aj f6186d;
    private final Object f6187e;
    private ArrayList<String> f6188f;
    private int f6189g;
    private int f6190h;
    private int f6191i;
    private int f6192j;
    private String f6193k;

    public aa(int i, int i2, int i3, int i4) {
        this.f6187e = new Object();
        this.f6188f = new ArrayList();
        this.f6189g = 0;
        this.f6190h = 0;
        this.f6191i = 0;
        this.f6193k = "";
        this.f6183a = i;
        this.f6184b = i2;
        this.f6185c = i3;
        this.f6186d = new aj(i4);
    }

    private String m4997a(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append((String) it.next());
            stringBuffer.append(' ');
            if (stringBuffer.length() > i) {
                break;
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        String stringBuffer2 = stringBuffer.toString();
        return stringBuffer2.length() >= i ? stringBuffer2.substring(0, i) : stringBuffer2;
    }

    private void m4998c(String str) {
        if (str != null && str.length() >= this.f6185c) {
            synchronized (this.f6187e) {
                this.f6188f.add(str);
                this.f6189g += str.length();
            }
        }
    }

    int m4999a(int i, int i2) {
        return (this.f6183a * i) + (this.f6184b * i2);
    }

    public void m5000a(int i) {
        this.f6190h = i;
    }

    public void m5001a(String str) {
        m4998c(str);
        synchronized (this.f6187e) {
            if (this.f6191i < 0) {
                ly.m6065a("ActivityContent: negative number of WebViews.");
            }
            m5008f();
        }
    }

    public boolean m5002a() {
        boolean z;
        synchronized (this.f6187e) {
            z = this.f6191i == 0;
        }
        return z;
    }

    public String m5003b() {
        return this.f6193k;
    }

    public void m5004b(String str) {
        m4998c(str);
    }

    public void m5005c() {
        synchronized (this.f6187e) {
            this.f6192j -= 100;
        }
    }

    public void m5006d() {
        synchronized (this.f6187e) {
            this.f6191i--;
        }
    }

    public void m5007e() {
        synchronized (this.f6187e) {
            this.f6191i++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof aa)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        aa aaVar = (aa) obj;
        return aaVar.m5003b() != null && aaVar.m5003b().equals(m5003b());
    }

    public void m5008f() {
        synchronized (this.f6187e) {
            int a = m4999a(this.f6189g, this.f6190h);
            if (a > this.f6192j) {
                this.f6192j = a;
                this.f6193k = this.f6186d.m5035a(this.f6188f);
            }
        }
    }

    public int m5009g() {
        return this.f6192j;
    }

    int m5010h() {
        return this.f6189g;
    }

    public int hashCode() {
        return m5003b().hashCode();
    }

    public String toString() {
        return "ActivityContent fetchId: " + this.f6190h + " score:" + this.f6192j + " total_length:" + this.f6189g + "\n text: " + m4997a(this.f6188f, 200) + "\n signture: " + this.f6193k;
    }
}
