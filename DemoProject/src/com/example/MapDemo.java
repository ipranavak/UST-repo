package com.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//public class MapDemo {
//	public static void main(String[] args) {
////		HashMap hm=new HashMap();
////		hm.put(3,"Mango");
////		hm.put('x', 33.44f);
////		hm.put("A", 55);
////		hm.put(3, "Apple");
////		System.out.println(hm);
////		System.out.println(hm.get(3));
////		
////		LinkedHashMap hm=new LinkedHashMap();
////		hm.put(3,"Mango");
////		hm.put('x', 33.44f);
////		hm.put("A", 55);
////		hm.put(3, "Apple");
////		System.out.println(hm);
////		System.out.println(hm.get(3));
////		System.out.println(hm.containsKey(3));
//		
//		TreeMap hm=new TreeMap();
//		hm.put(3,"Mango");
//		hm.put(2, "33.44f");
//		hm.put(4, "55");
//		hm.put(3, "Apple");
//		Set<Integer>s=hm.keySet();
//		System.out.println(hm);
//		System.out.println(hm.get(3));
//		System.out.println(hm.containsKey(3));
//		for(int x:s) {
//}
//			
//			Collection<String> c=hm.values();
//			for(String str:c)
//			{
//				System.out.println(str);
//			}
//			
//			for(Map.Entry<Integer,String> m:hm.entrySet())
//			{
//				System.out.println(m.getKey()+" "+m.getValue());
//			}
//		}
//
//		
package com.example;

public class CompanyBean {
private String cmpName;
private int empid;
private String cmpAddress;
public CompanyBean(String cmpName, int empid, String cmpAddress) {
	this.cmpName = cmpName;
	this.empid = empid;
	this.cmpAddress = cmpAddress;
}
public String getCmpName() {
	return cmpName;
}
public int getEmpid() {
	return empid;
}
public String getCmpAddress() {
	return cmpAddress;
}
@Override
public String toString() {
	return "CompanyBean [cmpName=" + cmpName + ", empid=" + empid + ", cmpAddress=" + cmpAddress + "]\n";
}

}
--------------------------------------------------------------------------------------------------------------

package com.example;

public class EmployeeBean {
private int empid;
private String empname;
private int empsal;
public EmployeeBean(int empid, String empname, int empsal) {
	this.empid = empid;
	this.empname = empname;
	this.empsal = empsal;
}
public int getEmpid() {
	return empid;
}
public String getEmpname() {
	return empname;
}
public int getEmpsal() {
	return empsal;
}
@Override
public String toString() {
	return "EmployeeBean [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + "]\n";
}
}
-------------------------------------------------------------------------------------------------
package com.example;

import java.util.*;

public class MapDemo {
public static void main(String[] args) {
	HashMap<CompanyBean,EmployeeBean> hm=new HashMap<CompanyBean,EmployeeBean>();
	hm.put(new CompanyBean("UST", 101, "Trivandrum"), new EmployeeBean(101, "Karthik", 45000));
	hm.put(new CompanyBean("TCS", 102, "Chennai"), new EmployeeBean(102, "Praveen", 55000));
	hm.put(new CompanyBean("UST", 103, "Bangalore"), new EmployeeBean(103, "Vijay", 65000));
	hm.put(new CompanyBean("TCS", 104, "Bangalore"), new EmployeeBean(104, "Pavan", 75000));
	hm.put(new CompanyBean("Wipro", 105, "Chennai"), new EmployeeBean(105, "Gokul", 56000));
	for(Map.Entry m:hm.entrySet())
	{
		CompanyBean cmp=(CompanyBean)m.getKey();
		EmployeeBean emp=(EmployeeBean)m.getValue();
		
//		if(cmp.getCmpName().equals("UST"))
//		{
//			System.out.println(emp.getEmpname());
//		}
		if(emp.getEmpsal()>=70000)
		{
			System.out.println(emp.getEmpname());
		}
		
	}
	
}
}


}

		
	}

