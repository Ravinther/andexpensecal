package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.io.File;

class xc implements OnClickListener {
    final /* synthetic */ xa f5435a;

    xc(xa xaVar) {
        this.f5435a = xaVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = co.f4431e + "tmp.jpg";
        if (!this.f5435a.f5433a.f3347n) {
            str = co.f4431e + this.f5435a.f5433a.getIntent().getStringExtra("property2");
        }
        Intent intent;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                intent = new Intent(this.f5435a.f5433a.f3334a, DisplayPicture.class);
                Bundle bundle = new Bundle();
                bundle.putString("image_file", str);
                intent.putExtras(bundle);
                this.f5435a.f5433a.startActivity(intent);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
                intent2.putExtra("output", Uri.fromFile(new File(co.f4431e + "tmp.jpg")));
                this.f5435a.f5433a.startActivityForResult(intent2, 7);
            case C0607c.LoadingImageView_circleCrop /*2*/:
                File file = new File(co.f4431e + "tmp.jpg");
                if (file.exists()) {
                    file.delete();
                }
                this.f5435a.f5433a.f3345l.setImageResource(2130837617);
                this.f5435a.f5433a.f3346m = null;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                this.f5435a.f5433a.startActivityForResult(new Intent(this.f5435a.f5433a.f3334a, AttachPicture.class), 7);
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                intent = new Intent("android.intent.action.SEND");
                intent.setType("plain/text");
                intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
                intent.putExtra("android.intent.extra.SUBJECT", this.f5435a.f5433a.getResources().getString(2131099725) + ":" + str);
                intent.putExtra("android.intent.extra.TEXT", this.f5435a.f5433a.getResources().getString(2131099868));
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str)));
                this.f5435a.f5433a.startActivity(Intent.createChooser(intent, "Send mail..."));
            default:
        }
    }
}
