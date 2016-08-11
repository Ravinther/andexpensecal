package com.expensemanager.calculator;

import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;

/* renamed from: com.expensemanager.calculator.f */
class C0403f extends Exception {
    private int f4308a;
    private int f4309b;
    private int f4310c;
    private String f4311d;

    C0403f(int i, int i2, int i3) {
        this.f4308a = i;
        this.f4309b = i2;
        this.f4310c = i3;
        this.f4311d = m3904a(this.f4310c);
    }

    C0403f(int i, int i2, int i3, String str) {
        this.f4308a = i;
        this.f4309b = i2;
        this.f4310c = i3;
        this.f4311d = String.format(m3904a(this.f4310c), new Object[]{str});
    }

    C0403f(int i, String str) {
        this.f4308a = -1;
        this.f4309b = -1;
        this.f4310c = i;
        this.f4311d = String.format(m3904a(this.f4310c), new Object[]{str});
    }

    private String m3904a(int i) {
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                return "Syntax error in part \"%s\"";
            case C0607c.LoadingImageView_circleCrop /*2*/:
                return "Syntax error";
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                return "Parentesis ) missing";
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                return "Empty expression";
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                return "Unexpected part \"%s\"";
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                return "Unexpected end of expression";
            case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                return "Value expected";
            case 101:
                return "Unknown operator %s";
            case 102:
                return "Unknown function %s";
            case 103:
                return "Unknown variable %s";
            case 104:
                return "Unknown operator";
            case 200:
                return "Too long expression, maximum number of characters exceeded";
            case 300:
                return "Defining variable failed";
            case 400:
                return "Integer value expected in function %s";
            case 500:
                return "%s";
            default:
                return "Unknown error";
        }
    }
}
