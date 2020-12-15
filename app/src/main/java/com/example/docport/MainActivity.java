package com.example.docport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    Button createAccount , Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        createAccount = (Button)findViewById(R.id.createAccount);

        FirebaseUser mUsr = FirebaseAuth.getInstance().getCurrentUser();
        if (mUsr!=null){
            startActivity(new Intent(MainActivity.this, Landing.class));
        }
//        if (i==null){
//
//        }
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i = new Intent(MainActivity.this , RegistrationActivity.class);
               startActivity(i);
            }
        });
        Login = (Button)findViewById(R.id.login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(MainActivity.this , Login.class );
                startActivity(ii);
            }
        });
    }




}