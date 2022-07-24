package com.sunyun.springtest.impl;

import com.sunyun.springtest.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexImpl implements IndexService {

	/**
	 *  spring 三种注入方式  构造器注入， set方法注入（需要@Autowired 注解，或者通过BeanFactoryPostProcessor 拿到GenericBeanDefinition setAutowireMode(2),但是必须要set开头,且不能 光set（）），field.set 反射注入(Autowired 注解)
	 *  提一下mybatis怎么解析的bean，为了不依赖spring，用的是 ImportBeanDefinitionRegistrar ,把所有的mapper对象加载进去
	 */
//	@Autowired
//	private MyFactoryBean myFactoryBean;
	public IndexImpl( MyFactoryBean myFactoryBean){
		System.out.println("prosturct indeximpl"+ myFactoryBean);
	}

	public void setss( MyFactoryBean adadad){
		System.out.println("set 方法"+adadad);
	}
	public void query() {
//		System.out.println(myFactoryBean);
	}
}
