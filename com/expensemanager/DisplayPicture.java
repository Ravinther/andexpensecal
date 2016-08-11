package com.expensemanager;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.TextView;
import com.google.android.gms.C0607c;
import java.io.File;

public class DisplayPicture extends Activity {
    private String f2685a;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setRequestedOrientation(1);
        setContentView(2130903068);
        this.f2685a = getIntent().getStringExtra("image_file");
        String str = "text/html";
        str = "utf-8";
        String str2 = "<p><img HEIGHT='420px' WIDTH='300px' src='file://" + this.f2685a + " '/></p>";
        if ((getResources().getConfiguration().screenLayout & 15) == 4 || (getResources().getConfiguration().screenLayout & 15) == 3) {
            str2 = "<p><img src='file://" + this.f2685a + " '/></p>";
        } else {
            float f = getResources().getDisplayMetrics().density;
            int round = Math.round(((float) getWindowManager().getDefaultDisplay().getHeight()) / f);
            int round2 = Math.round(((float) getWindowManager().getDefaultDisplay().getWidth()) / f);
            if (round > 420 && round2 > 300) {
                str2 = str2.replace("420", "" + (round - 100)).replace("300", "" + (round2 - 20));
            }
        }
        WebView webView = (WebView) findViewById(2131558567);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.clearCache(false);
        webView.loadDataWithBaseURL("fake://not/needed", str2, "text/html", "utf-8", "");
        ((TextView) findViewById(2131558566)).setText(this.f2685a);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 0, 0, "Gmail").setIcon(2130837600).setShowAsAction(2);
        menu.add(0, 1, 0, 2131099746).setIcon(2130837604).setShowAsAction(2);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intent;
        switch (menuItem.getItemId()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                intent = new Intent("android.intent.action.SEND");
                intent.setType("plain/text");
                intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
                intent.putExtra("android.intent.extra.SUBJECT", getResources().getString(2131099725) + ":" + this.f2685a);
                intent.putExtra("android.intent.extra.TEXT", getResources().getString(2131099868));
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(this.f2685a)));
                startActivity(Intent.createChooser(intent, "Send mail..."));
                return true;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setDataAndType(Uri.parse("file://" + this.f2685a), "image/*");
                startActivity(intent);
                return true;
            case 16908332:
                onBackPressed();
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
