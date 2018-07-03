package com.djava.day06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Copyright (C) 2017-2018 https://www.htouhui.com - A project by javac
 *
 * @author xh.d
 * @since 2018/7/3 14:27
 */
public class FaaaA {

    public static void main(String[] args) {
        Map<String,String> map = null;
        Map<String,String> copyMap = map;
        if (copyMap == null){
            map = new HashMap<String,String>();
            copyMap = map;
        }
        copyMap.put("1","dxh");
        copyMap.put("2","ddh");
        if (map==null || map.isEmpty()){
            System.out.println("validate fail!!!");
        }else {
            System.out.println("validate success!!!Map size is "+map.size());
            Set<Map.Entry<String,String>> entries = copyMap.entrySet();
            for (Map.Entry<String,String> entry:entries){
                System.out.println("[key:"+entry.getKey()+",value:"+entry.getValue()+"]");
            }
        }
    }
}
