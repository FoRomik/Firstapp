package com.example.foromik.list_view;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<String> {

    final Context c;
    ArrayList<String> languages;

    public CustomAdapter(Context context, ArrayList<String> languages) {
        super(context,R.layout.activity_main,languages);

        this.c = context;
        this.languages = languages;
    }

    public View getView(int position,View convertView,ViewGroup parent)
    {
        LayoutInflater inflater =(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.activity_main,parent,false);
        TextView tv = (TextView) row.findViewById(R.id.textView1);
        ImageView img = (ImageView) row.findViewById(R.id.imageView1);
        String item=languages.get(position);
        img.setImageResource(R.drawable.images);
        tv.setText(item);

        if(position % 2 == 0)
        {
            row.setBackgroundColor(Color.WHITE);
        }else
        {
            row.setBackgroundColor(Color.LTGRAY);
        }
        return row;
    }
}
