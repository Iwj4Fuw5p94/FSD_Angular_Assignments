package com.deeps; 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEg {

	public static void main(String[] args) {
		int[] intArr = {10,5,4,8,2,6};
		Arrays.sort(intArr);
		System.out.println("Sorted intArr : " + Arrays.toString(intArr));
		
		for(int i=0;i<intArr.length;i++) {
			System.out.println(intArr[i]);
		}
		
		for(int i : intArr) {		// Enhanced For
			System.out.println(i);
		}
		
		String[] strArr = {"Krishna","Akash","Vaishu","Mithun"};
		Arrays.sort(strArr);
		System.out.println("Sorted strArr : " + Arrays.toString(strArr));

		List strList = new ArrayList<>();
		strList.add("Krishna");
		strList.add("Akash");
		strList.add("Vaishu");
		strList.add("Mithun");
		System.out.println(strList);
		
		Collections.sort(strList);
		System.out.println(strList);
		
		Employee e1 = new Employee(11,"Mathi");
		Employee e2 = new Employee(13,"Dharani");
		Employee e3 = new Employee(21,"Zakir");
		Employee e4 = new Employee(15,"Johnson");
		
		List empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		System.out.println(empList);
		
		Collections.sort(empList);
		System.out.println("Sorted Emp " +empList);
		
		
		Collections.sort(empList, new Employee().nameCompartor);
		System.out.println("Sorted based on Ename : " + empList);
		
		Collections.sort(empList, Employee.empidCompartor);
		System.out.println("Sorted based on Empno : " + empList);
	}

}












