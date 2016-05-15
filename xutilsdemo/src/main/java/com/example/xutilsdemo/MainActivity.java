package com.example.xutilsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;


public class MainActivity extends AppCompatActivity {

    @ViewInject(R.id.textView)
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*初始化*/
        x.Ext.init(getApplication());
        x.Ext.setDebug(BuildConfig.DEBUG); // 是否输出debug日志, 开启debug会影响性能.
        /*View注入*/
        x.view().inject(this);
        textView.setText("************");

    }



    @Event(value = {R.id.textView,R.id.button},type= View.OnClickListener.class)
    private void ss(View view){

        Toast.makeText(this,"************",Toast.LENGTH_SHORT).show();

    }




}
