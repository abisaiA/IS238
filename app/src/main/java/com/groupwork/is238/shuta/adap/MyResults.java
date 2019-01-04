package com.groupwork.is238.shuta.adap;

import java.io.Serializable;

public class MyResults implements Serializable {
    private String subject;
    private String marks;
    private String grade;
    private String position;

    public MyResults(){

    }

    public MyResults(String subject, String marks, String grade, String position) {
        this.subject = subject;
        this.marks = marks;
        this.grade = grade;
        this.position = position;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
