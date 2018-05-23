package com.djava;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xh.d
 * @since 2018/5/23 10:29
 */
public class Cn {

    public static void main(String[] args) {
        File pf = new File(System.getProperty("user.dir") + "\\src\\com\\sun\\source\\tree");
        List<String> listStates = new ArrayList<>(0);
        List<String> listExprs = new ArrayList<>(0);
        List<String> listDefs = new ArrayList<>(0);
        if (pf.exists()){
            File[] files = pf.listFiles();
            for (File file:files){
                String name = file.getName();
                String subName = name.substring(0,name.length()-9);
                if (name.endsWith("Tree.java")){
                    try {
                        //非空校验
                        String className = "com.sun.tools.javac.tree.JCTree"+"$JC"+subName;
                        Class clazz = Class.forName(className);
                        //获取父类
                        String clazzSuperName = clazz.getSuperclass().getName();
                        if (clazzSuperName.contains("$")){
                            String item = clazzSuperName.substring(clazzSuperName.indexOf("$")+1);
                            switch (item){
                                case "JCStatement":
                                    listStates.add(name.substring(0,name.length()-5)+"<->"+subName+"<->JC"+subName);
                                    break;
                                case "JCExpression":
                                    listExprs.add(name.substring(0,name.length()-5)+"<->"+subName+"<->JC"+subName);
                                    break;
                            }
                        }else {
                            listDefs.add(name.substring(0, name.length() - 5) + "<->" + subName + "<->JC" + subName);
                        }
                    } catch (ClassNotFoundException e) {
                        continue;
                    }
                }
            }
            System.out.println("Statement:"+listStates.size());
            for (String f:listStates){
                System.out.println(f);
            }
            System.out.println("Expression:"+listExprs.size());
            for (String f:listExprs){
                System.out.println(f);
            }
            System.out.println("Other:"+listDefs.size());
            for (String f:listDefs){
                System.out.println(f);
            }
        }
    }
}
