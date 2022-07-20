package com.sunyun.springtest.impl;

import com.sunyun.springtest.service.IndexService;
import org.springframework.stereotype.Service;

@Service
public class IndexImpl {
	public IndexImpl(){
		System.out.println("init indeximpl");
	}
	public void query() {
		System.out.println("打印");
	}
}
