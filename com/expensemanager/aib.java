package com.expensemanager;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.apache.http.util.ByteArrayBuffer;

public class aib {
    public static TextWatcher f4143a;

    static {
        f4143a = new aie();
    }

    public static float m3845a(float f) {
        return ((float) Math.round(f * 100.0f)) / 100.0f;
    }

    public static int m3846a(String[] strArr, String str) {
        int i = -1;
        if (!(strArr == null || str == null)) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (str.equals(strArr[i2])) {
                    i = i2;
                }
            }
        }
        return i;
    }

    public static long m3847a() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 23);
        instance.set(12, 59);
        instance.set(13, 59);
        return instance.getTimeInMillis();
    }

    public static long m3848a(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static AlertDialog m3849a(Context context, View view, String str, int i, String str2, String str3, OnClickListener onClickListener, String str4, OnClickListener onClickListener2) {
        Builder builder = new Builder(context);
        builder.setTitle(str);
        if (str2 != null) {
            builder.setMessage(str2);
        }
        if (view != null) {
            builder.setView(view);
        }
        if (onClickListener == null) {
            onClickListener = new aic();
        }
        builder.setPositiveButton(str3, onClickListener);
        if (onClickListener2 == null) {
            onClickListener2 = new aid();
        }
        builder.setNegativeButton(str4, onClickListener2);
        return builder.create();
    }

    public static String m3850a(double d) {
        try {
            return NumberFormat.getCurrencyInstance(Locale.US).format(d).replace("$", "");
        } catch (Exception e) {
            return "0.00";
        }
    }

    public static String m3851a(int i) {
        String str = "";
        return (i <= -1 || i >= co.f4436j.length) ? str : co.f4436j[i].split(":")[1];
    }

    public static String m3852a(Object obj) {
        return obj == null ? "" : ((String) obj).trim();
    }

    public static String m3853a(String str) {
        return str == null ? "" : str.trim();
    }

    public static String m3854a(String str, String str2) {
        if ("0".equals(str) || "".equals(str)) {
            return "";
        }
        if ("0".equals(str2) || "".equals(str2)) {
            return "";
        }
        String str3 = "";
        try {
            return "" + m3845a(new Float(str).floatValue() * new Float(str2).floatValue());
        } catch (Exception e) {
            return "";
        }
    }

    public static String m3855a(String str, String str2, String str3) {
        if (str2 == null) {
            str2 = "snl1c1p2voghj1rdyt1";
        }
        return m3872d("http://download.finance.yahoo.com/d/quotes.csv?f=" + str2 + "&e=.csv&s=" + m3866b(str, "@"));
    }

    public static String m3856a(String str, String str2, boolean z) {
        if (str == null || "".equals(str)) {
            return null;
        }
        String str3 = "http://finance.google.com/finance/info?client=ig&q=";
        if (z) {
            str3 = "http://finance.google.com/finance/info?infotype=infoquoteall&client=ig&q=";
        }
        String str4 = "";
        if (!"".equalsIgnoreCase(str2)) {
            str4 = str2 + ":";
        }
        String[] split = str.split(",");
        String str5 = "";
        for (int i = 0; i < split.length; i++) {
            str5 = str5.equals("") ? str4 + split[i] : str5 + "," + str4 + split[i];
        }
        str3 = str3 + str5;
        StrictMode.setThreadPolicy(new ThreadPolicy.Builder().permitAll().build());
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new URL(str3).openConnection().getInputStream());
            ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(50);
            while (true) {
                int read = bufferedInputStream.read();
                if (read == -1) {
                    return new String(byteArrayBuffer.toByteArray());
                }
                byteArrayBuffer.append((byte) read);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String m3857a(ArrayList<String> arrayList, String str) {
        if (arrayList == null || arrayList.size() == 0) {
            return "";
        }
        String str2 = "";
        str2 = (String) arrayList.get(0);
        int i = 1;
        while (i < arrayList.size()) {
            String str3 = str2 + str + m3865b((String) arrayList.get(i));
            i++;
            str2 = str3;
        }
        return str2;
    }

    public static void m3858a(Context context, Button button, int i) {
        int i2 = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("BUTTON_COLOR", 1);
        if (i2 != 6) {
            if (i == -1) {
                switch (i2) {
                    case C0607c.AdsAttrs_adSize /*0*/:
                        i = 2130837526;
                        break;
                    case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                        i = 2130837527;
                        break;
                    case C0607c.LoadingImageView_circleCrop /*2*/:
                        i = 2130837528;
                        break;
                    case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                        i = 2130837529;
                        break;
                    case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                        i = 2130837530;
                        break;
                    case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                        i = 2130837531;
                        break;
                    case adv.TitlePageIndicator_footerLineHeight /*6*/:
                        return;
                }
            }
            button.setBackgroundDrawable(context.getResources().getDrawable(i));
            button.setTypeface(null, 1);
            button.setTextColor(-1);
        }
    }

    public static void m3859a(Context context, String str, String str2) {
        Editor edit = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public static void m3860a(Context context, String str, String str2, String str3) {
        try {
            if (m3863a(new File(str2 + "/" + str3), context.getDatabasePath("personal_finance.db"))) {
                Toast.makeText(context, context.getResources().getString(2131100062), 1).show();
                Intent intent = new Intent(context, ExpenseManager.class);
                Bundle bundle = new Bundle();
                bundle.putString("account", str);
                intent.putExtras(bundle);
                intent.addFlags(67108864);
                context.startActivity(intent);
            } else {
                Toast.makeText(context, context.getResources().getString(2131100061), 1).show();
            }
        } catch (IOException e) {
            Toast.makeText(context, context.getResources().getString(2131100061), 1).show();
        }
        try {
            if (m3863a(new File(str2 + "/" + str3.replace(".db", ".xml")), m3870c(context.getFilesDir().getParent() + "/shared_prefs", "MY_PORTFOLIO_TITLES.xml")) && VERSION.SDK_INT > 10) {
                context.getSharedPreferences("MY_PORTFOLIO_TITLES", 4);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public static void m3861a(Context context, String str, boolean z) {
        String f = m3874f("yyyy-MM-dd");
        try {
            m3873e(str);
            File file = new File(co.f4430d);
            if (!file.exists()) {
                file.mkdir();
            }
            boolean a = m3863a(context.getDatabasePath("personal_finance.db"), m3870c(str, f + ".db"));
            if (z) {
                if (a) {
                    Toast.makeText(context, context.getResources().getString(2131099735), 1).show();
                } else {
                    Toast.makeText(context, context.getResources().getString(2131099734), 1).show();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            if (z) {
                Toast.makeText(context, context.getResources().getString(2131099734), 1).show();
            }
        }
        try {
            m3863a(new File(context.getFilesDir().getParent() + "/shared_prefs/" + "MY_PORTFOLIO_TITLES" + ".xml"), m3870c(str, f + ".xml"));
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public static boolean m3862a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            return z;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean m3863a(File file, File file2) {
        FileChannel channel;
        Throwable th;
        FileChannel fileChannel = null;
        try {
            FileChannel channel2;
            channel = new FileInputStream(file).getChannel();
            try {
                channel2 = new FileOutputStream(file2).getChannel();
            } catch (Throwable th2) {
                th = th2;
                fileChannel = channel;
                channel = null;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                if (channel != null) {
                    channel.close();
                }
                throw th;
            }
            try {
                channel2.transferFrom(channel, 0, channel.size());
                if (channel != null) {
                    channel.close();
                }
                if (channel2 != null) {
                    channel2.close();
                }
                return true;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                fileChannel = channel;
                channel = channel2;
                th = th4;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                if (channel != null) {
                    channel.close();
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            channel = null;
            if (fileChannel != null) {
                fileChannel.close();
            }
            if (channel != null) {
                channel.close();
            }
            throw th;
        }
    }

    public static double m3864b(double d) {
        return ((double) Math.round(d * 100.0d)) / 100.0d;
    }

    public static String m3865b(String str) {
        return str == null ? "" : "0".equals(str) ? "" : str.trim();
    }

    public static String m3866b(String str, String str2) {
        if ("".equalsIgnoreCase(str)) {
            return "";
        }
        if (str.indexOf(str2) == -1) {
            return str;
        }
        String[] split = str.split(",");
        int i = 0;
        String str3 = "";
        while (i < split.length) {
            String str4 = split[i];
            if (split[i].indexOf(str2) != -1) {
                str4 = split[i].substring(0, split[i].indexOf(str2));
            }
            if (!"".equals(str3)) {
                str4 = str3 + "," + str4;
            }
            i++;
            str3 = str4;
        }
        return str3;
    }

    public static String m3867b(String str, String str2, String str3) {
        if (str2 == null || !str2.equals(str3)) {
            try {
                str = new SimpleDateFormat(str3).format(new SimpleDateFormat(str2).parse(str));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    public static String m3868b(String[] strArr, String str) {
        String str2 = "";
        if (strArr != null && strArr.length > 0) {
            str2 = strArr[0].trim();
            for (int i = 1; i < strArr.length; i++) {
                str2 = str2 + str + strArr[i].trim();
            }
        }
        return str2;
    }

    public static void m3869b(Context context, Button button, int i) {
        if (!context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getBoolean("HOMEPAGE_BUTTOM", true)) {
            m3858a(context, button, -1);
            if ((context.getResources().getConfiguration().screenLayout & 15) < 3) {
                float f = context.getResources().getDisplayMetrics().density;
                button.setPadding((int) ((((double) f) * 2.0d) + 0.5d), (int) ((((double) f) * 5.0d) + 0.5d), (int) ((((double) f) * 2.0d) + 0.5d), (int) ((((double) f) * 5.0d) + 0.5d));
            }
        }
    }

    public static File m3870c(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        return new File(file.getPath() + "/" + str2);
    }

    public static String m3871c(String str) {
        if (str == null || "".endsWith(str)) {
            return str;
        }
        int indexOf = str.indexOf("(");
        int indexOf2 = str.indexOf(")");
        return (indexOf == -1 || indexOf2 == -1) ? str : str.substring(indexOf + 1, indexOf2);
    }

    public static String m3872d(String str) {
        String str2 = "";
        System.setProperty("http.keepAlive", "false");
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(((HttpURLConnection) new URL(str).openConnection()).getInputStream());
            ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(50);
            while (true) {
                int read = bufferedInputStream.read();
                if (read == -1) {
                    return new String(byteArrayBuffer.toByteArray());
                }
                byteArrayBuffer.append((byte) read);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static void m3873e(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        String[] list = file.list();
        if (list != null && list.length > 10) {
            long time = new Date().getTime();
            for (String str2 : list) {
                File file2 = new File(file.getPath() + "/" + str2);
                if ((time - file2.lastModified()) / 86400000 >= 7) {
                    file2.delete();
                    if (str2.indexOf(".") != -1) {
                        new File(file.getPath() + "/" + (str2.substring(0, str2.indexOf(".")) + ".xml")).delete();
                    }
                }
            }
        }
    }

    public static String m3874f(String str) {
        String str2 = "";
        try {
            str2 = new SimpleDateFormat(str).format(new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str2.trim();
    }

    public static HashMap<String, String> m3875g(String str) {
        String[] split = str.replace(",{", ";").replace("//", "").replace("{", "").replace("}", "").replace("[", "").replace("]", "").split(";");
        HashMap<String, String> hashMap = new HashMap();
        for (String split2 : split) {
            String[] split3 = split2.split(",\"");
            String split22 = "";
            for (String split4 : split3) {
                try {
                    String[] split5 = split4.split(":");
                    String b = m3865b(split5[0].replaceAll("\"", ""));
                    String split42 = m3865b(split5[1].replaceAll("\"", ""));
                    if ("t".equals(b)) {
                        split22 = split42;
                    }
                    if ("l".equals(b)) {
                        hashMap.put(split22, split42.replaceAll(",", ""));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return hashMap;
    }

    public static String m3876h(String str) {
        return new SimpleDateFormat(str).format(new Date());
    }

    public static double m3877i(String str) {
        double d = 0.0d;
        if (str != null) {
            try {
                if (!"".equals(str)) {
                    d = Double.valueOf(str.replaceAll(",", "").replace("(", "").replace(")", "")).doubleValue();
                }
            } catch (Exception e) {
            }
        }
        return d;
    }

    public static ArrayList<String> m3878j(String str) {
        ArrayList<String> arrayList = new ArrayList();
        return (str == null || "".equals(str)) ? arrayList : new ArrayList(Arrays.asList(str.split(",")));
    }

    public static int m3879k(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return "".equals(str) ? 0 : (int) Double.parseDouble(str.replaceAll(",", "").replace("(", "-").replace(")", "").trim());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String m3880l(String str) {
        if (str == null || "".equals(str)) {
            return "0.00";
        }
        try {
            double parseDouble = Double.parseDouble(str.replaceAll(",", ""));
            DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(Locale.US);
            decimalFormat.setNegativePrefix("-" + decimalFormat.getPositivePrefix());
            return decimalFormat.format(parseDouble).replace("$", "").replace(")", "");
        } catch (Exception e) {
            return "0.00";
        }
    }
}
