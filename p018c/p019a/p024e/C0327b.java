package p018c.p019a.p024e;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.a.e.b */
public class C0327b {
    private static final NumberFormat f2276a;

    static {
        f2276a = NumberFormat.getNumberInstance();
    }

    private static double m2225a(double d) {
        double d2 = 5.0d;
        int floor = (int) Math.floor(Math.log10(d));
        double pow = Math.pow(10.0d, (double) (-floor)) * d;
        if (pow > 5.0d) {
            d2 = 10.0d;
        } else if (pow <= 2.0d) {
            d2 = pow > 1.0d ? 2.0d : pow;
        }
        return d2 * Math.pow(10.0d, (double) floor);
    }

    public static List<Double> m2226a(double d, double d2, int i) {
        List<Double> arrayList = new ArrayList();
        if (i <= 0) {
            return arrayList;
        }
        f2276a.setMaximumFractionDigits(5);
        double[] b = C0327b.m2227b(d, d2, i);
        int i2 = ((int) ((b[1] - b[0]) / b[2])) + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            double d3 = b[0] + (((double) i3) * b[2]);
            try {
                d3 = f2276a.parse(f2276a.format(d3)).doubleValue();
            } catch (ParseException e) {
            }
            arrayList.add(Double.valueOf(d3));
        }
        return arrayList;
    }

    private static double[] m2227b(double d, double d2, int i) {
        if (Math.abs(d - d2) < 1.0000000116860974E-7d) {
            return new double[]{d, d, 0.0d};
        }
        Object obj = null;
        if (d > d2) {
            obj = 1;
        } else {
            double d3 = d2;
            d2 = d;
            d = d3;
        }
        double a = C0327b.m2225a(Math.abs(d2 - d) / ((double) i));
        double ceil = Math.ceil(d2 / a) * a;
        double floor = Math.floor(d / a) * a;
        if (obj != null) {
            return new double[]{floor, ceil, a * -1.0d};
        }
        return new double[]{ceil, floor, a};
    }
}
