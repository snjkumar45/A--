package list;

import java.util.Arrays;
import java.util.List;

//list is a interface where duplicate is allow ,null insertion allow,insertion oreder prereseverd
public class MainList {
	public static void main(String[] args) {
		// ListInterface All classes example
		// here i am initialize the element on the list on using aslist
		List<Student> hostel = Arrays.asList(new Student(1, 21, "Sanjay"), new Student(2, 23, "Mini"),
				new Student(3, 19, "Khushi"), new Student(4, 20, "sundhi"), new Student(5, 9, "Fahim"));
		// System.out.println(hostel);
		for (Student s : hostel) {
//			 
			// System.out.println(s);

		}
		 
	}

}
