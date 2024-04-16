package com.XML.Parsing;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Course {
    @JacksonXmlProperty(localName = "name")
    String name;
    @JacksonXmlProperty(localName = "grade")
    String grade;

    public Course() {
    }

    public Course(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
