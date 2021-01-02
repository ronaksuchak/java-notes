package utils;

import static com.app.core.Subject.DBT;
import static com.app.core.Subject.JAVA;
import static com.app.core.Subject.ML;
import static com.app.core.Subject.R;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.app.core.Address;
import com.app.core.Student;

public class StudentCollectionUtils {

	public static List<Student> populateList() {
		List<Student> students = Arrays.asList(new Student("dac-001", "ravi", parse("1990-12-13"), DBT, 7),
				new Student("dac-009", "riya", parse("1992-12-13"), ML, 6.9),
				new Student("dac-004", "shekhar", parse("1991-12-13"), DBT, 8.9),
				new Student("dac-002", "priya", parse("1990-02-23"), JAVA, 4),
				new Student("dac-007", "kiran", parse("1993-02-13"), R, 8.9),
				new Student("dac-003", "meeta", parse("1993-12-13"), R, 5.9),
				new Student("dac-008", "sameer", parse("1991-12-06"), DBT, 5));
		List<Address> adrs = Arrays.asList(new Address("pune", "MH", "452446"), new Address("pune", "MH", "652446"),
				new Address("nagpur", "MH", "852446"), new Address("indore", "MP", "752446"),
				new Address("mumbai", "MH", "672446"), new Address("pune", "MH", "692446"),
				new Address("chennai", "TN", "862446"));
		int index = 0;
		for (Student s : students)
			s.assignAddress(adrs.get(index++));
		return students;// fixed size student list , where students  are linked with address.
	}

	// convert fixed size list into growable Map
	public static Map<String, Student> populateMap(List<Student> list) {
		// empty HashMap : const time performance
		HashMap<String, Student> map = new HashMap<>();// capa=16 , L.F .75
		for (Student s : list)
			map.put(s.getRollNo(), s);
		return map;
	}

	// sort the students info as per roll no
	public static Map<String, Student> sortStudentsRollNo(Map<String, Student> hm) {
		return new TreeMap<>(hm);// String's compareTo
	}

	// sort the students info as per GPA :using a TreeSet
	public static Set<Student> sortStudentsGPA(Map<String, Student> hm) {
		//new Comparator<Student>() : instance of class that imple. Comparator
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				System.out.println("gpa : compare ");
				int ret = ((Double) o1.getGpa()).compareTo(o2.getGpa());
				if (ret == 0)
					return o1.getRollNo().compareTo(o2.getRollNo());
				return ret;
			}//-1 0 1

		});//empty TS
		ts.addAll(hm.values());// compare  of ano inner class : Outer$1
		return ts;//populated TS of students sorted as per GPA
	}

	public static List<Student> sortStudentsGPAListMap(Map<String, Student> hm) {
	ArrayList<Student> list = new ArrayList<>(hm.values());
	//	Collection<Student> coll=hm.values();
	//	List<Student> list=(List<Student>)coll;
		Collections.sort(list, new Comparator<Student>() {//Collections.sort(List<T> list,Comp...);

			@Override
			public int compare(Student o1, Student o2) {
				System.out.println("gpa : compare 2 ");
				int ret = ((Double) o1.getGpa()).compareTo(o2.getGpa());
				return ret;
			}

		});
		return list;
	}
	public static List<Student> sortStudentsDoBListMap(Map<String, Student> hm) {
		ArrayList<Student> list = new ArrayList<>(hm.values());
		//	Collection<Student> coll=hm.values();
		//	List<Student> list=(List<Student>)coll;
			Collections.sort(list, new Comparator<Student>() {//Collections.sort(List<T> list,Comp...);

				@Override
				public int compare(Student o1, Student o2) {
					System.out.println("dob : compare 2 ");
					return o1.getDob().compareTo(o2.getDob());
				}

			});
			return list;
		}

}
