package com.example.docport;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class History extends AppCompatActivity {
    private RecyclerView rv2;
    //private Button button;
    private history_adapter adapter;
    private List<history_model> ls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        ls=new ArrayList<>();

        ls.add(new history_model("Your Treated Patient Ali ","Rs-500"));
        ls.add(new history_model("Your Treated Patient Ali ","Rs-500"));
        ls.add(new history_model("Your Treated Patient Ali ","Rs-500"));
        ls.add(new history_model("Your Treated Patient Ali ","Rs-500"));
        ls.add(new history_model("Your Treated Patient Ali ","Rs-500"));
        ls.add(new history_model("Your Treated Patient Ali ","Rs-500"));
        ls.add(new history_model("Your Treated Patient Ali ","Rs-500"));
        ls.add(new history_model("Your Treated Patient Ali ","Rs-500"));
        ls.add(new history_model("Your Treated Patient Ali ","Rs-500"));
        ls.add(new history_model("Your Treated Patient Ali ","Rs-500"));


        rv2=findViewById(R.id.rv3);
        RecyclerView.LayoutManager manager=new LinearLayoutManager(this);
        rv2.setLayoutManager(manager);
        adapter=new history_adapter(this,ls);
        rv2.setAdapter(adapter);
    }
}