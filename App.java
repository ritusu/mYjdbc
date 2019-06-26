package com.lti.training.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lti.training.jdbc.SchoolDAO;
import com.lti.training.jdbc.School;
public class App {

	public static void main(String[] args) {
		SchoolDAO dao=new SchoolDAO();
		//List<dao> alo=new ArrayList<dao>();
		School school=new School();
		//List<School> sc=new ArrayList<School>();
	    //sc.setInt(school.getRollno());
		Scanner scanner = new Scanner(System.in);
		school.setRollno(scanner.nextInt());
		scanner = new Scanner(System.in);
		school.setFname(scanner.nextLine());
		school.setLname(scanner.nextLine());
		
		school.setCourse(scanner.nextLine());
		school.setResult(scanner.nextLine());
		dao.add(school);
		System.out.println(school.getFname());
		System.out.println(school.getLname());
	}
	
	
}
