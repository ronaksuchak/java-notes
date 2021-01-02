package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Map;

import com.app.core.Student;

public class IOUtils {
//write a method to store sorted student details in a text file using buffering
	public static void storeStudentDetails(Map<String, Student> map,String fileName) throws IOException
	{
		//chain of auto closeable resources
		try(PrintWriter pw=new PrintWriter(new FileWriter(fileName)))
		{
			pw.println("Student Info sorted as per roll nos");
			//attach iterator (for each)
			for(Student s : map.values()) {
				pw.println(s);
				pw.println();
			}
			System.out.println("info saved ...");
		}
	}
	//write a method to store sorted as per GPA student details in a text file using buffering
		public static void storeStudentDetails(Collection<Student> students,String fileName) throws IOException
		{
			//chain of auto closeable resources
			try(PrintWriter pw=new PrintWriter(new FileWriter(fileName)))
			{
				pw.println("Student Info sorted as per criteria");
				//attach iterator (for each)
				for(Student s : students) {
					pw.println(s);
					pw.println();
				}
				System.out.println("info saved ...");
			}
		}
}
