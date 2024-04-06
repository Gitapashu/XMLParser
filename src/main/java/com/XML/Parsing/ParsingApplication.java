package com.XML.Parsing;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.sun.tools.javac.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.File;
import java.io.IOException;


@SpringBootApplication
public class ParsingApplication {

	public static void main(String[] args) {

		XmlMapper xmlMapper = new XmlMapper();

		ClassPathResource resource = new ClassPathResource("data.xml");

		try {
			University university = xmlMapper.readValue(resource.getFile(), University.class);
			for (Student student : university.getStudent()) {
				System.out.println("Student Name: " + student.getName());
				System.out.println("Student ID: " + student.getId());
				System.out.println("Student Age: " + student.getAge());
				for (Course course : student.getCourses()) {
					System.out.println("  Course: " + course.getName());
					System.out.println("  Grade: " + course.getGrade());
				}
				System.out.println(); // Adding a newline for better readability between students
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
