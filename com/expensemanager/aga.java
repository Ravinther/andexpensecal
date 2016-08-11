package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.C0607c;
import java.io.File;

class aga implements OnClickListener {
    final /* synthetic */ afz f4078a;

    aga(afz com_expensemanager_afz) {
        this.f4078a = com_expensemanager_afz;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
                intent.putExtra("output", Uri.fromFile(new File(co.f4431e + "tmp.jpg")));
                this.f4078a.f4073a.startActivityForResult(intent, 7);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f4078a.f4073a.startActivityForResult(new Intent(this.f4078a.f4073a.f3605a, AttachPicture.class), 7);
            default:
        }
    }
}
