package p018c.p025b.p026a;

import com.expensemanager.adv;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.Map;
import p018c.p025b.p026a.p027a.C0331b;

/* renamed from: c.b.a.d */
public class C0338d {
    public static Object m2263a(Reader reader) {
        try {
            return new C0331b().m2241b(reader);
        } catch (Exception e) {
            return null;
        }
    }

    public static Object m2264a(String str) {
        return C0338d.m2263a(new StringReader(str));
    }

    public static String m2265a(Object obj) {
        return obj == null ? "null" : obj instanceof String ? new StringBuffer().append("\"").append(C0338d.m2267b((String) obj)).append("\"").toString() : obj instanceof Double ? (((Double) obj).isInfinite() || ((Double) obj).isNaN()) ? "null" : obj.toString() : obj instanceof Float ? (((Float) obj).isInfinite() || ((Float) obj).isNaN()) ? "null" : obj.toString() : obj instanceof Number ? obj.toString() : obj instanceof Boolean ? obj.toString() : obj instanceof C0335b ? ((C0335b) obj).m2257a() : obj instanceof Map ? C0337c.m2261a((Map) obj) : obj instanceof List ? C0336a.m2258a((List) obj) : obj.toString();
    }

    static void m2266a(String str, StringBuffer stringBuffer) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                    stringBuffer.append("\\b");
                    break;
                case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                    stringBuffer.append("\\t");
                    break;
                case adv.TitlePageIndicator_footerPadding /*10*/:
                    stringBuffer.append("\\n");
                    break;
                case adv.TitlePageIndicator_selectedBold /*12*/:
                    stringBuffer.append("\\f");
                    break;
                case adv.TitlePageIndicator_titlePadding /*13*/:
                    stringBuffer.append("\\r");
                    break;
                case '\"':
                    stringBuffer.append("\\\"");
                    break;
                case '/':
                    stringBuffer.append("\\/");
                    break;
                case '\\':
                    stringBuffer.append("\\\\");
                    break;
                default:
                    if ((charAt >= '\u0000' && charAt <= '\u001f') || ((charAt >= '\u007f' && charAt <= '\u009f') || (charAt >= '\u2000' && charAt <= '\u20ff'))) {
                        String toHexString = Integer.toHexString(charAt);
                        stringBuffer.append("\\u");
                        for (int i2 = 0; i2 < 4 - toHexString.length(); i2++) {
                            stringBuffer.append('0');
                        }
                        stringBuffer.append(toHexString.toUpperCase());
                        break;
                    }
                    stringBuffer.append(charAt);
                    break;
            }
        }
    }

    public static String m2267b(String str) {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        C0338d.m2266a(str, stringBuffer);
        return stringBuffer.toString();
    }
}
