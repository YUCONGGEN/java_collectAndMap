package com.yu.map;

import com.yu.collection.Students;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
//        Students s1 =  new  Students("yu1","12341",142);
//        Students s2 =  new  Students("yu2","123412",122);
//        Students s3 =  new  Students("yu3","12343",132);
        map.put("12344","yu");
        map.put("343","dsff");
        System.out.println(map);

    }

}
