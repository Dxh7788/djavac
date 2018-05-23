package com.djava;

import java.io.File;

/**
 * Copyright (C) 2017-2018 https://www.htouhui.com - A project by javac
 *
 * @author xh.d
 * @since 2018/5/23 10:29
 */
public class Cn {

    public static void main(String[] args) {
        File pf = new File(System.getProperty("user.dir") + "\\src\\com\\sun\\source\\tree");
        int i=0;
        if (pf.exists()){
            File[] files = pf.listFiles();
            for (File file:files){
                String name = file.getName();
                String subName = name.substring(0,name.length()-9);
                if (name.endsWith("Tree.java")){
                    System.out.println(name.substring(0,name.length()-5)+"<->JC"+subName);
                    i++;
                }
            }
            System.out.println(i);
        }
    }
}
