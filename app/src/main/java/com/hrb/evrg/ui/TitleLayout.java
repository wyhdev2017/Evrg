package com.hrb.evrg.ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.hrb.evrg.R;

import static android.content.ContentValues.TAG;

/**
 * Created by wyh on 2018/11/13.
 */

public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        findViewById(R.id.title_back).setOnClickListener(onClickListener);
        findViewById(R.id.title_edit).setOnClickListener(onClickListener);
    }

    OnClickListener onClickListener=new OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d(TAG, "onClick-id: "+v.getId());
            switch (v.getId()){
                case R.id.title_back:
                    Toast.makeText(getContext(),"点击返回了",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.title_edit:
                    Toast.makeText(getContext(),"点击编辑了",Toast.LENGTH_SHORT).show();
                    break;
            }


        }
    };
}
