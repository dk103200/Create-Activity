package com.example.createactivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.Menu;
import android.widget.Button;

public class SecondActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Button btnMain = (Button)
                findViewById(R.id.btn_Main);
        btnMain.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
    }
//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.second_activity, menu);
//        return true;
//    }
}
