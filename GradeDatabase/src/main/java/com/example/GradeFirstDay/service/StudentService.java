package com.example.GradeFirstDay.service;

import com.example.GradeFirstDay.model.Student;

import java.util.List;

//@Slf4j
public interface StudentService {

        List<Student> addStudent(List<Student> student);
       //void deleteStudentByName(String name);
        //List<Student> getAllGrades();
        //void updateGradeByName(String name,String score);

        List<Student> getStudent(Long studentId);
}
