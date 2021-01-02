package tester;

import static utils.StudentCollectionUtils.*;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;

import runnable_tasks.DobSorter;
import runnable_tasks.GPASorter;

public class TestCollIoThreads {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file names on 2 separate lines");
			String fileName1 = sc.nextLine();
			String fileName2 = sc.nextLine();
			// get populated student map from CollectionUtils
			Map<String, Student> studentMap = populateMap(populateList());
			// create tasks , attach thrds to runnable tasks n start
			Thread t1 = new Thread(new GPASorter(studentMap, fileName1), "gpa_sorter");
			Thread t2 = new Thread(new DobSorter(studentMap, fileName2), "dob_sorter");
			t1.start();
			t2.start();// 3 runnable
			// wait till child thrds complete exec
			System.out.println("main waiting for child thrds to finish exec");
			t1.join();
			t2.join();
			System.out.println("child thrds completed exec");
			// main over
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
