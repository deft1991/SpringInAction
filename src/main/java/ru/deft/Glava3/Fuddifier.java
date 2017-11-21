package ru.deft.Glava3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;

/**
 * Created by s.golitsyn
 */

public class Fuddifier implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();

        try {
            for (int i = 0; i < fields.length; i++) {
                if (fields[i].getType().equals(java.lang.String.class)) {
                    fields[i].setAccessible(true);
                    String origin = (String) fields[i].get(bean);
                    fields[i].set(bean, fuddify(origin));
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return bean;
    }

    private String fuddify(String origin) {
        if (origin == null) return origin;
        return origin.replaceAll("(r|l)", "w").replaceAll("(R|L)", "W");
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
