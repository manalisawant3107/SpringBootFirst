package SpringBoot.SpringBootFirstEx;

import java.util.ArrayList;


import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassroomController {
	
	@Autowired
	ClassroomService classroomService;
	
	@GetMapping("allclassrooms")
	public ArrayList<Classroom> fetchAllClassrooms(){
		return classroomService.fetchAllClassrooms();
	}
	

//	@GetMapping("Welcome")
//	public String getWelcomeMessage() {
//	return "Your spring boot is started now";
//	}
//	
//	
//	@PostMapping("insertClassroom")
//	public void insertClassroom(@RequestBody Classroom classroom) {
//		System.out.println(classroom);
//	}
//	
//
//	@DeleteMapping("deletetClassroom/{clsId}/{teacherId}")
//	public void deleteClassroom(@PathVariable("clsId") int clsId,@PathVariable("teacherId") int teacherId) {
//		System.err.println("Id of classroom is" +clsId);
//		System.err.println("Id of teacher is" +teacherId);
//	}
//	
//	@Autowired
//	X xx ;
//
//	@DeleteMapping("deleteclassroom")
//	public void getClassroomPerId(@RequestParam int clsId) {
//		xx.m1();
//	}
//	
//	
//	@GetMapping("allclassrooms")
//	public ArrayList<Classroom> fetchAllClassrooms(){
//		ArrayList<Classroom> allClassroom = new ArrayList<Classroom>();
//		allClassroom.add(new Classroom(1, "Pythonclassroom"));
//		allClassroom.add(new Classroom(2, "datascienceclassroom"));
//		allClassroom.add(new Classroom(3, "AIclassroom"));
//		allClassroom.add(new Classroom(4, "javaclassroom"));
//		return allClassroom;
//	}
//	
//	@GetMapping("classroomSize")
//	public static Classroom getClassroomDetailperSize() {
//		return new Classroom(4, "javaclassroom");
//	}
//	
//	@GetMapping("classroomPerId")
//	public static Classroom getClassroomDetailperID() {
//		int classroomId=4;
//		ArrayList<Classroom> allClassroom = new ArrayList<Classroom>();
//		allClassroom.add(new Classroom(1, "Pythonclassroom"));
//		allClassroom.add(new Classroom(1, "Pythonclassroom"));
//		allClassroom.add(new Classroom(3, "AIclassroom"));
//		allClassroom.add(new Classroom(4, "javaclassroom"));
//		for(Classroom classroom : allClassroom) {
//			if (classroom.getClsId() == classroomId) {
//				return classroom;
//			}
//		}
//		return null;
//	}
//	
//	@GetMapping("allClassroomTeachers")
//	public static ArrayList<Classroom> fetchAllClassroomsTeachers(){
//		ArrayList<Classroom> allClassroom = new ArrayList<Classroom>(); //arrayList for all classrooms
//		//classroom for ds
//		Teacher teacher1 = new Teacher(1, "Namrata"); //Teacheras for ds classroom
//		Teacher teacher2 = new Teacher(2, "Manali");
//		Teacher teacher3 = new Teacher(3, "Asawari");
//		
//		ArrayList<Teacher>  allTeachers = new ArrayList<Teacher>(); // ArrarList for DS Classroom Teachers
//		
//		allTeachers.add(teacher1);
//		allTeachers.add(teacher2);
//		allTeachers.add(teacher3);
//		
//		Classroom classroomDS = new Classroom(1, "datascienceclassroom", allTeachers); //Object for DS Classroom
//		//classroom for python
//		Teacher teacher1py = new Teacher(1, "Namrata"); //Teachers for
//		Teacher teacher2py = new Teacher(2,"Manali");
//		Teacher teacher3py = new Teacher(3, "Asawari");
//		
//		ArrayList<Teacher>  allTeachersP = new ArrayList<Teacher>();  //ArrayList for Python classroom Teachers
//		allTeachersP.add(teacher1py);
//		allTeachersP.add(teacher2py);
//		allTeachersP.add(teacher3py);
//		Classroom classroomPY = new Classroom(2, "pythonclassroom", allTeachers);  // object for python classroom
//		
//		allClassroom.add(classroomDS);
//		allClassroom.add(classroomPY);
//		return allClassroom;
//
//	}
}
