package com.neusoft.demo1;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		
		//�Զ�װ�䣺������������ -> ��װ�����
		Integer i = 32;
		Integer j = 17;

		//�Զ����䣺��װ����� -> ������������
		int x = i;
		int y = j;
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(i);
		list.add(x);  //�Զ�װ��
		list.add(54);  //�Զ�װ��
		
		Integer m = list.get(0);
		int n = list.get(0);
		
	}

}
