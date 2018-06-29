package com.djava.day05;

import com.djava.day01.AaaaZ;
import com.djava.day01.CaB;

/**
 * Copyright (C) 2017-2018 https://www.htouhui.com - A project by javac
 *
 * @author xh.d
 * @since 2018/6/29 16:48
 */
public class EaaaA {

    public void p(){
        new CaB(){
            @Override
            public void re(AaaaZ aaaaZ) {
                EaaaA.this.k();
            }
        }.re(null);
    }

    public void k(){
        System.out.println(">>>>>>>>>>>>>>>测试.this....");
    }

    public static void main(String[] args) {
        new EaaaA().p();
    }
}
