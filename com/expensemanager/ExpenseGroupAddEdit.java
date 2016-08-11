package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import java.util.ArrayList;
import java.util.List;

public class ExpenseGroupAddEdit extends Activity {
    InputFilter f3219a;
    private Context f3220b;
    private ro f3221c;
    private LinearLayout f3222d;
    private EditText f3223e;
    private String f3224f;
    private List<String> f3225g;

    public ExpenseGroupAddEdit() {
        this.f3220b = this;
        this.f3225g = new ArrayList();
        this.f3219a = new tc(this);
    }

    private long m3171a() {
        int childCount = this.f3222d.getChildCount();
        String obj = this.f3223e.getText().toString();
        if ("".equals(obj) || childCount == 0) {
            aba.m3745a(this.f3220b, null, getResources().getString(2131099702), -1, getResources().getString(2131099706), getResources().getString(2131099983), null, null, null).show();
            return 0;
        } else if (obj != null && obj.indexOf("'") != -1) {
            aib.m3849a(this.f3220b, null, getResources().getString(2131099702), -1, getResources().getString(2131099703), getResources().getString(2131099983), null, null, null).show();
            return 0;
        } else if (obj == null || obj.indexOf(":") == -1) {
            this.f3221c.m4193a();
            long j = -1;
            if (this.f3224f != null && !"".equals(this.f3224f) && !this.f3221c.m4197a("expense_category", "category", this.f3224f)) {
                return -1;
            }
            obj = this.f3223e.getText().toString();
            String trim = obj != null ? obj.trim() : obj;
            int i = 0;
            while (i < childCount) {
                LinearLayout linearLayout = (LinearLayout) this.f3222d.getChildAt(i);
                int childCount2 = linearLayout.getChildCount();
                String str = "";
                int i2 = 0;
                while (i2 < childCount2) {
                    String obj2;
                    View childAt = linearLayout.getChildAt(i2);
                    if ("android.widget.EditText".equalsIgnoreCase(childAt.getClass().getName())) {
                        obj2 = ((EditText) childAt).getText().toString();
                        if (obj2 != null) {
                            if (obj2.indexOf("'") != -1) {
                                obj2 = obj2.replaceAll("'", "");
                            }
                            obj2 = obj2.trim();
                        }
                    } else {
                        obj2 = str;
                    }
                    i2++;
                    str = obj2;
                }
                i++;
                j = !"".equals(str) ? this.f3221c.m4185a("expense_category", this.f3221c.m4203c(trim, str)) : j;
            }
            if (!(this.f3224f == null || "".equals(this.f3224f) || this.f3224f.equals(trim))) {
                this.f3221c.m4198a("expense_report", "category='" + this.f3224f + "'", "category", trim);
            }
            this.f3221c.m4201b();
            return j;
        } else {
            aib.m3849a(this.f3220b, null, getResources().getString(2131099702), -1, "Colon(:) is not allowed in the Category or Subcategory.", getResources().getString(2131099983), null, null, null).show();
            return 0;
        }
    }

    private void m3174a(String str) {
        View linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        View editText = new EditText(this);
        editText.setFilters(new InputFilter[]{this.f3219a});
        editText.setWidth(Math.round(getResources().getDisplayMetrics().density * 260.0f));
        editText.setHint(2131099877);
        if (!(str == null || "".equals(str))) {
            editText.setText(str);
        }
        View imageButton = new ImageButton(this, null, 16842825);
        if ((getResources().getConfiguration().screenLayout & 15) == 4 || (getResources().getConfiguration().screenLayout & 15) == 3) {
            editText.setWidth(600);
            editText.setTextSize(24.0f);
            linearLayout.setPadding(10, 10, 10, 10);
            imageButton = new ImageButton(this, null, 16842824);
            imageButton.setPadding(11, 11, 11, 11);
        }
        imageButton.setImageDrawable(getResources().getDrawable(2130837638));
        imageButton.setOnClickListener(new th(this, linearLayout));
        linearLayout.addView(editText, new LayoutParams(-2, -2));
        linearLayout.addView(imageButton, new LayoutParams(-2, -2));
        this.f3222d.addView(linearLayout, new LayoutParams(-1, -2));
    }

    private void m3176b(String str) {
        Cursor b = this.f3221c.m4199b("category='" + str + "'", "subcategory ASC");
        if (b != null && b.moveToFirst()) {
            int columnIndex = b.getColumnIndex("subcategory");
            do {
                String string = b.getString(columnIndex);
                m3174a(string);
                this.f3225g.add(string);
            } while (b.moveToNext());
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903091);
        setTitle(2131099692);
        if (getIntent().getStringExtra("category") != null) {
            getWindow().setSoftInputMode(3);
        }
        this.f3221c = new ro(this);
        this.f3221c.m4193a();
        this.f3223e = (EditText) findViewById(2131558756);
        this.f3223e.setFilters(new InputFilter[]{this.f3219a});
        this.f3222d = (LinearLayout) findViewById(2131558758);
        ((ImageView) findViewById(2131558757)).setImageBitmap(BitmapFactory.decodeResource(getResources(), 17301522));
        ImageButton imageButton = (ImageButton) findViewById(2131558755);
        imageButton.setImageDrawable(getResources().getDrawable(2130837505));
        imageButton.setOnClickListener(new td(this));
        Button button = (Button) findViewById(2131558761);
        Button button2 = (Button) findViewById(2131558760);
        Button button3 = (Button) findViewById(2131558759);
        aib.m3858a((Context) this, button, -1);
        aib.m3858a((Context) this, button2, -1);
        aib.m3858a((Context) this, button3, 2130837530);
        button.setOnClickListener(new te(this));
        button2.setOnClickListener(new tf(this));
        button3.setOnClickListener(new tg(this));
        this.f3224f = getIntent().getStringExtra("category");
        if (this.f3224f != null && !"".equals(this.f3224f)) {
            setTitle(2131099861);
            this.f3223e.setText(this.f3224f);
            this.f3223e.setFilters(new InputFilter[]{this.f3219a});
            button3.setVisibility(0);
            m3176b(this.f3224f);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
