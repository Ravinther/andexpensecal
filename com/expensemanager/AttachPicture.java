package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import android.widget.ViewSwitcher.ViewFactory;
import com.google.android.gms.C0607c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;

public class AttachPicture extends Activity implements OnItemSelectedListener, ViewFactory {
    private String[] f2414a;
    private ImageView f2415b;
    private int f2416c;
    private TextView f2417d;
    private Context f2418e;

    public AttachPicture() {
        this.f2416c = 0;
        this.f2418e = this;
    }

    public static Bitmap m2369a(Bitmap bitmap, float f) {
        if (bitmap.getWidth() <= bitmap.getHeight()) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(90.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap m2370a(File file, int i) {
        int i2 = 1;
        try {
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(new FileInputStream(file), null, options);
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            while (i3 / 2 >= i && i4 / 2 >= i) {
                i3 /= 2;
                i4 /= 2;
                i2 *= 2;
            }
            options = new Options();
            options.inSampleSize = i2;
            return BitmapFactory.decodeStream(new FileInputStream(file), null, options);
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    public static void m2371a(File file) {
        int i = 1;
        try {
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(new FileInputStream(file), null, options);
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            if (i2 > 1200 || i3 > 1200) {
                i = 2;
            }
            if (i2 > 2400 || i3 > 2400) {
                i = 4;
            }
            if (i2 > 4800 || i3 > 4800) {
                i = 6;
            }
            options = new Options();
            options.inSampleSize = i;
            Bitmap decodeStream = BitmapFactory.decodeStream(new FileInputStream(file), null, options);
            OutputStream fileOutputStream = new FileOutputStream(file);
            m2369a(decodeStream, 90.0f).compress(CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
        }
    }

    public static String[] m2373a(String str) {
        try {
            String[] list = new File(str).list(new C0423d());
            Collections.reverse(Arrays.asList(list));
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public View makeView() {
        View imageView = new ImageView(this);
        imageView.setBackgroundColor(-16777216);
        imageView.setScaleType(ScaleType.FIT_CENTER);
        imageView.setLayoutParams(new LayoutParams(-1, -1));
        return imageView;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if (i2 == -1) {
                    try {
                        Bitmap decodeStream = BitmapFactory.decodeStream(getContentResolver().openInputStream(intent.getData()));
                        if (this.f2415b != null) {
                            this.f2415b.setImageBitmap(decodeStream);
                        }
                        CharSequence charSequence = getResources().getString(2131100078) + ": " + co.f4431e + "tmp.jpg";
                        if (this.f2417d != null) {
                            this.f2417d.setText(charSequence);
                        }
                        decodeStream.compress(CompressFormat.JPEG, 90, new FileOutputStream(new File(co.f4431e + "tmp.jpg")));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    setResult(-1, new Intent());
                    finish();
                }
            default:
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903126);
        this.f2414a = m2373a(co.f4431e);
        if (this.f2414a == null || this.f2414a.length == 0) {
            aib.m3849a(this.f2418e, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099928), getResources().getString(2131099983), null, null, null).show();
            return;
        }
        this.f2415b = (ImageView) findViewById(2131558501);
        this.f2417d = (TextView) findViewById(2131558904);
        this.f2415b.setOnClickListener(new C0396b(this));
        Gallery gallery = (Gallery) findViewById(2131558905);
        gallery.setAdapter(new C0444e(this, this));
        gallery.setOnItemSelectedListener(this);
        this.f2415b.setImageBitmap(m2370a(new File(co.f4431e + this.f2414a[this.f2416c]), 240));
        this.f2417d.setText(getResources().getString(2131100078) + ": " + co.f4431e + this.f2414a[this.f2416c]);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(1, 0, 0, 2131099807).setIcon(2130837594).setShowAsAction(2);
        menu.add(0, 1, 0, 2131099914).setIcon(2130837604).setShowAsAction(2);
        return true;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.f2416c = i;
        this.f2415b.setImageBitmap(m2370a(new File(co.f4431e + this.f2414a[i]), 240));
        this.f2417d.setText(getResources().getString(2131100078) + ": " + co.f4431e + this.f2414a[this.f2416c]);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                if (this.f2414a == null || this.f2416c >= this.f2414a.length) {
                    return true;
                }
                OnClickListener c0397c = new C0397c(this);
                aib.m3849a(this.f2418e, null, getResources().getString(2131099702), 17301543, this.f2418e.getResources().getString(2131099808) + " " + co.f4431e + this.f2414a[this.f2416c], getResources().getString(2131099983), c0397c, getResources().getString(2131099754), null).show();
                return true;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType("image/*");
                startActivityForResult(intent, 1);
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
