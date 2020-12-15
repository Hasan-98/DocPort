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

public class history_adapter extends RecyclerView.Adapter<history_adapter.historyViewHolder> {
    private List<history_model> ls;
    private Context c;
    public  history_adapter(Context c,List<history_model> ls) {
        this.c = c;
        this.ls=ls;
    }

    @NonNull
    @Override
    public history_adapter.historyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(c).inflate(R.layout.history_row,parent, false);
        return new history_adapter.historyViewHolder((itemView));
    }

    @Override
    public void onBindViewHolder(@NonNull history_adapter.historyViewHolder holder, final int position) {
        holder.text1.setText(ls.get(position).getText1());
        holder.price.setText(ls.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return ls.size();
    }

    public class historyViewHolder extends RecyclerView.ViewHolder {
        TextView text1,price;

        LinearLayout ll;
        public historyViewHolder(@NonNull View itemView) {
            super(itemView);
            text1= itemView.findViewById(R.id.text1);
            price= itemView.findViewById(R.id.price);
            ll =itemView.findViewById(R.id.l3);

        }
    }

}
