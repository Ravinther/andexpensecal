package p007b.p008a.p012b;

import java.util.HashMap;

/* renamed from: b.a.b.bi */
class bi {
    public static final bi f881A;
    public static final bi f882B;
    public static final bi f883C;
    public static final bi f884D;
    public static final bi f885E;
    public static final bi f886F;
    public static final bi f887G;
    public static final bi f888H;
    public static final bi f889I;
    public static final bi f890J;
    public static final bi f891K;
    public static final bi f892L;
    public static final bi f893M;
    public static final bi f894N;
    private static HashMap f895O;
    public static final bi f896b;
    public static final bi f897c;
    public static final bi f898d;
    public static final bi f899e;
    public static final bi f900f;
    public static final bi f901g;
    public static final bi f902h;
    public static final bi f903i;
    public static final bi f904j;
    public static final bi f905k;
    public static final bi f906l;
    public static final bi f907m;
    public static final bi f908n;
    public static final bi f909o;
    public static final bi f910p;
    public static final bi f911q;
    public static final bi f912r;
    public static final bi f913s;
    public static final bi f914t;
    public static final bi f915u;
    public static final bi f916v;
    public static final bi f917w;
    public static final bi f918x;
    public static final bi f919y;
    public static final bi f920z;
    public final int[] f921a;

    static {
        f895O = new HashMap(20);
        f896b = new bi(68, 36, 100);
        f897c = new bi(90, 58, 122);
        f898d = new bi(22);
        f899e = new bi(23);
        f900f = new bi(28);
        f901g = new bi(29);
        f902h = new bi(30);
        f903i = new bi(31);
        f904j = new bi(42, 74, 106);
        f905k = new bi(44, 76, 108);
        f906l = new bi(45, 77, 109);
        f907m = new bi(38, 70, 102);
        f908n = new bi(37, 101, 69);
        f909o = new bi(35, 67, 99);
        f910p = new bi(57, 89);
        f911q = new bi(59, 91);
        f912r = new bi(18);
        f913s = new bi(19);
        f914t = new bi(20);
        f915u = new bi(21);
        f916v = new bi(3);
        f917w = new bi(4);
        f918x = new bi(5);
        f919y = new bi(6);
        f920z = new bi(7);
        f881A = new bi(8);
        f882B = new bi(9);
        f883C = new bi(10);
        f884D = new bi(11);
        f885E = new bi(12);
        f886F = new bi(13);
        f887G = new bi(14);
        f888H = new bi(16);
        f889I = new bi(17);
        f890J = new bi(65, 33, 97);
        f891K = new bi(66, 34, 98);
        f892L = new bi(25);
        f893M = new bi(41, 73, 105);
        f894N = new bi(65535);
    }

    private bi(int i) {
        this.f921a = new int[]{i};
        f895O.put(new Integer(i), this);
    }

    private bi(int i, int i2) {
        this.f921a = new int[]{i, i2};
        f895O.put(new Integer(i), this);
        f895O.put(new Integer(i2), this);
    }

    private bi(int i, int i2, int i3) {
        this.f921a = new int[]{i, i2, i3};
        f895O.put(new Integer(i), this);
        f895O.put(new Integer(i2), this);
        f895O.put(new Integer(i3), this);
    }

    public static bi m1284a(int i) {
        bi biVar = (bi) f895O.get(new Integer(i));
        return biVar != null ? biVar : f894N;
    }

    public byte m1285a() {
        return (byte) this.f921a[0];
    }

    public byte m1286b() {
        return (byte) this.f921a[0];
    }

    public byte m1287c() {
        return (byte) (this.f921a.length > 0 ? this.f921a[1] : this.f921a[0]);
    }

    public byte m1288d() {
        return (byte) (this.f921a.length > 0 ? this.f921a[1] : this.f921a[0]);
    }
}
