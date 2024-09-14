package SpringBoot.SpringBootFirstEx;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
public class ClassroomService {
	
	@Autowired
	
	ClassroomDao classroomDao;
	
	public ArrayList<Classroom>fetchAllClassrooms(){
		System.err.println("I am in service - fetchAllClassrooms");
		ArrayList<Classroom> allClassrooms =classroomDao.fetchAllClassrooms();
		return allClassrooms;
	}

}
