package com.example.cw7u;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemAdapter extends ArrayAdapter {
    List<item> itemList;
    public ItemAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        itemList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.nono, parent, false);
        item currentitem = itemList.get(position);

        TextView itemnametextview = view.findViewById(R.id.itamename);
        TextView itempriceTextview = view.findViewById(R.id.itemprice);
        ImageView itemimageview = view.findViewById(R.id.itemimage);

        itemnametextview.setText(currentitem.getItemName());
        itempriceTextview.setText(String.valueOf(currentitem.getItemPrice()));
        itemimageview.setImageResource(currentitem.getItemImage());
        return view;
    }

}
