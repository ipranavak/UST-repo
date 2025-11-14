package com.example;

public class Exx2 {
	public static String validate(String day)
//	{
//		switch(day)
//		{
//		case "Monday":return ("Day 1 Meeting");
//		case "Tuesday":return ("Day 2 Meeting");
//		case "wednesday":return ("Day 3 Meeting");
//		default:System.out.println("invalid");
//		}
//		return day;
//	}
//	public static void main(String[] args) {
//		System.out.println(Exx2.validate("Tuesday"));
	String day1="Tuesday";
	String result=switch(day1) {case "Monday"->"Day 1 Meeting";
	case "Tuesday"->"Day2 meeting";
	case "Wednesday"->"Day 3 Meeting";
	default->"Invalid Day";};
	System.out.println(result);
//	{
//	case "Monday":return ("Day 1 Meeting");
//	case "Tuesday":return ("Day 2 Meeting");
//	case "wednesday":return ("Day 3 Meeting");
//	default:System.out.println("invalid");
//	}
//	return day;
	}
}
