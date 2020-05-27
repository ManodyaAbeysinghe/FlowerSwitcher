package com.example.myapp.flowerswitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void switchCat(View view){

        Log.i("Info",  "Button has been presed");

        ImageView image = (ImageView) findViewById(R.id.catimageView);
        image.setImageResource(R.drawable.flower2);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
