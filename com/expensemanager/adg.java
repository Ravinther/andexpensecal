package com.expensemanager;

import java.util.Map;

class adg implements ahz {
    final /* synthetic */ NoteList f3949a;

    adg(NoteList noteList) {
        this.f3949a = noteList;
    }

    public void m3834a(int i, int i2) {
        try {
            Map map = (Map) this.f3949a.f3546i.getItem(i);
            this.f3949a.f3546i.remove(map);
            this.f3949a.f3546i.insert(map, i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
