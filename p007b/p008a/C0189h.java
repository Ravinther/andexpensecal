package p007b.p008a;

import p007b.p011c.C0153g;

/* renamed from: b.a.h */
final class C0189h implements ab, C0153g {
    public static C0189h[] f1165a;
    private String f1166b;
    private int f1167c;

    static {
        f1165a = new C0189h[50];
        f1165a[0] = new C0189h("", 0);
        f1165a[1] = new C0189h("0", 1);
        f1165a[2] = new C0189h("0.00", 2);
        f1165a[3] = new C0189h("#,##0", 3);
        f1165a[4] = new C0189h("#,##0.00", 4);
        f1165a[5] = new C0189h("($#,##0_);($#,##0)", 5);
        f1165a[6] = new C0189h("($#,##0_);[Red]($#,##0)", 6);
        f1165a[7] = new C0189h("($#,##0_);[Red]($#,##0)", 7);
        f1165a[8] = new C0189h("($#,##0.00_);[Red]($#,##0.00)", 8);
        f1165a[9] = new C0189h("0%", 9);
        f1165a[10] = new C0189h("0.00%", 10);
        f1165a[11] = new C0189h("0.00E+00", 11);
        f1165a[12] = new C0189h("# ?/?", 12);
        f1165a[13] = new C0189h("# ??/??", 13);
        f1165a[14] = new C0189h("dd/mm/yyyy", 14);
        f1165a[15] = new C0189h("d-mmm-yy", 15);
        f1165a[16] = new C0189h("d-mmm", 16);
        f1165a[17] = new C0189h("mmm-yy", 17);
        f1165a[18] = new C0189h("h:mm AM/PM", 18);
        f1165a[19] = new C0189h("h:mm:ss AM/PM", 19);
        f1165a[20] = new C0189h("h:mm", 20);
        f1165a[21] = new C0189h("h:mm:ss", 21);
        f1165a[22] = new C0189h("m/d/yy h:mm", 22);
        f1165a[37] = new C0189h("(#,##0_);(#,##0)", 37);
        f1165a[38] = new C0189h("(#,##0_);[Red](#,##0)", 38);
        f1165a[39] = new C0189h("(#,##0.00_);(#,##0.00)", 39);
        f1165a[40] = new C0189h("(#,##0.00_);[Red](#,##0.00)", 40);
        f1165a[41] = new C0189h("_(*#,##0_);_(*(#,##0);_(*\"-\"_);(@_)", 41);
        f1165a[42] = new C0189h("_($*#,##0_);_($*(#,##0);_($*\"-\"_);(@_)", 42);
        f1165a[43] = new C0189h("_(* #,##0.00_);_(* (#,##0.00);_(* \"-\"??_);(@_)", 43);
        f1165a[44] = new C0189h("_($* #,##0.00_);_($* (#,##0.00);_($* \"-\"??_);(@_)", 44);
        f1165a[45] = new C0189h("mm:ss", 45);
        f1165a[46] = new C0189h("[h]mm:ss", 46);
        f1165a[47] = new C0189h("mm:ss.0", 47);
        f1165a[48] = new C0189h("##0.0E+0", 48);
        f1165a[49] = new C0189h("@", 49);
    }

    private C0189h(String str, int i) {
        this.f1167c = i;
        this.f1166b = str;
    }

    public void m1442a(int i) {
    }

    public int a_() {
        return this.f1167c;
    }

    public boolean b_() {
        return true;
    }

    public boolean m1443c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0189h)) {
            return false;
        }
        return this.f1167c == ((C0189h) obj).f1167c;
    }
}
