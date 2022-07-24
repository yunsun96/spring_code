package com.sunyun.springtest.test;

import com.sunyun.springtest.beanFactoryPostProcessor.BeanFactoryPostProcessorIndexDao;
import com.sunyun.springtest.beanFactoryPostProcessor.ConfigurationBeanFactoryPostProcessIndexDao;
import com.sunyun.springtest.config.AppConfig;
import com.sunyun.springtest.config.systemEnvironment;
import com.sunyun.springtest.impl.IndexImpl;
import com.sunyun.springtest.impl.MyFactoryBean;
import com.sunyun.springtest.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class springTest {
	public static void main(String[] args) {
		// 初始化容器
		AnnotationConfigApplicationContext annotationConfigApplicationContext =new AnnotationConfigApplicationContext();
		// 注册配置类
		annotationConfigApplicationContext.register(AppConfig.class);
		// 手动添加beanFactory
//		annotationConfigApplicationContext.addBeanFactoryPostProcessor(new BeanFactoryPostProcessorIndexDao());
//		annotationConfigApplicationContext.addBeanFactoryPostProcessor(new ConfigurationBeanFactoryPostProcessIndexDao());
		// 解析手动register进去的配置类以及spring自己的配置类
		annotationConfigApplicationContext.refresh();
//		MyFactoryBean myFactoryBean= (MyFactoryBean) annotationConfigApplicationContext.getBean("MyFactoryBean");
		IndexService bean = (IndexService) annotationConfigApplicationContext.getBean("indexImpl");
		bean.query();
	}

	public static void add(ArrayList list){
		list.add("123");
		list=new ArrayList();
		list.add(1);
		list.add(12);
	}
}
