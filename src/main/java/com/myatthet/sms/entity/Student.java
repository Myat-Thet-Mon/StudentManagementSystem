package com.myatthet.sms.entity;

import java.util.List;

public class Student {
    private long id;
    private String name;
    private String address;
    private String phone;
    private int grade;
    private String dateOfBirth;
    private List<Teacher> TeacherList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Teacher> getTeacherList() {
        return TeacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        TeacherList = teacherList;
    }
}


