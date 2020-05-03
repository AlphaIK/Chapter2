package chapter.android.aweme.ss.com.homework;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * 作业1：
 * Logcat在屏幕旋转的时候 #onStop() #onDestroy()会展示出来
 * 但我们的 mLifecycleDisplay 由于生命周期的原因(Tips:执行#onStop()之后，UI界面我们是看不到的)并没有展示
 * 在原有@see Exercises1 基础上如何补全它，让其跟logcat的展示一样?
 * <p>
 * Tips：思考用比Activity的生命周期要长的来存储？  （比如：application、static变量）
 */
public class Exercises1 extends AppCompatActivity {

    private static TextView text1;
    static String s="";             //用以存储整个生命周期
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercese1);
        text1 = (TextView) findViewById(R.id.textview);
        s=s+ON_CREATE;
        text1.append(s);
    }

    private static final String ON_CREATE = "onCreate\n";
    private static final String ON_START = "onStart\n";
    private static final String ON_RESUME = "onResume\n";
    private static final String ON_PAUSE = "onPause\n";
    private static final String ON_STOP = "onStop\n";
    private static final String ON_RESTART = "onRestart\n";
    private static final String ON_DESTROY = "onDestroy\n";

    @Override
    protected void onRestart() {
        super.onRestart();
        s=s+ON_RESTART;
        text1.append(ON_RESTART);
    }

    @Override
    protected void onStart() {
        super.onStart();
        s=s+ON_START;
        text1.append(ON_START);
    }

    @Override
    protected void onResume() {
        super.onResume();
        s=s+ON_RESUME;
        text1.append(ON_RESUME);
    }


    @Override
    protected void onPause() {
        super.onPause();
        s=s+ON_PAUSE;
        text1.append(ON_PAUSE);
    }

    @Override
    protected void onStop() {
        super.onStop();
        s=s+ON_STOP;
        text1.append(ON_STOP);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        s=s+ON_DESTROY;
    }

}
