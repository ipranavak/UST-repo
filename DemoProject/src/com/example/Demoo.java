package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demoo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		EmployeeBean eb=new EmployeeBean(101,"Viay",6500);
		FileOutputStream fos=new FileOutputStream("D:\\UST\\demo.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(eb);
		FileInputStream fis=new FileInputStream("D\\UST\\demo.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		EmployeeBean e=(EmployeeBean)ois.readObject();
		System.out.println(e.getEid()+ " "+ e.getEname()+" "+e.getEsal());
		
	}

}
