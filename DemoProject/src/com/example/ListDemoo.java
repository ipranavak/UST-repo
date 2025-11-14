package com.example;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ListDemoo {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(3,1,5,6,2,8);
//		Consumer<Integer> c=new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				// TODO Auto-generated method stub
//				
//			}
//	};
//	l.forEach(c);
//	l.forEach(new MyObject());
//	l.forEach(nums->System.out.println(nums));
		Stream<Integer> s=l.stream();
		s.forEach(nums->System.out.println(nums));

}
}
