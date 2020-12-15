package com.example.docport;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class docnotification_area extends AppCompatActivity {

    private RecyclerView rv2;

    private doc_area_adapter adapter;
    private List<String> ls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docnotification_area);
        ls=new ArrayList<>();
        ls.add("patient has requested your availabilty");
        ls.add("patient has requested your availabilty");
        ls.add("patient has requested your availabilty");
        ls.add("patient has requested your availabilty");
        ls.add("patient has requested your availabilty");
        ls.add("patient has requested your availabilty");
        ls.add("patient has requested your availabilty");
        ls.add("patient has requested your availabilty");
        ls.add("patient has requested your availabilty");
        ls.add("patient has requested your availabilty");
        ls.add("patient has requested your availabilty");
        ls.add("patient has requested your availabilty");
        rv2=findViewById(R.id.rv1);
        RecyclerView.LayoutManager manager=new LinearLayoutManager(this);
        rv2.setLayoutManager(manager);
        adapter=new doc_area_adapter(this,ls);
        rv2.setAdapter(adapter);
    }
}