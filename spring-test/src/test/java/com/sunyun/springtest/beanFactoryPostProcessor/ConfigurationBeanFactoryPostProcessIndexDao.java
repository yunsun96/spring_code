package com.sunyun.springtest.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Service;

//@Service
public class ConfigurationBeanFactoryPostProcessIndexDao implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("ConfigurationBeanFactoryPostProcessIndexDao postProcessBeanDefinitionRegistry 执行");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("ConfigurationBeanFactoryPostProcessIndexDao   postProcessBeanFactory 执行");
	}
}
