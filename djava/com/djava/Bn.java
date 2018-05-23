package com.djava;

/**
 * Copyright (C) 2017-2018 https://www.htouhui.com - A project by javac
 *
 * @author xh.d
 * @since 2018/5/23 10:29
 */
public class Bn {

    public static void main(String[] args) {
        Bn bn = new Bn();
        System.out.println(bn.check(bn));
        System.out.println(Bn.class.toString());
        System.out.println(InnerBn.class.toString());
    }
    public static class InnerBn{

    }
    public boolean check(Bn bn){
        return this == bn;
    }
}
