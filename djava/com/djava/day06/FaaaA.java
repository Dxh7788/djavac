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
        //CMS方案使用只读和只写指向统一内存空间,模仿生产者和消费者
        //readMap 只读,writeMap只写
        Map<String,String> readMap = null;
        Map<String,String> writeMap = readMap;
        if (writeMap == null){
            readMap = new HashMap<String,String>();
            writeMap = readMap;
        }
        writeMap.put("1","dxh");
        writeMap.put("2","ddh");
        if (readMap==null || readMap.isEmpty()){
            System.out.println("validate fail!!!");
        }else {
            System.out.println("validate success!!!Map size is "+readMap.size());
            Set<Map.Entry<String,String>> entries = writeMap.entrySet();
            for (Map.Entry<String,String> entry:entries){
                System.out.println("[key:"+entry.getKey()+",value:"+entry.getValue()+"]");
            }
        }
    }
}
