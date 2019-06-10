package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class People {
    public static void main(String[] args) {
        People p = new People();
        p.name="zhangsan";
        p.age=21;

        System.out.println(p);
        System.out.println(p.toString());
        System.out.println("你好，我是：" + p);

        Map list = new HashMap();
        list.put(123,321);
        System.out.println(list);
    }
    private String name;
    private int age;

//    @Override
//    public String toString() {
//        return "People{name=" + name + ", age=" + age + '}';
//    }
}
