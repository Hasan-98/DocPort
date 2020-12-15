package com.example.docport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class patiet_notification_adapter extends RecyclerView.Adapter<patiet_notification_adapter.notifyViewHolder> {
    private List<notification_model> ls;
    private Context c;
    public  patiet_notification_adapter(Context c,List<notification_model> ls) {
        this.c = c;
        this.ls=ls;
    }

    @NonNull
    @Override
    public patiet_notification_adapter.notifyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(c).inflate(R.layout.patient_notification_row,parent, false);
        return new patiet_notification_adapter.notifyViewHolder((itemView));
    }

    @Override
    public void onBindViewHolder(@NonNull patiet_notification_adapter.notifyViewHolder holder, final int position) {
        holder.text.setText(ls.get(position).getText());
        holder.date.setText(ls.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return ls.size();
    }

    public class notifyViewHolder extends RecyclerView.ViewHolder {
        TextView text,date;

        LinearLayout ll;
        public notifyViewHolder(@NonNull View itemView) {
            super(itemView);
            text= itemView.findViewById(R.id.text);
            date= itemView.findViewById(R.id.date);
            ll =itemView.findViewById(R.id.l2);

        }
    }

}
