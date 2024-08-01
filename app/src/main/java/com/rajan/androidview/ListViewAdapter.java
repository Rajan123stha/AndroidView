package com.rajan.androidview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    final Context context;
    final ArrayList<PersonObject> personObjects;

    public ListViewAdapter(Context context, ArrayList<PersonObject> personObjects) {
        this.context = context;
        this.personObjects = personObjects;
    }

    @Override
    public int getCount() {
        return personObjects.size();
    }

    @Override
    public Object getItem(int position) {
        return personObjects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.listitem, parent, false);
        }

        TextView nameTextView = convertView.findViewById(R.id.nameTextView);
        TextView ageTextView = convertView.findViewById(R.id.ageTextView);
        TextView occupationTextView = convertView.findViewById(R.id.occupationTextView);
        TextView addressTextView = convertView.findViewById(R.id.addressTextView);

        nameTextView.setText(personObjects.get(position).getName());
        ageTextView.setText(String.valueOf(personObjects.get(position).getAge()));
        occupationTextView.setText(personObjects.get(position).getOccupation());
        addressTextView.setText(personObjects.get(position).getAddress());

        return convertView;
    }
}
