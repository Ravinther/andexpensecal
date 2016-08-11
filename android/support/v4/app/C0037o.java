package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.p004c.C0053l;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.o */
public class C0037o extends Activity {
    final Handler f259a;
    final C0043v f260b;
    final C0034s f261c;
    boolean f262d;
    boolean f263e;
    boolean f264f;
    boolean f265g;
    boolean f266h;
    boolean f267i;
    boolean f268j;
    boolean f269k;
    C0053l<String, an> f270l;
    an f271m;

    public C0037o() {
        this.f259a = new C0038p(this);
        this.f260b = new C0043v();
        this.f261c = new C0039q(this);
    }

    private static String m353a(View view) {
        char c = 'F';
        char c2 = '.';
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(view.getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(view)));
        stringBuilder.append(' ');
        switch (view.getVisibility()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                stringBuilder.append('V');
                break;
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                stringBuilder.append('I');
                break;
            case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                stringBuilder.append('G');
                break;
            default:
                stringBuilder.append('.');
                break;
        }
        stringBuilder.append(view.isFocusable() ? 'F' : '.');
        stringBuilder.append(view.isEnabled() ? 'E' : '.');
        stringBuilder.append(view.willNotDraw() ? '.' : 'D');
        stringBuilder.append(view.isHorizontalScrollBarEnabled() ? 'H' : '.');
        stringBuilder.append(view.isVerticalScrollBarEnabled() ? 'V' : '.');
        stringBuilder.append(view.isClickable() ? 'C' : '.');
        stringBuilder.append(view.isLongClickable() ? 'L' : '.');
        stringBuilder.append(' ');
        if (!view.isFocused()) {
            c = '.';
        }
        stringBuilder.append(c);
        stringBuilder.append(view.isSelected() ? 'S' : '.');
        if (view.isPressed()) {
            c2 = 'P';
        }
        stringBuilder.append(c2);
        stringBuilder.append(' ');
        stringBuilder.append(view.getLeft());
        stringBuilder.append(',');
        stringBuilder.append(view.getTop());
        stringBuilder.append('-');
        stringBuilder.append(view.getRight());
        stringBuilder.append(',');
        stringBuilder.append(view.getBottom());
        int id = view.getId();
        if (id != -1) {
            stringBuilder.append(" #");
            stringBuilder.append(Integer.toHexString(id));
            Resources resources = view.getResources();
            if (!(id == 0 || resources == null)) {
                String str;
                switch (-16777216 & id) {
                    case 16777216:
                        str = "android";
                        break;
                    case 2130706432:
                        str = "app";
                        break;
                    default:
                        try {
                            str = resources.getResourcePackageName(id);
                            break;
                        } catch (NotFoundException e) {
                            break;
                        }
                }
                String resourceTypeName = resources.getResourceTypeName(id);
                String resourceEntryName = resources.getResourceEntryName(id);
                stringBuilder.append(" ");
                stringBuilder.append(str);
                stringBuilder.append(":");
                stringBuilder.append(resourceTypeName);
                stringBuilder.append("/");
                stringBuilder.append(resourceEntryName);
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private void m354a(String str, PrintWriter printWriter, View view) {
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.println(C0037o.m353a(view));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount > 0) {
                String str2 = str + "  ";
                for (int i = 0; i < childCount; i++) {
                    m354a(str2, printWriter, viewGroup.getChildAt(i));
                }
            }
        }
    }

    an m355a(String str, boolean z, boolean z2) {
        if (this.f270l == null) {
            this.f270l = new C0053l();
        }
        an anVar = (an) this.f270l.get(str);
        if (anVar != null) {
            anVar.m189a(this);
            return anVar;
        } else if (!z2) {
            return anVar;
        } else {
            anVar = new an(str, this, z);
            this.f270l.put(str, anVar);
            return anVar;
        }
    }

    public void m356a() {
        C0021a.m124a(this);
    }

    public void m357a(C0032l c0032l) {
    }

    public void m358a(C0032l c0032l, Intent intent, int i) {
        if (i == -1) {
            super.startActivityForResult(intent, -1);
        } else if ((-65536 & i) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        } else {
            super.startActivityForResult(intent, ((c0032l.f238p + 1) << 16) + (65535 & i));
        }
    }

    void m359a(String str) {
        if (this.f270l != null) {
            an anVar = (an) this.f270l.get(str);
            if (anVar != null && !anVar.f139g) {
                anVar.m198h();
                this.f270l.remove(str);
            }
        }
    }

    void m360a(boolean z) {
        if (!this.f265g) {
            this.f265g = true;
            this.f266h = z;
            this.f259a.removeMessages(1);
            m365e();
        }
    }

    protected boolean m361a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void m362b() {
        this.f260b.m428m();
    }

    public Object m363c() {
        return null;
    }

    public void m364d() {
        if (VERSION.SDK_INT >= 11) {
            C0024c.m212a(this);
        } else {
            this.f267i = true;
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        if (VERSION.SDK_INT >= 11) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f262d);
            printWriter.print("mResumed=");
            printWriter.print(this.f263e);
            printWriter.print(" mStopped=");
            printWriter.print(this.f264f);
            printWriter.print(" mReallyStopped=");
            printWriter.println(this.f265g);
            printWriter.print(str2);
            printWriter.print("mLoadersStarted=");
            printWriter.println(this.f269k);
        } else {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f262d);
            printWriter.print("mResumed=");
            printWriter.print(this.f263e);
            printWriter.print(" mStopped=");
            printWriter.print(this.f264f);
            printWriter.print(" mReallyStopped=");
            printWriter.println(this.f265g);
            printWriter.print(str2);
            printWriter.print("mLoadersStarted=");
            printWriter.println(this.f269k);
        }
        if (this.f271m != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.f271m)));
            printWriter.println(":");
            this.f271m.m190a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        this.f260b.m399a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("View Hierarchy:");
        m354a(str + "  ", printWriter, getWindow().getDecorView());
    }

    void m365e() {
        if (this.f269k) {
            this.f269k = false;
            if (this.f271m != null) {
                if (this.f266h) {
                    this.f271m.m194d();
                } else {
                    this.f271m.m193c();
                }
            }
        }
        this.f260b.m431p();
    }

    public C0041t m366f() {
        return this.f260b;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f260b.m424i();
        int i3 = i >> 16;
        if (i3 != 0) {
            i3--;
            if (this.f260b.f288f == null || i3 < 0 || i3 >= this.f260b.f288f.size()) {
                Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(i));
                return;
            }
            C0032l c0032l = (C0032l) this.f260b.f288f.get(i3);
            if (c0032l == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(i));
                return;
            } else {
                c0032l.m276a(65535 & i, i2, intent);
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        if (!this.f260b.m413c()) {
            m356a();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f260b.m390a(configuration);
    }

    protected void onCreate(Bundle bundle) {
        this.f260b.m397a(this, this.f261c, null);
        if (getLayoutInflater().getFactory() == null) {
            getLayoutInflater().setFactory(this);
        }
        super.onCreate(bundle);
        C0040r c0040r = (C0040r) getLastNonConfigurationInstance();
        if (c0040r != null) {
            this.f270l = c0040r.f278e;
        }
        if (bundle != null) {
            this.f260b.m392a(bundle.getParcelable("android:support:fragments"), c0040r != null ? c0040r.f277d : null);
        }
        this.f260b.m425j();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        return VERSION.SDK_INT >= 11 ? super.onCreatePanelMenu(i, menu) | this.f260b.m402a(menu, getMenuInflater()) : true;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return super.onCreateView(str, context, attributeSet);
        }
        View onCreateView = this.f260b.onCreateView(str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    protected void onDestroy() {
        super.onDestroy();
        m360a(false);
        this.f260b.m433r();
        if (this.f271m != null) {
            this.f271m.m198h();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 5 || i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        onBackPressed();
        return true;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f260b.m434s();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                return this.f260b.m403a(menuItem);
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                return this.f260b.m410b(menuItem);
            default:
                return false;
        }
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f260b.m424i();
    }

    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f260b.m408b(menu);
                break;
        }
        super.onPanelClosed(i, menu);
    }

    protected void onPause() {
        super.onPause();
        this.f263e = false;
        if (this.f259a.hasMessages(2)) {
            this.f259a.removeMessages(2);
            m362b();
        }
        this.f260b.m429n();
    }

    protected void onPostResume() {
        super.onPostResume();
        this.f259a.removeMessages(2);
        m362b();
        this.f260b.m419e();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        if (this.f267i) {
            this.f267i = false;
            menu.clear();
            onCreatePanelMenu(i, menu);
        }
        return m361a(view, menu) | this.f260b.m401a(menu);
    }

    protected void onResume() {
        super.onResume();
        this.f259a.sendEmptyMessage(2);
        this.f263e = true;
        this.f260b.m419e();
    }

    public final Object onRetainNonConfigurationInstance() {
        int i = 0;
        if (this.f264f) {
            m360a(true);
        }
        Object c = m363c();
        ArrayList g = this.f260b.m422g();
        int i2;
        if (this.f270l != null) {
            int size = this.f270l.size();
            an[] anVarArr = new an[size];
            for (int i3 = size - 1; i3 >= 0; i3--) {
                anVarArr[i3] = (an) this.f270l.m449c(i3);
            }
            i2 = 0;
            while (i < size) {
                an anVar = anVarArr[i];
                if (anVar.f139g) {
                    i2 = true;
                } else {
                    anVar.m198h();
                    this.f270l.remove(anVar.f136d);
                }
                i++;
            }
        } else {
            i2 = 0;
        }
        if (g == null && r0 == 0 && c == null) {
            return null;
        }
        C0040r c0040r = new C0040r();
        c0040r.f274a = null;
        c0040r.f275b = c;
        c0040r.f276c = null;
        c0040r.f277d = g;
        c0040r.f278e = this.f270l;
        return c0040r;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable h = this.f260b.m423h();
        if (h != null) {
            bundle.putParcelable("android:support:fragments", h);
        }
    }

    protected void onStart() {
        super.onStart();
        this.f264f = false;
        this.f265g = false;
        this.f259a.removeMessages(1);
        if (!this.f262d) {
            this.f262d = true;
            this.f260b.m426k();
        }
        this.f260b.m424i();
        this.f260b.m419e();
        if (!this.f269k) {
            this.f269k = true;
            if (this.f271m != null) {
                this.f271m.m192b();
            } else if (!this.f268j) {
                this.f271m = m355a("(root)", this.f269k, false);
                if (!(this.f271m == null || this.f271m.f138f)) {
                    this.f271m.m192b();
                }
            }
            this.f268j = true;
        }
        this.f260b.m427l();
        if (this.f270l != null) {
            int size = this.f270l.size();
            an[] anVarArr = new an[size];
            for (int i = size - 1; i >= 0; i--) {
                anVarArr[i] = (an) this.f270l.m449c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                an anVar = anVarArr[i2];
                anVar.m195e();
                anVar.m197g();
            }
        }
    }

    protected void onStop() {
        super.onStop();
        this.f264f = true;
        this.f259a.sendEmptyMessage(1);
        this.f260b.m430o();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (i == -1 || (-65536 & i) == 0) {
            super.startActivityForResult(intent, i);
            return;
        }
        throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
}
