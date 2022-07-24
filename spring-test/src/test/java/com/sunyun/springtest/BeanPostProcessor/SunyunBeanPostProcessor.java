package com.sunyun.springtest.BeanPostProcessor;

import com.sunyun.springtest.impl.IndexImpl;
import com.sunyun.springtest.service.IndexService;
import com.sunyun.springtest.service.SunyunHandle;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

//@Component
public class SunyunBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		return Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class[]{IndexService.class},new SunyunHandle());
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		return true;
	}
}
