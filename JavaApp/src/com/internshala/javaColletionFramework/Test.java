package com.internshala.javaColletionFramework;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args){
        Map<Integer ,String> namesMap=new HashMap();
        namesMap.put(2,"Ben");
        namesMap.put(24,"Kevin");
        namesMap.put(33,"Spiderman");

        String name=namesMap.get(33);
        System.out.println(name);
        //for each loop
        for(Map.Entry entry:namesMap.entrySet()){
            System.out.println(entry.getKey()+ "  "+entry.getValue());
        }
    }
}
