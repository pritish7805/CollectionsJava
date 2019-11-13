package listConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistConcept {

	public static <E> void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.add(60);
		
		System.out.println(ar.size());
		System.out.println("------------------------------------------");
		System.out.println(ar.get(5));
		System.out.println("------------------------------------------");
		for(int i=0;i<ar.size();i++) {
			
			System.out.println(ar.get(i));
		}
		System.out.println("------------------------------------------");
		//when not sure about what data type is going to be there in the ArrayList
		//<E> also has to be mentioned in the void main declaration.
		ArrayList<E> ar1=new ArrayList<E>();
		//ar1.add(0, "E 30");How to add??
		
		//Adding values to Employee class Object
		
		Employee e1 = new Employee("Gary",20,"QA");
		Employee e2 = new Employee("Scott",30,"DEV");
		Employee e3 = new Employee("Kevin",40,"ADMIN");
				
		
		ArrayList<Employee> ar2=new ArrayList<Employee>();
		
		ar2.add(e1);
		ar2.add(e2);
		ar2.add(e3);
		
		for(int j=0;j<ar2.size();j++) {
			System.out.println(ar2.get(j));
		}
		System.out.println("------------------------------------------");
		//Iterator concept - to traverse through the elements of the Object ArrayList
		Iterator<Employee> it=ar2.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name+"-------"+emp.age+"-----"+emp.dept);
			
		}
		System.out.println("--------------------------------------");
		//addAll - adding all elements from one arrayList to another
		
		ArrayList<String> ar3=new ArrayList<String>();
		ar3.add("Apple");
		ar3.add("Ball");
		ar3.add("Cat");
		
		ArrayList<String> ar4=new ArrayList<String>();
		ar4.add("Apache");
		ar4.add("Boolean");
		ar4.add("Command");
		
		ar3.addAll(ar4);
		
		for (int k=0;k<ar3.size();k++) {
			System.out.println(ar3.get(k));
		}
		System.out.println("-----------------------------------------");
		//removeAll()
		
		ar3.removeAll(ar4);
		
		for (int k=0;k<ar3.size();k++) {
			System.out.println(ar3.get(k));
		}
		System.out.println("-----------------------------------------");
		//RetainAll - only to retain common values between 2 ArrayLists
		ArrayList<String> ar5=new ArrayList<String>();
		ar5.add("Aloha");
		ar5.add("Breeze");
		ar5.add("Camp");
		
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("Apocalypse");
		ar6.add("Breeze");
		ar6.add("Communion");
		
		ar5.retainAll(ar6);
		
		for (int l=0;l<ar5.size();l++) {
			System.out.println(ar5.get(l));
		}
	}

}
