package com.freestyle.www.wsdk.proxy;

import android.util.Log;

/**
 * 目标对象 ： 单身汪 Jerry
 * Created by yuxumou on 17-10-31.
 */

public class Jerry implements IService {

    private static final String TAG = "Jerry";


    @Override
    public void findGirl(String name, int age) {
        Log.i(TAG,name + "说愿意做Jerry的女朋友");
    }

    @Override
    public void buyPhone(String type) {
        Log.i(TAG,"买到" + type + "手机");
    }
}
