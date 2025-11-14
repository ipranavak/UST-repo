package com.training.week1;

import java.util.TreeMap;

public class StudentRankingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		map.put(109, "Rohit");
		map.put(700, "Rahul");
		map.put(320, "Virat");
		map.put(380, "Dhoni");
		map.put(500, "Kohli");
		System.out.println(map);
		System.out.println("Highest Marks: "+map.lastKey());
	}

}
