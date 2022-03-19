package com.yu.collection.hashset;

import com.yu.collection.Students;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Students> set = new HashSet<Students>();
        Students s1 =  new  Students("yu1","12341",142);
        Students s2 =  new  Students("yu2","123412",122);
        Students s3 =  new  Students("yu3","12343",132);
        set.add(s1);
        set.add(s2);
        set.add(s2);

        for( Students s : set){
            System.out.println(s.getAge()+s.getId()+s.getName()+"-----------");
        }

    }
}
