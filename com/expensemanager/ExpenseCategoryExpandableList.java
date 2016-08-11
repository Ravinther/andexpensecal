package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.ExpandableListActivity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.ExpandableListContextMenuInfo;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.SearchView;
import android.widget.SimpleCursorAdapter;
import android.widget.SimpleExpandableListAdapter;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseCategoryExpandableList extends ExpandableListActivity {
    ArrayList<String> f2989a;
    Menu f2990b;
    List<Map<String, String>> f2991c;
    List<List<Map<String, String>>> f2992d;
    private String f2993e;
    private String f2994f;
    private Context f2995g;
    private SimpleExpandableListAdapter f2996h;
    private ro f2997i;
    private EditText f2998j;

    public ExpenseCategoryExpandableList() {
        this.f2993e = "CATEGORY";
        this.f2994f = "SUBCATEGORY";
        this.f2995g = this;
    }

    private int m2906a(ro roVar, List<Map<String, String>> list, List<List<Map<String, String>>> list2) {
        int count;
        Exception e;
        try {
            if (!roVar.m4206d()) {
                roVar.m4193a();
            }
            Cursor c = roVar.m4204c();
            if (c == null || c.getCount() == 0) {
                return 0;
            }
            this.f2989a = new ArrayList();
            if (c.moveToFirst()) {
                int columnIndex = c.getColumnIndex("category");
                int columnIndex2 = c.getColumnIndex("subcategory");
                do {
                    String string = c.getString(columnIndex);
                    String string2 = c.getString(columnIndex2);
                    List list3;
                    Map hashMap;
                    if (this.f2989a.contains(string)) {
                        list3 = (List) list2.get(list2.size() - 1);
                        hashMap = new HashMap();
                        hashMap.put(this.f2994f, string2);
                        list3.add(hashMap);
                    } else {
                        this.f2989a.add(string);
                        hashMap = new HashMap();
                        list.add(hashMap);
                        hashMap.put(this.f2993e, string);
                        list3 = new ArrayList();
                        hashMap = new HashMap();
                        hashMap.put(this.f2994f, string2);
                        list3.add(hashMap);
                        list2.add(list3);
                    }
                } while (c.moveToNext());
            }
            count = c.getCount();
            if (c != null) {
                try {
                    c.close();
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return count;
                }
            }
            roVar.m4201b();
            return count;
        } catch (Exception e3) {
            Exception exception = e3;
            count = 0;
            e = exception;
        }
    }

    public static SimpleCursorAdapter m2907a(Context context, String[] strArr) {
        Cursor matrixCursor = new MatrixCursor(new String[]{"_id", "text"});
        String[] strArr2 = new String[2];
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = strArr[i];
            int i3 = i2 + 1;
            strArr2[0] = Integer.toString(i2);
            strArr2[1] = str;
            matrixCursor.addRow(strArr2);
            i++;
            i2 = i3;
        }
        return new SimpleCursorAdapter(context, 2130903150, matrixCursor, new String[]{"text"}, new int[]{16908308});
    }

    private void m2909a() {
        OnClickListener mwVar = new mw(this);
        aib.m3849a(this, null, getResources().getString(2131099805), 17301543, getResources().getString(2131099804), getResources().getString(2131099983), mwVar, getResources().getString(2131099754), null).show();
    }

    private void m2911a(ro roVar, List<Map<String, String>> list, List<List<Map<String, String>>> list2, ArrayList<String> arrayList, String str) {
        try {
            if (!roVar.m4206d()) {
                roVar.m4193a();
            }
            Cursor b = roVar.m4199b("category like '%" + str + "%' OR " + "subcategory" + " like '%" + str + "%' COLLATE NOCASE", "category ASC, subcategory ASC");
            if (b != null && b.getCount() != 0) {
                if (b.moveToFirst()) {
                    int columnIndex = b.getColumnIndex("category");
                    int columnIndex2 = b.getColumnIndex("subcategory");
                    do {
                        String string = b.getString(columnIndex);
                        String string2 = b.getString(columnIndex2);
                        String str2 = string + ":" + string2;
                        if (!arrayList.contains(str2)) {
                            arrayList.add(str2);
                        }
                        List list3;
                        Map hashMap;
                        if (arrayList.contains(string)) {
                            list3 = (List) list2.get(list2.size() - 1);
                            hashMap = new HashMap();
                            hashMap.put(this.f2994f, string2);
                            list3.add(hashMap);
                        } else {
                            arrayList.add(string);
                            hashMap = new HashMap();
                            list.add(hashMap);
                            hashMap.put(this.f2993e, string);
                            list3 = new ArrayList();
                            hashMap = new HashMap();
                            hashMap.put(this.f2994f, string2);
                            list3.add(hashMap);
                            list2.add(list3);
                        }
                    } while (b.moveToNext());
                }
                if (b != null) {
                    b.close();
                }
                roVar.m4201b();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void m2913b() {
        String[] strArr = new String[]{this.f2993e};
        int[] iArr = new int[]{16908308};
        this.f2996h = new SimpleExpandableListAdapter(this, new ArrayList(), 17367046, strArr, iArr, new ArrayList(), 2130903146, new String[]{this.f2994f}, new int[]{16908308});
        setListAdapter(this.f2996h);
    }

    private LinearLayout m2914c() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(15, 5, 15, 5);
        this.f2998j = new EditText(this);
        linearLayout.addView(this.f2998j, new LayoutParams(-1, -2));
        return linearLayout;
    }

    public void m2919a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        ExpenseBudgetAdd.m2800a(this.f2997i, arrayList, new HashMap());
        arrayList.remove(str);
        OnClickListener myVar = new my(this, arrayList, str, str2);
        Builder builder = new Builder(this);
        builder.setTitle(str2 + ": " + getResources().getString(2131099968)).setItems((CharSequence[]) arrayList.toArray(new String[arrayList.size()]), myVar);
        builder.show();
    }

    public void m2920a(String str, String str2, boolean z) {
        OnClickListener mxVar = new mx(this, str, z, str2);
        if (z) {
            str2 = str;
        }
        aib.m3849a(this, m2914c(), getResources().getString(2131100046) + ": " + str2, -1, null, getResources().getString(2131099983), mxVar, getResources().getString(2131099754), null).show();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (-1 == i2) {
            onCreate(null);
            if (this.f2990b != null) {
                this.f2990b.removeItem(1);
                SubMenu icon = this.f2990b.addSubMenu(0, 1, 1, "Edit Category").setIcon(2130837596);
                for (int i3 = 0; i3 < this.f2989a.size(); i3++) {
                    icon.add(0, i3 + 10, i3 + 10, (CharSequence) this.f2989a.get(i3));
                }
            }
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        ExpandableListContextMenuInfo expandableListContextMenuInfo = (ExpandableListContextMenuInfo) menuItem.getMenuInfo();
        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(expandableListContextMenuInfo.packedPosition);
        String str = (String) ((Map) this.f2991c.get(packedPositionGroup)).get(this.f2993e);
        if (menuItem.getItemId() == 1001) {
            Intent intent = new Intent(this, ExpenseGroupAddEdit.class);
            Bundle bundle = new Bundle();
            bundle.putString("category", str);
            intent.putExtras(bundle);
            startActivityForResult(intent, 1);
        }
        if (menuItem.getItemId() == 1002) {
            if (ExpandableListView.getPackedPositionType(expandableListContextMenuInfo.packedPosition) == 1) {
                m2920a(str, (String) ((Map) ((List) this.f2992d.get(packedPositionGroup)).get(ExpandableListView.getPackedPositionChild(expandableListContextMenuInfo.packedPosition))).get(this.f2994f), false);
            } else {
                m2920a(str, null, true);
            }
        }
        if (menuItem.getItemId() == 1003) {
            m2919a(str, (String) ((Map) ((List) this.f2992d.get(packedPositionGroup)).get(ExpandableListView.getPackedPositionChild(expandableListContextMenuInfo.packedPosition))).get(this.f2994f));
        }
        return super.onContextItemSelected(menuItem);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        this.f2997i = new ro(this);
        setTitle(2131099759);
        Drawable drawable = getExpandableListView().getResources().getDrawable(17301522);
        getExpandableListView().setDivider(drawable);
        getExpandableListView().setChildDivider(drawable);
        this.f2991c = new ArrayList();
        this.f2992d = new ArrayList();
        if (m2906a(this.f2997i, this.f2991c, this.f2992d) == 0) {
            aib.m3849a(this, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099862), getResources().getString(2131099983), null, null, null).show();
            String[] split = getResources().getString(2131099885).split(";");
            if (!this.f2997i.m4206d()) {
                this.f2997i.m4193a();
            }
            for (String trim : split) {
                String trim2 = trim2.trim();
                if (!"".equals(trim2)) {
                    String str = "";
                    str = "";
                    String b = aib.m3865b(trim2.split("/")[0]);
                    String[] split2 = aib.m3865b(trim2.split("/")[1]).split(",");
                    for (String c : split2) {
                        try {
                            this.f2997i.m4185a("expense_category", this.f2997i.m4203c(b, c));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    abd.m3805a(this.f2995g, true);
                }
            }
            m2906a(this.f2997i, this.f2991c, this.f2992d);
        }
        this.f2996h = new SimpleExpandableListAdapter(this, this.f2991c, 2130903145, new String[]{this.f2993e}, new int[]{16908308}, this.f2992d, 2130903146, new String[]{this.f2994f}, new int[]{16908308});
        setListAdapter(this.f2996h);
        getExpandableListView().setOnChildClickListener(new ms(this));
        registerForContextMenu(getExpandableListView());
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        ExpandableListContextMenuInfo expandableListContextMenuInfo = (ExpandableListContextMenuInfo) contextMenuInfo;
        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(expandableListContextMenuInfo.packedPosition);
        contextMenu.setHeaderTitle((String) ((Map) this.f2991c.get(packedPositionGroup)).get(this.f2993e));
        contextMenu.add(0, 1001, 0, 2131099860);
        contextMenu.add(0, 1002, 0, getResources().getString(2131100046) + " - " + getResources().getString(2131099930));
        if (ExpandableListView.getPackedPositionType(expandableListContextMenuInfo.packedPosition) == 1) {
            contextMenu.add(0, 1003, 0, getResources().getString(2131099968) + " - " + getResources().getString(2131099930));
            contextMenu.setHeaderTitle(((String) ((Map) this.f2991c.get(packedPositionGroup)).get(this.f2993e)) + ":" + ((String) ((Map) ((List) this.f2992d.get(packedPositionGroup)).get(ExpandableListView.getPackedPositionChild(expandableListContextMenuInfo.packedPosition))).get(this.f2994f)));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492870, menu);
        SubMenu icon = menu.addSubMenu(0, 1, 1, 2131099860).setIcon(2130837596);
        for (int i = 0; i < this.f2989a.size(); i++) {
            icon.add(0, i + 10, i + 10, (CharSequence) this.f2989a.get(i));
        }
        this.f2990b = menu;
        MenuItem findItem = menu.findItem(2131559122);
        SearchView searchView = (SearchView) findItem.getActionView();
        if (searchView == null) {
            return false;
        }
        searchView.setSubmitButtonEnabled(true);
        ArrayList arrayList = new ArrayList();
        searchView.setOnSuggestionListener(new mt(this, arrayList, searchView, findItem));
        searchView.setOnQueryTextListener(new mu(this, arrayList, searchView, findItem));
        searchView.setOnQueryTextFocusChangeListener(new mv(this, findItem, searchView));
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) searchView.findViewById(searchView.getContext().getResources().getIdentifier("android:id/search_src_text", null, null));
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(autoCompleteTextView, Integer.valueOf(0));
        } catch (Exception e) {
        }
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (menuItem.getItemId() < 10 || menuItem.getItemId() >= this.f2989a.size() + 10) {
            switch (menuItem.getItemId()) {
                case 16908332:
                    onBackPressed();
                    return true;
                case 2131558668:
                    m2909a();
                    return true;
                case 2131559115:
                    startActivityForResult(new Intent(this, ExpenseGroupAddEdit.class), 0);
                    return true;
                default:
                    return super.onMenuItemSelected(i, menuItem);
            }
        }
        Intent intent = new Intent(this, ExpenseGroupAddEdit.class);
        Bundle bundle = new Bundle();
        bundle.putString("category", menuItem.getTitle().toString());
        intent.putExtras(bundle);
        startActivityForResult(intent, 1);
        return true;
    }
}
