package cn.com.cxsw.animation_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= (ImageView) this.findViewById(R.id.imageView);
    }

    public void start(View view) {


        /*为UI空间启动补件动画*/


        Animation hyperspaceJump = AnimationUtils.loadAnimation(this,R.anim.tween_animation_1);
        imageView.startAnimation(hyperspaceJump);
    }
}
