package com.itchunyang.layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 *
 * 大家写项目的时候肯定会有一些东西提前写好，但是不到一定条件是不想让它显示出来的，我们可能的做法就是让它 View . GONE 或 View .INVISIBLE
 * 等到一定条件了在代码里面这设置 View .VISIBLE 虽然这样写起来也挺方便的，也符合逻辑，但是这个条件是八百年都不出一次，你这么写就有点大才小用了，
 * 因为你事先布局好的 Inflate， 也就是说 也就是说仍然会创建对象，会被实例化，会被设置属性。也就是说，会耗费内存等资源。
 *
 *
 * 在程序运行过程中动态的根据当前条件来决定是否显示某个控件或布局，这时就可以使用惰性控件ViewStub来方便的完成这一功能。
 * 　惰性控件ViewStub是一个轻量级的View，可以实现动态布局加载。ViewStub对象是一个看不见的，零大小的视图，并在程序运行时根据需要进行动态加载。
 * 只有当ViewStub对象被设置为可见，或是调用了ViewStub.inflate()方法时，ViewStub对象所指向的布局才会被实例化，并加载到指向的父布局中。
 * 这样，便通过惰性控件ViewStub实现了动态加载某个控件或布局。
 */

public class ViewStubActivity extends AppCompatActivity {

    private TextView tv;
    private ViewStub viewStub;
    private boolean isInflate = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_stub);

        tv = (TextView) findViewById(R.id.tv);

        tv.setText("\t\t\t宝贝与描述相符    **** 0分\n\t\t\t卖家的服务态度    **** 0分\n\t\t\t卖家发货的速度    **** 0分\n\t\t\t物流发货的速度    **** 0分\n");
        viewStub = (ViewStub) findViewById(R.id.viewStub);
    }

    /**
     * 　在使用惰性控件ViewStub时有两点需要特别注意：

     　　（1）ViewStub对象只可以Inflate一次，之后ViewStub对象会被置为空。按句话说，某个被ViewStub对象指定的布局被Inflate一次之后，就不可以再次通过ViewStub对象来控制它了。

     　　（2）ViewStub控件只能用来Inflate一个布局文件，而不能Inflate某个具体的View。
     */
    public void show(View view) {
        if(!isInflate){
            View view1 = viewStub.inflate();
            LinearLayout linearLayout = (LinearLayout)view1;
            isInflate = true;
        }else
            viewStub.setVisibility(View.VISIBLE);

    }

    public void hide(View view) {
        viewStub.setVisibility(View.GONE);
    }
}
