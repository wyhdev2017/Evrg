package com.hrb.evrg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
    }
    public void backHome(View view){
       Intent myintent= new Intent("android.intent.action.MAIN");
        myintent.addCategory("com.hrb.evrg.MY_Category");

//        startActivity(myintent);
        startActivity(new Intent(this,MainActivity.class));
    }
}
