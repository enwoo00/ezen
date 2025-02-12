package p0212;

import java.util.ArrayList;

public class ListTest3 {
	public static void main (String[] args) {
		
		
		/*Student s = new Student();
		s.setName("김김김");
		s.setGrade(1);
		s.setSchoolName("김김학교");*/
		Student s1 = new Student();
		s1.setName("김김김");
		s1.setGrade(1);
		s1.setSchoolName("김김학교");
		Student s2 = new Student();
		s2.setName("박박박");
		s2.setGrade(4);
		s2.setSchoolName("이젠");
		Student s3 = new Student();
		s3.setName("최최최");
		s3.setGrade(3);
		s3.setSchoolName("이젠");
		Student s4 = new Student();
		s4.setName("이이이");
		s4.setGrade(6);
		s4.setSchoolName("이이학교");
		Student s5 = new Student();
		s5.setName("최강강");
		s5.setGrade(2);
		s5.setSchoolName("김김학교");
		
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
		
		for(Student s:studentList) {
			//성이 최씨이거나 학교를 이젠으로 다니고 있다면 
			//if(s.getName().indexOf("최")==0) {
			//if(s.getName().substring(0,1).equals("최")) {
			if(s.getName().startsWith("최") || s.getSchoolName().equals("이젠")) {
				System.out.println(s);
			}
		//System.out.println(s);
		}
	}

}
