package com.example.docport;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class Landing extends AppCompatActivity {

    ImageView settings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patientlanding);

        settings=findViewById(R.id.settings);
        settings.setClickable(true);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu m=new PopupMenu(Landing.this, settings);

                m.getMenuInflater().inflate(R.layout.menu1, m.getMenu());

                m.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
//                        Toast.makeText(
//                                Landing.this,
//                                "You Clicked : " + menuItem.getTitle(),
//                                Toast.LENGTH_SHORT
//                        ).show();

                        if (menuItem.getTitle().toString().equals("Logout")){
                            FirebaseAuth.getInstance().signOut();
                            Intent i=new Intent(Landing.this,MainActivity.class);
                            startActivity(i);
                            finish();
                        }
                        return true;
                    }
                });

                m.show();
            }
        });
    }


}
