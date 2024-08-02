package com.rajan.androidview;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private final ArrayList<PersonObject> personObjects;

    public RecyclerViewAdapter(ArrayList<PersonObject> personObjects) {
        this.personObjects = personObjects;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PersonObject personObject = personObjects.get(position);
        holder.nameTextView.setText(String.format("Name: %s", personObject.getName()));
        holder.ageTextView.setText(String.format("Age: %d", personObject.getAge()));
        holder.occupationTextView.setText(String.format("Occupation: %s", personObject.getOccupation()));
        holder.addressTextView.setText(String.format("Address: %s", personObject.getAddress()));
    }

    @Override
    public int getItemCount() {
        return personObjects.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView, ageTextView, occupationTextView, addressTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            ageTextView = itemView.findViewById(R.id.ageTextView);
            occupationTextView = itemView.findViewById(R.id.occupationTextView);
            addressTextView = itemView.findViewById(R.id.addressTextView);
        }
    }
}
