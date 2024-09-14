package SpringBoot.SpringBootFirstEx;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository

public class ClassroomDao {
	
	public ArrayList<Classroom> fetchAllClassrooms(){
		System.err.print("I am in Dao- fetchAllClassroom");
		ArrayList<Classroom> allClassroom = new ArrayList<Classroom>();
		allClassroom.add(new Classroom(1, "Pythonclassroom"));
		allClassroom.add(new Classroom(2, "datascienceclassroom"));
		allClassroom.add(new Classroom(3, "AIclassroom"));
		allClassroom.add(new Classroom(4, "javaclassroom"));
		return allClassroom;
	}	
}
