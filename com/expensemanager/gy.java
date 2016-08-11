package com.expensemanager;

import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import java.util.ArrayList;

class gy implements OnQueryTextListener {
    final /* synthetic */ ArrayList f4715a;
    final /* synthetic */ SearchView f4716b;
    final /* synthetic */ ExpenseAccountList f4717c;

    gy(ExpenseAccountList expenseAccountList, ArrayList arrayList, SearchView searchView) {
        this.f4717c = expenseAccountList;
        this.f4715a = arrayList;
        this.f4716b = searchView;
    }

    public boolean onQueryTextChange(String str) {
        if (str.length() >= 2) {
            this.f4715a.clear();
            String str2 = (String) this.f4717c.f2755a.get("MY_ACCOUNT_NAMES");
            if (str2 == null || "".equals(str2)) {
                str2 = "Personal Expense";
            }
            this.f4717c.f2761g = str2.split(",");
            this.f4717c.f2762h = new String[this.f4717c.f2761g.length];
            if (!(str == null || "".equals(str))) {
                String[] split = str.toLowerCase().split(",");
                this.f4717c.f2756b = "";
                int i = 0;
                while (i < this.f4717c.f2761g.length) {
                    this.f4717c.f2762h[i] = aib.m3865b((String) this.f4717c.f2755a.get(this.f4717c.f2761g[i] + "_DESCRIPTION"));
                    int i2 = 0;
                    while (i2 < split.length) {
                        if (this.f4717c.f2761g[i].toLowerCase().indexOf(split[i2].trim()) != -1 || this.f4717c.f2762h[i].toLowerCase().indexOf(split[i2].trim()) != -1) {
                            this.f4715a.add(this.f4717c.f2761g[i]);
                        }
                        i2++;
                    }
                    i++;
                }
                this.f4716b.setSuggestionsAdapter(ExpenseCategoryExpandableList.m2907a(this.f4717c.f2763i, (String[]) this.f4715a.toArray(new String[this.f4715a.size()])));
            }
        }
        return true;
    }

    public boolean onQueryTextSubmit(String str) {
        String charSequence = this.f4716b.getQuery().toString();
        if (!(charSequence == null || "".equals(charSequence))) {
            String[] split = charSequence.toLowerCase().split(",");
            charSequence = (String) this.f4717c.f2755a.get("MY_ACCOUNT_NAMES");
            if (charSequence == null || "".equals(charSequence)) {
                charSequence = "Personal Expense";
            }
            this.f4717c.f2761g = charSequence.split(",");
            this.f4717c.f2762h = new String[this.f4717c.f2761g.length];
            this.f4717c.f2756b = "";
            int i = 0;
            while (i < this.f4717c.f2761g.length) {
                this.f4717c.f2762h[i] = aib.m3865b((String) this.f4717c.f2755a.get(this.f4717c.f2761g[i] + "_DESCRIPTION"));
                int i2 = 0;
                while (i2 < split.length) {
                    if (this.f4717c.f2761g[i].toLowerCase().indexOf(split[i2].trim()) != -1 || this.f4717c.f2762h[i].toLowerCase().indexOf(split[i2].trim()) != -1) {
                        if ("".equals(this.f4717c.f2756b)) {
                            this.f4717c.f2756b = this.f4717c.f2761g[i];
                        } else {
                            this.f4717c.f2756b += "," + this.f4717c.f2761g[i];
                        }
                    }
                    i2++;
                }
                i++;
            }
            this.f4717c.onCreate(null);
        }
        return true;
    }
}
