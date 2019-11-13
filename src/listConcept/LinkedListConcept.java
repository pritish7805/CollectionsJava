package listConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> l1=new LinkedList<String>();
		
		//Add
		l1.add("Java");
		l1.add("Selenium");
		l1.add("TestNG");
		l1.add("Postman");
		l1.add("Automation");
		l1.add("Framework");
		
		//Print
		System.out.println("Elements of LinkedList: "+l1);
		System.out.println("--------------------------------------");
		//adding first element
		l1.addFirst("Skills");
		
		//adding at the end
		l1.addLast("Certification");
		
		System.out.println("Elements of LinkedList: "+l1);
		System.out.println("--------------------------------------");
		//get
		System.out.println("First Element of LinkedList: "+l1.get(0));
		System.out.println("--------------------------------------");
		
		//set
		l1.set(0, "Resume");
		System.out.println("Elements of LinkedList: "+l1);
		System.out.println("--------------------------------------");
		
		//Remove
		l1.removeFirst();
		l1.removeLast();
		l1.remove(2);
		System.out.println("Elements of LinkedList: "+l1);
		System.out.println("--------------------------------------");
		
		//printing all contents of the LinkedList
		
		System.out.println("using for looop");
		
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		
		//Advanced for loop
		System.out.println("--------------------------------------");
		System.out.println("Advanced for loop");
		for(String str : l1) {
			System.out.println(str);
		}
		System.out.println("--------------------------------------");
		//Using Iterator
		System.out.println("Using Iterator");
		Iterator<String> it=l1.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		System.out.println("--------------------------------------");
		//Using While loop
		System.out.println("Using While loop");
		int j=0;
		while(j<l1.size()) {
			System.out.println(l1.get(j));
			j++;
		}
		
	}

}
