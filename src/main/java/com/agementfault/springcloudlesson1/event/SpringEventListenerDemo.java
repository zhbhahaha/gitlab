package com.agementfault.springcloudlesson1.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEventListenerDemo {

    /**
     * 事件监听者模式
     * @param args
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext();
        //增加监听器
        context.addApplicationListener(new MyAplicationListener());
        //启动上下文
        context.refresh();
        //发布
        context.publishEvent(new MyApplicationEvent("Hello,Word"));
        context.publishEvent(new MyApplicationEvent("Hello,Word"));
        context.publishEvent(new MyApplicationEvent("Hello,Word"));

    }

    /**
     * 创建个人的监听器
     */
    public static class MyAplicationListener implements ApplicationListener<MyApplicationEvent>{

        /**
         * Handle an application event.
         *
         * @param event the event to respond to
         */
        @Override
        public void onApplicationEvent(MyApplicationEvent event) {
            //event.getSource();表示来源的东西，定义为object；
            System.out.printf("MyApplicationListener receives event source : %s \n",event.getSource());
        }
    }

    /**
     * 定义一个事件类
     */
    public static class MyApplicationEvent extends ApplicationEvent{

        /**
         * Create a new ApplicationEvent.
         *需要传递一个相对的源过来
         * @param source the object on which the event initially occurred (never {@code null})
         */
        public MyApplicationEvent(Object source) {
            super(source);
        }

    }

}
