package com.djava;

/**
 * @author xh.d
 * @since 2018/5/23 10:29
 */
public class En {

    public static void main(String[] args) {
        int m = 5;

        loop:while (true) {
            switch (m) {
                case 0:
                    System.out.println("0");
                    break ;
                case 1:
                    System.out.println("1");
                    break ;
                case 2:
                    System.out.println("2");
                    break ;
                case 3:
                    System.out.println("3");
                    break ;
                case 4:
                    break ;
                default:
                    break loop;
            }
        }
        System.out.println("loop");
    }
}
