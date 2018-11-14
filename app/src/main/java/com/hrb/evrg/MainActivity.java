package com.hrb.evrg;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
        Log.d("你好","easy");
        if(savedInstanceState!=null){
            Log.d("ss", "onCreate: "+ savedInstanceState.getString("keyval"));
        }
  }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("keyval","baocunde shuju");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       switch (item.getItemId()){
           case R.id.remove:
               Toast.makeText(this,"删除",Toast.LENGTH_SHORT).show();
               break;
           case R.id.add:{
               Toast.makeText(this,"添加",Toast.LENGTH_SHORT).show();
               break;
           }
       }
        return true;
    }

    public void onSingBtnClick(View view){
//        startActivity(new Intent(this,SignActivity.class));
        startActivity(new Intent("com.hrb.evrg.actionSign"));
        Toast.makeText(MainActivity.this, view.getId()+"", Toast.LENGTH_LONG).show();
    }
}
