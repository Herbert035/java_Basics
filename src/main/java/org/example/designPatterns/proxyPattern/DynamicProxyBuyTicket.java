package org.example.designPatterns.proxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author matao
 * @date 2021-02-04 15:15
 * @description
 * 利用java的反射机制，实现动态代理。
 * java主要是通过Proxy类和InvocationHandler接口来给实现对代理模式的支持的。
 */
public class DynamicProxyBuyTicket  implements InvocationHandler {

    private Object toProxyObj;

    DynamicProxyBuyTicket(Object obj){
        this.toProxyObj = obj;
    }

    public static Object getProxyObject(Object obj){
        @SuppressWarnings("rawtypes")
        Class cls = obj.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(),new DynamicProxyBuyTicket(obj));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("pre invoke method:" + method);
        if(args!=null){
            //list args
            for(int i=0;i<args.length;i++){
                System.out.println(args[i]);
            }
        }
        //call real obj's method
        method.invoke(toProxyObj, args);
        System.out.println("post invoke method:" + method);
        return null;
    }

}
