package com.itchunyang.layout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void frameLayout(View view) {
        startActivity(new Intent(this,FrameActivity.class));
    }

    public void relativeLayout(View view) {
        startActivity(new Intent(this,RelativeActivity.class));
    }

    public void tableLayout(View view) {
        startActivity(new Intent(this,TableActivity.class));
    }

    public void include(View view) {
        startActivity(new Intent(this,IncludeActivity.class));
    }

    public void merge(View view) {
//        startActivity(new Intent(this,MergeActivity.class));
        startActivity(new Intent(this,MergeActivity1.class));
    }

    public void viewStub(View view) {
        startActivity(new Intent(this,ViewStubActivity.class));
    }

    public void layoutParams(View view) {
        startActivity(new Intent(this,LayoutParamsActivity.class));
    }
}
