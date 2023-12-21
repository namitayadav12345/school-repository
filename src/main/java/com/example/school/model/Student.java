package com.example.school;


public class Student {


    private int studentId;
    private String studentName;
    private String gender;
    private int standard;


    public Student(int studentId, String studentName, String gender, int standard) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.standard = standard;
    }


    public int getstudentId() {
        return studentId;
    }


    public void setstudentId(int studentId) {
        this.studentId = studentId;
    }


    public String getstudentName() {
        return studentName;
    }


    public void setstudentName(String studentName) {
        this.studentName = studentName;
    }


    public String gender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public int standard() {
        return standard;
    }


    public void setStandard(int standard) {
        this.standard = standard;
    }


}