package com.example.createactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import  android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOpen = (Button)
                findViewById(R.id.btn_Second);
        btnOpen.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        doOpen();
                    }
                });
    }
    public void doOpen(){
        Intent myIntent = new Intent(MainActivity.this , SecondActivity.class);
        startActivity(myIntent);
    }
//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.activity_main,menu);
//        return true;
//    }
}