package com.myathtet.sms.services;


import com.myatthet.sms.entity.Student;

import java.util.List;

public class StudentService {

    public void createStudent(String name, String phone, String address, String dateOfBirth, int grade, List<String> subjects) {


    }

    public void mapStudentWithTeacher(long studentId, long teacherId) {

    }

    public Student getStudent(long id) {

        return a;
    }

    public List<Student> getAllStudent(String orderType, String descOrAsc) {
        return;
    }

    public List<Student> getStudentByTeacherId(long teacherId, String orderType, String descOrAsc) {

        return;
    }

    public List<Student> getStudentByGrade(int grade, String orderType, String descOrAsc) {
        return;
    }

    public Student getStudentByPhone(String phoneNumber) {
        return;
    }

    public List<Student> getStudentByYear(int year, String orderType, String descOrAsc) {
        return;
    }

    public void editStudent(String name, String phone, String address, String dateOfBirth, int grade) {

    }

    public void editStudentByName(String name) {

    }

    public void editStudentByPhone(String phone) {

    }

    public void editStudentByAddress(String address) {

    }

    public void editStudentByDateOfBirth(String dateOfBirth) {

    }

    public void editStudentByGrade(int grade) {

    }

    public void deleteStudent(String name, String phone, String address, String dateOfBirth, int grade) {

    }

    public void deleteStudentById(long id) {

    }

    public void deleteStudentByPhone(String phone) {

    }

    public void deleteStudentByAddress(String address) {

    }

    public void deleteStudentByDateOfBirth(String dateOfBirth) {

    }

    public void deleteStudentByGrade(int grade) {

    }
}
