package com.sunyun.springtest.BeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.testfixture.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BeanPostProcessorIndexDao implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(bean.getClass().getName()+"----前置方法执行");
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(bean.getClass().getName()+"----后置方法执行");
		return null;
	}
}
