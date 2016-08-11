package p018c.p025b.p026a.p027a;

import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.search.SearchAdRequest;

/* renamed from: c.b.a.a.e */
public class C0334e {
    public int f2320a;
    public Object f2321b;

    public C0334e(int i, Object obj) {
        this.f2320a = 0;
        this.f2321b = null;
        this.f2320a = i;
        this.f2321b = obj;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.f2320a) {
            case MediationAdRequest.TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED /*-1*/:
                stringBuffer.append("END OF FILE");
                break;
            case C0607c.AdsAttrs_adSize /*0*/:
                stringBuffer.append("VALUE(").append(this.f2321b).append(")");
                break;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                stringBuffer.append("LEFT BRACE({)");
                break;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                stringBuffer.append("RIGHT BRACE(})");
                break;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                stringBuffer.append("LEFT SQUARE([)");
                break;
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                stringBuffer.append("RIGHT SQUARE(])");
                break;
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                stringBuffer.append("COMMA(,)");
                break;
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                stringBuffer.append("COLON(:)");
                break;
        }
        return stringBuffer.toString();
    }
}
