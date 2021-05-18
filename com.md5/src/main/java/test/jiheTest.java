package test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

public class jiheTest {

    @Test
    public void  setTest(){
        HashSet<Object> objects = new HashSet<>();
        objects.add("d");
        objects.add(100);
        objects.add(new Object());
        objects.add(true);
        objects.add(234235235235235234L);
        // 100 已经重复, 放不进去
        objects.add(100);
        System.out.println(objects.size());
        System.out.println(objects);
        System.out.println(objects);
        System.out.println(objects);

        // Set不能用下标遍历 , 因为它是无序的
        for (int i = 0; i < objects.size(); i++) {

           System.out.println(objects);

        }

        for (Object object : objects) {

            System.out.println(object);
        }

    }

    @Test
    public void test(){
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(11);
        objects.add(22);
        objects.add(33);
        objects.add(44);
        objects.add(55);

        System.out.println(objects);
        Object old = objects.set(2, "我的第三位");
        System.out.println("被替换的老元素为" + old + "新的集合为"+objects);

        Object remove = objects.remove(2);
        System.out.println("被删除的老元素为" + remove + "新的集合为"+objects);

    }



}
