package chapter.android.aweme.ss.com.homework;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */


public class Exercises2 extends AppCompatActivity {


    public TextView text1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercese2);
        text1=findViewById(R.id.tv_center);
        int a=getAllChildViewCount(this.getWindow().getDecorView().findViewById(android.R.id.content));
        text1.append(a+"");
    }


    public int getAllChildViewCount(View view) {
        ViewGroup vGroup = (ViewGroup) view;
        ViewGroup mRootView = (ViewGroup)vGroup.getChildAt(0);
        return mRootView.getChildCount();
    }
}
