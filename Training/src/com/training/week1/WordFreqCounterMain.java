package com.training.week1;

import java.util.HashMap;
import java.util.Scanner;

public class WordFreqCounterMain {
	public static void splitWords(String str) {
		String[] words = str.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String word : words) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}
		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("Total unique words"+map.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		splitWords(str);
		

	}

}
