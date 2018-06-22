package com.djava.day03;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * Copyright (C) 2017-2018 https://www.htouhui.com - A project by javac
 *
 * @author xh.d
 * @since 2018/6/22 17:37
 */
@SupportedAnnotationTypes("com.djava.day03.Df")
public class DProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (TypeElement te:annotations){
            for (Element e:roundEnv.getElementsAnnotatedWith(te)){
                Df df = e.getAnnotation(Df.class);
                String[] values = df.value();
                for (String value:values){
                    System.out.println("value:"+value);
                }
            }
        }
        return true;
    }
}
