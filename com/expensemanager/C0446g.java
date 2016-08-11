package com.expensemanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import java.util.List;
import java.util.Map;

/* renamed from: com.expensemanager.g */
public class C0446g extends BaseExpandableListAdapter {
    private List<? extends Map<String, ?>> f4675a;
    private int f4676b;
    private int f4677c;
    private String[] f4678d;
    private int[] f4679e;
    private List<? extends List<? extends Map<String, ?>>> f4680f;
    private int f4681g;
    private int f4682h;
    private String[] f4683i;
    private int[] f4684j;
    private LayoutInflater f4685k;

    public C0446g(Context context, List<? extends Map<String, ?>> list, int i, int i2, String[] strArr, int[] iArr, List<? extends List<? extends Map<String, ?>>> list2, int i3, int i4, String[] strArr2, int[] iArr2) {
        this.f4675a = list;
        this.f4676b = i;
        this.f4677c = i2;
        this.f4678d = strArr;
        this.f4679e = iArr;
        this.f4680f = list2;
        this.f4681g = i3;
        this.f4682h = i4;
        this.f4683i = strArr2;
        this.f4684j = iArr2;
        this.f4685k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public C0446g(Context context, List<? extends Map<String, ?>> list, int i, String[] strArr, int[] iArr, List<? extends List<? extends Map<String, ?>>> list2, int i2, String[] strArr2, int[] iArr2) {
        this(context, list, i, i, strArr, iArr, list2, i2, i2, strArr2, iArr2);
    }

    private void m4123a(View view, Map<String, ?> map, String[] strArr, int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            TextView textView = (TextView) view.findViewById(iArr[i]);
            if (textView != null) {
                CharSequence charSequence = (String) map.get(strArr[i]);
                if (charSequence == null) {
                    textView.setText(null);
                } else {
                    if (charSequence.startsWith("-")) {
                        textView.setTextColor(co.f4428b);
                        charSequence = charSequence.replace("-", "");
                    }
                    if (charSequence.startsWith("+")) {
                        textView.setTextColor(-16217592);
                        charSequence = charSequence.replace("+", "");
                    }
                    textView.setText(charSequence);
                }
            }
        }
    }

    public View m4124a(boolean z, ViewGroup viewGroup) {
        return this.f4685k.inflate(z ? this.f4682h : this.f4681g, viewGroup, false);
    }

    public View m4125b(boolean z, ViewGroup viewGroup) {
        return this.f4685k.inflate(z ? this.f4676b : this.f4677c, viewGroup, false);
    }

    public Object getChild(int i, int i2) {
        return ((List) this.f4680f.get(i)).get(i2);
    }

    public long getChildId(int i, int i2) {
        return (long) i2;
    }

    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = m4124a(z, viewGroup);
        }
        m4123a(view, (Map) ((List) this.f4680f.get(i)).get(i2), this.f4683i, this.f4684j);
        return view;
    }

    public int getChildrenCount(int i) {
        return ((List) this.f4680f.get(i)).size();
    }

    public Object getGroup(int i) {
        return this.f4675a.get(i);
    }

    public int getGroupCount() {
        return this.f4675a.size();
    }

    public long getGroupId(int i) {
        return (long) i;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = m4125b(z, viewGroup);
        }
        m4123a(view, (Map) this.f4675a.get(i), this.f4678d, this.f4679e);
        return view;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
