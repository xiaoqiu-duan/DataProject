package com.xq.web.test;

import org.junit.Test;

/**
 * Package: com.xq.web.test
 * User: 段小秋
 * Email: duanxiaoqiu@jd.com
 * Date: 2018/11/6
 * Time: 15:22
 * Description:
 */
public class JVMTest extends Object {

    static Integer i1 = new Integer(1);
    static Integer i2 = new Integer(1);

    static Integer a = 1;
    static Integer b = 1;

    @Test
    public void testValue() {
        System.out.println(i1 == i2);
        System.out.println(a == b);
    }

    public static void f() {
        f();
    }

    public static void main(String[] args) {
        JVMTest jvmTest = new JVMTest();
        System.out.println(jvmTest.toString());
    }

}
