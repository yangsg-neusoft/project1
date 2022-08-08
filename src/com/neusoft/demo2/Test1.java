package com.neusoft.demo2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test1 {
	
	public static final int scale = 7;

	public static void main(String[] args) {
		double a = 3.14;
		int b = 2;
		
		String s1 = a + "";
		String s2 = b + "";
		
		//装箱：必须使用字符串类型，不要使用原始类型
		BigDecimal b1 = new BigDecimal(s1);
		BigDecimal b2 = new BigDecimal(s2);
		
		BigDecimal b3 = b1.add(b2);
		System.out.println(b3);
		BigDecimal b4 = b1.subtract(b2);
		BigDecimal b5 = b1.multiply(b2);
		System.out.println(b4);
		System.out.println(b5);
		
		BigDecimal x1 = new BigDecimal("10.3");
		BigDecimal x2 = new BigDecimal("3");
		BigDecimal x3 = x1.divide(x2, scale, RoundingMode.HALF_UP);
		System.out.println(10.3 / 3);
		System.out.println(x3);
		
		double x = x3.doubleValue();
		System.out.println(x);
	}

}
