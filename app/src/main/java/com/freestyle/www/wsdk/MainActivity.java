package com.freestyle.www.wsdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.freestyle.www.wsdk.proxy.Proxy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Proxy.testDynamicProxy();
    }
}
