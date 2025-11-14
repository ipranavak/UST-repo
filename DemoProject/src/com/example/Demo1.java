package com.example;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Demo1 {
public static void main(String[] args) {
//	Date d=new Date();
//	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//	String str=sdf.format(d);
//	System.out.println(str);
	Calendar c=Calender.getInstance();
	System.out.println(c.get(Calender.DATE));
	System.out.println(c.get(Calender.HOUR));
}
}
