package com.prayerlaputa.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student implements Serializable {
    
    private int id;
    private String name;
    
    public void initStudent(){
        System.out.println("Student#init() is called!");
    }
    
    public Student create(){
        return new Student(101,"KK101");
    }

    public void cleanUp() {
        System.out.println("Student#cleanUp() is called!");
    }
}
