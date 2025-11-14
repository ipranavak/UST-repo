package com.training.week1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> q=new LinkedList<String>();
		q.add("Check Emails");
		q.add("Attend Meeting");
		q.add("Work on Project");
		q.add("Sleep");
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q);
		
	}

}
