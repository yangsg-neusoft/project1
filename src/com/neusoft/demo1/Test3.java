package com.neusoft.demo1;

public class Test3 {

	public static void main(String[] args) {
		String str = "278";
		int x = Integer.parseInt(str);
		x += 100;
		System.out.println(x);
		
		String strs = "3.14";
		double y = Double.parseDouble(strs);
		y += 2;
		System.out.println(y);
		
		int a = 255;
		String s1 = Integer.toBinaryString(a);
		String s2 = Integer.toOctalString(a);
		String s3 = Integer.toHexString(a);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
