package com.freestyle.www.wsdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yuxumou on 17-10-31.
 */

public class Proxy {
    /**
     * 测试动态代理
     */
    public static void testDynamicProxy() {
        // 目标对象Jerry
        final IService jerry = new Jerry();

        //老王代理Jerry找女朋友
        IService proxyLaoWang = (IService) java.lang.reflect.Proxy.newProxyInstance(jerry.getClass().getClassLoader(),
                jerry.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object value = method.invoke(jerry,args);
                        return value;
                    }
                });
        proxyLaoWang.findGirl("Lily",25);
        proxyLaoWang.buyPhone("iphone X");
    }

}
