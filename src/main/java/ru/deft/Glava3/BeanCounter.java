package ru.deft.Glava3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by s.golitsyn
 */

public class BeanCounter implements BeanFactoryPostProcessor {
    private Logger LOGGER = Logger.getLogger(String.valueOf(BeanCounter.class));
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {
        LOGGER.log(Level.ALL, "BEAN COUNT:" + factory.getBeanDefinitionCount());

    }
}
