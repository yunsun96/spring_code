package com.sunyun.springtest.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class BeanFactoryPostProcessorIndexDao implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryPostProcessorIndexDao---工厂方法执行");
		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("indexImpl");
//		genericBeanDefinition.getConstructorArgumentValues();
		//设置注入方法为 set注入
		genericBeanDefinition.setAutowireMode(2);
	}
}
