package com.neusoft.demo1;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		int a = 32;
		int b = 17;
		
		//װ�䣺������������ -> ��װ�����
		Integer i = new Integer(a);
		Integer j = new Integer(b);

		//���䣺��װ����� -> ������������
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
