package com.fastLearner.dataFormat;

import java.io.Serializable;

public class Student implements Serializable
{
private String name;
private int rollNo;
private String school;

public Student(String name,int rollNo,String school)
{
this.name = name;
this.rollNo = rollNo;
this.school = school;
}
public void show()
{
System.out.println("Name : "+name);
System.out.println("Roll No. : "+rollNo);
System.out.println("School : "+school);
}
}

