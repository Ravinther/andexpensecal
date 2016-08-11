package com.expensemanager;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

/* renamed from: com.expensemanager.a */
class C0395a implements OnItemClickListener {
    final /* synthetic */ String[] f3791a;
    final /* synthetic */ AboutUs f3792b;

    C0395a(AboutUs aboutUs, String[] strArr) {
        this.f3792b = aboutUs;
        this.f3791a = strArr;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String charSequence = ((TextView) view.findViewById(2131558423)).getText().toString();
        if (this.f3791a[0].equalsIgnoreCase(charSequence)) {
            this.f3792b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://sites.google.com/site/expensemgr/versions")));
            return;
        }
        if (this.f3791a[1].equalsIgnoreCase(charSequence)) {
            String str = "";
            try {
                str = "v" + this.f3792b.getPackageManager().getPackageInfo(this.f3792b.getPackageName(), 0).versionName + " ";
            } catch (Exception e) {
                e.printStackTrace();
            }
            String str2 = ("Android: " + VERSION.RELEASE) + "\nModel: " + Build.MANUFACTURER + " " + Build.MODEL + "\n";
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("plain/text");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{"pfinanceapp@gmail.com"});
            intent.putExtra("android.intent.extra.SUBJECT", str + this.f3792b.getResources().getString(2131099725));
            intent.putExtra("android.intent.extra.TEXT", str2);
            this.f3792b.f2413a.startActivity(Intent.createChooser(intent, "Send mail..."));
        }
        String str3 = "Thanks for choosing this app. Many users sent us feedback. We appreciate your comments. Please send the feature request, bug report or any question directly to the developer instead of posting in the market. We will do our best to satisfy your request.";
        if (this.f3791a[2].equalsIgnoreCase(charSequence)) {
            aba.m3745a(this.f3792b.f2413a, null, "Thank You", -1, str3, "OK", null, null, null).show();
        } else if (this.f3791a[3].equalsIgnoreCase(charSequence)) {
            this.f3792b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://sites.google.com/site/expensemgr/faq")));
        } else if (this.f3791a[4].equalsIgnoreCase(charSequence)) {
            this.f3792b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://sites.google.com/site/expensemgr/")));
        } else {
            str3 = "In no event will BiShiNews be liable to any user for any indirect, special, incidental, punitive or consequential damages, including but not limited to loss of data, business interruption, or loss of profits, arising out of the use of or the inability to use this application.";
            if (this.f3791a[5].equalsIgnoreCase(charSequence)) {
                aba.m3745a(this.f3792b.f2413a, null, "EULA", -1, str3, "OK", null, null, null).show();
            } else if (this.f3791a[6].equalsIgnoreCase(charSequence)) {
                this.f3792b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://market.android.com/search?q=pname:com.expensemanager")));
            } else {
                if (this.f3791a[7].equalsIgnoreCase(charSequence)) {
                    Intent intent2 = new Intent("android.intent.action.SEND");
                    intent2.setType("text/plain");
                    intent2.putExtra("android.intent.extra.SUBJECT", "Download \"Expense Manager\" on your Android phone");
                    intent2.putExtra("android.intent.extra.TEXT", "Share with you the following Android application.\nhttp://market.android.com/search?q=pname:com.expensemanager");
                    this.f3792b.startActivity(Intent.createChooser(intent2, "Share..."));
                }
                if (this.f3791a[8].equalsIgnoreCase(charSequence)) {
                    this.f3792b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://market.android.com/search?q=pub:Bishinews")));
                }
            }
        }
    }
}
