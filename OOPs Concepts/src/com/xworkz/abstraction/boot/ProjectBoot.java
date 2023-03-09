package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.data.Project;
import com.xworkz.abstraction.data.ProjectTelecom;

public class ProjectBoot {

	public static void main(String[] args) {
		Project project = new ProjectTelecom();
		ProjectTelecom project1 = (ProjectTelecom)project;
		System.out.println("Project Domain: "+project1.branch());
		System.out.println("Project Duration: "+project1.duration()+" months");
		System.out.println("Project Completed: "+project1.done());
	}

}
