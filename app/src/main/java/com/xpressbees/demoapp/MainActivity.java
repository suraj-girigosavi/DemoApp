package com.xpressbees.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("test","on create");

        Log.d("test","comment 2");
        intiViews();

    }

    private void intiViews() {

         findViewById(R.id.btnMainOk).setOnClickListener(this);

    }

    public void click(){

        Log.d("test","click");
        Intent intent = new Intent(MainActivity.this,ActivitySecond.class);
        startActivity(intent);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btnMainOk:
                 click();
                 break;

        }

    }
}
