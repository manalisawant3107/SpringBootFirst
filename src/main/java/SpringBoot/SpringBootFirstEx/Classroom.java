package SpringBoot.SpringBootFirstEx;

import java.util.ArrayList;

public class Classroom {
	private int clsId;
	private String clsName;
	
	ArrayList<Teacher> arrayListTeacher;
	

	public ArrayList<Teacher> getArrayListTeacher() {
		return arrayListTeacher;
	}
	

	public void setArrayListTeacher(ArrayList<Teacher> arrayListTeacher) {
		this.arrayListTeacher = arrayListTeacher;
	}

	public int getClsId() {
		return clsId;
	}

	public void setClsId(int clsId) {
		this.clsId = clsId;
	}

	public String getClsName() {
		return clsName;
	}

	public void setClsName(String clsName) {
		this.clsName = clsName;
	}

	public Classroom(int clsId, String clsName, ArrayList<Teacher> arrayListTeacher) {
		super();
		this.clsId = clsId;
		this.clsName = clsName;
		this.arrayListTeacher = arrayListTeacher;
	}


	public Classroom(String clsName, ArrayList<Teacher> arrayListTeacher) {
		super();
		this.clsName = clsName;
		this.arrayListTeacher = arrayListTeacher;
	}


	public Classroom() {
		super();
	}

	public Classroom(int clsId, String clsName) {
		super();
		this.clsId = clsId;
		this.clsName = clsName;
	}

	@Override
	public String toString() {
		return "Classroom [clsId=" + clsId + ", clsName=" + clsName + ", arrayListTeacher=" + arrayListTeacher + "]";
	}

}
