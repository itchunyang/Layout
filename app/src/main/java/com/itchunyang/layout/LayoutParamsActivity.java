package com.itchunyang.layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * ViewGroup.LayoutParams{
 *     public static final int FILL_PARENT = -1;
 *     public static final int MATCH_PARENT = -1;
 *     public static final int WRAP_CONTENT = -2;
 *     public int width;
 *     public int height;
 * }
 *
 * ViewGroup.MarginLayoutParams extends ViewGroup.LayoutParams{
 *     public int leftMargin;
 *     public int topMargin;
 *     public int rightMargin;
 *     public int bottomMargin;
 * }
 *
 *
 * public static class LayoutParams extends ViewGroup.MarginLayoutParams {
 *     public float weight;
 *     public int gravity = -1;
 * }
 *
 */
public class LayoutParamsActivity extends AppCompatActivity {

    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_params);

        linearLayout = (LinearLayout) findViewById(R.id.root);
    }

    public void add(View view) {
        TextView tv = new TextView(this);
        tv.setText("TextView");

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.leftMargin = 20;
        layoutParams.topMargin = 10;

        layoutParams.setLayoutDirection(LinearLayout.HORIZONTAL);
        linearLayout.addView(tv,layoutParams);
    }
}
