package com.expensemanager;

import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Map;

class adk extends ArrayAdapter<Map<String, String>> {
    final /* synthetic */ NoteList f3954a;

    adk(NoteList noteList) {
        this.f3954a = noteList;
        super(noteList, 2130903159, noteList.f3543f);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f3954a.getLayoutInflater().inflate(2130903159, viewGroup, false);
        }
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(2131558643);
        if ((i / 2) * 2 != i) {
            relativeLayout.setBackgroundColor(-1141049649);
            if (this.f3954a.f3538a == 1 || this.f3954a.f3538a > 3) {
                relativeLayout.setBackgroundColor(-1724303047);
            }
        }
        ImageView imageView = (ImageView) view.findViewById(2131558411);
        if (this.f3954a.f3544g) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        Map map = (Map) this.f3954a.f3543f.get(i);
        TextView textView = (TextView) view.findViewById(2131558421);
        ((TextView) view.findViewById(2131558423)).setText((CharSequence) map.get("title"));
        textView.setText(Html.fromHtml(((String) map.get("date")) + "<br> " + ((String) map.get("content"))));
        return view;
    }
}
