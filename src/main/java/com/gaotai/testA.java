package com.gaotai;

import java.lang.annotation.*;

/**
 * @author： hzm
 * @date： 2021/2/26 9:36
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
@Target(ElementType.TYPE)
//需要注意的是，如果一个注解要在运行时被成功提取，那么 @Retention(RetentionPolicy.RUNTIME) 是必须的。
@Retention(RetentionPolicy.RUNTIME)
@Inherited
//该注解Desc前增加了三个注解：Retention表示的是该注解的保留级别，Target表示的是注解可以标注在什么地方，@Inherited表示该注解会被自动继承。
public @interface testA {
    int id();
    String msg();

}
//1、注解的官方释义
//        注解是一系列元数据，它提供数据用来解释程序代码，但是注解并非是所解释的代码本身的一部分。注解对于代码的运行效果没有直接影响。
//
//        2、注解有许多用处：
//        ① 提供信息给编译器：编译器可以利用注解来探测错误或警告信息
//
//        ② 编译阶段时的处理：软件工具可以利用注解信息来生成代码、HTML文档或其它响应处理。
//
//        ③ 运行时的处理：某些注解可以在程序运行时接受代码的提取。
//
//        值得注意的是，注解不是代码本身的一部分。
//        ————————————————
//        版权声明：本文为CSDN博主「素小暖」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//        原文链接：https://blog.csdn.net/guorui_java/article/details/106658179