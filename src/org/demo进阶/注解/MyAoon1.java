package org.demo进阶.注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.FIELD})     //限制这个注解 只能在 成员方法 或成员变量里面使用
@Retention(RetentionPolicy.RUNTIME)                 //设置他的存活时间-运行时
@SuppressWarnings("all")
public @interface MyAoon1 {
    String intikun();
    int lz() default 167;
}
