package com.neusoft.demo1;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		
		//自动装箱：基本数据类型 -> 包装类对象
		Integer i = 32;
		Integer j = 17;

		//自动拆箱：包装类对象 -> 基本数据类型
		int x = i;
		int y = j;
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(i);
		list.add(x);  //自动装箱
		list.add(54);  //自动装箱
		
		Integer m = list.get(0);
		int n = list.get(0);
		
	}

}
