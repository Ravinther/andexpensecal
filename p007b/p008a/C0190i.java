package p007b.p008a;

/* renamed from: b.a.i */
public class C0190i {
    public static final C0190i f1168a;
    public static final C0190i f1169b;
    public static final C0190i f1170c;
    public static final C0190i f1171d;
    public static final C0190i f1172e;
    public static final C0190i f1173f;
    public static final C0190i f1174g;
    public static final C0190i f1175h;
    public static final C0190i f1176i;
    public static final C0190i f1177j;
    public static final C0190i f1178k;
    public static final C0190i f1179l;
    public static final C0190i f1180m;
    public static final C0190i f1181n;
    private static C0190i[] f1182q;
    private String f1183o;
    private int f1184p;

    static {
        f1182q = new C0190i[0];
        f1168a = new C0190i("Consolidate_Area", 0);
        f1169b = new C0190i("Auto_Open", 1);
        f1170c = new C0190i("Auto_Open", 2);
        f1171d = new C0190i("Extract", 3);
        f1172e = new C0190i("Database", 4);
        f1173f = new C0190i("Criteria", 5);
        f1174g = new C0190i("Print_Area", 6);
        f1175h = new C0190i("Print_Titles", 7);
        f1176i = new C0190i("Recorder", 8);
        f1177j = new C0190i("Data_Form", 9);
        f1178k = new C0190i("Auto_Activate", 10);
        f1179l = new C0190i("Auto_Deactivate", 11);
        f1180m = new C0190i("Sheet_Title", 11);
        f1181n = new C0190i("_FilterDatabase", 13);
    }

    private C0190i(String str, int i) {
        this.f1183o = str;
        this.f1184p = i;
        Object obj = f1182q;
        f1182q = new C0190i[(obj.length + 1)];
        System.arraycopy(obj, 0, f1182q, 0, obj.length);
        f1182q[obj.length] = this;
    }

    public int m1444a() {
        return this.f1184p;
    }
}
