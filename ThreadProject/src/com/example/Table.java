package com.example;



public class Table {

public static synchronized void print(int x)

{


for(int i=1;i<=5;i++)

{

System.out.println(i*x);

try {

Thread.sleep(3000);

} catch (InterruptedException e) {

// TODO Auto-generated catch block

 e.printStackTrace();

}


}
}
}