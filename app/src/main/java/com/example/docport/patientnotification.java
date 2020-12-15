package com.example.docport;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class patientnotification extends AppCompatActivity {
    private RecyclerView rv2;
    //private Button button;
    private patiet_notification_adapter adapter;
    private List<notification_model> ls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientnotification);
        ls=new ArrayList<>();
        ls.add(new notification_model("Your Medicine shall be delievered ","20-9-19"));
        ls.add(new notification_model("Your Medicine shall be delievered ","20-9-19"));
        ls.add(new notification_model("Your Medicine shall be delievered ","20-9-19"));
        ls.add(new notification_model("Your Medicine shall be delievered ","20-9-19"));
        ls.add(new notification_model("Your Medicine shall be delievered ","20-9-19"));
        ls.add(new notification_model("Your Medicine shall be delievered ","20-9-19"));
        ls.add(new notification_model("Your Medicine shall be delievered ","20-9-19"));
        ls.add(new notification_model("Your Medicine shall be delievered ","20-9-19"));

        rv2=findViewById(R.id.rv2);
        RecyclerView.LayoutManager manager=new LinearLayoutManager(this);
        rv2.setLayoutManager(manager);
        adapter=new patiet_notification_adapter(this,ls);
        rv2.setAdapter(adapter);


    }
}