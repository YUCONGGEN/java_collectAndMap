package com.yu.collection.arrayList;
import java.util.ArrayList;
import java.util.List;
import com.yu.collection.Students;

public abstract class ArrayListDemo {
    public static void main(String[] args) {
        Students s1 =  new  Students("yu1","12341",142);
        Students s2 =  new  Students("yu2","123412",122);
        Students s3 =  new  Students("yu3","12343",132);
        List<Students> array = new ArrayList<Students>();
        array.add(s1);
        array.add(s2);
        array.add(s2);
        for(Students s : array){
            System.out.println(s.getAge()+s.getId()+s.getName()+"-----------");
        }

    }







}
