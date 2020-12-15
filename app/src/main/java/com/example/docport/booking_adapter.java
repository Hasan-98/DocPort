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

public class booking_adapter extends RecyclerView.Adapter<booking_adapter.bookingViewHolder> {
    private List<booking_model> ls;
    private Context c;
    public  booking_adapter(Context c,List<booking_model> ls) {
        this.c = c;
        this.ls=ls;
    }

    @NonNull
    @Override
    public booking_adapter.bookingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(c).inflate(R.layout.booking_row,parent, false);
        return new booking_adapter.bookingViewHolder((itemView));
    }

    @Override
    public void onBindViewHolder(@NonNull booking_adapter.bookingViewHolder holder, final int position) {
        holder.tn.setText(ls.get(position).getTn());
        holder.doctor.setText(ls.get(position).getDoctor());
        holder.charges.setText(ls.get(position).getCharges());
    }

    @Override
    public int getItemCount() {
        return ls.size();
    }

    public class bookingViewHolder extends RecyclerView.ViewHolder {
        TextView tn,doctor,charges;
        LinearLayout ll;
        public bookingViewHolder(@NonNull View itemView) {
            super(itemView);
           tn=itemView.findViewById(R.id.tn);
            doctor=itemView.findViewById(R.id.doctor);
            charges=itemView.findViewById(R.id.Charges);
            ll =itemView.findViewById(R.id.l4);

        }
    }

}