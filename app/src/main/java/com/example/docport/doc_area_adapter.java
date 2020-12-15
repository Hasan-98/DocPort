package com.example.docport;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class doc_area_adapter extends RecyclerView.Adapter<doc_area_adapter.docViewHolder> {
    private List<String> ls;
    private Context c;
    public  doc_area_adapter(Context c,List<String> ls) {
        this.c = c;
        this.ls=ls;
    }

    @NonNull
    @Override
    public doc_area_adapter.docViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(c).inflate(R.layout.doctor_notification_area_row,parent, false);
        return new docViewHolder((itemView));
    }

    @Override
    public void onBindViewHolder(@NonNull doc_area_adapter.docViewHolder holder, final int position) {
        holder.title.setText(ls.get(position));
    }

    @Override
    public int getItemCount() {
        return ls.size();
    }

    public class docViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        LinearLayout ll;
        public docViewHolder(@NonNull View itemView) {
            super(itemView);
            title= itemView.findViewById(R.id.title);
            ll =itemView.findViewById(R.id.l2);

        }
    }

}
