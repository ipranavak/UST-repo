package com.training.week1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(10);
		list.add(40);
		HashSet set=new HashSet(list);
		System.out.println("original list: "+list);
		System.out.println("HashSet: "+set);
	}

}
