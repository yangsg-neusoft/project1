package com.neusoft.demo1;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		int a = 32;
		int b = 17;
		
		//装箱：基本数据类型 -> 包装类对象
		Integer i = new Integer(a);
		Integer j = new Integer(b);

		//拆箱：包装类对象 -> 基本数据类型
		int x = i.intValue();
		int y = j.intValue();
		
		
		System.out.println(x);
		System.out.println(y);
		//
		List list = new ArrayList();
		list.add(i);
		list.add(j);

	}

}
