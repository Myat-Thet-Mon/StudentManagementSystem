package com.myathtet.sms.services;

import com.myatthet.sms.entity.Teacher;

import java.util.List;

public class TeacherService {

    public void createTeacher(String name, String phone, String address, String dateOfBirth, int grade, List<String> subjects) {

    }

    public Teacher getTeacher(long id) {
        return;
    }

    public List<Teacher> getAllTeacher(String orderType, String descOrAsc) {
        return;
    }

    public List<Teacher> getTeacherByStudentId(long studentId, String orderType, String descOrAsc) {
        return;
    }

    public List<Teacher> getTeacherByGrade(int grade, String orderType, String descOrAsc) {
        return;
    }

    public Teacher getTeacherByPhone(String phoneNumber) {
        return;
    }

    public List<Teacher> getTeacherByYear(int year, String orderType, String descOrAsc) {
        return;
    }

    public List<Teacher> getTeacherByGrade(int grade, String orderType, String descOrAsc) {
        return;
    }

    public List<Teacher> getTeacherBySubjects(String subject, String orderType, String descOrAsc) {
        return;
    }

    public void editTeacher(String name, String phone, String address, String dateOfBirth, int grade, List<String> subjects) {

    }

    public void editTeacherByName(String name) {

    }

    public void editTeacherByPhone(String phone) {

    }

    public void editTeacherByAddress(String address) {

    }

    public void editTeacherByDateOfBirth(String dateOfBirth) {

    }

    public void editTeacherByGrade(int grade) {

    }

    public void editTeacherBySubject(String subject) {

    }

    public void deleteTeacher(String name, String phone, String address, String dateOfBirth, int grade, List<String> subjects) {

    }

    public void deleteTeacherById(long id) {

    }

    public void deleteTeacherByPhone(String phone) {

    }

    public void deleteTeacherByAddress(String address) {

    }

    public void deleteTeacherByGrade(int grade) {

    }

    public void deleteTeacherBySubject(String subject) {

    }

}
