package com.sunyun.springtest.config;

import com.sunyun.springtest.BeanPostProcessor.BeanPostProcessorIndexDao;
import com.sunyun.springtest.impl.IndexImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
// spring会通过是否configuration注解来判断是否full 全注解类，或者lite半注解类，全注解类通过cglib生成代理对象，lite生成原生对象
@ComponentScan(value = "com.sunyun.springtest",includeFilters ={@ComponentScan.Filter(type = FilterType.ANNOTATION)} )
public class AppConfig {
	@Bean
	// 如果是static修饰的方法，在
	public  IndexImpl indexImpl(){
		return new IndexImpl();
	}

//	@Bean
//	public BeanPostProcessorIndexDao BeanPostProcessorIndexDao(){
//		indexImpl();
//		return new BeanPostProcessorIndexDao();
//	}
}
