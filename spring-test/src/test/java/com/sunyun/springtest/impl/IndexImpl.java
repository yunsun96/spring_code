package com.sunyun.springtest.impl;

import com.sunyun.springtest.service.IndexService;
import org.springframework.stereotype.Service;

@Service
public class IndexImpl implements IndexService {
	public IndexImpl(){
		System.out.println("init indeximpl");
	}
	@Override
	public void query() {
		System.out.println("打印");
	}
}
