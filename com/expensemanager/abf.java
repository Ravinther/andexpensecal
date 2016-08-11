package com.expensemanager;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class abf {
    public static String f3831a;

    static {
        f3831a = "ca-app-pub-5262108672348053/5883493107";
    }

    public static void m3821a(Activity activity) {
        LinearLayout linearLayout = (LinearLayout) activity.findViewById(2131558897);
        if ("com.expensemanager.pro".equals(activity.getApplicationContext().getPackageName())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        try {
            View adView = new AdView(activity);
            adView.setAdSize(AdSize.BANNER);
            if ((activity.getResources().getConfiguration().screenLayout & 15) >= 3) {
                adView = new AdView(activity);
                adView.setAdSize(AdSize.SMART_BANNER);
                if (activity.getResources().getConfiguration().orientation == 2) {
                    adView = new AdView(activity);
                    adView.setAdSize(AdSize.FULL_BANNER);
                }
            }
            adView.setAdUnitId(f3831a);
            adView.setLayoutParams(new LayoutParams(-1, -2));
            if (linearLayout.getChildCount() > 0) {
                linearLayout.removeAllViews();
            }
            linearLayout.addView(adView);
            adView.loadAd(new Builder().build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static InterstitialAd m3822b(Activity activity) {
        if ("com.expensemanager.pro".equals(activity.getApplicationContext().getPackageName())) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = activity.getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
            String format = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
            if (format.equals(sharedPreferences.getString("InterstitialAdDate", ""))) {
                return null;
            }
            InterstitialAd interstitialAd = new InterstitialAd(activity);
            interstitialAd.setAdUnitId("ca-app-pub-5262108672348053/1084028302");
            interstitialAd.loadAd(new Builder().build());
            Editor edit = sharedPreferences.edit();
            edit.putString("InterstitialAdDate", format);
            edit.commit();
            return interstitialAd;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
