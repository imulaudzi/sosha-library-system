package com.library.student.service;

import com.library.student.model.Student;

import java.util.List;

/**
 * Created by ISAAC on 3/21/2015.
 */
public interface StudentService {

    void addStudent(Student student);
    List<Student> getStudents(Long userId);

}
