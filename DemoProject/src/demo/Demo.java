package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
public static void main(String[] args) throws IOException {
//	File f1=new File("D:\\UST\\A.txt");
//	try {
//		f1.createNewFile();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	System.out.println("Succesful");
	
//	
//FileInputStream fis=new FileInputStream("D:\\UST\\B.txt");
////String Str="Welcome to UST Global";
////byte b[]=Str.getBytes();
////fis.read();
//int i=0;
//while((i=fis.read())!=-1) {
//System.out.print((char)i);
FileReader fr=new FileReader("D:\\UST\\c.txt");
//String str="Welcome to UST";
//fr.read();
int i=0;
while((i=fr.read())!=-1) {
	System.out.print((char)i);	
}

}
}
