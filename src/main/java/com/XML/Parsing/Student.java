package com.XML.Parsing;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
public class Student {

    @JacksonXmlProperty(localName = "id",isAttribute = true)
    private int id;
    @JacksonXmlProperty(localName = "name")
    private String name;
    @JacksonXmlProperty(localName = "age")
    private int age;
    @JacksonXmlProperty(localName = "courses")
    List<Course> courses;

}
