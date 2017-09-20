package com.hacker.hackerspot.wallbiz1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  Button  next=(Button)findViewById(R.id.next);
    next.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            Intent intent=new Intent (getBaseContext(),DisplayMessageActivity.class);
            startActivity(intent);
        }
    }) ;
    }
}



