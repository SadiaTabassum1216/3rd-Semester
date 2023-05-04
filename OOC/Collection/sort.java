package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class sort{
		
	
	public static void main(String[] args) {
		
		ArrayList<person> student=new ArrayList<person>();
		
		Scanner in=new Scanner(System.in);
		String name;
		int age;
		int roll;
		
		for(int i=0;i<3;i++) {
			System.out.println("Enter name: ");
			name=in.next();
			System.out.println("Enter roll: ");
			roll=in.nextInt();
			System.out.println("Enter age: ");
			age=in.nextInt();
			
			student.add(new person(name,roll,age));
		}
		
		
		Comparator<person> comp= new Comparator<person>()
		{
			public int compare(person s1, person s2) {		
				if(s1.age!=s2.age)
					return Integer.valueOf(s1.age).compareTo(s2.age);
				else if(s1.roll!=s2.roll)
					return Integer.valueOf(s1.roll).compareTo(s2.roll);
				else
					return String.valueOf(s1.name).compareTo(s2.name);
					
			}
		};
		
		
		Collections.sort(student, comp);
		
		for(person p: student) {
			System.out.println(p);
		}

	}

}
