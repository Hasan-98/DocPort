package com.example.docport;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Booking extends AppCompatActivity {
    private RecyclerView rv2;
    //private Button button;
    private booking_adapter adapter;
    private List<booking_model> ls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        ls=new ArrayList<>();

        ls.add(new booking_model("Dr Arshad","Heart Diseases","Rs:700"));
        ls.add(new booking_model("Dr Arshad","Heart Diseases","Rs:700"));
        ls.add(new booking_model("Dr Arshad","Heart Diseases","Rs:700"));
        ls.add(new booking_model("Dr Arshad","Heart Diseases","Rs:700"));
        ls.add(new booking_model("Dr Arshad","Heart Diseases","Rs:700"));
        ls.add(new booking_model("Dr Arshad","Heart Diseases","Rs:700"));
        ls.add(new booking_model("Dr Arshad","Heart Diseases","Rs:700"));
        ls.add(new booking_model("Dr Arshad","Heart Diseases","Rs:700"));

        rv2=findViewById(R.id.rv4);
        RecyclerView.LayoutManager manager=new LinearLayoutManager(this);
        rv2.setLayoutManager(manager);
        adapter=new booking_adapter(this,ls);
        rv2.setAdapter(adapter);

    }
}